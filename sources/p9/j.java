package p9;

import aa.c;
import g9.h;
import i2.a0;
import i2.d;
import i2.x;
import i2.z;
import java.lang.reflect.Field;
import java.util.Map;

public final class j implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final g9.b f9747a;

    /* renamed from: b  reason: collision with root package name */
    public final d f9748b;

    /* renamed from: c  reason: collision with root package name */
    public final g9.d f9749c;

    /* renamed from: s  reason: collision with root package name */
    public final d f9750s;

    /* renamed from: t  reason: collision with root package name */
    public final u9.b f9751t = u9.b.f11746a;

    public static final class a<T> extends z<T> {

        /* renamed from: a  reason: collision with root package name */
        public final h<T> f9752a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, b> f9753b;

        public a(h<T> hVar, Map<String, b> map) {
            this.f9752a = hVar;
            this.f9753b = map;
        }

        public final T read(aa.a aVar) {
            if (aVar.A0() == 9) {
                aVar.x0();
                return null;
            }
            T a10 = this.f9752a.a();
            try {
                aVar.w();
                while (aVar.a0()) {
                    b bVar = this.f9753b.get(aVar.w0());
                    if (bVar != null) {
                        if (bVar.f9756c) {
                            bVar.a(aVar, a10);
                        }
                    }
                    aVar.D0();
                }
                aVar.S();
                return a10;
            } catch (IllegalStateException e10) {
                throw new x((Throwable) e10);
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            }
        }

        public final void write(c cVar, T t10) {
            if (t10 == null) {
                cVar.f0();
                return;
            }
            cVar.R();
            try {
                for (b next : this.f9753b.values()) {
                    if (next.c(t10)) {
                        cVar.s(next.f9754a);
                        next.b(cVar, t10);
                    }
                }
                cVar.a0();
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f9754a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f9755b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f9756c;

        public b(String str, boolean z, boolean z10) {
            this.f9754a = str;
            this.f9755b = z;
            this.f9756c = z10;
        }

        public abstract void a(aa.a aVar, Object obj);

        public abstract void b(c cVar, Object obj);

        public abstract boolean c(Object obj);
    }

    public j(g9.b bVar, d dVar, g9.d dVar2, d dVar3) {
        this.f9747a = bVar;
        this.f9748b = dVar;
        this.f9749c = dVar2;
        this.f9750s = dVar3;
    }

    public final boolean a(Field field, boolean z) {
        g9.d dVar = this.f9749c;
        Class<?> type = field.getType();
        if ((dVar.a(type) || dVar.b(type, z)) || dVar.c(field, z)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0197 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x017d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> i2.z<T> create(i2.j r33, x9.a<T> r34) {
        /*
            r32 = this;
            r0 = r32
            r11 = r33
            r1 = r34
            java.lang.Class<java.lang.Object> r12 = java.lang.Object.class
            java.lang.Class<? super T> r2 = r1.f13148a
            boolean r3 = r12.isAssignableFrom(r2)
            r13 = 0
            if (r3 != 0) goto L_0x0012
            return r13
        L_0x0012:
            g9.b r3 = r0.f9747a
            g9.h r14 = r3.a(r1)
            p9.j$a r15 = new p9.j$a
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            boolean r3 = r2.isInterface()
            if (r3 == 0) goto L_0x002c
        L_0x0025:
            r28 = r14
            r21 = r15
            r15 = r10
            goto L_0x01dc
        L_0x002c:
            java.lang.reflect.Type r9 = r1.f13149b
            r8 = r1
            r7 = r2
        L_0x0030:
            if (r7 == r12) goto L_0x0025
            java.lang.reflect.Field[] r6 = r7.getDeclaredFields()
            int r5 = r6.length
            r4 = 0
            r3 = r4
        L_0x0039:
            if (r3 >= r5) goto L_0x01b3
            r2 = r6[r3]
            r1 = 1
            boolean r16 = r0.a(r2, r1)
            boolean r17 = r0.a(r2, r4)
            if (r16 != 0) goto L_0x005f
            if (r17 != 0) goto L_0x005f
            r19 = r3
            r29 = r4
            r20 = r5
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r14 = r9
            r15 = r10
            goto L_0x017d
        L_0x005f:
            u9.b r4 = r0.f9751t
            r4.a(r2)
            java.lang.reflect.Type r4 = r8.f13149b
            java.lang.reflect.Type r13 = r2.getGenericType()
            java.lang.reflect.Type r13 = g9.a.c(r4, r7, r13)
            java.lang.Class<l2.b> r4 = l2.b.class
            java.lang.annotation.Annotation r4 = r2.getAnnotation(r4)
            l2.b r4 = (l2.b) r4
            if (r4 != 0) goto L_0x0085
            i2.d r4 = r0.f9748b
            java.lang.String r4 = r4.a(r2)
            java.util.List r4 = java.util.Collections.singletonList(r4)
            r19 = r3
            goto L_0x0096
        L_0x0085:
            java.lang.String r1 = r4.value()
            java.lang.String[] r4 = r4.alternate()
            r19 = r3
            int r3 = r4.length
            if (r3 != 0) goto L_0x009c
            java.util.List r4 = java.util.Collections.singletonList(r1)
        L_0x0096:
            r20 = r5
            r18 = 1
            r5 = r4
            goto L_0x00bc
        L_0x009c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r20 = r5
            int r5 = r4.length
            r18 = 1
            int r5 = r5 + 1
            r3.<init>(r5)
            r3.add(r1)
            int r1 = r4.length
            r5 = 0
        L_0x00ad:
            if (r5 >= r1) goto L_0x00bb
            r21 = r1
            r1 = r4[r5]
            r3.add(r1)
            int r5 = r5 + 1
            r1 = r21
            goto L_0x00ad
        L_0x00bb:
            r5 = r3
        L_0x00bc:
            int r4 = r5.size()
            r1 = 0
            r3 = 0
        L_0x00c2:
            if (r3 >= r4) goto L_0x016b
            java.lang.Object r21 = r5.get(r3)
            r22 = r12
            r12 = r21
            java.lang.String r12 = (java.lang.String) r12
            r21 = r9
            if (r3 == 0) goto L_0x00d4
            r16 = 0
        L_0x00d4:
            x9.a r9 = new x9.a
            r9.<init>(r13)
            r23 = r1
            java.lang.Class<? super T> r1 = r9.f13148a
            r24 = r3
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x00ec
            boolean r1 = r1.isPrimitive()
            if (r1 == 0) goto L_0x00ec
            r25 = r18
            goto L_0x00ee
        L_0x00ec:
            r25 = 0
        L_0x00ee:
            java.lang.Class<l2.a> r1 = l2.a.class
            java.lang.annotation.Annotation r1 = r2.getAnnotation(r1)
            l2.a r1 = (l2.a) r1
            if (r1 == 0) goto L_0x0103
            p9.d r3 = r0.f9750s
            r26 = r2
            g9.b r2 = r0.f9747a
            i2.z r1 = r3.a(r2, r11, r9, r1)
            goto L_0x0106
        L_0x0103:
            r26 = r2
            r1 = 0
        L_0x0106:
            if (r1 == 0) goto L_0x010b
            r27 = r18
            goto L_0x010d
        L_0x010b:
            r27 = 0
        L_0x010d:
            if (r1 != 0) goto L_0x0113
            i2.z r1 = r11.c(r9)
        L_0x0113:
            r28 = r1
            p9.i r3 = new p9.i
            r2 = r23
            r1 = r3
            r0 = r2
            r23 = r26
            r2 = r12
            r11 = r3
            r3 = r16
            r26 = r4
            r29 = 0
            r4 = r17
            r30 = r5
            r5 = r23
            r31 = r6
            r6 = r27
            r34 = r7
            r7 = r28
            r27 = r13
            r13 = r8
            r8 = r33
            r28 = r14
            r14 = r21
            r21 = r15
            r15 = r10
            r10 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r1 = r15.put(r12, r11)
            p9.j$b r1 = (p9.j.b) r1
            if (r0 != 0) goto L_0x014d
            goto L_0x014e
        L_0x014d:
            r1 = r0
        L_0x014e:
            int r3 = r24 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r15 = r21
            r12 = r22
            r2 = r23
            r4 = r26
            r13 = r27
            r14 = r28
            r5 = r30
            r6 = r31
            goto L_0x00c2
        L_0x016b:
            r0 = r1
            r31 = r6
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r29 = 0
            r14 = r9
            r15 = r10
            if (r0 != 0) goto L_0x0197
        L_0x017d:
            int r3 = r19 + 1
            r0 = r32
            r11 = r33
            r7 = r34
            r8 = r13
            r9 = r14
            r10 = r15
            r5 = r20
            r15 = r21
            r12 = r22
            r14 = r28
            r4 = r29
            r6 = r31
            r13 = 0
            goto L_0x0039
        L_0x0197:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r14)
            java.lang.String r3 = " declares multiple JSON fields named "
            r2.append(r3)
            java.lang.String r0 = r0.f9754a
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x01b3:
            r34 = r7
            r13 = r8
            r22 = r12
            r28 = r14
            r21 = r15
            r14 = r9
            r15 = r10
            java.lang.reflect.Type r0 = r13.f13149b
            java.lang.reflect.Type r1 = r34.getGenericSuperclass()
            r2 = r34
            java.lang.reflect.Type r0 = g9.a.c(r0, r2, r1)
            x9.a r8 = new x9.a
            r8.<init>(r0)
            java.lang.Class<? super T> r7 = r8.f13148a
            r0 = r32
            r11 = r33
            r15 = r21
            r14 = r28
            r13 = 0
            goto L_0x0030
        L_0x01dc:
            r1 = r21
            r0 = r28
            r1.<init>(r0, r15)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.j.create(i2.j, x9.a):i2.z");
    }
}
