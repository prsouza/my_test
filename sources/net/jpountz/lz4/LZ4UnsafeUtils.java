package net.jpountz.lz4;

import java.nio.ByteOrder;
import net.jpountz.util.UnsafeUtils;
import net.jpountz.util.Utils;

enum LZ4UnsafeUtils {
    ;

    public static int commonBytes(byte[] bArr, int i, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (i10 <= i11 - 8) {
            if (UnsafeUtils.readLong(bArr, i10) == UnsafeUtils.readLong(bArr, i)) {
                i13 += 8;
                i += 8;
                i10 += 8;
            } else {
                if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
                    i12 = Long.numberOfLeadingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i10));
                } else {
                    i12 = Long.numberOfTrailingZeros(UnsafeUtils.readLong(bArr, i) ^ UnsafeUtils.readLong(bArr, i10));
                }
                return i13 + (i12 >>> 3);
            }
        }
        while (i10 < i11) {
            int i14 = i + 1;
            int i15 = i10 + 1;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i10)) {
                break;
            }
            i13++;
            i = i14;
            i10 = i15;
        }
        return i13;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i10, int i11, int i12) {
        int i13 = 0;
        while (i > i11 && i10 > i12) {
            i--;
            i10--;
            if (UnsafeUtils.readByte(bArr, i) != UnsafeUtils.readByte(bArr, i10)) {
                break;
            }
            i13++;
        }
        return i13;
    }

    public static int encodeSequence(byte[] bArr, int i, int i10, int i11, int i12, byte[] bArr2, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i10 - i;
        int i18 = i13 + 1;
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

    public static int lastLiterals(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12) {
        return LZ4SafeUtils.lastLiterals(bArr, i, i10, bArr2, i11, i12);
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i10) {
        return UnsafeUtils.readInt(bArr, i) == UnsafeUtils.readInt(bArr, i10);
    }

    public static int readShortLittleEndian(byte[] bArr, int i) {
        short readShort = UnsafeUtils.readShort(bArr, i);
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            readShort = Short.reverseBytes(readShort);
        }
        return readShort & 65535;
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        int i12 = i11 & -8;
        wildArraycopy(bArr, i, bArr2, i10, i12);
        int i13 = i11 & 7;
        for (int i14 = 0; i14 < i13; i14++) {
            UnsafeUtils.writeByte(bArr2, i10 + i12 + i14, UnsafeUtils.readByte(bArr, i + i12 + i14));
        }
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i10 + i12;
            int i14 = i + i12;
            bArr[i13] = bArr[i14];
            UnsafeUtils.writeByte(bArr, i13, UnsafeUtils.readByte(bArr, i14));
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12 += 8) {
            UnsafeUtils.writeLong(bArr2, i10 + i12, UnsafeUtils.readLong(bArr, i + i12));
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i10, int i11) {
        int i12 = i10 - i;
        if (i12 < 4) {
            int i13 = 0;
            for (int i14 = 0; i14 < 4; i14++) {
                UnsafeUtils.writeByte(bArr, i10 + i14, UnsafeUtils.readByte(bArr, i + i14));
            }
            int i15 = i10 + 4;
            int i16 = i + 4;
            int i17 = i15 - i16;
            if (i17 == 1) {
                i16 -= 3;
            } else if (i17 == 2) {
                i16 -= 2;
            } else if (i17 == 3) {
                i16 -= 3;
                i13 = -1;
            } else if (i17 == 5) {
                i13 = 1;
            } else if (i17 == 6) {
                i13 = 2;
            } else if (i17 == 7) {
                i13 = 3;
            }
            UnsafeUtils.writeInt(bArr, i15, UnsafeUtils.readInt(bArr, i16));
            i10 = i15 + 4;
            i = i16 - i13;
        } else if (i12 < 8) {
            UnsafeUtils.writeLong(bArr, i10, UnsafeUtils.readLong(bArr, i));
            i10 += i12;
        }
        while (i10 < i11) {
            UnsafeUtils.writeLong(bArr, i10, UnsafeUtils.readLong(bArr, i));
            i10 += 8;
            i += 8;
        }
    }

    public static int writeLen(int i, byte[] bArr, int i10) {
        while (i >= 255) {
            UnsafeUtils.writeByte(bArr, i10, 255);
            i -= 255;
            i10++;
        }
        int i11 = i10 + 1;
        UnsafeUtils.writeByte(bArr, i10, i);
        return i11;
    }

    public static void writeShortLittleEndian(byte[] bArr, int i, int i10) {
        short s10 = (short) i10;
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            s10 = Short.reverseBytes(s10);
        }
        UnsafeUtils.writeShort(bArr, i, s10);
    }
}
