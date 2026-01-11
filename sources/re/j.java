package re;

import e6.e;
import qe.a;

public final class j extends v0<Byte, byte[], i> {

    /* renamed from: c  reason: collision with root package name */
    public static final j f10710c = new j();

    public j() {
        super(k.f10714b);
    }

    public final void f(a aVar, int i, Object obj, boolean z) {
        i iVar = (i) obj;
        e.D(iVar, "builder");
        byte g = aVar.g(this.f10756b, i);
        iVar.b(iVar.d() + 1);
        byte[] bArr = iVar.f10707a;
        int i10 = iVar.f10708b;
        iVar.f10708b = i10 + 1;
        bArr[i10] = g;
    }

    public final Object g(Object obj) {
        byte[] bArr = (byte[]) obj;
        e.D(bArr, "$this$toBuilder");
        return new i(bArr);
    }

    public final Object j() {
        return new byte[0];
    }
}
