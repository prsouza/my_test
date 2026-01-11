package net.jpountz.lz4;

@Deprecated
public interface LZ4UnknownSizeDecompressor {
    int decompress(byte[] bArr, int i, int i10, byte[] bArr2, int i11);

    int decompress(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12);
}
