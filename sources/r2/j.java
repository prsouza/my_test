package r2;

import android.graphics.PointF;
import b3.a;
import b3.c;
import java.util.List;

public final class j extends f<PointF> {
    public final PointF i = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        T t10;
        T t11 = aVar.f2845b;
        if (t11 == null || (t10 = aVar.f2846c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) t11;
        PointF pointF2 = (PointF) t10;
        c cVar = this.f10530e;
        if (cVar != null) {
            aVar.f2849f.floatValue();
            e();
            PointF pointF3 = (PointF) cVar.a(pointF, pointF2);
            if (pointF3 != null) {
                return pointF3;
            }
        }
        PointF pointF4 = this.i;
        float f11 = pointF.x;
        float a10 = a.a.a(pointF2.x, f11, f10, f11);
        float f12 = pointF.y;
        pointF4.set(a10, ((pointF2.y - f12) * f10) + f12);
        return this.i;
    }
}
