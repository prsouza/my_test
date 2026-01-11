package mh;

import ag.n;
import ag.o;
import fh.i;
import fh.j;
import gh.h;
import java.io.IOException;
import java.util.HashMap;
import nh.q;
import nh.t;
import nh.v;
import nh.w;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static HashMap f8732a;

    public static class a extends e {
        public final a.b a(jg.b bVar) throws IOException {
            byte[] bArr = o.s(bVar.k()).f430a;
            return android.support.v4.media.b.F(bArr, 0) == 1 ? h.S0(xh.a.d(bArr, 4, bArr.length)) : gh.c.S0(xh.a.d(bArr, 4, bArr.length));
        }
    }

    public static class b extends e {
        public final a.b a(jg.b bVar) throws IOException {
            return new ih.b(bVar.f7259b.r());
        }
    }

    /* renamed from: mh.c$c  reason: collision with other inner class name */
    public static class C0159c extends e {
        public final a.b a(jg.b bVar) throws IOException {
            return new jh.b(((Integer) e.i.get(bVar.f7258a.f7256a)).intValue(), bVar.f7259b.s());
        }
    }

    public static class d extends e {
        public final a.b a(jg.b bVar) throws IOException {
            return new lh.c(bVar.f7259b.r(), e.d(fh.h.j(bVar.f7258a.f7257b)));
        }
    }

    public static abstract class e {
        public abstract a.b a(jg.b bVar) throws IOException;
    }

    public static class f extends e {
        public final a.b a(jg.b bVar) throws IOException {
            i j10 = i.j(bVar.f7258a.f7257b);
            if (j10 != null) {
                n nVar = j10.f5175c.f7256a;
                fh.n j11 = fh.n.j(bVar.k());
                v.a aVar = new v.a(new t(j10.f5174b, nh.f.b(e.a(nVar).c())));
                aVar.f9142c = w.b(xh.a.a(j11.f5198a));
                aVar.f9141b = w.b(xh.a.a(j11.f5199b));
                return new v(aVar);
            }
            byte[] bArr = o.s(bVar.k()).f430a;
            v.a aVar2 = new v.a(t.i.get(Integer.valueOf(android.support.v4.media.b.F(bArr, 0))));
            aVar2.f9143d = w.b(bArr);
            return new v(aVar2);
        }
    }

    public static class g extends e {
        public final a.b a(jg.b bVar) throws IOException {
            j j10 = j.j(bVar.f7258a.f7257b);
            if (j10 != null) {
                n nVar = j10.f5179s.f7256a;
                fh.n j11 = fh.n.j(bVar.k());
                q.a aVar = new q.a(new nh.o(j10.f5177b, j10.f5178c, nh.f.b(e.a(nVar).c())));
                aVar.f9122c = w.b(xh.a.a(j11.f5198a));
                aVar.f9121b = w.b(xh.a.a(j11.f5199b));
                return new q(aVar);
            }
            byte[] bArr = o.s(bVar.k()).f430a;
            q.a aVar2 = new q.a(nh.o.f9108e.get(Integer.valueOf(android.support.v4.media.b.F(bArr, 0))));
            aVar2.f9123d = w.b(bArr);
            return new q(aVar2);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f8732a = hashMap;
        hashMap.put(fh.e.f5156h, new C0159c());
        f8732a.put(fh.e.i, new C0159c());
        f8732a.put(fh.e.f5153d, new d());
        f8732a.put(fh.e.f5154e, new b());
        f8732a.put(fh.e.f5155f, new f());
        f8732a.put(fh.e.g, new g());
        f8732a.put(eg.a.f4833a, new f());
        f8732a.put(eg.a.f4834b, new g());
        f8732a.put(hg.a.f5968a, new a());
    }

    public static a.b a(jg.b bVar) throws IOException {
        jg.a aVar = bVar.f7258a;
        e eVar = (e) f8732a.get(aVar.f7256a);
        if (eVar != null) {
            return eVar.a(bVar);
        }
        StringBuilder d10 = a.a.d("algorithm identifier in public key not recognised: ");
        d10.append(aVar.f7256a);
        throw new IOException(d10.toString());
    }
}
