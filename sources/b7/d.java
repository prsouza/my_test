package b7;

import a7.g;
import h7.f;
import h7.h;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.n;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class d extends g<f> {

    public class a extends g.b<n, f> {
        public a() {
            super(n.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            f fVar = (f) obj;
            return new j7.a(fVar.B().m(), fVar.C().y());
        }
    }

    public class b extends g.a<h7.g, f> {
        public b() {
            super(h7.g.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            h7.g gVar = (h7.g) q0Var;
            f.b E = f.E();
            h z = gVar.z();
            E.m();
            f.y((f) E.f6389b, z);
            byte[] a10 = r.a(gVar.y());
            i e10 = i.e(a10, 0, a10.length);
            E.m();
            f.z((f) E.f6389b, e10);
            Objects.requireNonNull(d.this);
            E.m();
            f.x((f) E.f6389b);
            return (f) E.k();
        }

        public final q0 b(i iVar) throws a0 {
            return h7.g.A(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            h7.g gVar = (h7.g) q0Var;
            s.a(gVar.y());
            d.this.h(gVar.z());
        }
    }

    public d() {
        super(f.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final g.a<h7.g, f> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return f.F(iVar, p.a());
    }

    /* renamed from: g */
    public final void f(f fVar) throws GeneralSecurityException {
        s.c(fVar.D());
        s.a(fVar.B().size());
        h(fVar.C());
    }

    public final void h(h hVar) throws GeneralSecurityException {
        if (hVar.y() < 12 || hVar.y() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
