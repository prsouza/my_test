package m4;

import androidx.activity.result.d;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import n4.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final a f8469a;

    /* renamed from: b  reason: collision with root package name */
    public final AtomicReference<C0156a> f8470b;

    /* renamed from: c  reason: collision with root package name */
    public final int f8471c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f8472d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f8473e;

    /* renamed from: f  reason: collision with root package name */
    public int[] f8474f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f8475h;
    public int i;

    /* renamed from: j  reason: collision with root package name */
    public int f8476j;

    /* renamed from: k  reason: collision with root package name */
    public int f8477k;

    /* renamed from: l  reason: collision with root package name */
    public String[] f8478l;

    /* renamed from: m  reason: collision with root package name */
    public int f8479m;

    /* renamed from: n  reason: collision with root package name */
    public int f8480n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8481o;

    public a(int i10) {
        this.f8469a = null;
        this.f8471c = i10;
        this.f8472d = true;
        this.f8473e = true;
        this.f8470b = new AtomicReference<>(C0156a.a(64));
    }

    public static int b(int i10) {
        int i11 = i10 >> 2;
        if (i11 < 64) {
            return 4;
        }
        if (i11 <= 256) {
            return 5;
        }
        return i11 <= 1024 ? 6 : 7;
    }

    public final int a(int i10) {
        return (i10 & (this.g - 1)) << 2;
    }

    public final int c(int i10) {
        int a10 = a(i10);
        int[] iArr = this.f8474f;
        if (iArr[a10 + 3] == 0) {
            return a10;
        }
        int i11 = this.f8477k;
        int i12 = this.g;
        if (i11 > (i12 >> 1) && (((this.f8479m - ((i12 << 3) - i12)) >> 2) > ((i11 + 1) >> 7) || ((double) i11) > ((double) i12) * 0.8d)) {
            return d(i10);
        }
        int i13 = this.f8475h + ((a10 >> 3) << 2);
        if (iArr[i13 + 3] == 0) {
            return i13;
        }
        int i14 = this.i;
        int i15 = this.f8476j;
        int i16 = i14 + ((a10 >> (i15 + 2)) << i15);
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            if (iArr[i16 + 3] == 0) {
                return i16;
            }
            i16 += 4;
        }
        int i18 = this.f8479m;
        int i19 = i18 + 4;
        this.f8479m = i19;
        int i20 = this.g;
        if (i19 < (i20 << 3)) {
            return i18;
        }
        if (!this.f8473e || i20 <= 1024) {
            return d(i10);
        }
        StringBuilder d10 = a.a.d("Spill-over slots in symbol table with ");
        d10.append(this.f8477k);
        d10.append(" entries, hash area of ");
        d10.append(this.g);
        d10.append(" slots is now full (all ");
        throw new IllegalStateException(d.c(d10, this.g >> 3, " slots -- suspect a DoS attack based on hash collisions. You can disable the check via `JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW`"));
    }

    public final int d(int i10) {
        this.f8481o = false;
        int[] iArr = this.f8474f;
        String[] strArr = this.f8478l;
        int i11 = this.g;
        int i12 = this.f8477k;
        int i13 = i11 + i11;
        int i14 = this.f8479m;
        if (i13 > 65536) {
            o(true);
        } else {
            this.f8474f = new int[(iArr.length + (i11 << 3))];
            this.g = i13;
            int i15 = i13 << 2;
            this.f8475h = i15;
            this.i = i15 + (i15 >> 1);
            this.f8476j = b(i13);
            this.f8478l = new String[(strArr.length << 1)];
            o(false);
            int[] iArr2 = new int[16];
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17 += 4) {
                int i18 = iArr[i17 + 3];
                if (i18 != 0) {
                    i16++;
                    String str = strArr[i17 >> 2];
                    if (i18 == 1) {
                        iArr2[0] = iArr[i17];
                        g(str, iArr2, 1);
                    } else if (i18 == 2) {
                        iArr2[0] = iArr[i17];
                        iArr2[1] = iArr[i17 + 1];
                        g(str, iArr2, 2);
                    } else if (i18 != 3) {
                        if (i18 > iArr2.length) {
                            iArr2 = new int[i18];
                        }
                        System.arraycopy(iArr, iArr[i17 + 1], iArr2, 0, i18);
                        g(str, iArr2, i18);
                    } else {
                        iArr2[0] = iArr[i17];
                        iArr2[1] = iArr[i17 + 1];
                        iArr2[2] = iArr[i17 + 2];
                        g(str, iArr2, 3);
                    }
                }
            }
            if (i16 != i12) {
                throw new IllegalStateException(d.b("Failed rehash(): old count=", i12, ", copyCount=", i16));
            }
        }
        int a10 = a(i10);
        int[] iArr3 = this.f8474f;
        if (iArr3[a10 + 3] == 0) {
            return a10;
        }
        int i19 = this.f8475h + ((a10 >> 3) << 2);
        if (iArr3[i19 + 3] == 0) {
            return i19;
        }
        int i20 = this.i;
        int i21 = this.f8476j;
        int i22 = i20 + ((a10 >> (i21 + 2)) << i21);
        int i23 = (1 << i21) + i22;
        while (i22 < i23) {
            if (iArr3[i22 + 3] == 0) {
                return i22;
            }
            i22 += 4;
        }
        int i24 = this.f8479m;
        this.f8479m = i24 + 4;
        return i24;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0021, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r7[r3] == r0[r9]) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r7[r8] == r0[r9]) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        r8 = r3 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7[r3] == r0[r9]) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004a, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004b, code lost:
        r9 = r8 + 1;
        r3 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0055, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        r8 = r9 + 1;
        r4 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        if (r7[r9] == r0[r3]) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0060, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0065, code lost:
        if (r7[r8] == r0[r4]) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0067, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0068, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
        r3 = r8 + 1;
        r4 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r7[r8] == r0[r9]) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(int[] r7, int r8, int r9) {
        /*
            r6 = this;
            int[] r0 = r6.f8474f
            r1 = 1
            r2 = 0
            switch(r8) {
                case 4: goto L_0x003f;
                case 5: goto L_0x0031;
                case 6: goto L_0x0023;
                case 7: goto L_0x0015;
                case 8: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0069
        L_0x0009:
            r8 = r7[r2]
            int r3 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0012
            return r2
        L_0x0012:
            r8 = r1
            r9 = r3
            goto L_0x0016
        L_0x0015:
            r8 = r2
        L_0x0016:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x0021
            return r2
        L_0x0021:
            r9 = r4
            goto L_0x0024
        L_0x0023:
            r3 = r2
        L_0x0024:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x002f
            return r2
        L_0x002f:
            r9 = r4
            goto L_0x0032
        L_0x0031:
            r8 = r2
        L_0x0032:
            int r3 = r8 + 1
            r8 = r7[r8]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r8 == r9) goto L_0x003d
            return r2
        L_0x003d:
            r9 = r4
            goto L_0x0040
        L_0x003f:
            r3 = r2
        L_0x0040:
            int r8 = r3 + 1
            r3 = r7[r3]
            int r4 = r9 + 1
            r9 = r0[r9]
            if (r3 == r9) goto L_0x004b
            return r2
        L_0x004b:
            int r9 = r8 + 1
            r8 = r7[r8]
            int r3 = r4 + 1
            r4 = r0[r4]
            if (r8 == r4) goto L_0x0056
            return r2
        L_0x0056:
            int r8 = r9 + 1
            r9 = r7[r9]
            int r4 = r3 + 1
            r3 = r0[r3]
            if (r9 == r3) goto L_0x0061
            return r2
        L_0x0061:
            r7 = r7[r8]
            r8 = r0[r4]
            if (r7 == r8) goto L_0x0068
            return r2
        L_0x0068:
            return r1
        L_0x0069:
            r0 = r2
        L_0x006a:
            int r3 = r0 + 1
            r0 = r7[r0]
            int[] r4 = r6.f8474f
            int r5 = r9 + 1
            r9 = r4[r9]
            if (r0 == r9) goto L_0x0078
            r1 = r2
            goto L_0x007a
        L_0x0078:
            if (r3 < r8) goto L_0x007b
        L_0x007a:
            return r1
        L_0x007b:
            r0 = r3
            r9 = r5
            goto L_0x006a
        */
        throw new UnsupportedOperationException("Method not decompiled: m4.a.e(int[], int, int):boolean");
    }

    public final void f() {
        if (this.f8481o) {
            int[] iArr = this.f8474f;
            this.f8474f = Arrays.copyOf(iArr, iArr.length);
            String[] strArr = this.f8478l;
            this.f8478l = (String[]) Arrays.copyOf(strArr, strArr.length);
            this.f8481o = false;
        }
    }

    public final String g(String str, int[] iArr, int i10) {
        int i11;
        f();
        if (this.f8472d) {
            str = e.f8911b.a(str);
        }
        if (i10 == 1) {
            i11 = c(h(iArr[0]));
            int[] iArr2 = this.f8474f;
            iArr2[i11] = iArr[0];
            iArr2[i11 + 3] = 1;
        } else if (i10 == 2) {
            i11 = c(i(iArr[0], iArr[1]));
            int[] iArr3 = this.f8474f;
            iArr3[i11] = iArr[0];
            iArr3[i11 + 1] = iArr[1];
            iArr3[i11 + 3] = 2;
        } else if (i10 != 3) {
            int k10 = k(iArr, i10);
            i11 = c(k10);
            int[] iArr4 = this.f8474f;
            iArr4[i11] = k10;
            int i12 = this.f8480n;
            int i13 = i12 + i10;
            if (i13 > iArr4.length) {
                int length = i13 - iArr4.length;
                int min = Math.min(LZ4Constants.HASH_TABLE_SIZE, this.g);
                this.f8474f = Arrays.copyOf(this.f8474f, Math.max(length, min) + this.f8474f.length);
            }
            System.arraycopy(iArr, 0, this.f8474f, i12, i10);
            this.f8480n += i10;
            int[] iArr5 = this.f8474f;
            iArr5[i11 + 1] = i12;
            iArr5[i11 + 3] = i10;
        } else {
            i11 = c(j(iArr[0], iArr[1], iArr[2]));
            int[] iArr6 = this.f8474f;
            iArr6[i11] = iArr[0];
            iArr6[i11 + 1] = iArr[1];
            iArr6[i11 + 2] = iArr[2];
            iArr6[i11 + 3] = 3;
        }
        this.f8478l[i11 >> 2] = str;
        this.f8477k++;
        return str;
    }

    public final int h(int i10) {
        int i11 = i10 ^ this.f8471c;
        int i12 = i11 + (i11 >>> 16);
        int i13 = i12 ^ (i12 << 3);
        return i13 + (i13 >>> 12);
    }

    public final int i(int i10, int i11) {
        int i12 = i10 + (i10 >>> 15);
        int i13 = this.f8471c ^ ((i11 * 33) + (i12 ^ (i12 >>> 9)));
        int i14 = i13 + (i13 >>> 16);
        int i15 = i14 ^ (i14 >>> 4);
        return i15 + (i15 << 3);
    }

    public final int j(int i10, int i11, int i12) {
        int i13 = i10 ^ this.f8471c;
        int i14 = (((i13 + (i13 >>> 9)) * 31) + i11) * 33;
        int i15 = (i14 + (i14 >>> 15)) ^ i12;
        int i16 = i15 + (i15 >>> 4);
        int i17 = i16 + (i16 >>> 15);
        return i17 ^ (i17 << 9);
    }

    public final int k(int[] iArr, int i10) {
        if (i10 >= 4) {
            int i11 = iArr[0] ^ this.f8471c;
            int i12 = i11 + (i11 >>> 9) + iArr[1];
            int i13 = ((i12 + (i12 >>> 15)) * 33) ^ iArr[2];
            int i14 = i13 + (i13 >>> 4);
            for (int i15 = 3; i15 < i10; i15++) {
                int i16 = iArr[i15];
                i14 += i16 ^ (i16 >> 21);
            }
            int i17 = i14 * 65599;
            int i18 = i17 + (i17 >>> 19);
            return (i18 << 5) ^ i18;
        }
        throw new IllegalArgumentException();
    }

    public final String l(int i10) {
        int a10 = a(h(i10));
        int[] iArr = this.f8474f;
        int i11 = iArr[a10 + 3];
        if (i11 == 1) {
            if (iArr[a10] == i10) {
                return this.f8478l[a10 >> 2];
            }
        } else if (i11 == 0) {
            return null;
        }
        int i12 = this.f8475h + ((a10 >> 3) << 2);
        int i13 = iArr[i12 + 3];
        if (i13 == 1) {
            if (iArr[i12] == i10) {
                return this.f8478l[i12 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.i;
        int i15 = this.f8476j;
        int i16 = i14 + ((a10 >> (i15 + 2)) << i15);
        int i17 = (1 << i15) + i16;
        while (i16 < i17) {
            int i18 = iArr[i16 + 3];
            if (i10 == iArr[i16] && 1 == i18) {
                return this.f8478l[i16 >> 2];
            }
            if (i18 == 0) {
                return null;
            }
            i16 += 4;
        }
        int i19 = this.g;
        for (int i20 = (i19 << 3) - i19; i20 < this.f8479m; i20 += 4) {
            if (i10 == iArr[i20] && 1 == iArr[i20 + 3]) {
                return this.f8478l[i20 >> 2];
            }
        }
        return null;
    }

    public final String m(int i10, int i11) {
        int a10 = a(i(i10, i11));
        int[] iArr = this.f8474f;
        int i12 = iArr[a10 + 3];
        if (i12 == 2) {
            if (i10 == iArr[a10] && i11 == iArr[a10 + 1]) {
                return this.f8478l[a10 >> 2];
            }
        } else if (i12 == 0) {
            return null;
        }
        int i13 = this.f8475h + ((a10 >> 3) << 2);
        int i14 = iArr[i13 + 3];
        if (i14 == 2) {
            if (i10 == iArr[i13] && i11 == iArr[i13 + 1]) {
                return this.f8478l[i13 >> 2];
            }
        } else if (i14 == 0) {
            return null;
        }
        int i15 = this.i;
        int i16 = this.f8476j;
        int i17 = i15 + ((a10 >> (i16 + 2)) << i16);
        int i18 = (1 << i16) + i17;
        while (i17 < i18) {
            int i19 = iArr[i17 + 3];
            if (i10 == iArr[i17] && i11 == iArr[i17 + 1] && 2 == i19) {
                return this.f8478l[i17 >> 2];
            }
            if (i19 == 0) {
                return null;
            }
            i17 += 4;
        }
        int i20 = this.g;
        for (int i21 = (i20 << 3) - i20; i21 < this.f8479m; i21 += 4) {
            if (i10 == iArr[i21] && i11 == iArr[i21 + 1] && 2 == iArr[i21 + 3]) {
                return this.f8478l[i21 >> 2];
            }
        }
        return null;
    }

    public final String n(int i10, int i11, int i12) {
        int a10 = a(j(i10, i11, i12));
        int[] iArr = this.f8474f;
        int i13 = iArr[a10 + 3];
        if (i13 == 3) {
            if (i10 == iArr[a10] && iArr[a10 + 1] == i11 && iArr[a10 + 2] == i12) {
                return this.f8478l[a10 >> 2];
            }
        } else if (i13 == 0) {
            return null;
        }
        int i14 = this.f8475h + ((a10 >> 3) << 2);
        int i15 = iArr[i14 + 3];
        if (i15 == 3) {
            if (i10 == iArr[i14] && iArr[i14 + 1] == i11 && iArr[i14 + 2] == i12) {
                return this.f8478l[i14 >> 2];
            }
        } else if (i15 == 0) {
            return null;
        }
        int i16 = this.i;
        int i17 = this.f8476j;
        int i18 = i16 + ((a10 >> (i17 + 2)) << i17);
        int i19 = (1 << i17) + i18;
        while (i18 < i19) {
            int i20 = iArr[i18 + 3];
            if (i10 == iArr[i18] && i11 == iArr[i18 + 1] && i12 == iArr[i18 + 2] && 3 == i20) {
                return this.f8478l[i18 >> 2];
            }
            if (i20 == 0) {
                return null;
            }
            i18 += 4;
        }
        int i21 = this.g;
        for (int i22 = (i21 << 3) - i21; i22 < this.f8479m; i22 += 4) {
            if (i10 == iArr[i22] && i11 == iArr[i22 + 1] && i12 == iArr[i22 + 2] && 3 == iArr[i22 + 3]) {
                return this.f8478l[i22 >> 2];
            }
        }
        return null;
    }

    public final void o(boolean z) {
        this.f8477k = 0;
        int i10 = this.g;
        this.f8479m = (i10 << 3) - i10;
        this.f8480n = i10 << 3;
        if (z) {
            Arrays.fill(this.f8474f, 0);
            Arrays.fill(this.f8478l, (Object) null);
        }
    }

    public final String toString() {
        int i10 = this.f8475h;
        int i11 = 0;
        for (int i12 = 3; i12 < i10; i12 += 4) {
            if (this.f8474f[i12] != 0) {
                i11++;
            }
        }
        int i13 = this.i;
        int i14 = 0;
        for (int i15 = this.f8475h + 3; i15 < i13; i15 += 4) {
            if (this.f8474f[i15] != 0) {
                i14++;
            }
        }
        int i16 = this.i + 3;
        int i17 = this.g + i16;
        int i18 = 0;
        while (i16 < i17) {
            if (this.f8474f[i16] != 0) {
                i18++;
            }
            i16 += 4;
        }
        int i19 = this.f8479m;
        int i20 = this.g;
        int i21 = (i19 - ((i20 << 3) - i20)) >> 2;
        int i22 = i20 << 3;
        int i23 = 0;
        for (int i24 = 3; i24 < i22; i24 += 4) {
            if (this.f8474f[i24] != 0) {
                i23++;
            }
        }
        return String.format("[%s: size=%d, hashSize=%d, %d/%d/%d/%d pri/sec/ter/spill (=%s), total:%d]", new Object[]{a.class.getName(), Integer.valueOf(this.f8477k), Integer.valueOf(this.g), Integer.valueOf(i11), Integer.valueOf(i14), Integer.valueOf(i18), Integer.valueOf(i21), Integer.valueOf(i11 + i14 + i18 + i21), Integer.valueOf(i23)});
    }

    public a(a aVar, boolean z, int i10, boolean z10, C0156a aVar2) {
        this.f8469a = aVar;
        this.f8471c = i10;
        this.f8472d = z;
        this.f8473e = z10;
        this.f8470b = null;
        this.f8477k = aVar2.f8483b;
        int i11 = aVar2.f8482a;
        this.g = i11;
        int i12 = i11 << 2;
        this.f8475h = i12;
        this.i = i12 + (i12 >> 1);
        this.f8476j = aVar2.f8484c;
        this.f8474f = aVar2.f8485d;
        this.f8478l = aVar2.f8486e;
        this.f8479m = aVar2.f8487f;
        this.f8480n = aVar2.g;
        this.f8481o = true;
    }

    /* renamed from: m4.a$a  reason: collision with other inner class name */
    public static final class C0156a {

        /* renamed from: a  reason: collision with root package name */
        public final int f8482a;

        /* renamed from: b  reason: collision with root package name */
        public final int f8483b;

        /* renamed from: c  reason: collision with root package name */
        public final int f8484c;

        /* renamed from: d  reason: collision with root package name */
        public final int[] f8485d;

        /* renamed from: e  reason: collision with root package name */
        public final String[] f8486e;

        /* renamed from: f  reason: collision with root package name */
        public final int f8487f;
        public final int g;

        public C0156a(int i, int i10, int[] iArr, String[] strArr, int i11, int i12) {
            this.f8482a = i;
            this.f8483b = 0;
            this.f8484c = i10;
            this.f8485d = iArr;
            this.f8486e = strArr;
            this.f8487f = i11;
            this.g = i12;
        }

        public static C0156a a(int i) {
            int i10 = i << 3;
            return new C0156a(i, a.b(i), new int[i10], new String[(i << 1)], i10 - i, i10);
        }

        public C0156a(a aVar) {
            this.f8482a = aVar.g;
            this.f8483b = aVar.f8477k;
            this.f8484c = aVar.f8476j;
            this.f8485d = aVar.f8474f;
            this.f8486e = aVar.f8478l;
            this.f8487f = aVar.f8479m;
            this.g = aVar.f8480n;
        }
    }
}
