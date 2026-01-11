package i7;

import i7.z;
import java.util.Collections;
import java.util.List;

public abstract class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6259a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f6260b = new b();

    public static final class a extends g0 {

        /* renamed from: c  reason: collision with root package name */
        public static final Class<?> f6261c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: i7.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: i7.e0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: i7.e0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static <L> java.util.List<L> d(java.lang.Object r3, long r4, int r6) {
            /*
                java.lang.Object r0 = i7.p1.n(r3, r4)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof i7.f0
                if (r1 == 0) goto L_0x0016
                i7.e0 r0 = new i7.e0
                r0.<init>((int) r6)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof i7.z0
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof i7.z.d
                if (r1 == 0) goto L_0x0026
                i7.z$d r0 = (i7.z.d) r0
                i7.z$d r6 = r0.B(r6)
                r0 = r6
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x002b:
                i7.p1.x(r3, r4, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f6261c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                i7.p1.x(r3, r4, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof i7.o1
                if (r1 == 0) goto L_0x0064
                i7.e0 r1 = new i7.e0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                i7.o1 r0 = (i7.o1) r0
                r1.addAll(r0)
                i7.p1.x(r3, r4, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof i7.z0
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof i7.z.d
                if (r1 == 0) goto L_0x0081
                r1 = r0
                i7.z$d r1 = (i7.z.d) r1
                boolean r2 = r1.p0()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r6
                i7.z$d r0 = r1.B(r0)
                i7.p1.x(r3, r4, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i7.g0.a.d(java.lang.Object, long, int):java.util.List");
        }

        public final void a(Object obj, long j10) {
            Object obj2;
            List list = (List) p1.n(obj, j10);
            if (list instanceof f0) {
                obj2 = ((f0) list).R();
            } else if (!f6261c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof z0) || !(list instanceof z.d)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    z.d dVar = (z.d) list;
                    if (dVar.p0()) {
                        dVar.f();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            p1.x(obj, j10, obj2);
        }

        public final <E> void b(Object obj, Object obj2, long j10) {
            List list = (List) p1.n(obj2, j10);
            List d10 = d(obj, j10, list.size());
            int size = d10.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                d10.addAll(list);
            }
            if (size > 0) {
                list = d10;
            }
            p1.x(obj, j10, list);
        }

        public final <L> List<L> c(Object obj, long j10) {
            return d(obj, j10, 10);
        }
    }

    public static final class b extends g0 {
        public static <E> z.d<E> d(Object obj, long j10) {
            return (z.d) p1.n(obj, j10);
        }

        public final void a(Object obj, long j10) {
            d(obj, j10).f();
        }

        public final <E> void b(Object obj, Object obj2, long j10) {
            z.d d10 = d(obj, j10);
            z.d d11 = d(obj2, j10);
            int size = d10.size();
            int size2 = d11.size();
            if (size > 0 && size2 > 0) {
                if (!d10.p0()) {
                    d10 = d10.B(size2 + size);
                }
                d10.addAll(d11);
            }
            if (size > 0) {
                d11 = d10;
            }
            p1.x(obj, j10, d11);
        }

        public final <L> List<L> c(Object obj, long j10) {
            z.d d10 = d(obj, j10);
            if (d10.p0()) {
                return d10;
            }
            int size = d10.size();
            z.d B = d10.B(size == 0 ? 10 : size * 2);
            p1.x(obj, j10, B);
            return B;
        }
    }

    public abstract void a(Object obj, long j10);

    public abstract <L> void b(Object obj, Object obj2, long j10);

    public abstract <L> List<L> c(Object obj, long j10);
}
