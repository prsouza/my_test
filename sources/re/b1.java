package re;

import e6.e;
import qe.a;

public final class b1 extends v0<Short, short[], a1> {

    /* renamed from: c  reason: collision with root package name */
    public static final b1 f10680c = new b1();

    public b1() {
        super(c1.f10684b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        a1 a1Var = (a1) obj;
        e.D(a1Var, "builder");
        short t10 = aVar.t(this.f10756b, i);
        a1Var.b(a1Var.d() + 1);
        short[] sArr = a1Var.f10676a;
        int i10 = a1Var.f10677b;
        a1Var.f10677b = i10 + 1;
        sArr[i10] = t10;
    }

    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        e.D(sArr, "$this$toBuilder");
        return new a1(sArr);
    }

    public final Object j() {
        return new short[0];
    }
}
