package mh;

import ag.w0;
import fh.e;
import fh.h;
import fh.i;
import fh.j;
import fh.l;
import fh.n;
import java.io.IOException;
import jg.a;
import jg.b;
import lh.c;
import nh.o;
import nh.q;
import nh.v;
import nh.w;

public final class d {
    public static b a(a.b bVar) throws IOException {
        if (bVar instanceof jh.b) {
            jh.b bVar2 = (jh.b) bVar;
            return new b(e.b(bVar2.F), bVar2.S0());
        } else if (bVar instanceof c) {
            c cVar = (c) bVar;
            return new b(new a(e.f5153d, new h(e.c(cVar.F))), cVar.S0());
        } else if (bVar instanceof ih.b) {
            return new b(new a(e.f5154e), ((ih.b) bVar).S0());
        } else {
            if (bVar instanceof gh.h) {
                a9.c l10 = a9.c.l();
                l10.m(1);
                l10.j((gh.h) bVar);
                return new b(new a(hg.a.f5968a), (ag.d) new w0(l10.i()));
            } else if (bVar instanceof gh.c) {
                gh.c cVar2 = (gh.c) bVar;
                a9.c l11 = a9.c.l();
                l11.m(cVar2.F);
                l11.j(cVar2);
                return new b(new a(hg.a.f5968a), (ag.d) new w0(l11.i()));
            } else if (bVar instanceof v) {
                v vVar = (v) bVar;
                byte[] b10 = w.b(vVar.J);
                byte[] b11 = w.b(vVar.I);
                byte[] encoded = vVar.getEncoded();
                if (encoded.length > b10.length + b11.length) {
                    return new b(new a(eg.a.f4833a), (ag.d) new w0(encoded));
                }
                return new b(new a(e.f5155f, new i(vVar.G.f9127b, e.e(vVar.F))), (ag.d) new n(b10, b11));
            } else if (bVar instanceof q) {
                q qVar = (q) bVar;
                byte[] b12 = w.b(qVar.J);
                byte[] b13 = w.b(qVar.I);
                byte[] S0 = qVar.S0();
                if (S0.length > b12.length + b13.length) {
                    return new b(new a(eg.a.f4834b), (ag.d) new w0(S0));
                }
                ag.n nVar = e.g;
                o oVar = qVar.G;
                return new b(new a(nVar, new j(oVar.f9111c, oVar.f9112d, e.e(qVar.F))), (ag.d) new l(w.b(qVar.J), w.b(qVar.I)));
            } else {
                throw new IOException("key parameters not recognized");
            }
        }
    }
}
