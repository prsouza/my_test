package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class a extends r<a, C0128a> implements b0 {
    public static final a A;
    public static volatile d0<a> B;

    /* renamed from: s  reason: collision with root package name */
    public long f7260s;

    /* renamed from: t  reason: collision with root package name */
    public int f7261t;

    /* renamed from: u  reason: collision with root package name */
    public int f7262u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f7263v;

    /* renamed from: w  reason: collision with root package name */
    public int f7264w;

    /* renamed from: x  reason: collision with root package name */
    public h f7265x = h.f14304b;

    /* renamed from: y  reason: collision with root package name */
    public boolean f7266y;
    public String z = BuildConfig.FLAVOR;

    /* renamed from: ji.a$a  reason: collision with other inner class name */
    public static final class C0128a extends r.a<a, C0128a> implements b0 {
        public C0128a() {
            super(a.A);
        }
    }

    static {
        a aVar = new a();
        A = aVar;
        aVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        long j10 = this.f7260s;
        if (j10 != 0) {
            i10 = 0 + n.F2(1, j10);
        }
        int i11 = this.f7261t;
        if (i11 != 0) {
            i10 += n.s2(2, i11);
        }
        int i12 = this.f7262u;
        if (i12 != 0) {
            i10 += n.s2(3, i12);
        }
        if (this.f7263v) {
            i10 += n.D2(4) + 1;
        }
        int i13 = this.f7264w;
        if (i13 != 0) {
            i10 += n.s2(5, i13);
        }
        if (!this.f7265x.isEmpty()) {
            i10 += n.v2(6, this.f7265x);
        }
        if (this.f7266y) {
            i10 += n.D2(7) + 1;
        }
        if (!this.z.isEmpty()) {
            i10 += n.u2(8, this.z);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        long j10 = this.f7260s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        int i = this.f7261t;
        if (i != 0) {
            nVar.S2(2, i);
        }
        int i10 = this.f7262u;
        if (i10 != 0) {
            nVar.S2(3, i10);
        }
        boolean z10 = this.f7263v;
        if (z10) {
            nVar.A2(4, z10);
        }
        int i11 = this.f7264w;
        if (i11 != 0) {
            nVar.S2(5, i11);
        }
        if (!this.f7265x.isEmpty()) {
            nVar.H2(6, this.f7265x);
        }
        boolean z11 = this.f7266y;
        if (z11) {
            nVar.A2(7, z11);
        }
        if (!this.z.isEmpty()) {
            nVar.G2(8, this.z);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return A;
            case 1:
                r.i iVar = (r.i) obj;
                a aVar = (a) obj2;
                long j10 = this.f7260s;
                boolean z11 = j10 != 0;
                long j11 = aVar.f7260s;
                this.f7260s = iVar.j(z11, j10, j11 != 0, j11);
                int i = this.f7261t;
                boolean z12 = i != 0;
                int i10 = aVar.f7261t;
                this.f7261t = iVar.d(z12, i, i10 != 0, i10);
                int i11 = this.f7262u;
                boolean z13 = i11 != 0;
                int i12 = aVar.f7262u;
                this.f7262u = iVar.d(z13, i11, i12 != 0, i12);
                boolean z14 = this.f7263v;
                boolean z15 = aVar.f7263v;
                this.f7263v = iVar.e(z14, z14, z15, z15);
                int i13 = this.f7264w;
                boolean z16 = i13 != 0;
                int i14 = aVar.f7264w;
                this.f7264w = iVar.d(z16, i13, i14 != 0, i14);
                h hVar2 = this.f7265x;
                h.d dVar = h.f14304b;
                boolean z17 = hVar2 != dVar;
                h hVar3 = aVar.f7265x;
                if (hVar3 != dVar) {
                    z10 = true;
                }
                this.f7265x = iVar.n(z17, hVar2, z10, hVar3);
                boolean z18 = this.f7266y;
                boolean z19 = aVar.f7266y;
                this.f7266y = iVar.e(z18, z18, z19, z19);
                this.z = iVar.o(!this.z.isEmpty(), this.z, true ^ aVar.z.isEmpty(), aVar.z);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7260s = mVar.o();
                            } else if (r10 == 16) {
                                this.f7261t = mVar.n();
                            } else if (r10 == 24) {
                                this.f7262u = mVar.n();
                            } else if (r10 == 32) {
                                this.f7263v = mVar.e();
                            } else if (r10 == 40) {
                                this.f7264w = mVar.n();
                            } else if (r10 == 50) {
                                this.f7265x = mVar.f();
                            } else if (r10 == 56) {
                                this.f7266y = mVar.e();
                            } else if (r10 == 66) {
                                this.z = mVar.q();
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
                return new a();
            case 5:
                return new C0128a();
            case 6:
                break;
            case 7:
                if (B == null) {
                    synchronized (a.class) {
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
