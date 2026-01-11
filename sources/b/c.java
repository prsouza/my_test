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

public final class c extends r<c, a> implements b0 {

    /* renamed from: u  reason: collision with root package name */
    public static final c f2760u;

    /* renamed from: v  reason: collision with root package name */
    public static volatile d0<c> f2761v;

    /* renamed from: s  reason: collision with root package name */
    public long f2762s;

    /* renamed from: t  reason: collision with root package name */
    public t.c<String> f2763t = e0.f14282c;

    public static final class a extends r.a<c, a> implements b0 {
        public a() {
            super(c.f2760u);
        }
    }

    static {
        c cVar = new c();
        f2760u = cVar;
        cVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        long j10 = this.f2762s;
        int F2 = j10 != 0 ? n.F2(1, j10) + 0 : 0;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f2763t.size(); i11++) {
            i10 += n.y2(this.f2763t.get(i11));
        }
        int size = (this.f2763t.size() * 1) + F2 + i10;
        this.f14357c = size;
        return size;
    }

    public final void c(n nVar) {
        long j10 = this.f2762s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        for (int i = 0; i < this.f2763t.size(); i++) {
            nVar.G2(2, this.f2763t.get(i));
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2760u;
            case 1:
                r.i iVar = (r.i) obj;
                c cVar = (c) obj2;
                long j10 = this.f2762s;
                boolean z10 = j10 != 0;
                long j11 = cVar.f2762s;
                this.f2762s = iVar.j(z10, j10, j11 != 0, j11);
                this.f2763t = iVar.k(this.f2763t, cVar.f2763t);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2762s = mVar.o();
                            } else if (r10 == 18) {
                                String q10 = mVar.q();
                                t.c<String> cVar2 = this.f2763t;
                                if (!((d) cVar2).f14277a) {
                                    this.f2763t = r.k(cVar2);
                                }
                                ((d) this.f2763t).add(q10);
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
                ((d) this.f2763t).f14277a = false;
                return null;
            case 4:
                return new c();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2761v == null) {
                    synchronized (c.class) {
                        try {
                            if (f2761v == null) {
                                f2761v = new r.b(f2760u);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2761v;
            default:
                throw new UnsupportedOperationException();
        }
        return f2760u;
    }
}
