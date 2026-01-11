package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import xg.v;
import yh.c;

public final class v2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f626k = {new t2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public w2 f627j = new w2(this, (e) null, (e) null);

    public v2() {
        super(409, 87, 0, 0);
        this.f13238b = new t2(BigInteger.valueOf(0));
        this.f13239c = new t2(BigInteger.valueOf(1));
        this.f13240d = new BigInteger(1, c.a("7FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE5F83B2D4EA20400EC4557D5ED3E3E7CA5B4B5C83B8E01E5FCF"));
        this.f13241e = BigInteger.valueOf(4);
        this.f13242f = 6;
    }

    public final d a() {
        return new v2();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 7 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.W(((t2) fVar.f13246b).f605f, jArr, i10);
            int i12 = i10 + 7;
            android.support.v4.media.b.W(((t2) fVar.f13247c).f605f, jArr, i12);
            i10 = i12 + 7;
        }
        return new u2(this, i, jArr);
    }

    public final android.support.v4.media.b c() {
        return new v();
    }

    public final f e(e eVar, e eVar2) {
        return new w2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new w2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new t2(bigInteger);
    }

    public final int k() {
        return 409;
    }

    public final f l() {
        return this.f627j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return true;
    }
}
