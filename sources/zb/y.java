package zb;

import zb.a0;
import zb.r;

public final class y<K, V> {

    /* renamed from: a  reason: collision with root package name */
    public final a<K, V> f14383a;

    /* renamed from: b  reason: collision with root package name */
    public final K f14384b;

    /* renamed from: c  reason: collision with root package name */
    public final V f14385c;

    public static class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        public final j f14386a;

        /* renamed from: b  reason: collision with root package name */
        public final K f14387b;

        /* renamed from: c  reason: collision with root package name */
        public final j f14388c;

        /* renamed from: d  reason: collision with root package name */
        public final V f14389d;

        public a(j jVar, K k10, j jVar2, V v10) {
            this.f14386a = jVar;
            this.f14387b = k10;
            this.f14388c = jVar2;
            this.f14389d = v10;
        }
    }

    public y(j jVar, K k10, j jVar2, V v10) {
        this.f14383a = new a<>(jVar, k10, jVar2, v10);
        this.f14384b = k10;
        this.f14385c = v10;
    }

    public static <T> T a(m mVar, p pVar, j jVar, T t10) {
        int ordinal = jVar.ordinal();
        if (ordinal == 9) {
            throw new RuntimeException("Groups are not allowed in maps.");
        } else if (ordinal == 10) {
            a0.a c10 = ((a0) t10).c();
            int n10 = mVar.n();
            if (mVar.f14345h < 100) {
                int d10 = mVar.d(n10);
                mVar.f14345h++;
                r.a aVar = (r.a) c10;
                aVar.g(mVar, pVar);
                mVar.c(0);
                mVar.f14345h--;
                mVar.g = d10;
                mVar.s();
                return aVar.j();
            }
            throw new u("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        } else if (ordinal == 13) {
            return Integer.valueOf(mVar.n());
        } else {
            int i = q.f14352d;
            l lVar = l.STRICT;
            switch (jVar.ordinal()) {
                case 0:
                    return Double.valueOf(Double.longBitsToDouble(mVar.l()));
                case 1:
                    return Float.valueOf(Float.intBitsToFloat(mVar.j()));
                case 2:
                    return Long.valueOf(mVar.o());
                case 3:
                    return Long.valueOf(mVar.o());
                case 4:
                    return Integer.valueOf(mVar.n());
                case 5:
                    return Long.valueOf(mVar.l());
                case 6:
                    return Integer.valueOf(mVar.j());
                case 7:
                    return Boolean.valueOf(mVar.e());
                case 8:
                    return lVar.a(mVar);
                case 9:
                    throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
                case 10:
                    throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
                case 11:
                    return mVar.f();
                case 12:
                    return Integer.valueOf(mVar.n());
                case 13:
                    throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
                case 14:
                    return Integer.valueOf(mVar.j());
                case 15:
                    return Long.valueOf(mVar.l());
                case 16:
                    int n11 = mVar.n();
                    return Integer.valueOf((-(n11 & 1)) ^ (n11 >>> 1));
                case 17:
                    long o4 = mVar.o();
                    return Long.valueOf((-(o4 & 1)) ^ (o4 >>> 1));
                default:
                    throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
            }
        }
    }

    public final void b(z<K, V> zVar, m mVar, p pVar) {
        int d10 = mVar.d(mVar.n());
        a<K, V> aVar = this.f14383a;
        K k10 = aVar.f14387b;
        V v10 = aVar.f14389d;
        while (true) {
            int r10 = mVar.r();
            if (r10 == 0) {
                break;
            }
            a<K, V> aVar2 = this.f14383a;
            j jVar = aVar2.f14386a;
            if (r10 == (jVar.f14326b | 8)) {
                k10 = a(mVar, pVar, jVar, k10);
            } else {
                j jVar2 = aVar2.f14388c;
                if (r10 == (jVar2.f14326b | 16)) {
                    v10 = a(mVar, pVar, jVar2, v10);
                } else if (!mVar.i(r10)) {
                    break;
                }
            }
        }
        mVar.c(0);
        mVar.g = d10;
        mVar.s();
        zVar.put(k10, v10);
    }
}
