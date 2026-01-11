package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class f1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f512k = {new d1(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public g1 f513j = new g1(this, (e) null, (e) null);

    public f1() {
        super(131, 2, 3, 8);
        this.f13238b = new d1(new BigInteger(1, c.a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f13239c = new d1(new BigInteger(1, c.a("0217C05610884B63B9C6C7291678F9D341")));
        this.f13240d = new BigInteger(1, c.a("0400000000000000023123953A9464B54D"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new f1();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 3 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.S(((d1) fVar.f13246b).f497f, jArr, i10);
            int i12 = i10 + 3;
            android.support.v4.media.b.S(((d1) fVar.f13247c).f497f, jArr, i12);
            i10 = i12 + 3;
        }
        return new e1(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new g1(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new g1(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new d1(bigInteger);
    }

    public final int k() {
        return 131;
    }

    public final f l() {
        return this.f513j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
