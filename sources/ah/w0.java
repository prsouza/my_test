package ah;

import android.support.v4.media.b;
import java.math.BigInteger;
import xg.e;
import xh.a;
import y.c;

public final class w0 extends e.a {

    /* renamed from: f  reason: collision with root package name */
    public long[] f629f;

    public w0() {
        this.f629f = new long[2];
    }

    public w0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f629f = b.q0(113, bigInteger);
    }

    public w0(long[] jArr) {
        this.f629f = jArr;
    }

    public final e a(e eVar) {
        long[] jArr = this.f629f;
        long[] jArr2 = ((w0) eVar).f629f;
        return new w0(new long[]{jArr[0] ^ jArr2[0], jArr[1] ^ jArr2[1]});
    }

    public final e b() {
        long[] jArr = this.f629f;
        return new w0(new long[]{jArr[0] ^ 1, jArr[1]});
    }

    public final e c(e eVar) {
        return i(eVar.f());
    }

    public final int e() {
        return 113;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        long[] jArr = this.f629f;
        long[] jArr2 = ((w0) obj).f629f;
        for (int i = 1; i >= 0; i--) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public final e f() {
        long[] jArr = new long[2];
        long[] jArr2 = this.f629f;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= 2) {
                z = true;
                break;
            } else if (jArr2[i] != 0) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            long[] jArr3 = new long[2];
            long[] jArr4 = new long[2];
            c.f0(jArr2, jArr3);
            c.S(jArr3, jArr2, jArr3);
            c.f0(jArr3, jArr3);
            c.S(jArr3, jArr2, jArr3);
            c.i0(jArr3, 3, jArr4);
            c.S(jArr4, jArr3, jArr4);
            c.f0(jArr4, jArr4);
            c.S(jArr4, jArr2, jArr4);
            c.i0(jArr4, 7, jArr3);
            c.S(jArr3, jArr4, jArr3);
            c.i0(jArr3, 14, jArr4);
            c.S(jArr4, jArr3, jArr4);
            c.i0(jArr4, 28, jArr3);
            c.S(jArr3, jArr4, jArr3);
            c.i0(jArr3, 56, jArr4);
            c.S(jArr4, jArr3, jArr4);
            c.f0(jArr4, jArr);
            return new w0(jArr);
        }
        throw new IllegalStateException();
    }

    public final boolean g() {
        long[] jArr = this.f629f;
        if (jArr[0] != 1) {
            return false;
        }
        for (int i = 1; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        long[] jArr = this.f629f;
        for (int i = 0; i < 2; i++) {
            if (jArr[i] != 0) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return a.h(this.f629f, 2) ^ 113009;
    }

    public final e i(e eVar) {
        long[] jArr = new long[2];
        c.S(this.f629f, ((w0) eVar).f629f, jArr);
        return new w0(jArr);
    }

    public final e j(e eVar, e eVar2, e eVar3) {
        long[] jArr = this.f629f;
        long[] jArr2 = ((w0) eVar).f629f;
        long[] jArr3 = ((w0) eVar2).f629f;
        long[] jArr4 = ((w0) eVar3).f629f;
        long[] jArr5 = new long[4];
        c.U(jArr, jArr2, jArr5);
        c.U(jArr3, jArr4, jArr5);
        long[] jArr6 = new long[2];
        c.a0(jArr5, jArr6);
        return new w0(jArr6);
    }

    public final e k() {
        return this;
    }

    public final e l() {
        long[] jArr = this.f629f;
        long d02 = e6.e.d0(jArr[0]);
        long d03 = e6.e.d0(jArr[1]);
        long j10 = (d02 >>> 32) | (d03 & -4294967296L);
        return new w0(new long[]{((j10 << 57) ^ ((4294967295L & d02) | (d03 << 32))) ^ (j10 << 5), (j10 >>> 7) ^ (j10 >>> 59)});
    }

    public final e m() {
        long[] jArr = new long[2];
        c.f0(this.f629f, jArr);
        return new w0(jArr);
    }

    public final e n(e eVar, e eVar2) {
        long[] jArr = this.f629f;
        long[] jArr2 = ((w0) eVar).f629f;
        long[] jArr3 = ((w0) eVar2).f629f;
        long[] jArr4 = new long[4];
        long[] jArr5 = new long[4];
        c.K(jArr, jArr5);
        c.i(jArr4, jArr5, jArr4);
        c.U(jArr2, jArr3, jArr4);
        long[] jArr6 = new long[2];
        c.a0(jArr4, jArr6);
        return new w0(jArr6);
    }

    public final e o(int i) {
        if (i < 1) {
            return this;
        }
        long[] jArr = new long[2];
        c.i0(this.f629f, i, jArr);
        return new w0(jArr);
    }

    public final boolean p() {
        return (this.f629f[0] & 1) != 0;
    }

    public final BigInteger q() {
        long[] jArr = this.f629f;
        byte[] bArr = new byte[16];
        for (int i = 0; i < 2; i++) {
            long j10 = jArr[i];
            if (j10 != 0) {
                b.h1(j10, bArr, (1 - i) << 3);
            }
        }
        return new BigInteger(1, bArr);
    }

    public final e r() {
        long[] jArr = this.f629f;
        long[] jArr2 = new long[4];
        long[] jArr3 = {jArr[0], jArr[1]};
        for (int i = 1; i < 113; i += 2) {
            c.K(jArr3, jArr2);
            c.a0(jArr2, jArr3);
            c.K(jArr3, jArr2);
            c.a0(jArr2, jArr3);
            jArr3[0] = jArr3[0] ^ jArr[0];
            jArr3[1] = jArr3[1] ^ jArr[1];
        }
        return new w0(jArr3);
    }

    public final int t() {
        return ((int) this.f629f[0]) & 1;
    }
}
