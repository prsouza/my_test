package aj;

import a.b;
import androidx.fragment.app.m;
import e6.e;
import ze.k;

public final class r implements k {

    /* renamed from: a  reason: collision with root package name */
    public final String f708a;

    /* renamed from: b  reason: collision with root package name */
    public final String f709b;

    /* renamed from: c  reason: collision with root package name */
    public final long f710c;

    /* renamed from: d  reason: collision with root package name */
    public final int f711d;

    /* renamed from: e  reason: collision with root package name */
    public long f712e;

    public r(String str, String str2, long j10, int i) {
        e.D(str, "prvKey");
        e.D(str2, "pubKey");
        this.f708a = str;
        this.f709b = str2;
        this.f710c = j10;
        this.f711d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return e.r(this.f708a, rVar.f708a) && e.r(this.f709b, rVar.f709b) && this.f710c == rVar.f710c && this.f711d == rVar.f711d;
    }

    public final int hashCode() {
        int a10 = m.a(this.f709b, this.f708a.hashCode() * 31, 31);
        long j10 = this.f710c;
        return this.f711d + ((((int) (j10 ^ (j10 >>> 32))) + a10) * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("UserKeyPairImpl(prvKey=");
        q10.append(this.f708a);
        q10.append(", pubKey=");
        q10.append(this.f709b);
        q10.append(", timestamp=");
        q10.append(this.f710c);
        q10.append(", exp=");
        q10.append(this.f711d);
        q10.append(')');
        return q10.toString();
    }
}
