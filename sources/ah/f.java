package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import yh.c;

public final class f extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f510j = n.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f511k = {new n(b.f13229b)};
    public g i = new g(this, (e) null, (e) null);

    public f() {
        super(f510j);
        this.f13238b = new n(b.f13228a);
        this.f13239c = new n(BigInteger.valueOf(7));
        this.f13240d = new BigInteger(1, c.a("0100000000000000000001B8FA16DFAB9ACA16B6B3"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new f();
    }

    public final android.support.v4.media.b b(xg.f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 5 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            xg.f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.M(((n) fVar.f13246b).f564f, iArr, i11);
            int i13 = i11 + 5;
            android.support.v4.media.b.M(((n) fVar.f13247c).f564f, iArr, i13);
            i11 = i13 + 5;
        }
        return new e(this, i10, iArr);
    }

    public final xg.f e(e eVar, e eVar2) {
        return new g(this, eVar, eVar2);
    }

    public final xg.f f(e eVar, e eVar2, e[] eVarArr) {
        return new g(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new n(bigInteger);
    }

    public final int k() {
        return f510j.bitLength();
    }

    public final xg.f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
