package ah;

import ad.c;
import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class i2 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f539f;

    public i2() {
        this.f539f = new long[4];
    }

    public i2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f539f = b.q0(239, bigInteger);
    }

    public i2(long[] jArr) {
        this.f539f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f539f;
        long[] jArr2 = ((i2) eVar).f539f;
        return new i2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public final e b() {
        long[] jArr = this.f539f;
        return new i2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 239;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        return b.k0(this.f539f, ((i2) obj).f539f);
    }

    public final e f() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f539f;
        if (!b.c1(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            c.u0(jArr2, jArr3);
            c.d0(jArr3, jArr2, jArr3);
            c.u0(jArr3, jArr3);
            c.d0(jArr3, jArr2, jArr3);
            c.x0(jArr3, 3, jArr4);
            c.d0(jArr4, jArr3, jArr4);
            c.u0(jArr4, jArr4);
            c.d0(jArr4, jArr2, jArr4);
            c.x0(jArr4, 7, jArr3);
            c.d0(jArr3, jArr4, jArr3);
            c.x0(jArr3, 14, jArr4);
            c.d0(jArr4, jArr3, jArr4);
            c.u0(jArr4, jArr4);
            c.d0(jArr4, jArr2, jArr4);
            c.x0(jArr4, 29, jArr3);
            c.d0(jArr3, jArr4, jArr3);
            c.u0(jArr3, jArr3);
            c.d0(jArr3, jArr2, jArr3);
            c.x0(jArr3, 59, jArr4);
            c.d0(jArr4, jArr3, jArr4);
            c.u0(jArr4, jArr4);
            c.d0(jArr4, jArr2, jArr4);
            c.x0(jArr4, 119, jArr3);
            c.d0(jArr3, jArr4, jArr3);
            c.u0(jArr3, jArr);
            return new i2(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        return b.T0(this.f539f);
    }

    public final boolean h() {
        return b.c1(this.f539f);
    }

    public final int hashCode() {
        return a.h(this.f539f, 4) ^ 23900158;
    }

    public final e i(e eVar) {
        long[] jArr = new long[4];
        c.d0(this.f539f, ((i2) eVar).f539f, jArr);
        return new i2(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f539f;
        long[] jArr2 = ((i2) eVar).f539f;
        long[] jArr3 = ((i2) eVar2).f539f;
        long[] jArr4 = ((i2) eVar3).f539f;
        long[] jArr5 = new long[8];
        c.f0(jArr, jArr2, jArr5);
        c.f0(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        c.m0(jArr5, jArr6);
        return new i2(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f539f;
        long d02 = e6.e.d0(jArr2[0]);
        long d03 = e6.e.d0(jArr2[1]);
        long j10 = (d02 & 4294967295L) | (d03 << 32);
        long j11 = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr2[2]);
        long d05 = e6.e.d0(jArr2[3]);
        long j12 = (d04 & 4294967295L) | (d05 << 32);
        long j13 = (d05 & -4294967296L) | (d04 >>> 32);
        long j14 = j13 >>> 49;
        long j15 = (j11 >>> 49) | (j13 << 15);
        long j16 = j13 ^ (j11 << 15);
        long[] jArr3 = new long[8];
        int[] iArr = {39, 120};
        int i = 0;
        for (int i10 = 2; i < i10; i10 = 2) {
            int i11 = iArr[i] >>> 6;
            int i12 = iArr[i] & 63;
            jArr3[i11] = jArr3[i11] ^ (j11 << i12);
            int i13 = i11 + 1;
            int i14 = -i12;
            jArr3[i13] = jArr3[i13] ^ ((j16 << i12) | (j11 >>> i14));
            int i15 = i11 + 2;
            jArr3[i15] = jArr3[i15] ^ ((j15 << i12) | (j16 >>> i14));
            int i16 = i11 + 3;
            jArr3[i16] = jArr3[i16] ^ ((j14 << i12) | (j15 >>> i14));
            int i17 = i11 + 4;
            jArr3[i17] = jArr3[i17] ^ (j14 >>> i14);
            i++;
        }
        c.m0(jArr3, jArr);
        jArr[0] = jArr[0] ^ j10;
        jArr[1] = jArr[1] ^ j12;
        return new i2(jArr);
    }

    public final e m() {
        long[] jArr = new long[4];
        c.u0(this.f539f, jArr);
        return new i2(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f539f;
        long[] jArr2 = ((i2) eVar).f539f;
        long[] jArr3 = ((i2) eVar2).f539f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        c.X(jArr, jArr5);
        c.s(jArr4, jArr5, jArr4);
        c.f0(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        c.m0(jArr4, jArr6);
        return new i2(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        c.x0(this.f539f, i, jArr);
        return new i2(jArr);
    }

    public final boolean p() {
        return (this.f539f[0] & 1) != 0;
    }

    public final BigInteger q() {
        return b.m2(this.f539f);
    }

    public final e r() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f539f;
        long[] jArr3 = new long[8];
        b.T(jArr2, jArr);
        for (int i = 1; i < 239; i += 2) {
            c.X(jArr, jArr3);
            c.m0(jArr3, jArr);
            c.X(jArr, jArr3);
            c.m0(jArr3, jArr);
            jArr[0] = jArr[0] ^ jArr2[0];
            jArr[1] = jArr[1] ^ jArr2[1];
            jArr[2] = jArr[2] ^ jArr2[2];
            jArr[3] = jArr[3] ^ jArr2[3];
        }
        return new i2(jArr);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f539f;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 17)) ^ (jArr[2] >>> 34))) & 1;
    }
}
