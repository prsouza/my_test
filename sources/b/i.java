package b;

import b.e;
import b.f;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class i extends r<i, a> implements b0 {

    /* renamed from: w  reason: collision with root package name */
    public static final i f2785w;

    /* renamed from: x  reason: collision with root package name */
    public static volatile d0<i> f2786x;

    /* renamed from: s  reason: collision with root package name */
    public f f2787s;

    /* renamed from: t  reason: collision with root package name */
    public h f2788t = h.f14304b;

    /* renamed from: u  reason: collision with root package name */
    public long f2789u;

    /* renamed from: v  reason: collision with root package name */
    public e f2790v;

    public static final class a extends r.a<i, a> implements b0 {
        public a() {
            super(i.f2785w);
        }
    }

    static {
        i iVar = new i();
        f2785w = iVar;
        iVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (this.f2787s != null) {
            i10 = 0 + n.w2(1, r());
        }
        if (!this.f2788t.isEmpty()) {
            i10 += n.v2(2, this.f2788t);
        }
        long j10 = this.f2789u;
        if (j10 != 0) {
            i10 += n.F2(3, j10);
        }
        if (this.f2790v != null) {
            i10 += n.w2(4, s());
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (this.f2787s != null) {
            nVar.I2(1, r());
        }
        if (!this.f2788t.isEmpty()) {
            nVar.H2(2, this.f2788t);
        }
        long j10 = this.f2789u;
        if (j10 != 0) {
            nVar.T2(3, j10);
        }
        if (this.f2790v != null) {
            nVar.I2(4, s());
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2785w;
            case 1:
                r.i iVar = (r.i) obj;
                i iVar2 = (i) obj2;
                this.f2787s = (f) iVar.g(this.f2787s, iVar2.f2787s);
                h hVar2 = this.f2788t;
                h.d dVar = h.f14304b;
                boolean z10 = hVar2 != dVar;
                h hVar3 = iVar2.f2788t;
                this.f2788t = iVar.n(z10, hVar2, hVar3 != dVar, hVar3);
                long j10 = this.f2789u;
                boolean z11 = j10 != 0;
                long j11 = iVar2.f2789u;
                this.f2789u = iVar.j(z11, j10, j11 != 0, j11);
                this.f2790v = (e) iVar.g(this.f2790v, iVar2.f2790v);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                f fVar = this.f2787s;
                                f.a aVar = fVar != null ? (f.a) fVar.c() : null;
                                f fVar2 = (f) mVar.b(f.f2771v.o(), pVar);
                                this.f2787s = fVar2;
                                if (aVar != null) {
                                    aVar.h(fVar2);
                                    this.f2787s = (f) aVar.j();
                                }
                            } else if (r10 == 18) {
                                this.f2788t = mVar.f();
                            } else if (r10 == 24) {
                                this.f2789u = mVar.o();
                            } else if (r10 == 34) {
                                e eVar = this.f2790v;
                                e.a aVar2 = eVar != null ? (e.a) eVar.c() : null;
                                e eVar2 = (e) mVar.b(e.f2767u.o(), pVar);
                                this.f2790v = eVar2;
                                if (aVar2 != null) {
                                    aVar2.h(eVar2);
                                    this.f2790v = (e) aVar2.j();
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
                return new i();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2786x == null) {
                    synchronized (i.class) {
                        if (f2786x == null) {
                            f2786x = new r.b(f2785w);
                        }
                    }
                }
                return f2786x;
            default:
                throw new UnsupportedOperationException();
        }
        return f2785w;
    }

    public final f r() {
        f fVar = this.f2787s;
        return fVar == null ? f.f2771v : fVar;
    }

    public final e s() {
        e eVar = this.f2790v;
        return eVar == null ? e.f2767u : eVar;
    }
}
