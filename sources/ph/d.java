package ph;

import b9.m;
import fh.e;
import hh.f;
import java.io.IOException;
import java.security.PublicKey;
import jg.a;
import jg.b;

public final class d implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public f f10065a;

    public d(f fVar) {
        this.f10065a = fVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        f fVar = this.f10065a;
        int i = fVar.F;
        f fVar2 = ((d) obj).f10065a;
        if (i == fVar2.F && fVar.G == fVar2.G && fVar.H.equals(fVar2.H)) {
            return true;
        }
        return false;
    }

    public final String getAlgorithm() {
        return "McEliece";
    }

    public final byte[] getEncoded() {
        f fVar = this.f10065a;
        try {
            return new b(new a(e.f5151b), (ag.d) new fh.d(fVar.F, fVar.G, fVar.H)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        f fVar = this.f10065a;
        int i = fVar.F;
        return fVar.H.hashCode() + (((fVar.G * 37) + i) * 37);
    }

    public final String toString() {
        StringBuilder c10 = m.c(androidx.activity.result.d.c(m.c(androidx.activity.result.d.c(m.c("McEliecePublicKey:\n", " length of the code         : "), this.f10065a.F, "\n"), " error correction capability: "), this.f10065a.G, "\n"), " generator matrix           : ");
        c10.append(this.f10065a.H);
        return c10.toString();
    }
}
