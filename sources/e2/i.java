package e2;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class i implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayDeque<a> f4544a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f4545b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f4546c = new Object();

    /* renamed from: s  reason: collision with root package name */
    public volatile Runnable f4547s;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final i f4548a;

        /* renamed from: b  reason: collision with root package name */
        public final Runnable f4549b;

        public a(i iVar, Runnable runnable) {
            this.f4548a = iVar;
            this.f4549b = runnable;
        }

        public final void run() {
            try {
                this.f4549b.run();
            } finally {
                this.f4548a.a();
            }
        }
    }

    public i(Executor executor) {
        this.f4545b = executor;
    }

    public final void a() {
        synchronized (this.f4546c) {
            Runnable poll = this.f4544a.poll();
            this.f4547s = poll;
            if (poll != null) {
                this.f4545b.execute(this.f4547s);
            }
        }
    }

    public final void execute(Runnable runnable) {
        synchronized (this.f4546c) {
            this.f4544a.add(new a(this, runnable));
            if (this.f4547s == null) {
                a();
            }
        }
    }
}
