package x7;

import java.util.concurrent.Callable;

public final class g implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Runnable f12919a;

    public g(Runnable runnable) {
        this.f12919a = runnable;
    }

    public final Object call() throws Exception {
        this.f12919a.run();
        return null;
    }
}
