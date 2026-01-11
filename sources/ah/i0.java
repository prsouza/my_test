package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class i0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFC2F"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f536f;

    public i0() {
        this.f536f = new int[8];
    }

    public i0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        int[] p02 = b.p0(bigInteger);
        if (p02[7] == -1) {
            int[] iArr = e6.e.f4644b;
            if (b.D0(p02, iArr)) {
                b.f2(iArr, p02);
            }
        }
        this.f536f = p02;
    }

    public i0(int[] iArr) {
        this.f536f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[8];
        if (b.n(this.f536f, ((i0) eVar).f536f, iArr) != 0 || (iArr[7] == -1 && b.D0(iArr, e6.e.f4644b))) {
            b.o(8, 977, iArr);
        }
        return new i0(iArr);
    }

    public final e b() {
        int[] iArr = new int[8];
        if (b.E0(8, this.f536f, iArr) != 0 || (iArr[7] == -1 && b.D0(iArr, e6.e.f4644b))) {
            b.o(8, 977, iArr);
        }
        return new i0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[8];
        b.M0(e6.e.f4644b, ((i0) eVar).f536f, iArr);
        e6.e.T(iArr, this.f536f, iArr);
        return new i0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        return b.j0(this.f536f, ((i0) obj).f536f);
    }

    public final e f() {
        int[] iArr = new int[8];
        b.M0(e6.e.f4644b, this.f536f, iArr);
        return new i0(iArr);
    }

    public final boolean g() {
        return b.R0(this.f536f);
    }

    public final boolean h() {
        return b.a1(this.f536f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f536f, 8);
    }

    public final e i(e eVar) {
        int[] iArr = new int[8];
        e6.e.T(this.f536f, ((i0) eVar).f536f, iArr);
        return new i0(iArr);
    }

    public final e k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f536f;
        if (b.a1(iArr2)) {
            b.q2(iArr);
        } else {
            b.Z1(e6.e.f4644b, iArr2, iArr);
        }
        return new i0(iArr);
    }

    public final e l() {
        int[] iArr = this.f536f;
        if (b.a1(iArr) || b.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        e6.e.Y(iArr, iArr2);
        e6.e.T(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        e6.e.Y(iArr2, iArr3);
        e6.e.T(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        e6.e.Z(iArr3, 3, iArr4);
        e6.e.T(iArr4, iArr3, iArr4);
        e6.e.Z(iArr4, 3, iArr4);
        e6.e.T(iArr4, iArr3, iArr4);
        e6.e.Z(iArr4, 2, iArr4);
        e6.e.T(iArr4, iArr2, iArr4);
        int[] iArr5 = new int[8];
        e6.e.Z(iArr4, 11, iArr5);
        e6.e.T(iArr5, iArr4, iArr5);
        e6.e.Z(iArr5, 22, iArr4);
        e6.e.T(iArr4, iArr5, iArr4);
        int[] iArr6 = new int[8];
        e6.e.Z(iArr4, 44, iArr6);
        e6.e.T(iArr6, iArr4, iArr6);
        int[] iArr7 = new int[8];
        e6.e.Z(iArr6, 88, iArr7);
        e6.e.T(iArr7, iArr6, iArr7);
        e6.e.Z(iArr7, 44, iArr6);
        e6.e.T(iArr6, iArr4, iArr6);
        e6.e.Z(iArr6, 3, iArr4);
        e6.e.T(iArr4, iArr3, iArr4);
        e6.e.Z(iArr4, 23, iArr4);
        e6.e.T(iArr4, iArr5, iArr4);
        e6.e.Z(iArr4, 6, iArr4);
        e6.e.T(iArr4, iArr2, iArr4);
        e6.e.Z(iArr4, 2, iArr4);
        e6.e.Y(iArr4, iArr2);
        if (b.j0(iArr, iArr2)) {
            return new i0(iArr4);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[8];
        e6.e.Y(this.f536f, iArr);
        return new i0(iArr);
    }

    public final boolean p() {
        return (this.f536f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.k2(this.f536f);
    }
}
