package r2;

import a3.c;
import a3.f;
import android.graphics.Path;
import android.graphics.PointF;
import b3.a;
import java.util.List;

public final class l extends a<v2.l, Path> {
    public final v2.l i = new v2.l();

    /* renamed from: j  reason: collision with root package name */
    public final Path f10547j = new Path();

    public l(List<a<v2.l>> list) {
        super(list);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v4, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v11, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r10v1, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v10, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v18, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v20, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v13, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v25, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v14, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v29, types: [java.util.List<t2.a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v32, types: [java.util.List<t2.a>, java.util.ArrayList] */
    public final Object g(a aVar, float f10) {
        v2.l lVar = aVar.f2845b;
        v2.l lVar2 = aVar.f2846c;
        v2.l lVar3 = this.i;
        if (lVar3.f12228b == null) {
            lVar3.f12228b = new PointF();
        }
        lVar3.f12229c = lVar.f12229c || lVar2.f12229c;
        if (lVar.f12227a.size() != lVar2.f12227a.size()) {
            StringBuilder d10 = a.a.d("Curves must have the same number of control points. Shape 1: ");
            d10.append(lVar.f12227a.size());
            d10.append("\tShape 2: ");
            d10.append(lVar2.f12227a.size());
            c.b(d10.toString());
        }
        int min = Math.min(lVar.f12227a.size(), lVar2.f12227a.size());
        if (lVar3.f12227a.size() < min) {
            for (int size = lVar3.f12227a.size(); size < min; size++) {
                lVar3.f12227a.add(new t2.a());
            }
        } else if (lVar3.f12227a.size() > min) {
            for (int size2 = lVar3.f12227a.size() - 1; size2 >= min; size2--) {
                ? r62 = lVar3.f12227a;
                r62.remove(r62.size() - 1);
            }
        }
        PointF pointF = lVar.f12228b;
        PointF pointF2 = lVar2.f12228b;
        float f11 = pointF.x;
        float f12 = pointF2.x;
        PointF pointF3 = f.f49a;
        float a10 = a.a.a(f12, f11, f10, f11);
        float f13 = pointF.y;
        float a11 = a.a.a(pointF2.y, f13, f10, f13);
        if (lVar3.f12228b == null) {
            lVar3.f12228b = new PointF();
        }
        lVar3.f12228b.set(a10, a11);
        for (int size3 = lVar3.f12227a.size() - 1; size3 >= 0; size3--) {
            t2.a aVar2 = (t2.a) lVar.f12227a.get(size3);
            t2.a aVar3 = (t2.a) lVar2.f12227a.get(size3);
            PointF pointF4 = aVar2.f11253a;
            PointF pointF5 = aVar2.f11254b;
            PointF pointF6 = aVar2.f11255c;
            PointF pointF7 = aVar3.f11253a;
            PointF pointF8 = aVar3.f11254b;
            PointF pointF9 = aVar3.f11255c;
            float f14 = pointF4.x;
            float a12 = a.a.a(pointF7.x, f14, f10, f14);
            float f15 = pointF4.y;
            ((t2.a) lVar3.f12227a.get(size3)).f11253a.set(a12, a.a.a(pointF7.y, f15, f10, f15));
            float f16 = pointF5.x;
            float a13 = a.a.a(pointF8.x, f16, f10, f16);
            float f17 = pointF5.y;
            ((t2.a) lVar3.f12227a.get(size3)).f11254b.set(a13, a.a.a(pointF8.y, f17, f10, f17));
            float f18 = pointF6.x;
            float a14 = a.a.a(pointF9.x, f18, f10, f18);
            float f19 = pointF6.y;
            ((t2.a) lVar3.f12227a.get(size3)).f11255c.set(a14, a.a.a(pointF9.y, f19, f10, f19));
        }
        v2.l lVar4 = this.i;
        Path path = this.f10547j;
        path.reset();
        PointF pointF10 = lVar4.f12228b;
        path.moveTo(pointF10.x, pointF10.y);
        f.f49a.set(pointF10.x, pointF10.y);
        for (int i10 = 0; i10 < lVar4.f12227a.size(); i10++) {
            t2.a aVar4 = (t2.a) lVar4.f12227a.get(i10);
            PointF pointF11 = aVar4.f11253a;
            PointF pointF12 = aVar4.f11254b;
            PointF pointF13 = aVar4.f11255c;
            if (!pointF11.equals(f.f49a) || !pointF12.equals(pointF13)) {
                path.cubicTo(pointF11.x, pointF11.y, pointF12.x, pointF12.y, pointF13.x, pointF13.y);
            } else {
                path.lineTo(pointF13.x, pointF13.y);
            }
            f.f49a.set(pointF13.x, pointF13.y);
        }
        if (lVar4.f12229c) {
            path.close();
        }
        return this.f10547j;
    }
}
