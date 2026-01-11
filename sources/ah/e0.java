package ah;

import android.support.v4.media.b;
import c3.k;
import java.math.BigInteger;
import java.util.Random;
import xg.e;
import xh.a;
import yh.c;

public final class e0 extends e.b {
    public static final BigInteger g = new BigInteger(1, c.a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF000000000000000000000001"));

    /* renamed from: f  reason: collision with root package name */
    public int[] f503f;

    public e0() {
        this.f503f = new int[7];
    }

    public e0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(g) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224R1FieldElement");
        }
        int[] o02 = b.o0(bigInteger);
        if (o02[6] == -1) {
            int[] iArr = k.f3178s;
            if (b.C0(o02, iArr)) {
                long j10 = ((((long) o02[0]) & 4294967295L) - (((long) iArr[0]) & 4294967295L)) + 0;
                o02[0] = (int) j10;
                long j11 = ((((long) o02[1]) & 4294967295L) - (((long) iArr[1]) & 4294967295L)) + (j10 >> 32);
                o02[1] = (int) j11;
                long j12 = ((((long) o02[2]) & 4294967295L) - (((long) iArr[2]) & 4294967295L)) + (j11 >> 32);
                o02[2] = (int) j12;
                long j13 = ((((long) o02[3]) & 4294967295L) - (((long) iArr[3]) & 4294967295L)) + (j12 >> 32);
                o02[3] = (int) j13;
                long j14 = ((((long) o02[4]) & 4294967295L) - (((long) iArr[4]) & 4294967295L)) + (j13 >> 32);
                o02[4] = (int) j14;
                long j15 = ((((long) o02[5]) & 4294967295L) - (((long) iArr[5]) & 4294967295L)) + (j14 >> 32);
                o02[5] = (int) j15;
                o02[6] = (int) (((((long) o02[6]) & 4294967295L) - (((long) iArr[6]) & 4294967295L)) + (j15 >> 32));
            }
        }
        this.f503f = o02;
    }

    public e0(int[] iArr) {
        this.f503f = iArr;
    }

    public static void r(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        k.x0(iArr2, iArr, iArr2);
        k.a1(iArr2, iArr2);
        k.P0(iArr, iArr4);
        k.A(iArr3, iArr4, iArr);
        k.x0(iArr3, iArr4, iArr3);
        k.M0(b.G1(7, iArr3), iArr3);
    }

    public final e a(e eVar) {
        int[] iArr = new int[7];
        k.A(this.f503f, ((e0) eVar).f503f, iArr);
        return new e0(iArr);
    }

    public final e b() {
        int[] iArr = new int[7];
        k.D(this.f503f, iArr);
        return new e0(iArr);
    }

    public final e c(e eVar) {
        int[] iArr = new int[7];
        b.M0(k.f3178s, ((e0) eVar).f503f, iArr);
        k.x0(iArr, this.f503f, iArr);
        return new e0(iArr);
    }

    public final int e() {
        return g.bitLength();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return b.i0(this.f503f, ((e0) obj).f503f);
    }

    public final e f() {
        int[] iArr = new int[7];
        b.M0(k.f3178s, this.f503f, iArr);
        return new e0(iArr);
    }

    public final boolean g() {
        return b.Q0(this.f503f);
    }

    public final boolean h() {
        return b.Z0(this.f503f);
    }

    public final int hashCode() {
        return g.hashCode() ^ a.g(this.f503f, 7);
    }

    public final e i(e eVar) {
        int[] iArr = new int[7];
        k.x0(this.f503f, ((e0) eVar).f503f, iArr);
        return new e0(iArr);
    }

    public final e k() {
        int[] iArr = new int[7];
        k.C0(this.f503f, iArr);
        return new e0(iArr);
    }

    public final e l() {
        boolean z;
        int[] iArr = this.f503f;
        if (b.Z0(iArr) || b.Q0(iArr)) {
            return this;
        }
        int[] iArr2 = new int[7];
        k.C0(iArr, iArr2);
        int[] iArr3 = k.f3178s;
        Random random = new Random();
        int[] iArr4 = new int[7];
        int i = iArr3[6];
        int i10 = i | (i >>> 1);
        int i11 = i10 | (i10 >>> 2);
        int i12 = i11 | (i11 >>> 4);
        int i13 = i12 | (i12 >>> 8);
        int i14 = i13 | (i13 >>> 16);
        do {
            for (int i15 = 0; i15 != 7; i15++) {
                iArr4[i15] = random.nextInt();
            }
            iArr4[6] = iArr4[6] & i14;
        } while (b.y0(7, iArr4, iArr3));
        int[] iArr5 = new int[7];
        int[] iArr6 = new int[7];
        int[] iArr7 = new int[7];
        b.K(iArr, iArr6);
        for (int i16 = 0; i16 < 7; i16++) {
            b.K(iArr6, iArr7);
            int i17 = 1 << i16;
            int[] iArr8 = new int[14];
            do {
                b.O1(iArr6, iArr8);
                k.H0(iArr8, iArr6);
                i17--;
            } while (i17 > 0);
            k.x0(iArr6, iArr7, iArr6);
        }
        int i18 = 95;
        int[] iArr9 = new int[14];
        do {
            b.O1(iArr6, iArr9);
            k.H0(iArr9, iArr6);
            i18--;
        } while (i18 > 0);
        if (!b.Q0(iArr6)) {
            return null;
        }
        while (true) {
            int[] iArr10 = new int[7];
            b.K(iArr4, iArr10);
            int[] iArr11 = new int[7];
            iArr11[0] = 1;
            int[] iArr12 = new int[7];
            b.K(iArr2, iArr12);
            int[] iArr13 = new int[7];
            int[] iArr14 = new int[7];
            for (int i19 = 0; i19 < 7; i19++) {
                b.K(iArr10, iArr13);
                b.K(iArr11, iArr14);
                int i20 = 1 << i19;
                while (true) {
                    i20--;
                    if (i20 < 0) {
                        break;
                    }
                    r(iArr10, iArr11, iArr12, iArr5);
                }
                k.x0(iArr11, iArr14, iArr5);
                k.x0(iArr5, iArr2, iArr5);
                k.x0(iArr10, iArr13, iArr12);
                k.A(iArr12, iArr5, iArr12);
                k.x0(iArr10, iArr14, iArr5);
                b.K(iArr12, iArr10);
                k.x0(iArr11, iArr13, iArr11);
                k.A(iArr11, iArr5, iArr11);
                k.P0(iArr11, iArr12);
                k.x0(iArr12, iArr2, iArr12);
            }
            int[] iArr15 = new int[7];
            int[] iArr16 = new int[7];
            int i21 = 1;
            while (true) {
                if (i21 >= 96) {
                    z = false;
                    break;
                }
                b.K(iArr10, iArr15);
                b.K(iArr11, iArr16);
                r(iArr10, iArr11, iArr12, iArr5);
                if (b.Z0(iArr10)) {
                    b.M0(k.f3178s, iArr16, iArr5);
                    k.x0(iArr5, iArr15, iArr5);
                    z = true;
                    break;
                }
                i21++;
            }
            if (z) {
                break;
            }
            k.D(iArr4, iArr4);
        }
        k.P0(iArr5, iArr4);
        if (b.i0(iArr, iArr4)) {
            return new e0(iArr5);
        }
        return null;
    }

    public final e m() {
        int[] iArr = new int[7];
        k.P0(this.f503f, iArr);
        return new e0(iArr);
    }

    public final boolean p() {
        return (this.f503f[0] & 1) == 1;
    }

    public final BigInteger q() {
        return b.j2(this.f503f);
    }
}
