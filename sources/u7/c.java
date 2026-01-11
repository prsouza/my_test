package u7;

import android.util.Log;
import h1.c0;
import java.util.concurrent.atomic.AtomicReference;
import s7.w;

public final class c implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f11721c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final r8.a<a> f11722a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<a> f11723b = new AtomicReference<>((Object) null);

    public static final class a implements e {
    }

    public c(r8.a<a> aVar) {
        this.f11722a = aVar;
        ((w) aVar).a(new c0(this, 2));
    }

    public final e a(String str) {
        a aVar = this.f11723b.get();
        if (aVar == null) {
            return f11721c;
        }
        return aVar.a(str);
    }

    public final boolean b() {
        a aVar = this.f11723b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = this.f11723b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, String str2, long j10, z7.c0 c0Var) {
        String c10 = a8.a.c("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", c10, (Throwable) null);
        }
        ((w) this.f11722a).a(new b(str, str2, j10, c0Var));
    }
}
