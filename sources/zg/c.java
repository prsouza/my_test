package zg;

import android.support.v4.media.b;
import c3.k;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class c extends e.b {
    public static final BigInteger g = new BigInteger(1, yh.c.a("FFFFFFFEFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF00000000FFFFFFFFFFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f14476f;

    public c() {
        this.f14476f = new int[8];
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        int[] p02 = b.p0(bigInteger);
        if ((p02[7] >>> 1) >= Integer.MAX_VALUE) {
            int[] iArr = k.F;
            if (b.D0(p02, iArr)) {
                b.f2(iArr, p02);
            }
        }
        this.f14476f = p02;
    }

    public c(int[] iArr) {
        this.f14476f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[8];
        k.C(this.f14476f, ((c) eVar).f14476f, iArr);
        return new c(iArr);
    }

    public final e b() {
        int[] iArr = new int[8];
        if (b.E0(8, this.f14476f, iArr) != 0 || ((iArr[7] >>> 1) >= Integer.MAX_VALUE && b.D0(iArr, k.F))) {
            k.F(iArr);
        }
        return new c(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[8];
        b.M0(k.F, ((c) eVar).f14476f, iArr);
        k.z0(iArr, this.f14476f, iArr);
        return new c(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        return b.j0(this.f14476f, ((c) obj).f14476f);
    }

    public final e f() {
        int[] iArr = new int[8];
        b.M0(k.F, this.f14476f, iArr);
        return new c(iArr);
    }

    public final boolean g() {
        return b.R0(this.f14476f);
    }

    public final boolean h() {
        return b.a1(this.f14476f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f14476f, 8);
    }

    public final e i(e eVar) {
        int[] iArr = new int[8];
        k.z0(this.f14476f, ((c) eVar).f14476f, iArr);
        return new c(iArr);
    }

    public final e k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f14476f;
        if (b.a1(iArr2)) {
            b.q2(iArr);
        } else {
            b.Z1(k.F, iArr2, iArr);
        }
        return new c(iArr);
    }

    public final e l() {
        int[] iArr = this.f14476f;
        if (b.a1(iArr) || b.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        k.R0(iArr, iArr2);
        k.z0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        k.T0(iArr2, 2, iArr3);
        k.z0(iArr3, iArr2, iArr3);
        int[] iArr4 = new int[8];
        k.T0(iArr3, 2, iArr4);
        k.z0(iArr4, iArr2, iArr4);
        k.T0(iArr4, 6, iArr2);
        k.z0(iArr2, iArr4, iArr2);
        int[] iArr5 = new int[8];
        k.T0(iArr2, 12, iArr5);
        k.z0(iArr5, iArr2, iArr5);
        k.T0(iArr5, 6, iArr2);
        k.z0(iArr2, iArr4, iArr2);
        k.R0(iArr2, iArr4);
        k.z0(iArr4, iArr, iArr4);
        k.T0(iArr4, 31, iArr5);
        k.z0(iArr5, iArr4, iArr2);
        k.T0(iArr5, 32, iArr5);
        k.z0(iArr5, iArr2, iArr5);
        k.T0(iArr5, 62, iArr5);
        k.z0(iArr5, iArr2, iArr5);
        k.T0(iArr5, 4, iArr5);
        k.z0(iArr5, iArr3, iArr5);
        k.T0(iArr5, 32, iArr5);
        k.z0(iArr5, iArr, iArr5);
        k.T0(iArr5, 62, iArr5);
        k.R0(iArr5, iArr3);
        if (b.j0(iArr, iArr3)) {
            return new c(iArr5);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[8];
        k.R0(this.f14476f, iArr);
        return new c(iArr);
    }

    public final boolean p() {
        return (this.f14476f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.k2(this.f14476f);
    }
}
