package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class z extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f648j = a0.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f649k = {new a0(b.f13229b)};
    public b0 i = new b0(this, (e) null, (e) null);

    public z() {
        super(f648j);
        this.f13238b = new a0(b.f13228a);
        this.f13239c = new a0(BigInteger.valueOf(5));
        this.f13240d = new BigInteger(1, c.a("010000000000000000000000000001DCE8D2EC6184CAF0A971769FB1F7"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new z();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 7 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.O(((a0) fVar.f13246b).f473f, iArr, i11);
            int i13 = i11 + 7;
            android.support.v4.media.b.O(((a0) fVar.f13247c).f473f, iArr, i13);
            i11 = i13 + 7;
        }
        return new y(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new b0(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new b0(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new a0(bigInteger);
    }

    public final int k() {
        return f648j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
