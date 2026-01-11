package c4;

import a.a;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final long f3226a;

    /* renamed from: b  reason: collision with root package name */
    public int f3227b;

    public c(InputStream inputStream, long j10) {
        super(inputStream);
        this.f3226a = j10;
    }

    public final int a(int i) throws IOException {
        if (i >= 0) {
            this.f3227b += i;
        } else if (this.f3226a - ((long) this.f3227b) > 0) {
            StringBuilder d10 = a.d("Failed to read all expected data, expected: ");
            d10.append(this.f3226a);
            d10.append(", but read: ");
            d10.append(this.f3227b);
            throw new IOException(d10.toString());
        }
        return i;
    }

    public final synchronized int available() throws IOException {
        return (int) Math.max(this.f3226a - ((long) this.f3227b), (long) this.in.available());
    }

    public final synchronized int read() throws IOException {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i10) throws IOException {
        int read;
        read = super.read(bArr, i, i10);
        a(read);
        return read;
    }
}
