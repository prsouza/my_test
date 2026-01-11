package t6;

import java.util.concurrent.Executor;

public final class o implements Executor {
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
