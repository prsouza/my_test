package net.jpountz.lz4;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

enum LZ4JNI {
    ;

    /* access modifiers changed from: public */
    static {
        Native.load();
        init();
    }

    public static native int LZ4_compressBound(int i);

    public static native int LZ4_compressHC(byte[] bArr, ByteBuffer byteBuffer, int i, int i10, byte[] bArr2, ByteBuffer byteBuffer2, int i11, int i12, int i13);

    public static native int LZ4_compress_limitedOutput(byte[] bArr, ByteBuffer byteBuffer, int i, int i10, byte[] bArr2, ByteBuffer byteBuffer2, int i11, int i12);

    public static native int LZ4_decompress_fast(byte[] bArr, ByteBuffer byteBuffer, int i, byte[] bArr2, ByteBuffer byteBuffer2, int i10, int i11);

    public static native int LZ4_decompress_safe(byte[] bArr, ByteBuffer byteBuffer, int i, int i10, byte[] bArr2, ByteBuffer byteBuffer2, int i11, int i12);

    public static native void init();
}
