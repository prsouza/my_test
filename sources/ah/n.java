package ah;

import android.support.v4.media.b;
import c3.k;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class n extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f564f;

    public n() {
        this.f564f = new int[5];
    }

    public n(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        int[] m02 = b.m0(bigInteger);
        if (m02[4] == -1) {
            int[] iArr = k.f3175a;
            if (b.A0(m02, iArr)) {
                b.d2(iArr, m02);
            }
        }
        this.f564f = m02;
    }

    public n(int[] iArr) {
        this.f564f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[5];
        k.z(this.f564f, ((n) eVar).f564f, iArr);
        return new n(iArr);
    }

    public final e b() {
        int[] iArr = new int[5];
        if (b.E0(5, this.f564f, iArr) != 0 || (iArr[4] == -1 && b.A0(iArr, k.f3175a))) {
            b.o(5, 21389, iArr);
        }
        return new n(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[5];
        b.M0(k.f3175a, ((n) eVar).f564f, iArr);
        k.w0(iArr, this.f564f, iArr);
        return new n(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        return b.g0(this.f564f, ((n) obj).f564f);
    }

    public final e f() {
        int[] iArr = new int[5];
        b.M0(k.f3175a, this.f564f, iArr);
        return new n(iArr);
    }

    public final boolean g() {
        return b.O0(this.f564f);
    }

    public final boolean h() {
        return b.X0(this.f564f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f564f, 5);
    }

    public final e i(e eVar) {
        int[] iArr = new int[5];
        k.w0(this.f564f, ((n) eVar).f564f, iArr);
        return new n(iArr);
    }

    public final e k() {
        int[] iArr = new int[5];
        k.B0(this.f564f, iArr);
        return new n(iArr);
    }

    public final e l() {
        int[] iArr = this.f564f;
        if (b.X0(iArr) || b.O0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[5];
        k.O0(iArr, iArr2);
        k.w0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[5];
        k.O0(iArr2, iArr3);
        k.w0(iArr3, iArr, iArr3);
        int[] iArr4 = new int[5];
        k.O0(iArr3, iArr4);
        k.w0(iArr4, iArr, iArr4);
        int[] iArr5 = new int[5];
        k.S0(iArr4, 3, iArr5);
        k.w0(iArr5, iArr3, iArr5);
        k.S0(iArr5, 7, iArr4);
        k.w0(iArr4, iArr5, iArr4);
        k.S0(iArr4, 3, iArr5);
        k.w0(iArr5, iArr3, iArr5);
        int[] iArr6 = new int[5];
        k.S0(iArr5, 14, iArr6);
        k.w0(iArr6, iArr4, iArr6);
        k.S0(iArr6, 31, iArr4);
        k.w0(iArr4, iArr6, iArr4);
        k.S0(iArr4, 62, iArr6);
        k.w0(iArr6, iArr4, iArr6);
        k.S0(iArr6, 3, iArr4);
        k.w0(iArr4, iArr3, iArr4);
        k.S0(iArr4, 18, iArr4);
        k.w0(iArr4, iArr5, iArr4);
        k.S0(iArr4, 2, iArr4);
        k.w0(iArr4, iArr, iArr4);
        k.S0(iArr4, 3, iArr4);
        k.w0(iArr4, iArr2, iArr4);
        k.S0(iArr4, 6, iArr4);
        k.w0(iArr4, iArr3, iArr4);
        k.S0(iArr4, 2, iArr4);
        k.w0(iArr4, iArr, iArr4);
        k.O0(iArr4, iArr2);
        if (b.g0(iArr, iArr2)) {
            return new n(iArr4);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[5];
        k.O0(this.f564f, iArr);
        return new n(iArr);
    }

    public final boolean p() {
        return (this.f564f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.h2(this.f564f);
    }
}
