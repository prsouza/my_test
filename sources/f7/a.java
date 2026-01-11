package f7;

import a7.g;
import a7.l;
import h7.a;
import h7.c;
import h7.y;
import i7.a0;
import i7.i;
import i7.p;
import i7.q0;
import j7.o;
import j7.q;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;

public final class a extends g<h7.a> {

    /* renamed from: f7.a$a  reason: collision with other inner class name */
    public class C0080a extends g.b<l, h7.a> {
        public C0080a() {
            super(l.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            h7.a aVar = (h7.a) obj;
            return new q(new o(aVar.A().m()), aVar.B().y());
        }
    }

    public class b extends g.a<h7.b, h7.a> {
        public b() {
            super(h7.b.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            h7.b bVar = (h7.b) q0Var;
            a.b D = h7.a.D();
            D.m();
            h7.a.x((h7.a) D.f6389b);
            byte[] a10 = r.a(bVar.x());
            i e10 = i.e(a10, 0, a10.length);
            D.m();
            h7.a.y((h7.a) D.f6389b, e10);
            c y10 = bVar.y();
            D.m();
            h7.a.z((h7.a) D.f6389b, y10);
            return (h7.a) D.k();
        }

        public final q0 b(i iVar) throws a0 {
            return h7.b.z(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            h7.b bVar = (h7.b) q0Var;
            a.g(bVar.y());
            if (bVar.x() != 32) {
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            }
        }
    }

    public a() {
        super(h7.a.class, new C0080a());
    }

    public static void g(c cVar) throws GeneralSecurityException {
        if (cVar.y() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.y() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final g.a<h7.b, h7.a> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i iVar) throws a0 {
        return h7.a.E(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        h7.a aVar = (h7.a) q0Var;
        s.c(aVar.C());
        if (aVar.A().size() == 32) {
            g(aVar.B());
            return;
        }
        throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
    }
}
