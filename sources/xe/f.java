package xe;

import a.b;
import e6.e;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public q f13195a;

    /* renamed from: b  reason: collision with root package name */
    public List<j> f13196b;

    public f(q qVar, List<j> list) {
        e.D(qVar, "primaryBlock");
        this.f13195a = qVar;
        this.f13196b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return e.r(this.f13195a, fVar.f13195a) && e.r(this.f13196b, fVar.f13196b);
    }

    public final int hashCode() {
        q qVar = this.f13195a;
        int i = 0;
        int hashCode = (qVar != null ? qVar.hashCode() : 0) * 31;
        List<j> list = this.f13196b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder q10 = b.q("Bundle(primaryBlock=");
        q10.append(this.f13195a);
        q10.append(", canonicalBlocks=");
        q10.append(this.f13196b);
        q10.append(")");
        return q10.toString();
    }
}
