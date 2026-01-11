package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class k2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f548k = {new i2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public l2 f549j = new l2(this, (e) null, (e) null);

    public k2() {
        super(239, 158, 0, 0);
        this.f13238b = new i2(BigInteger.valueOf(0));
        this.f13239c = new i2(BigInteger.valueOf(1));
        this.f13240d = new BigInteger(1, c.a("2000000000000000000000000000005A79FEC67CB6E91F1C1DA800E478A5"));
        this.f13241e = BigInteger.valueOf(4);
        this.f13242f = 6;
    }

    public final d a() {
        return new k2();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 4 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.U(((i2) fVar.f13246b).f539f, jArr, i10);
            int i12 = i10 + 4;
            android.support.v4.media.b.U(((i2) fVar.f13247c).f539f, jArr, i12);
            i10 = i12 + 4;
        }
        return new j2(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new l2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new l2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new i2(bigInteger);
    }

    public final int k() {
        return 239;
    }

    public final f l() {
        return this.f549j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
