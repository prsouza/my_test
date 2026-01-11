package b7;

import a7.g;
import h7.l;
import h7.m;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.c;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class f extends g<l> {

    public class a extends g.b<a7.a, l> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            return new c(((l) obj).z().m());
        }
    }

    public class b extends g.a<m, l> {
        public b() {
            super(m.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            l.b B = l.B();
            byte[] a10 = r.a(((m) q0Var).y());
            i e10 = i.e(a10, 0, a10.length);
            B.m();
            l.y((l) B.f6389b, e10);
            Objects.requireNonNull(f.this);
            B.m();
            l.x((l) B.f6389b);
            return (l) B.k();
        }

        public final q0 b(i iVar) throws a0 {
            return m.A(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            s.a(((m) q0Var).y());
        }
    }

    public f() {
        super(l.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final g.a<m, l> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return l.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        l lVar = (l) q0Var;
        s.c(lVar.A());
        s.a(lVar.z().size());
    }
}
