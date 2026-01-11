package b7;

import a7.g;
import a7.l;
import h7.d;
import h7.e;
import h7.f;
import h7.h;
import h7.v;
import h7.w;
import h7.x;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.k;
import j7.n;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class c extends g<d> {

    public class a extends g.b<a7.a, d> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            d dVar = (d) obj;
            return new k((n) new d().b(dVar.A(), n.class), (l) new f7.b().b(dVar.B(), l.class), dVar.B().C().z());
        }
    }

    public class b extends g.a<e, d> {
        public b() {
            super(e.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            e eVar = (e) q0Var;
            d dVar = new d();
            h7.g x10 = eVar.x();
            f.b E = f.E();
            h z = x10.z();
            E.m();
            f.y((f) E.f6389b, z);
            byte[] a10 = r.a(x10.y());
            i e10 = i.e(a10, 0, a10.length);
            E.m();
            f.z((f) E.f6389b, e10);
            Objects.requireNonNull(dVar);
            E.m();
            f.x((f) E.f6389b);
            f7.b bVar = new f7.b();
            w y10 = eVar.y();
            v.b E2 = v.E();
            Objects.requireNonNull(bVar);
            E2.m();
            v.x((v) E2.f6389b);
            x z10 = y10.z();
            E2.m();
            v.y((v) E2.f6389b, z10);
            byte[] a11 = r.a(y10.y());
            i e11 = i.e(a11, 0, a11.length);
            E2.m();
            v.z((v) E2.f6389b, e11);
            d.b D = d.D();
            D.m();
            d.y((d) D.f6389b, (f) E.k());
            D.m();
            d.z((d) D.f6389b, (v) E2.k());
            Objects.requireNonNull(c.this);
            D.m();
            d.x((d) D.f6389b);
            return (d) D.k();
        }

        public final q0 b(i iVar) throws a0 {
            return e.z(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            e eVar = (e) q0Var;
            new d().c().c(eVar.x());
            new f7.b().c().c(eVar.y());
            s.a(eVar.x().y());
        }
    }

    public c() {
        super(d.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final g.a<e, d> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return d.E(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        d dVar = (d) q0Var;
        s.c(dVar.C());
        new d().f(dVar.A());
        new f7.b().f(dVar.B());
    }
}
