package a7;

import h7.i0;
import h7.z;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class m<P> {

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentMap<b, List<a<P>>> f152a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public a<P> f153b;

    /* renamed from: c  reason: collision with root package name */
    public final Class<P> f154c;

    public static final class a<P> {

        /* renamed from: a  reason: collision with root package name */
        public final P f155a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f156b;

        /* renamed from: c  reason: collision with root package name */
        public final z f157c;

        /* renamed from: d  reason: collision with root package name */
        public final i0 f158d;

        public a(Object obj, byte[] bArr, z zVar, i0 i0Var) {
            this.f155a = obj;
            this.f156b = Arrays.copyOf(bArr, bArr.length);
            this.f157c = zVar;
            this.f158d = i0Var;
        }

        public final byte[] a() {
            byte[] bArr = this.f156b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }
    }

    public static class b implements Comparable<b> {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f159a;

        public b(byte[] bArr) {
            this.f159a = Arrays.copyOf(bArr, bArr.length);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int compareTo(java.lang.Object r7) {
            /*
                r6 = this;
                a7.m$b r7 = (a7.m.b) r7
                byte[] r0 = r6.f159a
                int r1 = r0.length
                byte[] r2 = r7.f159a
                int r3 = r2.length
                if (r1 == r3) goto L_0x000d
                int r7 = r0.length
                int r0 = r2.length
                goto L_0x0020
            L_0x000d:
                r0 = 0
                r1 = r0
            L_0x000f:
                byte[] r2 = r6.f159a
                int r3 = r2.length
                if (r1 >= r3) goto L_0x0026
                byte r3 = r2[r1]
                byte[] r4 = r7.f159a
                byte r5 = r4[r1]
                if (r3 == r5) goto L_0x0023
                byte r7 = r2[r1]
                byte r0 = r4[r1]
            L_0x0020:
                int r0 = r7 - r0
                goto L_0x0026
            L_0x0023:
                int r1 = r1 + 1
                goto L_0x000f
            L_0x0026:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: a7.m.b.compareTo(java.lang.Object):int");
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return Arrays.equals(this.f159a, ((b) obj).f159a);
        }

        public final int hashCode() {
            return Arrays.hashCode(this.f159a);
        }

        public final String toString() {
            return jc.b.p(this.f159a);
        }
    }

    public m(Class<P> cls) {
        this.f154c = cls;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentMap<a7.m$b, java.util.List<a7.m$a<P>>>, java.util.concurrent.ConcurrentHashMap] */
    public final List<a<P>> a(byte[] bArr) {
        List<a<P>> list = (List) this.f152a.get(new b(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public final List<a<P>> b() {
        return a(b.f137a);
    }
}
