package qh;

import ag.w;
import hg.b;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class a implements Key, PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public transient ih.a f10450a;

    /* renamed from: b  reason: collision with root package name */
    public transient w f10451b;

    public a(b bVar) throws IOException {
        this.f10451b = bVar.f5972s;
        this.f10450a = (ih.a) mh.a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Arrays.equals(this.f10450a.S0(), ((a) obj).f10450a.S0());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            return mh.b.a(this.f10450a, this.f10451b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        return xh.a.i(this.f10450a.S0());
    }
}
