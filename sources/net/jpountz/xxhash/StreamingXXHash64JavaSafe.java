package net.jpountz.xxhash;

import a.a;
import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash64;

final class StreamingXXHash64JavaSafe extends AbstractStreamingXXHash64Java {

    public static class Factory implements StreamingXXHash64.Factory {
        public static final StreamingXXHash64.Factory INSTANCE = new Factory();

        public StreamingXXHash64 newStreamingHash(long j10) {
            return new StreamingXXHash64JavaSafe(j10);
        }
    }

    public StreamingXXHash64JavaSafe(long j10) {
        super(j10);
    }

    public long getValue() {
        long j10;
        int i;
        if (this.totalLen >= 32) {
            long j11 = this.f9000v1;
            long j12 = this.f9001v2;
            long j13 = this.f9002v3;
            long j14 = this.f9003v4;
            j10 = ((a.b(j14, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1) ^ (((a.b(j13, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1) ^ (((((((Long.rotateLeft(j14, 18) + (Long.rotateLeft(j13, 12) + (Long.rotateLeft(j12, 7) + Long.rotateLeft(j11, 1)))) ^ a.b(j11, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4) ^ a.b(j12, XXHashConstants.PRIME64_2, 31, XXHashConstants.PRIME64_1)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4)) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
        } else {
            j10 = this.seed + XXHashConstants.PRIME64_5;
        }
        long j15 = j10 + this.totalLen;
        int i10 = 0;
        while (true) {
            i = this.memSize;
            if (i10 > i - 8) {
                break;
            }
            j15 = (Long.rotateLeft(j15 ^ (Long.rotateLeft(SafeUtils.readLongLE(this.memory, i10) * XXHashConstants.PRIME64_2, 31) * XXHashConstants.PRIME64_1), 27) * XXHashConstants.PRIME64_1) + XXHashConstants.PRIME64_4;
            i10 += 8;
        }
        if (i10 <= i - 4) {
            j15 = (Long.rotateLeft(j15 ^ ((((long) SafeUtils.readIntLE(this.memory, i10)) & 4294967295L) * XXHashConstants.PRIME64_1), 23) * XXHashConstants.PRIME64_2) + XXHashConstants.PRIME64_3;
            i10 += 4;
        }
        while (i10 < this.memSize) {
            j15 = Long.rotateLeft(j15 ^ (((long) (this.memory[i10] & 255)) * XXHashConstants.PRIME64_5), 11) * XXHashConstants.PRIME64_1;
            i10++;
        }
        long j16 = (j15 ^ (j15 >>> 33)) * XXHashConstants.PRIME64_2;
        long j17 = (j16 ^ (j16 >>> 29)) * XXHashConstants.PRIME64_3;
        return j17 ^ (j17 >>> 32);
    }

    public void update(byte[] bArr, int i, int i10) {
        byte[] bArr2 = bArr;
        int i11 = i;
        int i12 = i10;
        SafeUtils.checkRange(bArr, i, i10);
        this.totalLen += (long) i12;
        int i13 = this.memSize;
        if (i13 + i12 < 32) {
            System.arraycopy(bArr2, i11, this.memory, i13, i12);
            this.memSize += i12;
            return;
        }
        int i14 = i12 + i11;
        if (i13 > 0) {
            System.arraycopy(bArr2, i11, this.memory, i13, 32 - i13);
            long readLongLE = this.f9000v1 + (SafeUtils.readLongLE(this.memory, 0) * XXHashConstants.PRIME64_2);
            this.f9000v1 = readLongLE;
            this.f9000v1 = Long.rotateLeft(readLongLE, 31) * XXHashConstants.PRIME64_1;
            long readLongLE2 = this.f9001v2 + (SafeUtils.readLongLE(this.memory, 8) * XXHashConstants.PRIME64_2);
            this.f9001v2 = readLongLE2;
            this.f9001v2 = Long.rotateLeft(readLongLE2, 31) * XXHashConstants.PRIME64_1;
            long readLongLE3 = this.f9002v3 + (SafeUtils.readLongLE(this.memory, 16) * XXHashConstants.PRIME64_2);
            this.f9002v3 = readLongLE3;
            this.f9002v3 = Long.rotateLeft(readLongLE3, 31) * XXHashConstants.PRIME64_1;
            long readLongLE4 = this.f9003v4 + (SafeUtils.readLongLE(this.memory, 24) * XXHashConstants.PRIME64_2);
            this.f9003v4 = readLongLE4;
            this.f9003v4 = Long.rotateLeft(readLongLE4, 31) * XXHashConstants.PRIME64_1;
            i11 += 32 - this.memSize;
            this.memSize = 0;
        }
        int i15 = i14 - 32;
        long j10 = this.f9000v1;
        long j11 = this.f9001v2;
        long j12 = this.f9002v3;
        long j13 = this.f9003v4;
        while (i11 <= i15) {
            j10 = Long.rotateLeft((SafeUtils.readLongLE(bArr2, i11) * XXHashConstants.PRIME64_2) + j10, 31) * XXHashConstants.PRIME64_1;
            int i16 = i11 + 8;
            j11 = Long.rotateLeft((SafeUtils.readLongLE(bArr2, i16) * XXHashConstants.PRIME64_2) + j11, 31) * XXHashConstants.PRIME64_1;
            int i17 = i16 + 8;
            j12 = Long.rotateLeft((SafeUtils.readLongLE(bArr2, i17) * XXHashConstants.PRIME64_2) + j12, 31) * XXHashConstants.PRIME64_1;
            int i18 = i17 + 8;
            j13 = Long.rotateLeft((SafeUtils.readLongLE(bArr2, i18) * XXHashConstants.PRIME64_2) + j13, 31) * XXHashConstants.PRIME64_1;
            i11 = i18 + 8;
        }
        this.f9000v1 = j10;
        this.f9001v2 = j11;
        this.f9002v3 = j12;
        this.f9003v4 = j13;
        if (i11 < i14) {
            int i19 = i14 - i11;
            System.arraycopy(bArr2, i11, this.memory, 0, i19);
            this.memSize = i19;
        }
    }
}
