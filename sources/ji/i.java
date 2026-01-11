package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class i extends r<i, a> implements b0 {
    public static final i A;
    public static volatile d0<i> B;

    /* renamed from: s  reason: collision with root package name */
    public int f7312s;

    /* renamed from: t  reason: collision with root package name */
    public int f7313t;

    /* renamed from: u  reason: collision with root package name */
    public int f7314u;

    /* renamed from: v  reason: collision with root package name */
    public int f7315v;

    /* renamed from: w  reason: collision with root package name */
    public String f7316w = BuildConfig.FLAVOR;

    /* renamed from: x  reason: collision with root package name */
    public String f7317x = BuildConfig.FLAVOR;

    /* renamed from: y  reason: collision with root package name */
    public int f7318y;
    public int z;

    public static final class a extends r.a<i, a> implements b0 {
        public a() {
            super(i.A);
        }
    }

    static {
        i iVar = new i();
        A = iVar;
        iVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f7312s;
        if (i11 != 0) {
            i10 = 0 + n.s2(1, i11);
        }
        int i12 = this.f7313t;
        if (i12 != 0) {
            i10 += n.s2(2, i12);
        }
        int i13 = this.f7314u;
        if (i13 != 0) {
            i10 += n.s2(3, i13);
        }
        int i14 = this.f7315v;
        if (i14 != 0) {
            i10 += n.s2(4, i14);
        }
        if (!this.f7316w.isEmpty()) {
            i10 += n.u2(5, this.f7316w);
        }
        if (!this.f7317x.isEmpty()) {
            i10 += n.u2(6, this.f7317x);
        }
        int i15 = this.f7318y;
        if (i15 != 0) {
            i10 += n.s2(7, i15);
        }
        int i16 = this.z;
        if (i16 != 0) {
            i10 += n.s2(8, i16);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        int i = this.f7312s;
        if (i != 0) {
            nVar.S2(1, i);
        }
        int i10 = this.f7313t;
        if (i10 != 0) {
            nVar.S2(2, i10);
        }
        int i11 = this.f7314u;
        if (i11 != 0) {
            nVar.S2(3, i11);
        }
        int i12 = this.f7315v;
        if (i12 != 0) {
            nVar.S2(4, i12);
        }
        if (!this.f7316w.isEmpty()) {
            nVar.G2(5, this.f7316w);
        }
        if (!this.f7317x.isEmpty()) {
            nVar.G2(6, this.f7317x);
        }
        int i13 = this.f7318y;
        if (i13 != 0) {
            nVar.S2(7, i13);
        }
        int i14 = this.z;
        if (i14 != 0) {
            nVar.S2(8, i14);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return A;
            case 1:
                r.i iVar = (r.i) obj;
                i iVar2 = (i) obj2;
                int i = this.f7312s;
                boolean z11 = i != 0;
                int i10 = iVar2.f7312s;
                this.f7312s = iVar.d(z11, i, i10 != 0, i10);
                int i11 = this.f7313t;
                boolean z12 = i11 != 0;
                int i12 = iVar2.f7313t;
                this.f7313t = iVar.d(z12, i11, i12 != 0, i12);
                int i13 = this.f7314u;
                boolean z13 = i13 != 0;
                int i14 = iVar2.f7314u;
                this.f7314u = iVar.d(z13, i13, i14 != 0, i14);
                int i15 = this.f7315v;
                boolean z14 = i15 != 0;
                int i16 = iVar2.f7315v;
                this.f7315v = iVar.d(z14, i15, i16 != 0, i16);
                this.f7316w = iVar.o(!this.f7316w.isEmpty(), this.f7316w, !iVar2.f7316w.isEmpty(), iVar2.f7316w);
                this.f7317x = iVar.o(!this.f7317x.isEmpty(), this.f7317x, !iVar2.f7317x.isEmpty(), iVar2.f7317x);
                int i17 = this.f7318y;
                boolean z15 = i17 != 0;
                int i18 = iVar2.f7318y;
                this.f7318y = iVar.d(z15, i17, i18 != 0, i18);
                int i19 = this.z;
                boolean z16 = i19 != 0;
                int i20 = iVar2.z;
                if (i20 != 0) {
                    z10 = true;
                }
                this.z = iVar.d(z16, i19, z10, i20);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7312s = mVar.n();
                            } else if (r10 == 16) {
                                this.f7313t = mVar.n();
                            } else if (r10 == 24) {
                                this.f7314u = mVar.n();
                            } else if (r10 == 32) {
                                this.f7315v = mVar.n();
                            } else if (r10 == 42) {
                                this.f7316w = mVar.q();
                            } else if (r10 == 50) {
                                this.f7317x = mVar.q();
                            } else if (r10 == 56) {
                                this.f7318y = mVar.n();
                            } else if (r10 == 64) {
                                this.z = mVar.n();
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
                return new i();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (B == null) {
                    synchronized (i.class) {
                        try {
                            if (B == null) {
                                B = new r.b(A);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return B;
            default:
                throw new UnsupportedOperationException();
        }
        return A;
    }
}
