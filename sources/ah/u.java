package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class u extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f606j = w.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f607k = {new w(b.f13229b)};
    public x i = new x(this, (e) null, (e) null);

    public u() {
        super(f606j);
        this.f13238b = new w(new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f13239c = new w(new BigInteger(1, c.a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new u();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 6 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.N(((w) fVar.f13246b).f628f, iArr, i11);
            int i13 = i11 + 6;
            android.support.v4.media.b.N(((w) fVar.f13247c).f628f, iArr, i13);
            i11 = i13 + 6;
        }
        return new t(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new x(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new x(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new w(bigInteger);
    }

    public final int k() {
        return f606j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
