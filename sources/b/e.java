package b;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class e extends r<e, a> implements b0 {

    /* renamed from: u  reason: collision with root package name */
    public static final e f2767u;

    /* renamed from: v  reason: collision with root package name */
    public static volatile d0<e> f2768v;

    /* renamed from: s  reason: collision with root package name */
    public h f2769s;

    /* renamed from: t  reason: collision with root package name */
    public h f2770t;

    public static final class a extends r.a<e, a> implements b0 {
        public a() {
            super(e.f2767u);
        }
    }

    static {
        e eVar = new e();
        f2767u = eVar;
        eVar.p();
    }

    public e() {
        h.d dVar = h.f14304b;
        this.f2769s = dVar;
        this.f2770t = dVar;
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f2769s.isEmpty()) {
            i10 = 0 + n.v2(1, this.f2769s);
        }
        if (!this.f2770t.isEmpty()) {
            i10 += n.v2(2, this.f2770t);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (!this.f2769s.isEmpty()) {
            nVar.H2(1, this.f2769s);
        }
        if (!this.f2770t.isEmpty()) {
            nVar.H2(2, this.f2770t);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2767u;
            case 1:
                r.i iVar = (r.i) obj;
                e eVar = (e) obj2;
                h hVar2 = this.f2769s;
                h.d dVar = h.f14304b;
                boolean z11 = hVar2 != dVar;
                h hVar3 = eVar.f2769s;
                this.f2769s = iVar.n(z11, hVar2, hVar3 != dVar, hVar3);
                h hVar4 = this.f2770t;
                boolean z12 = hVar4 != dVar;
                h hVar5 = eVar.f2770t;
                if (hVar5 == dVar) {
                    z = false;
                }
                this.f2770t = iVar.n(z12, hVar4, z, hVar5);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                this.f2769s = mVar.f();
                            } else if (r10 == 18) {
                                this.f2770t = mVar.f();
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
                return new e();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2768v == null) {
                    synchronized (e.class) {
                        try {
                            if (f2768v == null) {
                                f2768v = new r.b(f2767u);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f2768v;
            default:
                throw new UnsupportedOperationException();
        }
        return f2767u;
    }
}
