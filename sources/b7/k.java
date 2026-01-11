package b7;

import a7.g;
import h7.g0;
import h7.h0;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class k extends g<g0> {

    public class a extends g.b<a7.a, g0> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            g0 g0Var = (g0) obj;
            String z = g0Var.z().z();
            return new j(g0Var.z().y(), a7.k.a(z).a(z));
        }
    }

    public class b extends g.a<h0, g0> {
        public b() {
            super(h0.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            g0.b B = g0.B();
            B.m();
            g0.y((g0) B.f6389b, (h0) q0Var);
            Objects.requireNonNull(k.this);
            B.m();
            g0.x((g0) B.f6389b);
            return (g0) B.k();
        }

        public final q0 b(i iVar) throws a0 {
            return h0.A(iVar, p.a());
        }

        public final /* bridge */ /* synthetic */ void c(q0 q0Var) throws GeneralSecurityException {
            h0 h0Var = (h0) q0Var;
        }
    }

    public k() {
        super(g0.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    public final g.a<h0, g0> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.REMOTE;
    }

    public final q0 e(i iVar) throws a0 {
        return g0.C(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        s.c(((g0) q0Var).A());
    }
}
