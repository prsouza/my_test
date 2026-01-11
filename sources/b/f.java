package b;

import b.e;
import b.h;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class f extends r<f, a> implements b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final f f2771v;

    /* renamed from: w  reason: collision with root package name */
    public static volatile d0<f> f2772w;

    /* renamed from: s  reason: collision with root package name */
    public h f2773s = h.f14304b;

    /* renamed from: t  reason: collision with root package name */
    public h f2774t;

    /* renamed from: u  reason: collision with root package name */
    public e f2775u;

    public static final class a extends r.a<f, a> implements b0 {
        public a() {
            super(f.f2771v);
        }
    }

    static {
        f fVar = new f();
        f2771v = fVar;
        fVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f2773s.isEmpty()) {
            i10 = 0 + n.v2(1, this.f2773s);
        }
        if (this.f2774t != null) {
            i10 += n.w2(2, r());
        }
        e eVar = this.f2775u;
        if (eVar != null) {
            i10 += n.w2(3, eVar);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (!this.f2773s.isEmpty()) {
            nVar.H2(1, this.f2773s);
        }
        if (this.f2774t != null) {
            nVar.I2(2, r());
        }
        e eVar = this.f2775u;
        if (eVar != null) {
            nVar.I2(3, eVar);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2771v;
            case 1:
                r.i iVar = (r.i) obj;
                f fVar = (f) obj2;
                h hVar2 = this.f2773s;
                h.d dVar = h.f14304b;
                boolean z11 = hVar2 != dVar;
                h hVar3 = fVar.f2773s;
                if (hVar3 == dVar) {
                    z = false;
                }
                this.f2773s = iVar.n(z11, hVar2, z, hVar3);
                this.f2774t = (h) iVar.g(this.f2774t, fVar.f2774t);
                this.f2775u = (e) iVar.g(this.f2775u, fVar.f2775u);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                this.f2773s = mVar.f();
                            } else if (r10 == 18) {
                                h hVar4 = this.f2774t;
                                h.a aVar = hVar4 != null ? (h.a) hVar4.c() : null;
                                h hVar5 = (h) mVar.b(h.f2779w.o(), pVar);
                                this.f2774t = hVar5;
                                if (aVar != null) {
                                    aVar.h(hVar5);
                                    this.f2774t = (h) aVar.j();
                                }
                            } else if (r10 == 26) {
                                e eVar = this.f2775u;
                                e.a aVar2 = eVar != null ? (e.a) eVar.c() : null;
                                e eVar2 = (e) mVar.b(e.f2767u.o(), pVar);
                                this.f2775u = eVar2;
                                if (aVar2 != null) {
                                    aVar2.h(eVar2);
                                    this.f2775u = (e) aVar2.j();
                                }
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z10 = true;
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
                return new f();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2772w == null) {
                    synchronized (f.class) {
                        if (f2772w == null) {
                            f2772w = new r.b(f2771v);
                        }
                    }
                }
                return f2772w;
            default:
                throw new UnsupportedOperationException();
        }
        return f2771v;
    }

    public final h r() {
        h hVar = this.f2774t;
        return hVar == null ? h.f2779w : hVar;
    }
}
