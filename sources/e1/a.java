package e1;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import e1.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import m0.f;

public abstract class a<D> extends b<D> {
    public static final boolean DEBUG = false;
    public static final String TAG = "AsyncTaskLoader";
    public volatile a<D>.a mCancellingTask;
    private final Executor mExecutor;
    public Handler mHandler;
    public long mLastLoadCompleteTime;
    public volatile a<D>.a mTask;
    public long mUpdateThrottle;

    /* renamed from: e1.a$a  reason: collision with other inner class name */
    public final class C0066a extends c<Void, Void, D> implements Runnable {

        /* renamed from: y  reason: collision with root package name */
        public final CountDownLatch f4514y = new CountDownLatch(1);
        public boolean z;

        public C0066a() {
        }

        public final Object a(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            return a.this.onLoadInBackground();
        }

        public final void b(D d10) {
            try {
                a.this.dispatchOnCancelled(this, d10);
            } finally {
                this.f4514y.countDown();
            }
        }

        public final void c(D d10) {
            try {
                a.this.dispatchOnLoadComplete(this, d10);
            } finally {
                this.f4514y.countDown();
            }
        }

        public final void run() {
            this.z = false;
            a.this.executePendingTask();
        }
    }

    public a(Context context) {
        this(context, c.f4517w);
    }

    public void cancelLoadInBackground() {
    }

    public void dispatchOnCancelled(a<D>.a aVar, D d10) {
        onCanceled(d10);
        if (this.mCancellingTask == aVar) {
            rollbackContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mCancellingTask = null;
            deliverCancellation();
            executePendingTask();
        }
    }

    public void dispatchOnLoadComplete(a<D>.a aVar, D d10) {
        if (this.mTask != aVar) {
            dispatchOnCancelled(aVar, d10);
        } else if (isAbandoned()) {
            onCanceled(d10);
        } else {
            commitContentChanged();
            this.mLastLoadCompleteTime = SystemClock.uptimeMillis();
            this.mTask = null;
            deliverResult(d10);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (this.mTask != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.mTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mTask.z);
        }
        if (this.mCancellingTask != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.mCancellingTask);
            printWriter.print(" waiting=");
            printWriter.println(this.mCancellingTask.z);
        }
        if (this.mUpdateThrottle != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            f.a(this.mUpdateThrottle, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            long j10 = this.mLastLoadCompleteTime;
            long uptimeMillis = SystemClock.uptimeMillis();
            if (j10 == 0) {
                printWriter.print("--");
            } else {
                f.a(j10 - uptimeMillis, printWriter);
            }
            printWriter.println();
        }
    }

    public void executePendingTask() {
        if (this.mCancellingTask == null && this.mTask != null) {
            if (this.mTask.z) {
                this.mTask.z = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            if (this.mUpdateThrottle <= 0 || SystemClock.uptimeMillis() >= this.mLastLoadCompleteTime + this.mUpdateThrottle) {
                a<D>.a aVar = this.mTask;
                Executor executor = this.mExecutor;
                if (aVar.f4521c != c.g.PENDING) {
                    int i = c.d.f4527a[aVar.f4521c.ordinal()];
                    if (i == 1) {
                        throw new IllegalStateException("Cannot execute task: the task is already running.");
                    } else if (i != 2) {
                        throw new IllegalStateException("We should never reach this state");
                    } else {
                        throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                    }
                } else {
                    aVar.f4521c = c.g.RUNNING;
                    aVar.f4519a.f4530a = null;
                    executor.execute(aVar.f4520b);
                }
            } else {
                this.mTask.z = true;
                this.mHandler.postAtTime(this.mTask, this.mLastLoadCompleteTime + this.mUpdateThrottle);
            }
        }
    }

    public boolean isLoadInBackgroundCanceled() {
        return this.mCancellingTask != null;
    }

    public abstract D loadInBackground();

    public boolean onCancelLoad() {
        if (this.mTask == null) {
            return false;
        }
        if (!this.mStarted) {
            this.mContentChanged = true;
        }
        if (this.mCancellingTask != null) {
            if (this.mTask.z) {
                this.mTask.z = false;
                this.mHandler.removeCallbacks(this.mTask);
            }
            this.mTask = null;
            return false;
        } else if (this.mTask.z) {
            this.mTask.z = false;
            this.mHandler.removeCallbacks(this.mTask);
            this.mTask = null;
            return false;
        } else {
            a<D>.a aVar = this.mTask;
            aVar.f4522s.set(true);
            boolean cancel = aVar.f4520b.cancel(false);
            if (cancel) {
                this.mCancellingTask = this.mTask;
                cancelLoadInBackground();
            }
            this.mTask = null;
            return cancel;
        }
    }

    public void onCanceled(D d10) {
    }

    public void onForceLoad() {
        super.onForceLoad();
        cancelLoad();
        this.mTask = new C0066a();
        executePendingTask();
    }

    public D onLoadInBackground() {
        return loadInBackground();
    }

    public void setUpdateThrottle(long j10) {
        this.mUpdateThrottle = j10;
        if (j10 != 0) {
            this.mHandler = new Handler();
        }
    }

    public void waitForLoader() {
        a<D>.a aVar = this.mTask;
        if (aVar != null) {
            try {
                aVar.f4514y.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    private a(Context context, Executor executor) {
        super(context);
        this.mLastLoadCompleteTime = -10000;
        this.mExecutor = executor;
    }
}
