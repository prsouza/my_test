package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class r2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f593k = {new m2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public s2 f594j = new s2(this, (e) null, (e) null);

    public r2() {
        super(283, 5, 7, 12);
        this.f13238b = new m2(BigInteger.valueOf(1));
        this.f13239c = new m2(new BigInteger(1, c.a("027B680AC8B8596DA5A4AF8A19A0303FCA97FD7645309FA2A581485AF6263E313B79A2F5")));
        this.f13240d = new BigInteger(1, c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEF90399660FC938A90165B042A7CEFADB307"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new r2();
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
        return new q2(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new s2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new s2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new m2(bigInteger);
    }

    public final int k() {
        return 283;
    }

    public final f l() {
        return this.f594j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
