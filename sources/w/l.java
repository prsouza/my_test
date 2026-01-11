package w;

import v.e;
import w.f;

public final class l extends p {

    /* renamed from: k  reason: collision with root package name */
    public static int[] f12516k = new int[2];

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12517a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12517a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12517a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12517a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f12535h.f12508e = f.a.LEFT;
        this.i.f12508e = f.a.RIGHT;
        this.f12534f = 0;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v29, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v32, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v18, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v47, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v30, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v46, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v17, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v73, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v35, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v99, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v104, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v108, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v112, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v123, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v127, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v138, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v143, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0274, code lost:
        if (r14 != 1) goto L_0x02d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(w.d r18) {
        /*
            r17 = this;
            r8 = r17
            int[] r0 = w.l.a.f12517a
            w.p$b r1 = r8.f12536j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 3
            r9 = 0
            if (r0 == r1) goto L_0x03ef
            w.g r0 = r8.f12533e
            boolean r2 = r0.f12511j
            r10 = 1056964608(0x3f000000, float:0.5)
            r11 = 1
            if (r2 != 0) goto L_0x02d3
            v.e$b r2 = r8.f12532d
            v.e$b r3 = v.e.b.MATCH_CONSTRAINT
            if (r2 != r3) goto L_0x02d3
            v.e r2 = r8.f12530b
            int r3 = r2.f12081r
            r4 = 2
            if (r3 == r4) goto L_0x02bc
            if (r3 == r1) goto L_0x002a
            goto L_0x02d3
        L_0x002a:
            int r3 = r2.f12082s
            r4 = -1
            if (r3 == 0) goto L_0x0062
            if (r3 != r1) goto L_0x0032
            goto L_0x0062
        L_0x0032:
            int r1 = r2.Z
            if (r1 == r4) goto L_0x0051
            if (r1 == 0) goto L_0x0046
            if (r1 == r11) goto L_0x003c
            r1 = r9
            goto L_0x005d
        L_0x003c:
            w.n r1 = r2.f12057e
            w.g r1 = r1.f12533e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.Y
            goto L_0x005a
        L_0x0046:
            w.n r1 = r2.f12057e
            w.g r1 = r1.f12533e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.Y
            float r1 = r1 / r2
            goto L_0x005b
        L_0x0051:
            w.n r1 = r2.f12057e
            w.g r1 = r1.f12533e
            int r1 = r1.g
            float r1 = (float) r1
            float r2 = r2.Y
        L_0x005a:
            float r1 = r1 * r2
        L_0x005b:
            float r1 = r1 + r10
            int r1 = (int) r1
        L_0x005d:
            r0.d(r1)
            goto L_0x02d3
        L_0x0062:
            w.n r0 = r2.f12057e
            w.f r12 = r0.f12535h
            w.f r13 = r0.i
            v.d r0 = r2.J
            v.d r0 = r0.f12047f
            if (r0 == 0) goto L_0x0070
            r0 = r11
            goto L_0x0071
        L_0x0070:
            r0 = r9
        L_0x0071:
            v.d r1 = r2.K
            v.d r1 = r1.f12047f
            if (r1 == 0) goto L_0x0079
            r1 = r11
            goto L_0x007a
        L_0x0079:
            r1 = r9
        L_0x007a:
            v.d r3 = r2.L
            v.d r3 = r3.f12047f
            if (r3 == 0) goto L_0x0082
            r3 = r11
            goto L_0x0083
        L_0x0082:
            r3 = r9
        L_0x0083:
            v.d r5 = r2.M
            v.d r5 = r5.f12047f
            if (r5 == 0) goto L_0x008b
            r5 = r11
            goto L_0x008c
        L_0x008b:
            r5 = r9
        L_0x008c:
            int r14 = r2.Z
            if (r0 == 0) goto L_0x01c5
            if (r1 == 0) goto L_0x01c5
            if (r3 == 0) goto L_0x01c5
            if (r5 == 0) goto L_0x01c5
            float r15 = r2.Y
            boolean r0 = r12.f12511j
            if (r0 == 0) goto L_0x00f8
            boolean r0 = r13.f12511j
            if (r0 == 0) goto L_0x00f8
            w.f r0 = r8.f12535h
            boolean r1 = r0.f12506c
            if (r1 == 0) goto L_0x00f7
            w.f r1 = r8.i
            boolean r1 = r1.f12506c
            if (r1 != 0) goto L_0x00ad
            goto L_0x00f7
        L_0x00ad:
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            w.f r1 = r8.f12535h
            int r1 = r1.f12509f
            int r2 = r0 + r1
            w.f r0 = r8.i
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            w.f r1 = r8.i
            int r1 = r1.f12509f
            int r3 = r0 - r1
            int r0 = r12.g
            int r1 = r12.f12509f
            int r4 = r0 + r1
            int r0 = r13.g
            int r1 = r13.f12509f
            int r5 = r0 - r1
            int[] r10 = f12516k
            r0 = r17
            r1 = r10
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12533e
            r1 = r10[r9]
            r0.d(r1)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r1 = r10[r11]
            r0.d(r1)
        L_0x00f7:
            return
        L_0x00f8:
            w.f r0 = r8.f12535h
            boolean r1 = r0.f12511j
            if (r1 == 0) goto L_0x0153
            w.f r1 = r8.i
            boolean r2 = r1.f12511j
            if (r2 == 0) goto L_0x0153
            boolean r2 = r12.f12506c
            if (r2 == 0) goto L_0x0152
            boolean r2 = r13.f12506c
            if (r2 != 0) goto L_0x010d
            goto L_0x0152
        L_0x010d:
            int r2 = r0.g
            int r0 = r0.f12509f
            int r2 = r2 + r0
            int r0 = r1.g
            int r1 = r1.f12509f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            int r1 = r12.f12509f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            int r1 = r13.f12509f
            int r5 = r0 - r1
            int[] r16 = f12516k
            r0 = r17
            r1 = r16
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12533e
            r1 = r16[r9]
            r0.d(r1)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r1 = r16[r11]
            r0.d(r1)
            goto L_0x0153
        L_0x0152:
            return
        L_0x0153:
            w.f r0 = r8.f12535h
            boolean r1 = r0.f12506c
            if (r1 == 0) goto L_0x01c4
            w.f r1 = r8.i
            boolean r1 = r1.f12506c
            if (r1 == 0) goto L_0x01c4
            boolean r1 = r12.f12506c
            if (r1 == 0) goto L_0x01c4
            boolean r1 = r13.f12506c
            if (r1 != 0) goto L_0x0168
            goto L_0x01c4
        L_0x0168:
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            w.f r1 = r8.f12535h
            int r1 = r1.f12509f
            int r2 = r0 + r1
            w.f r0 = r8.i
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            w.f r1 = r8.i
            int r1 = r1.f12509f
            int r3 = r0 - r1
            java.util.List<w.f> r0 = r12.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            int r1 = r12.f12509f
            int r4 = r0 + r1
            java.util.List<w.f> r0 = r13.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            int r1 = r13.f12509f
            int r5 = r0 - r1
            int[] r12 = f12516k
            r0 = r17
            r1 = r12
            r6 = r15
            r7 = r14
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            w.g r0 = r8.f12533e
            r1 = r12[r9]
            r0.d(r1)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r1 = r12[r11]
            r0.d(r1)
            goto L_0x02d3
        L_0x01c4:
            return
        L_0x01c5:
            if (r0 == 0) goto L_0x0247
            if (r3 == 0) goto L_0x0247
            w.f r0 = r8.f12535h
            boolean r1 = r0.f12506c
            if (r1 == 0) goto L_0x0246
            w.f r1 = r8.i
            boolean r1 = r1.f12506c
            if (r1 != 0) goto L_0x01d6
            goto L_0x0246
        L_0x01d6:
            float r1 = r2.Y
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            int r0 = r0.g
            w.f r2 = r8.f12535h
            int r2 = r2.f12509f
            int r0 = r0 + r2
            w.f r2 = r8.i
            java.util.List<w.f> r2 = r2.f12513l
            java.lang.Object r2 = r2.get(r9)
            w.f r2 = (w.f) r2
            int r2 = r2.g
            w.f r3 = r8.i
            int r3 = r3.f12509f
            int r2 = r2 - r3
            if (r14 == r4) goto L_0x0223
            if (r14 == 0) goto L_0x0223
            if (r14 == r11) goto L_0x0200
            goto L_0x02d3
        L_0x0200:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r9)
            float r2 = (float) r0
            float r2 = r2 / r1
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.g(r2, r11)
            if (r2 == r3) goto L_0x0213
            float r0 = (float) r3
            float r0 = r0 * r1
            float r0 = r0 + r10
            int r0 = (int) r0
        L_0x0213:
            w.g r1 = r8.f12533e
            r1.d(r0)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r0.d(r3)
            goto L_0x02d3
        L_0x0223:
            int r2 = r2 - r0
            int r0 = r8.g(r2, r9)
            float r2 = (float) r0
            float r2 = r2 * r1
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.g(r2, r11)
            if (r2 == r3) goto L_0x0236
            float r0 = (float) r3
            float r0 = r0 / r1
            float r0 = r0 + r10
            int r0 = (int) r0
        L_0x0236:
            w.g r1 = r8.f12533e
            r1.d(r0)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r0.d(r3)
            goto L_0x02d3
        L_0x0246:
            return
        L_0x0247:
            if (r1 == 0) goto L_0x02d3
            if (r5 == 0) goto L_0x02d3
            boolean r0 = r12.f12506c
            if (r0 == 0) goto L_0x02bb
            boolean r0 = r13.f12506c
            if (r0 != 0) goto L_0x0254
            goto L_0x02bb
        L_0x0254:
            float r0 = r2.Y
            java.util.List<w.f> r1 = r12.f12513l
            java.lang.Object r1 = r1.get(r9)
            w.f r1 = (w.f) r1
            int r1 = r1.g
            int r2 = r12.f12509f
            int r1 = r1 + r2
            java.util.List<w.f> r2 = r13.f12513l
            java.lang.Object r2 = r2.get(r9)
            w.f r2 = (w.f) r2
            int r2 = r2.g
            int r3 = r13.f12509f
            int r2 = r2 - r3
            if (r14 == r4) goto L_0x0299
            if (r14 == 0) goto L_0x0277
            if (r14 == r11) goto L_0x0299
            goto L_0x02d3
        L_0x0277:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r11)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x028a
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L_0x028a:
            w.g r0 = r8.f12533e
            r0.d(r3)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r0.d(r1)
            goto L_0x02d3
        L_0x0299:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r11)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r10
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x02ac
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r10
            int r1 = (int) r1
        L_0x02ac:
            w.g r0 = r8.f12533e
            r0.d(r3)
            v.e r0 = r8.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            r0.d(r1)
            goto L_0x02d3
        L_0x02bb:
            return
        L_0x02bc:
            v.e r1 = r2.V
            if (r1 == 0) goto L_0x02d3
            w.l r1 = r1.f12055d
            w.g r1 = r1.f12533e
            boolean r3 = r1.f12511j
            if (r3 == 0) goto L_0x02d3
            float r2 = r2.f12086w
            int r1 = r1.g
            float r1 = (float) r1
            float r1 = r1 * r2
            float r1 = r1 + r10
            int r1 = (int) r1
            r0.d(r1)
        L_0x02d3:
            w.f r0 = r8.f12535h
            boolean r1 = r0.f12506c
            if (r1 == 0) goto L_0x03ee
            w.f r1 = r8.i
            boolean r2 = r1.f12506c
            if (r2 != 0) goto L_0x02e1
            goto L_0x03ee
        L_0x02e1:
            boolean r0 = r0.f12511j
            if (r0 == 0) goto L_0x02f0
            boolean r0 = r1.f12511j
            if (r0 == 0) goto L_0x02f0
            w.g r0 = r8.f12533e
            boolean r0 = r0.f12511j
            if (r0 == 0) goto L_0x02f0
            return
        L_0x02f0:
            w.g r0 = r8.f12533e
            boolean r0 = r0.f12511j
            if (r0 != 0) goto L_0x033a
            v.e$b r0 = r8.f12532d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x033a
            v.e r0 = r8.f12530b
            int r1 = r0.f12081r
            if (r1 != 0) goto L_0x033a
            boolean r0 = r0.y()
            if (r0 != 0) goto L_0x033a
            w.f r0 = r8.f12535h
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            w.f r1 = r8.i
            java.util.List<w.f> r1 = r1.f12513l
            java.lang.Object r1 = r1.get(r9)
            w.f r1 = (w.f) r1
            int r0 = r0.g
            w.f r2 = r8.f12535h
            int r3 = r2.f12509f
            int r0 = r0 + r3
            int r1 = r1.g
            w.f r3 = r8.i
            int r3 = r3.f12509f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            w.f r0 = r8.i
            r0.d(r1)
            w.g r0 = r8.f12533e
            r0.d(r3)
            return
        L_0x033a:
            w.g r0 = r8.f12533e
            boolean r0 = r0.f12511j
            if (r0 != 0) goto L_0x039e
            v.e$b r0 = r8.f12532d
            v.e$b r1 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x039e
            int r0 = r8.f12529a
            if (r0 != r11) goto L_0x039e
            w.f r0 = r8.f12535h
            java.util.List<w.f> r0 = r0.f12513l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x039e
            w.f r0 = r8.i
            java.util.List<w.f> r0 = r0.f12513l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x039e
            w.f r0 = r8.f12535h
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            w.f r1 = r8.i
            java.util.List<w.f> r1 = r1.f12513l
            java.lang.Object r1 = r1.get(r9)
            w.f r1 = (w.f) r1
            int r0 = r0.g
            w.f r2 = r8.f12535h
            int r2 = r2.f12509f
            int r0 = r0 + r2
            int r1 = r1.g
            w.f r2 = r8.i
            int r2 = r2.f12509f
            int r1 = r1 + r2
            int r1 = r1 - r0
            w.g r0 = r8.f12533e
            int r0 = r0.f12514m
            int r0 = java.lang.Math.min(r1, r0)
            v.e r1 = r8.f12530b
            int r2 = r1.f12085v
            int r1 = r1.f12084u
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x0399
            int r0 = java.lang.Math.min(r2, r0)
        L_0x0399:
            w.g r1 = r8.f12533e
            r1.d(r0)
        L_0x039e:
            w.g r0 = r8.f12533e
            boolean r0 = r0.f12511j
            if (r0 != 0) goto L_0x03a5
            return
        L_0x03a5:
            w.f r0 = r8.f12535h
            java.util.List<w.f> r0 = r0.f12513l
            java.lang.Object r0 = r0.get(r9)
            w.f r0 = (w.f) r0
            w.f r1 = r8.i
            java.util.List<w.f> r1 = r1.f12513l
            java.lang.Object r1 = r1.get(r9)
            w.f r1 = (w.f) r1
            int r2 = r0.g
            w.f r3 = r8.f12535h
            int r4 = r3.f12509f
            int r4 = r4 + r2
            int r5 = r1.g
            w.f r6 = r8.i
            int r6 = r6.f12509f
            int r6 = r6 + r5
            v.e r7 = r8.f12530b
            float r7 = r7.f12060f0
            if (r0 != r1) goto L_0x03cf
            r7 = r10
            goto L_0x03d1
        L_0x03cf:
            r2 = r4
            r5 = r6
        L_0x03d1:
            int r5 = r5 - r2
            w.g r0 = r8.f12533e
            int r0 = r0.g
            int r5 = r5 - r0
            float r0 = (float) r2
            float r0 = r0 + r10
            float r1 = (float) r5
            float r1 = r1 * r7
            float r1 = r1 + r0
            int r0 = (int) r1
            r3.d(r0)
            w.f r0 = r8.i
            w.f r1 = r8.f12535h
            int r1 = r1.g
            w.g r2 = r8.f12533e
            int r2 = r2.g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x03ee:
            return
        L_0x03ef:
            v.e r0 = r8.f12530b
            v.d r1 = r0.J
            v.d r0 = r0.L
            r8.l(r1, r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.a(w.d):void");
    }

    /* JADX WARNING: type inference failed for: r0v20, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v21, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v23, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v25, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v26, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v31, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v35, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v37, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v39, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v43, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v54, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v56, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v58, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v54, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v67, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v71, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v75, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0087, code lost:
        r0 = r9.f12530b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r9 = this;
            v.e r0 = r9.f12530b
            boolean r1 = r0.f12050a
            if (r1 == 0) goto L_0x000f
            w.g r1 = r9.f12533e
            int r0 = r0.r()
            r1.d(r0)
        L_0x000f:
            w.g r0 = r9.f12533e
            boolean r1 = r0.f12511j
            r2 = 0
            if (r1 != 0) goto L_0x0081
            v.e r1 = r9.f12530b
            v.e$b[] r3 = r1.U
            r3 = r3[r2]
            r9.f12532d = r3
            v.e$b r4 = v.e.b.MATCH_CONSTRAINT
            if (r3 == r4) goto L_0x00bb
            v.e$b r4 = v.e.b.MATCH_PARENT
            if (r3 != r4) goto L_0x0075
            v.e r5 = r1.V
            if (r5 == 0) goto L_0x0075
            v.e$b[] r6 = r5.U
            r7 = r6[r2]
            v.e$b r8 = v.e.b.FIXED
            if (r7 == r8) goto L_0x0036
            r6 = r6[r2]
            if (r6 != r4) goto L_0x0075
        L_0x0036:
            int r0 = r5.r()
            v.e r1 = r9.f12530b
            v.d r1 = r1.J
            int r1 = r1.d()
            int r0 = r0 - r1
            v.e r1 = r9.f12530b
            v.d r1 = r1.L
            int r1 = r1.d()
            int r0 = r0 - r1
            w.f r1 = r9.f12535h
            w.l r2 = r5.f12055d
            w.f r2 = r2.f12535h
            v.e r3 = r9.f12530b
            v.d r3 = r3.J
            int r3 = r3.d()
            r9.b(r1, r2, r3)
            w.f r1 = r9.i
            w.l r2 = r5.f12055d
            w.f r2 = r2.i
            v.e r3 = r9.f12530b
            v.d r3 = r3.L
            int r3 = r3.d()
            int r3 = -r3
            r9.b(r1, r2, r3)
            w.g r1 = r9.f12533e
            r1.d(r0)
            return
        L_0x0075:
            v.e$b r4 = v.e.b.FIXED
            if (r3 != r4) goto L_0x00bb
            int r1 = r1.r()
            r0.d(r1)
            goto L_0x00bb
        L_0x0081:
            v.e$b r0 = r9.f12532d
            v.e$b r1 = v.e.b.MATCH_PARENT
            if (r0 != r1) goto L_0x00bb
            v.e r0 = r9.f12530b
            v.e r3 = r0.V
            if (r3 == 0) goto L_0x00bb
            v.e$b[] r4 = r3.U
            r5 = r4[r2]
            v.e$b r6 = v.e.b.FIXED
            if (r5 == r6) goto L_0x0099
            r4 = r4[r2]
            if (r4 != r1) goto L_0x00bb
        L_0x0099:
            w.f r1 = r9.f12535h
            w.l r2 = r3.f12055d
            w.f r2 = r2.f12535h
            v.d r0 = r0.J
            int r0 = r0.d()
            r9.b(r1, r2, r0)
            w.f r0 = r9.i
            w.l r1 = r3.f12055d
            w.f r1 = r1.i
            v.e r2 = r9.f12530b
            v.d r2 = r2.L
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r0, r1, r2)
            return
        L_0x00bb:
            w.g r0 = r9.f12533e
            boolean r1 = r0.f12511j
            r3 = 1
            if (r1 == 0) goto L_0x01c2
            v.e r1 = r9.f12530b
            boolean r4 = r1.f12050a
            if (r4 == 0) goto L_0x01c2
            v.d[] r0 = r1.R
            r4 = r0[r2]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x013c
            r4 = r0[r3]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x013c
            boolean r0 = r1.y()
            if (r0 == 0) goto L_0x00fb
            w.f r0 = r9.f12535h
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r2]
            int r1 = r1.d()
            r0.f12509f = r1
            w.f r0 = r9.i
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r3]
            int r1 = r1.d()
            int r1 = -r1
            r0.f12509f = r1
            goto L_0x03b9
        L_0x00fb:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r2]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0116
            w.f r1 = r9.f12535h
            v.e r4 = r9.f12530b
            v.d[] r4 = r4.R
            r2 = r4[r2]
            int r2 = r2.d()
            r9.b(r1, r0, r2)
        L_0x0116:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r3]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0132
            w.f r1 = r9.i
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r3]
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r1, r0, r2)
        L_0x0132:
            w.f r0 = r9.f12535h
            r0.f12505b = r3
            w.f r0 = r9.i
            r0.f12505b = r3
            goto L_0x03b9
        L_0x013c:
            r4 = r0[r2]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x0166
            r0 = r0[r2]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x03b9
            w.f r1 = r9.f12535h
            v.e r3 = r9.f12530b
            v.d[] r3 = r3.R
            r2 = r3[r2]
            int r2 = r2.d()
            r9.b(r1, r0, r2)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            goto L_0x03b9
        L_0x0166:
            r2 = r0[r3]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x0192
            r0 = r0[r3]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x03b9
            w.f r1 = r9.i
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r3]
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r1, r0, r2)
            w.f r0 = r9.f12535h
            w.f r1 = r9.i
            w.g r2 = r9.f12533e
            int r2 = r2.g
            int r2 = -r2
            r9.b(r0, r1, r2)
            goto L_0x03b9
        L_0x0192:
            boolean r0 = r1 instanceof v.h
            if (r0 != 0) goto L_0x03b9
            v.e r0 = r1.V
            if (r0 == 0) goto L_0x03b9
            v.d$b r0 = v.d.b.CENTER
            v.d r0 = r1.h(r0)
            v.d r0 = r0.f12047f
            if (r0 != 0) goto L_0x03b9
            v.e r0 = r9.f12530b
            v.e r1 = r0.V
            w.l r1 = r1.f12055d
            w.f r1 = r1.f12535h
            w.f r2 = r9.f12535h
            int r0 = r0.s()
            r9.b(r2, r1, r0)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            goto L_0x03b9
        L_0x01c2:
            v.e$b r1 = r9.f12532d
            v.e$b r4 = v.e.b.MATCH_CONSTRAINT
            if (r1 != r4) goto L_0x02f3
            v.e r1 = r9.f12530b
            int r4 = r1.f12081r
            r5 = 2
            if (r4 == r5) goto L_0x02ca
            r5 = 3
            if (r4 == r5) goto L_0x01d4
            goto L_0x02f3
        L_0x01d4:
            int r4 = r1.f12082s
            if (r4 != r5) goto L_0x0279
            w.f r4 = r9.f12535h
            r4.f12504a = r9
            w.f r4 = r9.i
            r4.f12504a = r9
            w.n r4 = r1.f12057e
            w.f r5 = r4.f12535h
            r5.f12504a = r9
            w.f r4 = r4.i
            r4.f12504a = r9
            r0.f12504a = r9
            boolean r0 = r1.z()
            if (r0 == 0) goto L_0x0246
            w.g r0 = r9.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            v.e r1 = r9.f12530b
            w.n r1 = r1.f12057e
            w.g r1 = r1.f12533e
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.g r1 = r0.f12533e
            r1.f12504a = r9
            w.g r1 = r9.f12533e
            java.util.List<w.f> r1 = r1.f12513l
            w.f r0 = r0.f12535h
            r1.add(r0)
            w.g r0 = r9.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            v.e r1 = r9.f12530b
            w.n r1 = r1.f12057e
            w.f r1 = r1.i
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.f r0 = r0.f12535h
            java.util.List<w.d> r0 = r0.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.f r0 = r0.i
            java.util.List<w.d> r0 = r0.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            goto L_0x02f3
        L_0x0246:
            v.e r0 = r9.f12530b
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x026a
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            w.g r1 = r9.f12533e
            r0.add(r1)
            w.g r0 = r9.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            v.e r1 = r9.f12530b
            w.n r1 = r1.f12057e
            w.g r1 = r1.f12533e
            r0.add(r1)
            goto L_0x02f3
        L_0x026a:
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.g r0 = r0.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            w.g r1 = r9.f12533e
            r0.add(r1)
            goto L_0x02f3
        L_0x0279:
            w.n r1 = r1.f12057e
            w.g r1 = r1.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            r0.add(r1)
            java.util.List<w.d> r0 = r1.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.f r0 = r0.f12535h
            java.util.List<w.d> r0 = r0.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            v.e r0 = r9.f12530b
            w.n r0 = r0.f12057e
            w.f r0 = r0.i
            java.util.List<w.d> r0 = r0.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            w.g r0 = r9.f12533e
            r0.f12505b = r3
            java.util.List<w.d> r0 = r0.f12512k
            w.f r1 = r9.f12535h
            r0.add(r1)
            w.g r0 = r9.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.f r1 = r9.i
            r0.add(r1)
            w.f r0 = r9.f12535h
            java.util.List<w.f> r0 = r0.f12513l
            w.g r1 = r9.f12533e
            r0.add(r1)
            w.f r0 = r9.i
            java.util.List<w.f> r0 = r0.f12513l
            w.g r1 = r9.f12533e
            r0.add(r1)
            goto L_0x02f3
        L_0x02ca:
            v.e r1 = r1.V
            if (r1 != 0) goto L_0x02cf
            goto L_0x02f3
        L_0x02cf:
            w.n r1 = r1.f12057e
            w.g r1 = r1.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            r0.add(r1)
            java.util.List<w.d> r0 = r1.f12512k
            w.g r1 = r9.f12533e
            r0.add(r1)
            w.g r0 = r9.f12533e
            r0.f12505b = r3
            java.util.List<w.d> r0 = r0.f12512k
            w.f r1 = r9.f12535h
            r0.add(r1)
            w.g r0 = r9.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.f r1 = r9.i
            r0.add(r1)
        L_0x02f3:
            v.e r0 = r9.f12530b
            v.d[] r1 = r0.R
            r4 = r1[r2]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x034b
            r4 = r1[r3]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x034b
            boolean r0 = r0.y()
            if (r0 == 0) goto L_0x0328
            w.f r0 = r9.f12535h
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r2]
            int r1 = r1.d()
            r0.f12509f = r1
            w.f r0 = r9.i
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r3]
            int r1 = r1.d()
            int r1 = -r1
            r0.f12509f = r1
            goto L_0x03b9
        L_0x0328:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r2]
            w.f r0 = r9.h(r0)
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r3]
            w.f r1 = r9.h(r1)
            if (r0 == 0) goto L_0x0341
            r0.b(r9)
        L_0x0341:
            if (r1 == 0) goto L_0x0346
            r1.b(r9)
        L_0x0346:
            w.p$b r0 = w.p.b.CENTER
            r9.f12536j = r0
            goto L_0x03b9
        L_0x034b:
            r4 = r1[r2]
            v.d r4 = r4.f12047f
            if (r4 == 0) goto L_0x0372
            r0 = r1[r2]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x03b9
            w.f r1 = r9.f12535h
            v.e r4 = r9.f12530b
            v.d[] r4 = r4.R
            r2 = r4[r2]
            int r2 = r2.d()
            r9.b(r1, r0, r2)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            r9.c(r0, r1, r3, r2)
            goto L_0x03b9
        L_0x0372:
            r2 = r1[r3]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x039b
            r0 = r1[r3]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x03b9
            w.f r1 = r9.i
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r3]
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r1, r0, r2)
            w.f r0 = r9.f12535h
            w.f r1 = r9.i
            r2 = -1
            w.g r3 = r9.f12533e
            r9.c(r0, r1, r2, r3)
            goto L_0x03b9
        L_0x039b:
            boolean r1 = r0 instanceof v.h
            if (r1 != 0) goto L_0x03b9
            v.e r1 = r0.V
            if (r1 == 0) goto L_0x03b9
            w.l r1 = r1.f12055d
            w.f r1 = r1.f12535h
            w.f r2 = r9.f12535h
            int r0 = r0.s()
            r9.b(r2, r1, r0)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            r9.c(r0, r1, r3, r2)
        L_0x03b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.l.d():void");
    }

    public final void e() {
        f fVar = this.f12535h;
        if (fVar.f12511j) {
            this.f12530b.f12051a0 = fVar.g;
        }
    }

    public final void f() {
        this.f12531c = null;
        this.f12535h.c();
        this.i.c();
        this.f12533e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.f12532d != e.b.MATCH_CONSTRAINT || this.f12530b.f12081r == 0) {
            return true;
        }
        return false;
    }

    public final void m(int[] iArr, int i, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i;
        int i15 = i12 - i11;
        if (i13 == -1) {
            int i16 = (int) ((((float) i15) * f10) + 0.5f);
            int i17 = (int) ((((float) i14) / f10) + 0.5f);
            if (i16 <= i14) {
                iArr[0] = i16;
                iArr[1] = i15;
            } else if (i17 <= i15) {
                iArr[0] = i14;
                iArr[1] = i17;
            }
        } else if (i13 == 0) {
            iArr[0] = (int) ((((float) i15) * f10) + 0.5f);
            iArr[1] = i15;
        } else if (i13 == 1) {
            iArr[0] = i14;
            iArr[1] = (int) ((((float) i14) * f10) + 0.5f);
        }
    }

    public final void n() {
        this.g = false;
        this.f12535h.c();
        this.f12535h.f12511j = false;
        this.i.c();
        this.i.f12511j = false;
        this.f12533e.f12511j = false;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("HorizontalRun ");
        d10.append(this.f12530b.f12066j0);
        return d10.toString();
    }
}
