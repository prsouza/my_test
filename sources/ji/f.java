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

public final class f extends r<f, a> implements b0 {
    public static final f A;
    public static volatile d0<f> B;

    /* renamed from: s  reason: collision with root package name */
    public int f7291s;

    /* renamed from: t  reason: collision with root package name */
    public int f7292t;

    /* renamed from: u  reason: collision with root package name */
    public int f7293u;

    /* renamed from: v  reason: collision with root package name */
    public int f7294v;

    /* renamed from: w  reason: collision with root package name */
    public String f7295w = BuildConfig.FLAVOR;

    /* renamed from: x  reason: collision with root package name */
    public String f7296x = BuildConfig.FLAVOR;

    /* renamed from: y  reason: collision with root package name */
    public int f7297y;
    public int z;

    public static final class a extends r.a<f, a> implements b0 {
        public a() {
            super(f.A);
        }
    }

    static {
        f fVar = new f();
        A = fVar;
        fVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        int i11 = this.f7291s;
        if (i11 != 0) {
            i10 = 0 + n.s2(1, i11);
        }
        int i12 = this.f7292t;
        if (i12 != 0) {
            i10 += n.s2(2, i12);
        }
        int i13 = this.f7293u;
        if (i13 != 0) {
            i10 += n.s2(3, i13);
        }
        int i14 = this.f7294v;
        if (i14 != 0) {
            i10 += n.s2(4, i14);
        }
        if (!this.f7295w.isEmpty()) {
            i10 += n.u2(5, this.f7295w);
        }
        if (!this.f7296x.isEmpty()) {
            i10 += n.u2(6, this.f7296x);
        }
        int i15 = this.f7297y;
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
        int i = this.f7291s;
        if (i != 0) {
            nVar.S2(1, i);
        }
        int i10 = this.f7292t;
        if (i10 != 0) {
            nVar.S2(2, i10);
        }
        int i11 = this.f7293u;
        if (i11 != 0) {
            nVar.S2(3, i11);
        }
        int i12 = this.f7294v;
        if (i12 != 0) {
            nVar.S2(4, i12);
        }
        if (!this.f7295w.isEmpty()) {
            nVar.G2(5, this.f7295w);
        }
        if (!this.f7296x.isEmpty()) {
            nVar.G2(6, this.f7296x);
        }
        int i13 = this.f7297y;
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
                f fVar = (f) obj2;
                int i = this.f7291s;
                boolean z11 = i != 0;
                int i10 = fVar.f7291s;
                this.f7291s = iVar.d(z11, i, i10 != 0, i10);
                int i11 = this.f7292t;
                boolean z12 = i11 != 0;
                int i12 = fVar.f7292t;
                this.f7292t = iVar.d(z12, i11, i12 != 0, i12);
                int i13 = this.f7293u;
                boolean z13 = i13 != 0;
                int i14 = fVar.f7293u;
                this.f7293u = iVar.d(z13, i13, i14 != 0, i14);
                int i15 = this.f7294v;
                boolean z14 = i15 != 0;
                int i16 = fVar.f7294v;
                this.f7294v = iVar.d(z14, i15, i16 != 0, i16);
                this.f7295w = iVar.o(!this.f7295w.isEmpty(), this.f7295w, !fVar.f7295w.isEmpty(), fVar.f7295w);
                this.f7296x = iVar.o(!this.f7296x.isEmpty(), this.f7296x, !fVar.f7296x.isEmpty(), fVar.f7296x);
                int i17 = this.f7297y;
                boolean z15 = i17 != 0;
                int i18 = fVar.f7297y;
                this.f7297y = iVar.d(z15, i17, i18 != 0, i18);
                int i19 = this.z;
                boolean z16 = i19 != 0;
                int i20 = fVar.z;
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
                                this.f7291s = mVar.n();
                            } else if (r10 == 16) {
                                this.f7292t = mVar.n();
                            } else if (r10 == 24) {
                                this.f7293u = mVar.n();
                            } else if (r10 == 32) {
                                this.f7294v = mVar.n();
                            } else if (r10 == 42) {
                                this.f7295w = mVar.q();
                            } else if (r10 == 50) {
                                this.f7296x = mVar.q();
                            } else if (r10 == 56) {
                                this.f7297y = mVar.n();
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
                return new f();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (B == null) {
                    synchronized (f.class) {
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
