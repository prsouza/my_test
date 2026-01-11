package net.jpountz.xxhash;

import a.a;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.UnsafeUtils;

final class XXHash64JavaUnsafe extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JavaUnsafe();

    public long hash(byte[] bArr, int i, int i10, long j10) {
        int i11;
        long j11;
        long rotateLeft;
        byte[] bArr2 = bArr;
        int i12 = i10;
        UnsafeUtils.checkRange(bArr, i, i10);
        int i13 = i + i12;
        if (i12 >= 32) {
            int i14 = i13 - 32;
            long j12 = j10 + XXHashConstants.PRIME64_1 + XXHashConstants.PRIME64_2;
            long j13 = j10 + XXHashConstants.PRIME64_2;
            long j14 = j10 + 0;
            long j15 = j10 - XXHashConstants.PRIME64_1;
            long j16 = j13;
            long j17 = j12;
            long j18 = -4417276706812531889L;
            int i15 = i;
            while (true) {
                j17 = Long.rotateLeft((UnsafeUtils.readLongLE(bArr2, i15) * j18) + j17, 31) * XXHashConstants.PRIME64_1;
                int i16 = i15 + 8;
                j16 = Long.rotateLeft((UnsafeUtils.readLongLE(bArr2, i16) * j18) + j16, 31) * XXHashConstants.PRIME64_1;
                int i17 = i16 + 8;
                j14 = Long.rotateLeft((UnsafeUtils.readLongLE(bArr2, i17) * j18) + j14, 31) * XXHashConstants.PRIME64_1;
                int i18 = i17 + 8;
                rotateLeft = Long.rotateLeft((UnsafeUtils.readLongLE(bArr2, i18) * XXHashConstants.PRIME64_2) + j15, 31) * XXHashConstants.PRIME64_1;
                i15 = i18 + 8;
                if (i15 > i14) {
                    break;
                }
                int i19 = i15;
                long j19 = rotateLeft;
                long j20 = j16;
                j18 = XXHashConstants.PRIME64_2;
                j15 = j19;
            }
            i11 = i15;
            j11 = ((a.b(rotateLeft, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1) ^ ((((((((((Long.rotateLeft(rotateLeft, 18) + (Long.rotateLeft(j14, 12) + (Long.rotateLeft(j16, 7) + Long.rotateLeft(j17, 1)))) ^ a.b(j17, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4) ^ a.b(j16, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4) ^ a.b(j14, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
        } else {
            j11 = j10 + XXHashConstants.PRIME64_5;
            i11 = i;
        }
        long j21 = j11 + ((long) i12);
        int i20 = i11;
        while (i20 <= i13 - 8) {
            j21 = (Long.rotateLeft(j21 ^ (Long.rotateLeft(UnsafeUtils.readLongLE(bArr2, i20) * XXHashConstants.PRIME64_2, 31) * XXHashConstants.PRIME64_1), 27) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
            i20 += 8;
        }
        if (i20 <= i13 - 4) {
            j21 = (Long.rotateLeft(j21 ^ ((((long) UnsafeUtils.readIntLE(bArr2, i20)) & 4294967295L) * XXHashConstants.PRIME64_1), 23) * XXHashConstants.PRIME64_2) + XXHashConstants.PRIME64_3;
            i20 += 4;
        }
        while (i20 < i13) {
            j21 = Long.rotateLeft(j21 ^ (((long) (UnsafeUtils.readByte(bArr2, i20) & 255)) * XXHashConstants.PRIME64_5), 11) * XXHashConstants.PRIME64_1;
            i20++;
        }
        long j22 = ((j21 >>> 33) ^ j21) * XXHashConstants.PRIME64_2;
        long j23 = (j22 ^ (j22 >>> 29)) * XXHashConstants.PRIME64_3;
        return j23 ^ (j23 >>> 32);
    }

    public long hash(ByteBuffer byteBuffer, int i, int i10, long j10) {
        int i11;
        long j11;
        long rotateLeft;
        int i12 = i10;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10, j10);
        }
        ByteBufferUtils.checkRange(byteBuffer, i, i10);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i13 = i + i12;
        if (i12 >= 32) {
            int i14 = i13 - 32;
            long j12 = j10 + XXHashConstants.PRIME64_1 + XXHashConstants.PRIME64_2;
            long j13 = j10 + XXHashConstants.PRIME64_2;
            long j14 = j10 + 0;
            long j15 = j10 - XXHashConstants.PRIME64_1;
            long j16 = j13;
            long j17 = j12;
            long j18 = -4417276706812531889L;
            int i15 = i;
            while (true) {
                j17 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i15) * j18) + j17, 31) * XXHashConstants.PRIME64_1;
                int i16 = i15 + 8;
                j16 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i16) * j18) + j16, 31) * XXHashConstants.PRIME64_1;
                int i17 = i16 + 8;
                j14 = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i17) * j18) + j14, 31) * XXHashConstants.PRIME64_1;
                int i18 = i17 + 8;
                rotateLeft = Long.rotateLeft((ByteBufferUtils.readLongLE(inLittleEndianOrder, i18) * j18) + j15, 31) * XXHashConstants.PRIME64_1;
                i15 = i18 + 8;
                if (i15 > i14) {
                    break;
                }
                int i19 = i15;
                long j19 = rotateLeft;
                long j20 = j16;
                j18 = XXHashConstants.PRIME64_2;
                j15 = j19;
            }
            i11 = i15;
            j11 = ((a.b(rotateLeft, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1) ^ ((((((((((Long.rotateLeft(rotateLeft, 18) + (Long.rotateLeft(j14, 12) + (Long.rotateLeft(j16, 7) + Long.rotateLeft(j17, 1)))) ^ a.b(j17, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4) ^ a.b(j16, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4) ^ a.b(j14, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
        } else {
            j11 = j10 + XXHashConstants.PRIME64_5;
            i11 = i;
        }
        long j21 = j11 + ((long) i12);
        int i20 = i11;
        while (i20 <= i13 - 8) {
            j21 = (Long.rotateLeft(j21 ^ (Long.rotateLeft(ByteBufferUtils.readLongLE(inLittleEndianOrder, i20) * XXHashConstants.PRIME64_2, 31) * XXHashConstants.PRIME64_1), 27) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
            i20 += 8;
        }
        if (i20 <= i13 - 4) {
            j21 = (Long.rotateLeft(j21 ^ ((((long) ByteBufferUtils.readIntLE(inLittleEndianOrder, i20)) & 4294967295L) * XXHashConstants.PRIME64_1), 23) * XXHashConstants.PRIME64_2) + XXHashConstants.PRIME64_3;
            i20 += 4;
        }
        while (i20 < i13) {
            j21 = Long.rotateLeft(j21 ^ (((long) (ByteBufferUtils.readByte(inLittleEndianOrder, i20) & 255)) * XXHashConstants.PRIME64_5), 11) * XXHashConstants.PRIME64_1;
            i20++;
        }
        long j22 = ((j21 >>> 33) ^ j21) * XXHashConstants.PRIME64_2;
        long j23 = (j22 ^ (j22 >>> 29)) * XXHashConstants.PRIME64_3;
        return j23 ^ (j23 >>> 32);
    }
}
