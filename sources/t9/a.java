package t9;

import a.b;
import c3.r;
import java.util.Objects;
import qg.e;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final r f11439a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11440b;

    /* renamed from: c  reason: collision with root package name */
    public final int f11441c;

    public a(r rVar, long j10, int i) {
        this.f11439a = rVar;
        this.f11440b = j10;
        this.f11441c = i;
    }

    public final byte[] a() {
        b bVar = (b) this.f11439a.f3215a;
        Objects.requireNonNull(bVar, "null cannot be cast to non-null type org.bouncycastle.crypto.params.Ed25519PublicKeyParameters");
        byte[] encoded = ((e) bVar).getEncoded();
        e6.e.C(encoded, "keyPair.public as Ed2551…licKeyParameters).encoded");
        return encoded;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e6.e.r(this.f11439a, aVar.f11439a) && this.f11440b == aVar.f11440b && this.f11441c == aVar.f11441c;
    }

    public final int hashCode() {
        long j10 = this.f11440b;
        int i = (int) (j10 ^ (j10 >>> 32));
        return this.f11441c + ((i + (this.f11439a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("pubkey=");
        bf.a aVar = bf.a.f2992a;
        q10.append(bf.a.a(a()));
        q10.append(" ref=");
        q10.append(this.f11440b);
        q10.append(" expire=");
        q10.append(this.f11441c);
        return q10.toString();
    }
}
