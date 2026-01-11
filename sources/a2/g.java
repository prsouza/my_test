package a2;

import android.content.Context;
import android.os.Build;
import b2.e;
import d2.o;
import g2.a;
import u1.q;
import z1.b;

public final class g extends c<b> {
    public g(Context context, a aVar) {
        super((e) b2.g.a(context, aVar).f2842c);
    }

    public final boolean b(o oVar) {
        q qVar = oVar.f4300j.f11626a;
        return qVar == q.UNMETERED || (Build.VERSION.SDK_INT >= 30 && qVar == q.TEMPORARILY_UNMETERED);
    }

    public final boolean c(Object obj) {
        b bVar = (b) obj;
        return !bVar.f13762a || bVar.f13764c;
    }
}
