package l6;

import m3.u;
import n6.c;

public final class i1 {

    /* renamed from: e  reason: collision with root package name */
    public static final u f7896e = new u("ExtractorTaskFinder");

    /* renamed from: a  reason: collision with root package name */
    public final g1 f7897a;

    /* renamed from: b  reason: collision with root package name */
    public final a0 f7898b;

    /* renamed from: c  reason: collision with root package name */
    public final i0 f7899c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7900d;

    public i1(g1 g1Var, a0 a0Var, i0 i0Var, c cVar) {
        this.f7897a = g1Var;
        this.f7898b = a0Var;
        this.f7899c = i0Var;
        this.f7900d = cVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: l6.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: l6.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v17, resolved type: l6.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: l6.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: l6.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v21, resolved type: l6.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v55, resolved type: l6.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v56, resolved type: l6.d2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v6, resolved type: l6.k2} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v7, resolved type: l6.q1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v21, resolved type: l6.t1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v22, resolved type: l6.d2} */
    /* JADX WARNING: type inference failed for: r0v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b2, code lost:
        if (r0 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        f7896e.a("Found final move task for session %s with pack %s.", java.lang.Integer.valueOf(r7.f7814a), r7.f7816c.f7801a);
        r11 = r7.f7814a;
        r8 = r7.f7816c;
        r10 = new l6.t1(r11, r8.f7801a, r7.f7815b, r8.f7802b, r8.f7803c);
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x025f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x0389 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x035c A[LOOP:10: B:104:0x035c->B:169:0x035c, LOOP_END, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x027a A[Catch:{ IOException -> 0x0108, all -> 0x0419 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b8.b a() {
        /*
            r32 = this;
            r1 = r32
            l6.g1 r0 = r1.f7897a     // Catch:{ all -> 0x0419 }
            java.util.concurrent.locks.ReentrantLock r0 = r0.f7869f     // Catch:{ all -> 0x0419 }
            r0.lock()     // Catch:{ all -> 0x0419 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0419 }
            r2.<init>()     // Catch:{ all -> 0x0419 }
            l6.g1 r0 = r1.f7897a     // Catch:{ all -> 0x0419 }
            java.util.HashMap r0 = r0.f7868e     // Catch:{ all -> 0x0419 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x0419 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0419 }
        L_0x001a:
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0419 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r0.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r3 = (l6.d1) r3     // Catch:{ all -> 0x0419 }
            l6.c1 r4 = r3.f7816c     // Catch:{ all -> 0x0419 }
            int r4 = r4.f7804d     // Catch:{ all -> 0x0419 }
            boolean r4 = c3.k.f1(r4)     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x001a
            r2.add(r3)     // Catch:{ all -> 0x0419 }
            goto L_0x001a
        L_0x0034:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0419 }
            if (r0 == 0) goto L_0x003f
            l6.g1 r0 = r1.f7897a
            r3 = 0
            goto L_0x040f
        L_0x003f:
            n6.c r0 = r1.f7900d     // Catch:{ all -> 0x0419 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0419 }
            r4 = 0
            r5 = 1
            r6 = 2
            if (r0 == 0) goto L_0x00b4
            l6.a0 r0 = r1.f7898b     // Catch:{ all -> 0x0419 }
            java.util.Map r0 = r0.v()     // Catch:{ all -> 0x0419 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x0054:
            boolean r8 = r7.hasNext()     // Catch:{ all -> 0x0419 }
            if (r8 == 0) goto L_0x00b1
            java.lang.Object r8 = r7.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r8 = (l6.d1) r8     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r8.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            r10 = r0
            java.util.HashMap r10 = (java.util.HashMap) r10     // Catch:{ all -> 0x0419 }
            java.lang.Object r9 = r10.get(r9)     // Catch:{ all -> 0x0419 }
            java.lang.Long r9 = (java.lang.Long) r9     // Catch:{ all -> 0x0419 }
            if (r9 == 0) goto L_0x0054
            l6.c1 r10 = r8.f7816c     // Catch:{ all -> 0x0419 }
            long r10 = r10.f7802b     // Catch:{ all -> 0x0419 }
            long r12 = r9.longValue()     // Catch:{ all -> 0x0419 }
            int r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0054
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ all -> 0x0419 }
            int r9 = r8.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0419 }
            r7[r4] = r9     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r8.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            r7[r5] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = "Found promote pack task for session %s with pack %s."
            r0.a(r9, r7)     // Catch:{ all -> 0x0419 }
            l6.d2 r0 = new l6.d2     // Catch:{ all -> 0x0419 }
            int r11 = r8.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r7 = r8.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r12 = r7.f7801a     // Catch:{ all -> 0x0419 }
            l6.a0 r7 = r1.f7898b     // Catch:{ all -> 0x0419 }
            java.io.File r7 = r7.e(r12)     // Catch:{ all -> 0x0419 }
            long r9 = l6.a0.d(r7, r5)     // Catch:{ all -> 0x0419 }
            int r13 = (int) r9     // Catch:{ all -> 0x0419 }
            int r14 = r8.f7815b     // Catch:{ all -> 0x0419 }
            l6.c1 r7 = r8.f7816c     // Catch:{ all -> 0x0419 }
            long r7 = r7.f7802b     // Catch:{ all -> 0x0419 }
            r10 = r0
            r15 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0419 }
            goto L_0x00b2
        L_0x00b1:
            r0 = 0
        L_0x00b2:
            if (r0 != 0) goto L_0x0413
        L_0x00b4:
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x00b8:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0419 }
            if (r7 == 0) goto L_0x0127
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r7 = (l6.d1) r7     // Catch:{ all -> 0x0419 }
            l6.a0 r8 = r1.f7898b     // Catch:{ IOException -> 0x0108 }
            l6.c1 r9 = r7.f7816c     // Catch:{ IOException -> 0x0108 }
            java.lang.String r10 = r9.f7801a     // Catch:{ IOException -> 0x0108 }
            int r11 = r7.f7815b     // Catch:{ IOException -> 0x0108 }
            long r12 = r9.f7802b     // Catch:{ IOException -> 0x0108 }
            int r8 = r8.k(r10, r11, r12)     // Catch:{ IOException -> 0x0108 }
            l6.c1 r9 = r7.f7816c     // Catch:{ IOException -> 0x0108 }
            java.util.List r9 = r9.f7806f     // Catch:{ IOException -> 0x0108 }
            int r9 = r9.size()     // Catch:{ IOException -> 0x0108 }
            if (r8 != r9) goto L_0x00b8
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ all -> 0x0419 }
            int r9 = r7.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0419 }
            r8[r4] = r9     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            r8[r5] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = "Found final move task for session %s with pack %s."
            r0.a(r9, r8)     // Catch:{ all -> 0x0419 }
            l6.t1 r0 = new l6.t1     // Catch:{ all -> 0x0419 }
            int r11 = r7.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r8 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r12 = r8.f7801a     // Catch:{ all -> 0x0419 }
            int r13 = r7.f7815b     // Catch:{ all -> 0x0419 }
            long r14 = r8.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r7 = r8.f7803c     // Catch:{ all -> 0x0419 }
            r10 = r0
            r16 = r7
            r10.<init>(r11, r12, r13, r14, r16)     // Catch:{ all -> 0x0419 }
            goto L_0x0128
        L_0x0108:
            r0 = move-exception
            l6.t0 r2 = new l6.t0     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0419 }
            int r6 = r7.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0419 }
            r3[r4] = r6     // Catch:{ all -> 0x0419 }
            l6.c1 r4 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = r4.f7801a     // Catch:{ all -> 0x0419 }
            r3[r5] = r4     // Catch:{ all -> 0x0419 }
            java.lang.String r4 = "Failed to check number of completed merges for session %s, pack %s"
            java.lang.String r3 = java.lang.String.format(r4, r3)     // Catch:{ all -> 0x0419 }
            int r4 = r7.f7814a     // Catch:{ all -> 0x0419 }
            r2.<init>(r3, r0, r4)     // Catch:{ all -> 0x0419 }
            throw r2     // Catch:{ all -> 0x0419 }
        L_0x0127:
            r0 = 0
        L_0x0128:
            if (r0 != 0) goto L_0x0413
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x012e:
            boolean r7 = r0.hasNext()     // Catch:{ all -> 0x0419 }
            r8 = 3
            if (r7 == 0) goto L_0x01b0
            java.lang.Object r7 = r0.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r7 = (l6.d1) r7     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r7.f7816c     // Catch:{ all -> 0x0419 }
            int r10 = r9.f7804d     // Catch:{ all -> 0x0419 }
            boolean r10 = c3.k.f1(r10)     // Catch:{ all -> 0x0419 }
            if (r10 == 0) goto L_0x012e
            java.util.List r9 = r9.f7806f     // Catch:{ all -> 0x0419 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0419 }
        L_0x014b:
            boolean r10 = r9.hasNext()     // Catch:{ all -> 0x0419 }
            if (r10 == 0) goto L_0x012e
            java.lang.Object r10 = r9.next()     // Catch:{ all -> 0x0419 }
            l6.e1 r10 = (l6.e1) r10     // Catch:{ all -> 0x0419 }
            l6.a0 r11 = r1.f7898b     // Catch:{ all -> 0x0419 }
            l6.c1 r12 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r13 = r12.f7801a     // Catch:{ all -> 0x0419 }
            int r14 = r7.f7815b     // Catch:{ all -> 0x0419 }
            long r5 = r12.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r15 = r10.f7828a     // Catch:{ all -> 0x0419 }
            r12 = r13
            r13 = r14
            r16 = r15
            r14 = r5
            java.io.File r5 = r11.t(r12, r13, r14, r16)     // Catch:{ all -> 0x0419 }
            boolean r5 = r5.exists()     // Catch:{ all -> 0x0419 }
            if (r5 == 0) goto L_0x01ad
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r5 = new java.lang.Object[r8]     // Catch:{ all -> 0x0419 }
            int r6 = r7.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0419 }
            r5[r4] = r6     // Catch:{ all -> 0x0419 }
            l6.c1 r6 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r6 = r6.f7801a     // Catch:{ all -> 0x0419 }
            r9 = 1
            r5[r9] = r6     // Catch:{ all -> 0x0419 }
            java.lang.String r6 = r10.f7828a     // Catch:{ all -> 0x0419 }
            r9 = 2
            r5[r9] = r6     // Catch:{ all -> 0x0419 }
            java.lang.String r6 = "Found merge task for session %s with pack %s and slice %s."
            r0.a(r6, r5)     // Catch:{ all -> 0x0419 }
            l6.q1 r0 = new l6.q1     // Catch:{ all -> 0x0419 }
            int r5 = r7.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r6 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r6.f7801a     // Catch:{ all -> 0x0419 }
            int r7 = r7.f7815b     // Catch:{ all -> 0x0419 }
            long r11 = r6.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r6 = r10.f7828a     // Catch:{ all -> 0x0419 }
            r17 = r0
            r18 = r5
            r19 = r9
            r20 = r7
            r21 = r11
            r23 = r6
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0419 }
            goto L_0x01b1
        L_0x01ad:
            r5 = 1
            r6 = 2
            goto L_0x014b
        L_0x01b0:
            r0 = 0
        L_0x01b1:
            if (r0 != 0) goto L_0x0413
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x01b7:
            boolean r5 = r0.hasNext()     // Catch:{ all -> 0x0419 }
            if (r5 == 0) goto L_0x023a
            java.lang.Object r5 = r0.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r5 = (l6.d1) r5     // Catch:{ all -> 0x0419 }
            l6.c1 r6 = r5.f7816c     // Catch:{ all -> 0x0419 }
            int r7 = r6.f7804d     // Catch:{ all -> 0x0419 }
            boolean r7 = c3.k.f1(r7)     // Catch:{ all -> 0x0419 }
            if (r7 == 0) goto L_0x01b7
            java.util.List r6 = r6.f7806f     // Catch:{ all -> 0x0419 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0419 }
        L_0x01d3:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x0419 }
            if (r7 == 0) goto L_0x01b7
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x0419 }
            l6.e1 r7 = (l6.e1) r7     // Catch:{ all -> 0x0419 }
            boolean r9 = r1.b(r5, r7)     // Catch:{ all -> 0x0419 }
            if (r9 == 0) goto L_0x01d3
            l6.a0 r10 = r1.f7898b     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r5.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r11 = r9.f7801a     // Catch:{ all -> 0x0419 }
            int r12 = r5.f7815b     // Catch:{ all -> 0x0419 }
            long r13 = r9.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r15 = r7.f7828a     // Catch:{ all -> 0x0419 }
            java.io.File r9 = r10.s(r11, r12, r13, r15)     // Catch:{ all -> 0x0419 }
            boolean r9 = r9.exists()     // Catch:{ all -> 0x0419 }
            if (r9 == 0) goto L_0x01d3
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r6 = new java.lang.Object[r8]     // Catch:{ all -> 0x0419 }
            int r9 = r5.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0419 }
            r6[r4] = r9     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r5.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            r10 = 1
            r6[r10] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r7.f7828a     // Catch:{ all -> 0x0419 }
            r10 = 2
            r6[r10] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = "Found verify task for session %s with pack %s and slice %s."
            r0.a(r9, r6)     // Catch:{ all -> 0x0419 }
            l6.k2 r0 = new l6.k2     // Catch:{ all -> 0x0419 }
            int r6 = r5.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r5.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r10 = r9.f7801a     // Catch:{ all -> 0x0419 }
            int r5 = r5.f7815b     // Catch:{ all -> 0x0419 }
            long r11 = r9.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r7.f7828a     // Catch:{ all -> 0x0419 }
            java.lang.String r7 = r7.f7829b     // Catch:{ all -> 0x0419 }
            r17 = r0
            r18 = r6
            r19 = r10
            r20 = r5
            r21 = r11
            r23 = r9
            r24 = r7
            r17.<init>(r18, r19, r20, r21, r23, r24)     // Catch:{ all -> 0x0419 }
            goto L_0x023b
        L_0x023a:
            r0 = 0
        L_0x023b:
            if (r0 != 0) goto L_0x0413
            java.util.Iterator r5 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x0241:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0419 }
            r6 = 4
            if (r0 == 0) goto L_0x0339
            java.lang.Object r0 = r5.next()     // Catch:{ all -> 0x0419 }
            r7 = r0
            l6.d1 r7 = (l6.d1) r7     // Catch:{ all -> 0x0419 }
            l6.c1 r0 = r7.f7816c     // Catch:{ all -> 0x0419 }
            int r9 = r0.f7804d     // Catch:{ all -> 0x0419 }
            boolean r9 = c3.k.f1(r9)     // Catch:{ all -> 0x0419 }
            if (r9 == 0) goto L_0x0241
            java.util.List r0 = r0.f7806f     // Catch:{ all -> 0x0419 }
            java.util.Iterator r9 = r0.iterator()     // Catch:{ all -> 0x0419 }
        L_0x025f:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0419 }
            if (r0 == 0) goto L_0x0241
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0419 }
            r10 = r0
            l6.e1 r10 = (l6.e1) r10     // Catch:{ all -> 0x0419 }
            int r0 = r10.f7833f     // Catch:{ all -> 0x0419 }
            r11 = 1
            if (r0 == r11) goto L_0x0277
            r11 = 2
            if (r0 != r11) goto L_0x0275
            goto L_0x0277
        L_0x0275:
            r0 = r4
            goto L_0x0278
        L_0x0277:
            r0 = 1
        L_0x0278:
            if (r0 != 0) goto L_0x025f
            l6.h2 r0 = new l6.h2     // Catch:{ all -> 0x0419 }
            l6.a0 r11 = r1.f7898b     // Catch:{ all -> 0x0419 }
            l6.c1 r12 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r13 = r12.f7801a     // Catch:{ all -> 0x0419 }
            int r14 = r7.f7815b     // Catch:{ all -> 0x0419 }
            r16 = r9
            long r8 = r12.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r12 = r10.f7828a     // Catch:{ all -> 0x0419 }
            r17 = r0
            r18 = r11
            r19 = r13
            r20 = r14
            r21 = r8
            r23 = r12
            r17.<init>(r18, r19, r20, r21, r23)     // Catch:{ all -> 0x0419 }
            int r0 = r0.a()     // Catch:{ IOException -> 0x029e }
            goto L_0x02ad
        L_0x029e:
            r0 = move-exception
            r8 = r0
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]     // Catch:{ all -> 0x0419 }
            r11[r4] = r8     // Catch:{ all -> 0x0419 }
            java.lang.String r8 = "Slice checkpoint corrupt, restarting extraction. %s"
            r0.c(r8, r11)     // Catch:{ all -> 0x0419 }
            r0 = r4
        L_0x02ad:
            r8 = -1
            if (r0 == r8) goto L_0x0333
            java.util.List r8 = r10.f7831d     // Catch:{ all -> 0x0419 }
            java.lang.Object r8 = r8.get(r0)     // Catch:{ all -> 0x0419 }
            l6.a1 r8 = (l6.a1) r8     // Catch:{ all -> 0x0419 }
            boolean r8 = r8.f7784a     // Catch:{ all -> 0x0419 }
            if (r8 == 0) goto L_0x0333
            m3.u r5 = f7896e     // Catch:{ all -> 0x0419 }
            r8 = 5
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0419 }
            int r9 = r10.f7832e     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0419 }
            r8[r4] = r9     // Catch:{ all -> 0x0419 }
            int r9 = r7.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0419 }
            r11 = 1
            r8[r11] = r9     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            r11 = 2
            r8[r11] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r10.f7828a     // Catch:{ all -> 0x0419 }
            r11 = 3
            r8[r11] = r9     // Catch:{ all -> 0x0419 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0419 }
            r8[r6] = r9     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = "Found extraction task using compression format %s for session %s, pack %s, slice %s, chunk %s."
            r5.a(r9, r8)     // Catch:{ all -> 0x0419 }
            l6.i0 r5 = r1.f7899c     // Catch:{ all -> 0x0419 }
            int r8 = r7.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7801a     // Catch:{ all -> 0x0419 }
            java.lang.String r11 = r10.f7828a     // Catch:{ all -> 0x0419 }
            java.io.InputStream r31 = r5.a(r8, r9, r11, r0)     // Catch:{ all -> 0x0419 }
            l6.o0 r5 = new l6.o0     // Catch:{ all -> 0x0419 }
            int r8 = r7.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r9 = r7.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r11 = r9.f7801a     // Catch:{ all -> 0x0419 }
            int r12 = r7.f7815b     // Catch:{ all -> 0x0419 }
            long r13 = r9.f7802b     // Catch:{ all -> 0x0419 }
            java.lang.String r9 = r9.f7803c     // Catch:{ all -> 0x0419 }
            java.lang.String r15 = r10.f7828a     // Catch:{ all -> 0x0419 }
            int r3 = r10.f7832e     // Catch:{ all -> 0x0419 }
            java.util.List r10 = r10.f7831d     // Catch:{ all -> 0x0419 }
            int r27 = r10.size()     // Catch:{ all -> 0x0419 }
            l6.c1 r7 = r7.f7816c     // Catch:{ all -> 0x0419 }
            r16 = r5
            long r4 = r7.f7805e     // Catch:{ all -> 0x0419 }
            int r7 = r7.f7804d     // Catch:{ all -> 0x0419 }
            r17 = r16
            r18 = r8
            r19 = r11
            r20 = r12
            r21 = r13
            r23 = r9
            r24 = r15
            r25 = r3
            r26 = r0
            r28 = r4
            r30 = r7
            r17.<init>(r18, r19, r20, r21, r23, r24, r25, r26, r27, r28, r30, r31)     // Catch:{ all -> 0x0419 }
            r5 = r16
            goto L_0x033a
        L_0x0333:
            r9 = r16
            r4 = 0
            r8 = 3
            goto L_0x025f
        L_0x0339:
            r5 = 0
        L_0x033a:
            if (r5 != 0) goto L_0x040c
            java.util.Iterator r0 = r2.iterator()     // Catch:{ all -> 0x0419 }
        L_0x0340:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0419 }
            if (r2 == 0) goto L_0x03ff
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0419 }
            l6.d1 r2 = (l6.d1) r2     // Catch:{ all -> 0x0419 }
            l6.c1 r3 = r2.f7816c     // Catch:{ all -> 0x0419 }
            int r4 = r3.f7804d     // Catch:{ all -> 0x0419 }
            boolean r4 = c3.k.f1(r4)     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0340
            java.util.List r3 = r3.f7806f     // Catch:{ all -> 0x0419 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x0419 }
        L_0x035c:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x0419 }
            if (r4 == 0) goto L_0x0340
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x0419 }
            l6.e1 r4 = (l6.e1) r4     // Catch:{ all -> 0x0419 }
            int r5 = r4.f7833f     // Catch:{ all -> 0x0419 }
            r7 = 1
            if (r5 == r7) goto L_0x0373
            r7 = 2
            if (r5 != r7) goto L_0x0371
            goto L_0x0373
        L_0x0371:
            r5 = 0
            goto L_0x0374
        L_0x0373:
            r5 = 1
        L_0x0374:
            if (r5 == 0) goto L_0x035c
            java.util.List r5 = r4.f7831d     // Catch:{ all -> 0x0419 }
            r7 = 0
            java.lang.Object r5 = r5.get(r7)     // Catch:{ all -> 0x0419 }
            l6.a1 r5 = (l6.a1) r5     // Catch:{ all -> 0x0419 }
            boolean r5 = r5.f7784a     // Catch:{ all -> 0x0419 }
            if (r5 == 0) goto L_0x035c
            boolean r5 = r1.b(r2, r4)     // Catch:{ all -> 0x0419 }
            if (r5 != 0) goto L_0x035c
            m3.u r0 = f7896e     // Catch:{ all -> 0x0419 }
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ all -> 0x0419 }
            int r5 = r4.f7833f     // Catch:{ all -> 0x0419 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0419 }
            r6 = 0
            r3[r6] = r5     // Catch:{ all -> 0x0419 }
            int r5 = r2.f7814a     // Catch:{ all -> 0x0419 }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x0419 }
            r6 = 1
            r3[r6] = r5     // Catch:{ all -> 0x0419 }
            l6.c1 r5 = r2.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r5 = r5.f7801a     // Catch:{ all -> 0x0419 }
            r7 = 2
            r3[r7] = r5     // Catch:{ all -> 0x0419 }
            java.lang.String r5 = r4.f7828a     // Catch:{ all -> 0x0419 }
            r8 = 3
            r3[r8] = r5     // Catch:{ all -> 0x0419 }
            java.lang.String r5 = "Found patch slice task using patch format %s for session %s, pack %s, slice %s."
            r0.a(r5, r3)     // Catch:{ all -> 0x0419 }
            l6.i0 r0 = r1.f7899c     // Catch:{ all -> 0x0419 }
            int r3 = r2.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r5 = r2.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r5 = r5.f7801a     // Catch:{ all -> 0x0419 }
            java.lang.String r6 = r4.f7828a     // Catch:{ all -> 0x0419 }
            r9 = 0
            java.io.InputStream r30 = r0.a(r3, r5, r6, r9)     // Catch:{ all -> 0x0419 }
            l6.b2 r0 = new l6.b2     // Catch:{ all -> 0x0419 }
            int r3 = r2.f7814a     // Catch:{ all -> 0x0419 }
            l6.c1 r5 = r2.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r5 = r5.f7801a     // Catch:{ all -> 0x0419 }
            l6.a0 r6 = r1.f7898b     // Catch:{ all -> 0x0419 }
            java.io.File r6 = r6.e(r5)     // Catch:{ all -> 0x0419 }
            r10 = 1
            long r6 = l6.a0.d(r6, r10)     // Catch:{ all -> 0x0419 }
            int r6 = (int) r6     // Catch:{ all -> 0x0419 }
            l6.a0 r7 = r1.f7898b     // Catch:{ all -> 0x0419 }
            l6.c1 r8 = r2.f7816c     // Catch:{ all -> 0x0419 }
            java.lang.String r8 = r8.f7801a     // Catch:{ all -> 0x0419 }
            long r21 = r7.l(r8)     // Catch:{ all -> 0x0419 }
            int r7 = r2.f7815b     // Catch:{ all -> 0x0419 }
            l6.c1 r2 = r2.f7816c     // Catch:{ all -> 0x0419 }
            long r8 = r2.f7802b     // Catch:{ all -> 0x0419 }
            int r2 = r4.f7833f     // Catch:{ all -> 0x0419 }
            java.lang.String r10 = r4.f7828a     // Catch:{ all -> 0x0419 }
            long r11 = r4.f7830c     // Catch:{ all -> 0x0419 }
            r17 = r0
            r18 = r3
            r19 = r5
            r20 = r6
            r23 = r7
            r24 = r8
            r26 = r2
            r27 = r10
            r28 = r11
            r17.<init>(r18, r19, r20, r21, r23, r24, r26, r27, r28, r30)     // Catch:{ all -> 0x0419 }
            goto L_0x0400
        L_0x03ff:
            r0 = 0
        L_0x0400:
            if (r0 == 0) goto L_0x0405
            l6.g1 r2 = r1.f7897a
            goto L_0x0415
        L_0x0405:
            l6.g1 r0 = r1.f7897a
            r0.a()
            r2 = 0
            return r2
        L_0x040c:
            l6.g1 r0 = r1.f7897a
            r3 = r5
        L_0x040f:
            r0.a()
            return r3
        L_0x0413:
            l6.g1 r2 = r1.f7897a
        L_0x0415:
            r2.a()
            return r0
        L_0x0419:
            r0 = move-exception
            l6.g1 r2 = r1.f7897a
            r2.a()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i1.a():b8.b");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(l6.d1 r8, l6.e1 r9) {
        /*
            r7 = this;
            l6.h2 r0 = new l6.h2
            l6.a0 r1 = r7.f7898b
            l6.c1 r0 = r8.f7816c
            java.lang.String r2 = r0.f7801a
            int r3 = r8.f7815b
            long r4 = r0.f7802b
            java.lang.String r6 = r9.f7828a
            java.io.File r8 = r1.q(r2, r3, r4, r6)
            boolean r9 = r8.exists()
            r0 = 0
            if (r9 != 0) goto L_0x001a
            goto L_0x005b
        L_0x001a:
            r9 = 1
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x004f }
            r1.<init>(r8)     // Catch:{ IOException -> 0x004f }
            java.util.Properties r8 = new java.util.Properties     // Catch:{ all -> 0x004a }
            r8.<init>()     // Catch:{ all -> 0x004a }
            r8.load(r1)     // Catch:{ all -> 0x004a }
            r1.close()     // Catch:{ IOException -> 0x004f }
            java.lang.String r1 = "fileStatus"
            java.lang.String r2 = r8.getProperty(r1)
            if (r2 != 0) goto L_0x003d
            m3.u r8 = l6.h2.f7886h
            java.lang.Object[] r9 = new java.lang.Object[r0]
            java.lang.String r1 = "Slice checkpoint file corrupt while checking if extraction finished."
            r8.c(r1, r9)
            goto L_0x005b
        L_0x003d:
            java.lang.String r8 = r8.getProperty(r1)
            int r8 = java.lang.Integer.parseInt(r8)
            r1 = 4
            if (r8 != r1) goto L_0x005b
            r0 = r9
            goto L_0x005b
        L_0x004a:
            r8 = move-exception
            r1.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r8     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            r8 = move-exception
            m3.u r1 = l6.h2.f7886h
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r9[r0] = r8
            java.lang.String r8 = "Could not read checkpoint while checking if extraction finished. %s"
            r1.c(r8, r9)
        L_0x005b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.i1.b(l6.d1, l6.e1):boolean");
    }
}
