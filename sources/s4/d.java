package s4;

import a.a;
import java.util.List;

public final class d extends j {

    /* renamed from: a  reason: collision with root package name */
    public final List<m> f10905a;

    public d(List<m> list) {
        this.f10905a = list;
    }

    public final List<m> a() {
        return this.f10905a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            return this.f10905a.equals(((j) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f10905a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder d10 = a.d("BatchedLogRequest{logRequests=");
        d10.append(this.f10905a);
        d10.append("}");
        return d10.toString();
    }
}
