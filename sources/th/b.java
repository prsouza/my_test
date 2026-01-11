package th;

import ag.n;
import fh.e;
import fh.h;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import jg.a;
import lh.c;
import mh.d;

public final class b implements PublicKey, Key {

    /* renamed from: a  reason: collision with root package name */
    public transient n f11612a;

    /* renamed from: b  reason: collision with root package name */
    public transient c f11613b;

    public b(jg.b bVar) throws IOException {
        this.f11612a = h.j(bVar.f7258a.f7257b).f5172b.f7256a;
        this.f11613b = (c) mh.c.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11612a.m(bVar.f11612a) && Arrays.equals(this.f11613b.S0(), bVar.f11613b.S0());
    }

    public final String getAlgorithm() {
        return "SPHINCS-256";
    }

    public final byte[] getEncoded() {
        try {
            c cVar = this.f11613b;
            return (cVar.F != null ? d.a(cVar) : new jg.b(new a(e.f5153d, new h(new a(this.f11612a))), this.f11613b.S0())).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (xh.a.e(this.f11613b.S0()) * 37) + this.f11612a.hashCode();
    }
}
