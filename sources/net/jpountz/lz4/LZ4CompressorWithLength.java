package net.jpountz.lz4;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class LZ4CompressorWithLength {
    private final LZ4Compressor compressor;

    public LZ4CompressorWithLength(LZ4Compressor lZ4Compressor) {
        this.compressor = lZ4Compressor;
    }

    private void putOriginalLength(byte[] bArr, int i, int i10) {
        bArr[i] = (byte) i10;
        bArr[i + 1] = (byte) (i10 >> 8);
        bArr[i + 2] = (byte) (i10 >> 16);
        bArr[i + 3] = (byte) (i10 >> 24);
    }

    public byte[] compress(byte[] bArr) {
        return compress(bArr, 0, bArr.length);
    }

    public int maxCompressedLength(int i) {
        return this.compressor.maxCompressedLength(i) + 4;
    }

    public byte[] compress(byte[] bArr, int i, int i10) {
        byte[] bArr2 = new byte[maxCompressedLength(i10)];
        return Arrays.copyOf(bArr2, compress(bArr, i, i10, bArr2, 0));
    }

    private void putOriginalLength(ByteBuffer byteBuffer, int i, int i10) {
        byteBuffer.put(i, (byte) i10);
        byteBuffer.put(i + 1, (byte) (i10 >> 8));
        byteBuffer.put(i + 2, (byte) (i10 >> 16));
        byteBuffer.put(i + 3, (byte) (i10 >> 24));
    }

    public int compress(byte[] bArr, byte[] bArr2) {
        return compress(bArr, 0, bArr.length, bArr2, 0);
    }

    public int compress(byte[] bArr, int i, int i10, byte[] bArr2, int i11) {
        return compress(bArr, i, i10, bArr2, i11, bArr2.length - i11);
    }

    public int compress(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12) {
        int compress = this.compressor.compress(bArr, i, i10, bArr2, i11 + 4, i12 - 4);
        putOriginalLength(bArr2, i11, i10);
        return compress + 4;
    }

    public void compress(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int compress = compress(byteBuffer, byteBuffer.position(), byteBuffer.remaining(), byteBuffer2, byteBuffer2.position(), byteBuffer2.remaining());
        byteBuffer.position(byteBuffer.limit());
        byteBuffer2.position(byteBuffer2.position() + compress);
    }

    public int compress(ByteBuffer byteBuffer, int i, int i10, ByteBuffer byteBuffer2, int i11, int i12) {
        int compress = this.compressor.compress(byteBuffer, i, i10, byteBuffer2, i11 + 4, i12 - 4);
        putOriginalLength(byteBuffer2, i11, i10);
        return compress + 4;
    }
}
