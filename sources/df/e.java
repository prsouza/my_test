package df;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;

public final class e implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final b f4483a;

    /* renamed from: b  reason: collision with root package name */
    public final b f4484b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4485c;

    /* renamed from: s  reason: collision with root package name */
    public final d f4486s;

    /* renamed from: t  reason: collision with root package name */
    public final d f4487t;

    /* renamed from: u  reason: collision with root package name */
    public final d f4488u;

    /* renamed from: v  reason: collision with root package name */
    public final e[][] f4489v;

    /* renamed from: w  reason: collision with root package name */
    public final e[] f4490w;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f4491a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                df.e$b[] r0 = df.e.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f4491a = r0
                df.e$b r1 = df.e.b.P2     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f4491a     // Catch:{ NoSuchFieldError -> 0x001d }
                df.e$b r1 = df.e.b.P3     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f4491a     // Catch:{ NoSuchFieldError -> 0x0028 }
                df.e$b r1 = df.e.b.CACHED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f4491a     // Catch:{ NoSuchFieldError -> 0x0033 }
                df.e$b r1 = df.e.b.P3PrecomputedDouble     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f4491a     // Catch:{ NoSuchFieldError -> 0x003e }
                df.e$b r1 = df.e.b.P1P1     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f4491a     // Catch:{ NoSuchFieldError -> 0x0049 }
                df.e$b r1 = df.e.b.PRECOMP     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: df.e.a.<clinit>():void");
        }
    }

    public enum b {
        P2,
        P3,
        P3PrecomputedDouble,
        P1P1,
        PRECOMP,
        CACHED
    }

    public e(b bVar, b bVar2, d dVar, d dVar2, d dVar3, d dVar4) {
        this(bVar, bVar2, dVar, dVar2, dVar3, dVar4, false);
    }

    public static e f(b bVar, d dVar, d dVar2, d dVar3, d dVar4) {
        return new e(bVar, b.P1P1, dVar, dVar2, dVar3, dVar4);
    }

    public static e g(b bVar, d dVar, d dVar2, d dVar3) {
        return new e(bVar, b.P2, dVar, dVar2, dVar3, (d) null);
    }

    public static e h(b bVar, d dVar, d dVar2, d dVar3, d dVar4, boolean z) {
        return new e(bVar, b.P3, dVar, dVar2, dVar3, dVar4, z);
    }

    public static e i(b bVar, d dVar, d dVar2, d dVar3) {
        return new e(bVar, b.PRECOMP, dVar, dVar2, dVar3, (d) null);
    }

    public static byte[] m(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = (byte) (1 & (bArr[i10 >> 3] >> (i10 & 7)));
        }
        int i11 = 0;
        while (i11 < 256) {
            if (bArr2[i11] != 0) {
                int i12 = 1;
                while (i12 <= 6 && (i = i11 + i12) < 256) {
                    if (bArr2[i] != 0) {
                        if (bArr2[i11] + (bArr2[i] << i12) > 15) {
                            if (bArr2[i11] - (bArr2[i] << i12) < -15) {
                                break;
                            }
                            bArr2[i11] = (byte) (bArr2[i11] - (bArr2[i] << i12));
                            while (true) {
                                if (i >= 256) {
                                    break;
                                } else if (bArr2[i] == 0) {
                                    bArr2[i] = 1;
                                    break;
                                } else {
                                    bArr2[i] = 0;
                                    i++;
                                }
                            }
                        } else {
                            bArr2[i11] = (byte) (bArr2[i11] + (bArr2[i] << i12));
                            bArr2[i] = 0;
                        }
                    }
                    i12++;
                }
            }
            i11++;
        }
        return bArr2;
    }

    public final e a(e eVar) {
        if (this.f4484b != b.P3) {
            throw new UnsupportedOperationException();
        } else if (eVar.f4484b == b.CACHED) {
            d a10 = this.f4486s.a(this.f4485c);
            d g = this.f4486s.g(this.f4485c);
            d d10 = a10.d(eVar.f4485c);
            d d11 = g.d(eVar.f4486s);
            d d12 = eVar.f4488u.d(this.f4488u);
            d d13 = this.f4487t.d(eVar.f4487t);
            d a11 = d13.a(d13);
            return f(this.f4483a, d10.g(d11), d10.a(d11), a11.a(d12), a11.g(d12));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final e b(e eVar, int i) {
        return i(this.f4483a, this.f4485c.b(eVar.f4485c, i), this.f4486s.b(eVar.f4486s, i), this.f4487t.b(eVar.f4487t, i));
    }

    public final e c() {
        int i = a.f4491a[this.f4484b.ordinal()];
        if (i == 1 || i == 2) {
            d f10 = this.f4485c.f();
            d f11 = this.f4486s.f();
            ef.a aVar = (ef.a) this.f4487t;
            int[] iArr = aVar.f4831b;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            int i14 = iArr[4];
            int i15 = iArr[5];
            int i16 = iArr[6];
            int i17 = iArr[7];
            int i18 = iArr[8];
            int i19 = iArr[9];
            d dVar = f10;
            d dVar2 = f11;
            int i20 = i14 * 2;
            int i21 = i12 * 2;
            long j10 = (long) i10;
            long j11 = j10 * j10;
            long j12 = (long) (i10 * 2);
            long j13 = (long) i11;
            long j14 = j12 * j13;
            int i22 = i13 * 2;
            long j15 = (long) i12;
            long j16 = j12 * j15;
            long j17 = j15;
            long j18 = (long) i13;
            long j19 = j12 * j18;
            long j20 = j18;
            long j21 = (long) i14;
            long j22 = j12 * j21;
            long j23 = (long) i15;
            long j24 = j12 * j23;
            long j25 = (long) i16;
            long j26 = j12 * j25;
            long j27 = (long) i17;
            long j28 = j12 * j27;
            long j29 = j27;
            long j30 = (long) i18;
            long j31 = j12 * j30;
            long j32 = j23;
            long j33 = (long) i19;
            long j34 = (long) (i11 * 2);
            long j35 = j34 * j17;
            long j36 = (long) i22;
            long j37 = j34 * j36;
            long j38 = j34 * j21;
            long j39 = j12 * j33;
            long j40 = (long) (i15 * 2);
            long j41 = j34 * j40;
            long j42 = j34 * j25;
            long j43 = j13 * j34;
            long j44 = (long) (i17 * 2);
            long j45 = j34 * j44;
            long j46 = j34 * j30;
            long j47 = j33;
            long j48 = (long) (i19 * 38);
            long j49 = j17 * j17;
            long j50 = j34 * j48;
            long j51 = (long) i21;
            long j52 = j51 * j20;
            long j53 = j51 * j21;
            long j54 = j51 * j32;
            long j55 = j51 * j25;
            long j56 = j51 * j29;
            long j57 = j30;
            long j58 = (long) (i18 * 19);
            long j59 = j20 * j36;
            long j60 = j36 * j21;
            long j61 = j36 * j40;
            long j62 = j36 * j25;
            long j63 = j51 * j58;
            long j64 = (long) (i17 * 38);
            long j65 = j36 * j64;
            long j66 = j36 * j58;
            long j67 = j21 * j21;
            long j68 = j36 * j48;
            long j69 = (long) i20;
            long j70 = j69 * j32;
            long j71 = j44;
            long j72 = (long) (i16 * 19);
            long j73 = j69 * j72;
            long j74 = j21 * j64;
            long j75 = j69 * j58;
            long j76 = j21 * j48;
            long j77 = ((long) (i15 * 38)) * j32;
            long j78 = j40 * j72;
            long j79 = j40 * j64;
            long j80 = j40 * j58;
            long j81 = j72 * j25;
            long j82 = j25 * j64;
            long j83 = j40 * j48;
            long j84 = ((long) (i16 * 2)) * j58;
            long j85 = j64 * j29;
            long j86 = j71 * j58;
            long j87 = j58 * j57;
            long j88 = j11 + j50 + j63 + j65 + j73 + j77;
            long j89 = j14 + (j17 * j48) + j66 + j74 + j78;
            long j90 = j16 + j43 + j68 + j75 + j79 + j81;
            long j91 = j19 + j35 + j76 + j80 + j82;
            long j92 = j22 + j37 + j49 + j83 + j84 + j85;
            long j93 = j24 + j38 + j52 + (j25 * j48) + j86;
            long j94 = j26 + j41 + j53 + j59 + (j71 * j48) + j87;
            long j95 = j28 + j42 + j54 + j60 + (j57 * j48);
            long j96 = j31 + j45 + j55 + j61 + j67 + (j48 * j47);
            long j97 = j39 + j46 + j56 + j62 + j70;
            long j98 = j88 + j88;
            long j99 = j92 + j92;
            long j100 = (j98 + 33554432) >> 26;
            long j101 = j89 + j89 + j100;
            long j102 = j98 - (j100 << 26);
            long j103 = (j99 + 33554432) >> 26;
            long j104 = j93 + j93 + j103;
            long j105 = (j101 + 16777216) >> 25;
            long j106 = j90 + j90 + j105;
            long j107 = j101 - (j105 << 25);
            long j108 = (j104 + 16777216) >> 25;
            long j109 = j94 + j94 + j108;
            long j110 = j104 - (j108 << 25);
            long j111 = (j106 + 33554432) >> 26;
            long j112 = j91 + j91 + j111;
            long j113 = (j109 + 33554432) >> 26;
            long j114 = j95 + j95 + j113;
            long j115 = (j112 + 16777216) >> 25;
            long j116 = (j99 - (j103 << 26)) + j115;
            long j117 = (j114 + 16777216) >> 25;
            long j118 = j96 + j96 + j117;
            long j119 = (j116 + 33554432) >> 26;
            long j120 = j110 + j119;
            long j121 = j116 - (j119 << 26);
            long j122 = (j118 + 33554432) >> 26;
            long j123 = j97 + j97 + j122;
            long j124 = j118 - (j122 << 26);
            long j125 = (j123 + 16777216) >> 25;
            long j126 = (19 * j125) + j102;
            long j127 = (j126 + 33554432) >> 26;
            long j128 = j123 - (j125 << 25);
            int[] iArr2 = {(int) (j126 - (j127 << 26)), (int) (j107 + j127), (int) (j106 - (j111 << 26)), (int) (j112 - (j115 << 25)), (int) j121, (int) j120, (int) (j109 - (j113 << 26)), (int) (j114 - (j117 << 25)), (int) j124, (int) j128};
            c cVar = aVar.f4482a;
            if (cVar == null) {
                throw new IllegalArgumentException("field cannot be null");
            } else if (iArr2.length == 10) {
                d f12 = this.f4485c.a(this.f4486s).f();
                d dVar3 = dVar;
                d dVar4 = dVar2;
                d a10 = dVar4.a(dVar3);
                d g = dVar4.g(dVar3);
                b bVar = this.f4483a;
                d g8 = f12.g(a10);
                int[] iArr3 = ((ef.a) g).f4831b;
                int[] iArr4 = new int[10];
                for (int i23 = 0; i23 < 10; i23++) {
                    iArr4[i23] = iArr2[i23] - iArr3[i23];
                }
                return f(bVar, g8, a10, g, new ef.a(cVar, iArr4));
            } else {
                throw new IllegalArgumentException("Invalid radix-2^51 representation");
            }
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final e d(e eVar) {
        if (this.f4484b != b.P3) {
            throw new UnsupportedOperationException();
        } else if (eVar.f4484b == b.PRECOMP) {
            d a10 = this.f4486s.a(this.f4485c);
            d g = this.f4486s.g(this.f4485c);
            d d10 = a10.d(eVar.f4485c);
            d d11 = g.d(eVar.f4486s);
            d d12 = eVar.f4487t.d(this.f4488u);
            d dVar = this.f4487t;
            d a11 = dVar.a(dVar);
            return f(this.f4483a, d10.g(d11), d10.a(d11), a11.a(d12), a11.g(d12));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final e e(e eVar) {
        if (this.f4484b != b.P3) {
            throw new UnsupportedOperationException();
        } else if (eVar.f4484b == b.PRECOMP) {
            d a10 = this.f4486s.a(this.f4485c);
            d g = this.f4486s.g(this.f4485c);
            d d10 = a10.d(eVar.f4486s);
            d d11 = g.d(eVar.f4485c);
            d d12 = eVar.f4487t.d(this.f4488u);
            d dVar = this.f4487t;
            d a11 = dVar.a(dVar);
            return f(this.f4483a, d10.g(d11), d10.a(d11), a11.g(d12), a11.a(d12));
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f4484b.equals(eVar.f4484b)) {
            try {
                eVar = eVar.r(this.f4484b);
            } catch (RuntimeException unused) {
                return false;
            }
        }
        int i = a.f4491a[this.f4484b.ordinal()];
        if (i == 1 || i == 2) {
            if (!this.f4487t.equals(eVar.f4487t)) {
                d d10 = this.f4485c.d(eVar.f4487t);
                d d11 = this.f4486s.d(eVar.f4487t);
                d d12 = eVar.f4485c.d(this.f4487t);
                d d13 = eVar.f4486s.d(this.f4487t);
                if (!d10.equals(d12) || !d11.equals(d13)) {
                    return false;
                }
                return true;
            } else if (!this.f4485c.equals(eVar.f4485c) || !this.f4486s.equals(eVar.f4486s)) {
                return false;
            } else {
                return true;
            }
        } else if (i != 3) {
            if (i == 5) {
                return p().equals(eVar);
            }
            if (i != 6) {
                return false;
            }
            if (!this.f4485c.equals(eVar.f4485c) || !this.f4486s.equals(eVar.f4486s) || !this.f4487t.equals(eVar.f4487t)) {
                return false;
            }
            return true;
        } else if (!this.f4487t.equals(eVar.f4487t)) {
            d d14 = this.f4485c.d(eVar.f4487t);
            d d15 = this.f4486s.d(eVar.f4487t);
            d d16 = this.f4488u.d(eVar.f4487t);
            d d17 = eVar.f4485c.d(this.f4487t);
            d d18 = eVar.f4486s.d(this.f4487t);
            d d19 = eVar.f4488u.d(this.f4487t);
            if (!d14.equals(d17) || !d15.equals(d18) || !d16.equals(d19)) {
                return false;
            }
            return true;
        } else if (!this.f4485c.equals(eVar.f4485c) || !this.f4486s.equals(eVar.f4486s) || !this.f4488u.equals(eVar.f4488u)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(n());
    }

    public final e[] j() {
        e[] eVarArr = new e[8];
        e eVar = this;
        for (int i = 0; i < 8; i++) {
            d c10 = eVar.f4487t.c();
            d d10 = eVar.f4485c.d(c10);
            d d11 = eVar.f4486s.d(c10);
            eVarArr[i] = i(this.f4483a, d11.a(d10), d11.g(d10), d10.d(d11).d(this.f4483a.f4467c));
            eVar = a(a(eVar.o()).q().o()).q();
        }
        return eVarArr;
    }

    public final e k(byte[] bArr) {
        int i;
        byte[] bArr2 = new byte[64];
        int i10 = 0;
        while (true) {
            if (i10 >= 32) {
                break;
            }
            int i11 = i10 * 2;
            bArr2[i11 + 0] = (byte) (bArr[i10] & 15);
            bArr2[i11 + 1] = (byte) ((bArr[i10] >> 4) & 15);
            i10++;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < 63; i13++) {
            bArr2[i13] = (byte) (bArr2[i13] + i12);
            i12 = (bArr2[i13] + 8) >> 4;
            bArr2[i13] = (byte) (bArr2[i13] - (i12 << 4));
        }
        bArr2[63] = (byte) (bArr2[63] + i12);
        e a10 = this.f4483a.a(b.P3);
        for (i = 1; i < 64; i += 2) {
            a10 = a10.d(l(i / 2, bArr2[i])).q();
        }
        e q10 = a10.c().p().c().p().c().p().c().q();
        for (int i14 = 0; i14 < 64; i14 += 2) {
            q10 = q10.d(l(i14 / 2, bArr2[i14])).q();
        }
        return q10;
    }

    public final e l(int i, int i10) {
        int i11 = (i10 >> 8) & 1;
        int i12 = i10 - (((-i11) & i10) << 1);
        e b10 = this.f4483a.a(b.PRECOMP).b(this.f4489v[i][0], a.b.T(i12, 1)).b(this.f4489v[i][1], a.b.T(i12, 2)).b(this.f4489v[i][2], a.b.T(i12, 3)).b(this.f4489v[i][3], a.b.T(i12, 4)).b(this.f4489v[i][4], a.b.T(i12, 5)).b(this.f4489v[i][5], a.b.T(i12, 6)).b(this.f4489v[i][6], a.b.T(i12, 7)).b(this.f4489v[i][7], a.b.T(i12, 8));
        return b10.b(i(this.f4483a, b10.f4486s, b10.f4485c, b10.f4487t.e()), i11);
    }

    public final byte[] n() {
        int i = a.f4491a[this.f4484b.ordinal()];
        boolean z = true;
        if (i != 1 && i != 2) {
            return p().n();
        }
        d c10 = this.f4487t.c();
        d d10 = this.f4485c.d(c10);
        byte[] h10 = this.f4486s.d(c10).h();
        byte b10 = h10[31];
        byte b11 = 0;
        if ((d10.f4482a.f4481w.a(d10)[0] & 1) == 0) {
            z = false;
        }
        if (z) {
            b11 = Byte.MIN_VALUE;
        }
        h10[31] = (byte) (b10 | b11);
        return h10;
    }

    public final e o() {
        return r(b.CACHED);
    }

    public final e p() {
        return r(b.P2);
    }

    public final e q() {
        return r(b.P3);
    }

    public final e r(b bVar) {
        int[] iArr = a.f4491a;
        int i = iArr[this.f4484b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                int i10 = iArr[bVar.ordinal()];
                if (i10 == 1) {
                    return g(this.f4483a, this.f4485c, this.f4486s, this.f4487t);
                }
                if (i10 == 2) {
                    return h(this.f4483a, this.f4485c, this.f4486s, this.f4487t, this.f4488u, false);
                }
                if (i10 == 3) {
                    return new e(this.f4483a, b.CACHED, this.f4486s.a(this.f4485c), this.f4486s.g(this.f4485c), this.f4487t, this.f4488u.d(this.f4483a.f4467c));
                }
                throw new IllegalArgumentException();
            } else if (i != 3) {
                if (i == 5) {
                    int i11 = iArr[bVar.ordinal()];
                    if (i11 == 1) {
                        return g(this.f4483a, this.f4485c.d(this.f4488u), this.f4486s.d(this.f4487t), this.f4487t.d(this.f4488u));
                    }
                    if (i11 == 2) {
                        return h(this.f4483a, this.f4485c.d(this.f4488u), this.f4486s.d(this.f4487t), this.f4487t.d(this.f4488u), this.f4485c.d(this.f4486s), false);
                    }
                    if (i11 == 4) {
                        return h(this.f4483a, this.f4485c.d(this.f4488u), this.f4486s.d(this.f4487t), this.f4487t.d(this.f4488u), this.f4485c.d(this.f4486s), true);
                    }
                    if (i11 == 5) {
                        return f(this.f4483a, this.f4485c, this.f4486s, this.f4487t, this.f4488u);
                    }
                    throw new IllegalArgumentException();
                } else if (i != 6) {
                    throw new UnsupportedOperationException();
                } else if (iArr[bVar.ordinal()] == 6) {
                    return i(this.f4483a, this.f4485c, this.f4486s, this.f4487t);
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (iArr[bVar.ordinal()] == 3) {
                return new e(this.f4483a, b.CACHED, this.f4485c, this.f4486s, this.f4487t, this.f4488u);
            } else {
                throw new IllegalArgumentException();
            }
        } else if (iArr[bVar.ordinal()] == 1) {
            return g(this.f4483a, this.f4485c, this.f4486s, this.f4487t);
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("[GroupElement\nX=");
        d10.append(this.f4485c);
        d10.append("\nY=");
        d10.append(this.f4486s);
        d10.append("\nZ=");
        d10.append(this.f4487t);
        d10.append("\nT=");
        d10.append(this.f4488u);
        d10.append("\n]");
        return d10.toString();
    }

    public e(b bVar, b bVar2, d dVar, d dVar2, d dVar3, d dVar4, boolean z) {
        this.f4483a = bVar;
        this.f4484b = bVar2;
        this.f4485c = dVar;
        this.f4486s = dVar2;
        this.f4487t = dVar3;
        this.f4488u = dVar4;
        e[] eVarArr = null;
        this.f4489v = null;
        this.f4490w = z ? j() : eVarArr;
    }

    public e(b bVar, byte[] bArr, boolean z) {
        d a10 = bVar.f4465a.a(bArr);
        d f10 = a10.f();
        d g = f10.g(f10.f4482a.f4475b);
        d d10 = f10.d(bVar.f4466b);
        d a11 = d10.a(d10.f4482a.f4475b);
        d d11 = a11.f().d(a11);
        ef.a aVar = (ef.a) d11.f().d(a11).d(g);
        d f11 = aVar.f();
        d d12 = aVar.d(f11.f().f());
        d d13 = d12.d(f11.d(d12).f());
        d f12 = d13.f();
        for (int i = 1; i < 5; i++) {
            f12 = f12.f();
        }
        d d14 = f12.d(d13);
        d f13 = d14.f();
        for (int i10 = 1; i10 < 10; i10++) {
            f13 = f13.f();
        }
        d d15 = f13.d(d14);
        d f14 = d15.f();
        for (int i11 = 1; i11 < 20; i11++) {
            f14 = f14.f();
        }
        d f15 = f14.d(d15).f();
        for (int i12 = 1; i12 < 10; i12++) {
            f15 = f15.f();
        }
        d d16 = f15.d(d14);
        d f16 = d16.f();
        for (int i13 = 1; i13 < 50; i13++) {
            f16 = f16.f();
        }
        d d17 = f16.d(d16);
        d f17 = d17.f();
        for (int i14 = 1; i14 < 100; i14++) {
            f17 = f17.f();
        }
        d f18 = f17.d(d17).f();
        for (int i15 = 1; i15 < 50; i15++) {
            f18 = f18.f();
        }
        d d18 = d11.d(g).d(aVar.d(f18.d(d16).f().f()));
        d d19 = d18.f().d(a11);
        byte[] h10 = ((ef.a) d19.g(g)).h();
        byte[] bArr2 = ef.a.f4830c;
        if (a.b.U(h10, bArr2) == 0) {
            if (!(a.b.U(((ef.a) d19.a(g)).h(), bArr2) == 0)) {
                d18 = d18.d(bVar.f4468s);
            } else {
                throw new IllegalArgumentException("not a valid GroupElement");
            }
        }
        int i16 = (d18.f4482a.f4481w.a(d18)[0] & 1) != 0 ? 1 : 0;
        int i17 = bVar.f4465a.f4479u - 1;
        d18 = i16 != ((bArr[i17 >> 3] >> (i17 & 7)) & 1) ? d18.e() : d18;
        this.f4483a = bVar;
        this.f4484b = b.P3;
        this.f4485c = d18;
        this.f4486s = a10;
        this.f4487t = bVar.f4465a.f4475b;
        this.f4488u = d18.d(a10);
        if (z) {
            e[][] eVarArr = (e[][]) Array.newInstance(e.class, new int[]{32, 8});
            e eVar = this;
            for (int i18 = 0; i18 < 32; i18++) {
                e eVar2 = eVar;
                for (int i19 = 0; i19 < 8; i19++) {
                    d c10 = eVar2.f4487t.c();
                    d d20 = eVar2.f4485c.d(c10);
                    d d21 = eVar2.f4486s.d(c10);
                    eVarArr[i18][i19] = i(this.f4483a, d21.a(d20), d21.g(d20), d20.d(d21).d(this.f4483a.f4467c));
                    eVar2 = eVar2.a(eVar.o()).q();
                }
                for (int i20 = 0; i20 < 8; i20++) {
                    eVar = eVar.a(eVar.o()).q();
                }
            }
            this.f4489v = eVarArr;
            this.f4490w = j();
            return;
        }
        this.f4489v = null;
        this.f4490w = null;
    }
}
