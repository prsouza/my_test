package ag;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import zh.a;

public final class p1 extends u1 {

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f432t = new byte[0];

    /* renamed from: c  reason: collision with root package name */
    public final int f433c;

    /* renamed from: s  reason: collision with root package name */
    public int f434s;

    public p1(InputStream inputStream, int i, int i10) {
        super(inputStream, i10);
        if (i >= 0) {
            this.f433c = i;
            this.f434s = i;
            if (i == 0) {
                a();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("negative lengths not allowed");
    }

    public final byte[] c() throws IOException {
        int i = this.f434s;
        if (i == 0) {
            return f432t;
        }
        int i10 = this.f453b;
        if (i < i10) {
            byte[] bArr = new byte[i];
            int b10 = i - a.b(this.f452a, bArr, i);
            this.f434s = b10;
            if (b10 == 0) {
                a();
                return bArr;
            }
            StringBuilder d10 = a.a.d("DEF length ");
            d10.append(this.f433c);
            d10.append(" object truncated by ");
            d10.append(this.f434s);
            throw new EOFException(d10.toString());
        }
        StringBuilder d11 = a.a.d("corrupted stream - out of bounds length found: ");
        d11.append(this.f434s);
        d11.append(" >= ");
        d11.append(i10);
        throw new IOException(d11.toString());
    }

    public final int read() throws IOException {
        if (this.f434s == 0) {
            return -1;
        }
        int read = this.f452a.read();
        if (read >= 0) {
            int i = this.f434s - 1;
            this.f434s = i;
            if (i == 0) {
                a();
            }
            return read;
        }
        StringBuilder d10 = a.a.d("DEF length ");
        d10.append(this.f433c);
        d10.append(" object truncated by ");
        d10.append(this.f434s);
        throw new EOFException(d10.toString());
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f434s;
        if (i11 == 0) {
            return -1;
        }
        int read = this.f452a.read(bArr, i, Math.min(i10, i11));
        if (read >= 0) {
            int i12 = this.f434s - read;
            this.f434s = i12;
            if (i12 == 0) {
                a();
            }
            return read;
        }
        StringBuilder d10 = a.a.d("DEF length ");
        d10.append(this.f433c);
        d10.append(" object truncated by ");
        d10.append(this.f434s);
        throw new EOFException(d10.toString());
    }
}
