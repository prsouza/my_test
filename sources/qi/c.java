package qi;

import a.b;
import di.a;
import e6.e;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final a f10498a;

    /* renamed from: b  reason: collision with root package name */
    public final di.c f10499b;

    /* renamed from: c  reason: collision with root package name */
    public final ji.c f10500c;

    public c(a aVar, di.c cVar, ji.c cVar2) {
        this.f10498a = aVar;
        this.f10499b = cVar;
        this.f10500c = cVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e.r(this.f10498a, cVar.f10498a) && e.r(this.f10499b, cVar.f10499b) && e.r(this.f10500c, cVar.f10500c);
    }

    public final int hashCode() {
        int hashCode = this.f10499b.hashCode();
        return this.f10500c.hashCode() + ((hashCode + (this.f10498a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder q10 = b.q("BlePeer(device=");
        q10.append(this.f10498a);
        q10.append(", scanRecord=");
        q10.append(this.f10499b);
        q10.append(", scanItem=");
        q10.append(this.f10500c);
        q10.append(')');
        return q10.toString();
    }
}
