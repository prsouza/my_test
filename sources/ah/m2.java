package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class m2 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f563f;

    public m2() {
        this.f563f = new long[5];
    }

    public m2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f563f = b.q0(283, bigInteger);
    }

    public m2(long[] jArr) {
        this.f563f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f563f;
        long[] jArr2 = ((m2) eVar).f563f;
        return new m2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4]});
    }

    public final e b() {
        long[] jArr = this.f563f;
        return new m2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 283;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m2)) {
            return false;
        }
        long[] jArr = this.f563f;
        long[] jArr2 = ((m2) obj).f563f;
        for (int i = 4; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f563f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 5) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[5];
            long[] jArr4 = new long[5];
            a.b.I0(jArr2, jArr3);
            a.b.u0(jArr3, jArr2, jArr3);
            a.b.K0(jArr3, 2, jArr4);
            a.b.u0(jArr4, jArr3, jArr4);
            a.b.K0(jArr4, 4, jArr3);
            a.b.u0(jArr3, jArr4, jArr3);
            a.b.K0(jArr3, 8, jArr4);
            a.b.u0(jArr4, jArr3, jArr4);
            a.b.I0(jArr4, jArr4);
            a.b.u0(jArr4, jArr2, jArr4);
            a.b.K0(jArr4, 17, jArr3);
            a.b.u0(jArr3, jArr4, jArr3);
            a.b.I0(jArr3, jArr3);
            a.b.u0(jArr3, jArr2, jArr3);
            a.b.K0(jArr3, 35, jArr4);
            a.b.u0(jArr4, jArr3, jArr4);
            a.b.K0(jArr4, 70, jArr3);
            a.b.u0(jArr3, jArr4, jArr3);
            a.b.I0(jArr3, jArr3);
            a.b.u0(jArr3, jArr2, jArr3);
            a.b.K0(jArr3, 141, jArr4);
            a.b.u0(jArr4, jArr3, jArr4);
            a.b.I0(jArr4, jArr);
            return new m2(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        long[] jArr = this.f563f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        long[] jArr = this.f563f;
        for (int i = 0; i < 5; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return a.h(this.f563f, 5) ^ 2831275;
    }

    public final e i(e eVar) {
        long[] jArr = new long[5];
        a.b.u0(this.f563f, ((m2) eVar).f563f, jArr);
        return new m2(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f563f;
        long[] jArr2 = ((m2) eVar).f563f;
        long[] jArr3 = ((m2) eVar2).f563f;
        long[] jArr4 = ((m2) eVar3).f563f;
        long[] jArr5 = new long[9];
        a.b.v0(jArr, jArr2, jArr5);
        a.b.v0(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[5];
        a.b.y0(jArr5, jArr6);
        return new m2(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[5];
        long[] jArr2 = this.f563f;
        long[] jArr3 = new long[5];
        long d02 = e6.e.d0(jArr2[0]);
        long d03 = e6.e.d0(jArr2[1]);
        long j10 = (d02 & 4294967295L) | (d03 << 32);
        jArr3[0] = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr2[2]);
        long d05 = e6.e.d0(jArr2[3]);
        jArr3[1] = (d04 >>> 32) | (d05 & -4294967296L);
        long d06 = e6.e.d0(jArr2[4]);
        jArr3[2] = d06 >>> 32;
        a.b.u0(jArr3, a.b.f2a, jArr);
        jArr[0] = jArr[0] ^ j10;
        jArr[1] = jArr[1] ^ ((d04 & 4294967295L) | (d05 << 32));
        jArr[2] = jArr[2] ^ (4294967295L & d06);
        return new m2(jArr);
    }

    public final e m() {
        long[] jArr = new long[5];
        a.b.I0(this.f563f, jArr);
        return new m2(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f563f;
        long[] jArr2 = ((m2) eVar).f563f;
        long[] jArr3 = ((m2) eVar2).f563f;
        long[] jArr4 = new long[9];
        long[] jArr5 = new long[9];
        a.b.j0(jArr, jArr5);
        a.b.C(jArr4, jArr5, jArr4);
        a.b.v0(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[5];
        a.b.y0(jArr4, jArr6);
        return new m2(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[5];
        a.b.K0(this.f563f, i, jArr);
        return new m2(jArr);
    }

    public final boolean p() {
        return (this.f563f[0] & 1) != 0;
    }

    public final BigInteger q() {
        long[] jArr = this.f563f;
        byte[] bArr = new byte[40];
        for (int i = 0; i < 5; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                b.h1(j10, bArr, (4 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final e r() {
        long[] jArr = this.f563f;
        long[] jArr2 = new long[9];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4]};
        for (int i = 1; i < 283; i += 2) {
            a.b.j0(jArr3, jArr2);
            a.b.y0(jArr2, jArr3);
            a.b.j0(jArr3, jArr2);
            a.b.y0(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
            jArr3[3] = jArr3[3] ^ jArr[3];
            jArr3[4] = jArr3[4] ^ jArr[4];
        }
        return new m2(jArr3);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f563f;
        return ((int) (jArr[0] ^ (jArr[4] >>> 15))) & 1;
    }
}
