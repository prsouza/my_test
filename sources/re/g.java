package re;

import e6.e;
import qe.a;

public final class g extends v0<Boolean, boolean[], f> {

    /* renamed from: c  reason: collision with root package name */
    public static final g f10698c = new g();

    public g() {
        super(h.f10702b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        f fVar = (f) obj;
        e.D(fVar, "builder");
        boolean d10 = aVar.d(this.f10756b, i);
        fVar.b(fVar.d() + 1);
        boolean[] zArr = fVar.f10691a;
        int i10 = fVar.f10692b;
        fVar.f10692b = i10 + 1;
        zArr[i10] = d10;
    }

    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        e.D(zArr, "$this$toBuilder");
        return new f(zArr);
    }

    public final Object j() {
        return new boolean[0];
    }
}
