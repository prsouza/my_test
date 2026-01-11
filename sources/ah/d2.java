package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class d2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f498k = {new b2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public e2 f499j = new e2(this, (e) null, (e) null);

    public d2() {
        super(233, 74, 0, 0);
        this.f13238b = new b2(BigInteger.valueOf(0));
        this.f13239c = new b2(BigInteger.valueOf(1));
        this.f13240d = new BigInteger(1, c.a("8000000000000000000000000000069D5BB915BCD46EFB1AD5F173ABDF"));
        this.f13241e = BigInteger.valueOf(4);
        this.f13242f = 6;
    }

    public final d a() {
        return new d2();
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
        return new c2(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new e2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new e2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new b2(bigInteger);
    }

    public final int k() {
        return 233;
    }

    public final f l() {
        return this.f499j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
