package net.jpountz.xxhash;

import java.nio.ByteBuffer;

public abstract class XXHash32 {
    public final int hash(ByteBuffer byteBuffer, int i) {
        int hash = hash(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), i);
        byteBuffer.position(byteBuffer.limit());
        return hash;
    }

    public abstract int hash(ByteBuffer byteBuffer, int i, int i10, int i11);

    public abstract int hash(byte[] bArr, int i, int i10, int i11);

    public String toString() {
        return getClass().getSimpleName();
    }
}
