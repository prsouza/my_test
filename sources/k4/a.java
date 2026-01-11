package k4;

import java.util.Arrays;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final char[] f7432a;

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f7433b;

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f7434c;

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f7435d;

    /* renamed from: e  reason: collision with root package name */
    public static final int[] f7436e;

    static {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        f7432a = charArray;
        int length = charArray.length;
        f7433b = new byte[length];
        for (int i = 0; i < length; i++) {
            f7433b[i] = (byte) f7432a[i];
        }
        int[] iArr = new int[256];
        for (int i10 = 0; i10 < 32; i10++) {
            iArr[i10] = -1;
        }
        iArr[34] = 1;
        iArr[92] = 1;
        int[] iArr2 = new int[256];
        System.arraycopy(iArr, 0, iArr2, 0, 256);
        for (int i11 = 128; i11 < 256; i11++) {
            iArr2[i11] = (i11 & 224) == 192 ? 2 : (i11 & 240) == 224 ? 3 : (i11 & 248) == 240 ? 4 : -1;
        }
        f7434c = iArr2;
        int[] iArr3 = new int[256];
        Arrays.fill(iArr3, -1);
        for (int i12 = 33; i12 < 256; i12++) {
            if (Character.isJavaIdentifierPart((char) i12)) {
                iArr3[i12] = 0;
            }
        }
        iArr3[64] = 0;
        iArr3[35] = 0;
        iArr3[42] = 0;
        iArr3[45] = 0;
        iArr3[43] = 0;
        int[] iArr4 = new int[256];
        System.arraycopy(iArr3, 0, iArr4, 0, 256);
        Arrays.fill(iArr4, 128, 128, 0);
        int[] iArr5 = new int[256];
        int[] iArr6 = f7434c;
        System.arraycopy(iArr6, 128, iArr5, 128, 128);
        Arrays.fill(iArr5, 0, 32, -1);
        iArr5[9] = 0;
        iArr5[10] = 10;
        iArr5[13] = 13;
        iArr5[42] = 42;
        int[] iArr7 = new int[256];
        System.arraycopy(iArr6, 128, iArr7, 128, 128);
        Arrays.fill(iArr7, 0, 32, -1);
        iArr7[32] = 1;
        iArr7[9] = 1;
        iArr7[10] = 10;
        iArr7[13] = 13;
        iArr7[47] = 47;
        iArr7[35] = 35;
        int[] iArr8 = new int[128];
        for (int i13 = 0; i13 < 32; i13++) {
            iArr8[i13] = -1;
        }
        iArr8[34] = 34;
        iArr8[92] = 92;
        iArr8[8] = 98;
        iArr8[9] = 116;
        iArr8[12] = 102;
        iArr8[10] = 110;
        iArr8[13] = 114;
        f7435d = iArr8;
        int[] iArr9 = new int[256];
        f7436e = iArr9;
        Arrays.fill(iArr9, -1);
        for (int i14 = 0; i14 < 10; i14++) {
            f7436e[i14 + 48] = i14;
        }
        for (int i15 = 0; i15 < 6; i15++) {
            int[] iArr10 = f7436e;
            int i16 = i15 + 10;
            iArr10[i15 + 97] = i16;
            iArr10[i15 + 65] = i16;
        }
    }

    public static void a(StringBuilder sb2, String str) {
        int[] iArr = f7435d;
        int length = iArr.length;
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            char charAt = str.charAt(i);
            if (charAt >= length || iArr[charAt] == 0) {
                sb2.append(charAt);
            } else {
                sb2.append('\\');
                int i10 = iArr[charAt];
                if (i10 < 0) {
                    sb2.append('u');
                    sb2.append('0');
                    sb2.append('0');
                    char[] cArr = f7432a;
                    sb2.append(cArr[charAt >> 4]);
                    sb2.append(cArr[charAt & 15]);
                } else {
                    sb2.append((char) i10);
                }
            }
        }
    }
}
