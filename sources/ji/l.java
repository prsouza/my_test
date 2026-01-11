package ji;

import com.github.mikephil.charting.utils.Utils;
import java.io.IOException;
import java.util.Objects;
import zb.b0;
import zb.d0;
import zb.m;
import zb.n;
import zb.p;
import zb.r;
import zb.u;

public final class l extends r<l, a> implements b0 {

    /* renamed from: x  reason: collision with root package name */
    public static final l f7328x;

    /* renamed from: y  reason: collision with root package name */
    public static volatile d0<l> f7329y;

    /* renamed from: s  reason: collision with root package name */
    public long f7330s;

    /* renamed from: t  reason: collision with root package name */
    public double f7331t;

    /* renamed from: u  reason: collision with root package name */
    public double f7332u;

    /* renamed from: v  reason: collision with root package name */
    public double f7333v;

    /* renamed from: w  reason: collision with root package name */
    public float f7334w;

    public static final class a extends r.a<l, a> implements b0 {
        public a() {
            super(l.f7328x);
        }

        public final a l(double d10) {
            k();
            ((l) this.f14359b).f7333v = d10;
            return this;
        }

        public final a m(float f10) {
            k();
            ((l) this.f14359b).f7334w = f10;
            return this;
        }

        public final a n(long j10) {
            k();
            ((l) this.f14359b).f7330s = j10;
            return this;
        }

        public final a o(double d10) {
            k();
            ((l) this.f14359b).f7331t = d10;
            return this;
        }

        public final a p(double d10) {
            k();
            ((l) this.f14359b).f7332u = d10;
            return this;
        }
    }

    static {
        l lVar = new l();
        f7328x = lVar;
        lVar.p();
    }

    public static a r() {
        return (a) f7328x.c();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        long j10 = this.f7330s;
        if (j10 != 0) {
            i10 = 0 + n.F2(1, j10);
        }
        if (this.f7331t != Utils.DOUBLE_EPSILON) {
            i10 += n.r2(2);
        }
        if (this.f7332u != Utils.DOUBLE_EPSILON) {
            i10 += n.r2(3);
        }
        if (this.f7333v != Utils.DOUBLE_EPSILON) {
            i10 += n.r2(4);
        }
        if (this.f7334w != 0.0f) {
            i10 += n.D2(5) + 4;
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        long j10 = this.f7330s;
        if (j10 != 0) {
            nVar.T2(1, j10);
        }
        double d10 = this.f7331t;
        if (d10 != Utils.DOUBLE_EPSILON) {
            Objects.requireNonNull(nVar);
            nVar.P2(2, Double.doubleToRawLongBits(d10));
        }
        double d11 = this.f7332u;
        if (d11 != Utils.DOUBLE_EPSILON) {
            Objects.requireNonNull(nVar);
            nVar.P2(3, Double.doubleToRawLongBits(d11));
        }
        double d12 = this.f7333v;
        if (d12 != Utils.DOUBLE_EPSILON) {
            Objects.requireNonNull(nVar);
            nVar.P2(4, Double.doubleToRawLongBits(d12));
        }
        float f10 = this.f7334w;
        if (f10 != 0.0f) {
            Objects.requireNonNull(nVar);
            nVar.O2(Float.floatToRawIntBits(f10));
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = true;
        boolean z10 = false;
        switch (hVar.ordinal()) {
            case 0:
                return f7328x;
            case 1:
                r.i iVar = (r.i) obj;
                l lVar = (l) obj2;
                long j10 = this.f7330s;
                boolean z11 = j10 != 0;
                long j11 = lVar.f7330s;
                this.f7330s = iVar.j(z11, j10, j11 != 0, j11);
                double d10 = this.f7331t;
                boolean z12 = d10 != Utils.DOUBLE_EPSILON;
                double d11 = lVar.f7331t;
                this.f7331t = iVar.h(z12, d10, d11 != Utils.DOUBLE_EPSILON, d11);
                double d12 = this.f7332u;
                boolean z13 = d12 != Utils.DOUBLE_EPSILON;
                double d13 = lVar.f7332u;
                this.f7332u = iVar.h(z13, d12, d13 != Utils.DOUBLE_EPSILON, d13);
                double d14 = this.f7333v;
                boolean z14 = d14 != Utils.DOUBLE_EPSILON;
                double d15 = lVar.f7333v;
                this.f7333v = iVar.h(z14, d14, d15 != Utils.DOUBLE_EPSILON, d15);
                float f10 = this.f7334w;
                boolean z15 = f10 != 0.0f;
                float f11 = lVar.f7334w;
                if (f11 == 0.0f) {
                    z = false;
                }
                this.f7334w = iVar.l(z15, f10, z, f11);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z10) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 8) {
                                this.f7330s = mVar.o();
                            } else if (r10 == 17) {
                                this.f7331t = Double.longBitsToDouble(mVar.l());
                            } else if (r10 == 25) {
                                this.f7332u = Double.longBitsToDouble(mVar.l());
                            } else if (r10 == 33) {
                                this.f7333v = Double.longBitsToDouble(mVar.l());
                            } else if (r10 == 45) {
                                this.f7334w = Float.intBitsToFloat(mVar.j());
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
                return new l();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f7329y == null) {
                    synchronized (l.class) {
                        try {
                            if (f7329y == null) {
                                f7329y = new r.b(f7328x);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return f7329y;
            default:
                throw new UnsupportedOperationException();
        }
        return f7328x;
    }
}
