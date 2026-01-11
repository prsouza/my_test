package sd;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f11100a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: sd.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<sd.a> r0 = sd.a.class
            java.lang.String r1 = "java.specification.version"
            java.lang.String r1 = java.lang.System.getProperty(r1)
            r2 = 65536(0x10000, float:9.18355E-41)
            if (r1 != 0) goto L_0x000d
            goto L_0x0045
        L_0x000d:
            r3 = 6
            r4 = 46
            r5 = 0
            int r3 = fe.o.l1(r1, r4, r5, r5, r3)
            if (r3 >= 0) goto L_0x001d
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0045 }
            int r1 = r1 * r2
            goto L_0x0048
        L_0x001d:
            int r6 = r3 + 1
            r7 = 4
            int r4 = fe.o.l1(r1, r4, r6, r5, r7)
            if (r4 >= 0) goto L_0x002a
            int r4 = r1.length()
        L_0x002a:
            java.lang.String r3 = r1.substring(r5, r3)
            java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
            e6.e.C(r3, r5)
            java.lang.String r1 = r1.substring(r6, r4)
            e6.e.C(r1, r5)
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0045 }
            int r3 = r3 * r2
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0045 }
            int r1 = r1 + r3
            goto L_0x0048
        L_0x0045:
            r1 = 65542(0x10006, float:9.1844E-41)
        L_0x0048:
            r3 = 65544(0x10008, float:9.1847E-41)
            java.lang.String r4 = ", base type classloader: "
            java.lang.String r5 = "Instance class was loaded from a different classloader: "
            java.lang.String r6 = "forName(\"kotlin.internal…entations\").newInstance()"
            if (r1 >= r3) goto L_0x0055
            if (r1 >= r2) goto L_0x00d1
        L_0x0055:
            java.lang.Class<ud.a> r3 = ud.a.class
            java.lang.Object r3 = r3.newInstance()     // Catch:{ ClassNotFoundException -> 0x0091 }
            e6.e.C(r3, r6)     // Catch:{ ClassNotFoundException -> 0x0091 }
            sd.a r3 = (sd.a) r3     // Catch:{ ClassCastException -> 0x0062 }
            goto L_0x0159
        L_0x0062:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0091 }
            boolean r9 = e6.e.r(r3, r8)     // Catch:{ ClassNotFoundException -> 0x0091 }
            if (r9 != 0) goto L_0x0090
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0091 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x0091 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x0091 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x0091 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x0091 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x0091 }
            java.lang.String r3 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x0091 }
            r9.<init>(r3, r7)     // Catch:{ ClassNotFoundException -> 0x0091 }
            throw r9     // Catch:{ ClassNotFoundException -> 0x0091 }
        L_0x0090:
            throw r7     // Catch:{ ClassNotFoundException -> 0x0091 }
        L_0x0091:
            java.lang.String r3 = "kotlin.internal.JRE8PlatformImplementations"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            e6.e.C(r3, r6)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            sd.a r3 = (sd.a) r3     // Catch:{ ClassCastException -> 0x00a2 }
            goto L_0x0159
        L_0x00a2:
            r7 = move-exception
            java.lang.Class r3 = r3.getClass()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            java.lang.ClassLoader r8 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            boolean r9 = e6.e.r(r3, r8)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            if (r9 != 0) goto L_0x00d0
            java.lang.ClassNotFoundException r9 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x00d1 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r10.<init>()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r10.append(r5)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r10.append(r3)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r10.append(r4)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r10.append(r8)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            java.lang.String r3 = r10.toString()     // Catch:{ ClassNotFoundException -> 0x00d1 }
            r9.<init>(r3, r7)     // Catch:{ ClassNotFoundException -> 0x00d1 }
            throw r9     // Catch:{ ClassNotFoundException -> 0x00d1 }
        L_0x00d0:
            throw r7     // Catch:{ ClassNotFoundException -> 0x00d1 }
        L_0x00d1:
            r3 = 65543(0x10007, float:9.1845E-41)
            if (r1 >= r3) goto L_0x00d8
            if (r1 >= r2) goto L_0x0154
        L_0x00d8:
            java.lang.Class<td.a> r1 = td.a.class
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0114 }
            e6.e.C(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0114 }
            r3 = r1
            sd.a r3 = (sd.a) r3     // Catch:{ ClassCastException -> 0x00e5 }
            goto L_0x0159
        L_0x00e5:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0114 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0114 }
            java.lang.ClassLoader r3 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0114 }
            boolean r7 = e6.e.r(r1, r3)     // Catch:{ ClassNotFoundException -> 0x0114 }
            if (r7 != 0) goto L_0x0113
            java.lang.ClassNotFoundException r7 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0114 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0114 }
            r8.<init>()     // Catch:{ ClassNotFoundException -> 0x0114 }
            r8.append(r5)     // Catch:{ ClassNotFoundException -> 0x0114 }
            r8.append(r1)     // Catch:{ ClassNotFoundException -> 0x0114 }
            r8.append(r4)     // Catch:{ ClassNotFoundException -> 0x0114 }
            r8.append(r3)     // Catch:{ ClassNotFoundException -> 0x0114 }
            java.lang.String r1 = r8.toString()     // Catch:{ ClassNotFoundException -> 0x0114 }
            r7.<init>(r1, r2)     // Catch:{ ClassNotFoundException -> 0x0114 }
            throw r7     // Catch:{ ClassNotFoundException -> 0x0114 }
        L_0x0113:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0114 }
        L_0x0114:
            java.lang.String r1 = "kotlin.internal.JRE7PlatformImplementations"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException -> 0x0154 }
            java.lang.Object r1 = r1.newInstance()     // Catch:{ ClassNotFoundException -> 0x0154 }
            e6.e.C(r1, r6)     // Catch:{ ClassNotFoundException -> 0x0154 }
            r3 = r1
            sd.a r3 = (sd.a) r3     // Catch:{ ClassCastException -> 0x0125 }
            goto L_0x0159
        L_0x0125:
            r2 = move-exception
            java.lang.Class r1 = r1.getClass()     // Catch:{ ClassNotFoundException -> 0x0154 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0154 }
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x0154 }
            boolean r3 = e6.e.r(r1, r0)     // Catch:{ ClassNotFoundException -> 0x0154 }
            if (r3 != 0) goto L_0x0153
            java.lang.ClassNotFoundException r3 = new java.lang.ClassNotFoundException     // Catch:{ ClassNotFoundException -> 0x0154 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ ClassNotFoundException -> 0x0154 }
            r6.<init>()     // Catch:{ ClassNotFoundException -> 0x0154 }
            r6.append(r5)     // Catch:{ ClassNotFoundException -> 0x0154 }
            r6.append(r1)     // Catch:{ ClassNotFoundException -> 0x0154 }
            r6.append(r4)     // Catch:{ ClassNotFoundException -> 0x0154 }
            r6.append(r0)     // Catch:{ ClassNotFoundException -> 0x0154 }
            java.lang.String r0 = r6.toString()     // Catch:{ ClassNotFoundException -> 0x0154 }
            r3.<init>(r0, r2)     // Catch:{ ClassNotFoundException -> 0x0154 }
            throw r3     // Catch:{ ClassNotFoundException -> 0x0154 }
        L_0x0153:
            throw r2     // Catch:{ ClassNotFoundException -> 0x0154 }
        L_0x0154:
            sd.a r3 = new sd.a
            r3.<init>()
        L_0x0159:
            f11100a = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sd.b.<clinit>():void");
    }
}
