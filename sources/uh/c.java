package uh;

import ag.n;
import ag.w;
import fh.i;
import hg.b;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import mh.a;
import nh.u;

public final class c implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public transient u f12011a;

    /* renamed from: b  reason: collision with root package name */
    public transient n f12012b;

    /* renamed from: c  reason: collision with root package name */
    public transient w f12013c;

    public c(b bVar) throws IOException {
        this.f12013c = bVar.f5972s;
        this.f12012b = i.j(bVar.f5970b.f7257b).f5175c.f7256a;
        this.f12011a = (u) a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12012b.m(cVar.f12012b) && Arrays.equals(this.f12011a.S0(), cVar.f12011a.S0());
    }

    public final String getAlgorithm() {
        return "XMSS";
    }

    public final byte[] getEncoded() {
        try {
            return mh.b.a(this.f12011a, this.f12013c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (xh.a.e(this.f12011a.S0()) * 37) + this.f12012b.hashCode();
    }
}
