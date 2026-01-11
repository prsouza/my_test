package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class m1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f561k = {new k1(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public n1 f562j = new n1(this, (e) null, (e) null);

    public m1() {
        super(163, 3, 6, 7);
        k1 k1Var = new k1(BigInteger.valueOf(1));
        this.f13238b = k1Var;
        this.f13239c = k1Var;
        this.f13240d = new BigInteger(1, c.a("04000000000000000000020108A2E0CC0D99F8A5EF"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new m1();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 3 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.S(((k1) fVar.f13246b).f547f, jArr, i10);
            int i12 = i10 + 3;
            android.support.v4.media.b.S(((k1) fVar.f13247c).f547f, jArr, i12);
            i10 = i12 + 3;
        }
        return new l1(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new n1(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new n1(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new k1(bigInteger);
    }

    public final int k() {
        return 163;
    }

    public final f l() {
        return this.f562j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
