package zb;

import a8.a;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.api.Api;
import zb.h;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f14339a;

    /* renamed from: b  reason: collision with root package name */
    public int f14340b;

    /* renamed from: c  reason: collision with root package name */
    public int f14341c;

    /* renamed from: d  reason: collision with root package name */
    public int f14342d;

    /* renamed from: e  reason: collision with root package name */
    public int f14343e;

    /* renamed from: f  reason: collision with root package name */
    public int f14344f;
    public int g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    /* renamed from: h  reason: collision with root package name */
    public int f14345h;

    public m(byte[] bArr, int i) {
        this.f14339a = bArr;
        this.f14340b = i + 0;
        this.f14342d = 0;
        this.f14344f = 0;
    }

    public final int a() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f14344f + this.f14342d);
    }

    public final <T extends a0> T b(d0<T> d0Var, p pVar) {
        int n10 = n();
        if (this.f14345h < 100) {
            int d10 = d(n10);
            this.f14345h++;
            T t10 = (a0) d0Var.a(this, pVar);
            c(0);
            this.f14345h--;
            this.g = d10;
            s();
            return t10;
        }
        throw new u("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final void c(int i) {
        if (this.f14343e != i) {
            throw new u("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int d(int i) {
        if (i >= 0) {
            int i10 = this.f14344f + this.f14342d + i;
            int i11 = this.g;
            if (i10 <= i11) {
                this.g = i10;
                s();
                return i11;
            }
            throw u.b();
        }
        throw u.a();
    }

    public final boolean e() {
        return o() != 0;
    }

    public final h f() {
        int n10 = n();
        int i = this.f14340b;
        int i10 = this.f14342d;
        if (n10 <= i - i10 && n10 > 0) {
            h.d dVar = new h.d(h.f14305c.a(this.f14339a, i10, n10));
            this.f14342d += n10;
            return dVar;
        } else if (n10 == 0) {
            return h.f14304b;
        } else {
            byte[] g8 = g(n10);
            h.d dVar2 = h.f14304b;
            return new h.d(g8);
        }
    }

    public final byte[] g(int i) {
        if (i > 0) {
            int i10 = this.f14344f;
            int i11 = this.f14342d;
            int i12 = i10 + i11 + i;
            if (i12 <= 67108864) {
                int i13 = this.g;
                if (i12 <= i13) {
                    throw u.b();
                }
                k((i13 - i10) - i11);
                throw u.b();
            }
            throw new u("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        } else if (i == 0) {
            return t.f14378b;
        } else {
            throw u.a();
        }
    }

    public final byte h() {
        int i = this.f14342d;
        if (i != this.f14340b) {
            byte[] bArr = this.f14339a;
            this.f14342d = i + 1;
            return bArr[i];
        }
        m(1);
        throw u.b();
    }

    public final boolean i(int i) {
        int i10;
        int r10;
        int i11 = i & 7;
        if (i11 != 0) {
            if (i11 == 1) {
                i10 = 8;
            } else if (i11 == 2) {
                i10 = n();
            } else if (i11 == 3) {
                do {
                    r10 = r();
                    if (r10 == 0 || !i(r10)) {
                        c(((i >>> 3) << 3) | 4);
                    }
                    r10 = r();
                    break;
                } while (!i(r10));
                c(((i >>> 3) << 3) | 4);
                return true;
            } else if (i11 == 4) {
                return false;
            } else {
                if (i11 == 5) {
                    k(4);
                    return true;
                }
                throw new u("Protocol message tag had invalid wire type.");
            }
            k(i10);
            return true;
        }
        int i12 = this.f14340b;
        int i13 = this.f14342d;
        if (i12 - i13 >= 10) {
            byte[] bArr = this.f14339a;
            int i14 = 0;
            while (true) {
                if (i14 >= 10) {
                    break;
                }
                int i15 = i13 + 1;
                if (bArr[i13] >= 0) {
                    this.f14342d = i15;
                    break;
                }
                i14++;
                i13 = i15;
            }
        }
        for (int i16 = 0; i16 < 10; i16++) {
            if (h() >= 0) {
                return true;
            }
        }
        throw new u("CodedInputStream encountered a malformed varint.");
    }

    public final int j() {
        int i = this.f14342d;
        if (this.f14340b - i >= 4) {
            byte[] bArr = this.f14339a;
            this.f14342d = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }
        m(4);
        throw u.b();
    }

    public final void k(int i) {
        int i10 = this.f14340b;
        int i11 = this.f14342d;
        if (i <= i10 - i11 && i >= 0) {
            this.f14342d = i11 + i;
        } else if (i >= 0) {
            int i12 = this.f14344f;
            int i13 = i12 + i11 + i;
            int i14 = this.g;
            if (i13 > i14) {
                k((i14 - i12) - i11);
                throw u.b();
            }
            this.f14342d = i10;
            m(1);
            throw u.b();
        } else {
            throw u.a();
        }
    }

    public final long l() {
        int i = this.f14342d;
        if (this.f14340b - i >= 8) {
            byte[] bArr = this.f14339a;
            this.f14342d = i + 8;
            return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
        }
        m(8);
        throw u.b();
    }

    public final void m(int i) {
        if (this.f14342d + i <= this.f14340b) {
            throw new IllegalStateException(a.b("refillBuffer() called when ", i, " bytes were already available in buffer"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int n() {
        /*
            r5 = this;
            int r0 = r5.f14342d
            int r1 = r5.f14340b
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.f14339a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.f14342d = r3
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
            long r0 = r5.p()
            int r0 = (int) r0
            return r0
        L_0x0070:
            r5.f14342d = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.m.n():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long o() {
        /*
            r11 = this;
            int r0 = r11.f14342d
            int r1 = r11.f14340b
            if (r1 != r0) goto L_0x0008
            goto L_0x00b6
        L_0x0008:
            byte[] r2 = r11.f14339a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r11.f14342d = r3
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
            long r0 = r11.p()
            return r0
        L_0x00bb:
            r1 = r0
        L_0x00bc:
            r2 = r3
        L_0x00bd:
            r11.f14342d = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zb.m.o():long");
    }

    public final long p() {
        long j10 = 0;
        for (int i = 0; i < 64; i += 7) {
            byte h10 = h();
            j10 |= ((long) (h10 & Byte.MAX_VALUE)) << i;
            if ((h10 & 128) == 0) {
                return j10;
            }
        }
        throw new u("CodedInputStream encountered a malformed varint.");
    }

    public final String q() {
        byte[] bArr;
        int n10 = n();
        int i = this.f14342d;
        int i10 = this.f14340b;
        boolean z = false;
        if (n10 <= i10 - i && n10 > 0) {
            bArr = this.f14339a;
            this.f14342d = i + n10;
        } else if (n10 == 0) {
            return BuildConfig.FLAVOR;
        } else {
            if (n10 > i10) {
                bArr = g(n10);
                i = 0;
            } else {
                m(n10);
                throw u.b();
            }
        }
        if (f.f14284a.b(bArr, i, i + n10) == 0) {
            z = true;
        }
        if (z) {
            return new String(bArr, i, n10, t.f14377a);
        }
        throw new u("Protocol message had invalid UTF-8.");
    }

    public final int r() {
        boolean z = true;
        if (this.f14342d == this.f14340b) {
            m(1);
        } else {
            z = false;
        }
        if (z) {
            this.f14343e = 0;
            return 0;
        }
        int n10 = n();
        this.f14343e = n10;
        if ((n10 >>> 3) != 0) {
            return n10;
        }
        throw new u("Protocol message contained an invalid tag (zero).");
    }

    public final void s() {
        int i = this.f14340b + this.f14341c;
        this.f14340b = i;
        int i10 = this.f14344f + i;
        int i11 = this.g;
        if (i10 > i11) {
            int i12 = i10 - i11;
            this.f14341c = i12;
            this.f14340b = i - i12;
            return;
        }
        this.f14341c = 0;
    }
}
