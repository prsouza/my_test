package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNICompressor extends LZ4Compressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4JNICompressor();
    private static LZ4Compressor SAFE_INSTANCE;

    public int compress(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12) {
        SafeUtils.checkRange(bArr, i, i10);
        SafeUtils.checkRange(bArr2, i11, i12);
        int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, (ByteBuffer) null, i, i10, bArr2, (ByteBuffer) null, i11, i12);
        if (LZ4_compress_limitedOutput > 0) {
            return LZ4_compress_limitedOutput;
        }
        throw new LZ4Exception("maxDestLen is too small");
    }

    public int compress(ByteBuffer byteBuffer, int i, int i10, ByteBuffer byteBuffer2, int i11, int i12) {
        int i13;
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i14;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i10);
        ByteBufferUtils.checkRange(byteBuffer2, i11, i12);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                bArr = byteBuffer.array();
                byteBuffer3 = null;
                i13 = byteBuffer.arrayOffset() + i;
            } else {
                byteBuffer3 = byteBuffer;
                i13 = i;
                bArr = null;
            }
            if (byteBuffer2.hasArray()) {
                bArr2 = byteBuffer2.array();
                byteBuffer4 = null;
                i14 = byteBuffer2.arrayOffset() + i11;
            } else {
                byteBuffer4 = byteBuffer2;
                i14 = i11;
                bArr2 = null;
            }
            int LZ4_compress_limitedOutput = LZ4JNI.LZ4_compress_limitedOutput(bArr, byteBuffer3, i13, i10, bArr2, byteBuffer4, i14, i12);
            if (LZ4_compress_limitedOutput > 0) {
                return LZ4_compress_limitedOutput;
            }
            throw new LZ4Exception("maxDestLen is too small");
        }
        LZ4Compressor lZ4Compressor = SAFE_INSTANCE;
        if (lZ4Compressor == null) {
            lZ4Compressor = LZ4Factory.safeInstance().fastCompressor();
            SAFE_INSTANCE = lZ4Compressor;
        }
        return lZ4Compressor.compress(byteBuffer, i, i10, byteBuffer2, i11, i12);
    }
}
