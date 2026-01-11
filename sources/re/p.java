package re;

import e6.e;
import qe.a;

public final class p extends v0<Double, double[], o> {

    /* renamed from: c  reason: collision with root package name */
    public static final p f10736c = new p();

    public p() {
        super(q.f10740b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        o oVar = (o) obj;
        e.D(oVar, "builder");
        double s10 = aVar.s(this.f10756b, i);
        oVar.b(oVar.d() + 1);
        double[] dArr = oVar.f10732a;
        int i10 = oVar.f10733b;
        oVar.f10733b = i10 + 1;
        dArr[i10] = s10;
    }

    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        e.D(dArr, "$this$toBuilder");
        return new o(dArr);
    }

    public final Object j() {
        return new double[0];
    }
}
