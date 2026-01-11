package l8;

import java.io.OutputStream;

public final class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f8127a = 0;

    public final void write(int i) {
        this.f8127a++;
    }

    public final void write(byte[] bArr) {
        this.f8127a += (long) bArr.length;
    }

    public final void write(byte[] bArr, int i, int i10) {
        int i11;
        if (i < 0 || i > bArr.length || i10 < 0 || (i11 = i + i10) > bArr.length || i11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f8127a += (long) i10;
    }
}
