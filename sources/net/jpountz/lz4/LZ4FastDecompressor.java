package net.jpountz.lz4;

import java.nio.ByteBuffer;

public abstract class LZ4FastDecompressor implements LZ4Decompressor {
    public abstract int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, int i11);

    public abstract int decompress(byte[] bArr, int i, byte[] bArr2, int i10, int i11);

    public final int decompress(byte[] bArr, byte[] bArr2, int i) {
        return decompress(bArr, 0, bArr2, 0, i);
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final int decompress(byte[] bArr, byte[] bArr2) {
        return decompress(bArr, bArr2, bArr2.length);
    }

    public final byte[] decompress(byte[] bArr, int i, int i10) {
        byte[] bArr2 = new byte[i10];
        decompress(bArr, i, bArr2, 0, i10);
        return bArr2;
    }

    public final byte[] decompress(byte[] bArr, int i) {
        return decompress(bArr, 0, i);
    }

    public final void decompress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int decompress = decompress(byteBuffer, byteBuffer.position(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer2.position(byteBuffer2.limit());
        byteBuffer.position(byteBuffer.position() + decompress);
    }
}
