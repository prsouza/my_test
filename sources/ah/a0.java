package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class a0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFE56D"));

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f472h = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: f  reason: collision with root package name */
    public int[] f473f;

    public a0() {
        this.f473f = new int[7];
    }

    public a0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        int[] o02 = b.o0(bigInteger);
        if (o02[6] == -1 && b.C0(o02, aa.b.f192s)) {
            b.o(7, 6803, o02);
        }
        this.f473f = o02;
    }

    public a0(int[] iArr) {
        this.f473f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[7];
        if (b.m(this.f473f, ((a0) eVar).f473f, iArr) != 0 || (iArr[6] == -1 && b.C0(iArr, aa.b.f192s))) {
            b.o(7, 6803, iArr);
        }
        return new a0(iArr);
    }

    public final e b() {
        int[] iArr = new int[7];
        if (b.E0(7, this.f473f, iArr) != 0 || (iArr[6] == -1 && b.C0(iArr, aa.b.f192s))) {
            b.o(7, 6803, iArr);
        }
        return new a0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[7];
        b.M0(aa.b.f192s, ((a0) eVar).f473f, iArr);
        aa.b.T(iArr, this.f473f, iArr);
        return new a0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        return b.i0(this.f473f, ((a0) obj).f473f);
    }

    public final e f() {
        int[] iArr = new int[7];
        b.M0(aa.b.f192s, this.f473f, iArr);
        return new a0(iArr);
    }

    public final boolean g() {
        return b.Q0(this.f473f);
    }

    public final boolean h() {
        return b.Z0(this.f473f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f473f, 7);
    }

    public final e i(e eVar) {
        int[] iArr = new int[7];
        aa.b.T(this.f473f, ((a0) eVar).f473f, iArr);
        return new a0(iArr);
    }

    public final e k() {
        int[] iArr = new int[7];
        int[] iArr2 = this.f473f;
        if (b.Z0(iArr2)) {
            b.p2(iArr);
        } else {
            b.Y1(aa.b.f192s, iArr2, iArr);
        }
        return new a0(iArr);
    }

    public final e l() {
        int[] iArr = this.f473f;
        if (b.Z0(iArr) || b.Q0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        aa.b.h0(iArr, iArr2);
        aa.b.T(iArr2, iArr, iArr2);
        aa.b.h0(iArr2, iArr2);
        aa.b.T(iArr2, iArr, iArr2);
        int[] iArr3 = new int[7];
        aa.b.h0(iArr2, iArr3);
        aa.b.T(iArr3, iArr, iArr3);
        int[] iArr4 = new int[7];
        aa.b.l0(iArr3, 4, iArr4);
        aa.b.T(iArr4, iArr3, iArr4);
        int[] iArr5 = new int[7];
        aa.b.l0(iArr4, 3, iArr5);
        aa.b.T(iArr5, iArr2, iArr5);
        aa.b.l0(iArr5, 8, iArr5);
        aa.b.T(iArr5, iArr4, iArr5);
        aa.b.l0(iArr5, 4, iArr4);
        aa.b.T(iArr4, iArr3, iArr4);
        aa.b.l0(iArr4, 19, iArr3);
        aa.b.T(iArr3, iArr5, iArr3);
        int[] iArr6 = new int[7];
        aa.b.l0(iArr3, 42, iArr6);
        aa.b.T(iArr6, iArr3, iArr6);
        aa.b.l0(iArr6, 23, iArr3);
        aa.b.T(iArr3, iArr4, iArr3);
        aa.b.l0(iArr3, 84, iArr4);
        aa.b.T(iArr4, iArr6, iArr4);
        aa.b.l0(iArr4, 20, iArr4);
        aa.b.T(iArr4, iArr5, iArr4);
        aa.b.l0(iArr4, 3, iArr4);
        aa.b.T(iArr4, iArr, iArr4);
        aa.b.l0(iArr4, 2, iArr4);
        aa.b.T(iArr4, iArr, iArr4);
        aa.b.l0(iArr4, 4, iArr4);
        aa.b.T(iArr4, iArr2, iArr4);
        aa.b.h0(iArr4, iArr4);
        aa.b.h0(iArr4, iArr6);
        if (b.i0(iArr, iArr6)) {
            return new a0(iArr4);
        }
        aa.b.T(iArr4, f472h, iArr4);
        aa.b.h0(iArr4, iArr6);
        if (b.i0(iArr, iArr6)) {
            return new a0(iArr4);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[7];
        aa.b.h0(this.f473f, iArr);
        return new a0(iArr);
    }

    public final boolean p() {
        return (this.f473f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.j2(this.f473f);
    }
}
