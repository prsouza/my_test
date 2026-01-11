package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class z1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f650k = {new u1(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public a2 f651j = new a2(this, (e) null, (e) null);

    public z1() {
        super(193, 15, 0, 0);
        this.f13238b = new u1(new BigInteger(1, c.a("0163F35A5137C2CE3EA6ED8667190B0BC43ECD69977702709B")));
        this.f13239c = new u1(new BigInteger(1, c.a("00C9BB9E8927D4D64C377E2AB2856A5B16E3EFB7F61D4316AE")));
        this.f13240d = new BigInteger(1, c.a("010000000000000000000000015AAB561B005413CCD4EE99D5"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new z1();
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
        return new y1(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new a2(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new a2(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new u1(bigInteger);
    }

    public final int k() {
        return 193;
    }

    public final f l() {
        return this.f651j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
