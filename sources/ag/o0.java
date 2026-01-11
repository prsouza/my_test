package ag;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public final class o0 extends h {
    public o0(n nVar, k kVar, s sVar, int i, s sVar2) {
        super(nVar, kVar, sVar, i, sVar2);
    }

    public final void k(q qVar, boolean z) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        n nVar = this.f400a;
        if (nVar != null) {
            byteArrayOutputStream.write(nVar.i("DER"));
        }
        k kVar = this.f401b;
        if (kVar != null) {
            byteArrayOutputStream.write(kVar.i("DER"));
        }
        s sVar = this.f402c;
        if (sVar != null) {
            byteArrayOutputStream.write(sVar.i("DER"));
        }
        byteArrayOutputStream.write(new d1(true, this.f403s, this.f404t).i("DER"));
        qVar.g(z, 32, 8, byteArrayOutputStream.toByteArray());
    }

    public final int l() throws IOException {
        return getEncoded().length;
    }

    public final s p() {
        return this;
    }

    public final s q() {
        return this;
    }
}
