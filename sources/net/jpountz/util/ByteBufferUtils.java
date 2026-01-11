package net.jpountz.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public enum ByteBufferUtils {
    ;

    public static void checkNotReadOnly(ByteBuffer byteBuffer) {
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
    }

    public static void checkRange(ByteBuffer byteBuffer, int i, int i10) {
        SafeUtils.checkLength(i10);
        if (i10 > 0) {
            checkRange(byteBuffer, i);
            checkRange(byteBuffer, (i + i10) - 1);
        }
    }

    public static ByteBuffer inLittleEndianOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        if (order.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static ByteBuffer inNativeByteOrder(ByteBuffer byteBuffer) {
        ByteOrder order = byteBuffer.order();
        ByteOrder byteOrder = Utils.NATIVE_BYTE_ORDER;
        if (order.equals(byteOrder)) {
            return byteBuffer;
        }
        return byteBuffer.duplicate().order(byteOrder);
    }

    public static byte readByte(ByteBuffer byteBuffer, int i) {
        return byteBuffer.get(i);
    }

    public static int readInt(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i);
    }

    public static int readIntLE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getInt(i);
    }

    public static long readLong(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getLong(i);
    }

    public static long readLongLE(ByteBuffer byteBuffer, int i) {
        return byteBuffer.getLong(i);
    }

    public static int readShortLE(ByteBuffer byteBuffer, int i) {
        return ((byteBuffer.get(i + 1) & 255) << 8) | (byteBuffer.get(i) & 255);
    }

    public static void writeByte(ByteBuffer byteBuffer, int i, int i10) {
        byteBuffer.put(i, (byte) i10);
    }

    public static void writeInt(ByteBuffer byteBuffer, int i, int i10) {
        byteBuffer.putInt(i, i10);
    }

    public static void writeLong(ByteBuffer byteBuffer, int i, long j10) {
        byteBuffer.putLong(i, j10);
    }

    public static void writeShortLE(ByteBuffer byteBuffer, int i, int i10) {
        byteBuffer.put(i, (byte) i10);
        byteBuffer.put(i + 1, (byte) (i10 >>> 8));
    }

    public static void checkRange(ByteBuffer byteBuffer, int i) {
        if (i < 0 || i >= byteBuffer.capacity()) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }
}
