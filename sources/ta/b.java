package ta;

import android.support.v4.media.a;
import e6.e;
import p002if.b0;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final int f11447a;

    /* renamed from: b  reason: collision with root package name */
    public final b0 f11448b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11449c;

    public b(int i, b0 b0Var, String str) {
        e.D(str, "message");
        this.f11447a = i;
        this.f11448b = b0Var;
        this.f11449c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f11447a == bVar.f11447a && e.r(this.f11448b, bVar.f11448b) && e.r(this.f11449c, bVar.f11449c);
    }

    public final int hashCode() {
        int i = this.f11447a * 31;
        b0 b0Var = this.f11448b;
        return this.f11449c.hashCode() + ((i + (b0Var == null ? 0 : b0Var.hashCode())) * 31);
    }

    public final String toString() {
        int i = this.f11447a;
        b0 b0Var = this.f11448b;
        String str = this.f11449c;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Failure(status=");
        sb2.append(i);
        sb2.append(", errorResponse=");
        sb2.append(b0Var);
        sb2.append(", message=");
        return a.e(sb2, str, ")");
    }
}
