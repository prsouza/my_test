package y2;

import b3.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import o2.f;
import r2.h;
import z2.c;

public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static c.a f13410a = c.a.a("k");

    public static <T> List<a<T>> a(c cVar, f fVar, float f10, h0<T> h0Var) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (cVar.O() == c.b.STRING) {
            fVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.c();
        while (cVar.s()) {
            if (cVar.S(f13410a) != 0) {
                cVar.a0();
            } else if (cVar.O() == c.b.BEGIN_ARRAY) {
                cVar.a();
                if (cVar.O() == c.b.NUMBER) {
                    arrayList.add(q.a(cVar, fVar, f10, h0Var, false));
                } else {
                    while (cVar.s()) {
                        arrayList.add(q.a(cVar, fVar, f10, h0Var, true));
                    }
                }
                cVar.e();
            } else {
                arrayList.add(q.a(cVar, fVar, f10, h0Var, false));
            }
        }
        cVar.f();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends a<T>> list) {
        int i;
        T t10;
        int size = list.size();
        int i10 = 0;
        while (true) {
            i = size - 1;
            if (i10 >= i) {
                break;
            }
            a aVar = (a) list.get(i10);
            i10++;
            a aVar2 = (a) list.get(i10);
            aVar.f2849f = Float.valueOf(aVar2.f2848e);
            if (aVar.f2846c == null && (t10 = aVar2.f2845b) != null) {
                aVar.f2846c = t10;
                if (aVar instanceof h) {
                    ((h) aVar).d();
                }
            }
        }
        a aVar3 = (a) list.get(i);
        if ((aVar3.f2845b == null || aVar3.f2846c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
