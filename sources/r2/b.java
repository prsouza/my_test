package r2;

import a3.f;
import b3.a;
import b3.c;
import java.util.List;

public final class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    public final Object g(a aVar, float f10) {
        return Integer.valueOf(k(aVar, f10));
    }

    public final int k(a<Integer> aVar, float f10) {
        T t10 = aVar.f2845b;
        if (t10 == null || aVar.f2846c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) t10).intValue();
        int intValue2 = ((Integer) aVar.f2846c).intValue();
        c cVar = this.f10530e;
        if (cVar != null) {
            aVar.f2849f.floatValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer valueOf2 = Integer.valueOf(intValue2);
            e();
            Integer num = (Integer) cVar.a(valueOf, valueOf2);
            if (num != null) {
                return num.intValue();
            }
        }
        return a.b.W(f.b(f10, 0.0f, 1.0f), intValue, intValue2);
    }
}
