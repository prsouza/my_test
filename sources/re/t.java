package re;

import e6.e;
import qe.a;

public final class t extends v0<Float, float[], s> {

    /* renamed from: c  reason: collision with root package name */
    public static final t f10752c = new t();

    public t() {
        super(u.f10754b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        s sVar = (s) obj;
        e.D(sVar, "builder");
        float i10 = aVar.i(this.f10756b, i);
        sVar.b(sVar.d() + 1);
        float[] fArr = sVar.f10750a;
        int i11 = sVar.f10751b;
        sVar.f10751b = i11 + 1;
        fArr[i11] = i10;
    }

    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        e.D(fArr, "$this$toBuilder");
        return new s(fArr);
    }

    public final Object j() {
        return new float[0];
    }
}
