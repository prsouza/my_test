package b7;

import a7.g;
import h7.n;
import h7.o;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class g extends a7.g<n> {

    public class a extends g.b<a7.a, n> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            return new c7.a(((n) obj).z().m());
        }
    }

    public class b extends g.a<o, n> {
        public b() {
            super(o.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            n.b B = n.B();
            byte[] a10 = r.a(((o) q0Var).x());
            i e10 = i.e(a10, 0, a10.length);
            B.m();
            n.y((n) B.f6389b, e10);
            Objects.requireNonNull(g.this);
            B.m();
            n.x((n) B.f6389b);
            return (n) B.k();
        }

        public final q0 b(i iVar) throws a0 {
            return o.y(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            s.a(((o) q0Var).x());
        }
    }

    public g() {
        super(n.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final g.a<o, n> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return n.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        n nVar = (n) q0Var;
        s.c(nVar.A());
        s.a(nVar.z().size());
    }
}
