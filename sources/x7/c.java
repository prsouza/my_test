package x7;

import android.os.Process;

public abstract class c implements Runnable {
    public abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
