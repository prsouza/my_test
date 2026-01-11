package r2;

import a.b;
import a3.f;
import android.graphics.PointF;
import b3.a;
import java.util.List;
import java.util.Objects;
import v2.c;

public final class d extends f<c> {
    public final c i;

    public d(List<a<c>> list) {
        super(list);
        int i10 = 0;
        c cVar = (c) list.get(0).f2845b;
        i10 = cVar != null ? cVar.f12183b.length : i10;
        this.i = new c(new float[i10], new int[i10]);
    }

    public final Object g(a aVar, float f10) {
        c cVar = this.i;
        c cVar2 = (c) aVar.f2845b;
        c cVar3 = (c) aVar.f2846c;
        Objects.requireNonNull(cVar);
        if (cVar2.f12183b.length == cVar3.f12183b.length) {
            int i10 = 0;
            while (true) {
                int[] iArr = cVar2.f12183b;
                if (i10 >= iArr.length) {
                    return this.i;
                }
                float[] fArr = cVar.f12182a;
                float f11 = cVar2.f12182a[i10];
                float f12 = cVar3.f12182a[i10];
                PointF pointF = f.f49a;
                fArr[i10] = a.a.a(f12, f11, f10, f11);
                cVar.f12183b[i10] = b.W(f10, iArr[i10], cVar3.f12183b[i10]);
                i10++;
            }
        } else {
            StringBuilder d10 = a.a.d("Cannot interpolate between gradients. Lengths vary (");
            d10.append(cVar2.f12183b.length);
            d10.append(" vs ");
            throw new IllegalArgumentException(androidx.activity.result.d.c(d10, cVar3.f12183b.length, ")"));
        }
    }
}
