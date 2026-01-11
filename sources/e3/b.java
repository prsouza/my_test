package e3;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public final class b implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    public final InputStream f4610a;

    /* renamed from: b  reason: collision with root package name */
    public final Charset f4611b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f4612c;

    /* renamed from: s  reason: collision with root package name */
    public int f4613s;

    /* renamed from: t  reason: collision with root package name */
    public int f4614t;

    public class a extends ByteArrayOutputStream {
        public a(int i) {
            super(i);
        }

        public final String toString() {
            int i = this.count;
            if (i > 0 && this.buf[i - 1] == 13) {
                i--;
            }
            try {
                return new String(this.buf, 0, i, b.this.f4611b.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public b(InputStream inputStream, Charset charset) {
        if (charset == null) {
            throw null;
        } else if (charset.equals(c.f4616a)) {
            this.f4610a = inputStream;
            this.f4611b = charset;
            this.f4612c = new byte[LZ4Constants.HASH_TABLE_SIZE_64K];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    public final void a() throws IOException {
        InputStream inputStream = this.f4610a;
        byte[] bArr = this.f4612c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.f4613s = 0;
            this.f4614t = read;
            return;
        }
        throw new EOFException();
    }

    public final String c() throws IOException {
        int i;
        byte[] bArr;
        int i10;
        synchronized (this.f4610a) {
            if (this.f4612c != null) {
                if (this.f4613s >= this.f4614t) {
                    a();
                }
                for (int i11 = this.f4613s; i11 != this.f4614t; i11++) {
                    byte[] bArr2 = this.f4612c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f4613s;
                        if (i11 != i12) {
                            i10 = i11 - 1;
                            if (bArr2[i10] == 13) {
                                String str = new String(bArr2, i12, i10 - i12, this.f4611b.name());
                                this.f4613s = i11 + 1;
                                return str;
                            }
                        }
                        i10 = i11;
                        String str2 = new String(bArr2, i12, i10 - i12, this.f4611b.name());
                        this.f4613s = i11 + 1;
                        return str2;
                    }
                }
                a aVar = new a((this.f4614t - this.f4613s) + 80);
                loop1:
                while (true) {
                    byte[] bArr3 = this.f4612c;
                    int i13 = this.f4613s;
                    aVar.write(bArr3, i13, this.f4614t - i13);
                    this.f4614t = -1;
                    a();
                    i = this.f4613s;
                    while (true) {
                        if (i != this.f4614t) {
                            bArr = this.f4612c;
                            if (bArr[i] == 10) {
                                break loop1;
                            }
                            i++;
                        }
                    }
                }
                int i14 = this.f4613s;
                if (i != i14) {
                    aVar.write(bArr, i14, i - i14);
                }
                this.f4613s = i + 1;
                String aVar2 = aVar.toString();
                return aVar2;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public final void close() throws IOException {
        synchronized (this.f4610a) {
            if (this.f4612c != null) {
                this.f4612c = null;
                this.f4610a.close();
            }
        }
    }
}
