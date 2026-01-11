package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import ji.l;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class c extends r<c, a> implements b0 {

    /* renamed from: x  reason: collision with root package name */
    public static final c f7274x;

    /* renamed from: y  reason: collision with root package name */
    public static volatile d0<c> f7275y;

    /* renamed from: s  reason: collision with root package name */
    public long f7276s;

    /* renamed from: t  reason: collision with root package name */
    public l f7277t;

    /* renamed from: u  reason: collision with root package name */
    public String f7278u = BuildConfig.FLAVOR;

    /* renamed from: v  reason: collision with root package name */
    public int f7279v;

    /* renamed from: w  reason: collision with root package name */
    public h f7280w = h.f14304b;

    public static final class a extends r.a<c, a> implements b0 {
        public a() {
            super(c.f7274x);
        }
    }

    static {
        c cVar = new c();
        f7274x = cVar;
        cVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        long j10 = this.f7276s;
        if (j10 != 0) {
            i10 = 0 + n.F2(1, j10);
        }
        if (this.f7277t != null) {
            i10 += n.w2(2, r());
        }
        if (!this.f7278u.isEmpty()) {
            i10 += n.u2(3, this.f7278u);
        }
        int i11 = this.f7279v;
        if (i11 != 0) {
            i10 += n.s2(4, i11);
        }
        if (!this.f7280w.isEmpty()) {
            i10 += n.v2(5, this.f7280w);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        long j10 = this.f7276s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        if (this.f7277t != null) {
            nVar.I2(2, r());
        }
        if (!this.f7278u.isEmpty()) {
            nVar.G2(3, this.f7278u);
        }
        int i = this.f7279v;
        if (i != 0) {
            nVar.S2(4, i);
        }
        if (!this.f7280w.isEmpty()) {
            nVar.H2(5, this.f7280w);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7274x;
            case 1:
                r.i iVar = (r.i) obj;
                c cVar = (c) obj2;
                long j10 = this.f7276s;
                boolean z10 = j10 != 0;
                long j11 = cVar.f7276s;
                this.f7276s = iVar.j(z10, j10, j11 != 0, j11);
                this.f7277t = (l) iVar.g(this.f7277t, cVar.f7277t);
                this.f7278u = iVar.o(!this.f7278u.isEmpty(), this.f7278u, !cVar.f7278u.isEmpty(), cVar.f7278u);
                int i = this.f7279v;
                boolean z11 = i != 0;
                int i10 = cVar.f7279v;
                this.f7279v = iVar.d(z11, i, i10 != 0, i10);
                h hVar2 = this.f7280w;
                h.d dVar = h.f14304b;
                boolean z12 = hVar2 != dVar;
                h hVar3 = cVar.f7280w;
                if (hVar3 != dVar) {
                    z = true;
                }
                this.f7280w = iVar.n(z12, hVar2, z, hVar3);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7276s = mVar.o();
                            } else if (r10 == 18) {
                                l lVar = this.f7277t;
                                l.a aVar = lVar != null ? (l.a) lVar.c() : null;
                                l lVar2 = (l) mVar.b(l.f7328x.o(), pVar);
                                this.f7277t = lVar2;
                                if (aVar != null) {
                                    aVar.h(lVar2);
                                    this.f7277t = (l) aVar.j();
                                }
                            } else if (r10 == 26) {
                                this.f7278u = mVar.q();
                            } else if (r10 == 32) {
                                this.f7279v = mVar.n();
                            } else if (r10 == 42) {
                                this.f7280w = mVar.f();
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
                return null;
            case 4:
                return new c();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f7275y == null) {
                    synchronized (c.class) {
                        try {
                            if (f7275y == null) {
                                f7275y = new r.b(f7274x);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f7275y;
            default:
                throw new UnsupportedOperationException();
        }
        return f7274x;
    }

    public final l r() {
        l lVar = this.f7277t;
        return lVar == null ? l.f7328x : lVar;
    }
}
