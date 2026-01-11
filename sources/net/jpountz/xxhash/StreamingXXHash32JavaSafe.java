package net.jpountz.xxhash;

import net.jpountz.util.SafeUtils;
import net.jpountz.xxhash.StreamingXXHash32;

final class StreamingXXHash32JavaSafe extends AbstractStreamingXXHash32Java {

    public static class Factory implements StreamingXXHash32.Factory {
        public static final StreamingXXHash32.Factory INSTANCE = new Factory();

        public StreamingXXHash32 newStreamingHash(int i) {
            return new StreamingXXHash32JavaSafe(i);
        }
    }

    public StreamingXXHash32JavaSafe(int i) {
        super(i);
    }

    public int getValue() {
        int i;
        if (this.totalLen >= 16) {
            i = Integer.rotateLeft(this.f8999v4, 18) + Integer.rotateLeft(this.f8998v3, 12) + Integer.rotateLeft(this.f8997v2, 7) + Integer.rotateLeft(this.f8996v1, 1);
        } else {
            i = this.seed + XXHashConstants.PRIME5;
        }
        int i10 = (int) (((long) i) + this.totalLen);
        int i11 = 0;
        while (i11 <= this.memSize - 4) {
            i10 = Integer.rotateLeft((SafeUtils.readIntLE(this.memory, i11) * XXHashConstants.PRIME3) + i10, 17) * XXHashConstants.PRIME4;
            i11 += 4;
        }
        while (i11 < this.memSize) {
            i10 = Integer.rotateLeft(((SafeUtils.readByte(this.memory, i11) & 255) * XXHashConstants.PRIME5) + i10, 11) * XXHashConstants.PRIME1;
            i11++;
        }
        int i12 = (i10 ^ (i10 >>> 15)) * XXHashConstants.PRIME2;
        int i13 = (i12 ^ (i12 >>> 13)) * XXHashConstants.PRIME3;
        return i13 ^ (i13 >>> 16);
    }

    public void update(byte[] bArr, int i, int i10) {
        SafeUtils.checkRange(bArr, i, i10);
        this.totalLen += (long) i10;
        int i11 = this.memSize;
        if (i11 + i10 < 16) {
            System.arraycopy(bArr, i, this.memory, i11, i10);
            this.memSize += i10;
            return;
        }
        int i12 = i10 + i;
        if (i11 > 0) {
            System.arraycopy(bArr, i, this.memory, i11, 16 - i11);
            int readIntLE = (SafeUtils.readIntLE(this.memory, 0) * XXHashConstants.PRIME2) + this.f8996v1;
            this.f8996v1 = readIntLE;
            this.f8996v1 = Integer.rotateLeft(readIntLE, 13) * XXHashConstants.PRIME1;
            int readIntLE2 = (SafeUtils.readIntLE(this.memory, 4) * XXHashConstants.PRIME2) + this.f8997v2;
            this.f8997v2 = readIntLE2;
            this.f8997v2 = Integer.rotateLeft(readIntLE2, 13) * XXHashConstants.PRIME1;
            int readIntLE3 = (SafeUtils.readIntLE(this.memory, 8) * XXHashConstants.PRIME2) + this.f8998v3;
            this.f8998v3 = readIntLE3;
            this.f8998v3 = Integer.rotateLeft(readIntLE3, 13) * XXHashConstants.PRIME1;
            int readIntLE4 = (SafeUtils.readIntLE(this.memory, 12) * XXHashConstants.PRIME2) + this.f8999v4;
            this.f8999v4 = readIntLE4;
            this.f8999v4 = Integer.rotateLeft(readIntLE4, 13) * XXHashConstants.PRIME1;
            i += 16 - this.memSize;
            this.memSize = 0;
        }
        int i13 = i12 - 16;
        int i14 = this.f8996v1;
        int i15 = this.f8997v2;
        int i16 = this.f8998v3;
        int i17 = this.f8999v4;
        while (i <= i13) {
            i14 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i) * XXHashConstants.PRIME2) + i14, 13) * XXHashConstants.PRIME1;
            int i18 = i + 4;
            i15 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i18) * XXHashConstants.PRIME2) + i15, 13) * XXHashConstants.PRIME1;
            int i19 = i18 + 4;
            i16 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i19) * XXHashConstants.PRIME2) + i16, 13) * XXHashConstants.PRIME1;
            int i20 = i19 + 4;
            i17 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i20) * XXHashConstants.PRIME2) + i17, 13) * XXHashConstants.PRIME1;
            i = i20 + 4;
        }
        this.f8996v1 = i14;
        this.f8997v2 = i15;
        this.f8998v3 = i16;
        this.f8999v4 = i17;
        if (i < i12) {
            int i21 = i12 - i;
            System.arraycopy(bArr, i, this.memory, 0, i21);
            this.memSize = i21;
        }
    }
}
