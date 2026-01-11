package fa;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.security.SecureRandom;
import java.util.Arrays;

public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f5044a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteBuffer f5045b;

    public b(int i) {
        this.f5044a = ByteBuffer.allocateDirect(i);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i);
        this.f5045b = allocateDirect;
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[allocateDirect.capacity()];
        secureRandom.nextBytes(bArr);
        allocateDirect.put(bArr);
        Arrays.fill(bArr, (byte) 0);
    }

    public final byte a(int i) {
        if (i < this.f5044a.position()) {
            return (byte) (this.f5045b.get(i) ^ this.f5044a.get(i));
        }
        throw new IndexOutOfBoundsException();
    }

    public final void close() {
        this.f5044a.position(0);
        this.f5045b.position(0);
        this.f5044a.put(this.f5045b);
    }
}
