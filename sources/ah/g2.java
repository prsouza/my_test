package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class g2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f524k = {new b2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public h2 f525j = new h2(this, (e) null, (e) null);

    public g2() {
        super(233, 74, 0, 0);
        this.f13238b = new b2(BigInteger.valueOf(1));
        this.f13239c = new b2(new BigInteger(1, c.a("0066647EDE6C332C7F8C0923BB58213B333B20E9CE4281FE115F7D8F90AD")));
        this.f13240d = new BigInteger(1, c.a("01000000000000000000000000000013E974E72F8A6922031D2603CFE0D7"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new g2();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 4 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.U(((b2) fVar.f13246b).f482f, jArr, i10);
            int i12 = i10 + 4;
            android.support.v4.media.b.U(((b2) fVar.f13247c).f482f, jArr, i12);
            i10 = i12 + 4;
        }
        return new f2(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new h2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new h2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new b2(bigInteger);
    }

    public final int k() {
        return 233;
    }

    public final f l() {
        return this.f525j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
