package w;

import v.d;
import v.e;

public abstract class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public int f12529a;

    /* renamed from: b  reason: collision with root package name */
    public e f12530b;

    /* renamed from: c  reason: collision with root package name */
    public m f12531c;

    /* renamed from: d  reason: collision with root package name */
    public e.b f12532d;

    /* renamed from: e  reason: collision with root package name */
    public g f12533e = new g(this);

    /* renamed from: f  reason: collision with root package name */
    public int f12534f = 0;
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public f f12535h = new f(this);
    public f i = new f(this);

    /* renamed from: j  reason: collision with root package name */
    public b f12536j = b.NONE;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12537a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12537a = r0
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12537a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12537a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12537a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12537a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.p.a.<clinit>():void");
        }
    }

    public enum b {
        NONE,
        START,
        END,
        CENTER
    }

    public p(e eVar) {
        this.f12530b = eVar;
    }

    public void a(d dVar) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void b(f fVar, f fVar2, int i10) {
        fVar.f12513l.add(fVar2);
        fVar.f12509f = i10;
        fVar2.f12512k.add(fVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List<w.d>, java.util.ArrayList] */
    public final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f12513l.add(fVar2);
        fVar.f12513l.add(this.f12533e);
        fVar.f12510h = i10;
        fVar.i = gVar;
        fVar2.f12512k.add(fVar);
        gVar.f12512k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i10, int i11) {
        int i12;
        if (i11 == 0) {
            e eVar = this.f12530b;
            int i13 = eVar.f12085v;
            i12 = Math.max(eVar.f12084u, i10);
            if (i13 > 0) {
                i12 = Math.min(i13, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        } else {
            e eVar2 = this.f12530b;
            int i14 = eVar2.f12088y;
            int max = Math.max(eVar2.f12087x, i10);
            if (i14 > 0) {
                max = Math.min(i14, i10);
            }
            if (i12 == i10) {
                return i10;
            }
        }
        return i12;
    }

    public final f h(d dVar) {
        d dVar2 = dVar.f12047f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f12045d;
        int i10 = a.f12537a[dVar2.f12046e.ordinal()];
        if (i10 == 1) {
            return eVar.f12055d.f12535h;
        }
        if (i10 == 2) {
            return eVar.f12055d.i;
        }
        if (i10 == 3) {
            return eVar.f12057e.f12535h;
        }
        if (i10 == 4) {
            return eVar.f12057e.f12520k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f12057e.i;
    }

    public final f i(d dVar, int i10) {
        d dVar2 = dVar.f12047f;
        if (dVar2 == null) {
            return null;
        }
        e eVar = dVar2.f12045d;
        p pVar = i10 == 0 ? eVar.f12055d : eVar.f12057e;
        int i11 = a.f12537a[dVar2.f12046e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.i;
        }
        return pVar.f12535h;
    }

    public long j() {
        g gVar = this.f12533e;
        if (gVar.f12511j) {
            return (long) gVar.g;
        }
        return 0;
    }

    public abstract boolean k();

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0053, code lost:
        if (r10.f12529a == 3) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void l(v.d r13, v.d r14, int r15) {
        /*
            r12 = this;
            w.f r0 = r12.h(r13)
            w.f r1 = r12.h(r14)
            boolean r2 = r0.f12511j
            if (r2 == 0) goto L_0x00f5
            boolean r2 = r1.f12511j
            if (r2 != 0) goto L_0x0012
            goto L_0x00f5
        L_0x0012:
            int r2 = r0.g
            int r13 = r13.d()
            int r13 = r13 + r2
            int r2 = r1.g
            int r14 = r14.d()
            int r2 = r2 - r14
            int r14 = r2 - r13
            w.g r3 = r12.f12533e
            boolean r4 = r3.f12511j
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r4 != 0) goto L_0x00b4
            v.e$b r4 = r12.f12532d
            v.e$b r6 = v.e.b.MATCH_CONSTRAINT
            if (r4 != r6) goto L_0x00b4
            int r4 = r12.f12529a
            if (r4 == 0) goto L_0x00ad
            r7 = 1
            if (r4 == r7) goto L_0x009d
            r8 = 2
            if (r4 == r8) goto L_0x0075
            r8 = 3
            if (r4 == r8) goto L_0x003f
            goto L_0x00b4
        L_0x003f:
            v.e r4 = r12.f12530b
            w.l r9 = r4.f12055d
            v.e$b r10 = r9.f12532d
            if (r10 != r6) goto L_0x0056
            int r10 = r9.f12529a
            if (r10 != r8) goto L_0x0056
            w.n r10 = r4.f12057e
            v.e$b r11 = r10.f12532d
            if (r11 != r6) goto L_0x0056
            int r6 = r10.f12529a
            if (r6 != r8) goto L_0x0056
            goto L_0x00b4
        L_0x0056:
            if (r15 != 0) goto L_0x005a
            w.n r9 = r4.f12057e
        L_0x005a:
            w.g r6 = r9.f12533e
            boolean r8 = r6.f12511j
            if (r8 == 0) goto L_0x00b4
            float r4 = r4.Y
            if (r15 != r7) goto L_0x006b
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 / r4
            float r6 = r6 + r5
            int r4 = (int) r6
            goto L_0x0071
        L_0x006b:
            int r6 = r6.g
            float r6 = (float) r6
            float r4 = r4 * r6
            float r4 = r4 + r5
            int r4 = (int) r4
        L_0x0071:
            r3.d(r4)
            goto L_0x00b4
        L_0x0075:
            v.e r4 = r12.f12530b
            v.e r6 = r4.V
            if (r6 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x0080
            w.l r6 = r6.f12055d
            goto L_0x0082
        L_0x0080:
            w.n r6 = r6.f12057e
        L_0x0082:
            w.g r6 = r6.f12533e
            boolean r7 = r6.f12511j
            if (r7 == 0) goto L_0x00b4
            if (r15 != 0) goto L_0x008d
            float r4 = r4.f12086w
            goto L_0x008f
        L_0x008d:
            float r4 = r4.z
        L_0x008f:
            int r6 = r6.g
            float r6 = (float) r6
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
            int r4 = r12.g(r4, r15)
            r3.d(r4)
            goto L_0x00b4
        L_0x009d:
            int r3 = r3.f12514m
            int r3 = r12.g(r3, r15)
            w.g r4 = r12.f12533e
            int r3 = java.lang.Math.min(r3, r14)
            r4.d(r3)
            goto L_0x00b4
        L_0x00ad:
            int r4 = r12.g(r14, r15)
            r3.d(r4)
        L_0x00b4:
            w.g r3 = r12.f12533e
            boolean r4 = r3.f12511j
            if (r4 != 0) goto L_0x00bb
            return
        L_0x00bb:
            int r3 = r3.g
            if (r3 != r14) goto L_0x00ca
            w.f r14 = r12.f12535h
            r14.d(r13)
            w.f r13 = r12.i
            r13.d(r2)
            return
        L_0x00ca:
            v.e r14 = r12.f12530b
            if (r15 != 0) goto L_0x00d1
            float r14 = r14.f12060f0
            goto L_0x00d3
        L_0x00d1:
            float r14 = r14.f12061g0
        L_0x00d3:
            if (r0 != r1) goto L_0x00da
            int r13 = r0.g
            int r2 = r1.g
            r14 = r5
        L_0x00da:
            int r2 = r2 - r13
            int r2 = r2 - r3
            w.f r15 = r12.f12535h
            float r13 = (float) r13
            float r13 = r13 + r5
            float r0 = (float) r2
            float r0 = r0 * r14
            float r0 = r0 + r13
            int r13 = (int) r0
            r15.d(r13)
            w.f r13 = r12.i
            w.f r14 = r12.f12535h
            int r14 = r14.g
            w.g r15 = r12.f12533e
            int r15 = r15.g
            int r14 = r14 + r15
            r13.d(r14)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.p.l(v.d, v.d, int):void");
    }
}
