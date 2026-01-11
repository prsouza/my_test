package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash64JNI extends XXHash64 {
    public static final XXHash64 INSTANCE = new XXHash64JNI();
    private static XXHash64 SAFE_INSTANCE;

    public long hash(byte[] bArr, int i, int i10, long j10) {
        SafeUtils.checkRange(bArr, i, i10);
        return XXHashJNI.XXH64(bArr, i, i10, j10);
    }

    public long hash(ByteBuffer byteBuffer, int i, int i10, long j10) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i, i10);
            return XXHashJNI.XXH64BB(byteBuffer, i, i10, j10);
        } else if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10, j10);
        } else {
            XXHash64 xXHash64 = SAFE_INSTANCE;
            if (xXHash64 == null) {
                xXHash64 = XXHashFactory.safeInstance().hash64();
                SAFE_INSTANCE = xXHash64;
            }
            return xXHash64.hash(byteBuffer, i, i10, j10);
        }
    }
}
