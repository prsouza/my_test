package z7;

import a.a;
import z7.a0;

public final class d extends a0.c {

    /* renamed from: a  reason: collision with root package name */
    public final String f14020a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14021b;

    public d(String str, String str2) {
        this.f14020a = str;
        this.f14021b = str2;
    }

    public final String a() {
        return this.f14020a;
    }

    public final String b() {
        return this.f14021b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.c)) {
            return false;
        }
        a0.c cVar = (a0.c) obj;
        if (!this.f14020a.equals(cVar.a()) || !this.f14021b.equals(cVar.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.f14020a.hashCode() ^ 1000003) * 1000003) ^ this.f14021b.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("CustomAttribute{key=");
        d10.append(this.f14020a);
        d10.append(", value=");
        return android.support.v4.media.a.e(d10, this.f14021b, "}");
    }
}
