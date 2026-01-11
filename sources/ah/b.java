package ah;

import java.math.BigInteger;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class b extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f478j = c.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f479k = {new c(xg.b.f13229b)};
    public d i = new d(this, (e) null, (e) null);

    public b() {
        super(f478j);
        this.f13238b = new c(new BigInteger(1, c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f13239c = new c(new BigInteger(1, c.a("E87579C11079F43DD824993C2CEE5ED3")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFE0000000075A30D1B9038A115"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new b();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 4 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.L(((c) fVar.f13246b).f486f, iArr, i11);
            int i13 = i11 + 4;
            android.support.v4.media.b.L(((c) fVar.f13247c).f486f, iArr, i13);
            i11 = i13 + 4;
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
        return f478j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
