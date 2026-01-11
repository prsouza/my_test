package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class t0 extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f603j = u0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f604k = {new u0(b.f13229b)};
    public v0 i = new v0(this, (e) null, (e) null);

    public t0() {
        super(f603j);
        this.f13238b = new u0(new BigInteger(1, c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f13239c = new u0(new BigInteger(1, c.a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f13240d = new BigInteger(1, c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new t0();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 17 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            System.arraycopy(((u0) fVar.f13246b).f608f, 0, iArr, i11, 17);
            int i13 = i11 + 17;
            System.arraycopy(((u0) fVar.f13247c).f608f, 0, iArr, i13, 17);
            i11 = i13 + 17;
        }
        return new s0(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new v0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new v0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new u0(bigInteger);
    }

    public final int k() {
        return f603j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
