package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import l6.b1;
import xg.e;
import xh.a;

public final class u1 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f609f;

    public u1() {
        this.f609f = new long[4];
    }

    public u1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 193) {
            throw new IllegalArgumentException("x value invalid for SecT193FieldElement");
        }
        this.f609f = b.q0(193, bigInteger);
    }

    public u1(long[] jArr) {
        this.f609f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f609f;
        long[] jArr2 = ((u1) eVar).f609f;
        return new u1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2], jArr[3] ^ jArr2[3]});
    }

    public final e b() {
        long[] jArr = this.f609f;
        return new u1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2], jArr[3]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 193;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        return b.k0(this.f609f, ((u1) obj).f609f);
    }

    public final e f() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f609f;
        if (!b.c1(jArr2)) {
            long[] jArr3 = new long[4];
            long[] jArr4 = new long[4];
            long[] jArr5 = new long[8];
            b1.p(jArr2, jArr5);
            b1.u(jArr5, jArr3);
            b1.v(jArr3, 1, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr4, 1, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 3, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 6, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 12, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 24, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 48, jArr4);
            b1.s(jArr3, jArr4, jArr3);
            b1.v(jArr3, 96, jArr4);
            b1.s(jArr3, jArr4, jArr);
            return new u1(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        return b.T0(this.f609f);
    }

    public final boolean h() {
        return b.c1(this.f609f);
    }

    public final int hashCode() {
        return a.h(this.f609f, 4) ^ 1930015;
    }

    public final e i(e eVar) {
        long[] jArr = new long[4];
        b1.s(this.f609f, ((u1) eVar).f609f, jArr);
        return new u1(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f609f;
        long[] jArr2 = ((u1) eVar).f609f;
        long[] jArr3 = ((u1) eVar2).f609f;
        long[] jArr4 = ((u1) eVar3).f609f;
        long[] jArr5 = new long[8];
        b1.t(jArr, jArr2, jArr5);
        b1.t(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[4];
        b1.u(jArr5, jArr6);
        return new u1(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = this.f609f;
        long d02 = e6.e.d0(jArr[0]);
        long d03 = e6.e.d0(jArr[1]);
        long j10 = (d02 & 4294967295L) | (d03 << 32);
        long j11 = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr[2]);
        long j12 = d04 >>> 32;
        return new u1(new long[]{j10 ^ (j11 << 8), (((j12 << 8) ^ ((d04 & 4294967295L) ^ (jArr[3] << 32))) ^ (j11 >>> 56)) ^ (j11 << 33), ((j12 >>> 56) ^ (j12 << 33)) ^ (j11 >>> 31), j12 >>> 31});
    }

    public final e m() {
        long[] jArr = new long[4];
        long[] jArr2 = new long[8];
        b1.p(this.f609f, jArr2);
        b1.u(jArr2, jArr);
        return new u1(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f609f;
        long[] jArr2 = ((u1) eVar).f609f;
        long[] jArr3 = ((u1) eVar2).f609f;
        long[] jArr4 = new long[8];
        long[] jArr5 = new long[8];
        b1.p(jArr, jArr5);
        b1.j(jArr4, jArr5, jArr4);
        b1.t(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[4];
        b1.u(jArr4, jArr6);
        return new u1(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[4];
        b1.v(this.f609f, i, jArr);
        return new u1(jArr);
    }

    public final boolean p() {
        return (this.f609f[0] & 1) != 0;
    }

    public final BigInteger q() {
        return b.m2(this.f609f);
    }

    public final e r() {
        long[] jArr = new long[4];
        long[] jArr2 = this.f609f;
        long[] jArr3 = new long[8];
        b.T(jArr2, jArr);
        for (int i = 1; i < 193; i += 2) {
            b1.p(jArr, jArr3);
            b1.u(jArr3, jArr);
            b1.p(jArr, jArr3);
            b1.u(jArr3, jArr);
            jArr[0] = jArr[0] ^ jArr2[0];
            jArr[1] = jArr[1] ^ jArr2[1];
            jArr[2] = jArr[2] ^ jArr2[2];
            jArr[3] = jArr[3] ^ jArr2[3];
        }
        return new u1(jArr);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        return ((int) this.f609f[0]) & 1;
    }
}
