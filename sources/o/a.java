package o;

import android.os.Looper;
import android.support.v4.media.b;
import java.util.Objects;
import java.util.concurrent.Executor;

public final class a extends b {

    /* renamed from: x  reason: collision with root package name */
    public static volatile a f9161x;

    /* renamed from: y  reason: collision with root package name */
    public static final C0174a f9162y = new C0174a();

    /* renamed from: v  reason: collision with root package name */
    public b f9163v;

    /* renamed from: w  reason: collision with root package name */
    public b f9164w;

    /* renamed from: o.a$a  reason: collision with other inner class name */
    public static class C0174a implements Executor {
        public final void execute(Runnable runnable) {
            a.r2().f9163v.f9166w.execute(runnable);
        }
    }

    public a() {
        b bVar = new b();
        this.f9164w = bVar;
        this.f9163v = bVar;
    }

    public static a r2() {
        if (f9161x != null) {
            return f9161x;
        }
        synchronized (a.class) {
            if (f9161x == null) {
                f9161x = new a();
            }
        }
        return f9161x;
    }

    public final boolean s2() {
        Objects.requireNonNull(this.f9163v);
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final void t2(Runnable runnable) {
        b bVar = this.f9163v;
        if (bVar.f9167x == null) {
            synchronized (bVar.f9165v) {
                if (bVar.f9167x == null) {
                    bVar.f9167x = b.r2(Looper.getMainLooper());
                }
            }
        }
        bVar.f9167x.post(runnable);
    }
}
