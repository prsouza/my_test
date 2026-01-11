package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class b1 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f480k = {new w0(b.f13229b)};

    /* renamed from: j  reason: collision with root package name */
    public c1 f481j = new c1(this, (e) null, (e) null);

    public b1() {
        super(113, 9, 0, 0);
        this.f13238b = new w0(new BigInteger(1, c.a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f13239c = new w0(new BigInteger(1, c.a("0095E9A9EC9B297BD4BF36E059184F")));
        this.f13240d = new BigInteger(1, c.a("010000000000000108789B2496AF93"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new b1();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i) {
        long[] jArr = new long[(i * 2 * 2)];
        int i10 = 0;
        for (int i11 = 0; i11 < i; i11++) {
            f fVar = fVarArr[0 + i11];
            android.support.v4.media.b.R(((w0) fVar.f13246b).f629f, jArr, i10);
            int i12 = i10 + 2;
            android.support.v4.media.b.R(((w0) fVar.f13247c).f629f, jArr, i12);
            i10 = i12 + 2;
        }
        return new a1(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new c1(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new c1(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new w0(bigInteger);
    }

    public final int k() {
        return 113;
    }

    public final f l() {
        return this.f481j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
