package i7;

public final class w implements p0 {

    /* renamed from: a  reason: collision with root package name */
    public static final w f6387a = new w();

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Class<?>, java.lang.Class] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i7.o0 a(java.lang.Class<?> r4) {
        /*
            r3 = this;
            java.lang.Class<i7.x> r0 = i7.x.class
            boolean r1 = r0.isAssignableFrom(r4)
            if (r1 == 0) goto L_0x002a
            java.lang.Class r0 = r4.asSubclass(r0)     // Catch:{ Exception -> 0x0019 }
            i7.x r0 = i7.x.p(r0)     // Catch:{ Exception -> 0x0019 }
            i7.x$f r1 = i7.x.f.BUILD_MESSAGE_INFO     // Catch:{ Exception -> 0x0019 }
            java.lang.Object r0 = r0.o(r1)     // Catch:{ Exception -> 0x0019 }
            i7.o0 r0 = (i7.o0) r0     // Catch:{ Exception -> 0x0019 }
            return r0
        L_0x0019:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Unable to get message info for "
            java.lang.StringBuilder r2 = a.a.d(r2)
            java.lang.String r4 = androidx.activity.result.d.a(r4, r2)
            r1.<init>(r4, r0)
            throw r1
        L_0x002a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported message type: "
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r4 = androidx.activity.result.d.a(r4, r1)
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.w.a(java.lang.Class):i7.o0");
    }

    public final boolean b(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }
}
