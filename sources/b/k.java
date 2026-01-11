package b;

import java.io.IOException;
import java.util.Map;
import java.util.Objects;
import zb.b0;
import zb.d0;
import zb.j;
import zb.m;
import zb.n;
import zb.p;
import zb.q;
import zb.r;
import zb.u;
import zb.y;
import zb.z;

public final class k extends r<k, a> implements b0 {

    /* renamed from: t  reason: collision with root package name */
    public static final k f2795t;

    /* renamed from: u  reason: collision with root package name */
    public static volatile d0<k> f2796u;

    /* renamed from: s  reason: collision with root package name */
    public z<Integer, j> f2797s = z.f14390b;

    public static final class a extends r.a<k, a> implements b0 {
        public a() {
            super(k.f2795t);
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public static final y<Integer, j> f2798a = new y<>(j.UINT32, 0, j.MESSAGE, j.f2791u);
    }

    static {
        k kVar = new k();
        f2795t = kVar;
        kVar.p();
    }

    public final int a() {
        int i = this.f14357c;
        if (i != -1) {
            return i;
        }
        int i10 = 0;
        for (Map.Entry next : this.f2797s.entrySet()) {
            y<Integer, j> yVar = b.f2798a;
            Object key = next.getKey();
            Object value = next.getValue();
            Objects.requireNonNull(yVar);
            int D2 = n.D2(1);
            y.a<K, V> aVar = yVar.f14383a;
            int a10 = q.a(aVar.f14388c, 2, value) + q.a(aVar.f14386a, 1, key);
            i10 += n.N2(a10) + a10 + D2;
        }
        this.f14357c = i10;
        return i10;
    }

    public final void c(n nVar) {
        for (Map.Entry next : this.f2797s.entrySet()) {
            y<Integer, j> yVar = b.f2798a;
            Object key = next.getKey();
            Object value = next.getValue();
            Objects.requireNonNull(yVar);
            nVar.V2(1, 2);
            y.a<K, V> aVar = yVar.f14383a;
            nVar.W2(q.a(aVar.f14388c, 2, value) + q.a(aVar.f14386a, 1, key));
            y.a<K, V> aVar2 = yVar.f14383a;
            q.e(nVar, aVar2.f14386a, 1, key);
            q.e(nVar, aVar2.f14388c, 2, value);
        }
    }

    public final Object g(r.h hVar, Object obj, Object obj2) {
        boolean z = false;
        switch (hVar.ordinal()) {
            case 0:
                return f2795t;
            case 1:
                this.f2797s = ((r.i) obj).i(this.f2797s, ((k) obj2).f2797s);
                return this;
            case 2:
                m mVar = (m) obj;
                p pVar = (p) obj2;
                while (!z) {
                    try {
                        int r10 = mVar.r();
                        if (r10 != 0) {
                            if (r10 == 10) {
                                z<Integer, j> zVar = this.f2797s;
                                if (!zVar.f14391a) {
                                    this.f2797s = zVar.g();
                                }
                                b.f2798a.b(this.f2797s, mVar, pVar);
                            } else if (!mVar.i(r10)) {
                            }
                        }
                        z = true;
                    } catch (u e10) {
                        throw new RuntimeException(e10);
                    } catch (IOException e11) {
                        throw new RuntimeException(new u(e11.getMessage()));
                    }
                }
                break;
            case 3:
                this.f2797s.f14391a = false;
                return null;
            case 4:
                return new k();
            case 5:
                return new a();
            case 6:
                break;
            case 7:
                if (f2796u == null) {
                    synchronized (k.class) {
                        if (f2796u == null) {
                            f2796u = new r.b(f2795t);
                        }
                    }
                }
                return f2796u;
            default:
                throw new UnsupportedOperationException();
        }
        return f2795t;
    }

    public final j r(int i) {
        z<Integer, j> zVar = this.f2797s;
        if (zVar.containsKey(Integer.valueOf(i))) {
            return zVar.get(Integer.valueOf(i));
        }
        return null;
    }
}
