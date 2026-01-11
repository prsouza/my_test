package ji;

import java.io.IOException;
import ji.l;
import zb.b0;
import zb.d;
import zb.d0;
import zb.e0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.t;
import zb.u;

public final class k extends r<k, a> implements b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final k f7323v;

    /* renamed from: w  reason: collision with root package name */
    public static volatile d0<k> f7324w;

    /* renamed from: s  reason: collision with root package name */
    public long f7325s;

    /* renamed from: t  reason: collision with root package name */
    public l f7326t;

    /* renamed from: u  reason: collision with root package name */
    public t.c<j> f7327u = e0.f14282c;

    public static final class a extends r.a<k, a> implements b0 {
        public a() {
            super(k.f7323v);
        }
    }

    static {
        k kVar = new k();
        f7323v = kVar;
        kVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        long j10 = this.f7325s;
        int F2 = j10 != 0 ? n.F2(1, j10) + 0 : 0;
        l lVar = this.f7326t;
        if (lVar != null) {
            int D2 = n.D2(2);
            int a10 = lVar.a();
            F2 += n.N2(a10) + a10 + D2;
        }
        for (int i10 = 0; i10 < this.f7327u.size(); i10++) {
            F2 += n.w2(3, this.f7327u.get(i10));
        }
        this.f14357c = F2;
        return F2;
    }

    public final void c(n nVar) {
        long j10 = this.f7325s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        l lVar = this.f7326t;
        if (lVar != null) {
            nVar.I2(2, lVar);
        }
        for (int i = 0; i < this.f7327u.size(); i++) {
            nVar.I2(3, this.f7327u.get(i));
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7323v;
            case 1:
                r.i iVar = (r.i) obj;
                k kVar = (k) obj2;
                long j10 = this.f7325s;
                boolean z10 = j10 != 0;
                long j11 = kVar.f7325s;
                this.f7325s = iVar.j(z10, j10, j11 != 0, j11);
                this.f7326t = (l) iVar.g(this.f7326t, kVar.f7326t);
                this.f7327u = iVar.k(this.f7327u, kVar.f7327u);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7325s = mVar.o();
                            } else if (r10 == 18) {
                                l lVar = this.f7326t;
                                l.a aVar = lVar != null ? (l.a) lVar.c() : null;
                                l lVar2 = (l) mVar.b(l.f7328x.o(), pVar);
                                this.f7326t = lVar2;
                                if (aVar != null) {
                                    aVar.h(lVar2);
                                    this.f7326t = (l) aVar.j();
                                }
                            } else if (r10 == 26) {
                                t.c<j> cVar = this.f7327u;
                                if (!((d) cVar).f14277a) {
                                    this.f7327u = r.k(cVar);
                                }
                                ((d) this.f7327u).add((j) mVar.b(j.f7319u.o(), pVar));
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
                ((d) this.f7327u).f14277a = false;
                return null;
            case 4:
                return new k();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f7324w == null) {
                    synchronized (k.class) {
                        try {
                            if (f7324w == null) {
                                f7324w = new r.b(f7323v);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f7324w;
            default:
                throw new UnsupportedOperationException();
        }
        return f7323v;
    }
}
