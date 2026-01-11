package net.jpountz.util;

import java.nio.ByteOrder;

public enum SafeUtils {
    ;

    public static void checkLength(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("lengths must be >= 0");
        }
    }

    public static void checkRange(byte[] bArr, int i) {
        if (i < 0 || i >= bArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public static byte readByte(byte[] bArr, int i) {
        return bArr[i];
    }

    public static int readInt(byte[] bArr, int i) {
        if (Utils.NATIVE_BYTE_ORDER == ByteOrder.BIG_ENDIAN) {
            return readIntBE(bArr, i);
        }
        return readIntLE(bArr, i);
    }

    public static int readIntBE(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int readIntLE(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long readLongLE(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int readShort(short[] sArr, int i) {
        return sArr[i] & 65535;
    }

    public static int readShortLE(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    public static void writeByte(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) i10;
    }

    public static void writeInt(int[] iArr, int i, int i10) {
        iArr[i] = i10;
    }

    public static void writeShort(short[] sArr, int i, int i10) {
        sArr[i] = (short) i10;
    }

    public static void writeShortLE(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) i10;
        bArr[i + 1] = (byte) (i10 >>> 8);
    }

    public static void checkRange(byte[] bArr, int i, int i10) {
        checkLength(i10);
        if (i10 > 0) {
            checkRange(bArr, i);
            checkRange(bArr, (i + i10) - 1);
        }
    }

    public static int readInt(int[] iArr, int i) {
        return iArr[i];
    }
}
