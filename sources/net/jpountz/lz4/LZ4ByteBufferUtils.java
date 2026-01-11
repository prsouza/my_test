package net.jpountz.lz4;

import b9.m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import net.jpountz.util.ByteBufferUtils;

enum LZ4ByteBufferUtils {
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

    public static int commonBytes(ByteBuffer byteBuffer, int i, int i10, int i11) {
        int i12;
        int i13 = 0;
        while (i10 <= i11 - 8) {
            if (ByteBufferUtils.readLong(byteBuffer, i10) == ByteBufferUtils.readLong(byteBuffer, i)) {
                i13 += 8;
                i += 8;
                i10 += 8;
            } else {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    i12 = Long.numberOfLeadingZeros(ByteBufferUtils.readLong(byteBuffer, i) ^ ByteBufferUtils.readLong(byteBuffer, i10));
                } else {
                    i12 = Long.numberOfTrailingZeros(ByteBufferUtils.readLong(byteBuffer, i) ^ ByteBufferUtils.readLong(byteBuffer, i10));
                }
                return i13 + (i12 >>> 3);
            }
        }
        while (i10 < i11) {
            int i14 = i + 1;
            int i15 = i10 + 1;
            if (ByteBufferUtils.readByte(byteBuffer, i) != ByteBufferUtils.readByte(byteBuffer, i10)) {
                break;
            }
            i13++;
            i = i14;
            i10 = i15;
        }
        return i13;
    }

    public static int commonBytesBackward(ByteBuffer byteBuffer, int i, int i10, int i11, int i12) {
        int i13 = 0;
        while (i > i11 && i10 > i12) {
            i--;
            i10--;
            if (byteBuffer.get(i) != byteBuffer.get(i10)) {
                break;
            }
            i13++;
        }
        return i13;
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(ByteBuffer byteBuffer, int i, int i10, int i11, int i12, ByteBuffer byteBuffer2, int i13, int i14) {
        int i15;
        int i16;
        int i17 = i10 - i;
        int i18 = i13 + 1;
        if (i18 + i17 + 8 + (i17 >>> 8) <= i14) {
            if (i17 >= 15) {
                i15 = -16;
                i18 = writeLen(i17 - 15, byteBuffer2, i18);
            } else {
                i15 = i17 << 4;
            }
            wildArraycopy(byteBuffer, i, byteBuffer2, i18, i17);
            int i19 = i18 + i17;
            int i20 = i10 - i11;
            int i21 = i19 + 1;
            byteBuffer2.put(i19, (byte) i20);
            int i22 = i21 + 1;
            byteBuffer2.put(i21, (byte) (i20 >>> 8));
            int i23 = i12 - 4;
            if (i22 + 6 + (i23 >>> 8) <= i14) {
                if (i23 >= 15) {
                    i16 = i15 | 15;
                    i22 = writeLen(i23 - 15, byteBuffer2, i22);
                } else {
                    i16 = i15 | i23;
                }
                byteBuffer2.put(i13, (byte) i16);
                return i22;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    public static int hash(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash(ByteBufferUtils.readInt(byteBuffer, i));
    }

    public static int hash64k(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash64k(ByteBufferUtils.readInt(byteBuffer, i));
    }

    public static int lastLiterals(ByteBuffer byteBuffer, int i, int i10, ByteBuffer byteBuffer2, int i11, int i12) {
        int i13;
        if ((((i10 + 255) - 15) / 255) + i11 + i10 + 1 <= i12) {
            if (i10 >= 15) {
                byteBuffer2.put(i11, (byte) -16);
                i13 = writeLen(i10 - 15, byteBuffer2, i11 + 1);
            } else {
                byteBuffer2.put(i11, (byte) (i10 << 4));
                i13 = i11 + 1;
            }
            safeArraycopy(byteBuffer, i, byteBuffer2, i13, i10);
            return i13 + i10;
        }
        throw new LZ4Exception();
    }

    public static boolean readIntEquals(ByteBuffer byteBuffer, int i, int i10) {
        return byteBuffer.getInt(i) == byteBuffer.getInt(i10);
    }

    public static void safeArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer2.put(i10 + i12, byteBuffer.get(i + i12));
        }
    }

    public static void safeIncrementalCopy(ByteBuffer byteBuffer, int i, int i10, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            byteBuffer.put(i10 + i12, byteBuffer.get(i + i12));
        }
    }

    public static void wildArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, int i11) {
        int i12 = 0;
        while (i12 < i11) {
            try {
                byteBuffer2.putLong(i10 + i12, byteBuffer.getLong(i + i12));
                i12 += 8;
            } catch (IndexOutOfBoundsException unused) {
                throw new LZ4Exception(m.b("Malformed input at offset ", i));
            }
        }
    }

    public static void wildIncrementalCopy(ByteBuffer byteBuffer, int i, int i10, int i11) {
        int i12 = i10 - i;
        if (i12 < 4) {
            int i13 = 0;
            for (int i14 = 0; i14 < 4; i14++) {
                ByteBufferUtils.writeByte(byteBuffer, i10 + i14, ByteBufferUtils.readByte(byteBuffer, i + i14));
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
            ByteBufferUtils.writeInt(byteBuffer, i15, ByteBufferUtils.readInt(byteBuffer, i16));
            i10 = i15 + 4;
            i = i16 - i13;
        } else if (i12 < 8) {
            ByteBufferUtils.writeLong(byteBuffer, i10, ByteBufferUtils.readLong(byteBuffer, i));
            i10 += i12;
        }
        while (i10 < i11) {
            ByteBufferUtils.writeLong(byteBuffer, i10, ByteBufferUtils.readLong(byteBuffer, i));
            i10 += 8;
            i += 8;
        }
    }

    public static int writeLen(int i, ByteBuffer byteBuffer, int i10) {
        while (i >= 255) {
            byteBuffer.put(i10, (byte) -1);
            i -= 255;
            i10++;
        }
        int i11 = i10 + 1;
        byteBuffer.put(i10, (byte) i);
        return i11;
    }
}
