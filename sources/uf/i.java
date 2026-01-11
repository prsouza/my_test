package uf;

import ah.v;
import e6.e;
import java.io.Serializable;
import java.security.MessageDigest;
import java.util.Arrays;
import nd.d;
import y.c;

public class i implements Serializable, Comparable<i> {

    /* renamed from: s  reason: collision with root package name */
    public static final i f11955s = new i(new byte[0]);

    /* renamed from: t  reason: collision with root package name */
    public static final a f11956t = new a();

    /* renamed from: a  reason: collision with root package name */
    public transient int f11957a;

    /* renamed from: b  reason: collision with root package name */
    public transient String f11958b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f11959c;

    public static final class a {
        public static i c(byte[] bArr) {
            a aVar = i.f11956t;
            int length = bArr.length;
            v.B((long) bArr.length, (long) 0, (long) length);
            return new i(d.H(bArr, 0, length + 0));
        }

        public final i a(String str) {
            if (str.length() % 2 == 0) {
                int length = str.length() / 2;
                byte[] bArr = new byte[length];
                for (int i = 0; i < length; i++) {
                    int i10 = i * 2;
                    bArr[i] = (byte) (c.h(str.charAt(i10 + 1)) + (c.h(str.charAt(i10)) << 4));
                }
                return new i(bArr);
            }
            throw new IllegalArgumentException(a8.a.c("Unexpected hex string: ", str).toString());
        }

        public final i b(String str) {
            e.D(str, "$this$encodeUtf8");
            byte[] bytes = str.getBytes(fe.a.f5086b);
            e.C(bytes, "(this as java.lang.String).getBytes(charset)");
            i iVar = new i(bytes);
            iVar.f11958b = str;
            return iVar;
        }
    }

    public i(byte[] bArr) {
        e.D(bArr, "data");
        this.f11959c = bArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0033, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        if (r6 < r7) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        if (r0 < r1) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            uf.i r9 = (uf.i) r9
            java.lang.String r0 = "other"
            e6.e.D(r9, r0)
            int r0 = r8.h()
            int r1 = r9.h()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0015:
            r5 = -1
            if (r4 >= r2) goto L_0x002c
            byte r6 = r8.l(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.l(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0029
            int r4 = r4 + 1
            goto L_0x0015
        L_0x0029:
            if (r6 >= r7) goto L_0x0033
            goto L_0x0031
        L_0x002c:
            if (r0 != r1) goto L_0x002f
            goto L_0x0034
        L_0x002f:
            if (r0 >= r1) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.i.compareTo(java.lang.Object):int");
    }

    public String d() {
        byte[] bArr = this.f11959c;
        byte[] bArr2 = a.f11936a;
        byte[] bArr3 = a.f11936a;
        e.D(bArr, "$this$encodeBase64");
        e.D(bArr3, "map");
        byte[] bArr4 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i10 = 0;
        while (i < length) {
            int i11 = i + 1;
            byte b10 = bArr[i];
            int i12 = i11 + 1;
            byte b11 = bArr[i11];
            int i13 = i12 + 1;
            byte b12 = bArr[i12];
            int i14 = i10 + 1;
            bArr4[i10] = bArr3[(b10 & 255) >> 2];
            int i15 = i14 + 1;
            bArr4[i14] = bArr3[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i16 = i15 + 1;
            bArr4[i15] = bArr3[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i10 = i16 + 1;
            bArr4[i16] = bArr3[b12 & 63];
            i = i13;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i];
            int i17 = i10 + 1;
            bArr4[i10] = bArr3[(b13 & 255) >> 2];
            int i18 = i17 + 1;
            bArr4[i17] = bArr3[(b13 & 3) << 4];
            byte b14 = (byte) 61;
            bArr4[i18] = b14;
            bArr4[i18 + 1] = b14;
        } else if (length2 == 2) {
            int i19 = i + 1;
            byte b15 = bArr[i];
            byte b16 = bArr[i19];
            int i20 = i10 + 1;
            bArr4[i10] = bArr3[(b15 & 255) >> 2];
            int i21 = i20 + 1;
            bArr4[i20] = bArr3[((b15 & 3) << 4) | ((b16 & 255) >> 4)];
            bArr4[i21] = bArr3[(b16 & 15) << 2];
            bArr4[i21 + 1] = (byte) 61;
        }
        return new String(bArr4, fe.a.f5086b);
    }

    public i e(String str) {
        byte[] digest = MessageDigest.getInstance(str).digest(this.f11959c);
        e.C(digest, "MessageDigest.getInstance(algorithm).digest(data)");
        return new i(digest);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int h10 = iVar.h();
            byte[] bArr = this.f11959c;
            if (h10 == bArr.length && iVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int h() {
        return this.f11959c.length;
    }

    public int hashCode() {
        int i = this.f11957a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f11959c);
        this.f11957a = hashCode;
        return hashCode;
    }

    public String i() {
        byte[] bArr = this.f11959c;
        char[] cArr = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b10 : bArr) {
            int i10 = i + 1;
            char[] cArr2 = c.f13324x;
            cArr[i] = cArr2[(b10 >> 4) & 15];
            i = i10 + 1;
            cArr[i10] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public byte[] k() {
        return this.f11959c;
    }

    public byte l(int i) {
        return this.f11959c[i];
    }

    public boolean o(int i, byte[] bArr, int i10, int i11) {
        e.D(bArr, "other");
        if (i >= 0) {
            byte[] bArr2 = this.f11959c;
            return i <= bArr2.length - i11 && i10 >= 0 && i10 <= bArr.length - i11 && v.x(bArr2, i, bArr, i10, i11);
        }
    }

    public boolean p(i iVar, int i) {
        return iVar.o(0, this.f11959c, 0, i);
    }

    public i q() {
        byte b10;
        int i = 0;
        while (true) {
            byte[] bArr = this.f11959c;
            if (i >= bArr.length) {
                return this;
            }
            byte b11 = bArr[i];
            byte b12 = (byte) 65;
            if (b11 < b12 || b11 > (b10 = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                e.C(copyOf, "java.util.Arrays.copyOf(this, size)");
                copyOf[i] = (byte) (b11 + 32);
                for (int i10 = i + 1; i10 < copyOf.length; i10++) {
                    byte b13 = copyOf[i10];
                    if (b13 >= b12 && b13 <= b10) {
                        copyOf[i10] = (byte) (b13 + 32);
                    }
                }
                return new i(copyOf);
            }
        }
    }

    public final String r() {
        String str = this.f11958b;
        if (str != null) {
            return str;
        }
        byte[] k10 = k();
        e.D(k10, "$this$toUtf8String");
        String str2 = new String(k10, fe.a.f5086b);
        this.f11958b = str2;
        return str2;
    }

    public void s(e eVar, int i) {
        e.D(eVar, "buffer");
        eVar.w0(this.f11959c, 0, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0125, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0163, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0176, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0187, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0196, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x01ac, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01b4, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x01bb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01f0, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x01f3, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x009b, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00a6, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x00e8, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x00fb, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x010a, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x011c, code lost:
        if (r4 == 64) goto L_0x01f4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            r0 = r17
            byte[] r1 = r0.f11959c
            int r2 = r1.length
            if (r2 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r2 == 0) goto L_0x0010
            java.lang.String r1 = "[size=0]"
            goto L_0x02c8
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0014:
            r6 = 64
            if (r3 >= r2) goto L_0x01f4
            byte r7 = r1[r3]
            r8 = 10
            r9 = 13
            r10 = 159(0x9f, float:2.23E-43)
            r11 = 127(0x7f, float:1.78E-43)
            r12 = 31
            r14 = 65533(0xfffd, float:9.1831E-41)
            r15 = 65536(0x10000, float:9.18355E-41)
            if (r7 < 0) goto L_0x007f
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0031
            goto L_0x01f4
        L_0x0031:
            if (r7 == r8) goto L_0x0043
            if (r7 == r9) goto L_0x0043
            if (r7 < 0) goto L_0x0039
            if (r12 >= r7) goto L_0x003e
        L_0x0039:
            if (r11 <= r7) goto L_0x003c
            goto L_0x0040
        L_0x003c:
            if (r10 < r7) goto L_0x0040
        L_0x003e:
            r4 = 1
            goto L_0x0041
        L_0x0040:
            r4 = 0
        L_0x0041:
            if (r4 != 0) goto L_0x01f3
        L_0x0043:
            if (r7 != r14) goto L_0x0047
            goto L_0x01f3
        L_0x0047:
            if (r7 >= r15) goto L_0x004b
            r4 = 1
            goto L_0x004c
        L_0x004b:
            r4 = 2
        L_0x004c:
            int r5 = r5 + r4
            int r3 = r3 + 1
        L_0x004f:
            r4 = r16
            if (r3 >= r2) goto L_0x0014
            byte r7 = r1[r3]
            if (r7 < 0) goto L_0x0014
            int r7 = r3 + 1
            byte r3 = r1[r3]
            int r16 = r4 + 1
            if (r4 != r6) goto L_0x0061
            goto L_0x01f4
        L_0x0061:
            if (r3 == r8) goto L_0x0073
            if (r3 == r9) goto L_0x0073
            if (r3 < 0) goto L_0x0069
            if (r12 >= r3) goto L_0x006e
        L_0x0069:
            if (r11 <= r3) goto L_0x006c
            goto L_0x0070
        L_0x006c:
            if (r10 < r3) goto L_0x0070
        L_0x006e:
            r4 = 1
            goto L_0x0071
        L_0x0070:
            r4 = 0
        L_0x0071:
            if (r4 != 0) goto L_0x01f3
        L_0x0073:
            if (r3 != r14) goto L_0x0077
            goto L_0x01f3
        L_0x0077:
            if (r3 >= r15) goto L_0x007b
            r3 = 1
            goto L_0x007c
        L_0x007b:
            r3 = 2
        L_0x007c:
            int r5 = r5 + r3
            r3 = r7
            goto L_0x004f
        L_0x007f:
            int r14 = r7 >> 5
            r15 = -2
            r13 = 128(0x80, float:1.794E-43)
            if (r14 != r15) goto L_0x00da
            int r7 = r3 + 1
            if (r2 > r7) goto L_0x008e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x008e:
            byte r14 = r1[r3]
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0098
            r15 = 1
            goto L_0x0099
        L_0x0098:
            r15 = 0
        L_0x0099:
            if (r15 != 0) goto L_0x009f
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x009f:
            r7 = r7 ^ 3968(0xf80, float:5.56E-42)
            int r14 = r14 << 6
            r7 = r7 ^ r14
            if (r7 >= r13) goto L_0x00aa
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00aa:
            int r13 = r4 + 1
            if (r4 != r6) goto L_0x00b0
            goto L_0x01f4
        L_0x00b0:
            if (r7 == r8) goto L_0x00c2
            if (r7 == r9) goto L_0x00c2
            if (r7 < 0) goto L_0x00b8
            if (r12 >= r7) goto L_0x00bd
        L_0x00b8:
            if (r11 <= r7) goto L_0x00bb
            goto L_0x00bf
        L_0x00bb:
            if (r10 < r7) goto L_0x00bf
        L_0x00bd:
            r4 = 1
            goto L_0x00c0
        L_0x00bf:
            r4 = 0
        L_0x00c0:
            if (r4 != 0) goto L_0x01f3
        L_0x00c2:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x00c9
            goto L_0x01f3
        L_0x00c9:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x00d1
            r4 = 1
            r16 = r4
            goto L_0x00d3
        L_0x00d1:
            r16 = 2
        L_0x00d3:
            int r5 = r5 + r16
            int r3 = r3 + 2
            r4 = r13
            goto L_0x0014
        L_0x00da:
            int r10 = r7 >> 4
            r11 = 55296(0xd800, float:7.7486E-41)
            r12 = 57343(0xdfff, float:8.0355E-41)
            if (r10 != r15) goto L_0x015b
            int r7 = r3 + 2
            if (r2 > r7) goto L_0x00ec
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ec:
            byte r10 = r1[r3]
            int r14 = r3 + 1
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x00f8
            r15 = 1
            goto L_0x00f9
        L_0x00f8:
            r15 = 0
        L_0x00f9:
            if (r15 != 0) goto L_0x00ff
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x00ff:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0107
            r13 = 1
            goto L_0x0108
        L_0x0107:
            r13 = 0
        L_0x0108:
            if (r13 != 0) goto L_0x010e
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x010e:
            r13 = -123008(0xfffffffffffe1f80, float:NaN)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            r10 = 2048(0x800, float:2.87E-42)
            if (r7 >= r10) goto L_0x0120
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0120:
            if (r11 <= r7) goto L_0x0123
            goto L_0x0129
        L_0x0123:
            if (r12 < r7) goto L_0x0129
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0129:
            int r10 = r4 + 1
            if (r4 != r6) goto L_0x012f
            goto L_0x01f4
        L_0x012f:
            if (r7 == r8) goto L_0x0147
            if (r7 == r9) goto L_0x0147
            if (r7 < 0) goto L_0x0139
            r4 = 31
            if (r4 >= r7) goto L_0x0142
        L_0x0139:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x013e
            goto L_0x0144
        L_0x013e:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x0144
        L_0x0142:
            r4 = 1
            goto L_0x0145
        L_0x0144:
            r4 = 0
        L_0x0145:
            if (r4 != 0) goto L_0x01f3
        L_0x0147:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x014e
            goto L_0x01f3
        L_0x014e:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x0154
            r13 = 1
            goto L_0x0155
        L_0x0154:
            r13 = 2
        L_0x0155:
            int r5 = r5 + r13
            int r3 = r3 + 3
            r4 = r10
            goto L_0x0014
        L_0x015b:
            int r7 = r7 >> 3
            if (r7 != r15) goto L_0x01f0
            int r7 = r3 + 3
            if (r2 > r7) goto L_0x0167
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x0167:
            byte r9 = r1[r3]
            int r10 = r3 + 1
            byte r10 = r1[r10]
            r14 = r10 & 192(0xc0, float:2.69E-43)
            if (r14 != r13) goto L_0x0173
            r14 = 1
            goto L_0x0174
        L_0x0173:
            r14 = 0
        L_0x0174:
            if (r14 != 0) goto L_0x017a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x017a:
            int r14 = r3 + 2
            byte r14 = r1[r14]
            r15 = r14 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0184
            r15 = 1
            goto L_0x0185
        L_0x0184:
            r15 = 0
        L_0x0185:
            if (r15 != 0) goto L_0x018b
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x018b:
            byte r7 = r1[r7]
            r15 = r7 & 192(0xc0, float:2.69E-43)
            if (r15 != r13) goto L_0x0193
            r13 = 1
            goto L_0x0194
        L_0x0193:
            r13 = 0
        L_0x0194:
            if (r13 != 0) goto L_0x019a
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x019a:
            r13 = 3678080(0x381f80, float:5.154088E-39)
            r7 = r7 ^ r13
            int r13 = r14 << 6
            r7 = r7 ^ r13
            int r10 = r10 << 12
            r7 = r7 ^ r10
            int r9 = r9 << 18
            r7 = r7 ^ r9
            r9 = 1114111(0x10ffff, float:1.561202E-39)
            if (r7 <= r9) goto L_0x01af
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01af:
            if (r11 <= r7) goto L_0x01b2
            goto L_0x01b7
        L_0x01b2:
            if (r12 < r7) goto L_0x01b7
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01b7:
            r9 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r9) goto L_0x01be
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01be:
            int r9 = r4 + 1
            if (r4 != r6) goto L_0x01c3
            goto L_0x01f4
        L_0x01c3:
            if (r7 == r8) goto L_0x01dd
            r4 = 13
            if (r7 == r4) goto L_0x01dd
            if (r7 < 0) goto L_0x01cf
            r4 = 31
            if (r4 >= r7) goto L_0x01d8
        L_0x01cf:
            r4 = 127(0x7f, float:1.78E-43)
            if (r4 <= r7) goto L_0x01d4
            goto L_0x01da
        L_0x01d4:
            r4 = 159(0x9f, float:2.23E-43)
            if (r4 < r7) goto L_0x01da
        L_0x01d8:
            r4 = 1
            goto L_0x01db
        L_0x01da:
            r4 = 0
        L_0x01db:
            if (r4 != 0) goto L_0x01f3
        L_0x01dd:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r7 != r4) goto L_0x01e3
            goto L_0x01f3
        L_0x01e3:
            r4 = 65536(0x10000, float:9.18355E-41)
            if (r7 >= r4) goto L_0x01e9
            r13 = 1
            goto L_0x01ea
        L_0x01e9:
            r13 = 2
        L_0x01ea:
            int r5 = r5 + r13
            int r3 = r3 + 4
            r4 = r9
            goto L_0x0014
        L_0x01f0:
            if (r4 != r6) goto L_0x01f3
            goto L_0x01f4
        L_0x01f3:
            r5 = -1
        L_0x01f4:
            java.lang.String r1 = "…]"
            r2 = 93
            java.lang.String r3 = "[size="
            r4 = -1
            if (r5 != r4) goto L_0x026e
            byte[] r4 = r0.f11959c
            int r4 = r4.length
            if (r4 > r6) goto L_0x0218
            java.lang.String r1 = "[hex="
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r3 = r17.i()
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x02c8
        L_0x0218:
            java.lang.StringBuilder r2 = a.a.d(r3)
            byte[] r3 = r0.f11959c
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " hex="
            r2.append(r3)
            byte[] r3 = r0.f11959c
            int r4 = r3.length
            if (r6 > r4) goto L_0x022e
            r4 = 1
            goto L_0x022f
        L_0x022e:
            r4 = 0
        L_0x022f:
            if (r4 == 0) goto L_0x024f
            int r4 = r3.length
            if (r6 != r4) goto L_0x0236
            r4 = r0
            goto L_0x0240
        L_0x0236:
            uf.i r4 = new uf.i
            r5 = 0
            byte[] r3 = nd.d.H(r3, r5, r6)
            r4.<init>(r3)
        L_0x0240:
            java.lang.String r3 = r4.i()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02c8
        L_0x024f:
            java.lang.String r1 = "endIndex > length("
            java.lang.StringBuilder r1 = a.a.d(r1)
            byte[] r2 = r0.f11959c
            int r2 = r2.length
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x026e:
            java.lang.String r4 = r17.r()
            r6 = 0
            java.lang.String r6 = r4.substring(r6, r5)
            java.lang.String r7 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            e6.e.C(r6, r7)
            java.lang.String r7 = "\\"
            java.lang.String r8 = "\\\\"
            java.lang.String r6 = fe.k.b1(r6, r7, r8)
            java.lang.String r7 = "\n"
            java.lang.String r8 = "\\n"
            java.lang.String r6 = fe.k.b1(r6, r7, r8)
            java.lang.String r7 = "\r"
            java.lang.String r8 = "\\r"
            java.lang.String r6 = fe.k.b1(r6, r7, r8)
            int r4 = r4.length()
            if (r5 >= r4) goto L_0x02b4
            java.lang.StringBuilder r2 = a.a.d(r3)
            byte[] r3 = r0.f11959c
            int r3 = r3.length
            r2.append(r3)
            java.lang.String r3 = " text="
            r2.append(r3)
            r2.append(r6)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            goto L_0x02c8
        L_0x02b4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "[text="
            r1.append(r3)
            r1.append(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L_0x02c8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uf.i.toString():java.lang.String");
    }
}
