package ji;

import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class e extends r<e, a> implements b0 {

    /* renamed from: y  reason: collision with root package name */
    public static final e f7284y;
    public static volatile d0<e> z;

    /* renamed from: s  reason: collision with root package name */
    public int f7285s;

    /* renamed from: t  reason: collision with root package name */
    public int f7286t;

    /* renamed from: u  reason: collision with root package name */
    public int f7287u;

    /* renamed from: v  reason: collision with root package name */
    public int f7288v;

    /* renamed from: w  reason: collision with root package name */
    public int f7289w;

    /* renamed from: x  reason: collision with root package name */
    public int f7290x;

    public static final class a extends r.a<e, a> implements b0 {
        public a() {
            super(e.f7284y);
        }
    }

    static {
        e eVar = new e();
        f7284y = eVar;
        eVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f7285s;
        if (i11 != 0) {
            i10 = 0 + n.s2(1, i11);
        }
        int i12 = this.f7286t;
        if (i12 != 0) {
            i10 += n.s2(2, i12);
        }
        int i13 = this.f7287u;
        if (i13 != 0) {
            i10 += n.s2(3, i13);
        }
        int i14 = this.f7288v;
        if (i14 != 0) {
            i10 += n.s2(4, i14);
        }
        int i15 = this.f7289w;
        if (i15 != 0) {
            i10 += n.s2(5, i15);
        }
        int i16 = this.f7290x;
        if (i16 != 0) {
            i10 += n.s2(6, i16);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f7285s;
        if (i != 0) {
            nVar.S2(1, i);
        }
        int i10 = this.f7286t;
        if (i10 != 0) {
            nVar.S2(2, i10);
        }
        int i11 = this.f7287u;
        if (i11 != 0) {
            nVar.S2(3, i11);
        }
        int i12 = this.f7288v;
        if (i12 != 0) {
            nVar.S2(4, i12);
        }
        int i13 = this.f7289w;
        if (i13 != 0) {
            nVar.S2(5, i13);
        }
        int i14 = this.f7290x;
        if (i14 != 0) {
            nVar.S2(6, i14);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = true;
        boolean z11 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7284y;
            case 1:
                r.i iVar = (r.i) obj;
                e eVar = (e) obj2;
                int i = this.f7285s;
                boolean z12 = i != 0;
                int i10 = eVar.f7285s;
                this.f7285s = iVar.d(z12, i, i10 != 0, i10);
                int i11 = this.f7286t;
                boolean z13 = i11 != 0;
                int i12 = eVar.f7286t;
                this.f7286t = iVar.d(z13, i11, i12 != 0, i12);
                int i13 = this.f7287u;
                boolean z14 = i13 != 0;
                int i14 = eVar.f7287u;
                this.f7287u = iVar.d(z14, i13, i14 != 0, i14);
                int i15 = this.f7288v;
                boolean z15 = i15 != 0;
                int i16 = eVar.f7288v;
                this.f7288v = iVar.d(z15, i15, i16 != 0, i16);
                int i17 = this.f7289w;
                boolean z16 = i17 != 0;
                int i18 = eVar.f7289w;
                this.f7289w = iVar.d(z16, i17, i18 != 0, i18);
                int i19 = this.f7290x;
                boolean z17 = i19 != 0;
                int i20 = eVar.f7290x;
                if (i20 == 0) {
                    z10 = false;
                }
                this.f7290x = iVar.d(z17, i19, z10, i20);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z11) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7285s = mVar.n();
                            } else if (r10 == 16) {
                                this.f7286t = mVar.n();
                            } else if (r10 == 24) {
                                this.f7287u = mVar.n();
                            } else if (r10 == 32) {
                                this.f7288v = mVar.n();
                            } else if (r10 == 40) {
                                this.f7289w = mVar.n();
                            } else if (r10 == 48) {
                                this.f7290x = mVar.n();
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z11 = true;
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
                if (z == null) {
                    synchronized (e.class) {
                        try {
                            if (z == null) {
                                z = new r.b(f7284y);
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
        return f7284y;
    }
}
