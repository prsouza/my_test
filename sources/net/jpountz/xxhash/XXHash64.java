package net.jpountz.xxhash;

import java.nio.ByteBuffer;

public abstract class XXHash64 {
    public abstract long hash(ByteBuffer byteBuffer, int i, int i10, long j10);

    public final long hash(ByteBuffer byteBuffer, long j10) {
        long hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }

    public abstract long hash(byte[] bArr, int i, int i10, long j10);

    public String toString() {
        return getClass().getSimpleName();
    }
}
