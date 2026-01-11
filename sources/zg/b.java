package zg;

import java.math.BigInteger;
import xg.d;
import xg.e;
import xg.f;
import yh.c;

public final class b extends d.b {

    /* renamed from: j  reason: collision with root package name */
    public static final BigInteger f14474j = c.g;

    /* renamed from: k  reason: collision with root package name */
    public static final e[] f14475k = {new c(xg.b.f13229b)};
    public d i = new d(this, (e) null, (e) null);

    public b() {
        super(f14474j);
        this.f13238b = new c(new BigInteger(1, c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFC")));
        this.f13239c = new c(new BigInteger(1, c.a("28E9FA9E9D9F5E344D5A9E4BCF6509A7F39789F515AB8F92DDBCBD414D940E93")));
        this.f13240d = new BigInteger(1, c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFF7203DF6B21C6052B53BBF40939D54123"));
        this.f13241e = BigInteger.valueOf(1);
        this.f13242f = 2;
    }

    public final d a() {
        return new b();
    }

    public final android.support.v4.media.b b(f[] fVarArr, int i10) {
        int[] iArr = new int[(i10 * 8 * 2)];
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            f fVar = fVarArr[0 + i12];
            android.support.v4.media.b.P(((c) fVar.f13246b).f14476f, iArr, i11);
            int i13 = i11 + 8;
            android.support.v4.media.b.P(((c) fVar.f13247c).f14476f, iArr, i13);
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
        return f14474j.bitLength();
    }

    public final f l() {
        return this.i;
    }

    public final boolean p(int i10) {
        return i10 == 2;
    }
}
