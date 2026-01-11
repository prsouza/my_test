package u1;

import java.util.concurrent.Executor;

public enum e implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        e6.e.D(runnable, "command");
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
