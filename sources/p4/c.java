package p4;

import androidx.activity.result.d;
import h4.e;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Objects;
import k4.b;

public final class c extends i4.a {
    public static final int[] E = new int[0];
    public int[] A = E;
    public int B;
    public int C = -2;
    public boolean D;

    /* renamed from: s  reason: collision with root package name */
    public final b f9654s;

    /* renamed from: t  reason: collision with root package name */
    public final OutputStream f9655t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9656u;

    /* renamed from: v  reason: collision with root package name */
    public g f9657v;

    /* renamed from: w  reason: collision with root package name */
    public byte[] f9658w;

    /* renamed from: x  reason: collision with root package name */
    public int f9659x = 0;

    /* renamed from: y  reason: collision with root package name */
    public final int f9660y;
    public char[] z;

    public enum a {
        WRITE_MINIMAL_INTS(true),
        WRITE_TYPE_HEADER(false);
        
        public final boolean _defaultState;
        public final int _mask;

        private a(boolean z) {
            this._defaultState = z;
            this._mask = 1 << ordinal();
        }

        public static int collectDefaults() {
            int i = 0;
            for (a aVar : values()) {
                if (aVar.enabledByDefault()) {
                    i |= aVar.getMask();
                }
            }
            return i;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i) {
            return (i & getMask()) != 0;
        }

        public int getMask() {
            return this._mask;
        }
    }

    public c(b bVar, int i, int i10, android.support.v4.media.b bVar2, OutputStream outputStream) {
        super(i, bVar2);
        this.f9657v = new g(0, (g) null, e.a.STRICT_DUPLICATE_DETECTION.enabledIn(i) ? new l4.a(this) : null, (Object) null);
        this.f9656u = a.WRITE_MINIMAL_INTS.enabledIn(i10);
        this.f9654s = bVar;
        this.f9655t = outputStream;
        this.D = true;
        bVar.a(bVar.f7441e);
        byte[] a10 = bVar.f7439c.a(1, 16000);
        bVar.f7441e = a10;
        this.f9658w = a10;
        int length = a10.length;
        this.f9660y = length;
        bVar.a(bVar.f7442f);
        char[] b10 = bVar.f7439c.b(1);
        bVar.f7442f = b10;
        this.z = b10;
        if (length < 770) {
            throw new IllegalStateException(d.b("Internal encoding buffer length (", length, ") too short, must be at least ", 770));
        }
    }

    public final void A0() throws IOException {
        if (this.f9657v.b()) {
            x0();
            this.f9657v = this.f9657v.f9687c;
            return;
        }
        StringBuilder d10 = a.a.d("Current context not Array but ");
        d10.append(this.f9657v.d());
        a(d10.toString());
        throw null;
    }

    public final void B(int i) throws IOException {
        if (this.f9659x + i + 3 > this.f9660y) {
            E();
        }
    }

    public final void B0() throws IOException {
        if (this.f9657v.c()) {
            x0();
            this.f9657v = this.f9657v.f9687c;
            return;
        }
        StringBuilder d10 = a.a.d("Current context not Object but ");
        d10.append(this.f9657v.d());
        a(d10.toString());
        throw null;
    }

    public final void C0() throws IOException {
        S("write null value");
        T((byte) -10);
    }

    public final void D0(int i) throws IOException {
        int i10;
        int i11;
        byte b10;
        S("write number");
        if (i < 0) {
            i = (-i) - 1;
            i10 = 32;
        } else {
            i10 = 0;
        }
        y(5);
        if (!this.f9656u) {
            b10 = (byte) i;
            i11 = i >> 8;
        } else if (i < 24) {
            byte[] bArr = this.f9658w;
            int i12 = this.f9659x;
            this.f9659x = i12 + 1;
            bArr[i12] = (byte) (i10 + i);
            return;
        } else if (i <= 255) {
            byte[] bArr2 = this.f9658w;
            int i13 = this.f9659x;
            int i14 = i13 + 1;
            this.f9659x = i14;
            bArr2[i13] = (byte) (i10 + 24);
            this.f9659x = i14 + 1;
            bArr2[i14] = (byte) i;
            return;
        } else {
            b10 = (byte) i;
            i11 = i >> 8;
            if (i11 <= 255) {
                byte[] bArr3 = this.f9658w;
                int i15 = this.f9659x;
                int i16 = i15 + 1;
                this.f9659x = i16;
                bArr3[i15] = (byte) (i10 + 25);
                int i17 = i16 + 1;
                this.f9659x = i17;
                bArr3[i16] = (byte) i11;
                this.f9659x = i17 + 1;
                bArr3[i17] = b10;
                return;
            }
        }
        byte[] bArr4 = this.f9658w;
        int i18 = this.f9659x;
        int i19 = i18 + 1;
        this.f9659x = i19;
        bArr4[i18] = (byte) (i10 + 26);
        int i20 = i19 + 1;
        this.f9659x = i20;
        bArr4[i19] = (byte) (i11 >> 16);
        int i21 = i20 + 1;
        this.f9659x = i21;
        bArr4[i20] = (byte) (i11 >> 8);
        int i22 = i21 + 1;
        this.f9659x = i22;
        bArr4[i21] = (byte) i11;
        this.f9659x = i22 + 1;
        bArr4[i22] = b10;
    }

    public final void E() throws IOException {
        int i = this.f9659x;
        if (i > 0) {
            this.f9655t.write(this.f9658w, 0, i);
            this.f9659x = 0;
        }
    }

    public final void E0(long j10) throws IOException {
        S("write number");
        if (this.f9656u) {
            if (j10 >= 0) {
                if (j10 <= 4294967296L) {
                    f0(0, (int) j10);
                    return;
                }
            } else if (j10 >= -4294967296L) {
                f0(32, (int) ((-j10) - 1));
                return;
            }
        }
        y(9);
        if (j10 < 0) {
            j10 = -(j10 + 1);
            byte[] bArr = this.f9658w;
            int i = this.f9659x;
            this.f9659x = i + 1;
            bArr[i] = 59;
        } else {
            byte[] bArr2 = this.f9658w;
            int i10 = this.f9659x;
            this.f9659x = i10 + 1;
            bArr2[i10] = 27;
        }
        int i11 = (int) (j10 >> 32);
        byte[] bArr3 = this.f9658w;
        int i12 = this.f9659x;
        int i13 = i12 + 1;
        this.f9659x = i13;
        bArr3[i12] = (byte) (i11 >> 24);
        int i14 = i13 + 1;
        this.f9659x = i14;
        bArr3[i13] = (byte) (i11 >> 16);
        int i15 = i14 + 1;
        this.f9659x = i15;
        bArr3[i14] = (byte) (i11 >> 8);
        int i16 = i15 + 1;
        this.f9659x = i16;
        bArr3[i15] = (byte) i11;
        int i17 = (int) j10;
        int i18 = i16 + 1;
        this.f9659x = i18;
        bArr3[i16] = (byte) (i17 >> 24);
        int i19 = i18 + 1;
        this.f9659x = i19;
        bArr3[i18] = (byte) (i17 >> 16);
        int i20 = i19 + 1;
        this.f9659x = i20;
        bArr3[i19] = (byte) (i17 >> 8);
        this.f9659x = i20 + 1;
        bArr3[i20] = (byte) i17;
    }

    public final void F0() throws IOException {
        S("start an array");
        this.f9657v = this.f9657v.e();
        if (this.B > 0) {
            O();
        }
        this.C = -2;
        T((byte) -97);
    }

    public final void G0(int i) throws IOException {
        S("start an array");
        this.f9657v = this.f9657v.e();
        O();
        this.C = i;
        p0(128, i);
    }

    public final void H0(String str) throws IOException {
        if (str == null) {
            C0();
            return;
        }
        S("write String value");
        v0(str);
    }

    public final void O() {
        int[] iArr = this.A;
        if (iArr.length == this.B) {
            this.A = Arrays.copyOf(iArr, iArr.length + 10);
        }
        int[] iArr2 = this.A;
        int i = this.B;
        this.B = i + 1;
        iArr2[i] = this.C;
    }

    public final void R(int i) {
        if (i > 1114111) {
            StringBuilder d10 = a.a.d("Illegal character point (0x");
            d10.append(Integer.toHexString(i));
            d10.append(") to output; max is 0x10FFFF as per RFC 4627");
            throw new IllegalArgumentException(d10.toString());
        } else if (i < 55296) {
            StringBuilder d11 = a.a.d("Illegal character point (0x");
            d11.append(Integer.toHexString(i));
            d11.append(") to output");
            throw new IllegalArgumentException(d11.toString());
        } else if (i <= 56319) {
            StringBuilder d12 = a.a.d("Unmatched first part of surrogate pair (0x");
            d12.append(Integer.toHexString(i));
            d12.append(")");
            throw new IllegalArgumentException(d12.toString());
        } else {
            StringBuilder d13 = a.a.d("Unmatched second part of surrogate pair (0x");
            d13.append(Integer.toHexString(i));
            d13.append(")");
            throw new IllegalArgumentException(d13.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(java.lang.String r6) throws java.io.IOException {
        /*
            r5 = this;
            p4.g r0 = r5.f9657v
            int r1 = r0.f5834a
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 != r2) goto L_0x0011
            boolean r1 = r0.i
            if (r1 != 0) goto L_0x000f
            r1 = r3
            goto L_0x0017
        L_0x000f:
            r0.i = r3
        L_0x0011:
            int r1 = r0.f5835b
            int r1 = r1 + r4
            r0.f5835b = r1
            r1 = r4
        L_0x0017:
            r2 = 0
            if (r1 == 0) goto L_0x0039
            int r6 = r5.C
            r1 = -2
            if (r6 == r1) goto L_0x0038
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x0026
            r5.C = r6
            goto L_0x0038
        L_0x0026:
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r0 = r0.d()
            r6[r3] = r0
            java.lang.String r0 = "%s size mismatch: number of element encoded is not equal to reported array/map size."
            java.lang.String r6 = java.lang.String.format(r0, r6)
            r5.a(r6)
            throw r2
        L_0x0038:
            return
        L_0x0039:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can not "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", expecting field name/id"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.a(r6)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p4.c.S(java.lang.String):void");
    }

    public final void T(byte b10) throws IOException {
        if (this.f9659x >= this.f9660y) {
            E();
        }
        byte[] bArr = this.f9658w;
        int i = this.f9659x;
        this.f9659x = i + 1;
        bArr[i] = b10;
    }

    public final void a0(byte[] bArr, int i, int i10) throws IOException {
        if (i10 != 0) {
            int i11 = this.f9659x;
            int i12 = i11 + i10;
            int i13 = this.f9660y;
            if (i12 >= i13) {
                if (i11 >= i13) {
                    E();
                }
                while (true) {
                    int min = Math.min(i10, this.f9660y - this.f9659x);
                    System.arraycopy(bArr, i, this.f9658w, this.f9659x, min);
                    this.f9659x += min;
                    i10 -= min;
                    if (i10 != 0) {
                        i += min;
                        E();
                    } else {
                        return;
                    }
                }
            } else {
                System.arraycopy(bArr, i, this.f9658w, i11, i10);
                this.f9659x += i10;
            }
        }
    }

    public final void b0(int i, int i10) throws IOException {
        y(5);
        byte[] bArr = this.f9658w;
        int i11 = this.f9659x;
        int i12 = i11 + 1;
        this.f9659x = i12;
        bArr[i11] = (byte) (i + 26);
        int i13 = i12 + 1;
        this.f9659x = i13;
        bArr[i12] = (byte) (i10 >> 24);
        int i14 = i13 + 1;
        this.f9659x = i14;
        bArr[i13] = (byte) (i10 >> 16);
        int i15 = i14 + 1;
        this.f9659x = i15;
        bArr[i14] = (byte) (i10 >> 8);
        this.f9659x = i15 + 1;
        bArr[i15] = (byte) i10;
    }

    public final void close() throws IOException {
        if (this.f9658w != null && s(e.a.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                g gVar = this.f9657v;
                if (!gVar.b()) {
                    if (!gVar.c()) {
                        break;
                    }
                    B0();
                } else {
                    A0();
                }
            }
        }
        E();
        if (this.f9654s.f7438b || s(e.a.AUTO_CLOSE_TARGET)) {
            this.f9655t.close();
        } else if (s(e.a.FLUSH_PASSED_TO_STREAM)) {
            this.f9655t.flush();
        }
        byte[] bArr = this.f9658w;
        if (bArr != null && this.D) {
            this.f9658w = null;
            b bVar = this.f9654s;
            Objects.requireNonNull(bVar);
            byte[] bArr2 = bVar.f7441e;
            if (bArr == bArr2 || bArr.length >= bArr2.length) {
                bVar.f7441e = null;
                bVar.f7439c.f8901a.set(1, bArr);
            } else {
                throw new IllegalArgumentException("Trying to release buffer smaller than original");
            }
        }
        char[] cArr = this.z;
        if (cArr != null) {
            this.z = null;
            b bVar2 = this.f9654s;
            Objects.requireNonNull(bVar2);
            char[] cArr2 = bVar2.f7442f;
            if (cArr == cArr2 || cArr.length >= cArr2.length) {
                bVar2.f7442f = null;
                bVar2.f7439c.c(1, cArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer smaller than original");
        }
    }

    public final void f(byte[] bArr, int i, int i10) throws IOException {
        if (bArr == null) {
            C0();
            return;
        }
        S("write Binary value");
        p0(64, i10);
        a0(bArr, i, i10);
    }

    public final void f0(int i, int i10) throws IOException {
        int i11;
        byte b10;
        y(5);
        if (i10 < 0) {
            b10 = (byte) i10;
            i11 = i10 >> 8;
        } else if (i10 < 24) {
            byte[] bArr = this.f9658w;
            int i12 = this.f9659x;
            this.f9659x = i12 + 1;
            bArr[i12] = (byte) (i + i10);
            return;
        } else if (i10 <= 255) {
            byte[] bArr2 = this.f9658w;
            int i13 = this.f9659x;
            int i14 = i13 + 1;
            this.f9659x = i14;
            bArr2[i13] = (byte) (i + 24);
            this.f9659x = i14 + 1;
            bArr2[i14] = (byte) i10;
            return;
        } else {
            b10 = (byte) i10;
            i11 = i10 >> 8;
            if (i11 <= 255) {
                byte[] bArr3 = this.f9658w;
                int i15 = this.f9659x;
                int i16 = i15 + 1;
                this.f9659x = i16;
                bArr3[i15] = (byte) (i + 25);
                int i17 = i16 + 1;
                this.f9659x = i17;
                bArr3[i16] = (byte) i11;
                this.f9659x = i17 + 1;
                bArr3[i17] = b10;
                return;
            }
        }
        byte[] bArr4 = this.f9658w;
        int i18 = this.f9659x;
        int i19 = i18 + 1;
        this.f9659x = i19;
        bArr4[i18] = (byte) (i + 26);
        int i20 = i19 + 1;
        this.f9659x = i20;
        bArr4[i19] = (byte) (i11 >> 16);
        int i21 = i20 + 1;
        this.f9659x = i21;
        bArr4[i20] = (byte) (i11 >> 8);
        int i22 = i21 + 1;
        this.f9659x = i22;
        bArr4[i21] = (byte) i11;
        this.f9659x = i22 + 1;
        bArr4[i22] = b10;
    }

    public final void flush() throws IOException {
        E();
        if (s(e.a.FLUSH_PASSED_TO_STREAM)) {
            this.f9655t.flush();
        }
    }

    public final void p0(int i, int i10) throws IOException {
        y(5);
        if (i10 < 24) {
            byte[] bArr = this.f9658w;
            int i11 = this.f9659x;
            this.f9659x = i11 + 1;
            bArr[i11] = (byte) (i + i10);
        } else if (i10 <= 255) {
            byte[] bArr2 = this.f9658w;
            int i12 = this.f9659x;
            int i13 = i12 + 1;
            this.f9659x = i13;
            bArr2[i12] = (byte) (i + 24);
            this.f9659x = i13 + 1;
            bArr2[i13] = (byte) i10;
        } else {
            byte b10 = (byte) i10;
            int i14 = i10 >> 8;
            if (i14 <= 255) {
                byte[] bArr3 = this.f9658w;
                int i15 = this.f9659x;
                int i16 = i15 + 1;
                this.f9659x = i16;
                bArr3[i15] = (byte) (i + 25);
                int i17 = i16 + 1;
                this.f9659x = i17;
                bArr3[i16] = (byte) i14;
                this.f9659x = i17 + 1;
                bArr3[i17] = b10;
                return;
            }
            byte[] bArr4 = this.f9658w;
            int i18 = this.f9659x;
            int i19 = i18 + 1;
            this.f9659x = i19;
            bArr4[i18] = (byte) (i + 26);
            int i20 = i19 + 1;
            this.f9659x = i20;
            bArr4[i19] = (byte) (i14 >> 16);
            int i21 = i20 + 1;
            this.f9659x = i21;
            bArr4[i20] = (byte) (i14 >> 8);
            int i22 = i21 + 1;
            this.f9659x = i22;
            bArr4[i21] = (byte) i14;
            this.f9659x = i22 + 1;
            bArr4[i22] = b10;
        }
    }

    public final int t(int i, int i10) {
        if (i10 < 56320 || i10 > 57343) {
            StringBuilder d10 = a.a.d("Broken surrogate pair: first char 0x");
            d10.append(Integer.toHexString(i));
            d10.append(", second 0x");
            d10.append(Integer.toHexString(i10));
            d10.append("; illegal combination");
            throw new IllegalArgumentException(d10.toString());
        }
        return (i10 - 56320) + ((i - 55296) << 10) + LZ4Constants.MAX_DISTANCE;
    }

    public final void v0(String str) throws IOException {
        int i;
        int i10;
        int i11;
        int length = str.length();
        if (length == 0) {
            T((byte) 96);
            return;
        }
        int i12 = 0;
        if (length <= 23) {
            B(71);
            int i13 = this.f9659x + 1;
            byte[] bArr = this.f9658w;
            int i14 = i13;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                char charAt = str.charAt(i10);
                if (charAt > 127) {
                    byte[] bArr2 = this.f9658w;
                    while (i10 < length) {
                        int i15 = i10 + 1;
                        char charAt2 = str.charAt(i10);
                        if (charAt2 <= 127) {
                            i11 = i + 1;
                            bArr2[i] = (byte) charAt2;
                        } else if (charAt2 < 2048) {
                            int i16 = i + 1;
                            bArr2[i] = (byte) ((charAt2 >> 6) | 192);
                            i = i16 + 1;
                            bArr2[i16] = (byte) ((charAt2 & '?') | 128);
                            i10 = i15;
                        } else if (charAt2 < 55296 || charAt2 > 57343) {
                            int i17 = i + 1;
                            bArr2[i] = (byte) ((charAt2 >> 12) | 224);
                            int i18 = i17 + 1;
                            bArr2[i17] = (byte) (((charAt2 >> 6) & 63) | 128);
                            i11 = i18 + 1;
                            bArr2[i18] = (byte) ((charAt2 & '?') | 128);
                        } else if (charAt2 > 56319) {
                            R(charAt2);
                            throw null;
                        } else if (i15 < length) {
                            int i19 = i15 + 1;
                            int t10 = t(charAt2, str.charAt(i15));
                            if (t10 <= 1114111) {
                                int i20 = i + 1;
                                bArr2[i] = (byte) ((t10 >> 18) | 240);
                                int i21 = i20 + 1;
                                bArr2[i20] = (byte) (((t10 >> 12) & 63) | 128);
                                int i22 = i21 + 1;
                                bArr2[i21] = (byte) (((t10 >> 6) & 63) | 128);
                                i = i22 + 1;
                                bArr2[i22] = (byte) ((t10 & 63) | 128);
                                i10 = i19;
                            } else {
                                R(t10);
                                throw null;
                            }
                        } else {
                            R(charAt2);
                            throw null;
                        }
                        i = i11;
                        i10 = i15;
                    }
                } else {
                    bArr[i] = (byte) charAt;
                    i12 = i10 + 1;
                    i14 = i + 1;
                }
            }
            int i23 = i - i13;
            byte[] bArr3 = this.f9658w;
            int i24 = this.f9659x;
            if (i23 <= 23) {
                bArr3[i24] = (byte) (i23 + 96);
                this.f9659x = i24 + 1 + i23;
                return;
            }
            int i25 = i24 + 1;
            System.arraycopy(bArr3, i25, bArr3, i24 + 2, i23);
            bArr3[i24] = 120;
            bArr3[i25] = (byte) i23;
            this.f9659x = i25 + 1 + i23;
            return;
        }
        char[] cArr = this.z;
        if (length > cArr.length) {
            cArr = new char[Math.max(cArr.length + 32, length)];
            this.z = cArr;
        }
        str.getChars(0, length, cArr, 0);
        w0(cArr, 0, length);
    }

    public final int w(int i, char[] cArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr = this.f9658w;
        int i14 = i;
        while (true) {
            char c10 = cArr[r9];
            if (c10 > 127) {
                byte[] bArr2 = this.f9658w;
                while (r9 < i11) {
                    int i15 = r9 + 1;
                    char c11 = cArr[r9];
                    if (c11 <= 127) {
                        i13 = i12 + 1;
                        bArr2[i12] = (byte) c11;
                    } else if (c11 < 2048) {
                        int i16 = i12 + 1;
                        bArr2[i12] = (byte) ((c11 >> 6) | 192);
                        i12 = i16 + 1;
                        bArr2[i16] = (byte) ((c11 & '?') | 128);
                        r9 = i15;
                    } else if (c11 < 55296 || c11 > 57343) {
                        int i17 = i12 + 1;
                        bArr2[i12] = (byte) ((c11 >> 12) | 224);
                        int i18 = i17 + 1;
                        bArr2[i17] = (byte) (((c11 >> 6) & 63) | 128);
                        i13 = i18 + 1;
                        bArr2[i18] = (byte) ((c11 & '?') | 128);
                    } else if (c11 > 56319) {
                        R(c11);
                        throw null;
                    } else if (i15 < i11) {
                        int i19 = i15 + 1;
                        int t10 = t(c11, cArr[i15]);
                        if (t10 <= 1114111) {
                            int i20 = i12 + 1;
                            bArr2[i12] = (byte) ((t10 >> 18) | 240);
                            int i21 = i20 + 1;
                            bArr2[i20] = (byte) (((t10 >> 12) & 63) | 128);
                            int i22 = i21 + 1;
                            bArr2[i21] = (byte) (((t10 >> 6) & 63) | 128);
                            i12 = i22 + 1;
                            bArr2[i22] = (byte) ((t10 & 63) | 128);
                            r9 = i19;
                        } else {
                            R(t10);
                            throw null;
                        }
                    } else {
                        R(c11);
                        throw null;
                    }
                    i12 = i13;
                    r9 = i15;
                }
                return i12 - i;
            }
            int i23 = i12 + 1;
            bArr[i12] = (byte) c10;
            i10 = r9 + 1;
            if (i10 >= i11) {
                return i23 - i;
            }
            i14 = i23;
        }
    }

    public final void w0(char[] cArr, int i, int i10) throws IOException {
        int i11;
        if (i10 <= 23) {
            B(71);
            int w6 = w(this.f9659x + 1, cArr, i, i10 + i);
            byte[] bArr = this.f9658w;
            int i12 = this.f9659x;
            if (w6 <= 23) {
                bArr[i12] = (byte) (w6 + 96);
                this.f9659x = i12 + 1 + w6;
                return;
            }
            int i13 = i12 + 1;
            System.arraycopy(bArr, i13, bArr, i12 + 2, w6);
            bArr[i12] = 120;
            bArr[i13] = (byte) w6;
            this.f9659x = i13 + 1 + w6;
        } else if (i10 <= 255) {
            B(768);
            int w10 = w(this.f9659x + 2, cArr, i, i10 + i);
            byte[] bArr2 = this.f9658w;
            int i14 = this.f9659x;
            if (w10 <= 255) {
                int i15 = i14 + 1;
                bArr2[i14] = 120;
                bArr2[i15] = (byte) w10;
                this.f9659x = i15 + 1 + w10;
                return;
            }
            System.arraycopy(bArr2, i14 + 2, bArr2, i14 + 3, w10);
            int i16 = i14 + 1;
            bArr2[i14] = 121;
            int i17 = i16 + 1;
            bArr2[i16] = (byte) (w10 >> 8);
            bArr2[i17] = (byte) w10;
            this.f9659x = i17 + 1 + w10;
        } else if (i10 <= 3996) {
            B(11991);
            int i18 = this.f9659x;
            int w11 = w(i18 + 3, cArr, i, i10 + i);
            byte[] bArr3 = this.f9658w;
            int i19 = i18 + 1;
            bArr3[i18] = 121;
            int i20 = i19 + 1;
            bArr3[i19] = (byte) (w11 >> 8);
            bArr3[i20] = (byte) w11;
            this.f9659x = i20 + 1 + w11;
        } else {
            T(Byte.MAX_VALUE);
            while (i10 > 3996) {
                B(11991);
                int i21 = this.f9659x;
                int i22 = i + 3996;
                int i23 = i22 - 1;
                char c10 = cArr[i23];
                if (c10 < 55296 || c10 > 56319) {
                    i11 = 3996;
                } else {
                    int i24 = i23;
                    i11 = 3995;
                    i22 = i24;
                }
                int w12 = w(i21 + 3, cArr, i, i22);
                byte[] bArr4 = this.f9658w;
                int i25 = i21 + 1;
                bArr4[i21] = 121;
                int i26 = i25 + 1;
                bArr4[i25] = (byte) (w12 >> 8);
                bArr4[i26] = (byte) w12;
                this.f9659x = i26 + 1 + w12;
                i += i11;
                i10 -= i11;
            }
            if (i10 > 0) {
                w0(cArr, i, i10);
            }
            T((byte) -1);
        }
    }

    public final void x0() throws IOException {
        int i = this.C;
        int i10 = -2;
        if (i == -2) {
            T((byte) -1);
        } else if (i != 0) {
            a(String.format("%s size mismatch: expected %d more elements", new Object[]{this.f9657v.d(), Integer.valueOf(this.C)}));
            throw null;
        }
        int i11 = this.B;
        if (i11 != 0) {
            int[] iArr = this.A;
            int i12 = i11 - 1;
            this.B = i12;
            i10 = iArr[i12];
        }
        this.C = i10;
    }

    public final void y(int i) throws IOException {
        if (this.f9659x + i >= this.f9660y) {
            E();
        }
    }

    public final void y0(int[] iArr, int i) throws IOException {
        c(iArr.length, i);
        S("write int array");
        p0(128, i);
        if (this.f9656u) {
            int i10 = i + 0;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = iArr[i11];
                if (i12 < 0) {
                    f0(32, (-i12) - 1);
                } else {
                    f0(0, i12);
                }
            }
            return;
        }
        int i13 = i + 0;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            if (i15 < 0) {
                b0(32, (-i15) - 1);
            } else {
                b0(0, i15);
            }
        }
    }

    public final void z0(boolean z10) throws IOException {
        S("write boolean value");
        if (z10) {
            T((byte) -11);
        } else {
            T((byte) -12);
        }
    }
}
