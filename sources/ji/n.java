package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import ji.l;
import zb.b0;
import zb.d0;
import zb.m;
import zb.p;
import zb.r;
import zb.u;

public final class n extends r<n, a> implements b0 {

    /* renamed from: y  reason: collision with root package name */
    public static final n f7340y;
    public static volatile d0<n> z;

    /* renamed from: s  reason: collision with root package name */
    public long f7341s;

    /* renamed from: t  reason: collision with root package name */
    public String f7342t = BuildConfig.FLAVOR;

    /* renamed from: u  reason: collision with root package name */
    public String f7343u = BuildConfig.FLAVOR;

    /* renamed from: v  reason: collision with root package name */
    public String f7344v = BuildConfig.FLAVOR;

    /* renamed from: w  reason: collision with root package name */
    public String f7345w = BuildConfig.FLAVOR;

    /* renamed from: x  reason: collision with root package name */
    public l f7346x;

    public static final class a extends r.a<n, a> implements b0 {
        public a() {
            super(n.f7340y);
        }
    }

    static {
        n nVar = new n();
        f7340y = nVar;
        nVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        long j10 = this.f7341s;
        if (j10 != 0) {
            i10 = 0 + zb.n.t2(1, j10);
        }
        if (!this.f7342t.isEmpty()) {
            i10 += zb.n.u2(2, this.f7342t);
        }
        if (!this.f7343u.isEmpty()) {
            i10 += zb.n.u2(3, this.f7343u);
        }
        if (!this.f7344v.isEmpty()) {
            i10 += zb.n.u2(4, this.f7344v);
        }
        if (!this.f7345w.isEmpty()) {
            i10 += zb.n.u2(5, this.f7345w);
        }
        l lVar = this.f7346x;
        if (lVar != null) {
            int D2 = zb.n.D2(6);
            int a10 = lVar.a();
            i10 += zb.n.N2(a10) + a10 + D2;
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(zb.n nVar) {
        long j10 = this.f7341s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        if (!this.f7342t.isEmpty()) {
            nVar.G2(2, this.f7342t);
        }
        if (!this.f7343u.isEmpty()) {
            nVar.G2(3, this.f7343u);
        }
        if (!this.f7344v.isEmpty()) {
            nVar.G2(4, this.f7344v);
        }
        if (!this.f7345w.isEmpty()) {
            nVar.G2(5, this.f7345w);
        }
        l lVar = this.f7346x;
        if (lVar != null) {
            nVar.I2(6, lVar);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7340y;
            case 1:
                r.i iVar = (r.i) obj;
                n nVar = (n) obj2;
                long j10 = this.f7341s;
                boolean z11 = j10 != 0;
                long j11 = nVar.f7341s;
                this.f7341s = iVar.j(z11, j10, j11 != 0, j11);
                this.f7342t = iVar.o(!this.f7342t.isEmpty(), this.f7342t, !nVar.f7342t.isEmpty(), nVar.f7342t);
                this.f7343u = iVar.o(!this.f7343u.isEmpty(), this.f7343u, !nVar.f7343u.isEmpty(), nVar.f7343u);
                this.f7344v = iVar.o(!this.f7344v.isEmpty(), this.f7344v, !nVar.f7344v.isEmpty(), nVar.f7344v);
                this.f7345w = iVar.o(!this.f7345w.isEmpty(), this.f7345w, !nVar.f7345w.isEmpty(), nVar.f7345w);
                this.f7346x = (l) iVar.g(this.f7346x, nVar.f7346x);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7341s = mVar.o();
                            } else if (r10 == 18) {
                                this.f7342t = mVar.q();
                            } else if (r10 == 26) {
                                this.f7343u = mVar.q();
                            } else if (r10 == 34) {
                                this.f7344v = mVar.q();
                            } else if (r10 == 42) {
                                this.f7345w = mVar.q();
                            } else if (r10 == 50) {
                                l lVar = this.f7346x;
                                l.a aVar = lVar != null ? (l.a) lVar.c() : null;
                                l lVar2 = (l) mVar.b(l.f7328x.o(), pVar);
                                this.f7346x = lVar2;
                                if (aVar != null) {
                                    aVar.h(lVar2);
                                    this.f7346x = (l) aVar.j();
                                }
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z10 = true;
                    } catch (u e10) {
                        throw new RuntimeException(e10);
                    } catch (IOException e11) {
                        throw new RuntimeException(new u(e11.getMessage()));
                    } finally {
                    }
                }
                break;
            case 3:
                return null;
            case 4:
                return new n();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (z == null) {
                    synchronized (n.class) {
                        try {
                            if (z == null) {
                                z = new r.b(f7340y);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return z;
            default:
                throw new UnsupportedOperationException();
        }
        return f7340y;
    }
}
