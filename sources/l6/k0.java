package l6;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public final class k0 extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f7910a = new p1();

    /* renamed from: b  reason: collision with root package name */
    public byte[] f7911b = new byte[LZ4Constants.HASH_TABLE_SIZE];

    /* renamed from: c  reason: collision with root package name */
    public long f7912c;

    /* renamed from: s  reason: collision with root package name */
    public boolean f7913s = false;

    /* renamed from: t  reason: collision with root package name */
    public boolean f7914t = false;

    public k0(InputStream inputStream) {
        super(inputStream);
    }

    public final m2 a() throws IOException {
        byte[] bArr;
        if (this.f7912c > 0) {
            do {
                bArr = this.f7911b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f7913s || this.f7914t) {
            return new h0((String) null, -1, -1, false, false, (byte[]) null);
        }
        if (!e(30)) {
            this.f7913s = true;
            return this.f7910a.b();
        }
        m2 b10 = this.f7910a.b();
        h0 h0Var = (h0) b10;
        if (h0Var.f7880e) {
            this.f7914t = true;
            return b10;
        } else if (h0Var.f7877b != 4294967295L) {
            int i = this.f7910a.f7979f - 30;
            long j10 = (long) i;
            int length = this.f7911b.length;
            if (j10 > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j10);
                this.f7911b = Arrays.copyOf(this.f7911b, length);
            }
            if (!e(i)) {
                this.f7913s = true;
                return this.f7910a.b();
            }
            m2 b11 = this.f7910a.b();
            this.f7912c = ((h0) b11).f7877b;
            return b11;
        } else {
            throw new t0("Files bigger than 4GiB are not supported.");
        }
    }

    public final int c(byte[] bArr, int i, int i10) throws IOException {
        return Math.max(0, super.read(bArr, i, i10));
    }

    public final boolean e(int i) throws IOException {
        int c10 = c(this.f7911b, 0, i);
        if (c10 != i) {
            int i10 = i - c10;
            if (c(this.f7911b, c10, i10) != i10) {
                this.f7910a.a(this.f7911b, 0, c10);
                return false;
            }
        }
        this.f7910a.a(this.f7911b, 0, i);
        return true;
    }

    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i10) throws IOException {
        long j10 = this.f7912c;
        if (j10 <= 0 || this.f7913s) {
            return -1;
        }
        int c10 = c(bArr, i, (int) Math.min(j10, (long) i10));
        this.f7912c -= (long) c10;
        if (c10 != 0) {
            return c10;
        }
        this.f7913s = true;
        return 0;
    }
}
