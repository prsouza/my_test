package yg;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class c extends e.b {
    public static final BigInteger g = b.k2(a.b.D);

    /* renamed from: h  reason: collision with root package name */
    public static final int[] f13659h = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: f  reason: collision with root package name */
    public int[] f13660f;

    public c() {
        this.f13660f = new int[8];
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        int[] p02 = b.p0(bigInteger);
        while (true) {
            int[] iArr = a.b.D;
            if (b.D0(p02, iArr)) {
                b.f2(iArr, p02);
            } else {
                this.f13660f = p02;
                return;
            }
        }
    }

    public c(int[] iArr) {
        this.f13660f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[8];
        b.n(this.f13660f, ((c) eVar).f13660f, iArr);
        if (b.D0(iArr, a.b.D)) {
            a.b.L0(iArr);
        }
        return new c(iArr);
    }

    public final e b() {
        int[] iArr = new int[8];
        b.E0(8, this.f13660f, iArr);
        if (b.D0(iArr, a.b.D)) {
            a.b.L0(iArr);
        }
        return new c(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[8];
        b.M0(a.b.D, ((c) eVar).f13660f, iArr);
        a.b.t0(iArr, this.f13660f, iArr);
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
        return b.j0(this.f13660f, ((c) obj).f13660f);
    }

    public final e f() {
        int[] iArr = new int[8];
        b.M0(a.b.D, this.f13660f, iArr);
        return new c(iArr);
    }

    public final boolean g() {
        return b.R0(this.f13660f);
    }

    public final boolean h() {
        return b.a1(this.f13660f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f13660f, 8);
    }

    public final e i(e eVar) {
        int[] iArr = new int[8];
        a.b.t0(this.f13660f, ((c) eVar).f13660f, iArr);
        return new c(iArr);
    }

    public final e k() {
        int[] iArr = new int[8];
        int[] iArr2 = this.f13660f;
        if (b.a1(iArr2)) {
            b.q2(iArr);
        } else {
            b.Z1(a.b.D, iArr2, iArr);
        }
        return new c(iArr);
    }

    public final e l() {
        int[] iArr = this.f13660f;
        if (b.a1(iArr) || b.R0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[8];
        a.b.H0(iArr, iArr2);
        a.b.t0(iArr2, iArr, iArr2);
        a.b.H0(iArr2, iArr2);
        a.b.t0(iArr2, iArr, iArr2);
        int[] iArr3 = new int[8];
        a.b.H0(iArr2, iArr3);
        a.b.t0(iArr3, iArr, iArr3);
        int[] iArr4 = new int[8];
        a.b.J0(iArr3, 3, iArr4);
        a.b.t0(iArr4, iArr2, iArr4);
        a.b.J0(iArr4, 4, iArr2);
        a.b.t0(iArr2, iArr3, iArr2);
        a.b.J0(iArr2, 4, iArr4);
        a.b.t0(iArr4, iArr3, iArr4);
        a.b.J0(iArr4, 15, iArr3);
        a.b.t0(iArr3, iArr4, iArr3);
        a.b.J0(iArr3, 30, iArr4);
        a.b.t0(iArr4, iArr3, iArr4);
        a.b.J0(iArr4, 60, iArr3);
        a.b.t0(iArr3, iArr4, iArr3);
        a.b.J0(iArr3, 11, iArr4);
        a.b.t0(iArr4, iArr2, iArr4);
        a.b.J0(iArr4, 120, iArr2);
        a.b.t0(iArr2, iArr3, iArr2);
        a.b.H0(iArr2, iArr2);
        a.b.H0(iArr2, iArr3);
        if (b.j0(iArr, iArr3)) {
            return new c(iArr2);
        }
        a.b.t0(iArr2, f13659h, iArr2);
        a.b.H0(iArr2, iArr3);
        if (b.j0(iArr, iArr3)) {
            return new c(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[8];
        a.b.H0(this.f13660f, iArr);
        return new c(iArr);
    }

    public final boolean p() {
        return (this.f13660f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.k2(this.f13660f);
    }
}
