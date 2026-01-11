package ph;

import ag.w;
import fh.e;
import hh.b;
import java.io.IOException;
import java.security.PrivateKey;
import y.c;

public final class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public b f10062a;

    public a(b bVar) {
        this.f10062a = bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        b bVar = this.f10062a;
        int i = bVar.G;
        b bVar2 = aVar.f10062a;
        if (i != bVar2.G || bVar.H != bVar2.H || !bVar.I.equals(bVar2.I) || !this.f10062a.J.equals(aVar.f10062a.J) || !this.f10062a.K.equals(aVar.f10062a.K) || !this.f10062a.L.equals(aVar.f10062a.L)) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return "McEliece-CCA2";
    }

    public final byte[] getEncoded() {
        try {
            b bVar = this.f10062a;
            return new hg.b(new jg.a(e.f5152c), new fh.a(bVar.G, bVar.H, bVar.I, bVar.J, bVar.K, c.C(bVar.F)), (w) null, (byte[]) null).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        b bVar = this.f10062a;
        int hashCode = bVar.J.hashCode();
        int hashCode2 = this.f10062a.K.hashCode();
        return this.f10062a.L.hashCode() + ((hashCode2 + ((hashCode + (((((bVar.H * 37) + bVar.G) * 37) + bVar.I.f12683b) * 37)) * 37)) * 37);
    }
}
