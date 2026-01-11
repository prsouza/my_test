package re;

import e6.e;
import qe.a;

public final class m extends v0<Character, char[], l> {

    /* renamed from: c  reason: collision with root package name */
    public static final m f10720c = new m();

    public m() {
        super(n.f10727b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        l lVar = (l) obj;
        e.D(lVar, "builder");
        char r10 = aVar.r(this.f10756b, i);
        lVar.b(lVar.d() + 1);
        char[] cArr = lVar.f10716a;
        int i10 = lVar.f10717b;
        lVar.f10717b = i10 + 1;
        cArr[i10] = r10;
    }

    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        e.D(cArr, "$this$toBuilder");
        return new l(cArr);
    }

    public final Object j() {
        return new char[0];
    }
}
