package re;

import e6.e;
import qe.a;

public final class a0 extends v0<Integer, int[], z> {

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f10675c = new a0();

    public a0() {
        super(b0.f10679b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        z zVar = (z) obj;
        e.D(zVar, "builder");
        int v10 = aVar.v(this.f10756b, i);
        zVar.b(zVar.d() + 1);
        int[] iArr = zVar.f10764a;
        int i10 = zVar.f10765b;
        zVar.f10765b = i10 + 1;
        iArr[i10] = v10;
    }

    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        e.D(iArr, "$this$toBuilder");
        return new z(iArr);
    }

    public final Object j() {
        return new int[0];
    }
}
