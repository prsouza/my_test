package oh;

import ag.w;
import gh.f;
import hg.b;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.util.Arrays;

public final class a implements PrivateKey, Key {

    /* renamed from: a  reason: collision with root package name */
    public transient f f9447a;

    /* renamed from: b  reason: collision with root package name */
    public transient w f9448b;

    public a(b bVar) throws IOException {
        this.f9448b = bVar.f5972s;
        this.f9447a = (f) mh.a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        try {
            return Arrays.equals(this.f9447a.getEncoded(), ((a) obj).f9447a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to perform equals");
        }
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public final byte[] getEncoded() {
        try {
            return mh.b.a(this.f9447a, this.f9448b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        try {
            return xh.a.e(this.f9447a.getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("unable to calculate hashCode");
        }
    }
}
