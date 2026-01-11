package e1;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class c<Params, Progress, Result> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f4515u;

    /* renamed from: v  reason: collision with root package name */
    public static final BlockingQueue<Runnable> f4516v;

    /* renamed from: w  reason: collision with root package name */
    public static final ThreadPoolExecutor f4517w;

    /* renamed from: x  reason: collision with root package name */
    public static f f4518x;

    /* renamed from: a  reason: collision with root package name */
    public final h<Params, Result> f4519a;

    /* renamed from: b  reason: collision with root package name */
    public final FutureTask<Result> f4520b;

    /* renamed from: c  reason: collision with root package name */
    public volatile g f4521c = g.PENDING;

    /* renamed from: s  reason: collision with root package name */
    public final AtomicBoolean f4522s = new AtomicBoolean();

    /* renamed from: t  reason: collision with root package name */
    public final AtomicBoolean f4523t = new AtomicBoolean();

    public static class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f4524a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            StringBuilder d10 = a.a.d("ModernAsyncTask #");
            d10.append(this.f4524a.getAndIncrement());
            return new Thread(runnable, d10.toString());
        }
    }

    public class b extends h<Params, Result> {
        public b() {
        }

        public final Result call() throws Exception {
            c.this.f4523t.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = c.this.a(this.f4530a);
                Binder.flushPendingCommands();
                c.this.d(result);
                return result;
            } catch (Throwable th2) {
                c.this.d(result);
                throw th2;
            }
        }
    }

    /* renamed from: e1.c$c  reason: collision with other inner class name */
    public class C0068c extends FutureTask<Result> {
        public C0068c(Callable callable) {
            super(callable);
        }

        public final void done() {
            try {
                Object obj = get();
                c cVar = c.this;
                if (!cVar.f4523t.get()) {
                    cVar.d(obj);
                }
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (CancellationException unused) {
                c cVar2 = c.this;
                if (!cVar2.f4523t.get()) {
                    cVar2.d(null);
                }
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    public static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4527a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                e1.c$g[] r0 = e1.c.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4527a = r0
                e1.c$g r1 = e1.c.g.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4527a     // Catch:{ NoSuchFieldError -> 0x001d }
                e1.c$g r1 = e1.c.g.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: e1.c.d.<clinit>():void");
        }
    }

    public static class e<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final c f4528a;

        /* renamed from: b  reason: collision with root package name */
        public final Data[] f4529b;

        public e(c cVar, Data... dataArr) {
            this.f4528a = cVar;
            this.f4529b = dataArr;
        }
    }

    public static class f extends Handler {
        public f() {
            super(Looper.getMainLooper());
        }

        public final void handleMessage(Message message) {
            e eVar = (e) message.obj;
            int i = message.what;
            if (i == 1) {
                c cVar = eVar.f4528a;
                Data data = eVar.f4529b[0];
                if (cVar.f4522s.get()) {
                    cVar.b(data);
                } else {
                    cVar.c(data);
                }
                cVar.f4521c = g.FINISHED;
            } else if (i == 2) {
                Objects.requireNonNull(eVar.f4528a);
            }
        }
    }

    public enum g {
        PENDING,
        RUNNING,
        FINISHED
    }

    public static abstract class h<Params, Result> implements Callable<Result> {

        /* renamed from: a  reason: collision with root package name */
        public Params[] f4530a;
    }

    static {
        a aVar = new a();
        f4515u = aVar;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(10);
        f4516v = linkedBlockingQueue;
        f4517w = new ThreadPoolExecutor(5, 128, 1, TimeUnit.SECONDS, linkedBlockingQueue, aVar);
    }

    public c() {
        b bVar = new b();
        this.f4519a = bVar;
        this.f4520b = new C0068c(bVar);
    }

    public abstract Result a(Params... paramsArr);

    public void b(Result result) {
    }

    public void c(Result result) {
    }

    public final Result d(Result result) {
        f fVar;
        synchronized (c.class) {
            if (f4518x == null) {
                f4518x = new f();
            }
            fVar = f4518x;
        }
        fVar.obtainMessage(1, new e(this, result)).sendToTarget();
        return result;
    }
}
