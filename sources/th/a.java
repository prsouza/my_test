package th;

import ag.n;
import ag.w;
import ag.w0;
import fh.e;
import fh.h;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;
import lh.b;

public final class a implements PrivateKey, Key {

    /* renamed from: a  reason: collision with root package name */
    public transient n f11609a;

    /* renamed from: b  reason: collision with root package name */
    public transient b f11610b;

    /* renamed from: c  reason: collision with root package name */
    public transient w f11611c;

    public a(hg.b bVar) throws IOException {
        this.f11611c = bVar.f5972s;
        this.f11609a = h.j(bVar.f5970b.f7257b).f5172b.f7256a;
        this.f11610b = (b) mh.a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f11609a.m(aVar.f11609a) && Arrays.equals(this.f11610b.S0(), aVar.f11610b.S0());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public final byte[] getEncoded() {
        hg.b bVar;
        try {
            b bVar2 = this.f11610b;
            if (bVar2.F != null) {
                bVar = mh.b.a(bVar2, this.f11611c);
            } else {
                bVar = new hg.b(new jg.a(e.f5153d, new h(new jg.a(this.f11609a))), new w0(this.f11610b.S0()), this.f11611c, (byte[]) null);
            }
            return bVar.getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (xh.a.e(this.f11610b.S0()) * 37) + this.f11609a.hashCode();
    }
}
