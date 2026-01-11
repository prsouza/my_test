package ph;

import ag.d;
import b9.m;
import fh.e;
import hh.c;
import java.io.IOException;
import java.security.PublicKey;
import lg.a;

public final class b implements a, PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public c f10063a;

    public b(c cVar) {
        this.f10063a = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        c cVar = this.f10063a;
        int i = cVar.G;
        c cVar2 = ((b) obj).f10063a;
        if (i == cVar2.G && cVar.H == cVar2.H && cVar.I.equals(cVar2.I)) {
            return true;
        }
        return false;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final byte[] getEncoded() {
        c cVar = this.f10063a;
        try {
            return new jg.b(new jg.a(e.f5152c), (d) new fh.b(cVar.G, cVar.H, cVar.I, y.c.C(cVar.F))).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        c cVar = this.f10063a;
        int i = cVar.G;
        return cVar.I.hashCode() + (((cVar.H * 37) + i) * 37);
    }

    public final String toString() {
        StringBuilder c10 = m.c(androidx.activity.result.d.c(m.c(androidx.activity.result.d.c(m.c("McEliecePublicKey:\n", " length of the code         : "), this.f10063a.G, "\n"), " error correction capability: "), this.f10063a.H, "\n"), " generator matrix           : ");
        c10.append(this.f10063a.I.toString());
        return c10.toString();
    }
}
