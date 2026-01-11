package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class h0 extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f529j = i0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f530k = {new i0(b.f13229b)};
    public j0 i = new j0(this, (e) null, (e) null);

    public h0() {
        super(f529j);
        this.f13238b = new i0(b.f13228a);
        this.f13239c = new i0(BigInteger.valueOf(7));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEBAAEDCE6AF48A03BBFD25E8CD0364141"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new h0();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 8 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.P(((i0) fVar.f13246b).f536f, iArr, i11);
            int i13 = i11 + 8;
            android.support.v4.media.b.P(((i0) fVar.f13247c).f536f, iArr, i13);
            i11 = i13 + 8;
        }
        return new g0(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new j0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new j0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new i0(bigInteger);
    }

    public final int k() {
        return f529j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
