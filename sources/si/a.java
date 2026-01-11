package si;

import a.b;
import e6.e;
import java.util.ArrayList;
import java.util.List;
import xe.f;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public f f11148a;

    /* renamed from: b  reason: collision with root package name */
    public long f11149b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f11150c;

    /* renamed from: d  reason: collision with root package name */
    public List<String> f11151d;

    public /* synthetic */ a(f fVar) {
        this(fVar, System.currentTimeMillis(), new ArrayList(), new ArrayList());
    }

    public a(f fVar, long j10, List<String> list, List<String> list2) {
        e.D(fVar, "bundle");
        e.D(list, "constraints");
        e.D(list2, "tags");
        this.f11148a = fVar;
        this.f11149b = j10;
        this.f11150c = list;
        this.f11151d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return e.r(this.f11148a, aVar.f11148a) && this.f11149b == aVar.f11149b && e.r(this.f11150c, aVar.f11150c) && e.r(this.f11151d, aVar.f11151d);
    }

    public final int hashCode() {
        f fVar = this.f11148a;
        int i = 0;
        int hashCode = fVar != null ? fVar.hashCode() : 0;
        long j10 = this.f11149b;
        int i10 = ((hashCode * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        List<String> list = this.f11150c;
        int hashCode2 = (i10 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f11151d;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder q10 = b.q("BundleDescriptor(bundle=");
        q10.append(this.f11148a);
        q10.append(", created=");
        q10.append(this.f11149b);
        q10.append(", constraints=");
        q10.append(this.f11150c);
        q10.append(", tags=");
        q10.append(this.f11151d);
        q10.append(")");
        return q10.toString();
    }
}
