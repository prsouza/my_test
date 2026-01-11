package b;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class a extends r<a, C0028a> implements b0 {

    /* renamed from: u  reason: collision with root package name */
    public static final a f2751u;

    /* renamed from: v  reason: collision with root package name */
    public static volatile d0<a> f2752v;

    /* renamed from: s  reason: collision with root package name */
    public int f2753s;

    /* renamed from: t  reason: collision with root package name */
    public long f2754t;

    /* renamed from: b.a$a  reason: collision with other inner class name */
    public static final class C0028a extends r.a<a, C0028a> implements b0 {
        public C0028a() {
            super(a.f2751u);
        }
    }

    static {
        a aVar = new a();
        f2751u = aVar;
        aVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f2753s;
        if (i11 != 0) {
            i10 = 0 + n.E2(1, i11);
        }
        long j10 = this.f2754t;
        if (j10 != 0) {
            i10 += n.F2(2, j10);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f2753s;
        if (i != 0) {
            nVar.X2(1, i);
        }
        long j10 = this.f2754t;
        if (j10 != 0) {
            nVar.T2(2, j10);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2751u;
            case 1:
                r.i iVar = (r.i) obj;
                a aVar = (a) obj2;
                int i = this.f2753s;
                boolean z10 = i != 0;
                int i10 = aVar.f2753s;
                this.f2753s = iVar.d(z10, i, i10 != 0, i10);
                long j10 = this.f2754t;
                boolean z11 = j10 != 0;
                long j11 = aVar.f2754t;
                this.f2754t = iVar.j(z11, j10, j11 != 0, j11);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2753s = mVar.n();
                            } else if (r10 == 16) {
                                this.f2754t = mVar.o();
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
                return new a();
            case 5:
                return new C0028a();
            case 6:
                break;
            case 7:
                if (f2752v == null) {
                    synchronized (a.class) {
                        if (f2752v == null) {
                            f2752v = new r.b(f2751u);
                        }
                    }
                }
                return f2752v;
            default:
                throw new UnsupportedOperationException();
        }
        return f2751u;
    }
}
