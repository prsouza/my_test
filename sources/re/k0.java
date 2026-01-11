package re;

import e6.e;
import qe.a;

public final class k0 extends v0<Long, long[], j0> {

    /* renamed from: c  reason: collision with root package name */
    public static final k0 f10715c = new k0();

    public k0() {
        super(l0.f10719b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        j0 j0Var = (j0) obj;
        e.D(j0Var, "builder");
        long C = aVar.C(this.f10756b, i);
        j0Var.b(j0Var.d() + 1);
        long[] jArr = j0Var.f10711a;
        int i10 = j0Var.f10712b;
        j0Var.f10712b = i10 + 1;
        jArr[i10] = C;
    }

    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        e.D(jArr, "$this$toBuilder");
        return new j0(jArr);
    }

    public final Object j() {
        return new long[0];
    }
}
