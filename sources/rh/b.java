package rh;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Arrays;
import mh.c;
import mh.d;
import xh.a;

public final class b implements PublicKey {

    /* renamed from: a  reason: collision with root package name */
    public transient jh.b f10800a;

    public b(jg.b bVar) throws IOException {
        this.f10800a = (jh.b) c.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        jh.b bVar2 = this.f10800a;
        if (bVar2.F != bVar.f10800a.F || !Arrays.equals(bVar2.S0(), bVar.f10800a.S0())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return aa.b.I(this.f10800a.F);
    }

    public final byte[] getEncoded() {
        try {
            return d.a(this.f10800a).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "X.509";
    }

    public final int hashCode() {
        jh.b bVar = this.f10800a;
        return (a.e(bVar.S0()) * 37) + bVar.F;
    }
}
