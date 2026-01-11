package b;

import b.g;
import b.k;
import b.n;
import b.o;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class h extends r<h, a> implements b0 {

    /* renamed from: w  reason: collision with root package name */
    public static final h f2779w;

    /* renamed from: x  reason: collision with root package name */
    public static volatile d0<h> f2780x;

    /* renamed from: s  reason: collision with root package name */
    public n f2781s;

    /* renamed from: t  reason: collision with root package name */
    public g f2782t;

    /* renamed from: u  reason: collision with root package name */
    public k f2783u;

    /* renamed from: v  reason: collision with root package name */
    public o f2784v;

    public static final class a extends r.a<h, a> implements b0 {
        public a() {
            super(h.f2779w);
        }
    }

    static {
        h hVar = new h();
        f2779w = hVar;
        hVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (this.f2781s != null) {
            i10 = 0 + n.w2(1, t());
        }
        if (this.f2782t != null) {
            i10 += n.w2(2, r());
        }
        if (this.f2783u != null) {
            i10 += n.w2(3, s());
        }
        if (this.f2784v != null) {
            i10 += n.w2(4, u());
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (this.f2781s != null) {
            nVar.I2(1, t());
        }
        if (this.f2782t != null) {
            nVar.I2(2, r());
        }
        if (this.f2783u != null) {
            nVar.I2(3, s());
        }
        if (this.f2784v != null) {
            nVar.I2(4, u());
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        switch (hVar.ordinal()) {
            case 0:
                return f2779w;
            case 1:
                r.i iVar = (r.i) obj;
                h hVar2 = (h) obj2;
                this.f2781s = (n) iVar.g(this.f2781s, hVar2.f2781s);
                this.f2782t = (g) iVar.g(this.f2782t, hVar2.f2782t);
                this.f2783u = (k) iVar.g(this.f2783u, hVar2.f2783u);
                this.f2784v = (o) iVar.g(this.f2784v, hVar2.f2784v);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                boolean z = false;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                n nVar = this.f2781s;
                                n.a aVar = nVar != null ? (n.a) nVar.c() : null;
                                n nVar2 = (n) mVar.b(n.C.o(), pVar);
                                this.f2781s = nVar2;
                                if (aVar != null) {
                                    aVar.h(nVar2);
                                    this.f2781s = (n) aVar.j();
                                }
                            } else if (r10 == 18) {
                                g gVar = this.f2782t;
                                g.a aVar2 = gVar != null ? (g.a) gVar.c() : null;
                                g gVar2 = (g) mVar.b(g.f2776t.o(), pVar);
                                this.f2782t = gVar2;
                                if (aVar2 != null) {
                                    aVar2.h(gVar2);
                                    this.f2782t = (g) aVar2.j();
                                }
                            } else if (r10 == 26) {
                                k kVar = this.f2783u;
                                k.a aVar3 = kVar != null ? (k.a) kVar.c() : null;
                                k kVar2 = (k) mVar.b(k.f2795t.o(), pVar);
                                this.f2783u = kVar2;
                                if (aVar3 != null) {
                                    aVar3.h(kVar2);
                                    this.f2783u = (k) aVar3.j();
                                }
                            } else if (r10 == 34) {
                                o oVar = this.f2784v;
                                o.a aVar4 = oVar != null ? (o.a) oVar.c() : null;
                                o oVar2 = (o) mVar.b(o.f2817t.o(), pVar);
                                this.f2784v = oVar2;
                                if (aVar4 != null) {
                                    aVar4.h(oVar2);
                                    this.f2784v = (o) aVar4.j();
                                }
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z = true;
                    } catch (u e10) {
                        throw new RuntimeException(e10);
                    } catch (IOException e11) {
                        throw new RuntimeException(new u(e11.getMessage()));
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new h();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2780x == null) {
                    synchronized (h.class) {
                        if (f2780x == null) {
                            f2780x = new r.b(f2779w);
                        }
                    }
                }
                return f2780x;
            default:
                throw new UnsupportedOperationException();
        }
        return f2779w;
    }

    public final g r() {
        g gVar = this.f2782t;
        return gVar == null ? g.f2776t : gVar;
    }

    public final k s() {
        k kVar = this.f2783u;
        return kVar == null ? k.f2795t : kVar;
    }

    public final n t() {
        n nVar = this.f2781s;
        return nVar == null ? n.C : nVar;
    }

    public final o u() {
        o oVar = this.f2784v;
        return oVar == null ? o.f2817t : oVar;
    }
}
