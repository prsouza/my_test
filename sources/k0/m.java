package k0;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class m implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    public String f7382a = "fonts-androidx";

    /* renamed from: b  reason: collision with root package name */
    public int f7383b = 10;

    public static class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        public final int f7384a;

        public a(Runnable runnable, String str, int i) {
            super(runnable, str);
            this.f7384a = i;
        }

        public final void run() {
            Process.setThreadPriority(this.f7384a);
            super.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new a(runnable, this.f7382a, this.f7383b);
    }
}
