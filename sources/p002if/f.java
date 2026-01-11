package p002if;

import e6.e;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import nd.m;
import tf.c;
import uf.i;

/* renamed from: if.f  reason: invalid package */
public final class f {

    /* renamed from: c  reason: collision with root package name */
    public static final f f6496c = new f(m.m1(new ArrayList()));

    /* renamed from: d  reason: collision with root package name */
    public static final a f6497d = new a();

    /* renamed from: a  reason: collision with root package name */
    public final Set<b> f6498a;

    /* renamed from: b  reason: collision with root package name */
    public final c f6499b;

    /* renamed from: if.f$a */
    public static final class a {
        public final String a(Certificate certificate) {
            StringBuilder d10 = a.a.d("sha256/");
            d10.append(b((X509Certificate) certificate).d());
            return d10.toString();
        }

        public final i b(X509Certificate x509Certificate) {
            i.a aVar = i.f11956t;
            PublicKey publicKey = x509Certificate.getPublicKey();
            e.C(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            e.C(encoded, "publicKey.encoded");
            return i.a.c(encoded).e("SHA-256");
        }
    }

    /* renamed from: if.f$b */
    public static final class b {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            Objects.requireNonNull(bVar);
            if (!e.r((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            if (!e.r((Object) null, (Object) null)) {
                return false;
            }
            Objects.requireNonNull(bVar);
            return !(e.r((Object) null, (Object) null) ^ true);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append((String) null);
            sb2.append('/');
            throw null;
        }
    }

    public f(Set set) {
        this.f6498a = set;
        this.f6499b = null;
    }

    public final f a(c cVar) {
        if (e.r(this.f6499b, cVar)) {
            return this;
        }
        return new f(this.f6498a, cVar);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return e.r(fVar.f6498a, this.f6498a) && e.r(fVar.f6499b, this.f6499b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f6498a.hashCode() + 1517) * 41;
        c cVar = this.f6499b;
        return hashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public f(Set<b> set, c cVar) {
        e.D(set, "pins");
        this.f6498a = set;
        this.f6499b = cVar;
    }
}
