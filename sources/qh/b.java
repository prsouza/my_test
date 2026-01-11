package qh;

import java.io.IOException;
import java.security.Key;
import java.security.PublicKey;
import java.util.Arrays;
import mh.c;
import mh.d;
import xh.a;

public final class b implements Key, PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public transient ih.b f10452a;

    public b(jg.b bVar) throws IOException {
        this.f10452a = (ih.b) c.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Arrays.equals(this.f10452a.S0(), ((b) obj).f10452a.S0());
    }

    public final String getAlgorithm() {
        return "NH";
    }

    public final byte[] getEncoded() {
        try {
            return d.a(this.f10452a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        return a.e(this.f10452a.S0());
    }
}
