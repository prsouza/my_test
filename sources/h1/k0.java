package h1;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class k0 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f5740a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<Runnable> f5741b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    public Runnable f5742c;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f5743a;

        public a(Runnable runnable) {
            this.f5743a = runnable;
        }

        public final void run() {
            try {
                this.f5743a.run();
            } finally {
                k0.this.a();
            }
        }
    }

    public k0(Executor executor) {
        this.f5740a = executor;
    }

    public final synchronized void a() {
        Runnable poll = this.f5741b.poll();
        this.f5742c = poll;
        if (poll != null) {
            this.f5740a.execute(poll);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.f5741b.offer(new a(runnable));
        if (this.f5742c == null) {
            a();
        }
    }
}
