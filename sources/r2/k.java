package r2;

import a3.f;
import android.graphics.PointF;
import b3.a;
import b3.c;
import b3.d;
import java.util.List;

public final class k extends f<d> {
    public final d i = new d();

    public k(List<a<d>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        T t10;
        T t11 = aVar.f2845b;
        if (t11 == null || (t10 = aVar.f2846c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) t11;
        d dVar2 = (d) t10;
        c cVar = this.f10530e;
        if (cVar != null) {
            aVar.f2849f.floatValue();
            e();
            d dVar3 = (d) cVar.a(dVar, dVar2);
            if (dVar3 != null) {
                return dVar3;
            }
        }
        d dVar4 = this.i;
        float f11 = dVar.f2862a;
        float f12 = dVar2.f2862a;
        PointF pointF = f.f49a;
        float a10 = a.a.a(f12, f11, f10, f11);
        float f13 = dVar.f2863b;
        float a11 = a.a.a(dVar2.f2863b, f13, f10, f13);
        dVar4.f2862a = a10;
        dVar4.f2863b = a11;
        return dVar4;
    }
}
