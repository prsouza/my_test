package ji;

import com.github.mikephil.charting.BuildConfig;
import java.io.IOException;
import zb.b0;
import zb.d0;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class m extends r<m, a> implements b0 {

    /* renamed from: v  reason: collision with root package name */
    public static final m f7335v;

    /* renamed from: w  reason: collision with root package name */
    public static volatile d0<m> f7336w;

    /* renamed from: s  reason: collision with root package name */
    public String f7337s = BuildConfig.FLAVOR;

    /* renamed from: t  reason: collision with root package name */
    public String f7338t = BuildConfig.FLAVOR;

    /* renamed from: u  reason: collision with root package name */
    public long f7339u;

    public static final class a extends r.a<m, a> implements b0 {
        public a() {
            super(m.f7335v);
        }
    }

    static {
        m mVar = new m();
        f7335v = mVar;
        mVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        if (!this.f7337s.isEmpty()) {
            i10 = 0 + n.u2(1, this.f7337s);
        }
        if (!this.f7338t.isEmpty()) {
            i10 += n.u2(2, this.f7338t);
        }
        long j10 = this.f7339u;
        if (j10 != 0) {
            i10 += n.t2(3, j10);
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        if (!this.f7337s.isEmpty()) {
            nVar.G2(1, this.f7337s);
        }
        if (!this.f7338t.isEmpty()) {
            nVar.G2(2, this.f7338t);
        }
        long j10 = this.f7339u;
        if (j10 != 0) {
            nVar.T2(3, j10);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7335v;
            case 1:
                r.i iVar = (r.i) obj;
                m mVar = (m) obj2;
                this.f7337s = iVar.o(!this.f7337s.isEmpty(), this.f7337s, !mVar.f7337s.isEmpty(), mVar.f7337s);
                this.f7338t = iVar.o(!this.f7338t.isEmpty(), this.f7338t, !mVar.f7338t.isEmpty(), mVar.f7338t);
                long j10 = this.f7339u;
                boolean z10 = j10 != 0;
                long j11 = mVar.f7339u;
                this.f7339u = iVar.j(z10, j10, j11 != 0, j11);
                return this;
            case 2:
                zb.m mVar2 = (zb.m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar2.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                this.f7337s = mVar2.q();
                            } else if (r10 == 18) {
                                this.f7338t = mVar2.q();
                            } else if (r10 == 24) {
                                this.f7339u = mVar2.o();
                            } else if (!mVar2.i(r10)) {
                            }
                        }
                        z = true;
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
                return new m();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f7336w == null) {
                    synchronized (m.class) {
                        try {
                            if (f7336w == null) {
                                f7336w = new r.b(f7335v);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f7336w;
            default:
                throw new UnsupportedOperationException();
        }
        return f7335v;
    }
}
