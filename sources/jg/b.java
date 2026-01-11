package jg;

import a.a;
import ag.a1;
import ag.d;
import ag.e;
import ag.m;
import ag.n0;
import ag.s;
import ag.t;
import java.io.IOException;
import java.util.Enumeration;

public final class b extends m {

    /* renamed from: a  reason: collision with root package name */
    public a f7258a;

    /* renamed from: b  reason: collision with root package name */
    public n0 f7259b;

    public b(t tVar) {
        if (tVar.size() == 2) {
            Enumeration t10 = tVar.t();
            this.f7258a = a.j(t10.nextElement());
            this.f7259b = n0.t(t10.nextElement());
            return;
        }
        StringBuilder d10 = a.d("Bad sequence size: ");
        d10.append(tVar.size());
        throw new IllegalArgumentException(d10.toString());
    }

    public b(a aVar, d dVar) throws IOException {
        this.f7259b = new n0(dVar);
        this.f7258a = aVar;
    }

    public b(a aVar, byte[] bArr) {
        this.f7259b = new n0(bArr);
        this.f7258a = aVar;
    }

    public static b j(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(t.r(obj));
        }
        return null;
    }

    public final s d() {
        e eVar = new e(2);
        eVar.a(this.f7258a);
        eVar.a(this.f7259b);
        return new a1(eVar);
    }

    public final s k() throws IOException {
        return s.n(this.f7259b.s());
    }
}
