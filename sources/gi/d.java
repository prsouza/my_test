package gi;

import a.b;
import e6.e;
import java.net.URI;
import xe.p;

public final class d implements p {

    /* renamed from: a  reason: collision with root package name */
    public URI f5518a;

    public d(URI uri) {
        e.D(uri, "previous");
        this.f5518a = uri;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof d) && e.r(this.f5518a, ((d) obj).f5518a);
        }
        return true;
    }

    public final int hashCode() {
        URI uri = this.f5518a;
        if (uri != null) {
            return uri.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder q10 = b.q("PreviousNodeBlockData(previous=");
        q10.append(this.f5518a);
        q10.append(")");
        return q10.toString();
    }
}
