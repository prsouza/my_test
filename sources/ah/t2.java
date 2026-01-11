package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class t2 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f605f;

    public t2() {
        this.f605f = new long[7];
    }

    public t2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f605f = b.q0(409, bigInteger);
    }

    public t2(long[] jArr) {
        this.f605f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f605f;
        long[] jArr2 = ((t2) eVar).f605f;
        return new t2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3], jArr[4] ^ jArr2[4], jArr[5] ^ jArr2[5], jArr[6] ^ jArr2[6]});
    }

    public final e b() {
        long[] jArr = this.f605f;
        return new t2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 409;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t2)) {
            return false;
        }
        long[] jArr = this.f605f;
        long[] jArr2 = ((t2) obj).f605f;
        for (int i = 6; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[7];
        long[] jArr2 = this.f605f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 7) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[7];
            long[] jArr4 = new long[7];
            long[] jArr5 = new long[7];
            long[] jArr6 = new long[13];
            v.P(jArr2, jArr6);
            v.k0(jArr6, jArr3);
            v.y0(jArr3, 1, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr4, 1, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 3, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 6, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 12, jArr4);
            v.W(jArr3, jArr4, jArr5);
            v.y0(jArr5, 24, jArr3);
            v.y0(jArr3, 24, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 48, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 96, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.y0(jArr3, 192, jArr4);
            v.W(jArr3, jArr4, jArr3);
            v.W(jArr3, jArr5, jArr);
            return new t2(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        long[] jArr = this.f605f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        long[] jArr = this.f605f;
        for (int i = 0; i < 7; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return a.h(this.f605f, 7) ^ 4090087;
    }

    public final e i(e eVar) {
        long[] jArr = new long[7];
        v.W(this.f605f, ((t2) eVar).f605f, jArr);
        return new t2(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f605f;
        long[] jArr2 = ((t2) eVar).f605f;
        long[] jArr3 = ((t2) eVar2).f605f;
        long[] jArr4 = ((t2) eVar3).f605f;
        long[] jArr5 = new long[13];
        v.Y(jArr, jArr2, jArr5);
        v.Y(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[7];
        v.k0(jArr5, jArr6);
        return new t2(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = this.f605f;
        long d02 = e6.e.d0(jArr[0]);
        long d03 = e6.e.d0(jArr[1]);
        long j10 = (d02 & 4294967295L) | (d03 << 32);
        long j11 = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr[2]);
        long d05 = e6.e.d0(jArr[3]);
        long j12 = (d04 & 4294967295L) | (d05 << 32);
        long j13 = (d04 >>> 32) | (d05 & -4294967296L);
        long d06 = e6.e.d0(jArr[4]);
        long d07 = e6.e.d0(jArr[5]);
        long j14 = (d06 >>> 32) | (d07 & -4294967296L);
        long d08 = e6.e.d0(jArr[6]);
        long j15 = d08 & 4294967295L;
        long j16 = d08 >>> 32;
        return new t2(new long[]{j10 ^ (j11 << 44), (j12 ^ (j13 << 44)) ^ (j11 >>> 20), (((d06 & 4294967295L) | (d07 << 32)) ^ (j14 << 44)) ^ (j13 >>> 20), (((j16 << 44) ^ j15) ^ (j14 >>> 20)) ^ (j11 << 13), (j11 >>> 51) ^ ((j16 >>> 20) ^ (j13 << 13)), (j14 << 13) ^ (j13 >>> 51), (j14 >>> 51) ^ (j16 << 13)});
    }

    public final e m() {
        long[] jArr = new long[7];
        long[] jArr2 = new long[13];
        v.P(this.f605f, jArr2);
        v.k0(jArr2, jArr);
        return new t2(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f605f;
        long[] jArr2 = ((t2) eVar).f605f;
        long[] jArr3 = ((t2) eVar2).f605f;
        long[] jArr4 = new long[13];
        long[] jArr5 = new long[13];
        v.P(jArr, jArr5);
        for (int i = 0; i < 13; i++) {
            jArr4[i] = jArr4[i] ^ jArr5[i];
        }
        v.Y(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[7];
        v.k0(jArr4, jArr6);
        return new t2(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[7];
        v.y0(this.f605f, i, jArr);
        return new t2(jArr);
    }

    public final boolean p() {
        return (this.f605f[0] & 1) != 0;
    }

    public final BigInteger q() {
        long[] jArr = this.f605f;
        byte[] bArr = new byte[56];
        for (int i = 0; i < 7; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                b.h1(j10, bArr, (6 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final e r() {
        long[] jArr = this.f605f;
        long[] jArr2 = new long[13];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6]};
        for (int i = 1; i < 409; i += 2) {
            v.P(jArr3, jArr2);
            v.k0(jArr2, jArr3);
            v.P(jArr3, jArr2);
            v.k0(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
            jArr3[3] = jArr3[3] ^ jArr[3];
            jArr3[4] = jArr3[4] ^ jArr[4];
            jArr3[5] = jArr3[5] ^ jArr[5];
            jArr3[6] = jArr3[6] ^ jArr[6];
        }
        return new t2(jArr3);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        return ((int) this.f605f[0]) & 1;
    }
}
