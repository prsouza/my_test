package androidx.work;

import android.content.Context;
import androidx.annotation.Keep;
import androidx.work.ListenableWorker;
import f2.c;

public abstract class Worker extends ListenableWorker {

    /* renamed from: u  reason: collision with root package name */
    public c<ListenableWorker.a> f2632u;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            try {
                Worker.this.f2632u.j(Worker.this.h());
            } catch (Throwable th2) {
                Worker.this.f2632u.k(th2);
            }
        }
    }

    @Keep
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public final z6.a<ListenableWorker.a> f() {
        this.f2632u = new c<>();
        this.f2625b.f2636c.execute(new a());
        return this.f2632u;
    }

    public abstract ListenableWorker.a h();
}
