package p3;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

public final class c0 extends MediaDataSource {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f9586a;

    public c0(ByteBuffer byteBuffer) {
        this.f9586a = byteBuffer;
    }

    public final void close() {
    }

    public final long getSize() {
        return (long) this.f9586a.limit();
    }

    public final int readAt(long j10, byte[] bArr, int i, int i10) {
        if (j10 >= ((long) this.f9586a.limit())) {
            return -1;
        }
        this.f9586a.position((int) j10);
        int min = Math.min(i10, this.f9586a.remaining());
        this.f9586a.get(bArr, i, min);
        return min;
    }
}
