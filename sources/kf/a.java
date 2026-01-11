package kf;

import fe.k;
import java.io.IOException;
import jf.c;
import mf.e;
import nf.f;
import p002if.a0;
import p002if.b0;
import p002if.q;
import p002if.s;
import p002if.w;
import p002if.x;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public static final C0135a f7528a = new C0135a();

    /* renamed from: kf.a$a  reason: collision with other inner class name */
    public static final class C0135a {
        public static final a0 a(a0 a0Var) {
            if ((a0Var != null ? a0Var.f6458v : null) == null) {
                return a0Var;
            }
            a0.a aVar = new a0.a(a0Var);
            aVar.g = null;
            return aVar.a();
        }

        public final boolean b(String str) {
            return k.Y0("Content-Length", str) || k.Y0("Content-Encoding", str) || k.Y0("Content-Type", str);
        }

        public final boolean c(String str) {
            return !k.Y0("Connection", str) && !k.Y0("Keep-Alive", str) && !k.Y0("Proxy-Authenticate", str) && !k.Y0("Proxy-Authorization", str) && !k.Y0("TE", str) && !k.Y0("Trailers", str) && !k.Y0("Transfer-Encoding", str) && !k.Y0("Upgrade", str);
        }
    }

    public final a0 a(s.a aVar) throws IOException {
        f fVar = (f) aVar;
        e eVar = fVar.f9012b;
        System.currentTimeMillis();
        x xVar = fVar.f9016f;
        e6.e.D(xVar, "request");
        b bVar = new b(xVar, (a0) null);
        if (xVar.a().f6486j) {
            bVar = new b((x) null, (a0) null);
        }
        x xVar2 = bVar.f7529a;
        a0 a0Var = bVar.f7530b;
        boolean z = eVar instanceof e;
        if (xVar2 == null && a0Var == null) {
            a0.a aVar2 = new a0.a();
            aVar2.g(fVar.f9016f);
            aVar2.f(w.HTTP_1_1);
            aVar2.f6464c = 504;
            aVar2.f6465d = "Unsatisfiable Request (only-if-cached)";
            aVar2.g = c.f7252c;
            aVar2.f6470k = -1;
            aVar2.f6471l = System.currentTimeMillis();
            a0 a10 = aVar2.a();
            e6.e.D(eVar, "call");
            return a10;
        } else if (xVar2 == null) {
            e6.e.B(a0Var);
            a0.a aVar3 = new a0.a(a0Var);
            aVar3.b(C0135a.a(a0Var));
            a0 a11 = aVar3.a();
            e6.e.D(eVar, "call");
            return a11;
        } else {
            if (a0Var != null) {
                e6.e.D(eVar, "call");
            }
            a0 b10 = ((f) aVar).b(xVar2);
            if (a0Var != null) {
                if (b10.f6455s == 304) {
                    a0.a aVar4 = new a0.a(a0Var);
                    C0135a aVar5 = f7528a;
                    q qVar = a0Var.f6457u;
                    q qVar2 = b10.f6457u;
                    q.a aVar6 = new q.a();
                    int length = qVar.f6560a.length / 2;
                    for (int i = 0; i < length; i++) {
                        String e10 = qVar.e(i);
                        String h10 = qVar.h(i);
                        if ((!k.Y0("Warning", e10) || !k.d1(h10, "1", false)) && (aVar5.b(e10) || !aVar5.c(e10) || qVar2.d(e10) == null)) {
                            aVar6.b(e10, h10);
                        }
                    }
                    int length2 = qVar2.f6560a.length / 2;
                    for (int i10 = 0; i10 < length2; i10++) {
                        String e11 = qVar2.e(i10);
                        if (!aVar5.b(e11) && aVar5.c(e11)) {
                            aVar6.b(e11, qVar2.h(i10));
                        }
                    }
                    aVar4.f6467f = aVar6.c().g();
                    aVar4.f6470k = b10.z;
                    aVar4.f6471l = b10.A;
                    aVar4.b(C0135a.a(a0Var));
                    a0 a12 = C0135a.a(b10);
                    aVar4.c("networkResponse", a12);
                    aVar4.f6468h = a12;
                    aVar4.a();
                    b0 b0Var = b10.f6458v;
                    e6.e.B(b0Var);
                    b0Var.close();
                    e6.e.B((Object) null);
                    throw null;
                }
                b0 b0Var2 = a0Var.f6458v;
                if (b0Var2 != null) {
                    c.d(b0Var2);
                }
            }
            a0.a aVar7 = new a0.a(b10);
            aVar7.b(C0135a.a(a0Var));
            a0 a13 = C0135a.a(b10);
            aVar7.c("networkResponse", a13);
            aVar7.f6468h = a13;
            return aVar7.a();
        }
    }
}
