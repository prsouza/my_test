package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class r extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFEE37"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f589f;

    public r() {
        this.f589f = new int[6];
    }

    public r(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        int[] n02 = b.n0(bigInteger);
        if (n02[5] == -1) {
            int[] iArr = y.c.f13317b;
            if (b.B0(n02, iArr)) {
                b.e2(iArr, n02);
            }
        }
        this.f589f = n02;
    }

    public r(int[] iArr) {
        this.f589f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[6];
        if (b.l(this.f589f, ((r) eVar).f589f, iArr) != 0 || (iArr[5] == -1 && b.B0(iArr, y.c.f13317b))) {
            b.o(6, 4553, iArr);
        }
        return new r(iArr);
    }

    public final e b() {
        int[] iArr = new int[6];
        if (b.E0(6, this.f589f, iArr) != 0 || (iArr[5] == -1 && b.B0(iArr, y.c.f13317b))) {
            b.o(6, 4553, iArr);
        }
        return new r(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[6];
        b.M0(y.c.f13317b, ((r) eVar).f589f, iArr);
        y.c.R(iArr, this.f589f, iArr);
        return new r(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return b.h0(this.f589f, ((r) obj).f589f);
    }

    public final e f() {
        int[] iArr = new int[6];
        b.M0(y.c.f13317b, this.f589f, iArr);
        return new r(iArr);
    }

    public final boolean g() {
        return b.P0(this.f589f);
    }

    public final boolean h() {
        return b.Y0(this.f589f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f589f, 6);
    }

    public final e i(e eVar) {
        int[] iArr = new int[6];
        y.c.R(this.f589f, ((r) eVar).f589f, iArr);
        return new r(iArr);
    }

    public final e k() {
        int[] iArr = new int[6];
        y.c.W(this.f589f, iArr);
        return new r(iArr);
    }

    public final e l() {
        int[] iArr = this.f589f;
        if (b.Y0(iArr) || b.P0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        y.c.e0(iArr, iArr2);
        y.c.R(iArr2, iArr, iArr2);
        int[] iArr3 = new int[6];
        y.c.e0(iArr2, iArr3);
        y.c.R(iArr3, iArr, iArr3);
        int[] iArr4 = new int[6];
        y.c.h0(iArr3, 3, iArr4);
        y.c.R(iArr4, iArr3, iArr4);
        y.c.h0(iArr4, 2, iArr4);
        y.c.R(iArr4, iArr2, iArr4);
        y.c.h0(iArr4, 8, iArr2);
        y.c.R(iArr2, iArr4, iArr2);
        y.c.h0(iArr2, 3, iArr4);
        y.c.R(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[6];
        y.c.h0(iArr4, 16, iArr5);
        y.c.R(iArr5, iArr2, iArr5);
        y.c.h0(iArr5, 35, iArr2);
        y.c.R(iArr2, iArr5, iArr2);
        y.c.h0(iArr2, 70, iArr5);
        y.c.R(iArr5, iArr2, iArr5);
        y.c.h0(iArr5, 19, iArr2);
        y.c.R(iArr2, iArr4, iArr2);
        y.c.h0(iArr2, 20, iArr2);
        y.c.R(iArr2, iArr4, iArr2);
        y.c.h0(iArr2, 4, iArr2);
        y.c.R(iArr2, iArr3, iArr2);
        y.c.h0(iArr2, 6, iArr2);
        y.c.R(iArr2, iArr3, iArr2);
        y.c.e0(iArr2, iArr2);
        y.c.e0(iArr2, iArr3);
        if (b.h0(iArr, iArr3)) {
            return new r(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[6];
        y.c.e0(this.f589f, iArr);
        return new r(iArr);
    }

    public final boolean p() {
        return (this.f589f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.i2(this.f589f);
    }
}
