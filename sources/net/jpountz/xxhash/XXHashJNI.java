package net.jpountz.xxhash;

import java.nio.ByteBuffer;
import net.jpountz.util.Native;

enum XXHashJNI {
    ;

    /* access modifiers changed from: public */
    static {
        Native.load();
        init();
    }

    public static native int XXH32(byte[] bArr, int i, int i10, int i11);

    public static native int XXH32BB(ByteBuffer byteBuffer, int i, int i10, int i11);

    public static native int XXH32_digest(long j10);

    public static native void XXH32_free(long j10);

    public static native long XXH32_init(int i);

    public static native void XXH32_update(long j10, byte[] bArr, int i, int i10);

    public static native long XXH64(byte[] bArr, int i, int i10, long j10);

    public static native long XXH64BB(ByteBuffer byteBuffer, int i, int i10, long j10);

    public static native long XXH64_digest(long j10);

    public static native void XXH64_free(long j10);

    public static native long XXH64_init(long j10);

    public static native void XXH64_update(long j10, byte[] bArr, int i, int i10);

    private static native void init();
}
