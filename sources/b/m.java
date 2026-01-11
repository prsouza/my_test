package b;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class m extends r<m, a> implements b0 {

    /* renamed from: w  reason: collision with root package name */
    public static final m f2804w;

    /* renamed from: x  reason: collision with root package name */
    public static volatile d0<m> f2805x;

    /* renamed from: s  reason: collision with root package name */
    public h f2806s;

    /* renamed from: t  reason: collision with root package name */
    public int f2807t;

    /* renamed from: u  reason: collision with root package name */
    public h f2808u;

    /* renamed from: v  reason: collision with root package name */
    public long f2809v;

    public static final class a extends r.a<m, a> implements b0 {
        public a() {
            super(m.f2804w);
        }
    }

    static {
        m mVar = new m();
        f2804w = mVar;
        mVar.p();
    }

    public m() {
        h.d dVar = h.f14304b;
        this.f2806s = dVar;
        this.f2808u = dVar;
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f2806s.isEmpty()) {
            i10 = 0 + n.v2(1, this.f2806s);
        }
        int i11 = this.f2807t;
        if (i11 != 0) {
            i10 += n.E2(2, i11);
        }
        if (!this.f2808u.isEmpty()) {
            i10 += n.v2(3, this.f2808u);
        }
        long j10 = this.f2809v;
        if (j10 != 0) {
            i10 += n.F2(4, j10);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (!this.f2806s.isEmpty()) {
            nVar.H2(1, this.f2806s);
        }
        int i = this.f2807t;
        if (i != 0) {
            nVar.X2(2, i);
        }
        if (!this.f2808u.isEmpty()) {
            nVar.H2(3, this.f2808u);
        }
        long j10 = this.f2809v;
        if (j10 != 0) {
            nVar.T2(4, j10);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2804w;
            case 1:
                r.i iVar = (r.i) obj;
                m mVar = (m) obj2;
                h hVar2 = this.f2806s;
                h.d dVar = h.f14304b;
                boolean z10 = hVar2 != dVar;
                h hVar3 = mVar.f2806s;
                this.f2806s = iVar.n(z10, hVar2, hVar3 != dVar, hVar3);
                int i = this.f2807t;
                boolean z11 = i != 0;
                int i10 = mVar.f2807t;
                this.f2807t = iVar.d(z11, i, i10 != 0, i10);
                h hVar4 = this.f2808u;
                boolean z12 = hVar4 != dVar;
                h hVar5 = mVar.f2808u;
                this.f2808u = iVar.n(z12, hVar4, hVar5 != dVar, hVar5);
                long j10 = this.f2809v;
                boolean z13 = j10 != 0;
                long j11 = mVar.f2809v;
                this.f2809v = iVar.j(z13, j10, j11 != 0, j11);
                return this;
            case 2:
                zb.m mVar2 = (zb.m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar2.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                this.f2806s = mVar2.f();
                            } else if (r10 == 16) {
                                this.f2807t = mVar2.n();
                            } else if (r10 == 26) {
                                this.f2808u = mVar2.f();
                            } else if (r10 == 32) {
                                this.f2809v = mVar2.o();
                            } else if (!mVar2.i(r10)) {
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
                return new m();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2805x == null) {
                    synchronized (m.class) {
                        try {
                            if (f2805x == null) {
                                f2805x = new r.b(f2804w);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2805x;
            default:
                throw new UnsupportedOperationException();
        }
        return f2804w;
    }
}
