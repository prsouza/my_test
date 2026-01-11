package re;

public abstract class b<T> implements oe.b<T> {
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        if (r1 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008e, code lost:
        throw new java.lang.IllegalArgumentException(("Polymorphic value has not been read for class " + r2).toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T b(qe.b r7) {
        /*
            r6 = this;
            java.lang.String r0 = "decoder"
            e6.e.D(r7, r0)
            r0 = r6
            oe.d r0 = (oe.d) r0
            pe.b r0 = r0.f9419a
            qe.a r7 = r7.B(r0)
            r7.l()     // Catch:{ all -> 0x008f }
            r1 = 0
            r2 = r1
        L_0x0013:
            r3 = r6
            oe.d r3 = (oe.d) r3     // Catch:{ all -> 0x008f }
            pe.b r3 = r3.f9419a     // Catch:{ all -> 0x008f }
            int r3 = r7.k(r3)     // Catch:{ all -> 0x008f }
            r4 = -1
            if (r3 == r4) goto L_0x006e
            if (r3 == 0) goto L_0x0064
            r1 = 1
            if (r3 == r1) goto L_0x0048
            oe.f r1 = new oe.f     // Catch:{ all -> 0x008f }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r4.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r5 = "Invalid index in polymorphic deserialization of "
            r4.append(r5)     // Catch:{ all -> 0x008f }
            if (r2 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            java.lang.String r2 = "unknown class"
        L_0x0035:
            r4.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = "\n Expected 0, 1 or DECODE_DONE(-1), but found "
            r4.append(r2)     // Catch:{ all -> 0x008f }
            r4.append(r3)     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r4.toString()     // Catch:{ all -> 0x008f }
            r1.<init>(r2)     // Catch:{ all -> 0x008f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0048:
            if (r2 == 0) goto L_0x0058
            oe.a r1 = l6.b1.l(r6, r7, r2)     // Catch:{ all -> 0x008f }
            r4 = r6
            oe.d r4 = (oe.d) r4     // Catch:{ all -> 0x008f }
            pe.b r4 = r4.f9419a     // Catch:{ all -> 0x008f }
            java.lang.Object r1 = r7.u(r4, r3, r1)     // Catch:{ all -> 0x008f }
            goto L_0x0013
        L_0x0058:
            java.lang.String r1 = "Cannot read polymorphic value before its type token"
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008f }
            r2.<init>(r1)     // Catch:{ all -> 0x008f }
            throw r2     // Catch:{ all -> 0x008f }
        L_0x0064:
            r2 = r6
            oe.d r2 = (oe.d) r2     // Catch:{ all -> 0x008f }
            pe.b r2 = r2.f9419a     // Catch:{ all -> 0x008f }
            java.lang.String r2 = r7.h(r2, r3)     // Catch:{ all -> 0x008f }
            goto L_0x0013
        L_0x006e:
            if (r1 == 0) goto L_0x0074
            r7.j(r0)
            return r1
        L_0x0074:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x008f }
            r1.<init>()     // Catch:{ all -> 0x008f }
            java.lang.String r3 = "Polymorphic value has not been read for class "
            r1.append(r3)     // Catch:{ all -> 0x008f }
            r1.append(r2)     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008f }
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x008f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x008f }
            r2.<init>(r1)     // Catch:{ all -> 0x008f }
            throw r2     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            r7.j(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: re.b.b(qe.b):java.lang.Object");
    }

    public abstract de.b<T> c();
}
