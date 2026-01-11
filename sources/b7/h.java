package b7;

import a7.g;
import h7.r;
import h7.s;
import h7.y;
import i7.a0;
import i7.p;
import i7.q0;
import j7.i;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class h extends g<r> {

    public class a extends g.b<a7.a, r> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            return new i(((r) obj).z().m());
        }
    }

    public class b extends g.a<s, r> {
        public b() {
            super(s.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            s sVar = (s) q0Var;
            r.b B = r.B();
            Objects.requireNonNull(h.this);
            B.m();
            r.x((r) B.f6389b);
            byte[] a10 = j7.r.a(32);
            i7.i e10 = i7.i.e(a10, 0, a10.length);
            B.m();
            r.y((r) B.f6389b, e10);
            return (r) B.k();
        }

        public final q0 b(i7.i iVar) throws a0 {
            return s.x(iVar, p.a());
        }

        public final /* bridge */ /* synthetic */ void c(q0 q0Var) throws GeneralSecurityException {
            s sVar = (s) q0Var;
        }
    }

    public h() {
        super(r.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final g.a<s, r> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i7.i iVar) throws a0 {
        return r.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        r rVar = (r) q0Var;
        j7.s.c(rVar.A());
        if (rVar.z().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
