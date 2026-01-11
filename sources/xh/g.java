package xh;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal f13294a = new ThreadLocal();

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r1) {
        /*
            xh.e r0 = new xh.e     // Catch:{ AccessControlException -> 0x0034 }
            r0.<init>(r1)     // Catch:{ AccessControlException -> 0x0034 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ AccessControlException -> 0x0034 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x0034 }
            if (r0 == 0) goto L_0x000e
            goto L_0x002d
        L_0x000e:
            java.lang.ThreadLocal r0 = f13294a     // Catch:{ AccessControlException -> 0x0034 }
            java.lang.Object r0 = r0.get()     // Catch:{ AccessControlException -> 0x0034 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ AccessControlException -> 0x0034 }
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = r0.get(r1)     // Catch:{ AccessControlException -> 0x0034 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x0034 }
            if (r0 == 0) goto L_0x0021
            goto L_0x002d
        L_0x0021:
            xh.f r0 = new xh.f     // Catch:{ AccessControlException -> 0x0034 }
            r0.<init>(r1)     // Catch:{ AccessControlException -> 0x0034 }
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r0)     // Catch:{ AccessControlException -> 0x0034 }
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ AccessControlException -> 0x0034 }
        L_0x002d:
            java.lang.String r1 = "true"
            boolean r1 = r1.equalsIgnoreCase(r0)     // Catch:{ AccessControlException -> 0x0034 }
            return r1
        L_0x0034:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: xh.g.a(java.lang.String):boolean");
    }
}
