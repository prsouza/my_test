package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;

public final class a3 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f477f;

    public a3() {
        this.f477f = new long[9];
    }

    public a3(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f477f = b.q0(571, bigInteger);
    }

    public a3(long[] jArr) {
        this.f477f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = new long[9];
        v.p(this.f477f, ((a3) eVar).f477f, jArr);
        return new a3(jArr);
    }

    public final e b() {
        long[] jArr = new long[9];
        v.u(this.f477f, jArr);
        return new a3(jArr);
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 571;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a3)) {
            return false;
        }
        long[] jArr = this.f477f;
        long[] jArr2 = ((a3) obj).f477f;
        for (int i = 8; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f477f;
        if (!b.d1(jArr2)) {
            long[] jArr3 = new long[9];
            long[] jArr4 = new long[9];
            long[] jArr5 = new long[9];
            v.s0(jArr2, jArr5);
            v.s0(jArr5, jArr3);
            v.s0(jArr3, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr3, 2, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.U(jArr3, jArr5, jArr3);
            v.w0(jArr3, 5, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr4, 5, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr3, 15, jArr4);
            v.U(jArr3, jArr4, jArr5);
            v.w0(jArr5, 30, jArr3);
            v.w0(jArr3, 30, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr3, 60, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr4, 60, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr3, 180, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.w0(jArr4, 180, jArr4);
            v.U(jArr3, jArr4, jArr3);
            v.U(jArr3, jArr5, jArr);
            return new a3(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        long[] jArr = this.f477f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 9; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        return b.d1(this.f477f);
    }

    public final int hashCode() {
        return a.h(this.f477f, 9) ^ 5711052;
    }

    public final e i(e eVar) {
        long[] jArr = new long[9];
        v.U(this.f477f, ((a3) eVar).f477f, jArr);
        return new a3(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f477f;
        long[] jArr2 = ((a3) eVar).f477f;
        long[] jArr3 = ((a3) eVar2).f477f;
        long[] jArr4 = ((a3) eVar3).f477f;
        long[] jArr5 = new long[18];
        v.X(jArr, jArr2, jArr5);
        v.X(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[9];
        v.h0(jArr5, jArr6);
        return new a3(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = new long[9];
        long[] jArr2 = this.f477f;
        long[] jArr3 = new long[9];
        long[] jArr4 = new long[9];
        int i = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i + 1;
            long d02 = e6.e.d0(jArr2[i]);
            i = i11 + 1;
            long d03 = e6.e.d0(jArr2[i11]);
            jArr3[i10] = (4294967295L & d02) | (d03 << 32);
            jArr4[i10] = (d02 >>> 32) | (-4294967296L & d03);
        }
        long d04 = e6.e.d0(jArr2[i]);
        jArr3[4] = 4294967295L & d04;
        jArr4[4] = d04 >>> 32;
        v.U(jArr4, v.f618u, jArr);
        v.p(jArr, jArr3, jArr);
        return new a3(jArr);
    }

    public final e m() {
        long[] jArr = new long[9];
        v.s0(this.f477f, jArr);
        return new a3(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f477f;
        long[] jArr2 = ((a3) eVar).f477f;
        long[] jArr3 = ((a3) eVar2).f477f;
        long[] jArr4 = new long[18];
        v.u0(jArr, jArr4);
        v.X(jArr2, jArr3, jArr4);
        long[] jArr5 = new long[9];
        v.h0(jArr4, jArr5);
        return new a3(jArr5);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[9];
        v.w0(this.f477f, i, jArr);
        return new a3(jArr);
    }

    public final boolean p() {
        return (this.f477f[0] & 1) != 0;
    }

    public final BigInteger q() {
        long[] jArr = this.f477f;
        byte[] bArr = new byte[72];
        for (int i = 0; i < 9; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                b.h1(j10, bArr, (8 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final e r() {
        long[] jArr = this.f477f;
        long[] jArr2 = new long[18];
        long[] jArr3 = {jArr[0], jArr[1], jArr[2], jArr[3], jArr[4], jArr[5], jArr[6], jArr[7], jArr[8]};
        for (int i = 1; i < 571; i += 2) {
            v.O(jArr3, jArr2);
            v.h0(jArr2, jArr3);
            v.O(jArr3, jArr2);
            v.h0(jArr2, jArr3);
            for (int i10 = 0; i10 < 9; i10++) {
                jArr3[i10] = jArr3[i10] ^ jArr[i10];
            }
        }
        return new a3(jArr3);
    }

    public final boolean s() {
        return true;
    }

    public final int t() {
        long[] jArr = this.f477f;
        return ((int) ((jArr[0] ^ (jArr[8] >>> 49)) ^ (jArr[8] >>> 57))) & 1;
    }
}
