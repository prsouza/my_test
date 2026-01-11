package p8;

import java.util.List;
import java.util.Objects;

public final class a extends l {

    /* renamed from: a  reason: collision with root package name */
    public final String f9711a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f9712b;

    public a(String str, List<String> list) {
        Objects.requireNonNull(str, "Null userAgent");
        this.f9711a = str;
        this.f9712b = list;
    }

    public final List<String> a() {
        return this.f9712b;
    }

    public final String b() {
        return this.f9711a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (!this.f9711a.equals(lVar.b()) || !this.f9712b.equals(lVar.a())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f9711a.hashCode() ^ 1000003) * 1000003) ^ this.f9712b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("HeartBeatResult{userAgent=");
        d10.append(this.f9711a);
        d10.append(", usedDates=");
        d10.append(this.f9712b);
        d10.append("}");
        return d10.toString();
    }
}
