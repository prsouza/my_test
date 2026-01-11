package m0;

import a.a;
import java.util.Objects;

public final class b<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f8362a;

    /* renamed from: b  reason: collision with root package name */
    public final S f8363b;

    public b(F f10, S s10) {
        this.f8362a = f10;
        this.f8363b = s10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (!Objects.equals(bVar.f8362a, this.f8362a) || !Objects.equals(bVar.f8363b, this.f8363b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        F f10 = this.f8362a;
        int i = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f8363b;
        if (s10 != null) {
            i = s10.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.d("Pair{");
        d10.append(this.f8362a);
        d10.append(" ");
        d10.append(this.f8363b);
        d10.append("}");
        return d10.toString();
    }
}
