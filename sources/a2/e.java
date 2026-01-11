package a2;

import android.content.Context;
import android.os.Build;
import b2.g;
import d2.o;
import g2.a;
import u1.p;
import u1.q;
import z1.b;

public final class e extends c<b> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f34e = p.e("NetworkMeteredCtrlr");

    public e(Context context, a aVar) {
        super((b2.e) g.a(context, aVar).f2842c);
    }

    public final boolean b(o oVar) {
        return oVar.f4300j.f11626a == q.METERED;
    }

    public final boolean c(Object obj) {
        b bVar = (b) obj;
        boolean z = true;
        if (Build.VERSION.SDK_INT < 26) {
            p.c().a(f34e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !bVar.f13762a;
        }
        if (bVar.f13762a && bVar.f13764c) {
            z = false;
        }
        return z;
    }
}
