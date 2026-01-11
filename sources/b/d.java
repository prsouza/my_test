package b;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class d extends r<d, a> implements b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final d f2764t;

    /* renamed from: u  reason: collision with root package name */
    public static volatile d0<d> f2765u;

    /* renamed from: s  reason: collision with root package name */
    public int f2766s;

    public static final class a extends r.a<d, a> implements b0 {
        public a() {
            super(d.f2764t);
        }
    }

    static {
        d dVar = new d();
        f2764t = dVar;
        dVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f2766s;
        if (i11 != 0) {
            i10 = 0 + n.E2(1, i11);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f2766s;
        if (i != 0) {
            nVar.X2(1, i);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2764t;
            case 1:
                r.i iVar = (r.i) obj;
                d dVar = (d) obj2;
                int i = this.f2766s;
                boolean z11 = i != 0;
                int i10 = dVar.f2766s;
                if (i10 == 0) {
                    z = false;
                }
                this.f2766s = iVar.d(z11, i, z, i10);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2766s = mVar.n();
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
                return new d();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2765u == null) {
                    synchronized (d.class) {
                        try {
                            if (f2765u == null) {
                                f2765u = new r.b(f2764t);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2765u;
            default:
                throw new UnsupportedOperationException();
        }
        return f2764t;
    }
}
