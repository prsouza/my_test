package ah;

import java.math.BigInteger;
import xg.b;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class i extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f534j = j.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f535k = {new j(b.f13229b)};
    public k i = new k(this, (e) null, (e) null);

    public i() {
        super(f534j);
        this.f13238b = new j(new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFC")));
        this.f13239c = new j(new BigInteger(1, c.a("1C97BEFC54BD7A8B65ACF89F81D4D4ADC565FA45")));
        this.f13240d = new BigInteger(1, c.a("0100000000000000000001F4C8F927AED3CA752257"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new i();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 5 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.M(((j) fVar.f13246b).f540f, iArr, i11);
            int i13 = i11 + 5;
            android.support.v4.media.b.M(((j) fVar.f13247c).f540f, iArr, i13);
            i11 = i13 + 5;
        }
        return new h(this, i10, iArr);
    }

    public final f e(e eVar, e eVar2) {
        return new k(this, eVar, eVar2);
    }

    public final f f(e eVar, e eVar2, e[] eVarArr) {
        return new k(this, eVar, eVar2, eVarArr);
    }

    public final e j(BigInteger bigInteger) {
        return new j(bigInteger);
    }

    public final int k() {
        return f534j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
