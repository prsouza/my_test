package b;

import b.e;
import b.m;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class l extends r<l, a> implements b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final l f2799v;

    /* renamed from: w  reason: collision with root package name */
    public static volatile d0<l> f2800w;

    /* renamed from: s  reason: collision with root package name */
    public int f2801s;

    /* renamed from: t  reason: collision with root package name */
    public m f2802t;

    /* renamed from: u  reason: collision with root package name */
    public e f2803u;

    public static final class a extends r.a<l, a> implements b0 {
        public a() {
            super(l.f2799v);
        }
    }

    static {
        l lVar = new l();
        f2799v = lVar;
        lVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f2801s;
        if (i11 != 0) {
            i10 = 0 + n.E2(1, i11);
        }
        m mVar = this.f2802t;
        if (mVar != null) {
            i10 += n.w2(2, mVar);
        }
        e eVar = this.f2803u;
        if (eVar != null) {
            i10 += n.w2(3, eVar);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f2801s;
        if (i != 0) {
            nVar.X2(1, i);
        }
        m mVar = this.f2802t;
        if (mVar != null) {
            nVar.I2(2, mVar);
        }
        e eVar = this.f2803u;
        if (eVar != null) {
            nVar.I2(3, eVar);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2799v;
            case 1:
                r.i iVar = (r.i) obj;
                l lVar = (l) obj2;
                int i = this.f2801s;
                boolean z11 = i != 0;
                int i10 = lVar.f2801s;
                if (i10 == 0) {
                    z = false;
                }
                this.f2801s = iVar.d(z11, i, z, i10);
                this.f2802t = (m) iVar.g(this.f2802t, lVar.f2802t);
                this.f2803u = (e) iVar.g(this.f2803u, lVar.f2803u);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2801s = mVar.n();
                            } else if (r10 == 18) {
                                m mVar2 = this.f2802t;
                                m.a aVar = mVar2 != null ? (m.a) mVar2.c() : null;
                                m mVar3 = (m) mVar.b(m.f2804w.o(), pVar);
                                this.f2802t = mVar3;
                                if (aVar != null) {
                                    aVar.h(mVar3);
                                    this.f2802t = (m) aVar.j();
                                }
                            } else if (r10 == 26) {
                                e eVar = this.f2803u;
                                e.a aVar2 = eVar != null ? (e.a) eVar.c() : null;
                                e eVar2 = (e) mVar.b(e.f2767u.o(), pVar);
                                this.f2803u = eVar2;
                                if (aVar2 != null) {
                                    aVar2.h(eVar2);
                                    this.f2803u = (e) aVar2.j();
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
                return new l();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2800w == null) {
                    synchronized (l.class) {
                        if (f2800w == null) {
                            f2800w = new r.b(f2799v);
                        }
                    }
                }
                return f2800w;
            default:
                throw new UnsupportedOperationException();
        }
        return f2799v;
    }
}
