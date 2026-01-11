package v;

import t.b;
import t.d;
import v.d;
import v.e;

public final class g extends e {

    /* renamed from: r0  reason: collision with root package name */
    public float f12098r0 = -1.0f;

    /* renamed from: s0  reason: collision with root package name */
    public int f12099s0 = -1;

    /* renamed from: t0  reason: collision with root package name */
    public int f12100t0 = -1;

    /* renamed from: u0  reason: collision with root package name */
    public d f12101u0 = this.K;

    /* renamed from: v0  reason: collision with root package name */
    public int f12102v0;

    /* renamed from: w0  reason: collision with root package name */
    public boolean f12103w0;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12104a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                v.d$b[] r0 = v.d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12104a = r0
                v.d$b r1 = v.d.b.LEFT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x001d }
                v.d$b r1 = v.d.b.RIGHT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x0028 }
                v.d$b r1 = v.d.b.TOP     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x0033 }
                v.d$b r1 = v.d.b.BOTTOM     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x003e }
                v.d$b r1 = v.d.b.BASELINE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x0049 }
                v.d$b r1 = v.d.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x0054 }
                v.d$b r1 = v.d.b.CENTER_X     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x0060 }
                v.d$b r1 = v.d.b.CENTER_Y     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12104a     // Catch:{ NoSuchFieldError -> 0x006c }
                v.d$b r1 = v.d.b.NONE     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v.g.a.<clinit>():void");
        }
    }

    public g() {
        this.f12102v0 = 0;
        this.S.clear();
        this.S.add(this.f12101u0);
        int length = this.R.length;
        for (int i = 0; i < length; i++) {
            this.R[i] = this.f12101u0;
        }
    }

    public final boolean B() {
        return this.f12103w0;
    }

    public final boolean C() {
        return this.f12103w0;
    }

    public final void S(d dVar, boolean z) {
        if (this.V != null) {
            int o4 = dVar.o(this.f12101u0);
            if (this.f12102v0 == 1) {
                this.f12051a0 = o4;
                this.b0 = 0;
                L(this.V.k());
                Q(0);
                return;
            }
            this.f12051a0 = 0;
            this.b0 = o4;
            Q(this.V.r());
            L(0);
        }
    }

    public final void T(int i) {
        this.f12101u0.j(i);
        this.f12103w0 = true;
    }

    public final void U(int i) {
        if (this.f12102v0 != i) {
            this.f12102v0 = i;
            this.S.clear();
            if (this.f12102v0 == 1) {
                this.f12101u0 = this.J;
            } else {
                this.f12101u0 = this.K;
            }
            this.S.add(this.f12101u0);
            int length = this.R.length;
            for (int i10 = 0; i10 < length; i10++) {
                this.R[i10] = this.f12101u0;
            }
        }
    }

    public final void c(d dVar, boolean z) {
        f fVar = (f) this.V;
        if (fVar != null) {
            d h10 = fVar.h(d.b.LEFT);
            d h11 = fVar.h(d.b.RIGHT);
            e eVar = this.V;
            boolean z10 = true;
            boolean z11 = eVar != null && eVar.U[0] == e.b.WRAP_CONTENT;
            if (this.f12102v0 == 0) {
                h10 = fVar.h(d.b.TOP);
                h11 = fVar.h(d.b.BOTTOM);
                e eVar2 = this.V;
                if (eVar2 == null || eVar2.U[1] != e.b.WRAP_CONTENT) {
                    z10 = false;
                }
                z11 = z10;
            }
            if (this.f12103w0) {
                d dVar2 = this.f12101u0;
                if (dVar2.f12044c) {
                    t.g l10 = dVar.l(dVar2);
                    dVar.e(l10, this.f12101u0.c());
                    if (this.f12099s0 != -1) {
                        if (z11) {
                            dVar.f(dVar.l(h11), l10, 0, 5);
                        }
                    } else if (this.f12100t0 != -1 && z11) {
                        t.g l11 = dVar.l(h11);
                        dVar.f(l10, dVar.l(h10), 0, 5);
                        dVar.f(l11, l10, 0, 5);
                    }
                    this.f12103w0 = false;
                    return;
                }
            }
            if (this.f12099s0 != -1) {
                t.g l12 = dVar.l(this.f12101u0);
                dVar.d(l12, dVar.l(h10), this.f12099s0, 8);
                if (z11) {
                    dVar.f(dVar.l(h11), l12, 0, 5);
                }
            } else if (this.f12100t0 != -1) {
                t.g l13 = dVar.l(this.f12101u0);
                t.g l14 = dVar.l(h11);
                dVar.d(l13, l14, -this.f12100t0, 8);
                if (z11) {
                    dVar.f(l13, dVar.l(h10), 0, 5);
                    dVar.f(l14, l13, 0, 5);
                }
            } else if (this.f12098r0 != -1.0f) {
                t.g l15 = dVar.l(this.f12101u0);
                t.g l16 = dVar.l(h11);
                float f10 = this.f12098r0;
                b m10 = dVar.m();
                m10.f11163d.d(l15, -1.0f);
                m10.f11163d.d(l16, f10);
                dVar.c(m10);
            }
        }
    }

    public final boolean d() {
        return true;
    }

    public final d h(d.b bVar) {
        int i = a.f12104a[bVar.ordinal()];
        if (i == 1 || i == 2) {
            if (this.f12102v0 == 1) {
                return this.f12101u0;
            }
            return null;
        } else if ((i == 3 || i == 4) && this.f12102v0 == 0) {
            return this.f12101u0;
        } else {
            return null;
        }
    }
}
