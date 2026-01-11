package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class j extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF7FFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f540f;

    public j() {
        this.f540f = new int[5];
    }

    public j(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        int[] m02 = b.m0(bigInteger);
        if (m02[4] == -1) {
            int[] iArr = aa.b.f189a;
            if (b.A0(m02, iArr)) {
                b.d2(iArr, m02);
            }
        }
        this.f540f = m02;
    }

    public j(int[] iArr) {
        this.f540f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[5];
        aa.b.k(this.f540f, ((j) eVar).f540f, iArr);
        return new j(iArr);
    }

    public final e b() {
        int[] iArr = new int[5];
        if (b.E0(5, this.f540f, iArr) != 0 || (iArr[4] == -1 && b.A0(iArr, aa.b.f189a))) {
            b.C(5, -2147483647, iArr);
        }
        return new j(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[5];
        b.M0(aa.b.f189a, ((j) eVar).f540f, iArr);
        aa.b.R(iArr, this.f540f, iArr);
        return new j(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return b.g0(this.f540f, ((j) obj).f540f);
    }

    public final e f() {
        int[] iArr = new int[5];
        b.M0(aa.b.f189a, this.f540f, iArr);
        return new j(iArr);
    }

    public final boolean g() {
        return b.O0(this.f540f);
    }

    public final boolean h() {
        return b.X0(this.f540f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f540f, 5);
    }

    public final e i(e eVar) {
        int[] iArr = new int[5];
        aa.b.R(this.f540f, ((j) eVar).f540f, iArr);
        return new j(iArr);
    }

    public final e k() {
        int[] iArr = new int[5];
        aa.b.W(this.f540f, iArr);
        return new j(iArr);
    }

    public final e l() {
        int[] iArr = this.f540f;
        if (b.X0(iArr) || b.O0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        aa.b.g0(iArr, iArr2);
        aa.b.R(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        aa.b.j0(iArr2, 2, iArr3);
        aa.b.R(iArr3, iArr2, iArr3);
        aa.b.j0(iArr3, 4, iArr2);
        aa.b.R(iArr2, iArr3, iArr2);
        aa.b.j0(iArr2, 8, iArr3);
        aa.b.R(iArr3, iArr2, iArr3);
        aa.b.j0(iArr3, 16, iArr2);
        aa.b.R(iArr2, iArr3, iArr2);
        aa.b.j0(iArr2, 32, iArr3);
        aa.b.R(iArr3, iArr2, iArr3);
        aa.b.j0(iArr3, 64, iArr2);
        aa.b.R(iArr2, iArr3, iArr2);
        aa.b.g0(iArr2, iArr3);
        aa.b.R(iArr3, iArr, iArr3);
        aa.b.j0(iArr3, 29, iArr3);
        aa.b.g0(iArr3, iArr2);
        if (b.g0(iArr, iArr2)) {
            return new j(iArr3);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[5];
        aa.b.g0(this.f540f, iArr);
        return new j(iArr);
    }

    public final boolean p() {
        return (this.f540f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.h2(this.f540f);
    }
}
