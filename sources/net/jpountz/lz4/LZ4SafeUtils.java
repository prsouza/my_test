package net.jpountz.lz4;

import b9.m;
import net.jpountz.util.SafeUtils;

enum LZ4SafeUtils {
    ;

    public static class Match {
        public int len;
        public int ref;
        public int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static int commonBytes(byte[] bArr, int i, int i10, int i11) {
        int i12 = 0;
        while (i10 < i11) {
            int i13 = i + 1;
            int i14 = i10 + 1;
            if (bArr[i] != bArr[i10]) {
                break;
            }
            i12++;
            i = i13;
            i10 = i14;
        }
        return i12;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i10, int i11, int i12) {
        int i13 = 0;
        while (i > i11 && i10 > i12) {
            i--;
            i10--;
            if (bArr[i] != bArr[i10]) {
                break;
            }
            i13++;
        }
        return i13;
    }

    public static void copy8Bytes(byte[] bArr, int i, byte[] bArr2, int i10) {
        for (int i11 = 0; i11 < 8; i11++) {
            bArr2[i10 + i11] = bArr[i + i11];
        }
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(byte[] bArr, int i, int i10, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i10 - i;
        int i18 = i13 + 1;
        if (i18 + i17 + 8 + (i17 >>> 8) <= i14) {
            if (i17 >= 15) {
                i15 = -16;
                i18 = writeLen(i17 - 15, bArr2, i18);
            } else {
                i15 = i17 << 4;
            }
            wildArraycopy(bArr, i, bArr2, i18, i17);
            int i19 = i18 + i17;
            int i20 = i10 - i11;
            int i21 = i19 + 1;
            bArr2[i19] = (byte) i20;
            int i22 = i21 + 1;
            bArr2[i21] = (byte) (i20 >>> 8);
            int i23 = i12 - 4;
            if (i22 + 6 + (i23 >>> 8) <= i14) {
                if (i23 >= 15) {
                    i16 = i15 | 15;
                    i22 = writeLen(i23 - 15, bArr2, i22);
                } else {
                    i16 = i15 | i23;
                }
                bArr2[i13] = (byte) i16;
                return i22;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    public static int hash(byte[] bArr, int i) {
        return LZ4Utils.hash(SafeUtils.readInt(bArr, i));
    }

    public static int hash64k(byte[] bArr, int i) {
        return LZ4Utils.hash64k(SafeUtils.readInt(bArr, i));
    }

    public static int lastLiterals(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12) {
        int i13;
        if ((((i10 + 255) - 15) / 255) + i11 + i10 + 1 <= i12) {
            if (i10 >= 15) {
                bArr2[i11] = -16;
                i13 = writeLen(i10 - 15, bArr2, i11 + 1);
            } else {
                bArr2[i11] = (byte) (i10 << 4);
                i13 = i11 + 1;
            }
            System.arraycopy(bArr, i, bArr2, i13, i10);
            return i13 + i10;
        }
        throw new LZ4Exception();
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i10) {
        return bArr[i] == bArr[i10] && bArr[i + 1] == bArr[i10 + 1] && bArr[i + 2] == bArr[i10 + 2] && bArr[i + 3] == bArr[i10 + 3];
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        System.arraycopy(bArr, i, bArr2, i10, i11);
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            bArr[i10 + i12] = bArr[i + i12];
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            try {
                copy8Bytes(bArr, i + i12, bArr2, i10 + i12);
                i12 += 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new LZ4Exception(m.b("Malformed input at offset ", i));
            }
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i10, int i11) {
        do {
            copy8Bytes(bArr, i, bArr, i10);
            i += 8;
            i10 += 8;
        } while (i10 < i11);
    }

    public static int writeLen(int i, byte[] bArr, int i10) {
        while (i >= 255) {
            bArr[i10] = -1;
            i -= 255;
            i10++;
        }
        int i11 = i10 + 1;
        bArr[i10] = (byte) i;
        return i11;
    }
}
