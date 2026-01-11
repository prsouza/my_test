package p9;

import g9.b;
import i2.a0;
import i2.j;
import i2.z;
import x9.a;

public final class d implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f9734a;

    public d(b bVar) {
        this.f9734a = bVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: i2.z<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: i2.z} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: p9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: p9.m} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: p9.m} */
    /* JADX WARNING: type inference failed for: r9v3, types: [i2.z<?>, i2.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i2.z<?> a(g9.b r9, i2.j r10, x9.a<?> r11, l2.a r12) {
        /*
            r8 = this;
            java.lang.Class r0 = r12.value()
            x9.a r1 = new x9.a
            r1.<init>(r0)
            g9.h r9 = r9.a(r1)
            java.lang.Object r9 = r9.a()
            boolean r0 = r9 instanceof i2.z
            if (r0 == 0) goto L_0x0018
            i2.z r9 = (i2.z) r9
            goto L_0x0074
        L_0x0018:
            boolean r0 = r9 instanceof i2.a0
            if (r0 == 0) goto L_0x0023
            i2.a0 r9 = (i2.a0) r9
            i2.z r9 = r9.create(r10, r11)
            goto L_0x0074
        L_0x0023:
            boolean r0 = r9 instanceof i2.w
            if (r0 != 0) goto L_0x005a
            boolean r1 = r9 instanceof i2.o
            if (r1 == 0) goto L_0x002c
            goto L_0x005a
        L_0x002c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Invalid attempt to bind an instance of "
            java.lang.StringBuilder r12 = a.b.q(r12)
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            r12.append(r9)
            java.lang.String r9 = " as a @JsonAdapter for "
            r12.append(r9)
            java.lang.reflect.Type r9 = r11.f13149b
            java.lang.String r9 = g9.a.i(r9)
            r12.append(r9)
            java.lang.String r9 = ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer."
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            r10.<init>(r9)
            throw r10
        L_0x005a:
            r1 = 0
            if (r0 == 0) goto L_0x0062
            r0 = r9
            i2.w r0 = (i2.w) r0
            r3 = r0
            goto L_0x0063
        L_0x0062:
            r3 = r1
        L_0x0063:
            boolean r0 = r9 instanceof i2.o
            if (r0 == 0) goto L_0x006a
            r1 = r9
            i2.o r1 = (i2.o) r1
        L_0x006a:
            r4 = r1
            p9.m r9 = new p9.m
            r7 = 0
            r2 = r9
            r5 = r10
            r6 = r11
            r2.<init>(r3, r4, r5, r6, r7)
        L_0x0074:
            if (r9 == 0) goto L_0x0080
            boolean r10 = r12.nullSafe()
            if (r10 == 0) goto L_0x0080
            i2.z r9 = r9.nullSafe()
        L_0x0080:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.d.a(g9.b, i2.j, x9.a, l2.a):i2.z");
    }

    public final <T> z<T> create(j jVar, a<T> aVar) {
        l2.a aVar2 = (l2.a) aVar.f13148a.getAnnotation(l2.a.class);
        if (aVar2 == null) {
            return null;
        }
        return a(this.f9734a, jVar, aVar, aVar2);
    }
}
