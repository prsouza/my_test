package nf;

import a8.a;
import c3.k;
import e6.e;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.Objects;
import mf.c;
import p002if.a0;
import p002if.b0;
import p002if.n;
import p002if.s;
import p002if.x;
import p002if.z;
import uf.g;
import uf.p;
import uf.u;
import uf.v;

public final class b implements s {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f9005a;

    public b(boolean z) {
        this.f9005a = z;
    }

    public final a0 a(s.a aVar) throws IOException {
        a0.a aVar2;
        a0 a0Var;
        boolean z;
        f fVar = (f) aVar;
        c cVar = fVar.f9015e;
        e.B(cVar);
        x xVar = fVar.f9016f;
        z zVar = xVar.f6630e;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            n nVar = cVar.f8603d;
            mf.e eVar = cVar.f8602c;
            Objects.requireNonNull(nVar);
            e.D(eVar, "call");
            cVar.f8605f.e(xVar);
            n nVar2 = cVar.f8603d;
            mf.e eVar2 = cVar.f8602c;
            Objects.requireNonNull(nVar2);
            e.D(eVar2, "call");
            Long l10 = null;
            boolean z10 = true;
            if (!k.D0(xVar.f6628c) || zVar == null) {
                cVar.f8602c.i(cVar, true, false, null);
                aVar2 = null;
            } else {
                if (fe.k.Y0("100-continue", xVar.f6629d.d("Expect"))) {
                    try {
                        cVar.f8605f.d();
                        aVar2 = cVar.c(true);
                        cVar.d();
                        z = false;
                    } catch (IOException e10) {
                        cVar.f8603d.b(cVar.f8602c, e10);
                        cVar.e(e10);
                        throw e10;
                    }
                } else {
                    aVar2 = null;
                    z = true;
                }
                if (aVar2 == null) {
                    g a10 = p.a(cVar.b(xVar));
                    zVar.c(a10);
                    ((u) a10).close();
                } else {
                    cVar.f8602c.i(cVar, true, false, null);
                    if (!cVar.f8601b.j()) {
                        cVar.f8605f.h().l();
                    }
                }
                z10 = z;
            }
            try {
                cVar.f8605f.b();
                if (aVar2 == null) {
                    aVar2 = cVar.c(false);
                    e.B(aVar2);
                    if (z10) {
                        cVar.d();
                        z10 = false;
                    }
                }
                aVar2.f6462a = xVar;
                aVar2.f6466e = cVar.f8601b.f8646d;
                aVar2.f6470k = currentTimeMillis;
                aVar2.f6471l = System.currentTimeMillis();
                a0 a11 = aVar2.a();
                int i = a11.f6455s;
                if (i == 100) {
                    a0.a c10 = cVar.c(false);
                    e.B(c10);
                    if (z10) {
                        cVar.d();
                    }
                    c10.f6462a = xVar;
                    c10.f6466e = cVar.f8601b.f8646d;
                    c10.f6470k = currentTimeMillis;
                    c10.f6471l = System.currentTimeMillis();
                    a11 = c10.a();
                    i = a11.f6455s;
                }
                n nVar3 = cVar.f8603d;
                mf.e eVar3 = cVar.f8602c;
                Objects.requireNonNull(nVar3);
                e.D(eVar3, "call");
                if (!this.f9005a || i != 101) {
                    a0.a aVar3 = new a0.a(a11);
                    try {
                        String a12 = a0.a(a11, "Content-Type");
                        long a13 = cVar.f8605f.a(a11);
                        aVar3.g = new g(a12, a13, new v(new c.b(cVar, cVar.f8605f.c(a11), a13)));
                        a0Var = aVar3.a();
                    } catch (IOException e11) {
                        cVar.f8603d.c(cVar.f8602c, e11);
                        cVar.e(e11);
                        throw e11;
                    }
                } else {
                    a0.a aVar4 = new a0.a(a11);
                    aVar4.g = jf.c.f7252c;
                    a0Var = aVar4.a();
                }
                if (fe.k.Y0("close", a0Var.f6452a.f6629d.d("Connection")) || fe.k.Y0("close", a0.a(a0Var, "Connection"))) {
                    cVar.f8605f.h().l();
                }
                if (i == 204 || i == 205) {
                    b0 b0Var = a0Var.f6458v;
                    if ((b0Var != null ? b0Var.a() : -1) > 0) {
                        StringBuilder d10 = a.d("HTTP ", i, " had non-zero Content-Length: ");
                        b0 b0Var2 = a0Var.f6458v;
                        if (b0Var2 != null) {
                            l10 = Long.valueOf(b0Var2.a());
                        }
                        d10.append(l10);
                        throw new ProtocolException(d10.toString());
                    }
                }
                return a0Var;
            } catch (IOException e12) {
                cVar.f8603d.b(cVar.f8602c, e12);
                cVar.e(e12);
                throw e12;
            }
        } catch (IOException e13) {
            cVar.f8603d.b(cVar.f8602c, e13);
            cVar.e(e13);
            throw e13;
        }
    }
}
