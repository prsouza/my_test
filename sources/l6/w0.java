package l6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public final class w0 extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    public final p1 f8066a = new p1();

    /* renamed from: b  reason: collision with root package name */
    public final File f8067b;

    /* renamed from: c  reason: collision with root package name */
    public final h2 f8068c;

    /* renamed from: s  reason: collision with root package name */
    public long f8069s;

    /* renamed from: t  reason: collision with root package name */
    public long f8070t;

    /* renamed from: u  reason: collision with root package name */
    public FileOutputStream f8071u;

    /* renamed from: v  reason: collision with root package name */
    public h0 f8072v;

    public w0(File file, h2 h2Var) {
        this.f8067b = file;
        this.f8068c = h2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        while (i10 > 0) {
            if (this.f8069s == 0 && this.f8070t == 0) {
                int a10 = this.f8066a.a(bArr, i, i10);
                if (a10 != -1) {
                    i += a10;
                    i10 -= a10;
                    h0 h0Var = (h0) this.f8066a.b();
                    this.f8072v = h0Var;
                    if (h0Var.f7880e) {
                        this.f8069s = 0;
                        h2 h2Var = this.f8068c;
                        byte[] bArr2 = h0Var.f7881f;
                        h2Var.k(bArr2, bArr2.length);
                        this.f8070t = (long) this.f8072v.f7881f.length;
                    } else if (!h0Var.h() || this.f8072v.g()) {
                        byte[] bArr3 = this.f8072v.f7881f;
                        this.f8068c.k(bArr3, bArr3.length);
                        this.f8069s = this.f8072v.f7877b;
                    } else {
                        this.f8068c.i(this.f8072v.f7881f);
                        File file = new File(this.f8067b, this.f8072v.f7876a);
                        file.getParentFile().mkdirs();
                        this.f8069s = this.f8072v.f7877b;
                        this.f8071u = new FileOutputStream(file);
                    }
                } else {
                    return;
                }
            }
            if (!this.f8072v.g()) {
                h0 h0Var2 = this.f8072v;
                if (h0Var2.f7880e) {
                    this.f8068c.d(this.f8070t, bArr, i, i10);
                    this.f8070t += (long) i10;
                    i11 = i10;
                } else if (h0Var2.h()) {
                    i11 = (int) Math.min((long) i10, this.f8069s);
                    this.f8071u.write(bArr, i, i11);
                    long j10 = this.f8069s - ((long) i11);
                    this.f8069s = j10;
                    if (j10 == 0) {
                        this.f8071u.close();
                    }
                } else {
                    i11 = (int) Math.min((long) i10, this.f8069s);
                    h0 h0Var3 = this.f8072v;
                    int length = h0Var3.f7881f.length;
                    long j11 = h0Var3.f7877b;
                    this.f8068c.d((((long) length) + j11) - this.f8069s, bArr, i, i11);
                    this.f8069s -= (long) i11;
                }
                i += i11;
                i10 -= i11;
            }
        }
    }
}
