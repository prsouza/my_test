package l6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Objects;

public final class o1 extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    public final Enumeration f7957a;

    /* renamed from: b  reason: collision with root package name */
    public FileInputStream f7958b;

    public o1(Enumeration enumeration) throws IOException {
        this.f7957a = enumeration;
        a();
    }

    public final void a() throws IOException {
        FileInputStream fileInputStream = this.f7958b;
        if (fileInputStream != null) {
            fileInputStream.close();
        }
        this.f7958b = this.f7957a.hasMoreElements() ? new FileInputStream((File) this.f7957a.nextElement()) : null;
    }

    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f7958b;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f7958b = null;
        }
    }

    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f7958b;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            a();
        }
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        if (this.f7958b == null) {
            return -1;
        }
        Objects.requireNonNull(bArr);
        if (i < 0 || i10 < 0 || i10 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i10 == 0) {
            return 0;
        } else {
            do {
                int read = this.f7958b.read(bArr, i, i10);
                if (read > 0) {
                    return read;
                }
                a();
            } while (this.f7958b != null);
            return -1;
        }
    }
}
