package oh;

import gh.f;
import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import mh.c;
import mh.d;
import xh.a;

public final class b implements PublicKey, Key {

    /* renamed from: a  reason: collision with root package name */
    public transient f f9449a;

    public b(jg.b bVar) throws IOException {
        this.f9449a = (f) c.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            try {
                return Arrays.equals(this.f9449a.getEncoded(), ((b) obj).f9449a.getEncoded());
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final String getAlgorithm() {
        return "LMS";
    }

    public final byte[] getEncoded() {
        try {
            return d.a(this.f9449a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        try {
            return a.e(this.f9449a.getEncoded());
        } catch (IOException unused) {
            return -1;
        }
    }
}
