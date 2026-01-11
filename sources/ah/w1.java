package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class w1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f630k = {new u1(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public x1 f631j = new x1(this, (e) null, (e) null);

    public w1() {
        super(193, 15, 0, 0);
        this.f13238b = new u1(new BigInteger(1, c.a("0017858FEB7A98975169E171F77B4087DE098AC8A911DF7B01")));
        this.f13239c = new u1(new BigInteger(1, c.a("00FDFB49BFE6C3A89FACADAA7A1E5BBC7CC1C2E5D831478814")));
        this.f13240d = new BigInteger(1, c.a("01000000000000000000000000C7F34A778F443ACC920EBA49"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new w1();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 4 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.U(((u1) fVar.f13246b).f609f, jArr, i10);
            int i12 = i10 + 4;
            android.support.v4.media.b.U(((u1) fVar.f13247c).f609f, jArr, i12);
            i10 = i12 + 4;
        }
        return new v1(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new x1(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new x1(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new u1(bigInteger);
    }

    public final int k() {
        return 193;
    }

    public final f l() {
        return this.f631j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
