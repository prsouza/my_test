package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class f3 extends d.a {

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f517k = {new a3(b.f13229b)};

    /* renamed from: l  reason: collision with root package name */
    public static final a3 f518l;

    /* renamed from: m  reason: collision with root package name */
    public static final a3 f519m;

    /* renamed from: j  reason: collision with root package name */
    public g3 f520j = new g3(this, (e) null, (e) null);

    static {
        a3 a3Var = new a3(new BigInteger(1, c.a("02F40E7E2221F295DE297117B7F3D62F5C6A97FFCB8CEFF1CD6BA8CE4A9A18AD84FFABBD8EFA59332BE7AD6756A66E294AFD185A78FF12AA520E4DE739BACA0C7FFEFF7F2955727A")));
        f518l = a3Var;
        f519m = (a3) a3Var.l();
    }

    public f3() {
        super(571, 2, 5, 10);
        this.f13238b = new a3(BigInteger.valueOf(1));
        this.f13239c = f518l;
        this.f13240d = new BigInteger(1, c.a("03FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE661CE18FF55987308059B186823851EC7DD9CA1161DE93D5174D66E8382E9BB2FE84E47"));
        this.f13241e = BigInteger.valueOf(2);
        this.f13242f = 6;
    }

    public final d a() {
        return new f3();
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
        return new e3(this, i, jArr);
    }

    public final f e(e eVar, e eVar2) {
        return new g3(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new g3(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new a3(bigInteger);
    }

    public final int k() {
        return 571;
    }

    public final f l() {
        return this.f520j;
    }

    public final boolean p(int i) {
        return i == 6;
    }

    public final boolean r() {
        return false;
    }
}
