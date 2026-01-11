package b;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class o extends r<o, a> implements b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final o f2817t;

    /* renamed from: u  reason: collision with root package name */
    public static volatile d0<o> f2818u;

    /* renamed from: s  reason: collision with root package name */
    public int f2819s;

    public static final class a extends r.a<o, a> implements b0 {
        public a() {
            super(o.f2817t);
        }
    }

    static {
        o oVar = new o();
        f2817t = oVar;
        oVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f2819s;
        if (i11 != 0) {
            i10 = 0 + n.E2(1, i11);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f2819s;
        if (i != 0) {
            nVar.X2(1, i);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2817t;
            case 1:
                r.i iVar = (r.i) obj;
                o oVar = (o) obj2;
                int i = this.f2819s;
                boolean z11 = i != 0;
                int i10 = oVar.f2819s;
                if (i10 == 0) {
                    z = false;
                }
                this.f2819s = iVar.d(z11, i, z, i10);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f2819s = mVar.n();
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
                return new o();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2818u == null) {
                    synchronized (o.class) {
                        try {
                            if (f2818u == null) {
                                f2818u = new r.b(f2817t);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2818u;
            default:
                throw new UnsupportedOperationException();
        }
        return f2817t;
    }
}
