package net.jpountz.lz4;

import a.a;
import java.nio.ByteBuffer;
import net.jpountz.util.ByteBufferUtils;
import net.jpountz.util.SafeUtils;

final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    public static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    public final int decompress(byte[] bArr, int i, int i10, byte[] bArr2, int i11, int i12) {
        SafeUtils.checkRange(bArr, i, i10);
        SafeUtils.checkRange(bArr2, i11, i12);
        int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, (ByteBuffer) null, i, i10, bArr2, (ByteBuffer) null, i11, i12);
        if (LZ4_decompress_safe >= 0) {
            return LZ4_decompress_safe;
        }
        StringBuilder d10 = a.d("Error decoding offset ");
        d10.append(i - LZ4_decompress_safe);
        d10.append(" of input buffer");
        throw new LZ4Exception(d10.toString());
    }

    public int decompress(ByteBuffer byteBuffer, int i, int i10, ByteBuffer byteBuffer2, int i11, int i12) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        int i13;
        int i14;
        ByteBuffer byteBuffer4;
        byte[] bArr2;
        ByteBufferUtils.checkNotReadOnly(byteBuffer2);
        ByteBufferUtils.checkRange(byteBuffer, i, i10);
        ByteBufferUtils.checkRange(byteBuffer2, i11, i12);
        if ((byteBuffer.hasArray() || byteBuffer.isDirect()) && (byteBuffer2.hasArray() || byteBuffer2.isDirect())) {
            if (byteBuffer.hasArray()) {
                byte[] array = byteBuffer.array();
                i13 = byteBuffer.arrayOffset() + i;
                bArr = array;
                byteBuffer3 = null;
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
            int LZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i13, i10, bArr2, byteBuffer4, i14, i12);
            if (LZ4_decompress_safe >= 0) {
                return LZ4_decompress_safe;
            }
            StringBuilder d10 = a.d("Error decoding offset ");
            d10.append(i13 - LZ4_decompress_safe);
            d10.append(" of input buffer");
            throw new LZ4Exception(d10.toString());
        }
        LZ4SafeDecompressor lZ4SafeDecompressor = SAFE_INSTANCE;
        if (lZ4SafeDecompressor == null) {
            lZ4SafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
            SAFE_INSTANCE = lZ4SafeDecompressor;
        }
        return lZ4SafeDecompressor.decompress(byteBuffer, i, i10, byteBuffer2, i11, i12);
    }
}
