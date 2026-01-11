package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import net.jpountz.lz4.LZ4BlockOutputStream;
import zb.b0;
import zb.d;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.s;
import zb.t;
import zb.u;

public final class h extends r<h, a> implements b0 {
    public static final h B;
    public static volatile d0<h> C;
    public int A;

    /* renamed from: s  reason: collision with root package name */
    public int f7305s;

    /* renamed from: t  reason: collision with root package name */
    public int f7306t;

    /* renamed from: u  reason: collision with root package name */
    public t.b f7307u = s.f14374s;

    /* renamed from: v  reason: collision with root package name */
    public String f7308v = BuildConfig.FLAVOR;

    /* renamed from: w  reason: collision with root package name */
    public String f7309w = BuildConfig.FLAVOR;

    /* renamed from: x  reason: collision with root package name */
    public int f7310x;

    /* renamed from: y  reason: collision with root package name */
    public long f7311y;
    public int z;

    public static final class a extends r.a<h, a> implements b0 {
        public a() {
            super(h.B);
        }
    }

    static {
        h hVar = new h();
        B = hVar;
        hVar.p();
    }

    public final int a() {
        int i;
        int i10 = this.f14357c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f7305s;
        int i12 = 0;
        int s22 = i11 != 0 ? n.s2(1, i11) + 0 : 0;
        int i13 = this.f7306t;
        if (i13 != 0) {
            s22 += n.s2(2, i13);
        }
        int i14 = 0;
        while (true) {
            s sVar = (s) this.f7307u;
            i = sVar.f14376c;
            if (i12 >= i) {
                break;
            }
            i14 += n.C2(sVar.g(i12));
            i12++;
        }
        int i15 = (i * 1) + s22 + i14;
        if (!this.f7308v.isEmpty()) {
            i15 += n.u2(4, this.f7308v);
        }
        if (!this.f7309w.isEmpty()) {
            i15 += n.u2(5, this.f7309w);
        }
        int i16 = this.f7310x;
        if (i16 != 0) {
            i15 += n.s2(6, i16);
        }
        long j10 = this.f7311y;
        if (j10 != 0) {
            i15 += n.t2(7, j10);
        }
        int i17 = this.z;
        if (i17 != 0) {
            i15 += n.s2(8, i17);
        }
        int i18 = this.A;
        if (i18 != 0) {
            i15 += n.s2(9, i18);
        }
        this.f14357c = i15;
        return i15;
    }

    public final void c(n nVar) {
        a();
        int i = this.f7305s;
        if (i != 0) {
            nVar.S2(1, i);
        }
        int i10 = this.f7306t;
        if (i10 != 0) {
            nVar.S2(2, i10);
        }
        int i11 = 0;
        while (true) {
            s sVar = (s) this.f7307u;
            if (i11 >= sVar.f14376c) {
                break;
            }
            nVar.S2(3, sVar.g(i11));
            i11++;
        }
        if (!this.f7308v.isEmpty()) {
            nVar.G2(4, this.f7308v);
        }
        if (!this.f7309w.isEmpty()) {
            nVar.G2(5, this.f7309w);
        }
        int i12 = this.f7310x;
        if (i12 != 0) {
            nVar.S2(6, i12);
        }
        long j10 = this.f7311y;
        if (j10 != 0) {
            nVar.T2(7, j10);
        }
        int i13 = this.z;
        if (i13 != 0) {
            nVar.S2(8, i13);
        }
        int i14 = this.A;
        if (i14 != 0) {
            nVar.S2(9, i14);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return B;
            case 1:
                r.i iVar = (r.i) obj;
                h hVar2 = (h) obj2;
                int i = this.f7305s;
                boolean z11 = i != 0;
                int i10 = hVar2.f7305s;
                this.f7305s = iVar.d(z11, i, i10 != 0, i10);
                int i11 = this.f7306t;
                boolean z12 = i11 != 0;
                int i12 = hVar2.f7306t;
                this.f7306t = iVar.d(z12, i11, i12 != 0, i12);
                this.f7307u = iVar.f(this.f7307u, hVar2.f7307u);
                this.f7308v = iVar.o(!this.f7308v.isEmpty(), this.f7308v, !hVar2.f7308v.isEmpty(), hVar2.f7308v);
                this.f7309w = iVar.o(!this.f7309w.isEmpty(), this.f7309w, !hVar2.f7309w.isEmpty(), hVar2.f7309w);
                int i13 = this.f7310x;
                boolean z13 = i13 != 0;
                int i14 = hVar2.f7310x;
                this.f7310x = iVar.d(z13, i13, i14 != 0, i14);
                long j10 = this.f7311y;
                boolean z14 = j10 != 0;
                long j11 = hVar2.f7311y;
                this.f7311y = iVar.j(z14, j10, j11 != 0, j11);
                int i15 = this.z;
                boolean z15 = i15 != 0;
                int i16 = hVar2.z;
                this.z = iVar.d(z15, i15, i16 != 0, i16);
                int i17 = this.A;
                boolean z16 = i17 != 0;
                int i18 = hVar2.A;
                if (i18 != 0) {
                    z10 = true;
                }
                this.A = iVar.d(z16, i17, z10, i18);
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
                            case 8:
                                this.f7305s = mVar.n();
                                break;
                            case 16:
                                this.f7306t = mVar.n();
                                break;
                            case 24:
                                t.b bVar = this.f7307u;
                                if (!((d) bVar).f14277a) {
                                    this.f7307u = r.j(bVar);
                                }
                                s sVar = (s) this.f7307u;
                                sVar.d(sVar.f14376c, mVar.n());
                                break;
                            case 26:
                                int d10 = mVar.d(mVar.n());
                                if (!((d) this.f7307u).f14277a && mVar.a() > 0) {
                                    this.f7307u = r.j(this.f7307u);
                                }
                                while (mVar.a() > 0) {
                                    s sVar2 = (s) this.f7307u;
                                    sVar2.d(sVar2.f14376c, mVar.n());
                                }
                                mVar.g = d10;
                                mVar.s();
                                break;
                            case 34:
                                this.f7308v = mVar.q();
                                break;
                            case 42:
                                this.f7309w = mVar.q();
                                break;
                            case 48:
                                this.f7310x = mVar.n();
                                break;
                            case 56:
                                this.f7311y = mVar.o();
                                break;
                            case LZ4BlockOutputStream.MIN_BLOCK_SIZE /*64*/:
                                this.z = mVar.n();
                                break;
                            case 72:
                                this.A = mVar.n();
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
                ((d) this.f7307u).f14277a = false;
                return null;
            case 4:
                return new h();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (C == null) {
                    synchronized (h.class) {
                        try {
                            if (C == null) {
                                C = new r.b(B);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return C;
            default:
                throw new UnsupportedOperationException();
        }
        return B;
    }
}
