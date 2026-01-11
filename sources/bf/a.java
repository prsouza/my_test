package bf;

import e6.e;
import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f2992a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final C0033a f2993b = new C0033a();

    /* renamed from: bf.a$a  reason: collision with other inner class name */
    public static final class C0033a {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f2994a;

        /* renamed from: b  reason: collision with root package name */
        public static final int[] f2995b = new int[256];

        static {
            int[] iArr = new int[256];
            f2994a = iArr;
            Arrays.fill(iArr, 0, 256, -1);
            for (int i = 0; i < 64; i++) {
                f2994a[b.f2996a[i]] = i;
            }
            f2994a[61] = -2;
            int[] iArr2 = f2995b;
            int length = iArr2.length;
            e.D(iArr2, "<this>");
            Arrays.fill(iArr2, 0, length, -1);
            for (int i10 = 0; i10 < 64; i10++) {
                f2995b[b.f2997b[i10]] = i10;
            }
            f2995b[61] = -2;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final char[] f2996a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

        /* renamed from: b  reason: collision with root package name */
        public static final char[] f2997b = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
    }

    public static final String a(byte[] bArr) {
        int i;
        int length = ((bArr.length + 2) / 3) * 4;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length;
        char[] cArr = b.f2996a;
        int i10 = ((length2 + 0) / 3) * 3;
        int i11 = i10 + 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i11) {
            int min = Math.min(i12 + i10, i11);
            int i14 = i12;
            int i15 = i13;
            while (i14 < min) {
                int i16 = i14 + 1;
                int i17 = i16 + 1;
                byte b10 = ((bArr[i14] & 255) << 16) | ((bArr[i16] & 255) << 8);
                int i18 = i17 + 1;
                byte b11 = b10 | (bArr[i17] & 255);
                int i19 = i15 + 1;
                char[] cArr2 = b.f2996a;
                bArr2[i15] = (byte) cArr2[(b11 >>> 18) & 63];
                int i20 = i19 + 1;
                bArr2[i19] = (byte) cArr2[(b11 >>> 12) & 63];
                int i21 = i20 + 1;
                bArr2[i20] = (byte) cArr2[(b11 >>> 6) & 63];
                i15 = i21 + 1;
                bArr2[i21] = (byte) cArr2[b11 & 63];
                i14 = i18;
            }
            int i22 = ((min - i12) / 3) * 4;
            i13 += i22;
            if (i22 != -1 || min >= length2) {
                i12 = min;
            } else {
                e.B((Object) null);
                throw null;
            }
        }
        if (i12 < length2) {
            int i23 = i12 + 1;
            byte b12 = bArr[i12] & 255;
            int i24 = i13 + 1;
            bArr2[i13] = (byte) cArr[b12 >> 2];
            if (i23 == length2) {
                int i25 = i24 + 1;
                bArr2[i24] = (byte) cArr[(b12 << 4) & 63];
                int i26 = i25 + 1;
                bArr2[i25] = 61;
                i = i26 + 1;
                bArr2[i26] = 61;
            } else {
                byte b13 = bArr[i23] & 255;
                int i27 = i24 + 1;
                bArr2[i24] = (byte) cArr[((b12 << 4) & 63) | (b13 >> 4)];
                int i28 = i27 + 1;
                bArr2[i27] = (byte) cArr[(b13 << 2) & 63];
                i = i28 + 1;
                bArr2[i28] = 61;
            }
            i13 = i;
        }
        if (i13 != length) {
            bArr2 = Arrays.copyOf(bArr2, i13);
            e.C(bArr2, "copyOf(this, newSize)");
        }
        return new String(bArr2, fe.a.f5086b);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c7, code lost:
        if (r0 == '=') goto L_0x00c9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] b(java.lang.String r18) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            e6.e.D(r0, r1)
            bf.a$a r1 = f2993b
            java.nio.charset.Charset r2 = fe.a.f5086b
            byte[] r0 = r0.getBytes(r2)
            java.lang.String r2 = "this as java.lang.String).getBytes(charset)"
            e6.e.C(r0, r2)
            java.util.Objects.requireNonNull(r1)
            int r1 = r0.length
            int r2 = r1 + 0
            r3 = 61
            if (r2 != 0) goto L_0x0020
            r1 = 0
            goto L_0x0044
        L_0x0020:
            r4 = 2
            if (r2 < r4) goto L_0x016b
            int r5 = r1 + -1
            byte r5 = r0[r5]
            char r5 = (char) r5
            if (r5 != r3) goto L_0x0033
            int r1 = r1 - r4
            byte r1 = r0[r1]
            char r1 = (char) r1
            if (r1 != r3) goto L_0x0031
            goto L_0x0034
        L_0x0031:
            r4 = 1
            goto L_0x0034
        L_0x0033:
            r4 = 0
        L_0x0034:
            if (r4 != 0) goto L_0x003c
            r1 = r2 & 3
            if (r1 == 0) goto L_0x003c
            int r4 = 4 - r1
        L_0x003c:
            int r2 = r2 + 3
            int r2 = r2 / 4
            int r2 = r2 * 3
            int r1 = r2 - r4
        L_0x0044:
            byte[] r2 = new byte[r1]
            int r4 = r0.length
            int[] r5 = bf.a.C0033a.f2994a
            r6 = 18
            r7 = 0
            r8 = 0
        L_0x004d:
            r9 = 0
            r10 = r6
        L_0x004f:
            r11 = 6
            if (r7 >= r4) goto L_0x011c
            if (r10 != r6) goto L_0x00b0
            int r12 = r7 + 4
            if (r12 >= r4) goto L_0x00b0
            int r12 = r4 - r7
            r12 = r12 & -4
            int r12 = r12 + r7
        L_0x005d:
            if (r7 >= r12) goto L_0x00ac
            int r13 = r7 + 1
            byte r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r5[r7]
            int r14 = r13 + 1
            byte r13 = r0[r13]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r5[r13]
            int r15 = r14 + 1
            byte r14 = r0[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r5[r14]
            int r16 = r15 + 1
            byte r15 = r0[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            r15 = r5[r15]
            r17 = r7 | r13
            r17 = r17 | r14
            r17 = r17 | r15
            if (r17 >= 0) goto L_0x008c
            int r16 = r16 + -4
            r7 = r16
            goto L_0x00ac
        L_0x008c:
            int r7 = r7 << 18
            int r13 = r13 << 12
            r7 = r7 | r13
            int r13 = r14 << 6
            r7 = r7 | r13
            r7 = r7 | r15
            int r13 = r8 + 1
            int r14 = r7 >> 16
            byte r14 = (byte) r14
            r2[r8] = r14
            int r8 = r13 + 1
            int r14 = r7 >> 8
            byte r14 = (byte) r14
            r2[r13] = r14
            int r13 = r8 + 1
            byte r7 = (byte) r7
            r2[r8] = r7
            r8 = r13
            r7 = r16
            goto L_0x005d
        L_0x00ac:
            if (r7 < r4) goto L_0x00b0
            goto L_0x011c
        L_0x00b0:
            int r12 = r7 + 1
            byte r7 = r0[r7]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r5[r7]
            if (r7 >= 0) goto L_0x00fc
            r5 = -2
            if (r7 != r5) goto L_0x00de
            if (r10 != r11) goto L_0x00c9
            if (r12 == r4) goto L_0x00cd
            int r5 = r12 + 1
            byte r0 = r0[r12]
            char r0 = (char) r0
            r12 = r5
            if (r0 != r3) goto L_0x00cd
        L_0x00c9:
            if (r10 == r6) goto L_0x00cd
            r0 = 1
            goto L_0x00ce
        L_0x00cd:
            r0 = 0
        L_0x00ce:
            r7 = r12
            if (r0 == 0) goto L_0x00d2
            goto L_0x011c
        L_0x00d2:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Input byte array has wrong 4-byte ending unit"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00de:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            int r12 = r12 + -1
            byte r0 = r0[r12]
            r2 = 16
            c3.k.T(r2)
            java.lang.String r0 = java.lang.Integer.toString(r0, r2)
            java.lang.String r2 = "toString(this, checkRadix(radix))"
            e6.e.C(r0, r2)
            java.lang.String r2 = "Illegal base64 character "
            java.lang.String r0 = e6.e.a0(r2, r0)
            r1.<init>(r0)
            throw r1
        L_0x00fc:
            int r7 = r7 << r10
            r9 = r9 | r7
            int r10 = r10 + -6
            if (r10 >= 0) goto L_0x0119
            int r7 = r8 + 1
            int r10 = r9 >> 16
            byte r10 = (byte) r10
            r2[r8] = r10
            int r8 = r7 + 1
            int r10 = r9 >> 8
            byte r10 = (byte) r10
            r2[r7] = r10
            int r7 = r8 + 1
            byte r9 = (byte) r9
            r2[r8] = r9
            r8 = r7
            r7 = r12
            goto L_0x004d
        L_0x0119:
            r7 = r12
            goto L_0x004f
        L_0x011c:
            r0 = 1
            if (r10 == 0) goto L_0x013f
            if (r10 == r11) goto L_0x0136
            r3 = 12
            if (r10 == r3) goto L_0x0126
            goto L_0x0127
        L_0x0126:
            r0 = 0
        L_0x0127:
            if (r0 == 0) goto L_0x012a
            goto L_0x014d
        L_0x012a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Last unit does not have enough valid bits"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0136:
            int r0 = r8 + 1
            int r3 = r9 >> 16
            byte r3 = (byte) r3
            r2[r8] = r3
            r8 = r0
            goto L_0x014d
        L_0x013f:
            int r0 = r8 + 1
            int r3 = r9 >> 16
            byte r3 = (byte) r3
            r2[r8] = r3
            int r8 = r0 + 1
            int r3 = r9 >> 8
            byte r3 = (byte) r3
            r2[r0] = r3
        L_0x014d:
            if (r7 < r4) goto L_0x015b
            if (r8 == r1) goto L_0x015a
            byte[] r2 = java.util.Arrays.copyOf(r2, r8)
            java.lang.String r0 = "copyOf(this, newSize)"
            e6.e.C(r2, r0)
        L_0x015a:
            return r2
        L_0x015b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            java.lang.String r2 = "Input byte array has incorrect ending byte at "
            java.lang.String r1 = e6.e.a0(r2, r1)
            r0.<init>(r1)
            throw r0
        L_0x016b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Input byte[] should at least have 2 bytes for base64 bytes"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.a.b(java.lang.String):byte[]");
    }
}
