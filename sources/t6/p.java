package t6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class p implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f11421a = new Handler(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        this.f11421a.post(runnable);
    }
}
