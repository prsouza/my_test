package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class XXHash32JNI extends XXHash32 {
    public static final XXHash32 INSTANCE = new XXHash32JNI();
    private static XXHash32 SAFE_INSTANCE;

    public int hash(byte[] bArr, int i, int i10, int i11) {
        SafeUtils.checkRange(bArr, i, i10);
        return XXHashJNI.XXH32(bArr, i, i10, i11);
    }

    public int hash(ByteBuffer byteBuffer, int i, int i10, int i11) {
        if (byteBuffer.isDirect()) {
            ByteBufferUtils.checkRange(byteBuffer, i, i10);
            return XXHashJNI.XXH32BB(byteBuffer, i, i10, i11);
        } else if (byteBuffer.hasArray()) {
            return hash(byteBuffer.array(), byteBuffer.arrayOffset() + i, i10, i11);
        } else {
            XXHash32 xXHash32 = SAFE_INSTANCE;
            if (xXHash32 == null) {
                xXHash32 = XXHashFactory.safeInstance().hash32();
                SAFE_INSTANCE = xXHash32;
            }
            return xXHash32.hash(byteBuffer, i, i10, i11);
        }
    }
}
