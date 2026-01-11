package b7;

import a7.g;
import h7.k0;
import h7.l0;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.r;
import j7.s;
import j7.u;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class l extends g<k0> {

    public class a extends g.b<a7.a, k0> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            return new u(((k0) obj).z().m());
        }
    }

    public class b extends g.a<l0, k0> {
        public b() {
            super(l0.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            l0 l0Var = (l0) q0Var;
            k0.b B = k0.B();
            Objects.requireNonNull(l.this);
            B.m();
            k0.x((k0) B.f6389b);
            byte[] a10 = r.a(32);
            i e10 = i.e(a10, 0, a10.length);
            B.m();
            k0.y((k0) B.f6389b, e10);
            return (k0) B.k();
        }

        public final q0 b(i iVar) throws a0 {
            return l0.x(iVar, p.a());
        }

        public final /* bridge */ /* synthetic */ void c(q0 q0Var) throws GeneralSecurityException {
            l0 l0Var = (l0) q0Var;
        }
    }

    public l() {
        super(k0.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    public final g.a<l0, k0> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return k0.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        k0 k0Var = (k0) q0Var;
        s.c(k0Var.A());
        if (k0Var.z().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
