package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class l0 extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f553j = m0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f554k = {new m0(b.f13229b)};
    public n0 i = new n0(this, (e) null, (e) null);

    public l0() {
        super(f553j);
        this.f13238b = new m0(new BigInteger(1, c.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f13239c = new m0(new BigInteger(1, c.a("5AC635D8AA3A93E7B3EBBD55769886BC651D06B0CC53B0F63BCE3C3E27D2604B")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFF00000000FFFFFFFFFFFFFFFFBCE6FAADA7179E84F3B9CAC2FC632551"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new l0();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 8 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.P(((m0) fVar.f13246b).f560f, iArr, i11);
            int i13 = i11 + 8;
            android.support.v4.media.b.P(((m0) fVar.f13247c).f560f, iArr, i13);
            i11 = i13 + 8;
        }
        return new k0(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new n0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new n0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new m0(bigInteger);
    }

    public final int k() {
        return f553j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
