package x7;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f12911a;

    /* renamed from: b  reason: collision with root package name */
    public Task<Void> f12912b = Tasks.forResult(null);

    /* renamed from: c  reason: collision with root package name */
    public final Object f12913c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final ThreadLocal<Boolean> f12914d = new ThreadLocal<>();

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            f.this.f12914d.set(Boolean.TRUE);
        }
    }

    public f(Executor executor) {
        this.f12911a = executor;
        executor.execute(new a());
    }

    public final void a() {
        if (!Boolean.TRUE.equals(this.f12914d.get())) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public final <T> Task<T> b(Callable<T> callable) {
        Task<TContinuationResult> continueWith;
        synchronized (this.f12913c) {
            continueWith = this.f12912b.continueWith(this.f12911a, new h(callable));
            this.f12912b = continueWith.continueWith(this.f12911a, new i());
        }
        return continueWith;
    }

    public final <T> Task<T> c(Callable<Task<T>> callable) {
        Task<TContinuationResult> continueWithTask;
        synchronized (this.f12913c) {
            continueWithTask = this.f12912b.continueWithTask(this.f12911a, new h(callable));
            this.f12912b = continueWithTask.continueWith(this.f12911a, new i());
        }
        return continueWithTask;
    }
}
