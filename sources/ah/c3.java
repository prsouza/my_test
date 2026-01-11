package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class c3 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f493k = {new a3(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public d3 f494j = new d3(this, (e) null, (e) null);

    public c3() {
        super(571, 2, 5, 10);
        this.f13238b = new a3(BigInteger.valueOf(0));
        this.f13239c = new a3(BigInteger.valueOf(1));
        this.f13240d = new BigInteger(1, c.a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f13241e = BigInteger.valueOf(4);
        this.f13242f = 6;
    }

    public final d a() {
        return new c3();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 9 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.X(((a3) fVar.f13246b).f477f, jArr, i10);
            int i12 = i10 + 9;
            android.support.v4.media.b.X(((a3) fVar.f13247c).f477f, jArr, i12);
            i10 = i12 + 9;
        }
        return new b3(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new d3(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new d3(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new a3(bigInteger);
    }

    public final int k() {
        return 571;
    }

    public final f l() {
        return this.f494j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
