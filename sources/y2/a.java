package y2;

import a3.g;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import o2.f;
import r2.h;
import u2.b;
import u2.e;
import u2.i;
import u2.m;
import z2.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f13375a = c.a.a("k", "x", "y");

    public static e a(c cVar, f fVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.O() == c.b.BEGIN_ARRAY) {
            cVar.a();
            while (cVar.s()) {
                arrayList.add(new h(fVar, q.a(cVar, fVar, g.c(), v.f13420a, cVar.O() == c.b.BEGIN_OBJECT)));
            }
            cVar.e();
            r.b(arrayList);
        } else {
            arrayList.add(new b3.a(p.b(cVar, g.c())));
        }
        return new e((Object) arrayList);
    }

    public static m<PointF, PointF> b(c cVar, f fVar) throws IOException {
        cVar.c();
        e eVar = null;
        b bVar = null;
        boolean z = false;
        b bVar2 = null;
        while (cVar.O() != c.b.END_OBJECT) {
            int S = cVar.S(f13375a);
            if (S != 0) {
                if (S != 1) {
                    if (S != 2) {
                        cVar.T();
                        cVar.a0();
                    } else if (cVar.O() == c.b.STRING) {
                        cVar.a0();
                    } else {
                        bVar = d.c(cVar, fVar, true);
                    }
                } else if (cVar.O() == c.b.STRING) {
                    cVar.a0();
                } else {
                    bVar2 = d.c(cVar, fVar, true);
                }
                z = true;
            } else {
                eVar = a(cVar, fVar);
            }
        }
        cVar.f();
        if (z) {
            fVar.a("Lottie doesn't support expressions.");
        }
        if (eVar != null) {
            return eVar;
        }
        return new i(bVar2, bVar);
    }
}
