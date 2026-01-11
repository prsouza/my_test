package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class w extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f628f;

    public w() {
        this.f628f = new int[6];
    }

    public w(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        int[] n02 = b.n0(bigInteger);
        if (n02[5] == -1) {
            int[] iArr = v.f613a;
            if (b.B0(n02, iArr)) {
                b.e2(iArr, n02);
            }
        }
        this.f628f = n02;
    }

    public w(int[] iArr) {
        this.f628f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[6];
        v.o(this.f628f, ((w) eVar).f628f, iArr);
        return new w(iArr);
    }

    public final e b() {
        int[] iArr = new int[6];
        if (b.E0(6, this.f628f, iArr) != 0 || (iArr[5] == -1 && b.B0(iArr, v.f613a))) {
            v.v(iArr);
        }
        return new w(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[6];
        b.M0(v.f613a, ((w) eVar).f628f, iArr);
        v.T(iArr, this.f628f, iArr);
        return new w(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        return b.h0(this.f628f, ((w) obj).f628f);
    }

    public final e f() {
        int[] iArr = new int[6];
        b.M0(v.f613a, this.f628f, iArr);
        return new w(iArr);
    }

    public final boolean g() {
        return b.P0(this.f628f);
    }

    public final boolean h() {
        return b.Y0(this.f628f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f628f, 6);
    }

    public final e i(e eVar) {
        int[] iArr = new int[6];
        v.T(this.f628f, ((w) eVar).f628f, iArr);
        return new w(iArr);
    }

    public final e k() {
        int[] iArr = new int[6];
        v.a0(this.f628f, iArr);
        return new w(iArr);
    }

    public final e l() {
        int[] iArr = this.f628f;
        if (b.Y0(iArr) || b.P0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[6];
        int[] iArr3 = new int[6];
        v.r0(iArr, iArr2);
        v.T(iArr2, iArr, iArr2);
        v.v0(iArr2, 2, iArr3);
        v.T(iArr3, iArr2, iArr3);
        v.v0(iArr3, 4, iArr2);
        v.T(iArr2, iArr3, iArr2);
        v.v0(iArr2, 8, iArr3);
        v.T(iArr3, iArr2, iArr3);
        v.v0(iArr3, 16, iArr2);
        v.T(iArr2, iArr3, iArr2);
        v.v0(iArr2, 32, iArr3);
        v.T(iArr3, iArr2, iArr3);
        v.v0(iArr3, 64, iArr2);
        v.T(iArr2, iArr3, iArr2);
        v.v0(iArr2, 62, iArr2);
        v.r0(iArr2, iArr3);
        if (b.h0(iArr, iArr3)) {
            return new w(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[6];
        v.r0(this.f628f, iArr);
        return new w(iArr);
    }

    public final boolean p() {
        return (this.f628f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.i2(this.f628f);
    }
}
