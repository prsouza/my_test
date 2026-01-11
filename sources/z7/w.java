package z7;

import a.a;
import z7.c0;

public final class w extends c0 {

    /* renamed from: a  reason: collision with root package name */
    public final c0.a f14153a;

    /* renamed from: b  reason: collision with root package name */
    public final c0.c f14154b;

    /* renamed from: c  reason: collision with root package name */
    public final c0.b f14155c;

    public w(c0.a aVar, c0.c cVar, c0.b bVar) {
        this.f14153a = aVar;
        this.f14154b = cVar;
        this.f14155c = bVar;
    }

    public final c0.a a() {
        return this.f14153a;
    }

    public final c0.b b() {
        return this.f14155c;
    }

    public final c0.c c() {
        return this.f14154b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.f14153a.equals(c0Var.a()) || !this.f14154b.equals(c0Var.c()) || !this.f14155c.equals(c0Var.b())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f14153a.hashCode() ^ 1000003) * 1000003) ^ this.f14154b.hashCode()) * 1000003) ^ this.f14155c.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("StaticSessionData{appData=");
        d10.append(this.f14153a);
        d10.append(", osData=");
        d10.append(this.f14154b);
        d10.append(", deviceData=");
        d10.append(this.f14155c);
        d10.append("}");
        return d10.toString();
    }
}
