package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class m0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFF00000001000000000000000000000000FFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f560f;

    public m0() {
        this.f560f = new int[8];
    }

    public m0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        int[] p02 = b.p0(bigInteger);
        if (p02[7] == -1) {
            int[] iArr = v.f616s;
            if (b.D0(p02, iArr)) {
                b.f2(iArr, p02);
            }
        }
        this.f560f = p02;
    }

    public m0(int[] iArr) {
        this.f560f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[8];
        v.q(this.f560f, ((m0) eVar).f560f, iArr);
        return new m0(iArr);
    }

    public final e b() {
        int[] iArr = new int[8];
        if (b.E0(8, this.f560f, iArr) != 0 || (iArr[7] == -1 && b.D0(iArr, v.f616s))) {
            v.w(iArr);
        }
        return new m0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[8];
        b.M0(v.f616s, ((m0) eVar).f560f, iArr);
        v.V(iArr, this.f560f, iArr);
        return new m0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        return b.j0(this.f560f, ((m0) obj).f560f);
    }

    public final e f() {
        int[] iArr = new int[8];
        b.M0(v.f616s, this.f560f, iArr);
        return new m0(iArr);
    }

    public final boolean g() {
        return b.R0(this.f560f);
    }

    public final boolean h() {
        return b.a1(this.f560f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f560f, 8);
    }

    public final e i(e eVar) {
        int[] iArr = new int[8];
        v.V(this.f560f, ((m0) eVar).f560f, iArr);
        return new m0(iArr);
    }

    public final e k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f560f;
        if (b.a1(iArr2)) {
            b.q2(iArr);
        } else {
            b.Z1(v.f616s, iArr2, iArr);
        }
        return new m0(iArr);
    }

    public final e l() {
        int[] iArr = this.f560f;
        if (b.a1(iArr) || b.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        int[] iArr3 = new int[8];
        v.t0(iArr, iArr2);
        v.V(iArr2, iArr, iArr2);
        v.x0(iArr2, 2, iArr3);
        v.V(iArr3, iArr2, iArr3);
        v.x0(iArr3, 4, iArr2);
        v.V(iArr2, iArr3, iArr2);
        v.x0(iArr2, 8, iArr3);
        v.V(iArr3, iArr2, iArr3);
        v.x0(iArr3, 16, iArr2);
        v.V(iArr2, iArr3, iArr2);
        v.x0(iArr2, 32, iArr2);
        v.V(iArr2, iArr, iArr2);
        v.x0(iArr2, 96, iArr2);
        v.V(iArr2, iArr, iArr2);
        v.x0(iArr2, 94, iArr2);
        v.t0(iArr2, iArr3);
        if (b.j0(iArr, iArr3)) {
            return new m0(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[8];
        v.t0(this.f560f, iArr);
        return new m0(iArr);
    }

    public final boolean p() {
        return (this.f560f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.k2(this.f560f);
    }
}
