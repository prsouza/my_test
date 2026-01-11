package z7;

import z7.a0;

public final class m extends a0.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0277d> f14086a;

    /* renamed from: b  reason: collision with root package name */
    public final a0.e.d.a.b.C0274b f14087b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.a f14088c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.a.b.c f14089d;

    /* renamed from: e  reason: collision with root package name */
    public final b0<a0.e.d.a.b.C0272a> f14090e;

    public m(b0 b0Var, a0.e.d.a.b.C0274b bVar, a0.a aVar, a0.e.d.a.b.c cVar, b0 b0Var2, a aVar2) {
        this.f14086a = b0Var;
        this.f14087b = bVar;
        this.f14088c = aVar;
        this.f14089d = cVar;
        this.f14090e = b0Var2;
    }

    public final a0.a a() {
        return this.f14088c;
    }

    public final b0<a0.e.d.a.b.C0272a> b() {
        return this.f14090e;
    }

    public final a0.e.d.a.b.C0274b c() {
        return this.f14087b;
    }

    public final a0.e.d.a.b.c d() {
        return this.f14089d;
    }

    public final b0<a0.e.d.a.b.C0277d> e() {
        return this.f14086a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a0.e.d.a.b)) {
            return false;
        }
        a0.e.d.a.b bVar = (a0.e.d.a.b) obj;
        b0<a0.e.d.a.b.C0277d> b0Var = this.f14086a;
        if (b0Var != null ? b0Var.equals(bVar.e()) : bVar.e() == null) {
            a0.e.d.a.b.C0274b bVar2 = this.f14087b;
            if (bVar2 != null ? bVar2.equals(bVar.c()) : bVar.c() == null) {
                a0.a aVar = this.f14088c;
                if (aVar != null ? aVar.equals(bVar.a()) : bVar.a() == null) {
                    if (this.f14089d.equals(bVar.d()) && this.f14090e.equals(bVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        b0<a0.e.d.a.b.C0277d> b0Var = this.f14086a;
        int i = 0;
        int hashCode = ((b0Var == null ? 0 : b0Var.hashCode()) ^ 1000003) * 1000003;
        a0.e.d.a.b.C0274b bVar = this.f14087b;
        int hashCode2 = (hashCode ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        a0.a aVar = this.f14088c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return ((((hashCode2 ^ i) * 1000003) ^ this.f14089d.hashCode()) * 1000003) ^ this.f14090e.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("Execution{threads=");
        d10.append(this.f14086a);
        d10.append(", exception=");
        d10.append(this.f14087b);
        d10.append(", appExitInfo=");
        d10.append(this.f14088c);
        d10.append(", signal=");
        d10.append(this.f14089d);
        d10.append(", binaries=");
        d10.append(this.f14090e);
        d10.append("}");
        return d10.toString();
    }
}
