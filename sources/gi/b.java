package gi;

import androidx.activity.result.d;
import xe.p;

public final class b implements p {

    /* renamed from: a  reason: collision with root package name */
    public int f5515a;

    /* renamed from: b  reason: collision with root package name */
    public int f5516b;

    public b(int i, int i10) {
        this.f5515a = i;
        this.f5516b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f5515a == bVar.f5515a && this.f5516b == bVar.f5516b;
    }

    public final int hashCode() {
        return (this.f5515a * 31) + this.f5516b;
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("HopCountBlockData(limit=");
        q10.append(this.f5515a);
        q10.append(", count=");
        return d.c(q10, this.f5516b, ")");
    }
}
