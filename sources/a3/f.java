package a3;

import android.graphics.PointF;
import java.util.List;
import q2.j;
import t2.e;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static PointF f49a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static int c(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static int d(float f10, float f11) {
        int i = (int) f10;
        int i10 = (int) f11;
        int i11 = i / i10;
        int i12 = i % i10;
        if (!((i ^ i10) >= 0) && i12 != 0) {
            i11--;
        }
        return i - (i10 * i11);
    }

    public static void e(e eVar, int i, List<e> list, e eVar2, j jVar) {
        if (eVar.c(jVar.getName(), i)) {
            list.add(eVar2.a(jVar.getName()).g(jVar));
        }
    }
}
