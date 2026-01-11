package uh;

import ag.n;
import ag.w;
import fh.j;
import hg.b;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import nh.p;

public final class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public transient n f12006a;

    /* renamed from: b  reason: collision with root package name */
    public transient p f12007b;

    /* renamed from: c  reason: collision with root package name */
    public transient w f12008c;

    public a(b bVar) throws IOException {
        this.f12008c = bVar.f5972s;
        this.f12006a = j.j(bVar.f5970b.f7257b).f5179s.f7256a;
        this.f12007b = (p) mh.a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f12006a.m(aVar.f12006a) && Arrays.equals(this.f12007b.S0(), aVar.f12007b.S0());
    }

    public final String getAlgorithm() {
        return "XMSSMT";
    }

    public final byte[] getEncoded() {
        try {
            return mh.b.a(this.f12007b, this.f12008c).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return (xh.a.e(this.f12007b.S0()) * 37) + this.f12006a.hashCode();
    }
}
