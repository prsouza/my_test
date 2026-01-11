package b7;

import a7.g;
import h7.i;
import h7.j;
import h7.k;
import h7.y;
import i7.a0;
import i7.p;
import i7.q0;
import j7.r;
import j7.s;
import java.security.GeneralSecurityException;
import java.util.Objects;

public final class e extends g<i> {

    public class a extends g.b<a7.a, i> {
        public a() {
            super(a7.a.class);
        }

        public final Object a(Object obj) throws GeneralSecurityException {
            i iVar = (i) obj;
            return new j7.b(iVar.A().m(), iVar.B().y());
        }
    }

    public class b extends g.a<j, i> {
        public b() {
            super(j.class);
        }

        public final Object a(q0 q0Var) throws GeneralSecurityException {
            j jVar = (j) q0Var;
            i.b D = i.D();
            byte[] a10 = r.a(jVar.x());
            i7.i e10 = i7.i.e(a10, 0, a10.length);
            D.m();
            i.z((i) D.f6389b, e10);
            k y10 = jVar.y();
            D.m();
            i.y((i) D.f6389b, y10);
            Objects.requireNonNull(e.this);
            D.m();
            i.x((i) D.f6389b);
            return (i) D.k();
        }

        public final q0 b(i7.i iVar) throws a0 {
            return j.z(iVar, p.a());
        }

        public final void c(q0 q0Var) throws GeneralSecurityException {
            j jVar = (j) q0Var;
            s.a(jVar.x());
            if (jVar.y().y() != 12 && jVar.y().y() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public e() {
        super(i.class, new a());
    }

    public final String a() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final g.a<j, i> c() {
        return new b();
    }

    public final y.c d() {
        return y.c.SYMMETRIC;
    }

    public final q0 e(i7.i iVar) throws a0 {
        return i.E(iVar, p.a());
    }

    public final void f(q0 q0Var) throws GeneralSecurityException {
        i iVar = (i) q0Var;
        s.c(iVar.C());
        s.a(iVar.A().size());
        if (iVar.B().y() != 12 && iVar.B().y() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
