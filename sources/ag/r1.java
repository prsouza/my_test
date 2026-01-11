package ag;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public final class r1 extends u1 {

    /* renamed from: c  reason: collision with root package name */
    public int f438c;

    /* renamed from: s  reason: collision with root package name */
    public int f439s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f440t = false;

    /* renamed from: u  reason: collision with root package name */
    public boolean f441u = true;

    public r1(InputStream inputStream, int i) throws IOException {
        super(inputStream, i);
        this.f438c = inputStream.read();
        int read = inputStream.read();
        this.f439s = read;
        if (read >= 0) {
            c();
            return;
        }
        throw new EOFException();
    }

    public final boolean c() {
        if (!this.f440t && this.f441u && this.f438c == 0 && this.f439s == 0) {
            this.f440t = true;
            a();
        }
        return this.f440t;
    }

    public final int read() throws IOException {
        if (c()) {
            return -1;
        }
        int read = this.f452a.read();
        if (read >= 0) {
            int i = this.f438c;
            this.f438c = this.f439s;
            this.f439s = read;
            return i;
        }
        throw new EOFException();
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (this.f441u || i10 < 3) {
            return super.read(bArr, i, i10);
        }
        if (this.f440t) {
            return -1;
        }
        int read = this.f452a.read(bArr, i + 2, i10 - 2);
        if (read >= 0) {
            bArr[i] = (byte) this.f438c;
            bArr[i + 1] = (byte) this.f439s;
            this.f438c = this.f452a.read();
            int read2 = this.f452a.read();
            this.f439s = read2;
            if (read2 >= 0) {
                return read + 2;
            }
            throw new EOFException();
        }
        throw new EOFException();
    }
}
