package uh;

import ag.n;
import e6.e;
import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import mh.c;
import mh.d;
import nh.q;
import xh.a;

public final class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public transient n f12009a;

    /* renamed from: b  reason: collision with root package name */
    public transient q f12010b;

    public b(jg.b bVar) throws IOException {
        q qVar = (q) c.a(bVar);
        this.f12010b = qVar;
        this.f12009a = e.N(qVar.F);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f12009a.m(bVar.f12009a) && Arrays.equals(this.f12010b.S0(), bVar.f12010b.S0());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public final byte[] getEncoded() {
        try {
            return d.a(this.f12010b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return (a.e(this.f12010b.S0()) * 37) + this.f12009a.hashCode();
    }
}
