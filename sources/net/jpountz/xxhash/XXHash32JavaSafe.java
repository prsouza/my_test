package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash32JavaSafe extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JavaSafe();

    public int hash(byte[] bArr, int i, int i10, int i11) {
        int i12;
        int rotateLeft;
        SafeUtils.checkRange(bArr, i, i10);
        int i13 = i + i10;
        if (i10 >= 16) {
            int i14 = i13 - 16;
            int i15 = i11 + XXHashConstants.PRIME1 + XXHashConstants.PRIME2;
            int i16 = i11 + XXHashConstants.PRIME2;
            int i17 = i11 + 0;
            int i18 = i11 - XXHashConstants.PRIME1;
            while (true) {
                rotateLeft = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i) * XXHashConstants.PRIME2) + i15, 13) * XXHashConstants.PRIME1;
                int i19 = i + 4;
                i16 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i19) * XXHashConstants.PRIME2) + i16, 13) * XXHashConstants.PRIME1;
                int i20 = i19 + 4;
                i17 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i20) * XXHashConstants.PRIME2) + i17, 13) * XXHashConstants.PRIME1;
                int i21 = i20 + 4;
                i18 = Integer.rotateLeft((SafeUtils.readIntLE(bArr, i21) * XXHashConstants.PRIME2) + i18, 13) * XXHashConstants.PRIME1;
                i = i21 + 4;
                if (i > i14) {
                    break;
                }
                i15 = rotateLeft;
            }
            i12 = Integer.rotateLeft(i18, 18) + Integer.rotateLeft(i17, 12) + Integer.rotateLeft(i16, 7) + Integer.rotateLeft(rotateLeft, 1);
        } else {
            i12 = i11 + XXHashConstants.PRIME5;
        }
        int i22 = i12 + i10;
        while (i <= i13 - 4) {
            i22 = XXHashConstants.PRIME4 * Integer.rotateLeft((SafeUtils.readIntLE(bArr, i) * XXHashConstants.PRIME3) + i22, 17);
            i += 4;
        }
        while (i < i13) {
            i22 = Integer.rotateLeft(((SafeUtils.readByte(bArr, i) & 255) * XXHashConstants.PRIME5) + i22, 11) * XXHashConstants.PRIME1;
            i++;
        }
        int i23 = ((i22 >>> 15) ^ i22) * XXHashConstants.PRIME2;
        int i24 = (i23 ^ (i23 >>> 13)) * XXHashConstants.PRIME3;
        return i24 ^ (i24 >>> 16);
    }

    public int hash(ByteBuffer byteBuffer, int i, int i10, int i11) {
        int i12;
        int rotateLeft;
        if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10, i11);
        }
        ByteBufferUtils.checkRange(byteBuffer, i, i10);
        ByteBuffer inLittleEndianOrder = ByteBufferUtils.inLittleEndianOrder(byteBuffer);
        int i13 = i + i10;
        if (i10 >= 16) {
            int i14 = i13 - 16;
            int i15 = i11 + XXHashConstants.PRIME1 + XXHashConstants.PRIME2;
            int i16 = i11 + XXHashConstants.PRIME2;
            int i17 = i11 + 0;
            int i18 = i11 - XXHashConstants.PRIME1;
            while (true) {
                rotateLeft = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i) * XXHashConstants.PRIME2) + i15, 13) * XXHashConstants.PRIME1;
                int i19 = i + 4;
                i16 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i19) * XXHashConstants.PRIME2) + i16, 13) * XXHashConstants.PRIME1;
                int i20 = i19 + 4;
                i17 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i20) * XXHashConstants.PRIME2) + i17, 13) * XXHashConstants.PRIME1;
                int i21 = i20 + 4;
                i18 = Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i21) * XXHashConstants.PRIME2) + i18, 13) * XXHashConstants.PRIME1;
                i = i21 + 4;
                if (i > i14) {
                    break;
                }
                i15 = rotateLeft;
            }
            i12 = Integer.rotateLeft(i18, 18) + Integer.rotateLeft(i17, 12) + Integer.rotateLeft(i16, 7) + Integer.rotateLeft(rotateLeft, 1);
        } else {
            i12 = i11 + XXHashConstants.PRIME5;
        }
        int i22 = i12 + i10;
        while (i <= i13 - 4) {
            i22 = XXHashConstants.PRIME4 * Integer.rotateLeft((ByteBufferUtils.readIntLE(inLittleEndianOrder, i) * XXHashConstants.PRIME3) + i22, 17);
            i += 4;
        }
        while (i < i13) {
            i22 = Integer.rotateLeft(((ByteBufferUtils.readByte(inLittleEndianOrder, i) & 255) * XXHashConstants.PRIME5) + i22, 11) * XXHashConstants.PRIME1;
            i++;
        }
        int i23 = ((i22 >>> 15) ^ i22) * XXHashConstants.PRIME2;
        int i24 = (i23 ^ (i23 >>> 13)) * XXHashConstants.PRIME3;
        return i24 ^ (i24 >>> 16);
    }
}
