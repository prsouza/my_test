package i3;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class a implements ThreadFactory {

    /* renamed from: i3.a$a  reason: collision with other inner class name */
    public class C0103a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f6010a;

        public C0103a(Runnable runnable) {
            this.f6010a = runnable;
        }

        public final void run() {
            Process.setThreadPriority(10);
            this.f6010a.run();
        }
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(new C0103a(runnable), "glide-active-resources");
    }
}
