package ki;

public abstract class b0<T> {
    /* JADX WARNING: Removed duplicated region for block: B:378:0x098f  */
    /* JADX WARNING: Removed duplicated region for block: B:557:0x0992 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> ki.b0<T> b(ki.a0 r22, java.lang.reflect.Method r23) {
        /*
            r0 = r22
            r1 = r23
            ki.y$a r2 = new ki.y$a
            r2.<init>(r0, r1)
            java.lang.annotation.Annotation[] r3 = r2.f7713c
            int r4 = r3.length
            r5 = 0
            r6 = r5
        L_0x000e:
            java.lang.String r7 = "HEAD"
            r8 = 0
            r9 = 1
            if (r6 >= r4) goto L_0x014a
            r10 = r3[r6]
            boolean r11 = r10 instanceof mi.b
            if (r11 == 0) goto L_0x0027
            mi.b r10 = (mi.b) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "DELETE"
            r2.b(r8, r7, r5)
            goto L_0x0146
        L_0x0027:
            boolean r11 = r10 instanceof mi.f
            if (r11 == 0) goto L_0x0038
            mi.f r10 = (mi.f) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "GET"
            r2.b(r8, r7, r5)
            goto L_0x0146
        L_0x0038:
            boolean r11 = r10 instanceof mi.g
            if (r11 == 0) goto L_0x0047
            mi.g r10 = (mi.g) r10
            java.lang.String r8 = r10.value()
            r2.b(r7, r8, r5)
            goto L_0x0146
        L_0x0047:
            boolean r7 = r10 instanceof mi.n
            if (r7 == 0) goto L_0x0058
            mi.n r10 = (mi.n) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PATCH"
            r2.b(r8, r7, r9)
            goto L_0x0146
        L_0x0058:
            boolean r7 = r10 instanceof mi.o
            if (r7 == 0) goto L_0x0069
            mi.o r10 = (mi.o) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "POST"
            r2.b(r8, r7, r9)
            goto L_0x0146
        L_0x0069:
            boolean r7 = r10 instanceof mi.p
            if (r7 == 0) goto L_0x007a
            mi.p r10 = (mi.p) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "PUT"
            r2.b(r8, r7, r9)
            goto L_0x0146
        L_0x007a:
            boolean r7 = r10 instanceof mi.m
            if (r7 == 0) goto L_0x008b
            mi.m r10 = (mi.m) r10
            java.lang.String r7 = r10.value()
            java.lang.String r8 = "OPTIONS"
            r2.b(r8, r7, r5)
            goto L_0x0146
        L_0x008b:
            boolean r7 = r10 instanceof mi.h
            if (r7 == 0) goto L_0x00a2
            mi.h r10 = (mi.h) r10
            java.lang.String r7 = r10.method()
            java.lang.String r8 = r10.path()
            boolean r9 = r10.hasBody()
            r2.b(r7, r8, r9)
            goto L_0x0146
        L_0x00a2:
            boolean r7 = r10 instanceof mi.k
            if (r7 == 0) goto L_0x011c
            mi.k r10 = (mi.k) r10
            java.lang.String[] r7 = r10.value()
            int r10 = r7.length
            if (r10 == 0) goto L_0x0111
            if.q$a r10 = new if.q$a
            r10.<init>()
            int r11 = r7.length
            r12 = r5
        L_0x00b6:
            if (r12 >= r11) goto L_0x010a
            r13 = r7[r12]
            r14 = 58
            int r14 = r13.indexOf(r14)
            r15 = -1
            if (r14 == r15) goto L_0x00fd
            if (r14 == 0) goto L_0x00fd
            int r15 = r13.length()
            int r15 = r15 - r9
            if (r14 == r15) goto L_0x00fd
            java.lang.String r15 = r13.substring(r5, r14)
            int r14 = r14 + 1
            java.lang.String r13 = r13.substring(r14)
            java.lang.String r13 = r13.trim()
            java.lang.String r14 = "Content-Type"
            boolean r14 = r14.equalsIgnoreCase(r15)
            if (r14 == 0) goto L_0x00f7
            if.t r14 = p002if.t.b(r13)     // Catch:{ IllegalArgumentException -> 0x00e9 }
            r2.f7728t = r14     // Catch:{ IllegalArgumentException -> 0x00e9 }
            goto L_0x00fa
        L_0x00e9:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r2 = new java.lang.Object[r9]
            r2[r5] = r13
            java.lang.String r3 = "Malformed content type: %s"
            java.lang.RuntimeException r0 = ki.e0.j(r1, r0, r3, r2)
            throw r0
        L_0x00f7:
            r10.a(r15, r13)
        L_0x00fa:
            int r12 = r12 + 1
            goto L_0x00b6
        L_0x00fd:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r5] = r13
            java.lang.String r2 = "@Headers value must be in the form \"Name: Value\". Found: \"%s\""
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r2, r1)
            throw r0
        L_0x010a:
            if.q r7 = r10.c()
            r2.f7727s = r7
            goto L_0x0146
        L_0x0111:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "@Headers annotation is empty."
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r2, r1)
            throw r0
        L_0x011c:
            boolean r7 = r10 instanceof mi.l
            java.lang.String r11 = "Only one encoding annotation is allowed."
            if (r7 == 0) goto L_0x0132
            boolean r7 = r2.f7724p
            if (r7 != 0) goto L_0x0129
            r2.f7725q = r9
            goto L_0x0146
        L_0x0129:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r11, r1)
            throw r0
        L_0x0132:
            boolean r7 = r10 instanceof mi.e
            if (r7 == 0) goto L_0x0146
            boolean r7 = r2.f7725q
            if (r7 != 0) goto L_0x013d
            r2.f7724p = r9
            goto L_0x0146
        L_0x013d:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r11, r1)
            throw r0
        L_0x0146:
            int r6 = r6 + 1
            goto L_0x000e
        L_0x014a:
            java.lang.String r3 = r2.f7722n
            if (r3 == 0) goto L_0x0b8f
            boolean r3 = r2.f7723o
            if (r3 != 0) goto L_0x0171
            boolean r3 = r2.f7725q
            if (r3 != 0) goto L_0x0166
            boolean r3 = r2.f7724p
            if (r3 != 0) goto L_0x015b
            goto L_0x0171
        L_0x015b:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r2, r1)
            throw r0
        L_0x0166:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "Multipart can only be specified on HTTP methods with request body (e.g., @POST)."
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r2, r1)
            throw r0
        L_0x0171:
            java.lang.annotation.Annotation[][] r3 = r2.f7714d
            int r3 = r3.length
            ki.v[] r4 = new ki.v[r3]
            r2.f7730v = r4
            int r4 = r3 + -1
            r6 = r5
        L_0x017b:
            if (r5 >= r3) goto L_0x09f2
            ki.v<?>[] r10 = r2.f7730v
            java.lang.reflect.Type[] r11 = r2.f7715e
            r11 = r11[r5]
            java.lang.annotation.Annotation[][] r12 = r2.f7714d
            r12 = r12[r5]
            if (r5 != r4) goto L_0x018a
            goto L_0x018b
        L_0x018a:
            r9 = r6
        L_0x018b:
            if (r12 == 0) goto L_0x09b9
            int r13 = r12.length
        L_0x018e:
            if (r6 >= r13) goto L_0x09b0
            r14 = r12[r6]
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            r16 = r3
            java.lang.Class<if.u$b> r3 = p002if.u.b.class
            r17 = r4
            boolean r4 = r14 instanceof mi.y
            r18 = r13
            java.lang.String r13 = "@Path parameters may not be used with @Url."
            if (r4 == 0) goto L_0x0240
            r2.c(r5, r11)
            boolean r3 = r2.f7721m
            if (r3 != 0) goto L_0x0234
            boolean r3 = r2.i
            if (r3 != 0) goto L_0x022a
            boolean r3 = r2.f7718j
            if (r3 != 0) goto L_0x021e
            boolean r3 = r2.f7719k
            if (r3 != 0) goto L_0x0212
            boolean r3 = r2.f7720l
            if (r3 != 0) goto L_0x0206
            java.lang.String r3 = r2.f7726r
            if (r3 != 0) goto L_0x01f5
            r3 = 1
            r2.f7721m = r3
            java.lang.Class<if.r> r3 = p002if.r.class
            if (r11 == r3) goto L_0x01ea
            if (r11 == r15) goto L_0x01ea
            java.lang.Class<java.net.URI> r3 = java.net.URI.class
            if (r11 == r3) goto L_0x01ea
            boolean r3 = r11 instanceof java.lang.Class
            if (r3 == 0) goto L_0x01de
            java.lang.String r3 = "android.net.Uri"
            r4 = r11
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.String r4 = r4.getName()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x01de
            goto L_0x01ea
        L_0x01de:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x01ea:
            ki.v$n r3 = new ki.v$n
            java.lang.reflect.Method r4 = r2.f7712b
            r3.<init>(r4, r5)
        L_0x01f1:
            r19 = r7
            goto L_0x074c
        L_0x01f5:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f7722n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "@Url cannot be used with @%s URL"
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x0206:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryMap."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0212:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @QueryName."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x021e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Url parameter must not come after a @Query."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x022a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r13, r0)
            throw r0
        L_0x0234:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Url method annotations found."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0240:
            boolean r4 = r14 instanceof mi.s
            r1 = 2
            if (r4 == 0) goto L_0x02f4
            r2.c(r5, r11)
            boolean r3 = r2.f7718j
            if (r3 != 0) goto L_0x02e8
            boolean r3 = r2.f7719k
            if (r3 != 0) goto L_0x02dc
            boolean r3 = r2.f7720l
            if (r3 != 0) goto L_0x02d0
            boolean r3 = r2.f7721m
            if (r3 != 0) goto L_0x02c6
            java.lang.String r3 = r2.f7726r
            if (r3 == 0) goto L_0x02b5
            r3 = 1
            r2.i = r3
            mi.s r14 = (mi.s) r14
            java.lang.String r3 = r14.value()
            java.util.regex.Pattern r4 = ki.y.a.f7710y
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L_0x029e
            java.util.Set<java.lang.String> r4 = r2.f7729u
            boolean r4 = r4.contains(r3)
            if (r4 == 0) goto L_0x028b
            ki.a0 r1 = r2.f7711a
            r1.f(r11, r12)
            ki.v$i r1 = new ki.v$i
            java.lang.reflect.Method r4 = r2.f7712b
            boolean r13 = r14.encoded()
            r1.<init>(r4, r5, r3, r13)
            goto L_0x0384
        L_0x028b:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f7726r
            r4 = 0
            r1[r4] = r2
            r2 = 1
            r1[r2] = r3
            java.lang.String r2 = "URL \"%s\" does not contain \"{%s}\"."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x029e:
            r0 = 1
            r4 = 0
            java.lang.reflect.Method r2 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.regex.Pattern r6 = ki.y.a.f7709x
            java.lang.String r6 = r6.pattern()
            r1[r4] = r6
            r1[r0] = r3
            java.lang.String r0 = "@Path parameter name must match %s. Found: %s"
            java.lang.RuntimeException r0 = ki.e0.k(r2, r5, r0, r1)
            throw r0
        L_0x02b5:
            r0 = 1
            r1 = 0
            java.lang.reflect.Method r3 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = r2.f7722n
            r0[r1] = r2
            java.lang.String r1 = "@Path can only be used with relative url on @%s"
            java.lang.RuntimeException r0 = ki.e0.k(r3, r5, r1, r0)
            throw r0
        L_0x02c6:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r13, r0)
            throw r0
        L_0x02d0:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryMap."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x02dc:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @QueryName."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x02e8:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "A @Path parameter must not come after a @Query."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x02f4:
            boolean r1 = r14 instanceof mi.t
            java.lang.String r4 = "<String>)"
            java.lang.String r13 = " must include generic type (e.g., "
            if (r1 == 0) goto L_0x0388
            r2.c(r5, r11)
            mi.t r14 = (mi.t) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            java.lang.Class r14 = ki.e0.f(r11)
            r15 = 1
            r2.f7718j = r15
            java.lang.Class<java.lang.Iterable> r15 = java.lang.Iterable.class
            boolean r15 = r15.isAssignableFrom(r14)
            if (r15 == 0) goto L_0x035b
            boolean r15 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r15 == 0) goto L_0x0334
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r13 = 0
            java.lang.reflect.Type r4 = ki.e0.e(r13, r4)
            ki.a0 r13 = r2.f7711a
            r13.f(r4, r12)
            ki.v$j r4 = new ki.v$j
            r4.<init>(r1, r3)
            ki.t r1 = new ki.t
            r1.<init>(r4)
            goto L_0x0384
        L_0x0334:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r14.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x035b:
            boolean r4 = r14.isArray()
            if (r4 == 0) goto L_0x0379
            java.lang.Class r4 = r14.getComponentType()
            java.lang.Class r4 = ki.y.a.a(r4)
            ki.a0 r13 = r2.f7711a
            r13.f(r4, r12)
            ki.v$j r4 = new ki.v$j
            r4.<init>(r1, r3)
            ki.u r1 = new ki.u
            r1.<init>(r4)
            goto L_0x0384
        L_0x0379:
            ki.a0 r4 = r2.f7711a
            r4.f(r11, r12)
            ki.v$j r4 = new ki.v$j
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0384:
            r19 = r7
            goto L_0x0617
        L_0x0388:
            boolean r1 = r14 instanceof mi.v
            if (r1 == 0) goto L_0x0412
            r2.c(r5, r11)
            mi.v r14 = (mi.v) r14
            boolean r1 = r14.encoded()
            java.lang.Class r3 = ki.e0.f(r11)
            r14 = 1
            r2.f7719k = r14
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r3)
            if (r14 == 0) goto L_0x03e7
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x03c0
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = ki.e0.e(r4, r3)
            ki.a0 r4 = r2.f7711a
            r4.f(r3, r12)
            ki.v$l r3 = new ki.v$l
            r3.<init>(r1)
            ki.t r1 = new ki.t
            r1.<init>(r3)
            goto L_0x0384
        L_0x03c0:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x03e7:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x0406
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = ki.y.a.a(r3)
            ki.a0 r4 = r2.f7711a
            r4.f(r3, r12)
            ki.v$l r3 = new ki.v$l
            r3.<init>(r1)
            ki.u r1 = new ki.u
            r1.<init>(r3)
            goto L_0x0384
        L_0x0406:
            ki.a0 r3 = r2.f7711a
            r3.f(r11, r12)
            ki.v$l r3 = new ki.v$l
            r3.<init>(r1)
            goto L_0x01f1
        L_0x0412:
            boolean r1 = r14 instanceof mi.u
            r19 = r7
            java.lang.String r7 = "Map must include generic types (e.g., Map<String, String>)"
            if (r1 == 0) goto L_0x0488
            r2.c(r5, r11)
            java.lang.Class r1 = ki.e0.f(r11)
            r3 = 1
            r2.f7720l = r3
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            boolean r4 = r4.isAssignableFrom(r1)
            if (r4 == 0) goto L_0x047c
            java.lang.Class<java.util.Map> r4 = java.util.Map.class
            java.lang.reflect.Type r1 = ki.e0.g(r11, r1, r4)
            boolean r4 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L_0x0472
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r4 = ki.e0.e(r4, r1)
            if (r15 != r4) goto L_0x0457
            java.lang.reflect.Type r1 = ki.e0.e(r3, r1)
            ki.a0 r3 = r2.f7711a
            r3.f(r1, r12)
            ki.v$k r1 = new ki.v$k
            java.lang.reflect.Method r3 = r2.f7712b
            mi.u r14 = (mi.u) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x0617
        L_0x0457:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@QueryMap keys must be of type String: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x0472:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r7, r0)
            throw r0
        L_0x047c:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@QueryMap parameter type must be Map."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0488:
            boolean r1 = r14 instanceof mi.i
            if (r1 == 0) goto L_0x0510
            r2.c(r5, r11)
            mi.i r14 = (mi.i) r14
            java.lang.String r1 = r14.value()
            java.lang.Class r3 = ki.e0.f(r11)
            java.lang.Class<java.lang.Iterable> r7 = java.lang.Iterable.class
            boolean r7 = r7.isAssignableFrom(r3)
            if (r7 == 0) goto L_0x04e5
            boolean r7 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r7 == 0) goto L_0x04be
            r3 = r11
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            r4 = 0
            java.lang.reflect.Type r3 = ki.e0.e(r4, r3)
            ki.a0 r4 = r2.f7711a
            r4.f(r3, r12)
            ki.v$d r3 = new ki.v$d
            r3.<init>(r1)
            ki.t r1 = new ki.t
            r1.<init>(r3)
            goto L_0x0617
        L_0x04be:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r3.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x04e5:
            boolean r4 = r3.isArray()
            if (r4 == 0) goto L_0x0504
            java.lang.Class r3 = r3.getComponentType()
            java.lang.Class r3 = ki.y.a.a(r3)
            ki.a0 r4 = r2.f7711a
            r4.f(r3, r12)
            ki.v$d r3 = new ki.v$d
            r3.<init>(r1)
            ki.u r1 = new ki.u
            r1.<init>(r3)
            goto L_0x0617
        L_0x0504:
            ki.a0 r3 = r2.f7711a
            r3.f(r11, r12)
            ki.v$d r3 = new ki.v$d
            r3.<init>(r1)
            goto L_0x074c
        L_0x0510:
            boolean r1 = r14 instanceof mi.j
            if (r1 == 0) goto L_0x0587
            java.lang.Class<if.q> r1 = p002if.q.class
            if (r11 != r1) goto L_0x0521
            ki.v$f r1 = new ki.v$f
            java.lang.reflect.Method r3 = r2.f7712b
            r1.<init>(r3, r5)
            goto L_0x0617
        L_0x0521:
            r2.c(r5, r11)
            java.lang.Class r1 = ki.e0.f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x057b
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = ki.e0.g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0571
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = ki.e0.e(r3, r1)
            if (r15 != r3) goto L_0x0556
            r3 = 1
            java.lang.reflect.Type r1 = ki.e0.e(r3, r1)
            ki.a0 r3 = r2.f7711a
            r3.f(r1, r12)
            ki.v$e r1 = new ki.v$e
            java.lang.reflect.Method r3 = r2.f7712b
            r1.<init>(r3, r5)
            goto L_0x0617
        L_0x0556:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@HeaderMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x0571:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r7, r0)
            throw r0
        L_0x057b:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@HeaderMap parameter type must be Map."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0587:
            boolean r1 = r14 instanceof mi.c
            if (r1 == 0) goto L_0x0626
            r2.c(r5, r11)
            boolean r1 = r2.f7724p
            if (r1 == 0) goto L_0x061a
            mi.c r14 = (mi.c) r14
            java.lang.String r1 = r14.value()
            boolean r3 = r14.encoded()
            r7 = 1
            r2.f7716f = r7
            java.lang.Class r7 = ki.e0.f(r11)
            java.lang.Class<java.lang.Iterable> r14 = java.lang.Iterable.class
            boolean r14 = r14.isAssignableFrom(r7)
            if (r14 == 0) goto L_0x05ee
            boolean r14 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L_0x05c7
            r4 = r11
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            r7 = 0
            java.lang.reflect.Type r4 = ki.e0.e(r7, r4)
            ki.a0 r7 = r2.f7711a
            r7.f(r4, r12)
            ki.v$b r4 = new ki.v$b
            r4.<init>(r1, r3)
            ki.t r1 = new ki.t
            r1.<init>(r4)
            goto L_0x0617
        L_0x05c7:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x05ee:
            boolean r4 = r7.isArray()
            if (r4 == 0) goto L_0x060c
            java.lang.Class r4 = r7.getComponentType()
            java.lang.Class r4 = ki.y.a.a(r4)
            ki.a0 r7 = r2.f7711a
            r7.f(r4, r12)
            ki.v$b r4 = new ki.v$b
            r4.<init>(r1, r3)
            ki.u r1 = new ki.u
            r1.<init>(r4)
            goto L_0x0617
        L_0x060c:
            ki.a0 r4 = r2.f7711a
            r4.f(r11, r12)
            ki.v$b r4 = new ki.v$b
            r4.<init>(r1, r3)
            r1 = r4
        L_0x0617:
            r3 = r1
            goto L_0x074c
        L_0x061a:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@Field parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x0626:
            boolean r1 = r14 instanceof mi.d
            if (r1 == 0) goto L_0x06a7
            r2.c(r5, r11)
            boolean r1 = r2.f7724p
            if (r1 == 0) goto L_0x069b
            java.lang.Class r1 = ki.e0.f(r11)
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 == 0) goto L_0x068f
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            java.lang.reflect.Type r1 = ki.e0.g(r11, r1, r3)
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x0685
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r3 = 0
            java.lang.reflect.Type r3 = ki.e0.e(r3, r1)
            if (r15 != r3) goto L_0x066a
            r3 = 1
            java.lang.reflect.Type r1 = ki.e0.e(r3, r1)
            ki.a0 r4 = r2.f7711a
            r4.f(r1, r12)
            r2.f7716f = r3
            ki.v$c r1 = new ki.v$c
            java.lang.reflect.Method r3 = r2.f7712b
            mi.d r14 = (mi.d) r14
            boolean r4 = r14.encoded()
            r1.<init>(r3, r5, r4)
            goto L_0x0617
        L_0x066a:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@FieldMap keys must be of type String: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x0685:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r7, r0)
            throw r0
        L_0x068f:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameter type must be Map."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x069b:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@FieldMap parameters can only be used with form encoding."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x06a7:
            boolean r1 = r14 instanceof mi.q
            if (r1 == 0) goto L_0x0849
            r2.c(r5, r11)
            boolean r1 = r2.f7725q
            if (r1 == 0) goto L_0x083d
            mi.q r14 = (mi.q) r14
            r1 = 1
            r2.g = r1
            java.lang.String r1 = r14.value()
            java.lang.Class r7 = ki.e0.f(r11)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x0759
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r14 = "@Part annotation must supply a name or use MultipartBody.Part parameter type."
            if (r1 == 0) goto L_0x071d
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x06f6
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = ki.e0.e(r4, r1)
            java.lang.Class r1 = ki.e0.f(r1)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x06ed
            ki.v$m r1 = ki.v.m.f7679a
            ki.t r3 = new ki.t
            r3.<init>(r1)
            goto L_0x074c
        L_0x06ed:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r14, r1)
            throw r0
        L_0x06f6:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x071d:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x0741
            java.lang.Class r1 = r7.getComponentType()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 == 0) goto L_0x0737
            ki.v$m r1 = ki.v.m.f7679a
            ki.u r3 = new ki.u
            r3.<init>(r1)
            r1 = r3
            goto L_0x0617
        L_0x0737:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r14, r1)
            throw r0
        L_0x0741:
            r1 = 0
            boolean r3 = r3.isAssignableFrom(r7)
            if (r3 == 0) goto L_0x0750
            ki.v$m r1 = ki.v.m.f7679a
            goto L_0x0617
        L_0x074c:
            r20 = r10
            goto L_0x098c
        L_0x0750:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r14, r1)
            throw r0
        L_0x0759:
            r15 = 4
            java.lang.String[] r15 = new java.lang.String[r15]
            java.lang.String r20 = "Content-Disposition"
            r21 = 0
            r15[r21] = r20
            java.lang.String r0 = "form-data; name=\""
            r20 = r10
            java.lang.String r10 = "\""
            java.lang.String r0 = androidx.fragment.app.o.c(r0, r1, r10)
            r1 = 1
            r15[r1] = r0
            java.lang.String r0 = "Content-Transfer-Encoding"
            r1 = 2
            r15[r1] = r0
            r0 = 3
            java.lang.String r1 = r14.encoding()
            r15[r0] = r1
            if.q$b r0 = p002if.q.f6559b
            if.q r0 = r0.c(r15)
            java.lang.Class<java.lang.Iterable> r1 = java.lang.Iterable.class
            boolean r1 = r1.isAssignableFrom(r7)
            java.lang.String r10 = "@Part parameters using the MultipartBody.Part must not include a part name in the annotation."
            if (r1 == 0) goto L_0x07e7
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x07c0
            r1 = r11
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            r4 = 0
            java.lang.reflect.Type r1 = ki.e0.e(r4, r1)
            java.lang.Class r4 = ki.e0.f(r1)
            boolean r3 = r3.isAssignableFrom(r4)
            if (r3 != 0) goto L_0x07b6
            ki.a0 r3 = r2.f7711a
            java.lang.annotation.Annotation[] r4 = r2.f7713c
            ki.f r1 = r3.d(r1, r12, r4)
            ki.v$g r3 = new ki.v$g
            java.lang.reflect.Method r4 = r2.f7712b
            r3.<init>(r4, r5, r0, r1)
            ki.t r0 = new ki.t
            r0.<init>(r3)
            goto L_0x080f
        L_0x07b6:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r10, r1)
            throw r0
        L_0x07c0:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r13)
            java.lang.String r2 = r7.getSimpleName()
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r1, r2)
            throw r0
        L_0x07e7:
            boolean r1 = r7.isArray()
            if (r1 == 0) goto L_0x081c
            java.lang.Class r1 = r7.getComponentType()
            java.lang.Class r1 = ki.y.a.a(r1)
            boolean r3 = r3.isAssignableFrom(r1)
            if (r3 != 0) goto L_0x0812
            ki.a0 r3 = r2.f7711a
            java.lang.annotation.Annotation[] r4 = r2.f7713c
            ki.f r1 = r3.d(r1, r12, r4)
            ki.v$g r3 = new ki.v$g
            java.lang.reflect.Method r4 = r2.f7712b
            r3.<init>(r4, r5, r0, r1)
            ki.u r0 = new ki.u
            r0.<init>(r3)
        L_0x080f:
            r3 = r0
            goto L_0x098c
        L_0x0812:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r10, r1)
            throw r0
        L_0x081c:
            boolean r1 = r3.isAssignableFrom(r7)
            if (r1 != 0) goto L_0x0833
            ki.a0 r1 = r2.f7711a
            java.lang.annotation.Annotation[] r3 = r2.f7713c
            ki.f r1 = r1.d(r11, r12, r3)
            ki.v$g r3 = new ki.v$g
            java.lang.reflect.Method r4 = r2.f7712b
            r3.<init>(r4, r5, r0, r1)
            goto L_0x098c
        L_0x0833:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r10, r1)
            throw r0
        L_0x083d:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Part parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0849:
            r20 = r10
            boolean r0 = r14 instanceof mi.r
            if (r0 == 0) goto L_0x08e7
            r2.c(r5, r11)
            boolean r0 = r2.f7725q
            if (r0 == 0) goto L_0x08db
            r0 = 1
            r2.g = r0
            java.lang.Class r0 = ki.e0.f(r11)
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L_0x08cf
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            java.lang.reflect.Type r0 = ki.e0.g(r11, r0, r1)
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L_0x08c5
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r1 = 0
            java.lang.reflect.Type r1 = ki.e0.e(r1, r0)
            if (r15 != r1) goto L_0x08aa
            r1 = 1
            java.lang.reflect.Type r0 = ki.e0.e(r1, r0)
            java.lang.Class r1 = ki.e0.f(r0)
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x089e
            ki.a0 r1 = r2.f7711a
            java.lang.annotation.Annotation[] r3 = r2.f7713c
            ki.f r0 = r1.d(r0, r12, r3)
            mi.r r14 = (mi.r) r14
            ki.v$h r3 = new ki.v$h
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.String r4 = r14.encoding()
            r3.<init>(r1, r5, r0, r4)
            goto L_0x098c
        L_0x089e:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x08aa:
            r0 = 0
            java.lang.reflect.Method r2 = r2.f7712b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "@PartMap keys must be of type String: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r2, r5, r1, r0)
            throw r0
        L_0x08c5:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r7, r0)
            throw r0
        L_0x08cf:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameter type must be Map."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x08db:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@PartMap parameters can only be used with multipart encoding."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x08e7:
            boolean r0 = r14 instanceof mi.a
            if (r0 == 0) goto L_0x0936
            r2.c(r5, r11)
            boolean r0 = r2.f7724p
            if (r0 != 0) goto L_0x092a
            boolean r0 = r2.f7725q
            if (r0 != 0) goto L_0x092a
            boolean r0 = r2.f7717h
            if (r0 != 0) goto L_0x091e
            ki.a0 r0 = r2.f7711a     // Catch:{ RuntimeException -> 0x090e }
            java.lang.annotation.Annotation[] r1 = r2.f7713c     // Catch:{ RuntimeException -> 0x090e }
            ki.f r0 = r0.d(r11, r12, r1)     // Catch:{ RuntimeException -> 0x090e }
            r1 = 1
            r2.f7717h = r1
            ki.v$a r3 = new ki.v$a
            java.lang.reflect.Method r1 = r2.f7712b
            r3.<init>(r1, r5, r0)
            goto L_0x098c
        L_0x090e:
            r0 = move-exception
            java.lang.reflect.Method r1 = r2.f7712b
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r11
            java.lang.String r3 = "Unable to create @Body converter for %s"
            java.lang.RuntimeException r0 = ki.e0.l(r1, r0, r5, r3, r2)
            throw r0
        L_0x091e:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Multiple @Body method annotations found."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x092a:
            r0 = 0
            java.lang.reflect.Method r1 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "@Body parameters cannot be used with form or multi-part encoding."
            java.lang.RuntimeException r0 = ki.e0.k(r1, r5, r2, r0)
            throw r0
        L_0x0936:
            boolean r0 = r14 instanceof mi.x
            if (r0 == 0) goto L_0x098b
            r2.c(r5, r11)
            java.lang.Class r0 = ki.e0.f(r11)
            int r1 = r5 + -1
        L_0x0943:
            if (r1 < 0) goto L_0x0985
            ki.v<?>[] r3 = r2.f7730v
            r3 = r3[r1]
            boolean r4 = r3 instanceof ki.v.o
            if (r4 == 0) goto L_0x0982
            ki.v$o r3 = (ki.v.o) r3
            java.lang.Class<T> r3 = r3.f7682a
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x0958
            goto L_0x0982
        L_0x0958:
            java.lang.reflect.Method r2 = r2.f7712b
            java.lang.String r3 = "@Tag type "
            java.lang.StringBuilder r3 = a.a.d(r3)
            java.lang.String r0 = r0.getName()
            r3.append(r0)
            java.lang.String r0 = " is duplicate of parameter #"
            r3.append(r0)
            int r1 = r1 + 1
            r3.append(r1)
            java.lang.String r0 = " and would always overwrite its value."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.RuntimeException r0 = ki.e0.k(r2, r5, r0, r1)
            throw r0
        L_0x0982:
            int r1 = r1 + -1
            goto L_0x0943
        L_0x0985:
            ki.v$o r3 = new ki.v$o
            r3.<init>(r0)
            goto L_0x098c
        L_0x098b:
            r3 = 0
        L_0x098c:
            if (r3 != 0) goto L_0x098f
            goto L_0x0992
        L_0x098f:
            if (r8 != 0) goto L_0x09a4
            r8 = r3
        L_0x0992:
            int r6 = r6 + 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r13 = r18
            r7 = r19
            r10 = r20
            goto L_0x018e
        L_0x09a4:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Multiple Retrofit annotations found, only one allowed."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x09b0:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            goto L_0x09c2
        L_0x09b9:
            r16 = r3
            r17 = r4
            r19 = r7
            r20 = r10
            r8 = 0
        L_0x09c2:
            if (r8 != 0) goto L_0x09df
            if (r9 == 0) goto L_0x09d3
            java.lang.Class r0 = ki.e0.f(r11)     // Catch:{ NoClassDefFoundError -> 0x09d3 }
            java.lang.Class<pd.d> r1 = pd.d.class
            if (r0 != r1) goto L_0x09d3
            r0 = 1
            r2.f7731w = r0     // Catch:{ NoClassDefFoundError -> 0x09d3 }
            r8 = 0
            goto L_0x09df
        L_0x09d3:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "No Retrofit annotation found."
            java.lang.RuntimeException r0 = ki.e0.k(r0, r5, r2, r1)
            throw r0
        L_0x09df:
            r20[r5] = r8
            int r5 = r5 + 1
            r6 = 0
            r8 = 0
            r9 = 1
            r0 = r22
            r1 = r23
            r3 = r16
            r4 = r17
            r7 = r19
            goto L_0x017b
        L_0x09f2:
            r19 = r7
            java.lang.String r0 = r2.f7726r
            if (r0 != 0) goto L_0x0a0f
            boolean r0 = r2.f7721m
            if (r0 == 0) goto L_0x09fd
            goto L_0x0a0f
        L_0x09fd:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r2.f7722n
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = "Missing either @%s URL or @Url parameter."
            r3 = 0
            java.lang.RuntimeException r0 = ki.e0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a0f:
            boolean r0 = r2.f7724p
            if (r0 != 0) goto L_0x0a2d
            boolean r1 = r2.f7725q
            if (r1 != 0) goto L_0x0a2d
            boolean r1 = r2.f7723o
            if (r1 != 0) goto L_0x0a2d
            boolean r1 = r2.f7717h
            if (r1 != 0) goto L_0x0a20
            goto L_0x0a2d
        L_0x0a20:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Non-body HTTP method cannot contain @Body."
            r3 = 0
            java.lang.RuntimeException r0 = ki.e0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a2d:
            if (r0 == 0) goto L_0x0a41
            boolean r0 = r2.f7716f
            if (r0 == 0) goto L_0x0a34
            goto L_0x0a41
        L_0x0a34:
            java.lang.reflect.Method r0 = r2.f7712b
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = "Form-encoded method must contain at least one @Field."
            r3 = 0
            java.lang.RuntimeException r0 = ki.e0.j(r0, r3, r2, r1)
            throw r0
        L_0x0a41:
            r0 = 0
            r1 = 0
            boolean r3 = r2.f7725q
            if (r3 == 0) goto L_0x0a57
            boolean r3 = r2.g
            if (r3 == 0) goto L_0x0a4c
            goto L_0x0a57
        L_0x0a4c:
            java.lang.reflect.Method r2 = r2.f7712b
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r3 = "Multipart method must contain at least one @Part."
            java.lang.RuntimeException r0 = ki.e0.j(r2, r1, r3, r0)
            throw r0
        L_0x0a57:
            ki.y r0 = new ki.y
            r0.<init>(r2)
            java.lang.reflect.Type r1 = r23.getGenericReturnType()
            boolean r2 = ki.e0.h(r1)
            if (r2 != 0) goto L_0x0b7f
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L_0x0b72
            java.lang.Class<ki.z> r1 = ki.z.class
            boolean r2 = r0.f7708k
            java.lang.annotation.Annotation[] r3 = r23.getAnnotations()
            if (r2 == 0) goto L_0x0ac9
            java.lang.reflect.Type[] r4 = r23.getGenericParameterTypes()
            int r5 = r4.length
            int r5 = r5 + -1
            r4 = r4[r5]
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r5 = 0
            r4 = r4[r5]
            boolean r6 = r4 instanceof java.lang.reflect.WildcardType
            if (r6 == 0) goto L_0x0a92
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getLowerBounds()
            r4 = r4[r5]
        L_0x0a92:
            java.lang.Class r6 = ki.e0.f(r4)
            if (r6 != r1) goto L_0x0aa4
            boolean r6 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r6 == 0) goto L_0x0aa4
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type r4 = ki.e0.e(r5, r4)
            r6 = 1
            goto L_0x0aa5
        L_0x0aa4:
            r6 = r5
        L_0x0aa5:
            ki.e0$b r7 = new ki.e0$b
            java.lang.Class<ki.b> r8 = ki.b.class
            r9 = 1
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r9]
            r10[r5] = r4
            r4 = 0
            r7.<init>(r4, r8, r10)
            java.lang.Class<ki.c0> r4 = ki.c0.class
            boolean r4 = ki.e0.i(r3, r4)
            if (r4 == 0) goto L_0x0abb
            goto L_0x0ace
        L_0x0abb:
            int r4 = r3.length
            int r4 = r4 + r9
            java.lang.annotation.Annotation[] r4 = new java.lang.annotation.Annotation[r4]
            ki.d0 r8 = ki.d0.f7582a
            r4[r5] = r8
            int r8 = r3.length
            java.lang.System.arraycopy(r3, r5, r4, r9, r8)
            r3 = r4
            goto L_0x0ace
        L_0x0ac9:
            java.lang.reflect.Type r7 = r23.getGenericReturnType()
            r6 = 0
        L_0x0ace:
            r4 = r22
            ki.c r3 = r4.a(r7, r3)     // Catch:{ RuntimeException -> 0x0b61 }
            java.lang.reflect.Type r5 = r3.a()
            java.lang.Class<if.a0> r7 = p002if.a0.class
            if (r5 == r7) goto L_0x0b3c
            if (r5 == r1) goto L_0x0b2f
            java.lang.String r1 = r0.f7702c
            r7 = r19
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0afe
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0af1
            goto L_0x0afe
        L_0x0af1:
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "HEAD method must use Void as response type."
            r2 = 0
            r8 = r23
            java.lang.RuntimeException r0 = ki.e0.j(r8, r2, r1, r0)
            throw r0
        L_0x0afe:
            r8 = r23
            java.lang.annotation.Annotation[] r1 = r23.getAnnotations()
            ki.f r1 = r4.e(r5, r1)     // Catch:{ RuntimeException -> 0x0b20 }
            if.d$a r4 = r4.f7568b
            if (r2 != 0) goto L_0x0b12
            ki.k$a r2 = new ki.k$a
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b1f
        L_0x0b12:
            if (r6 == 0) goto L_0x0b1a
            ki.k$c r2 = new ki.k$c
            r2.<init>(r0, r4, r1, r3)
            goto L_0x0b1f
        L_0x0b1a:
            ki.k$b r2 = new ki.k$b
            r2.<init>(r0, r4, r1, r3)
        L_0x0b1f:
            return r2
        L_0x0b20:
            r0 = move-exception
            r1 = r0
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r2 = 0
            r0[r2] = r5
            java.lang.String r2 = "Unable to create converter for %s"
            java.lang.RuntimeException r0 = ki.e0.j(r8, r1, r2, r0)
            throw r0
        L_0x0b2f:
            r8 = r23
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Response must include generic type (e.g., Response<String>)"
            r2 = 0
            java.lang.RuntimeException r0 = ki.e0.j(r8, r2, r1, r0)
            throw r0
        L_0x0b3c:
            r8 = r23
            java.lang.String r0 = "'"
            java.lang.StringBuilder r0 = a.a.d(r0)
            java.lang.Class r1 = ki.e0.f(r5)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "' is not a valid response body type. Did you mean ResponseBody?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.RuntimeException r0 = ki.e0.j(r8, r2, r0, r1)
            throw r0
        L_0x0b61:
            r0 = move-exception
            r8 = r23
            r1 = r0
            r0 = 0
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r0 = "Unable to create call adapter for %s"
            java.lang.RuntimeException r0 = ki.e0.j(r8, r1, r0, r2)
            throw r0
        L_0x0b72:
            r8 = r23
            r0 = 0
            r1 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "Service methods cannot return void."
            java.lang.RuntimeException r0 = ki.e0.j(r8, r1, r2, r0)
            throw r0
        L_0x0b7f:
            r8 = r23
            r0 = 1
            r2 = 0
            r3 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r1
            java.lang.String r1 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r0 = ki.e0.j(r8, r3, r1, r0)
            throw r0
        L_0x0b8f:
            java.lang.reflect.Method r0 = r2.f7712b
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.String r2 = "HTTP method annotation is required (e.g., @GET, @POST, etc.)."
            java.lang.RuntimeException r0 = ki.e0.j(r0, r8, r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ki.b0.b(ki.a0, java.lang.reflect.Method):ki.b0");
    }

    public abstract T a(Object[] objArr);
}
