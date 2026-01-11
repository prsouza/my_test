package i2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class m extends p implements Iterable<p> {

    /* renamed from: a  reason: collision with root package name */
    public final List<p> f6003a = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final String e() {
        if (this.f6003a.size() == 1) {
            return ((p) this.f6003a.get(0)).e();
        }
        throw new IllegalStateException();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof m) && ((m) obj).f6003a.equals(this.f6003a));
    }

    public final int hashCode() {
        return this.f6003a.hashCode();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.p>, java.util.ArrayList] */
    public final Iterator<p> iterator() {
        return this.f6003a.iterator();
    }
}
