package jg;

import ag.a1;
import ag.d;
import ag.e;
import ag.m;
import ag.n;
import ag.s;
import ag.t;

public final class a extends m {

    /* renamed from: a  reason: collision with root package name */
    public n f7256a;

    /* renamed from: b  reason: collision with root package name */
    public d f7257b;

    public a(n nVar) {
        this.f7256a = nVar;
    }

    public a(n nVar, d dVar) {
        this.f7256a = nVar;
        this.f7257b = dVar;
    }

    public a(t tVar) {
        if (tVar.size() < 1 || tVar.size() > 2) {
            StringBuilder d10 = a.a.d("Bad sequence size: ");
            d10.append(tVar.size());
            throw new IllegalArgumentException(d10.toString());
        }
        this.f7256a = n.t(tVar.s(0));
        this.f7257b = tVar.size() == 2 ? tVar.s(1) : null;
    }

    public static a j(Object obj) {
        if (obj instanceof a) {
            return (a) obj;
        }
        if (obj != null) {
            return new a(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e(2);
        eVar.a(this.f7256a);
        d dVar = this.f7257b;
        if (dVar != null) {
            eVar.a(dVar);
        }
        return new a1(eVar);
    }
}
