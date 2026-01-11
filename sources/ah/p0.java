package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class p0 extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f579j = q0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f580k = {new q0(b.f13229b)};
    public r0 i = new r0(this, (e) null, (e) null);

    public p0() {
        super(f579j);
        this.f13238b = new q0(new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f13239c = new q0(new BigInteger(1, c.a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new p0();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 12 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            System.arraycopy(((q0) fVar.f13246b).f585f, 0, iArr, i11, 12);
            int i13 = i11 + 12;
            System.arraycopy(((q0) fVar.f13247c).f585f, 0, iArr, i13, 12);
            i11 = i13 + 12;
        }
        return new o0(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new r0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new r0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new q0(bigInteger);
    }

    public final int k() {
        return f579j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
