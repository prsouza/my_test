package ya;

import e6.e;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final i f13577a;

    /* renamed from: b  reason: collision with root package name */
    public final String f13578b;

    public h(i iVar, String str) {
        e.D(iVar, "propertyName");
        this.f13577a = iVar;
        this.f13578b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f13577a == hVar.f13577a && e.r(this.f13578b, hVar.f13578b);
    }

    public final int hashCode() {
        return this.f13578b.hashCode() + (this.f13577a.hashCode() * 31);
    }

    public final String toString() {
        i iVar = this.f13577a;
        String str = this.f13578b;
        return "Property(propertyName=" + iVar + ", value=" + str + ")";
    }
}
