package fh;

import ag.a1;
import ag.e;
import ag.k;
import ag.m;
import ag.s;
import ag.t;
import jg.a;

public final class i extends m {

    /* renamed from: a  reason: collision with root package name */
    public final k f5173a;

    /* renamed from: b  reason: collision with root package name */
    public final int f5174b;

    /* renamed from: c  reason: collision with root package name */
    public final a f5175c;

    public i(int i, a aVar) {
        this.f5173a = new k(0);
        this.f5174b = i;
        this.f5175c = aVar;
    }

    public i(t tVar) {
        this.f5173a = k.s(tVar.s(0));
        this.f5174b = k.s(tVar.s(1)).v();
        this.f5175c = a.j(tVar.s(2));
    }

    public static i j(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj != null) {
            return new i(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e();
        eVar.a(this.f5173a);
        eVar.a(new k((long) this.f5174b));
        eVar.a(this.f5175c);
        return new a1(eVar);
    }
}
