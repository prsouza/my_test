package b;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.h;
import zb.m;
import zb.p;
import zb.r;
import zb.u;

public final class n extends r<n, a> implements b0 {
    public static final n C;
    public static volatile d0<n> D;
    public String A = BuildConfig.FLAVOR;
    public long B;

    /* renamed from: s  reason: collision with root package name */
    public h f2810s;

    /* renamed from: t  reason: collision with root package name */
    public int f2811t;

    /* renamed from: u  reason: collision with root package name */
    public h f2812u;

    /* renamed from: v  reason: collision with root package name */
    public h f2813v;

    /* renamed from: w  reason: collision with root package name */
    public h f2814w;

    /* renamed from: x  reason: collision with root package name */
    public h f2815x;

    /* renamed from: y  reason: collision with root package name */
    public h f2816y;
    public h z;

    public static final class a extends r.a<n, a> implements b0 {
        public a() {
            super(n.C);
        }
    }

    static {
        n nVar = new n();
        C = nVar;
        nVar.p();
    }

    public n() {
        h.d dVar = h.f14304b;
        this.f2810s = dVar;
        this.f2812u = dVar;
        this.f2813v = dVar;
        this.f2814w = dVar;
        this.f2815x = dVar;
        this.f2816y = dVar;
        this.z = dVar;
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f2810s.isEmpty()) {
            i10 = 0 + zb.n.v2(1, this.f2810s);
        }
        int i11 = this.f2811t;
        if (i11 != 0) {
            i10 += zb.n.E2(2, i11);
        }
        if (!this.f2812u.isEmpty()) {
            i10 += zb.n.v2(3, this.f2812u);
        }
        if (!this.f2813v.isEmpty()) {
            i10 += zb.n.v2(4, this.f2813v);
        }
        if (!this.f2814w.isEmpty()) {
            i10 += zb.n.v2(5, this.f2814w);
        }
        if (!this.f2815x.isEmpty()) {
            i10 += zb.n.v2(6, this.f2815x);
        }
        if (!this.f2816y.isEmpty()) {
            i10 += zb.n.v2(7, this.f2816y);
        }
        if (!this.z.isEmpty()) {
            i10 += zb.n.v2(8, this.z);
        }
        if (!this.A.isEmpty()) {
            i10 += zb.n.u2(9, this.A);
        }
        long j10 = this.B;
        if (j10 != 0) {
            i10 += zb.n.F2(10, j10);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(zb.n nVar) {
        if (!this.f2810s.isEmpty()) {
            nVar.H2(1, this.f2810s);
        }
        int i = this.f2811t;
        if (i != 0) {
            nVar.X2(2, i);
        }
        if (!this.f2812u.isEmpty()) {
            nVar.H2(3, this.f2812u);
        }
        if (!this.f2813v.isEmpty()) {
            nVar.H2(4, this.f2813v);
        }
        if (!this.f2814w.isEmpty()) {
            nVar.H2(5, this.f2814w);
        }
        if (!this.f2815x.isEmpty()) {
            nVar.H2(6, this.f2815x);
        }
        if (!this.f2816y.isEmpty()) {
            nVar.H2(7, this.f2816y);
        }
        if (!this.z.isEmpty()) {
            nVar.H2(8, this.z);
        }
        if (!this.A.isEmpty()) {
            nVar.G2(9, this.A);
        }
        long j10 = this.B;
        if (j10 != 0) {
            nVar.T2(10, j10);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return C;
            case 1:
                r.i iVar = (r.i) obj;
                n nVar = (n) obj2;
                h hVar2 = this.f2810s;
                h.d dVar = h.f14304b;
                boolean z11 = hVar2 != dVar;
                h hVar3 = nVar.f2810s;
                this.f2810s = iVar.n(z11, hVar2, hVar3 != dVar, hVar3);
                int i = this.f2811t;
                boolean z12 = i != 0;
                int i10 = nVar.f2811t;
                this.f2811t = iVar.d(z12, i, i10 != 0, i10);
                h hVar4 = this.f2812u;
                boolean z13 = hVar4 != dVar;
                h hVar5 = nVar.f2812u;
                this.f2812u = iVar.n(z13, hVar4, hVar5 != dVar, hVar5);
                h hVar6 = this.f2813v;
                boolean z14 = hVar6 != dVar;
                h hVar7 = nVar.f2813v;
                this.f2813v = iVar.n(z14, hVar6, hVar7 != dVar, hVar7);
                h hVar8 = this.f2814w;
                boolean z15 = hVar8 != dVar;
                h hVar9 = nVar.f2814w;
                this.f2814w = iVar.n(z15, hVar8, hVar9 != dVar, hVar9);
                h hVar10 = this.f2815x;
                boolean z16 = hVar10 != dVar;
                h hVar11 = nVar.f2815x;
                this.f2815x = iVar.n(z16, hVar10, hVar11 != dVar, hVar11);
                h hVar12 = this.f2816y;
                boolean z17 = hVar12 != dVar;
                h hVar13 = nVar.f2816y;
                this.f2816y = iVar.n(z17, hVar12, hVar13 != dVar, hVar13);
                h hVar14 = this.z;
                boolean z18 = hVar14 != dVar;
                h hVar15 = nVar.z;
                this.z = iVar.n(z18, hVar14, hVar15 != dVar, hVar15);
                this.A = iVar.o(!this.A.isEmpty(), this.A, !nVar.A.isEmpty(), nVar.A);
                long j10 = this.B;
                boolean z19 = j10 != 0;
                long j11 = nVar.B;
                this.B = iVar.j(z19, j10, j11 != 0, j11);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        switch (r10) {
                            case 0:
                                z10 = true;
                                break;
                            case 10:
                                this.f2810s = mVar.f();
                                break;
                            case 16:
                                this.f2811t = mVar.n();
                                break;
                            case 26:
                                this.f2812u = mVar.f();
                                break;
                            case 34:
                                this.f2813v = mVar.f();
                                break;
                            case 42:
                                this.f2814w = mVar.f();
                                break;
                            case 50:
                                this.f2815x = mVar.f();
                                break;
                            case 58:
                                this.f2816y = mVar.f();
                                break;
                            case 66:
                                this.z = mVar.f();
                                break;
                            case 74:
                                this.A = mVar.q();
                                break;
                            case 80:
                                this.B = mVar.o();
                                break;
                            default:
                                if (mVar.i(r10)) {
                                    break;
                                }
                                z10 = true;
                                break;
                        }
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
                return new n();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (D == null) {
                    synchronized (n.class) {
                        try {
                            if (D == null) {
                                D = new r.b(C);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return D;
            default:
                throw new UnsupportedOperationException();
        }
        return C;
    }
}
