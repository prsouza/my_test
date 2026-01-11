package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class o2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f574k = {new m2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public p2 f575j = new p2(this, (e) null, (e) null);

    public o2() {
        super(283, 5, 7, 12);
        this.f13238b = new m2(BigInteger.valueOf(0));
        this.f13239c = new m2(BigInteger.valueOf(1));
        this.f13240d = new BigInteger(1, c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.f13241e = BigInteger.valueOf(4);
        this.f13242f = 6;
    }

    public final d a() {
        return new o2();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 5 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.V(((m2) fVar.f13246b).f563f, jArr, i10);
            int i12 = i10 + 5;
            android.support.v4.media.b.V(((m2) fVar.f13247c).f563f, jArr, i12);
            i10 = i12 + 5;
        }
        return new n2(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new p2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new p2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new m2(bigInteger);
    }

    public final int k() {
        return 283;
    }

    public final f l() {
        return this.f575j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
