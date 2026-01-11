package c4;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class d extends InputStream {

    /* renamed from: c  reason: collision with root package name */
    public static final Queue<d> f3228c = new ArrayDeque(0);

    /* renamed from: a  reason: collision with root package name */
    public InputStream f3229a;

    /* renamed from: b  reason: collision with root package name */
    public IOException f3230b;

    static {
        char[] cArr = j.f3244a;
    }

    public final int available() throws IOException {
        return this.f3229a.available();
    }

    public final void close() throws IOException {
        this.f3229a.close();
    }

    public final void mark(int i) {
        this.f3229a.mark(i);
    }

    public final boolean markSupported() {
        return this.f3229a.markSupported();
    }

    public final int read() throws IOException {
        try {
            return this.f3229a.read();
        } catch (IOException e10) {
            this.f3230b = e10;
            throw e10;
        }
    }

    public final synchronized void reset() throws IOException {
        this.f3229a.reset();
    }

    public final long skip(long j10) throws IOException {
        try {
            return this.f3229a.skip(j10);
        } catch (IOException e10) {
            this.f3230b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f3229a.read(bArr);
        } catch (IOException e10) {
            this.f3230b = e10;
            throw e10;
        }
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        try {
            return this.f3229a.read(bArr, i, i10);
        } catch (IOException e10) {
            this.f3230b = e10;
            throw e10;
        }
    }
}
