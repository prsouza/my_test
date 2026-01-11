package ah;

import android.support.v4.media.b;
import c3.k;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class u0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f608f;

    public u0() {
        this.f608f = new int[17];
    }

    public u0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        int[] l02 = b.l0(521, bigInteger);
        if (b.f0(17, l02, k.f3181v)) {
            b.n2(17, l02);
        }
        this.f608f = l02;
    }

    public u0(int[] iArr) {
        this.f608f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[17];
        k.B(this.f608f, ((u0) eVar).f608f, iArr);
        return new u0(iArr);
    }

    public final e b() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f608f;
        int E0 = b.E0(16, iArr2, iArr) + iArr2[16];
        if (E0 > 511 || (E0 == 511 && b.f0(16, iArr, k.f3181v))) {
            E0 = (b.F0(iArr) + E0) & 511;
        }
        iArr[16] = E0;
        return new u0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[17];
        b.M0(k.f3181v, ((u0) eVar).f608f, iArr);
        k.y0(iArr, this.f608f, iArr);
        return new u0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        return b.f0(17, this.f608f, ((u0) obj).f608f);
    }

    public final e f() {
        int[] iArr = new int[17];
        b.M0(k.f3181v, this.f608f, iArr);
        return new u0(iArr);
    }

    public final boolean g() {
        return b.N0(17, this.f608f);
    }

    public final boolean h() {
        return b.V0(17, this.f608f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f608f, 17);
    }

    public final e i(e eVar) {
        int[] iArr = new int[17];
        k.y0(this.f608f, ((u0) eVar).f608f, iArr);
        return new u0(iArr);
    }

    public final e k() {
        int[] iArr = new int[17];
        int[] iArr2 = this.f608f;
        if (b.V0(17, iArr2)) {
            b.n2(17, iArr);
        } else {
            b.R1(17, k.f3181v, iArr2, iArr);
        }
        return new u0(iArr);
    }

    public final e l() {
        int[] iArr = this.f608f;
        if (b.V0(17, iArr) || b.N0(17, iArr)) {
            return this;
        }
        int[] iArr2 = new int[17];
        int[] iArr3 = new int[17];
        int i = 519;
        int[] iArr4 = new int[33];
        k.q0(iArr, iArr4);
        while (true) {
            k.I0(iArr4, iArr2);
            i--;
            if (i <= 0) {
                break;
            }
            k.q0(iArr2, iArr4);
        }
        k.Q0(iArr2, iArr3);
        if (b.f0(17, iArr, iArr3)) {
            return new u0(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[17];
        k.Q0(this.f608f, iArr);
        return new u0(iArr);
    }

    public final boolean p() {
        return (this.f608f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.g2(17, this.f608f);
    }
}
