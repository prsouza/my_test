package c4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import net.jpountz.lz4.LZ4FrameOutputStream;

public final class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public int f3240a = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;

    public h(InputStream inputStream) {
        super(inputStream);
    }

    public final long a(long j10) {
        int i = this.f3240a;
        if (i == 0) {
            return -1;
        }
        return (i == Integer.MIN_VALUE || j10 <= ((long) i)) ? j10 : (long) i;
    }

    public final int available() throws IOException {
        int i = this.f3240a;
        if (i == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i, super.available());
    }

    public final void c(long j10) {
        int i = this.f3240a;
        if (i != Integer.MIN_VALUE && j10 != -1) {
            this.f3240a = (int) (((long) i) - j10);
        }
    }

    public final synchronized void mark(int i) {
        super.mark(i);
        this.f3240a = i;
    }

    public final int read() throws IOException {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        c(1);
        return read;
    }

    public final synchronized void reset() throws IOException {
        super.reset();
        this.f3240a = LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
    }

    public final long skip(long j10) throws IOException {
        long a10 = a(j10);
        if (a10 == -1) {
            return 0;
        }
        long skip = super.skip(a10);
        c(skip);
        return skip;
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int a10 = (int) a((long) i10);
        if (a10 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, a10);
        c((long) read);
        return read;
    }
}
