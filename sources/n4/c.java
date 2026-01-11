package n4;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class c extends OutputStream {

    /* renamed from: t  reason: collision with root package name */
    public static final byte[] f8905t = new byte[0];

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<byte[]> f8906a = new LinkedList<>();

    /* renamed from: b  reason: collision with root package name */
    public int f8907b;

    /* renamed from: c  reason: collision with root package name */
    public byte[] f8908c;

    /* renamed from: s  reason: collision with root package name */
    public int f8909s;

    public c(int i) {
        this.f8908c = new byte[i];
    }

    public final void a() {
        int length = this.f8907b + this.f8908c.length;
        if (length >= 0) {
            this.f8907b = length;
            int max = Math.max(length >> 1, 1000);
            if (max > 131072) {
                max = 131072;
            }
            this.f8906a.add(this.f8908c);
            this.f8908c = new byte[max];
            this.f8909s = 0;
            return;
        }
        throw new IllegalStateException("Maximum Java array size (2GB) exceeded by `ByteArrayBuilder`");
    }

    public final void c(int i) {
        if (this.f8909s >= this.f8908c.length) {
            a();
        }
        byte[] bArr = this.f8908c;
        int i10 = this.f8909s;
        this.f8909s = i10 + 1;
        bArr[i10] = (byte) i;
    }

    public final void close() {
    }

    public final void e() {
        this.f8907b = 0;
        this.f8909s = 0;
        if (!this.f8906a.isEmpty()) {
            this.f8906a.clear();
        }
    }

    public final byte[] f() {
        int i = this.f8907b + this.f8909s;
        if (i == 0) {
            return f8905t;
        }
        byte[] bArr = new byte[i];
        Iterator<byte[]> it = this.f8906a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            byte[] next = it.next();
            int length = next.length;
            System.arraycopy(next, 0, bArr, i10, length);
            i10 += length;
        }
        System.arraycopy(this.f8908c, 0, bArr, i10, this.f8909s);
        int i11 = i10 + this.f8909s;
        if (i11 == i) {
            if (!this.f8906a.isEmpty()) {
                e();
            }
            return bArr;
        }
        throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + i11 + " bytes");
    }

    public final void flush() {
    }

    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i10) {
        while (true) {
            int min = Math.min(this.f8908c.length - this.f8909s, i10);
            if (min > 0) {
                System.arraycopy(bArr, i, this.f8908c, this.f8909s, min);
                i += min;
                this.f8909s += min;
                i10 -= min;
            }
            if (i10 > 0) {
                a();
            } else {
                return;
            }
        }
    }

    public final void write(int i) {
        c(i);
    }
}
