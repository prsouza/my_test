package ji;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.e0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.t;
import zb.u;

public final class d extends r<d, a> implements b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final d f7281t;

    /* renamed from: u  reason: collision with root package name */
    public static volatile d0<d> f7282u;

    /* renamed from: s  reason: collision with root package name */
    public t.c<c> f7283s = e0.f14282c;

    public static final class a extends r.a<d, a> implements b0 {
        public a() {
            super(d.f7281t);
        }

        public final a l(Iterable<? extends c> iterable) {
            k();
            d dVar = (d) this.f14359b;
            t.c<c> cVar = dVar.f7283s;
            if (!((zb.d) cVar).f14277a) {
                dVar.f7283s = r.k(cVar);
            }
            zb.a.d(iterable, dVar.f7283s);
            return this;
        }
    }

    static {
        d dVar = new d();
        f7281t = dVar;
        dVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f7283s.size(); i11++) {
            i10 += n.w2(1, this.f7283s.get(i11));
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        for (int i = 0; i < this.f7283s.size(); i++) {
            nVar.I2(1, this.f7283s.get(i));
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7281t;
            case 1:
                this.f7283s = ((r.i) obj).k(this.f7283s, ((d) obj2).f7283s);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                t.c<c> cVar = this.f7283s;
                                if (!((zb.d) cVar).f14277a) {
                                    this.f7283s = r.k(cVar);
                                }
                                ((zb.d) this.f7283s).add((c) mVar.b(c.f7274x.o(), pVar));
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
                ((zb.d) this.f7283s).f14277a = false;
                return null;
            case 4:
                return new d();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f7282u == null) {
                    synchronized (d.class) {
                        try {
                            if (f7282u == null) {
                                f7282u = new r.b(f7281t);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f7282u;
            default:
                throw new UnsupportedOperationException();
        }
        return f7281t;
    }
}
