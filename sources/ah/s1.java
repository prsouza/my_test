package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class s1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f598k = {new k1(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public t1 f599j = new t1(this, (e) null, (e) null);

    public s1() {
        super(163, 3, 6, 7);
        this.f13238b = new k1(BigInteger.valueOf(1));
        this.f13239c = new k1(new BigInteger(1, c.a("020A601907B8C953CA1481EB10512F78744A3205FD")));
        this.f13240d = new BigInteger(1, c.a("040000000000000000000292FE77E70C12A4234C33"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new s1();
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
        return new r1(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new t1(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new t1(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new k1(bigInteger);
    }

    public final int k() {
        return 163;
    }

    public final f l() {
        return this.f599j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
