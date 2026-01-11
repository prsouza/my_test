package r2;

import a3.f;
import android.graphics.PointF;
import b3.a;
import b3.c;
import java.util.List;

public final class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public final int k(a<Integer> aVar, float f10) {
        if (aVar.f2845b == null || aVar.f2846c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c cVar = this.f10530e;
        if (cVar != null) {
            aVar.f2849f.floatValue();
            T t10 = aVar.f2845b;
            T t11 = aVar.f2846c;
            e();
            Integer num = (Integer) cVar.a(t10, t11);
            if (num != null) {
                return num.intValue();
            }
        }
        if (aVar.i == 784923401) {
            aVar.i = ((Integer) aVar.f2845b).intValue();
        }
        int i = aVar.i;
        if (aVar.f2851j == 784923401) {
            aVar.f2851j = ((Integer) aVar.f2846c).intValue();
        }
        int i10 = aVar.f2851j;
        PointF pointF = f.f49a;
        return (int) ((f10 * ((float) (i10 - i))) + ((float) i));
    }
}
