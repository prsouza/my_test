package ah;

import ad.c;
import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class d1 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f497f;

    public d1() {
        this.f497f = new long[3];
    }

    public d1(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f497f = b.q0(131, bigInteger);
    }

    public d1(long[] jArr) {
        this.f497f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f497f;
        long[] jArr2 = ((d1) eVar).f497f;
        return new d1(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1], jArr[2] ^ jArr2[2]});
    }

    public final e b() {
        long[] jArr = this.f497f;
        return new d1(new long[]{jArr[0] ^ 1, jArr[1], jArr[2]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 131;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        long[] jArr = this.f497f;
        long[] jArr2 = ((d1) obj).f497f;
        for (int i = 2; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f497f;
        if (!b.b1(jArr2)) {
            long[] jArr3 = new long[3];
            long[] jArr4 = new long[3];
            c.t0(jArr2, jArr3);
            c.c0(jArr3, jArr2, jArr3);
            c.w0(jArr3, 2, jArr4);
            c.c0(jArr4, jArr3, jArr4);
            c.w0(jArr4, 4, jArr3);
            c.c0(jArr3, jArr4, jArr3);
            c.w0(jArr3, 8, jArr4);
            c.c0(jArr4, jArr3, jArr4);
            c.w0(jArr4, 16, jArr3);
            c.c0(jArr3, jArr4, jArr3);
            c.w0(jArr3, 32, jArr4);
            c.c0(jArr4, jArr3, jArr4);
            c.t0(jArr4, jArr4);
            c.c0(jArr4, jArr2, jArr4);
            c.w0(jArr4, 65, jArr3);
            c.c0(jArr3, jArr4, jArr3);
            c.t0(jArr3, jArr);
            return new d1(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        return b.S0(this.f497f);
    }

    public final boolean h() {
        return b.b1(this.f497f);
    }

    public final int hashCode() {
        return a.h(this.f497f, 3) ^ 131832;
    }

    public final e i(e eVar) {
        long[] jArr = new long[3];
        c.c0(this.f497f, ((d1) eVar).f497f, jArr);
        return new d1(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f497f;
        long[] jArr2 = ((d1) eVar).f497f;
        long[] jArr3 = ((d1) eVar2).f497f;
        long[] jArr4 = ((d1) eVar3).f497f;
        long[] jArr5 = new long[5];
        c.e0(jArr, jArr2, jArr5);
        c.e0(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[3];
        c.l0(jArr5, jArr6);
        return new d1(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[3];
        long[] jArr2 = this.f497f;
        long[] jArr3 = new long[3];
        long d02 = e6.e.d0(jArr2[0]);
        long d03 = e6.e.d0(jArr2[1]);
        jArr3[0] = (d02 >>> 32) | (d03 & -4294967296L);
        long d04 = e6.e.d0(jArr2[2]);
        long j10 = d04 & 4294967295L;
        jArr3[1] = d04 >>> 32;
        c.c0(jArr3, c.f306d, jArr);
        jArr[0] = jArr[0] ^ ((d02 & 4294967295L) | (d03 << 32));
        jArr[1] = jArr[1] ^ j10;
        return new d1(jArr);
    }

    public final e m() {
        long[] jArr = new long[3];
        c.t0(this.f497f, jArr);
        return new d1(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f497f;
        long[] jArr2 = ((d1) eVar).f497f;
        long[] jArr3 = ((d1) eVar2).f497f;
        long[] jArr4 = new long[5];
        long[] jArr5 = new long[5];
        c.W(jArr, jArr5);
        c.r(jArr4, jArr5, jArr4);
        c.e0(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[3];
        c.l0(jArr4, jArr6);
        return new d1(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[3];
        c.w0(this.f497f, i, jArr);
        return new d1(jArr);
    }

    public final boolean p() {
        return (this.f497f[0] & 1) != 0;
    }

    public final BigInteger q() {
        return b.l2(this.f497f);
    }

    public final e r() {
        long[] jArr = this.f497f;
        long[] jArr2 = new long[5];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2]};
        for (int i = 1; i < 131; i += 2) {
            c.W(jArr3, jArr2);
            c.l0(jArr2, jArr3);
            c.W(jArr3, jArr2);
            c.l0(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
            jArr3[2] = jArr3[2] ^ jArr[2];
        }
        return new d1(jArr3);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f497f;
        return ((int) ((jArr[0] ^ (jArr[1] >>> 59)) ^ (jArr[2] >>> 1))) & 1;
    }
}
