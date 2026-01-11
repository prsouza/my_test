package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import yh.c;

public final class q0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f585f;

    public q0() {
        this.f585f = new int[12];
    }

    public q0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        int[] l02 = b.l0(384, bigInteger);
        if (l02[11] == -1) {
            int[] iArr = aa.b.f195v;
            if (b.y0(12, l02, iArr)) {
                b.b2(12, iArr, l02);
            }
        }
        this.f585f = l02;
    }

    public q0(int[] iArr) {
        this.f585f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[12];
        aa.b.l(this.f585f, ((q0) eVar).f585f, iArr);
        return new q0(iArr);
    }

    public final e b() {
        int[] iArr = new int[12];
        if (b.E0(12, this.f585f, iArr) != 0 || (iArr[11] == -1 && b.y0(12, iArr, aa.b.f195v))) {
            aa.b.n(iArr);
        }
        return new q0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[12];
        b.M0(aa.b.f195v, ((q0) eVar).f585f, iArr);
        aa.b.U(iArr, this.f585f, iArr);
        return new q0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        return b.f0(12, this.f585f, ((q0) obj).f585f);
    }

    public final e f() {
        int[] iArr = new int[12];
        b.M0(aa.b.f195v, this.f585f, iArr);
        return new q0(iArr);
    }

    public final boolean g() {
        return b.N0(12, this.f585f);
    }

    public final boolean h() {
        return b.V0(12, this.f585f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f585f, 12);
    }

    public final e i(e eVar) {
        int[] iArr = new int[12];
        aa.b.U(this.f585f, ((q0) eVar).f585f, iArr);
        return new q0(iArr);
    }

    public final e k() {
        int[] iArr = new int[12];
        int[] iArr2 = this.f585f;
        if (b.V0(12, iArr2)) {
            b.n2(12, iArr);
        } else {
            b.R1(12, aa.b.f195v, iArr2, iArr);
        }
        return new q0(iArr);
    }

    public final e l() {
        int[] iArr = this.f585f;
        if (b.V0(12, iArr) || b.N0(12, iArr)) {
            return this;
        }
        int[] iArr2 = new int[12];
        int[] iArr3 = new int[12];
        int[] iArr4 = new int[12];
        int[] iArr5 = new int[12];
        aa.b.i0(iArr, iArr2);
        aa.b.U(iArr2, iArr, iArr2);
        aa.b.m0(iArr2, 2, iArr3);
        aa.b.U(iArr3, iArr2, iArr3);
        aa.b.i0(iArr3, iArr3);
        aa.b.U(iArr3, iArr, iArr3);
        aa.b.m0(iArr3, 5, iArr4);
        aa.b.U(iArr4, iArr3, iArr4);
        aa.b.m0(iArr4, 5, iArr5);
        aa.b.U(iArr5, iArr3, iArr5);
        aa.b.m0(iArr5, 15, iArr3);
        aa.b.U(iArr3, iArr5, iArr3);
        aa.b.m0(iArr3, 2, iArr4);
        aa.b.U(iArr2, iArr4, iArr2);
        aa.b.m0(iArr4, 28, iArr4);
        aa.b.U(iArr3, iArr4, iArr3);
        aa.b.m0(iArr3, 60, iArr4);
        aa.b.U(iArr4, iArr3, iArr4);
        aa.b.m0(iArr4, 120, iArr3);
        aa.b.U(iArr3, iArr4, iArr3);
        aa.b.m0(iArr3, 15, iArr3);
        aa.b.U(iArr3, iArr5, iArr3);
        aa.b.m0(iArr3, 33, iArr3);
        aa.b.U(iArr3, iArr2, iArr3);
        aa.b.m0(iArr3, 64, iArr3);
        aa.b.U(iArr3, iArr, iArr3);
        aa.b.m0(iArr3, 30, iArr2);
        aa.b.i0(iArr2, iArr3);
        if (b.f0(12, iArr, iArr3)) {
            return new q0(iArr2);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[12];
        aa.b.i0(this.f585f, iArr);
        return new q0(iArr);
    }

    public final boolean p() {
        return (this.f585f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.g2(12, this.f585f);
    }
}
