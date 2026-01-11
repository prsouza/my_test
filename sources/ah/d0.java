package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class d0 extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f495j = e0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f496k = {new e0(b.f13229b)};
    public f0 i = new f0(this, (e) null, (e) null);

    public d0() {
        super(f495j);
        this.f13238b = new e0(new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFE")));
        this.f13239c = new e0(new BigInteger(1, c.a("B4050A850C04B3ABF54132565044B0B7D7BFD8BA270B39432355FFB4")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFF16A2E0B8F03E13DD29455C5C2A3D"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new d0();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 7 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.O(((e0) fVar.f13246b).f503f, iArr, i11);
            int i13 = i11 + 7;
            android.support.v4.media.b.O(((e0) fVar.f13247c).f503f, iArr, i13);
            i11 = i13 + 7;
        }
        return new c0(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new f0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new f0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new e0(bigInteger);
    }

    public final int k() {
        return f495j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
