package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class k1 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f547f;

    public k1() {
        this.f547f = new long[3];
    }

    public k1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f547f = b.q0(163, bigInteger);
    }

    public k1(long[] jArr) {
        this.f547f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f547f;
        long[] jArr2 = ((k1) eVar).f547f;
        return new k1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    public final e b() {
        long[] jArr = this.f547f;
        return new k1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 163;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        long[] jArr = this.f547f;
        long[] jArr2 = ((k1) obj).f547f;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f547f;
        if (!b.b1(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            long[] jArr5 = new long[6];
            aa.b.O(jArr2, jArr5);
            aa.b.Y(jArr5, jArr3);
            aa.b.k0(jArr3, 1, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr4, 1, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr3, 3, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr4, 3, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr3, 9, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr4, 9, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr3, 27, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr4, 27, jArr4);
            aa.b.S(jArr3, jArr4, jArr3);
            aa.b.k0(jArr3, 81, jArr4);
            aa.b.S(jArr3, jArr4, jArr);
            return new k1(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        return b.S0(this.f547f);
    }

    public final boolean h() {
        return b.b1(this.f547f);
    }

    public final int hashCode() {
        return a.h(this.f547f, 3) ^ 163763;
    }

    public final e i(e eVar) {
        long[] jArr = new long[3];
        aa.b.S(this.f547f, ((k1) eVar).f547f, jArr);
        return new k1(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f547f;
        long[] jArr2 = ((k1) eVar).f547f;
        long[] jArr3 = ((k1) eVar2).f547f;
        long[] jArr4 = ((k1) eVar3).f547f;
        long[] jArr5 = new long[6];
        aa.b.V(jArr, jArr2, jArr5);
        aa.b.V(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        aa.b.Y(jArr5, jArr6);
        return new k1(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f547f;
        long[] jArr3 = new long[3];
        long d02 = e6.e.d0(jArr2[0]);
        long d03 = e6.e.d0(jArr2[1]);
        jArr3[0] = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr2[2]);
        long j10 = d04 & 4294967295L;
        jArr3[1] = d04 >>> 32;
        aa.b.S(jArr3, aa.b.f198y, jArr);
        jArr[0] = jArr[0] ^ ((d02 & 4294967295L) | (d03 << 32));
        jArr[1] = jArr[1] ^ j10;
        return new k1(jArr);
    }

    public final e m() {
        long[] jArr = new long[3];
        long[] jArr2 = new long[6];
        aa.b.O(this.f547f, jArr2);
        aa.b.Y(jArr2, jArr);
        return new k1(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f547f;
        long[] jArr2 = ((k1) eVar).f547f;
        long[] jArr3 = ((k1) eVar2).f547f;
        long[] jArr4 = new long[6];
        long[] jArr5 = new long[6];
        aa.b.O(jArr, jArr5);
        aa.b.m(jArr4, jArr5, jArr4);
        aa.b.V(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        aa.b.Y(jArr4, jArr6);
        return new k1(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        aa.b.k0(this.f547f, i, jArr);
        return new k1(jArr);
    }

    public final boolean p() {
        return (this.f547f[0] & 1) != 0;
    }

    public final BigInteger q() {
        return b.l2(this.f547f);
    }

    public final e r() {
        long[] jArr = this.f547f;
        long[] jArr2 = new long[6];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2]};
        for (int i = 1; i < 163; i += 2) {
            aa.b.O(jArr3, jArr2);
            aa.b.Y(jArr2, jArr3);
            aa.b.O(jArr3, jArr2);
            aa.b.Y(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
        }
        return new k1(jArr3);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f547f;
        return ((int) (jArr[0] ^ (jArr[2] >>> 29))) & 1;
    }
}
