package ag;

import a.a;
import java.io.IOException;
import java.util.Objects;

public final class n0 extends b {
    public n0(d dVar) throws IOException {
        super(dVar.d().i("DER"), 0);
    }

    public n0(byte[] bArr) {
        super(bArr, 0);
    }

    public n0(byte[] bArr, int i) {
        super(bArr, i);
    }

    public static n0 t(Object obj) {
        if (obj == null || (obj instanceof n0)) {
            return (n0) obj;
        }
        if (obj instanceof i1) {
            i1 i1Var = (i1) obj;
            return new n0(i1Var.f372a, i1Var.f373b);
        } else if (obj instanceof byte[]) {
            try {
                return (n0) s.n((byte[]) obj);
            } catch (Exception e10) {
                StringBuilder d10 = a.d("encoding error in getInstance: ");
                d10.append(e10.toString());
                throw new IllegalArgumentException(d10.toString());
            }
        } else {
            StringBuilder d11 = a.d("illegal object in getInstance: ");
            d11.append(obj.getClass().getName());
            throw new IllegalArgumentException(d11.toString());
        }
    }

    public final void k(q qVar, boolean z) throws IOException {
        int i;
        byte[] bArr = this.f372a;
        int length = bArr.length;
        if (!(length == 0 || (i = this.f373b) == 0)) {
            int i10 = length - 1;
            if (bArr[i10] != ((byte) (bArr[i10] & (255 << i)))) {
                byte b10 = (byte) (bArr[i10] & (255 << i));
                byte b11 = (byte) i;
                if (z) {
                    qVar.d(3);
                }
                qVar.j(i10 + 2);
                qVar.d(b11);
                qVar.e(bArr, 0, i10);
                qVar.d(b10);
                return;
            }
        }
        byte b12 = (byte) this.f373b;
        Objects.requireNonNull(qVar);
        if (z) {
            qVar.d(3);
        }
        qVar.j(bArr.length + 1);
        qVar.d(b12);
        qVar.e(bArr, 0, bArr.length);
    }

    public final int l() {
        return v1.a(this.f372a.length + 1) + 1 + this.f372a.length + 1;
    }

    public final boolean o() {
        return false;
    }

    public final s p() {
        return this;
    }

    public final s q() {
        return this;
    }
}
