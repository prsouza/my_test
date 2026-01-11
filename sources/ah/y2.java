package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class y2 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f646k = {new t2(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public z2 f647j = new z2(this, (e) null, (e) null);

    public y2() {
        super(409, 87, 0, 0);
        this.f13238b = new t2(BigInteger.valueOf(1));
        this.f13239c = new t2(new BigInteger(1, c.a("0021A5C2C8EE9FEB5C4B9A753B7B476B7FD6422EF1F3DD674761FA99D6AC27C8A9A197B272822F6CD57A55AA4F50AE317B13545F")));
        this.f13240d = new BigInteger(1, c.a("010000000000000000000000000000000000000000000000000001E2AAD6A612F33307BE5FA47C3C9E052F838164CD37D9A21173"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new y2();
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
        return new x2(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new z2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new z2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new t2(bigInteger);
    }

    public final int k() {
        return 409;
    }

    public final f l() {
        return this.f647j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
