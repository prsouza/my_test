package z4;

import c5.a;
import java.util.Map;
import java.util.Objects;
import q4.d;
import z4.f;

public final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    public final a f13794a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<d, f.a> f13795b;

    public b(a aVar, Map<d, f.a> map) {
        Objects.requireNonNull(aVar, "Null clock");
        this.f13794a = aVar;
        Objects.requireNonNull(map, "Null values");
        this.f13795b = map;
    }

    public final a a() {
        return this.f13794a;
    }

    public final Map<d, f.a> c() {
        return this.f13795b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (!this.f13794a.equals(fVar.a()) || !this.f13795b.equals(fVar.c())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f13794a.hashCode() ^ 1000003) * 1000003) ^ this.f13795b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("SchedulerConfig{clock=");
        d10.append(this.f13794a);
        d10.append(", values=");
        d10.append(this.f13795b);
        d10.append("}");
        return d10.toString();
    }
}
