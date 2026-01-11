package le;

import ge.n1;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public static final n1 f8259a;

    /* JADX WARNING: Can't wrap try/catch for region: R(2:18|19) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.hintOnError();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0050 */
    static {
        /*
            java.lang.String r0 = "kotlinx.coroutines.fast.service.loader"
            r1 = 1
            y.c.o0(r0, r1)
            java.util.Iterator r0 = androidx.activity.result.d.e()     // Catch:{ all -> 0x0060 }
            ee.d r0 = ee.j.i1(r0)     // Catch:{ all -> 0x0060 }
            java.util.List r0 = ee.g.j1(r0)     // Catch:{ all -> 0x0060 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0060 }
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0060 }
            r3 = 0
            if (r2 != 0) goto L_0x001f
            r2 = r3
            goto L_0x0046
        L_0x001f:
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0060 }
            boolean r4 = r1.hasNext()     // Catch:{ all -> 0x0060 }
            if (r4 != 0) goto L_0x002a
            goto L_0x0046
        L_0x002a:
            r4 = r2
            le.k r4 = (le.k) r4     // Catch:{ all -> 0x0060 }
            int r4 = r4.getLoadPriority()     // Catch:{ all -> 0x0060 }
        L_0x0031:
            java.lang.Object r5 = r1.next()     // Catch:{ all -> 0x0060 }
            r6 = r5
            le.k r6 = (le.k) r6     // Catch:{ all -> 0x0060 }
            int r6 = r6.getLoadPriority()     // Catch:{ all -> 0x0060 }
            if (r4 >= r6) goto L_0x0040
            r2 = r5
            r4 = r6
        L_0x0040:
            boolean r5 = r1.hasNext()     // Catch:{ all -> 0x0060 }
            if (r5 != 0) goto L_0x0031
        L_0x0046:
            le.k r2 = (le.k) r2     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            ge.n1 r3 = r2.createDispatcher(r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0053
        L_0x0050:
            r2.hintOnError()     // Catch:{ all -> 0x0060 }
        L_0x0053:
            if (r3 == 0) goto L_0x0058
            f8259a = r3
            return
        L_0x0058:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0060 }
            java.lang.String r1 = "Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'"
            r0.<init>(r1)     // Catch:{ all -> 0x0060 }
            throw r0     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le.l.<clinit>():void");
    }
}
