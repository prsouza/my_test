package r2;

import a3.f;
import android.graphics.PointF;
import b3.a;
import java.util.List;

public final class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Float.valueOf(l(aVar, f10));
    }

    public final float k() {
        return l(b(), d());
    }

    public final float l(a<Float> aVar, float f10) {
        if (aVar.f2845b == null || aVar.f2846c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        b3.c cVar = this.f10530e;
        if (cVar != null) {
            aVar.f2849f.floatValue();
            T t10 = aVar.f2845b;
            T t11 = aVar.f2846c;
            e();
            Float f11 = (Float) cVar.a(t10, t11);
            if (f11 != null) {
                return f11.floatValue();
            }
        }
        if (aVar.g == -3987645.8f) {
            aVar.g = ((Float) aVar.f2845b).floatValue();
        }
        float f12 = aVar.g;
        if (aVar.f2850h == -3987645.8f) {
            aVar.f2850h = ((Float) aVar.f2846c).floatValue();
        }
        float f13 = aVar.f2850h;
        PointF pointF = f.f49a;
        return a.a.a(f13, f12, f10, f12);
    }
}
