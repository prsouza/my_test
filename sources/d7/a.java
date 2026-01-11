package d7;

import a7.c;
import a7.g;
import h7.p;
import h7.q;
import h7.y;
import i7.a0;
import i7.i;
import i7.q0;
import j7.d;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Objects;

public final class a extends g<p> {

    /* renamed from: d7.a$a  reason: collision with other inner class name */
    public class C0061a extends g.b<c, p> {
        public C0061a() {
            super(c.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            return new d(((p) obj).z().m());
        }
    }

    public class b extends g.a<q, p> {
        public b() {
            super(q.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            p.b B = p.B();
            byte[] a10 = r.a(((q) q0Var).y());
            i e10 = i.e(a10, 0, a10.length);
            B.m();
            p.y((p) B.f6389b, e10);
            Objects.requireNonNull(a.this);
            B.m();
            p.x((p) B.f6389b);
            return (p) B.k();
        }

        public final q0 b(i iVar) throws a0 {
            return q.A(iVar, i7.p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            q qVar = (q) q0Var;
            if (qVar.y() != 64) {
                StringBuilder d10 = a.a.d("invalid key size: ");
                d10.append(qVar.y());
                d10.append(". Valid keys must have 64 bytes.");
                throw new InvalidAlgorithmParameterException(d10.toString());
            }
        }
    }

    public a() {
        super(p.class, new C0061a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final g.a<q, p> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return p.C(iVar, i7.p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        p pVar = (p) q0Var;
        s.c(pVar.A());
        if (pVar.z().size() != 64) {
            StringBuilder d10 = a.a.d("invalid key size: ");
            d10.append(pVar.z().size());
            d10.append(". Valid keys must have 64 bytes.");
            throw new InvalidKeyException(d10.toString());
        }
    }
}
