package w;

import v.e;
import w.f;

public final class n extends p {

    /* renamed from: k  reason: collision with root package name */
    public f f12520k;

    /* renamed from: l  reason: collision with root package name */
    public a f12521l = null;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12522a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w.p$b[] r0 = w.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12522a = r0
                w.p$b r1 = w.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12522a     // Catch:{ NoSuchFieldError -> 0x001d }
                w.p$b r1 = w.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12522a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w.p$b r1 = w.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w.n.a.<clinit>():void");
        }
    }

    public n(e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f12520k = fVar;
        this.f12535h.f12508e = f.a.TOP;
        this.i.f12508e = f.a.BOTTOM;
        fVar.f12508e = f.a.BASELINE;
        this.f12534f = 1;
    }

    /* JADX WARNING: type inference failed for: r9v15, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v21, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v33, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v36, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v39, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r9v49, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v27, types: [java.util.List<w.f>, java.util.ArrayList] */
    public final void a(d dVar) {
        int i;
        float f10;
        float f11;
        float f12;
        if (a.f12522a[this.f12536j.ordinal()] != 3) {
            g gVar = this.f12533e;
            if (gVar.f12506c && !gVar.f12511j && this.f12532d == e.b.MATCH_CONSTRAINT) {
                e eVar = this.f12530b;
                int i10 = eVar.f12082s;
                if (i10 == 2) {
                    e eVar2 = eVar.V;
                    if (eVar2 != null) {
                        g gVar2 = eVar2.f12057e.f12533e;
                        if (gVar2.f12511j) {
                            gVar.d((int) ((((float) gVar2.g) * eVar.z) + 0.5f));
                        }
                    }
                } else if (i10 == 3) {
                    g gVar3 = eVar.f12055d.f12533e;
                    if (gVar3.f12511j) {
                        int i11 = eVar.Z;
                        if (i11 == -1) {
                            f12 = (float) gVar3.g;
                            f11 = eVar.Y;
                        } else if (i11 == 0) {
                            f10 = ((float) gVar3.g) * eVar.Y;
                            i = (int) (f10 + 0.5f);
                            gVar.d(i);
                        } else if (i11 != 1) {
                            i = 0;
                            gVar.d(i);
                        } else {
                            f12 = (float) gVar3.g;
                            f11 = eVar.Y;
                        }
                        f10 = f12 / f11;
                        i = (int) (f10 + 0.5f);
                        gVar.d(i);
                    }
                }
            }
            f fVar = this.f12535h;
            if (fVar.f12506c) {
                f fVar2 = this.i;
                if (fVar2.f12506c) {
                    if (!fVar.f12511j || !fVar2.f12511j || !this.f12533e.f12511j) {
                        if (!this.f12533e.f12511j && this.f12532d == e.b.MATCH_CONSTRAINT) {
                            e eVar3 = this.f12530b;
                            if (eVar3.f12081r == 0 && !eVar3.z()) {
                                int i12 = ((f) this.f12535h.f12513l.get(0)).g;
                                f fVar3 = this.f12535h;
                                int i13 = i12 + fVar3.f12509f;
                                int i14 = ((f) this.i.f12513l.get(0)).g + this.i.f12509f;
                                fVar3.d(i13);
                                this.i.d(i14);
                                this.f12533e.d(i14 - i13);
                                return;
                            }
                        }
                        if (!this.f12533e.f12511j && this.f12532d == e.b.MATCH_CONSTRAINT && this.f12529a == 1 && this.f12535h.f12513l.size() > 0 && this.i.f12513l.size() > 0) {
                            int i15 = (((f) this.i.f12513l.get(0)).g + this.i.f12509f) - (((f) this.f12535h.f12513l.get(0)).g + this.f12535h.f12509f);
                            g gVar4 = this.f12533e;
                            int i16 = gVar4.f12514m;
                            if (i15 < i16) {
                                gVar4.d(i15);
                            } else {
                                gVar4.d(i16);
                            }
                        }
                        if (this.f12533e.f12511j && this.f12535h.f12513l.size() > 0 && this.i.f12513l.size() > 0) {
                            f fVar4 = (f) this.f12535h.f12513l.get(0);
                            f fVar5 = (f) this.i.f12513l.get(0);
                            int i17 = fVar4.g;
                            f fVar6 = this.f12535h;
                            int i18 = fVar6.f12509f + i17;
                            int i19 = fVar5.g;
                            int i20 = this.i.f12509f + i19;
                            float f13 = this.f12530b.f12061g0;
                            if (fVar4 == fVar5) {
                                f13 = 0.5f;
                            } else {
                                i17 = i18;
                                i19 = i20;
                            }
                            fVar6.d((int) ((((float) ((i19 - i17) - this.f12533e.g)) * f13) + ((float) i17) + 0.5f));
                            this.i.d(this.f12535h.g + this.f12533e.g);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        e eVar4 = this.f12530b;
        l(eVar4.K, eVar4.M, 1);
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v17, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v41, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v43, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v57, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v58, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v60, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v51, types: [java.util.List<w.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v67, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v69, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v71, types: [java.util.List<w.d>, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0096, code lost:
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
            int r0 = r0.k()
            r1.d(r0)
        L_0x000f:
            w.g r0 = r9.f12533e
            boolean r0 = r0.f12511j
            r1 = 1
            if (r0 != 0) goto L_0x0090
            v.e r0 = r9.f12530b
            v.e$b[] r2 = r0.U
            r2 = r2[r1]
            r9.f12532d = r2
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0029
            w.a r0 = new w.a
            r0.<init>(r9)
            r9.f12521l = r0
        L_0x0029:
            v.e$b r0 = r9.f12532d
            v.e$b r2 = v.e.b.MATCH_CONSTRAINT
            if (r0 == r2) goto L_0x00c6
            v.e$b r2 = v.e.b.MATCH_PARENT
            if (r0 != r2) goto L_0x0080
            v.e r2 = r9.f12530b
            v.e r2 = r2.V
            if (r2 == 0) goto L_0x0080
            v.e$b[] r3 = r2.U
            r3 = r3[r1]
            v.e$b r4 = v.e.b.FIXED
            if (r3 != r4) goto L_0x0080
            int r0 = r2.k()
            v.e r1 = r9.f12530b
            v.d r1 = r1.K
            int r1 = r1.d()
            int r0 = r0 - r1
            v.e r1 = r9.f12530b
            v.d r1 = r1.M
            int r1 = r1.d()
            int r0 = r0 - r1
            w.f r1 = r9.f12535h
            w.n r3 = r2.f12057e
            w.f r3 = r3.f12535h
            v.e r4 = r9.f12530b
            v.d r4 = r4.K
            int r4 = r4.d()
            r9.b(r1, r3, r4)
            w.f r1 = r9.i
            w.n r2 = r2.f12057e
            w.f r2 = r2.i
            v.e r3 = r9.f12530b
            v.d r3 = r3.M
            int r3 = r3.d()
            int r3 = -r3
            r9.b(r1, r2, r3)
            w.g r1 = r9.f12533e
            r1.d(r0)
            return
        L_0x0080:
            v.e$b r2 = v.e.b.FIXED
            if (r0 != r2) goto L_0x00c6
            w.g r0 = r9.f12533e
            v.e r2 = r9.f12530b
            int r2 = r2.k()
            r0.d(r2)
            goto L_0x00c6
        L_0x0090:
            v.e$b r0 = r9.f12532d
            v.e$b r2 = v.e.b.MATCH_PARENT
            if (r0 != r2) goto L_0x00c6
            v.e r0 = r9.f12530b
            v.e r2 = r0.V
            if (r2 == 0) goto L_0x00c6
            v.e$b[] r3 = r2.U
            r3 = r3[r1]
            v.e$b r4 = v.e.b.FIXED
            if (r3 != r4) goto L_0x00c6
            w.f r1 = r9.f12535h
            w.n r3 = r2.f12057e
            w.f r3 = r3.f12535h
            v.d r0 = r0.K
            int r0 = r0.d()
            r9.b(r1, r3, r0)
            w.f r0 = r9.i
            w.n r1 = r2.f12057e
            w.f r1 = r1.i
            v.e r2 = r9.f12530b
            v.d r2 = r2.M
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r0, r1, r2)
            return
        L_0x00c6:
            w.g r0 = r9.f12533e
            boolean r2 = r0.f12511j
            r3 = 0
            r4 = 4
            r5 = 2
            r6 = 3
            if (r2 == 0) goto L_0x0237
            v.e r7 = r9.f12530b
            boolean r8 = r7.f12050a
            if (r8 == 0) goto L_0x0237
            v.d[] r0 = r7.R
            r2 = r0[r5]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x0158
            r2 = r0[r6]
            v.d r2 = r2.f12047f
            if (r2 == 0) goto L_0x0158
            boolean r0 = r7.z()
            if (r0 == 0) goto L_0x0108
            w.f r0 = r9.f12535h
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r5]
            int r1 = r1.d()
            r0.f12509f = r1
            w.f r0 = r9.i
            v.e r1 = r9.f12530b
            v.d[] r1 = r1.R
            r1 = r1[r6]
            int r1 = r1.d()
            int r1 = -r1
            r0.f12509f = r1
            goto L_0x0147
        L_0x0108:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r5]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0123
            w.f r2 = r9.f12535h
            v.e r3 = r9.f12530b
            v.d[] r3 = r3.R
            r3 = r3[r5]
            int r3 = r3.d()
            r9.b(r2, r0, r3)
        L_0x0123:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r6]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x013f
            w.f r2 = r9.i
            v.e r3 = r9.f12530b
            v.d[] r3 = r3.R
            r3 = r3[r6]
            int r3 = r3.d()
            int r3 = -r3
            r9.b(r2, r0, r3)
        L_0x013f:
            w.f r0 = r9.f12535h
            r0.f12505b = r1
            w.f r0 = r9.i
            r0.f12505b = r1
        L_0x0147:
            v.e r0 = r9.f12530b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x043e
            w.f r1 = r9.f12520k
            w.f r2 = r9.f12535h
            int r0 = r0.f12054c0
            r9.b(r1, r2, r0)
            goto L_0x043e
        L_0x0158:
            r1 = r0[r5]
            v.d r1 = r1.f12047f
            if (r1 == 0) goto L_0x0191
            r0 = r0[r5]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x043e
            w.f r1 = r9.f12535h
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r5]
            int r2 = r2.d()
            r9.b(r1, r0, r2)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            v.e r0 = r9.f12530b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x043e
            w.f r1 = r9.f12520k
            w.f r2 = r9.f12535h
            int r0 = r0.f12054c0
            r9.b(r1, r2, r0)
            goto L_0x043e
        L_0x0191:
            r1 = r0[r6]
            v.d r1 = r1.f12047f
            if (r1 == 0) goto L_0x01cc
            r0 = r0[r6]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x01bb
            w.f r1 = r9.i
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.d()
            int r2 = -r2
            r9.b(r1, r0, r2)
            w.f r0 = r9.f12535h
            w.f r1 = r9.i
            w.g r2 = r9.f12533e
            int r2 = r2.g
            int r2 = -r2
            r9.b(r0, r1, r2)
        L_0x01bb:
            v.e r0 = r9.f12530b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x043e
            w.f r1 = r9.f12520k
            w.f r2 = r9.f12535h
            int r0 = r0.f12054c0
            r9.b(r1, r2, r0)
            goto L_0x043e
        L_0x01cc:
            r1 = r0[r4]
            v.d r1 = r1.f12047f
            if (r1 == 0) goto L_0x01f8
            r0 = r0[r4]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x043e
            w.f r1 = r9.f12520k
            r9.b(r1, r0, r3)
            w.f r0 = r9.f12535h
            w.f r1 = r9.f12520k
            v.e r2 = r9.f12530b
            int r2 = r2.f12054c0
            int r2 = -r2
            r9.b(r0, r1, r2)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            goto L_0x043e
        L_0x01f8:
            boolean r0 = r7 instanceof v.h
            if (r0 != 0) goto L_0x043e
            v.e r0 = r7.V
            if (r0 == 0) goto L_0x043e
            v.d$b r0 = v.d.b.CENTER
            v.d r0 = r7.h(r0)
            v.d r0 = r0.f12047f
            if (r0 != 0) goto L_0x043e
            v.e r0 = r9.f12530b
            v.e r1 = r0.V
            w.n r1 = r1.f12057e
            w.f r1 = r1.f12535h
            w.f r2 = r9.f12535h
            int r0 = r0.t()
            r9.b(r2, r1, r0)
            w.f r0 = r9.i
            w.f r1 = r9.f12535h
            w.g r2 = r9.f12533e
            int r2 = r2.g
            r9.b(r0, r1, r2)
            v.e r0 = r9.f12530b
            boolean r1 = r0.E
            if (r1 == 0) goto L_0x043e
            w.f r1 = r9.f12520k
            w.f r2 = r9.f12535h
            int r0 = r0.f12054c0
            r9.b(r1, r2, r0)
            goto L_0x043e
        L_0x0237:
            if (r2 != 0) goto L_0x02a6
            v.e$b r2 = r9.f12532d
            v.e$b r7 = v.e.b.MATCH_CONSTRAINT
            if (r2 != r7) goto L_0x02a6
            v.e r2 = r9.f12530b
            int r7 = r2.f12082s
            if (r7 == r5) goto L_0x027c
            if (r7 == r6) goto L_0x0248
            goto L_0x02a9
        L_0x0248:
            boolean r0 = r2.z()
            if (r0 != 0) goto L_0x02a9
            v.e r0 = r9.f12530b
            int r2 = r0.f12081r
            if (r2 != r6) goto L_0x0255
            goto L_0x02a9
        L_0x0255:
            w.l r0 = r0.f12055d
            w.g r0 = r0.f12533e
            w.g r2 = r9.f12533e
            java.util.List<w.f> r2 = r2.f12513l
            r2.add(r0)
            java.util.List<w.d> r0 = r0.f12512k
            w.g r2 = r9.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            r0.f12505b = r1
            java.util.List<w.d> r0 = r0.f12512k
            w.f r2 = r9.f12535h
            r0.add(r2)
            w.g r0 = r9.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.f r2 = r9.i
            r0.add(r2)
            goto L_0x02a9
        L_0x027c:
            v.e r2 = r2.V
            if (r2 != 0) goto L_0x0281
            goto L_0x02a9
        L_0x0281:
            w.n r2 = r2.f12057e
            w.g r2 = r2.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            r0.add(r2)
            java.util.List<w.d> r0 = r2.f12512k
            w.g r2 = r9.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            r0.f12505b = r1
            java.util.List<w.d> r0 = r0.f12512k
            w.f r2 = r9.f12535h
            r0.add(r2)
            w.g r0 = r9.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.f r2 = r9.i
            r0.add(r2)
            goto L_0x02a9
        L_0x02a6:
            r0.b(r9)
        L_0x02a9:
            v.e r0 = r9.f12530b
            v.d[] r2 = r0.R
            r7 = r2[r5]
            v.d r7 = r7.f12047f
            if (r7 == 0) goto L_0x0310
            r7 = r2[r6]
            v.d r7 = r7.f12047f
            if (r7 == 0) goto L_0x0310
            boolean r0 = r0.z()
            if (r0 == 0) goto L_0x02dd
            w.f r0 = r9.f12535h
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r5]
            int r2 = r2.d()
            r0.f12509f = r2
            w.f r0 = r9.i
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r6]
            int r2 = r2.d()
            int r2 = -r2
            r0.f12509f = r2
            goto L_0x02ff
        L_0x02dd:
            v.e r0 = r9.f12530b
            v.d[] r0 = r0.R
            r0 = r0[r5]
            w.f r0 = r9.h(r0)
            v.e r2 = r9.f12530b
            v.d[] r2 = r2.R
            r2 = r2[r6]
            w.f r2 = r9.h(r2)
            if (r0 == 0) goto L_0x02f6
            r0.b(r9)
        L_0x02f6:
            if (r2 == 0) goto L_0x02fb
            r2.b(r9)
        L_0x02fb:
            w.p$b r0 = w.p.b.CENTER
            r9.f12536j = r0
        L_0x02ff:
            v.e r0 = r9.f12530b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0430
            w.f r0 = r9.f12520k
            w.f r2 = r9.f12535h
            w.a r3 = r9.f12521l
            r9.c(r0, r2, r1, r3)
            goto L_0x0430
        L_0x0310:
            r7 = r2[r5]
            v.d r7 = r7.f12047f
            r8 = 0
            if (r7 == 0) goto L_0x0376
            r0 = r2[r5]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0430
            w.f r2 = r9.f12535h
            v.e r3 = r9.f12530b
            v.d[] r3 = r3.R
            r3 = r3[r5]
            int r3 = r3.d()
            r9.b(r2, r0, r3)
            w.f r0 = r9.i
            w.f r2 = r9.f12535h
            w.g r3 = r9.f12533e
            r9.c(r0, r2, r1, r3)
            v.e r0 = r9.f12530b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0346
            w.f r0 = r9.f12520k
            w.f r2 = r9.f12535h
            w.a r3 = r9.f12521l
            r9.c(r0, r2, r1, r3)
        L_0x0346:
            v.e$b r0 = r9.f12532d
            v.e$b r2 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0430
            v.e r0 = r9.f12530b
            float r3 = r0.Y
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0430
            w.l r0 = r0.f12055d
            v.e$b r3 = r0.f12532d
            if (r3 != r2) goto L_0x0430
            w.g r0 = r0.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.g r2 = r9.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            v.e r2 = r9.f12530b
            w.l r2 = r2.f12055d
            w.g r2 = r2.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            r0.f12504a = r9
            goto L_0x0430
        L_0x0376:
            r5 = r2[r6]
            v.d r5 = r5.f12047f
            r7 = -1
            if (r5 == 0) goto L_0x03af
            r0 = r2[r6]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0430
            w.f r2 = r9.i
            v.e r3 = r9.f12530b
            v.d[] r3 = r3.R
            r3 = r3[r6]
            int r3 = r3.d()
            int r3 = -r3
            r9.b(r2, r0, r3)
            w.f r0 = r9.f12535h
            w.f r2 = r9.i
            w.g r3 = r9.f12533e
            r9.c(r0, r2, r7, r3)
            v.e r0 = r9.f12530b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0430
            w.f r0 = r9.f12520k
            w.f r2 = r9.f12535h
            w.a r3 = r9.f12521l
            r9.c(r0, r2, r1, r3)
            goto L_0x0430
        L_0x03af:
            r5 = r2[r4]
            v.d r5 = r5.f12047f
            if (r5 == 0) goto L_0x03d5
            r0 = r2[r4]
            w.f r0 = r9.h(r0)
            if (r0 == 0) goto L_0x0430
            w.f r2 = r9.f12520k
            r9.b(r2, r0, r3)
            w.f r0 = r9.f12535h
            w.f r2 = r9.f12520k
            w.a r3 = r9.f12521l
            r9.c(r0, r2, r7, r3)
            w.f r0 = r9.i
            w.f r2 = r9.f12535h
            w.g r3 = r9.f12533e
            r9.c(r0, r2, r1, r3)
            goto L_0x0430
        L_0x03d5:
            boolean r2 = r0 instanceof v.h
            if (r2 != 0) goto L_0x0430
            v.e r2 = r0.V
            if (r2 == 0) goto L_0x0430
            w.n r2 = r2.f12057e
            w.f r2 = r2.f12535h
            w.f r3 = r9.f12535h
            int r0 = r0.t()
            r9.b(r3, r2, r0)
            w.f r0 = r9.i
            w.f r2 = r9.f12535h
            w.g r3 = r9.f12533e
            r9.c(r0, r2, r1, r3)
            v.e r0 = r9.f12530b
            boolean r0 = r0.E
            if (r0 == 0) goto L_0x0402
            w.f r0 = r9.f12520k
            w.f r2 = r9.f12535h
            w.a r3 = r9.f12521l
            r9.c(r0, r2, r1, r3)
        L_0x0402:
            v.e$b r0 = r9.f12532d
            v.e$b r2 = v.e.b.MATCH_CONSTRAINT
            if (r0 != r2) goto L_0x0430
            v.e r0 = r9.f12530b
            float r3 = r0.Y
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 <= 0) goto L_0x0430
            w.l r0 = r0.f12055d
            v.e$b r3 = r0.f12532d
            if (r3 != r2) goto L_0x0430
            w.g r0 = r0.f12533e
            java.util.List<w.d> r0 = r0.f12512k
            w.g r2 = r9.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            v.e r2 = r9.f12530b
            w.l r2 = r2.f12055d
            w.g r2 = r2.f12533e
            r0.add(r2)
            w.g r0 = r9.f12533e
            r0.f12504a = r9
        L_0x0430:
            w.g r0 = r9.f12533e
            java.util.List<w.f> r0 = r0.f12513l
            int r0 = r0.size()
            if (r0 != 0) goto L_0x043e
            w.g r0 = r9.f12533e
            r0.f12506c = r1
        L_0x043e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.d():void");
    }

    public final void e() {
        f fVar = this.f12535h;
        if (fVar.f12511j) {
            this.f12530b.b0 = fVar.g;
        }
    }

    public final void f() {
        this.f12531c = null;
        this.f12535h.c();
        this.i.c();
        this.f12520k.c();
        this.f12533e.c();
        this.g = false;
    }

    public final boolean k() {
        if (this.f12532d != e.b.MATCH_CONSTRAINT || this.f12530b.f12082s == 0) {
            return true;
        }
        return false;
    }

    public final void m() {
        this.g = false;
        this.f12535h.c();
        this.f12535h.f12511j = false;
        this.i.c();
        this.i.f12511j = false;
        this.f12520k.c();
        this.f12520k.f12511j = false;
        this.f12533e.f12511j = false;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("VerticalRun ");
        d10.append(this.f12530b.f12066j0);
        return d10.toString();
    }
}
