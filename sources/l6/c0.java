package l6;

import java.io.IOException;
import java.io.InputStream;

public final class c0 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f7799a;

    /* renamed from: b  reason: collision with root package name */
    public long f7800b;

    public c0(InputStream inputStream, long j10) {
        this.f7799a = inputStream;
        this.f7800b = j10;
    }

    public final void close() throws IOException {
        super.close();
        this.f7799a.close();
        this.f7800b = 0;
    }

    public final int read() throws IOException {
        long j10 = this.f7800b;
        if (j10 <= 0) {
            return -1;
        }
        this.f7800b = j10 - 1;
        return this.f7799a.read();
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        long j10 = this.f7800b;
        if (j10 <= 0) {
            return -1;
        }
        int read = this.f7799a.read(bArr, i, (int) Math.min((long) i10, j10));
        if (read != -1) {
            this.f7800b -= (long) read;
        }
        return read;
    }
}
