package yg;

import java.math.BigInteger;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class b extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f13655j = c.g;

    /* renamed from: k  reason: collision with root package name */
    public static final BigInteger f13656k;

    /* renamed from: l  reason: collision with root package name */
    public static final BigInteger f13657l = new BigInteger(1, c.a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864"));

    /* renamed from: m  reason: collision with root package name */
    public static final e[] f13658m;
    public d i = new d(this, (e) null, (e) null);

    static {
        BigInteger bigInteger = new BigInteger(1, c.a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144"));
        f13656k = bigInteger;
        f13658m = new e[]{new c(xg.b.f13229b), new c(bigInteger)};
    }

    public b() {
        super(f13655j);
        this.f13238b = new c(f13656k);
        this.f13239c = new c(f13657l);
        this.f13240d = new BigInteger(1, c.a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f13241e = BigInteger.valueOf(8);
        this.f13242f = 4;
    }

    public final d a() {
        return new b();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 8 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.P(((c) fVar.f13246b).f13660f, iArr, i11);
            int i13 = i11 + 8;
            android.support.v4.media.b.P(((c) fVar.f13247c).f13660f, iArr, i13);
            i11 = i13 + 8;
        }
        return new a(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new d(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new d(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new c(bigInteger);
    }

    public final int k() {
        return f13655j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 4;
    }
}
