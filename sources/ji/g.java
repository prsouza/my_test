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

public final class g extends r<g, a> implements b0 {
    public static final g B;
    public static volatile d0<g> C;
    public int A;

    /* renamed from: s  reason: collision with root package name */
    public int f7298s;

    /* renamed from: t  reason: collision with root package name */
    public int f7299t;

    /* renamed from: u  reason: collision with root package name */
    public int f7300u;

    /* renamed from: v  reason: collision with root package name */
    public int f7301v;

    /* renamed from: w  reason: collision with root package name */
    public t.b f7302w = s.f14374s;

    /* renamed from: x  reason: collision with root package name */
    public String f7303x = BuildConfig.FLAVOR;

    /* renamed from: y  reason: collision with root package name */
    public String f7304y = BuildConfig.FLAVOR;
    public int z;

    public static final class a extends r.a<g, a> implements b0 {
        public a() {
            super(g.B);
        }
    }

    static {
        g gVar = new g();
        B = gVar;
        gVar.p();
    }

    public final int a() {
        int i;
        int i10 = this.f14357c;
        if (i10 != -1) {
            return i10;
        }
        int i11 = this.f7298s;
        int i12 = 0;
        int s22 = i11 != 0 ? n.s2(1, i11) + 0 : 0;
        int i13 = this.f7299t;
        if (i13 != 0) {
            s22 += n.s2(2, i13);
        }
        int i14 = this.f7300u;
        if (i14 != 0) {
            s22 += n.s2(3, i14);
        }
        int i15 = this.f7301v;
        if (i15 != 0) {
            s22 += n.s2(4, i15);
        }
        int i16 = 0;
        while (true) {
            s sVar = (s) this.f7302w;
            i = sVar.f14376c;
            if (i12 >= i) {
                break;
            }
            i16 += n.C2(sVar.g(i12));
            i12++;
        }
        int i17 = (i * 1) + s22 + i16;
        if (!this.f7303x.isEmpty()) {
            i17 += n.u2(6, this.f7303x);
        }
        if (!this.f7304y.isEmpty()) {
            i17 += n.u2(7, this.f7304y);
        }
        int i18 = this.z;
        if (i18 != 0) {
            i17 += n.s2(8, i18);
        }
        int i19 = this.A;
        if (i19 != 0) {
            i17 += n.s2(9, i19);
        }
        this.f14357c = i17;
        return i17;
    }

    public final void c(n nVar) {
        a();
        int i = this.f7298s;
        if (i != 0) {
            nVar.S2(1, i);
        }
        int i10 = this.f7299t;
        if (i10 != 0) {
            nVar.S2(2, i10);
        }
        int i11 = this.f7300u;
        if (i11 != 0) {
            nVar.S2(3, i11);
        }
        int i12 = this.f7301v;
        if (i12 != 0) {
            nVar.S2(4, i12);
        }
        int i13 = 0;
        while (true) {
            s sVar = (s) this.f7302w;
            if (i13 >= sVar.f14376c) {
                break;
            }
            nVar.S2(5, sVar.g(i13));
            i13++;
        }
        if (!this.f7303x.isEmpty()) {
            nVar.G2(6, this.f7303x);
        }
        if (!this.f7304y.isEmpty()) {
            nVar.G2(7, this.f7304y);
        }
        int i14 = this.z;
        if (i14 != 0) {
            nVar.S2(8, i14);
        }
        int i15 = this.A;
        if (i15 != 0) {
            nVar.S2(9, i15);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return B;
            case 1:
                r.i iVar = (r.i) obj;
                g gVar = (g) obj2;
                int i = this.f7298s;
                boolean z11 = i != 0;
                int i10 = gVar.f7298s;
                this.f7298s = iVar.d(z11, i, i10 != 0, i10);
                int i11 = this.f7299t;
                boolean z12 = i11 != 0;
                int i12 = gVar.f7299t;
                this.f7299t = iVar.d(z12, i11, i12 != 0, i12);
                int i13 = this.f7300u;
                boolean z13 = i13 != 0;
                int i14 = gVar.f7300u;
                this.f7300u = iVar.d(z13, i13, i14 != 0, i14);
                int i15 = this.f7301v;
                boolean z14 = i15 != 0;
                int i16 = gVar.f7301v;
                this.f7301v = iVar.d(z14, i15, i16 != 0, i16);
                this.f7302w = iVar.f(this.f7302w, gVar.f7302w);
                this.f7303x = iVar.o(!this.f7303x.isEmpty(), this.f7303x, !gVar.f7303x.isEmpty(), gVar.f7303x);
                this.f7304y = iVar.o(!this.f7304y.isEmpty(), this.f7304y, !gVar.f7304y.isEmpty(), gVar.f7304y);
                int i17 = this.z;
                boolean z15 = i17 != 0;
                int i18 = gVar.z;
                this.z = iVar.d(z15, i17, i18 != 0, i18);
                int i19 = this.A;
                boolean z16 = i19 != 0;
                int i20 = gVar.A;
                if (i20 != 0) {
                    z10 = true;
                }
                this.A = iVar.d(z16, i19, z10, i20);
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
                                this.f7298s = mVar.n();
                                break;
                            case 16:
                                this.f7299t = mVar.n();
                                break;
                            case 24:
                                this.f7300u = mVar.n();
                                break;
                            case LZ4BlockOutputStream.COMPRESSION_METHOD_LZ4 /*32*/:
                                this.f7301v = mVar.n();
                                break;
                            case 40:
                                t.b bVar = this.f7302w;
                                if (!((d) bVar).f14277a) {
                                    this.f7302w = r.j(bVar);
                                }
                                s sVar = (s) this.f7302w;
                                sVar.d(sVar.f14376c, mVar.n());
                                break;
                            case 42:
                                int d10 = mVar.d(mVar.n());
                                if (!((d) this.f7302w).f14277a && mVar.a() > 0) {
                                    this.f7302w = r.j(this.f7302w);
                                }
                                while (mVar.a() > 0) {
                                    s sVar2 = (s) this.f7302w;
                                    sVar2.d(sVar2.f14376c, mVar.n());
                                }
                                mVar.g = d10;
                                mVar.s();
                                break;
                            case 50:
                                this.f7303x = mVar.q();
                                break;
                            case 58:
                                this.f7304y = mVar.q();
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
                ((d) this.f7302w).f14277a = false;
                return null;
            case 4:
                return new g();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (C == null) {
                    synchronized (g.class) {
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
