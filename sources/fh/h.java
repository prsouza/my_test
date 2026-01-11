package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.s;
import ag.t;
import jg.a;

public final class h extends m {

    /* renamed from: a  reason: collision with root package name */
    public final k f5171a;

    /* renamed from: b  reason: collision with root package name */
    public final a f5172b;

    public h(t tVar) {
        this.f5171a = k.s(tVar.s(0));
        this.f5172b = a.j(tVar.s(1));
    }

    public h(a aVar) {
        this.f5171a = new k(0);
        this.f5172b = aVar;
    }

    public static final h j(Object obj) {
        if (obj instanceof h) {
            return (h) obj;
        }
        if (obj != null) {
            return new h(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e();
        eVar.a(this.f5171a);
        eVar.a(this.f5172b);
        return new a1(eVar);
    }
}
