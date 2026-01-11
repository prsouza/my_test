package b7;

import a7.g;
import a7.k;
import h7.e0;
import h7.f0;
import h7.y;
import i7.a0;
import i7.p;
import i7.q0;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class i extends g<e0> {

    public class a extends g.b<a7.a, e0> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            String y10 = ((e0) obj).z().y();
            return k.a(y10).a(y10);
        }
    }

    public class b extends g.a<f0, e0> {
        public b() {
            super(f0.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            e0.b B = e0.B();
            B.m();
            e0.y((e0) B.f6389b, (f0) q0Var);
            Objects.requireNonNull(i.this);
            B.m();
            e0.x((e0) B.f6389b);
            return (e0) B.k();
        }

        public final q0 b(i7.i iVar) throws a0 {
            return f0.z(iVar, p.a());
        }

        public final /* bridge */ /* synthetic */ void c(q0 q0Var) throws GeneralSecurityException {
            f0 f0Var = (f0) q0Var;
        }
    }

    public i() {
        super(e0.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    public final g.a<f0, e0> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.REMOTE;
    }

    public final q0 e(i7.i iVar) throws a0 {
        return e0.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        s.c(((e0) q0Var).A());
    }
}
