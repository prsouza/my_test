package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.s;
import ag.t;
import jg.a;

public final class j extends m {

    /* renamed from: a  reason: collision with root package name */
    public final k f5176a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5177b;

    /* renamed from: c  reason: collision with root package name */
    public final int f5178c;

    /* renamed from: s  reason: collision with root package name */
    public final a f5179s;

    public j(int i, int i10, a aVar) {
        this.f5176a = new k(0);
        this.f5177b = i;
        this.f5178c = i10;
        this.f5179s = aVar;
    }

    public j(t tVar) {
        this.f5176a = k.s(tVar.s(0));
        this.f5177b = k.s(tVar.s(1)).v();
        this.f5178c = k.s(tVar.s(2)).v();
        this.f5179s = a.j(tVar.s(3));
    }

    public static j j(Object obj) {
        if (obj instanceof j) {
            return (j) obj;
        }
        if (obj != null) {
            return new j(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e();
        eVar.a(this.f5176a);
        eVar.a(new k((long) this.f5177b));
        eVar.a(new k((long) this.f5178c));
        eVar.a(this.f5179s);
        return new a1(eVar);
    }
}
