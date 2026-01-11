package rh;

import ag.w;
import hg.b;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;

public final class a implements PrivateKey {

    /* renamed from: a  reason: collision with root package name */
    public transient jh.a f10798a;

    /* renamed from: b  reason: collision with root package name */
    public transient w f10799b;

    public a(b bVar) throws IOException {
        this.f10799b = bVar.f5972s;
        this.f10798a = (jh.a) mh.a.a(bVar);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        jh.a aVar2 = this.f10798a;
        if (aVar2.F != aVar.f10798a.F || !Arrays.equals(aVar2.S0(), aVar.f10798a.S0())) {
            return false;
        }
        return true;
    }

    public final String getAlgorithm() {
        return aa.b.I(this.f10798a.F);
    }

    public final byte[] getEncoded() {
        try {
            return mh.b.a(this.f10798a, this.f10799b).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    public final String getFormat() {
        return "PKCS#8";
    }

    public final int hashCode() {
        jh.a aVar = this.f10798a;
        return (xh.a.e(aVar.S0()) * 37) + aVar.F;
    }
}
