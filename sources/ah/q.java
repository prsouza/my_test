package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class q extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f583j = r.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f584k = {new r(b.f13229b)};
    public s i = new s(this, (e) null, (e) null);

    public q() {
        super(f583j);
        this.f13238b = new r(b.f13228a);
        this.f13239c = new r(BigInteger.valueOf(3));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFE26F2FC170F69466A74DEFD8D"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new q();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 6 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.N(((r) fVar.f13246b).f589f, iArr, i11);
            int i13 = i11 + 6;
            android.support.v4.media.b.N(((r) fVar.f13247c).f589f, iArr, i13);
            i11 = i13 + 6;
        }
        return new p(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new s(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new s(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new r(bigInteger);
    }

    public final int k() {
        return f583j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
