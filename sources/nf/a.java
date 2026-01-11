package nf;

import e6.e;
import java.io.IOException;
import jf.c;
import p002if.a0;
import p002if.b0;
import p002if.k;
import p002if.q;
import p002if.s;
import p002if.t;
import p002if.x;
import p002if.z;
import uf.m;
import uf.v;

public final class a implements s {

    /* renamed from: a  reason: collision with root package name */
    public final k f9004a;

    public a(k kVar) {
        e.D(kVar, "cookieJar");
        this.f9004a = kVar;
    }

    public final a0 a(s.a aVar) throws IOException {
        b0 b0Var;
        f fVar = (f) aVar;
        x xVar = fVar.f9016f;
        x.a aVar2 = new x.a(xVar);
        z zVar = xVar.f6630e;
        if (zVar != null) {
            t b10 = zVar.b();
            if (b10 != null) {
                aVar2.b("Content-Type", b10.f6582a);
            }
            long a10 = zVar.a();
            if (a10 != -1) {
                aVar2.b("Content-Length", String.valueOf(a10));
                aVar2.f6634c.d("Transfer-Encoding");
            } else {
                aVar2.b("Transfer-Encoding", "chunked");
                aVar2.f6634c.d("Content-Length");
            }
        }
        boolean z = false;
        if (xVar.f6629d.d("Host") == null) {
            aVar2.b("Host", c.w(xVar.f6627b, false));
        }
        if (xVar.f6629d.d("Connection") == null) {
            aVar2.b("Connection", "Keep-Alive");
        }
        if (xVar.f6629d.d("Accept-Encoding") == null && xVar.f6629d.d("Range") == null) {
            aVar2.b("Accept-Encoding", "gzip");
            z = true;
        }
        this.f9004a.b(xVar.f6627b);
        if (xVar.f6629d.d("User-Agent") == null) {
            aVar2.b("User-Agent", "okhttp/4.9.3");
        }
        a0 b11 = fVar.b(aVar2.a());
        e.b(this.f9004a, xVar.f6627b, b11.f6457u);
        a0.a aVar3 = new a0.a(b11);
        aVar3.f6462a = xVar;
        if (z && fe.k.Y0("gzip", a0.a(b11, "Content-Encoding")) && e.a(b11) && (b0Var = b11.f6458v) != null) {
            m mVar = new m(b0Var.e());
            q.a g = b11.f6457u.g();
            g.d("Content-Encoding");
            g.d("Content-Length");
            aVar3.f6467f = g.c().g();
            aVar3.g = new g(a0.a(b11, "Content-Type"), -1, new v(mVar));
        }
        return aVar3.a();
    }
}
