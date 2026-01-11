package ff;

import ah.v;
import df.b;
import df.e;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;

public class c implements AlgorithmParameterSpec, Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final b f5112a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5113b;

    /* renamed from: c  reason: collision with root package name */
    public final v f5114c;

    /* renamed from: s  reason: collision with root package name */
    public final e f5115s;

    public c(b bVar, v vVar, e eVar) {
        try {
            if (bVar.f4465a.f4479u / 4 == MessageDigest.getInstance("SHA-512").getDigestLength()) {
                this.f5112a = bVar;
                this.f5113b = "SHA-512";
                this.f5114c = vVar;
                this.f5115s = eVar;
                return;
            }
            throw new IllegalArgumentException("Hash output is not 2b-bit");
        } catch (NoSuchAlgorithmException unused) {
            throw new IllegalArgumentException("Unsupported hash algorithm");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f5113b.equals(cVar.f5113b) || !this.f5112a.equals(cVar.f5112a) || !this.f5115s.equals(cVar.f5115s)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f5113b.hashCode() ^ this.f5112a.hashCode()) ^ this.f5115s.hashCode();
    }
}
