package i7;

import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import i7.i;
import java.io.IOException;
import java.util.Arrays;

public abstract class j {

    /* renamed from: a  reason: collision with root package name */
    public int f6302a;

    /* renamed from: b  reason: collision with root package name */
    public int f6303b = 100;

    /* renamed from: c  reason: collision with root package name */
    public k f6304c;

    public static final class a extends j {

        /* renamed from: d  reason: collision with root package name */
        public final byte[] f6305d;

        /* renamed from: e  reason: collision with root package name */
        public final boolean f6306e;

        /* renamed from: f  reason: collision with root package name */
        public int f6307f;
        public int g;

        /* renamed from: h  reason: collision with root package name */
        public int f6308h;
        public int i;

        /* renamed from: j  reason: collision with root package name */
        public int f6309j;

        /* renamed from: k  reason: collision with root package name */
        public int f6310k = Api.BaseClientBuilder.API_PRIORITY_OTHER;

        public a(byte[] bArr, int i10, int i11, boolean z) {
            this.f6305d = bArr;
            this.f6307f = i11 + i10;
            this.f6308h = i10;
            this.i = i10;
            this.f6306e = z;
        }

        public final boolean A(int i10) throws IOException {
            int x10;
            int i11 = i10 & 7;
            int i12 = 0;
            if (i11 == 0) {
                if (this.f6307f - this.f6308h >= 10) {
                    while (i12 < 10) {
                        byte[] bArr = this.f6305d;
                        int i13 = this.f6308h;
                        this.f6308h = i13 + 1;
                        if (bArr[i13] < 0) {
                            i12++;
                        }
                    }
                    throw a0.e();
                }
                while (i12 < 10) {
                    int i14 = this.f6308h;
                    if (i14 != this.f6307f) {
                        byte[] bArr2 = this.f6305d;
                        this.f6308h = i14 + 1;
                        if (bArr2[i14] < 0) {
                            i12++;
                        }
                    } else {
                        throw a0.h();
                    }
                }
                throw a0.e();
                return true;
            } else if (i11 == 1) {
                H(8);
                return true;
            } else if (i11 == 2) {
                H(D());
                return true;
            } else if (i11 == 3) {
                do {
                    x10 = x();
                    if (x10 == 0 || !A(x10)) {
                        a(((i10 >>> 3) << 3) | 4);
                    }
                    x10 = x();
                    break;
                } while (!A(x10));
                a(((i10 >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    H(4);
                    return true;
                }
                throw a0.d();
            }
        }

        public final int B() throws IOException {
            int i10 = this.f6308h;
            if (this.f6307f - i10 >= 4) {
                byte[] bArr = this.f6305d;
                this.f6308h = i10 + 4;
                return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
            }
            throw a0.h();
        }

        public final long C() throws IOException {
            int i10 = this.f6308h;
            if (this.f6307f - i10 >= 8) {
                byte[] bArr = this.f6305d;
                this.f6308h = i10 + 8;
                return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
            }
            throw a0.h();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
            if (r2[r3] < 0) goto L_0x006a;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int D() throws java.io.IOException {
            /*
                r5 = this;
                int r0 = r5.f6308h
                int r1 = r5.f6307f
                if (r1 != r0) goto L_0x0007
                goto L_0x006a
            L_0x0007:
                byte[] r2 = r5.f6305d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0012
                r5.f6308h = r3
                return r0
            L_0x0012:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x0018
                goto L_0x006a
            L_0x0018:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0024
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
                goto L_0x0070
            L_0x0024:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x0031
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L_0x002f:
                r1 = r3
                goto L_0x0070
            L_0x0031:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x003f
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0070
            L_0x003f:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r4 = r1 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r3 = r2[r3]
                if (r3 >= 0) goto L_0x0070
                int r3 = r1 + 1
                byte r1 = r2[r1]
                if (r1 >= 0) goto L_0x002f
                int r1 = r3 + 1
                byte r2 = r2[r3]
                if (r2 >= 0) goto L_0x0070
            L_0x006a:
                long r0 = r5.F()
                int r0 = (int) r0
                return r0
            L_0x0070:
                r5.f6308h = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.j.a.D():int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
            if (((long) r2[r0]) < 0) goto L_0x00b6;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final long E() throws java.io.IOException {
            /*
                r11 = this;
                int r0 = r11.f6308h
                int r1 = r11.f6307f
                if (r1 != r0) goto L_0x0008
                goto L_0x00b6
            L_0x0008:
                byte[] r2 = r11.f6305d
                int r3 = r0 + 1
                byte r0 = r2[r0]
                if (r0 < 0) goto L_0x0014
                r11.f6308h = r3
                long r0 = (long) r0
                return r0
            L_0x0014:
                int r1 = r1 - r3
                r4 = 9
                if (r1 >= r4) goto L_0x001b
                goto L_0x00b6
            L_0x001b:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 7
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0029
                r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            L_0x0026:
                long r2 = (long) r0
                goto L_0x00bd
            L_0x0029:
                int r3 = r1 + 1
                byte r1 = r2[r1]
                int r1 = r1 << 14
                r0 = r0 ^ r1
                if (r0 < 0) goto L_0x003a
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
                long r0 = (long) r0
                r9 = r0
                r1 = r3
                r2 = r9
                goto L_0x00bd
            L_0x003a:
                int r1 = r3 + 1
                byte r3 = r2[r3]
                int r3 = r3 << 21
                r0 = r0 ^ r3
                if (r0 >= 0) goto L_0x0048
                r2 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r2
                goto L_0x0026
            L_0x0048:
                long r3 = (long) r0
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r5 = (long) r1
                r1 = 28
                long r5 = r5 << r1
                long r3 = r3 ^ r5
                r5 = 0
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x005f
                r1 = 266354560(0xfe03f80, double:1.315966377E-315)
            L_0x005b:
                long r2 = r3 ^ r1
                r1 = r0
                goto L_0x00bd
            L_0x005f:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 35
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x0074
                r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
            L_0x0071:
                long r2 = r3 ^ r5
                goto L_0x00bd
            L_0x0074:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 42
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 < 0) goto L_0x0087
                r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
                goto L_0x005b
            L_0x0087:
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                r0 = 49
                long r7 = r7 << r0
                long r3 = r3 ^ r7
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x009a
                r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
                goto L_0x0071
            L_0x009a:
                int r0 = r1 + 1
                byte r1 = r2[r1]
                long r7 = (long) r1
                r1 = 56
                long r7 = r7 << r1
                long r3 = r3 ^ r7
                r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
                long r3 = r3 ^ r7
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 >= 0) goto L_0x00bb
                int r1 = r0 + 1
                byte r0 = r2[r0]
                long r7 = (long) r0
                int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r0 >= 0) goto L_0x00bc
            L_0x00b6:
                long r0 = r11.F()
                return r0
            L_0x00bb:
                r1 = r0
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                r11.f6308h = r1
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.j.a.E():long");
        }

        public final long F() throws IOException {
            long j10 = 0;
            int i10 = 0;
            while (i10 < 64) {
                int i11 = this.f6308h;
                if (i11 != this.f6307f) {
                    byte[] bArr = this.f6305d;
                    this.f6308h = i11 + 1;
                    byte b10 = bArr[i11];
                    j10 |= ((long) (b10 & Byte.MAX_VALUE)) << i10;
                    if ((b10 & 128) == 0) {
                        return j10;
                    }
                    i10 += 7;
                } else {
                    throw a0.h();
                }
            }
            throw a0.e();
        }

        public final void G() {
            int i10 = this.f6307f + this.g;
            this.f6307f = i10;
            int i11 = i10 - this.i;
            int i12 = this.f6310k;
            if (i11 > i12) {
                int i13 = i11 - i12;
                this.g = i13;
                this.f6307f = i10 - i13;
                return;
            }
            this.g = 0;
        }

        public final void H(int i10) throws IOException {
            if (i10 >= 0) {
                int i11 = this.f6307f;
                int i12 = this.f6308h;
                if (i10 <= i11 - i12) {
                    this.f6308h = i12 + i10;
                    return;
                }
            }
            if (i10 < 0) {
                throw a0.f();
            }
            throw a0.h();
        }

        public final void a(int i10) throws a0 {
            if (this.f6309j != i10) {
                throw a0.a();
            }
        }

        public final int d() {
            return this.f6308h - this.i;
        }

        public final boolean e() throws IOException {
            return this.f6308h == this.f6307f;
        }

        public final void g(int i10) {
            this.f6310k = i10;
            G();
        }

        public final int h(int i10) throws a0 {
            if (i10 >= 0) {
                int i11 = (this.f6308h - this.i) + i10;
                int i12 = this.f6310k;
                if (i11 <= i12) {
                    this.f6310k = i11;
                    G();
                    return i12;
                }
                throw a0.h();
            }
            throw a0.f();
        }

        public final boolean i() throws IOException {
            return E() != 0;
        }

        public final i j() throws IOException {
            byte[] bArr;
            int D = D();
            if (D > 0) {
                int i10 = this.f6307f;
                int i11 = this.f6308h;
                if (D <= i10 - i11) {
                    i e10 = i.e(this.f6305d, i11, D);
                    this.f6308h += D;
                    return e10;
                }
            }
            if (D == 0) {
                return i.f6271b;
            }
            if (D > 0) {
                int i12 = this.f6307f;
                int i13 = this.f6308h;
                if (D <= i12 - i13) {
                    int i14 = D + i13;
                    this.f6308h = i14;
                    bArr = Arrays.copyOfRange(this.f6305d, i13, i14);
                    i.f fVar = i.f6271b;
                    return new i.f(bArr);
                }
            }
            if (D > 0) {
                throw a0.h();
            } else if (D == 0) {
                bArr = z.f6397b;
                i.f fVar2 = i.f6271b;
                return new i.f(bArr);
            } else {
                throw a0.f();
            }
        }

        public final double k() throws IOException {
            return Double.longBitsToDouble(C());
        }

        public final int l() throws IOException {
            return D();
        }

        public final int m() throws IOException {
            return B();
        }

        public final long n() throws IOException {
            return C();
        }

        public final float o() throws IOException {
            return Float.intBitsToFloat(B());
        }

        public final int p() throws IOException {
            return D();
        }

        public final long q() throws IOException {
            return E();
        }

        public final int r() throws IOException {
            return B();
        }

        public final long s() throws IOException {
            return C();
        }

        public final int t() throws IOException {
            return j.b(D());
        }

        public final long u() throws IOException {
            return j.c(E());
        }

        public final String v() throws IOException {
            int D = D();
            if (D > 0) {
                int i10 = this.f6307f;
                int i11 = this.f6308h;
                if (D <= i10 - i11) {
                    String str = new String(this.f6305d, i11, D, z.f6396a);
                    this.f6308h += D;
                    return str;
                }
            }
            if (D == 0) {
                return BuildConfig.FLAVOR;
            }
            if (D < 0) {
                throw a0.f();
            }
            throw a0.h();
        }

        public final String w() throws IOException {
            int D = D();
            if (D > 0) {
                int i10 = this.f6307f;
                int i11 = this.f6308h;
                if (D <= i10 - i11) {
                    String a10 = q1.f6351a.a(this.f6305d, i11, D);
                    this.f6308h += D;
                    return a10;
                }
            }
            if (D == 0) {
                return BuildConfig.FLAVOR;
            }
            if (D <= 0) {
                throw a0.f();
            }
            throw a0.h();
        }

        public final int x() throws IOException {
            if (e()) {
                this.f6309j = 0;
                return 0;
            }
            int D = D();
            this.f6309j = D;
            if ((D >>> 3) != 0) {
                return D;
            }
            throw a0.b();
        }

        public final int y() throws IOException {
            return D();
        }

        public final long z() throws IOException {
            return E();
        }
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static j f(byte[] bArr, int i, int i10, boolean z) {
        a aVar = new a(bArr, i, i10, z);
        try {
            aVar.h(i10);
            return aVar;
        } catch (a0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public abstract boolean A(int i) throws IOException;

    public abstract void a(int i) throws a0;

    public abstract int d();

    public abstract boolean e() throws IOException;

    public abstract void g(int i);

    public abstract int h(int i) throws a0;

    public abstract boolean i() throws IOException;

    public abstract i j() throws IOException;

    public abstract double k() throws IOException;

    public abstract int l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract float o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    public abstract int t() throws IOException;

    public abstract long u() throws IOException;

    public abstract String v() throws IOException;

    public abstract String w() throws IOException;

    public abstract int x() throws IOException;

    public abstract int y() throws IOException;

    public abstract long z() throws IOException;
}
