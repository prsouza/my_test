package t7;

import android.util.Log;
import java.util.Objects;
import k7.d;
import x7.f;
import x7.q;
import x7.s;
import x7.x;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final x f11438a;

    public g(x xVar) {
        this.f11438a = xVar;
    }

    public static g a() {
        g gVar = (g) d.c().b(g.class);
        Objects.requireNonNull(gVar, "FirebaseCrashlytics component is not present.");
        return gVar;
    }

    public final void b(Throwable th2) {
        if (th2 == null) {
            Log.w("FirebaseCrashlytics", "A null value was passed to recordException. Ignoring.", (Throwable) null);
            return;
        }
        q qVar = this.f11438a.g;
        Thread currentThread = Thread.currentThread();
        Objects.requireNonNull(qVar);
        long currentTimeMillis = System.currentTimeMillis();
        f fVar = qVar.f12963e;
        s sVar = new s(qVar, currentTimeMillis, th2, currentThread);
        Objects.requireNonNull(fVar);
        fVar.b(new x7.g(sVar));
    }
}
