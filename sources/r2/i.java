package r2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import b3.a;
import b3.c;
import java.util.List;

public final class i extends f<PointF> {
    public final PointF i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final float[] f10544j = new float[2];

    /* renamed from: k  reason: collision with root package name */
    public h f10545k;

    /* renamed from: l  reason: collision with root package name */
    public PathMeasure f10546l = new PathMeasure();

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        h hVar = (h) aVar;
        Path path = hVar.f10542o;
        if (path == null) {
            return (PointF) aVar.f2845b;
        }
        c cVar = this.f10530e;
        if (cVar != null) {
            hVar.f2849f.floatValue();
            T t10 = hVar.f2845b;
            T t11 = hVar.f2846c;
            e();
            PointF pointF = (PointF) cVar.a(t10, t11);
            if (pointF != null) {
                return pointF;
            }
        }
        if (this.f10545k != hVar) {
            this.f10546l.setPath(path, false);
            this.f10545k = hVar;
        }
        PathMeasure pathMeasure = this.f10546l;
        pathMeasure.getPosTan(pathMeasure.getLength() * f10, this.f10544j, (float[]) null);
        PointF pointF2 = this.i;
        float[] fArr = this.f10544j;
        pointF2.set(fArr[0], fArr[1]);
        return this.i;
    }
}
