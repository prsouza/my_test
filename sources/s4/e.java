package s4;

import a.a;
import s4.k;

public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final k.a f10906a;

    /* renamed from: b  reason: collision with root package name */
    public final a f10907b;

    public e(k.a aVar, a aVar2) {
        this.f10906a = aVar;
        this.f10907b = aVar2;
    }

    public final a a() {
        return this.f10907b;
    }

    public final k.a b() {
        return this.f10906a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        k.a aVar = this.f10906a;
        if (aVar != null ? aVar.equals(kVar.b()) : kVar.b() == null) {
            a aVar2 = this.f10907b;
            if (aVar2 == null) {
                if (kVar.a() == null) {
                    return true;
                }
            } else if (aVar2.equals(kVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        k.a aVar = this.f10906a;
        int i = 0;
        int hashCode = ((aVar == null ? 0 : aVar.hashCode()) ^ 1000003) * 1000003;
        a aVar2 = this.f10907b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder d10 = a.d("ClientInfo{clientType=");
        d10.append(this.f10906a);
        d10.append(", androidClientInfo=");
        d10.append(this.f10907b);
        d10.append("}");
        return d10.toString();
    }
}
