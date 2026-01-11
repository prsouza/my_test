package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class m extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f558j = n.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f559k = {new n(b.f13229b)};
    public o i = new o(this, (e) null, (e) null);

    public m() {
        super(f558j);
        this.f13238b = new n(new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f13239c = new n(new BigInteger(1, c.a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f13240d = new BigInteger(1, c.a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new m();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 5 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.M(((n) fVar.f13246b).f564f, iArr, i11);
            int i13 = i11 + 5;
            android.support.v4.media.b.M(((n) fVar.f13247c).f564f, iArr, i13);
            i11 = i13 + 5;
        }
        return new l(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new o(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new o(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new n(bigInteger);
    }

    public final int k() {
        return f558j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
