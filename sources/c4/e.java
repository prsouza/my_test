package c4;

import java.util.concurrent.Executor;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f3231a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f3232b = new b();

    public class a implements Executor {
        public final void execute(Runnable runnable) {
            j.f().post(runnable);
        }
    }

    public class b implements Executor {
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }
}
