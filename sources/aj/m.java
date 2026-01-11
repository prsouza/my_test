package aj;

import a.b;
import b.g;
import e6.e;
import ze.h;

public final class m implements h {

    /* renamed from: a  reason: collision with root package name */
    public final String f695a;

    /* renamed from: b  reason: collision with root package name */
    public final g f696b;

    public m(String str, g gVar) {
        this.f695a = str;
        this.f696b = gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return e.r(this.f695a, mVar.f695a) && e.r(this.f696b, mVar.f696b);
    }

    public final int hashCode() {
        return this.f696b.hashCode() + (this.f695a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("TxEventsImpl(txhash=");
        q10.append(this.f695a);
        q10.append(", events=");
        q10.append(this.f696b);
        q10.append(')');
        return q10.toString();
    }
}
