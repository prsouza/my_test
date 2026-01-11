package z7;

import z7.a0;

public final class e extends a0.d {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.d.a> f14022a;

    /* renamed from: b  reason: collision with root package name */
    public final String f14023b;

    public e(b0 b0Var, String str, a aVar) {
        this.f14022a = b0Var;
        this.f14023b = str;
    }

    public final b0<a0.d.a> a() {
        return this.f14022a;
    }

    public final String b() {
        return this.f14023b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.d)) {
            return false;
        }
        a0.d dVar = (a0.d) obj;
        if (this.f14022a.equals(dVar.a())) {
            String str = this.f14023b;
            if (str == null) {
                if (dVar.b() == null) {
                    return true;
                }
            } else if (str.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f14022a.hashCode() ^ 1000003) * 1000003;
        String str = this.f14023b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("FilesPayload{files=");
        d10.append(this.f14022a);
        d10.append(", orgId=");
        return android.support.v4.media.a.e(d10, this.f14023b, "}");
    }
}
