package c3;

import android.os.Handler;
import android.os.HandlerThread;

public final class u extends HandlerThread {

    /* renamed from: a  reason: collision with root package name */
    public Handler f3218a;

    public u(String str) {
        super(str);
    }

    public final void a(Runnable runnable) {
        b();
        this.f3218a.post(runnable);
    }

    public final synchronized void b() {
        if (this.f3218a == null) {
            this.f3218a = new Handler(getLooper());
        }
    }
}
