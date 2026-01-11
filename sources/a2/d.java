package a2;

import android.content.Context;
import android.os.Build;
import b2.e;
import b2.g;
import d2.o;
import g2.a;
import u1.q;
import z1.b;

public final class d extends c<b> {
    public d(Context context, a aVar) {
        super((e) g.a(context, aVar).f2842c);
    }

    public final boolean b(o oVar) {
        return oVar.f4300j.f11626a == q.CONNECTED;
    }

    public final boolean c(Object obj) {
        b bVar = (b) obj;
        if (Build.VERSION.SDK_INT < 26) {
            return true ^ bVar.f13762a;
        }
        if (!bVar.f13762a || !bVar.f13763b) {
            return true;
        }
        return false;
    }
}
