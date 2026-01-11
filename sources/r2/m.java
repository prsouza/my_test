package r2;

import android.graphics.PointF;
import b3.a;
import java.util.Collections;
import r2.a;

public final class m extends a<PointF, PointF> {
    public final PointF i = new PointF();

    /* renamed from: j  reason: collision with root package name */
    public final a<Float, Float> f10548j;

    /* renamed from: k  reason: collision with root package name */
    public final a<Float, Float> f10549k;

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f10548j = aVar;
        this.f10549k = aVar2;
        i(this.f10529d);
    }

    public final Object f() {
        return this.i;
    }

    public final Object g(a aVar, float f10) {
        return this.i;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.List<r2.a$a>, java.util.ArrayList] */
    public final void i(float f10) {
        this.f10548j.i(f10);
        this.f10549k.i(f10);
        this.i.set(this.f10548j.f().floatValue(), this.f10549k.f().floatValue());
        for (int i10 = 0; i10 < this.f10526a.size(); i10++) {
            ((a.C0206a) this.f10526a.get(i10)).b();
        }
    }
}
