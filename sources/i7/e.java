package i7;

import com.github.mikephil.charting.BuildConfig;
import i7.z;
import java.io.IOException;
import java.util.Objects;

public final class e {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f6252a;

        /* renamed from: b  reason: collision with root package name */
        public long f6253b;

        /* renamed from: c  reason: collision with root package name */
        public Object f6254c;

        /* renamed from: d  reason: collision with root package name */
        public final p f6255d;

        public a(p pVar) {
            Objects.requireNonNull(pVar);
            this.f6255d = pVar;
        }
    }

    public static int a(byte[] bArr, int i, a aVar) throws a0 {
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a;
        if (i10 < 0) {
            throw a0.f();
        } else if (i10 > bArr.length - t10) {
            throw a0.h();
        } else if (i10 == 0) {
            aVar.f6254c = i.f6271b;
            return t10;
        } else {
            aVar.f6254c = i.e(bArr, t10, i10);
            return t10 + i10;
        }
    }

    public static int b(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int d(f1 f1Var, byte[] bArr, int i, int i10, int i11, a aVar) throws IOException {
        t0 t0Var = (t0) f1Var;
        Object i12 = t0Var.i();
        int J = t0Var.J(i12, bArr, i, i10, i11, aVar);
        t0Var.e(i12);
        aVar.f6254c = i12;
        return J;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int e(i7.f1 r6, byte[] r7, int r8, int r9, i7.e.a r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000c
            int r0 = s(r8, r7, r0, r10)
            int r8 = r10.f6252a
        L_0x000c:
            r3 = r0
            if (r8 < 0) goto L_0x0025
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0025
            java.lang.Object r9 = r6.i()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.c(r1, r2, r3, r4, r5)
            r6.e(r9)
            r10.f6254c = r9
            return r8
        L_0x0025:
            i7.a0 r6 = i7.a0.h()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.e.e(i7.f1, byte[], int, int, i7.e$a):int");
    }

    public static int f(f1<?> f1Var, int i, byte[] bArr, int i10, int i11, z.d<?> dVar, a aVar) throws IOException {
        int e10 = e(f1Var, bArr, i10, i11, aVar);
        dVar.add(aVar.f6254c);
        while (e10 < i11) {
            int t10 = t(bArr, e10, aVar);
            if (i != aVar.f6252a) {
                break;
            }
            e10 = e(f1Var, bArr, t10, i11, aVar);
            dVar.add(aVar.f6254c);
        }
        return e10;
    }

    public static int g(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        f fVar = (f) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            t10 = v(bArr, t10, aVar);
            fVar.d(aVar.f6253b != 0);
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int h(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        n nVar = (n) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            nVar.d(Double.longBitsToDouble(c(bArr, t10)));
            t10 += 8;
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int i(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        y yVar = (y) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            yVar.d(b(bArr, t10));
            t10 += 4;
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int j(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        h0 h0Var = (h0) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            h0Var.d(c(bArr, t10));
            t10 += 8;
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int k(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        v vVar = (v) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            vVar.d(Float.intBitsToFloat(b(bArr, t10)));
            t10 += 4;
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int l(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        y yVar = (y) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            t10 = t(bArr, t10, aVar);
            yVar.d(j.b(aVar.f6252a));
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int m(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        h0 h0Var = (h0) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            t10 = v(bArr, t10, aVar);
            h0Var.d(j.c(aVar.f6253b));
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int n(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        y yVar = (y) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            t10 = t(bArr, t10, aVar);
            yVar.d(aVar.f6252a);
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int o(byte[] bArr, int i, z.d<?> dVar, a aVar) throws IOException {
        h0 h0Var = (h0) dVar;
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a + t10;
        while (t10 < i10) {
            t10 = v(bArr, t10, aVar);
            h0Var.d(aVar.f6253b);
        }
        if (t10 == i10) {
            return t10;
        }
        throw a0.h();
    }

    public static int p(byte[] bArr, int i, a aVar) throws a0 {
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a;
        if (i10 < 0) {
            throw a0.f();
        } else if (i10 == 0) {
            aVar.f6254c = BuildConfig.FLAVOR;
            return t10;
        } else {
            aVar.f6254c = new String(bArr, t10, i10, z.f6396a);
            return t10 + i10;
        }
    }

    public static int q(byte[] bArr, int i, a aVar) throws a0 {
        int t10 = t(bArr, i, aVar);
        int i10 = aVar.f6252a;
        if (i10 < 0) {
            throw a0.f();
        } else if (i10 == 0) {
            aVar.f6254c = BuildConfig.FLAVOR;
            return t10;
        } else {
            aVar.f6254c = q1.f6351a.a(bArr, t10, i10);
            return t10 + i10;
        }
    }

    public static int r(int i, byte[] bArr, int i10, int i11, m1 m1Var, a aVar) throws a0 {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 == 0) {
                int v10 = v(bArr, i10, aVar);
                m1Var.b(i, Long.valueOf(aVar.f6253b));
                return v10;
            } else if (i12 == 1) {
                m1Var.b(i, Long.valueOf(c(bArr, i10)));
                return i10 + 8;
            } else if (i12 == 2) {
                int t10 = t(bArr, i10, aVar);
                int i13 = aVar.f6252a;
                if (i13 < 0) {
                    throw a0.f();
                } else if (i13 <= bArr.length - t10) {
                    if (i13 == 0) {
                        m1Var.b(i, i.f6271b);
                    } else {
                        m1Var.b(i, i.e(bArr, t10, i13));
                    }
                    return t10 + i13;
                } else {
                    throw a0.h();
                }
            } else if (i12 == 3) {
                m1 m1Var2 = new m1();
                int i14 = (i & -8) | 4;
                int i15 = 0;
                while (true) {
                    if (i10 >= i11) {
                        break;
                    }
                    int t11 = t(bArr, i10, aVar);
                    int i16 = aVar.f6252a;
                    if (i16 == i14) {
                        i15 = i16;
                        i10 = t11;
                        break;
                    }
                    i15 = i16;
                    i10 = r(i16, bArr, t11, i11, m1Var2, aVar);
                }
                if (i10 > i11 || i15 != i14) {
                    throw a0.g();
                }
                m1Var.b(i, m1Var2);
                return i10;
            } else if (i12 == 5) {
                m1Var.b(i, Integer.valueOf(b(bArr, i10)));
                return i10 + 4;
            } else {
                throw a0.b();
            }
        } else {
            throw a0.b();
        }
    }

    public static int s(int i, byte[] bArr, int i10, a aVar) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            aVar.f6252a = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & Byte.MAX_VALUE) << 7);
        int i14 = i12 + 1;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            aVar.f6252a = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & Byte.MAX_VALUE) << 14);
        int i16 = i14 + 1;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            aVar.f6252a = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & Byte.MAX_VALUE) << 21);
        int i18 = i16 + 1;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            aVar.f6252a = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] < 0) {
                i18 = i20;
            } else {
                aVar.f6252a = i19;
                return i20;
            }
        }
    }

    public static int t(byte[] bArr, int i, a aVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return s(b10, bArr, i10, aVar);
        }
        aVar.f6252a = b10;
        return i10;
    }

    public static int u(int i, byte[] bArr, int i10, int i11, z.d<?> dVar, a aVar) {
        y yVar = (y) dVar;
        int t10 = t(bArr, i10, aVar);
        yVar.d(aVar.f6252a);
        while (t10 < i11) {
            int t11 = t(bArr, t10, aVar);
            if (i != aVar.f6252a) {
                break;
            }
            t10 = t(bArr, t11, aVar);
            yVar.d(aVar.f6252a);
        }
        return t10;
    }

    public static int v(byte[] bArr, int i, a aVar) {
        int i10 = i + 1;
        long j10 = (long) bArr[i];
        if (j10 >= 0) {
            aVar.f6253b = j10;
            return i10;
        }
        int i11 = i10 + 1;
        byte b10 = bArr[i10];
        long j11 = (j10 & 127) | (((long) (b10 & Byte.MAX_VALUE)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j11 |= ((long) (b11 & Byte.MAX_VALUE)) << i12;
            int i14 = i13;
            b10 = b11;
            i11 = i14;
        }
        aVar.f6253b = j11;
        return i11;
    }

    public static int w(int i, byte[] bArr, int i10, int i11, a aVar) throws a0 {
        if ((i >>> 3) != 0) {
            int i12 = i & 7;
            if (i12 == 0) {
                return v(bArr, i10, aVar);
            }
            if (i12 == 1) {
                return i10 + 8;
            }
            if (i12 == 2) {
                return t(bArr, i10, aVar) + aVar.f6252a;
            }
            if (i12 == 3) {
                int i13 = (i & -8) | 4;
                int i14 = 0;
                while (i10 < i11) {
                    i10 = t(bArr, i10, aVar);
                    i14 = aVar.f6252a;
                    if (i14 == i13) {
                        break;
                    }
                    i10 = w(i14, bArr, i10, i11, aVar);
                }
                if (i10 <= i11 && i14 == i13) {
                    return i10;
                }
                throw a0.g();
            } else if (i12 == 5) {
                return i10 + 4;
            } else {
                throw a0.b();
            }
        } else {
            throw a0.b();
        }
    }
}
