package net.jpountz.lz4;

import a.a;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i10, int i11) {
        SafeUtils.checkRange(bArr, i);
        SafeUtils.checkRange(bArr2, i10, i11);
        int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, (ByteBuffer) null, i, bArr2, (ByteBuffer) null, i10, i11);
        if (LZ4_decompress_fast >= 0) {
            return LZ4_decompress_fast;
        }
        StringBuilder d10 = a.d("Error decoding offset ");
        d10.append(i - LZ4_decompress_fast);
        d10.append(" of input buffer");
        throw new LZ4Exception(d10.toString());
    }

    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i10, int i11) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i12;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i);
        ByteBufferUtils.checkRange(byteBuffer2, i10, i11);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                byte[] array = byteBuffer.array();
                i += byteBuffer.arrayOffset();
                bArr = array;
                byteBuffer3 = null;
            } else {
                byteBuffer3 = byteBuffer;
                bArr = null;
            }
            if (byteBuffer2.hasArray()) {
                bArr2 = byteBuffer2.array();
                i12 = i10 + byteBuffer2.arrayOffset();
                byteBuffer4 = null;
            } else {
                byteBuffer4 = byteBuffer2;
                i12 = i10;
                bArr2 = null;
            }
            int LZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i, bArr2, byteBuffer4, i12, i11);
            if (LZ4_decompress_fast >= 0) {
                return LZ4_decompress_fast;
            }
            StringBuilder d10 = a.d("Error decoding offset ");
            d10.append(i - LZ4_decompress_fast);
            d10.append(" of input buffer");
            throw new LZ4Exception(d10.toString());
        }
        LZ4FastDecompressor lZ4FastDecompressor = SAFE_INSTANCE;
        if (lZ4FastDecompressor == null) {
            lZ4FastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
            SAFE_INSTANCE = lZ4FastDecompressor;
        }
        return lZ4FastDecompressor.decompress(byteBuffer, i, byteBuffer2, i10, i11);
    }
}
