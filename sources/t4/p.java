package t4;

import aa.b;
import java.util.concurrent.Executor;

public final class p implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f11383a;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f11384a;

        public a(Runnable runnable) {
            this.f11384a = runnable;
        }

        public final void run() {
            try {
                this.f11384a.run();
            } catch (Exception e10) {
                b.E("Executor", "Background execution failure.", e10);
            }
        }
    }

    public p(Executor executor) {
        this.f11383a = executor;
    }

    public final void execute(Runnable runnable) {
        this.f11383a.execute(new a(runnable));
    }
}
