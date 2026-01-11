package b;

import java.io.IOException;
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

public final class b extends r<b, a> implements b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final b f2755v;

    /* renamed from: w  reason: collision with root package name */
    public static volatile d0<b> f2756w;

    /* renamed from: s  reason: collision with root package name */
    public long f2757s;

    /* renamed from: t  reason: collision with root package name */
    public long f2758t;

    /* renamed from: u  reason: collision with root package name */
    public t.c<String> f2759u = e0.f14282c;

    public static final class a extends r.a<b, a> implements b0 {
        public a() {
            super(b.f2755v);
        }
    }

    static {
        b bVar = new b();
        f2755v = bVar;
        bVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        long j10 = this.f2757s;
        int F2 = j10 != 0 ? n.F2(1, j10) + 0 : 0;
        long j11 = this.f2758t;
        if (j11 != 0) {
            F2 += n.F2(2, j11);
        }
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2759u.size(); i11++) {
            i10 += n.y2(this.f2759u.get(i11));
        }
        int size = (this.f2759u.size() * 1) + F2 + i10;
        this.f14357c = size;
        return size;
    }

    public final void c(n nVar) {
        long j10 = this.f2757s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        long j11 = this.f2758t;
        if (j11 != 0) {
            nVar.T2(2, j11);
        }
        for (int i = 0; i < this.f2759u.size(); i++) {
            nVar.G2(3, this.f2759u.get(i));
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2755v;
            case 1:
                r.i iVar = (r.i) obj;
                b bVar = (b) obj2;
                long j10 = this.f2757s;
                boolean z10 = j10 != 0;
                long j11 = bVar.f2757s;
                this.f2757s = iVar.j(z10, j10, j11 != 0, j11);
                long j12 = this.f2758t;
                boolean z11 = j12 != 0;
                long j13 = bVar.f2758t;
                this.f2758t = iVar.j(z11, j12, j13 != 0, j13);
                this.f2759u = iVar.k(this.f2759u, bVar.f2759u);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2757s = mVar.o();
                            } else if (r10 == 16) {
                                this.f2758t = mVar.o();
                            } else if (r10 == 26) {
                                String q10 = mVar.q();
                                t.c<String> cVar = this.f2759u;
                                if (!((d) cVar).f14277a) {
                                    this.f2759u = r.k(cVar);
                                }
                                ((d) this.f2759u).add(q10);
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
                ((d) this.f2759u).f14277a = false;
                return null;
            case 4:
                return new b();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2756w == null) {
                    synchronized (b.class) {
                        try {
                            if (f2756w == null) {
                                f2756w = new r.b(f2755v);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2756w;
            default:
                throw new UnsupportedOperationException();
        }
        return f2755v;
    }
}
