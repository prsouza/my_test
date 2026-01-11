package s4;

import a.a;
import s4.o;

public final class i extends o {

    /* renamed from: a  reason: collision with root package name */
    public final o.b f10927a;

    /* renamed from: b  reason: collision with root package name */
    public final o.a f10928b;

    public i(o.b bVar, o.a aVar) {
        this.f10927a = bVar;
        this.f10928b = aVar;
    }

    public final o.a a() {
        return this.f10928b;
    }

    public final o.b b() {
        return this.f10927a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        o.b bVar = this.f10927a;
        if (bVar != null ? bVar.equals(oVar.b()) : oVar.b() == null) {
            o.a aVar = this.f10928b;
            if (aVar == null) {
                if (oVar.a() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        o.b bVar = this.f10927a;
        int i = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        o.a aVar = this.f10928b;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.d("NetworkConnectionInfo{networkType=");
        d10.append(this.f10927a);
        d10.append(", mobileSubtype=");
        d10.append(this.f10928b);
        d10.append("}");
        return d10.toString();
    }
}
