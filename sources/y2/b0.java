package y2;

import a3.f;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import t2.a;
import v2.l;
import z2.c;

public final class b0 implements h0<l> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f13379a = new b0();

    /* renamed from: b  reason: collision with root package name */
    public static final c.a f13380b = c.a.a("c", "v", "i", "o");

    public final Object a(c cVar, float f10) throws IOException {
        if (cVar.O() == c.b.BEGIN_ARRAY) {
            cVar.a();
        }
        cVar.c();
        List<PointF> list = null;
        List<PointF> list2 = null;
        List<PointF> list3 = null;
        boolean z = false;
        while (cVar.s()) {
            int S = cVar.S(f13380b);
            if (S == 0) {
                z = cVar.t();
            } else if (S == 1) {
                list = p.c(cVar, f10);
            } else if (S == 2) {
                list2 = p.c(cVar, f10);
            } else if (S != 3) {
                cVar.T();
                cVar.a0();
            } else {
                list3 = p.c(cVar, f10);
            }
        }
        cVar.f();
        if (cVar.O() == c.b.END_ARRAY) {
            cVar.e();
        }
        if (list == null || list2 == null || list3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        } else if (list.isEmpty()) {
            return new l(new PointF(), false, Collections.emptyList());
        } else {
            int size = list.size();
            PointF pointF = list.get(0);
            ArrayList arrayList = new ArrayList(size);
            for (int i = 1; i < size; i++) {
                PointF pointF2 = list.get(i);
                int i10 = i - 1;
                arrayList.add(new a(f.a(list.get(i10), list3.get(i10)), f.a(pointF2, list2.get(i)), pointF2));
            }
            if (z) {
                PointF pointF3 = list.get(0);
                int i11 = size - 1;
                arrayList.add(new a(f.a(list.get(i11), list3.get(i11)), f.a(pointF3, list2.get(0)), pointF3));
            }
            return new l(pointF, z, arrayList);
        }
    }
}
