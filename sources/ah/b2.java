package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import y.c;

public final class b2 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f482f;

    public b2() {
        this.f482f = new long[4];
    }

    public b2(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f482f = b.q0(233, bigInteger);
    }

    public b2(long[] jArr) {
        this.f482f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f482f;
        long[] jArr2 = ((b2) eVar).f482f;
        return new b2(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public final e b() {
        long[] jArr = this.f482f;
        return new b2(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 233;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        return b.k0(this.f482f, ((b2) obj).f482f);
    }

    public final e f() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f482f;
        if (!b.c1(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            c.g0(jArr2, jArr3);
            c.T(jArr3, jArr2, jArr3);
            c.g0(jArr3, jArr3);
            c.T(jArr3, jArr2, jArr3);
            c.j0(jArr3, 3, jArr4);
            c.T(jArr4, jArr3, jArr4);
            c.g0(jArr4, jArr4);
            c.T(jArr4, jArr2, jArr4);
            c.j0(jArr4, 7, jArr3);
            c.T(jArr3, jArr4, jArr3);
            c.j0(jArr3, 14, jArr4);
            c.T(jArr4, jArr3, jArr4);
            c.g0(jArr4, jArr4);
            c.T(jArr4, jArr2, jArr4);
            c.j0(jArr4, 29, jArr3);
            c.T(jArr3, jArr4, jArr3);
            c.j0(jArr3, 58, jArr4);
            c.T(jArr4, jArr3, jArr4);
            c.j0(jArr4, 116, jArr3);
            c.T(jArr3, jArr4, jArr3);
            c.g0(jArr3, jArr);
            return new b2(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        return b.T0(this.f482f);
    }

    public final boolean h() {
        return b.c1(this.f482f);
    }

    public final int hashCode() {
        return a.h(this.f482f, 4) ^ 2330074;
    }

    public final e i(e eVar) {
        long[] jArr = new long[4];
        c.T(this.f482f, ((b2) eVar).f482f, jArr);
        return new b2(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f482f;
        long[] jArr2 = ((b2) eVar).f482f;
        long[] jArr3 = ((b2) eVar2).f482f;
        long[] jArr4 = ((b2) eVar3).f482f;
        long[] jArr5 = new long[8];
        c.V(jArr, jArr2, jArr5);
        c.V(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        c.b0(jArr5, jArr6);
        return new b2(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f482f;
        int i = 0;
        long d02 = e6.e.d0(jArr2[0]);
        long d03 = e6.e.d0(jArr2[1]);
        long j10 = (d02 & 4294967295L) | (d03 << 32);
        long j11 = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr2[2]);
        int i10 = 3;
        long d05 = e6.e.d0(jArr2[3]);
        long j12 = (4294967295L & d04) | (d05 << 32);
        long j13 = (d04 >>> 32) | (d05 & -4294967296L);
        long j14 = j13 >>> 27;
        long j15 = j13 ^ ((j11 >>> 27) | (j13 << 37));
        long j16 = j11 ^ (j11 << 37);
        long[] jArr3 = new long[8];
        int[] iArr = {32, 117, 191};
        while (i < i10) {
            int i11 = iArr[i] >>> 6;
            int i12 = iArr[i] & 63;
            jArr3[i11] = jArr3[i11] ^ (j16 << i12);
            int i13 = i11 + 1;
            int i14 = -i12;
            jArr3[i13] = jArr3[i13] ^ ((j15 << i12) | (j16 >>> i14));
            int i15 = i11 + 2;
            jArr3[i15] = jArr3[i15] ^ ((j14 << i12) | (j15 >>> i14));
            i10 = 3;
            int i16 = i11 + 3;
            jArr3[i16] = jArr3[i16] ^ (j14 >>> i14);
            i++;
        }
        c.b0(jArr3, jArr);
        jArr[0] = jArr[0] ^ j10;
        jArr[1] = jArr[1] ^ j12;
        return new b2(jArr);
    }

    public final e m() {
        long[] jArr = new long[4];
        c.g0(this.f482f, jArr);
        return new b2(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f482f;
        long[] jArr2 = ((b2) eVar).f482f;
        long[] jArr3 = ((b2) eVar2).f482f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        c.L(jArr, jArr5);
        c.j(jArr4, jArr5, jArr4);
        c.V(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        c.b0(jArr4, jArr6);
        return new b2(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        c.j0(this.f482f, i, jArr);
        return new b2(jArr);
    }

    public final boolean p() {
        return (this.f482f[0] & 1) != 0;
    }

    public final BigInteger q() {
        return b.m2(this.f482f);
    }

    public final e r() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f482f;
        long[] jArr3 = new long[8];
        b.T(jArr2, jArr);
        for (int i = 1; i < 233; i += 2) {
            c.L(jArr, jArr3);
            c.b0(jArr3, jArr);
            c.L(jArr, jArr3);
            c.b0(jArr3, jArr);
            jArr[0] = jArr[0] ^ jArr2[0];
            jArr[1] = jArr[1] ^ jArr2[1];
            jArr[2] = jArr[2] ^ jArr2[2];
            jArr[3] = jArr[3] ^ jArr2[3];
        }
        return new b2(jArr);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f482f;
        return ((int) (jArr[0] ^ (jArr[2] >>> 31))) & 1;
    }
}
