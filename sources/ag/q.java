package ag;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Enumeration;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public OutputStream f435a;

    public q(OutputStream outputStream) {
        this.f435a = outputStream;
    }

    public static q a(OutputStream outputStream, String str) {
        return str.equals("DER") ? new y0(outputStream) : str.equals("DL") ? new l1(outputStream) : new q(outputStream);
    }

    public y0 b() {
        return new y0(this.f435a);
    }

    public q c() {
        return new l1(this.f435a);
    }

    public final void d(int i) throws IOException {
        this.f435a.write(i);
    }

    public final void e(byte[] bArr, int i, int i10) throws IOException {
        this.f435a.write(bArr, i, i10);
    }

    public final void f(Enumeration enumeration) throws IOException {
        while (enumeration.hasMoreElements()) {
            l(((d) enumeration.nextElement()).d(), true);
        }
    }

    public final void g(boolean z, int i, int i10, byte[] bArr) throws IOException {
        m(z, i, i10);
        j(bArr.length);
        e(bArr, 0, bArr.length);
    }

    public final void h(boolean z, int i, byte[] bArr) throws IOException {
        if (z) {
            d(i);
        }
        j(bArr.length);
        e(bArr, 0, bArr.length);
    }

    public final void i(boolean z, int i, d[] dVarArr) throws IOException {
        if (z) {
            d(i);
        }
        d(128);
        for (d d10 : dVarArr) {
            l(d10.d(), true);
        }
        d(0);
        d(0);
    }

    public final void j(int i) throws IOException {
        if (i > 127) {
            int i10 = i;
            int i11 = 1;
            while (true) {
                i10 >>>= 8;
                if (i10 == 0) {
                    break;
                }
                i11++;
            }
            d((byte) (i11 | 128));
            for (int i12 = (i11 - 1) * 8; i12 >= 0; i12 -= 8) {
                d((byte) (i >> i12));
            }
            return;
        }
        d((byte) i);
    }

    public final void k(d dVar) throws IOException {
        if (dVar != null) {
            dVar.d().k(this, true);
            return;
        }
        throw new IOException("null object detected");
    }

    public void l(s sVar, boolean z) throws IOException {
        sVar.k(this, z);
    }

    public final void m(boolean z, int i, int i10) throws IOException {
        if (z) {
            if (i10 < 31) {
                d(i | i10);
                return;
            }
            d(31 | i);
            if (i10 < 128) {
                d(i10);
                return;
            }
            byte[] bArr = new byte[5];
            int i11 = 4;
            bArr[4] = (byte) (i10 & 127);
            do {
                i10 >>= 7;
                i11--;
                bArr[i11] = (byte) ((i10 & 127) | 128);
            } while (i10 > 127);
            e(bArr, i11, 5 - i11);
        }
    }
}
