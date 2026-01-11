package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class c extends e.b {
    public static final BigInteger g = new BigInteger(1, yh.c.a("FFFFFFFDFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f486f;

    public c() {
        this.f486f = new int[4];
    }

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        } else if (bigInteger.signum() < 0 || bigInteger.bitLength() > 128) {
            throw new IllegalArgumentException();
        } else {
            int[] iArr = new int[4];
            int i = 0;
            while (bigInteger.signum() != 0) {
                iArr[i] = bigInteger.intValue();
                bigInteger = bigInteger.shiftRight(32);
                i++;
            }
            if ((iArr[3] >>> 1) >= 2147483646) {
                int[] iArr2 = ad.c.f301a;
                if (b.z0(iArr, iArr2)) {
                    long j10 = ((((long) iArr[0]) & 4294967295L) - (((long) iArr2[0]) & 4294967295L)) + 0;
                    iArr[0] = (int) j10;
                    long j11 = ((((long) iArr[1]) & 4294967295L) - (((long) iArr2[1]) & 4294967295L)) + (j10 >> 32);
                    iArr[1] = (int) j11;
                    long j12 = ((((long) iArr[2]) & 4294967295L) - (((long) iArr2[2]) & 4294967295L)) + (j11 >> 32);
                    iArr[2] = (int) j12;
                    iArr[3] = (int) (((((long) iArr[3]) & 4294967295L) - (((long) iArr2[3]) & 4294967295L)) + (j12 >> 32));
                }
            }
            this.f486f = iArr;
        }
    }

    public c(int[] iArr) {
        this.f486f = iArr;
    }

    public final e a(e eVar) {
        int[] iArr = new int[4];
        ad.c.q(this.f486f, ((c) eVar).f486f, iArr);
        return new c(iArr);
    }

    public final e b() {
        int[] iArr = new int[4];
        if (b.E0(4, this.f486f, iArr) != 0 || ((iArr[3] >>> 1) >= 2147483646 && b.z0(iArr, ad.c.f301a))) {
            ad.c.t(iArr);
        }
        return new c(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[4];
        b.M0(ad.c.f301a, ((c) eVar).f486f, iArr);
        ad.c.b0(iArr, this.f486f, iArr);
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
        int[] iArr = this.f486f;
        int[] iArr2 = ((c) obj).f486f;
        for (int i = 3; i >= 0; i--) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        int[] iArr = new int[4];
        b.M0(ad.c.f301a, this.f486f, iArr);
        return new c(iArr);
    }

    public final boolean g() {
        int[] iArr = this.f486f;
        if (iArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 4; i++) {
            if (iArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        return b.W0(this.f486f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f486f, 4);
    }

    public final e i(e eVar) {
        int[] iArr = new int[4];
        ad.c.b0(this.f486f, ((c) eVar).f486f, iArr);
        return new c(iArr);
    }

    public final e k() {
        int[] iArr = new int[4];
        ad.c.g0(this.f486f, iArr);
        return new c(iArr);
    }

    public final e l() {
        boolean z;
        int[] iArr = this.f486f;
        if (!b.W0(iArr)) {
            boolean z10 = false;
            if (iArr[0] == 1) {
                int i = 1;
                while (true) {
                    if (i >= 4) {
                        z = true;
                        break;
                    } else if (iArr[i] != 0) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            z = false;
            if (!z) {
                int[] iArr2 = new int[4];
                ad.c.s0(iArr, iArr2);
                ad.c.b0(iArr2, iArr, iArr2);
                int[] iArr3 = new int[4];
                ad.c.v0(iArr2, 2, iArr3);
                ad.c.b0(iArr3, iArr2, iArr3);
                int[] iArr4 = new int[4];
                ad.c.v0(iArr3, 4, iArr4);
                ad.c.b0(iArr4, iArr3, iArr4);
                ad.c.v0(iArr4, 2, iArr3);
                ad.c.b0(iArr3, iArr2, iArr3);
                ad.c.v0(iArr3, 10, iArr2);
                ad.c.b0(iArr2, iArr3, iArr2);
                ad.c.v0(iArr2, 10, iArr4);
                ad.c.b0(iArr4, iArr3, iArr4);
                ad.c.s0(iArr4, iArr3);
                ad.c.b0(iArr3, iArr, iArr3);
                ad.c.v0(iArr3, 95, iArr3);
                ad.c.s0(iArr3, iArr4);
                int i10 = 3;
                while (true) {
                    if (i10 < 0) {
                        z10 = true;
                        break;
                    } else if (iArr[i10] != iArr4[i10]) {
                        break;
                    } else {
                        i10--;
                    }
                }
                if (z10) {
                    return new c(iArr3);
                }
                return null;
            }
        }
        return this;
    }

    public final e m() {
        int[] iArr = new int[4];
        ad.c.s0(this.f486f, iArr);
        return new c(iArr);
    }

    public final boolean p() {
        return (this.f486f[0] & 1) == 1;
    }

    public final BigInteger q() {
        int[] iArr = this.f486f;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 4; i++) {
            int i10 = iArr[i];
            if (i10 != 0) {
                b.I0(i10, bArr, (3 - i) << 2);
            }
        }
        return new BigInteger(1, bArr);
    }
}
