package b;

import java.io.IOException;
import zb.b0;
import zb.d;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.s;
import zb.t;
import zb.u;

public final class g extends r<g, a> implements b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final g f2776t;

    /* renamed from: u  reason: collision with root package name */
    public static volatile d0<g> f2777u;

    /* renamed from: s  reason: collision with root package name */
    public t.b f2778s = s.f14374s;

    public static final class a extends r.a<g, a> implements b0 {
        public a() {
            super(g.f2776t);
        }
    }

    static {
        g gVar = new g();
        f2776t = gVar;
        gVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            s sVar = (s) this.f2778s;
            int i12 = sVar.f14376c;
            if (i10 < i12) {
                i11 += n.N2(sVar.g(i10));
                i10++;
            } else {
                int i13 = (i12 * 1) + 0 + i11;
                this.f14357c = i13;
                return i13;
            }
        }
    }

    public final void c(n nVar) {
        a();
        int i = 0;
        while (true) {
            s sVar = (s) this.f2778s;
            if (i < sVar.f14376c) {
                nVar.X2(1, sVar.g(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2776t;
            case 1:
                this.f2778s = ((r.i) obj).f(this.f2778s, ((g) obj2).f2778s);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                t.b bVar = this.f2778s;
                                if (!((d) bVar).f14277a) {
                                    this.f2778s = r.j(bVar);
                                }
                                t.b bVar2 = this.f2778s;
                                s sVar = (s) bVar2;
                                sVar.d(sVar.f14376c, mVar.n());
                            } else if (r10 == 10) {
                                int d10 = mVar.d(mVar.n());
                                if (!((d) this.f2778s).f14277a && mVar.a() > 0) {
                                    this.f2778s = r.j(this.f2778s);
                                }
                                while (mVar.a() > 0) {
                                    t.b bVar3 = this.f2778s;
                                    s sVar2 = (s) bVar3;
                                    sVar2.d(sVar2.f14376c, mVar.n());
                                }
                                mVar.g = d10;
                                mVar.s();
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z = true;
                    } catch (u e10) {
                        throw new RuntimeException(e10);
                    } catch (IOException e11) {
                        throw new RuntimeException(new u(e11.getMessage()));
                    } finally {
                    }
                }
                break;
            case 3:
                ((d) this.f2778s).f14277a = false;
                return null;
            case 4:
                return new g();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2777u == null) {
                    synchronized (g.class) {
                        try {
                            if (f2777u == null) {
                                f2777u = new r.b(f2776t);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2777u;
            default:
                throw new UnsupportedOperationException();
        }
        return f2776t;
    }
}
