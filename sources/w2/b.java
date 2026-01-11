package w2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import o2.l;
import o2.t;
import q2.d;
import r2.a;
import r2.c;
import r2.g;
import r2.o;
import s.f;
import t2.f;
import v2.g;
import w2.e;

public abstract class b implements d, a.C0206a, f {

    /* renamed from: a  reason: collision with root package name */
    public final Path f12558a = new Path();

    /* renamed from: b  reason: collision with root package name */
    public final Matrix f12559b = new Matrix();

    /* renamed from: c  reason: collision with root package name */
    public final p2.a f12560c;

    /* renamed from: d  reason: collision with root package name */
    public final p2.a f12561d;

    /* renamed from: e  reason: collision with root package name */
    public final p2.a f12562e;

    /* renamed from: f  reason: collision with root package name */
    public final p2.a f12563f;
    public final p2.a g;

    /* renamed from: h  reason: collision with root package name */
    public final RectF f12564h;
    public final RectF i;

    /* renamed from: j  reason: collision with root package name */
    public final RectF f12565j;

    /* renamed from: k  reason: collision with root package name */
    public final RectF f12566k;

    /* renamed from: l  reason: collision with root package name */
    public final String f12567l;

    /* renamed from: m  reason: collision with root package name */
    public final Matrix f12568m;

    /* renamed from: n  reason: collision with root package name */
    public final l f12569n;

    /* renamed from: o  reason: collision with root package name */
    public final e f12570o;

    /* renamed from: p  reason: collision with root package name */
    public g f12571p;

    /* renamed from: q  reason: collision with root package name */
    public c f12572q;

    /* renamed from: r  reason: collision with root package name */
    public b f12573r;

    /* renamed from: s  reason: collision with root package name */
    public b f12574s;

    /* renamed from: t  reason: collision with root package name */
    public List<b> f12575t;

    /* renamed from: u  reason: collision with root package name */
    public final List<r2.a<?, ?>> f12576u;

    /* renamed from: v  reason: collision with root package name */
    public final o f12577v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f12578w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f12579x;

    /* renamed from: y  reason: collision with root package name */
    public p2.a f12580y;

    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12581a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12582b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|20|21|22|23|24|25|26|27|28|(3:29|30|32)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|20|21|22|23|24|25|26|27|28|29|30|32) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0058 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0062 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        static {
            /*
                v2.g$a[] r0 = v2.g.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12582b = r0
                r1 = 1
                v2.g$a r2 = v2.g.a.MASK_MODE_NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12582b     // Catch:{ NoSuchFieldError -> 0x001d }
                v2.g$a r3 = v2.g.a.MASK_MODE_SUBTRACT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12582b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v2.g$a r4 = v2.g.a.MASK_MODE_INTERSECT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f12582b     // Catch:{ NoSuchFieldError -> 0x0033 }
                v2.g$a r5 = v2.g.a.MASK_MODE_ADD     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                w2.e$a[] r4 = w2.e.a.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f12581a = r4
                w2.e$a r5 = w2.e.a.SHAPE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r1 = f12581a     // Catch:{ NoSuchFieldError -> 0x004e }
                w2.e$a r4 = w2.e.a.PRE_COMP     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f12581a     // Catch:{ NoSuchFieldError -> 0x0058 }
                w2.e$a r1 = w2.e.a.SOLID     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                int[] r0 = f12581a     // Catch:{ NoSuchFieldError -> 0x0062 }
                w2.e$a r1 = w2.e.a.IMAGE     // Catch:{ NoSuchFieldError -> 0x0062 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0062 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0062 }
            L_0x0062:
                int[] r0 = f12581a     // Catch:{ NoSuchFieldError -> 0x006d }
                w2.e$a r1 = w2.e.a.NULL     // Catch:{ NoSuchFieldError -> 0x006d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006d }
            L_0x006d:
                int[] r0 = f12581a     // Catch:{ NoSuchFieldError -> 0x0078 }
                w2.e$a r1 = w2.e.a.TEXT     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12581a     // Catch:{ NoSuchFieldError -> 0x0083 }
                w2.e$a r1 = w2.e.a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0083 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0083 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0083 }
            L_0x0083:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.b.a.<clinit>():void");
        }
    }

    public b(l lVar, e eVar) {
        boolean z = true;
        this.f12560c = new p2.a(1);
        this.f12561d = new p2.a(1, PorterDuff.Mode.DST_IN);
        this.f12562e = new p2.a(1, PorterDuff.Mode.DST_OUT);
        p2.a aVar = new p2.a(1);
        this.f12563f = aVar;
        this.g = new p2.a(PorterDuff.Mode.CLEAR);
        this.f12564h = new RectF();
        this.i = new RectF();
        this.f12565j = new RectF();
        this.f12566k = new RectF();
        this.f12568m = new Matrix();
        this.f12576u = new ArrayList();
        this.f12578w = true;
        this.f12569n = lVar;
        this.f12570o = eVar;
        this.f12567l = android.support.v4.media.a.e(new StringBuilder(), eVar.f12586c, "#draw");
        if (eVar.f12602u == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        u2.l lVar2 = eVar.i;
        Objects.requireNonNull(lVar2);
        o oVar = new o(lVar2);
        this.f12577v = oVar;
        oVar.b(this);
        List<v2.g> list = eVar.f12590h;
        if (list != null && !list.isEmpty()) {
            g gVar = new g(eVar.f12590h);
            this.f12571p = gVar;
            for (r2.a a10 : (List) gVar.f10539a) {
                a10.a(this);
            }
            for (r2.a aVar2 : (List) this.f12571p.f10540b) {
                d(aVar2);
                aVar2.a(this);
            }
        }
        if (!this.f12570o.f12601t.isEmpty()) {
            c cVar = new c(this.f12570o.f12601t);
            this.f12572q = cVar;
            cVar.f10527b = true;
            cVar.a(new a(this));
            r(((Float) this.f12572q.f()).floatValue() != 1.0f ? false : z);
            d(this.f12572q);
            return;
        }
        r(true);
    }

    public void a(RectF rectF, Matrix matrix, boolean z) {
        this.f12564h.set(0.0f, 0.0f, 0.0f, 0.0f);
        h();
        this.f12568m.set(matrix);
        if (z) {
            List<b> list = this.f12575t;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    this.f12568m.preConcat(this.f12575t.get(size).f12577v.e());
                }
            } else {
                b bVar = this.f12574s;
                if (bVar != null) {
                    this.f12568m.preConcat(bVar.f12577v.e());
                }
            }
        }
        this.f12568m.preConcat(this.f12577v.e());
    }

    public final void b() {
        this.f12569n.invalidateSelf();
    }

    public final void c(List<q2.b> list, List<q2.b> list2) {
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<r2.a<?, ?>>, java.util.ArrayList] */
    public final void d(r2.a<?, ?> aVar) {
        if (aVar != null) {
            this.f12576u.add(aVar);
        }
    }

    public final void e(Canvas canvas, Matrix matrix, int i10) {
        int i11;
        float f10;
        p2.a aVar;
        boolean z;
        Canvas canvas2 = canvas;
        Matrix matrix2 = matrix;
        if (!this.f12578w || this.f12570o.f12603v) {
            ad.c.E();
            return;
        }
        h();
        this.f12559b.reset();
        this.f12559b.set(matrix2);
        int i12 = 1;
        for (int size = this.f12575t.size() - 1; size >= 0; size--) {
            this.f12559b.preConcat(this.f12575t.get(size).f12577v.e());
        }
        ad.c.E();
        r2.a<Integer, Integer> aVar2 = this.f12577v.f10557j;
        if (aVar2 == null) {
            i11 = 100;
        } else {
            i11 = aVar2.f().intValue();
        }
        int i13 = (int) ((((((float) i10) / 255.0f) * ((float) i11)) / 100.0f) * 255.0f);
        if (l() || k()) {
            boolean z10 = false;
            a(this.f12564h, this.f12559b, false);
            RectF rectF = this.f12564h;
            if (l() && this.f12570o.f12602u != e.b.INVERT) {
                this.f12565j.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.f12573r.a(this.f12565j, matrix2, true);
                if (!rectF.intersect(this.f12565j)) {
                    rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            this.f12559b.preConcat(this.f12577v.e());
            RectF rectF2 = this.f12564h;
            Matrix matrix3 = this.f12559b;
            this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
            int i14 = 3;
            int i15 = 4;
            if (!k()) {
                f10 = 0.0f;
            } else {
                int size2 = ((List) this.f12571p.f10541c).size();
                int i16 = 0;
                while (true) {
                    if (i16 < size2) {
                        v2.g gVar = (v2.g) ((List) this.f12571p.f10541c).get(i16);
                        this.f12558a.set((Path) ((r2.a) ((List) this.f12571p.f10539a).get(i16)).f());
                        this.f12558a.transform(matrix3);
                        int i17 = a.f12582b[gVar.f12202a.ordinal()];
                        if (i17 == 1 || i17 == 2 || ((i17 == i14 || i17 == i15) && gVar.f12205d)) {
                            break;
                        }
                        this.f12558a.computeBounds(this.f12566k, z10);
                        if (i16 == 0) {
                            this.i.set(this.f12566k);
                        } else {
                            RectF rectF3 = this.i;
                            rectF3.set(Math.min(rectF3.left, this.f12566k.left), Math.min(this.i.top, this.f12566k.top), Math.max(this.i.right, this.f12566k.right), Math.max(this.i.bottom, this.f12566k.bottom));
                        }
                        i16++;
                        z10 = false;
                        i14 = 3;
                        i15 = 4;
                    } else if (!rectF2.intersect(this.i)) {
                        f10 = 0.0f;
                        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                    }
                }
                f10 = 0.0f;
            }
            if (!this.f12564h.intersect(f10, f10, (float) canvas.getWidth(), (float) canvas.getHeight())) {
                this.f12564h.set(f10, f10, f10, f10);
            }
            ad.c.E();
            if (!this.f12564h.isEmpty()) {
                this.f12560c.setAlpha(255);
                RectF rectF4 = this.f12564h;
                p2.a aVar3 = this.f12560c;
                ThreadLocal<PathMeasure> threadLocal = a3.g.f50a;
                canvas2.saveLayer(rectF4, aVar3);
                ad.c.E();
                ad.c.E();
                i(canvas);
                j(canvas2, this.f12559b, i13);
                ad.c.E();
                if (k()) {
                    Matrix matrix4 = this.f12559b;
                    canvas2.saveLayer(this.f12564h, this.f12561d);
                    ad.c.E();
                    if (Build.VERSION.SDK_INT < 28) {
                        i(canvas);
                    }
                    ad.c.E();
                    int i18 = 0;
                    while (i18 < ((List) this.f12571p.f10541c).size()) {
                        v2.g gVar2 = (v2.g) ((List) this.f12571p.f10541c).get(i18);
                        r2.a aVar4 = (r2.a) ((List) this.f12571p.f10539a).get(i18);
                        r2.a aVar5 = (r2.a) ((List) this.f12571p.f10540b).get(i18);
                        int i19 = a.f12582b[gVar2.f12202a.ordinal()];
                        if (i19 == i12) {
                            if (!((List) this.f12571p.f10539a).isEmpty()) {
                                int i20 = 0;
                                while (true) {
                                    if (i20 >= ((List) this.f12571p.f10541c).size()) {
                                        z = true;
                                        break;
                                    } else if (((v2.g) ((List) this.f12571p.f10541c).get(i20)).f12202a != g.a.MASK_MODE_NONE) {
                                        break;
                                    } else {
                                        i20++;
                                    }
                                }
                            }
                            z = false;
                            if (z) {
                                this.f12560c.setAlpha(255);
                                canvas2.drawRect(this.f12564h, this.f12560c);
                            }
                        } else if (i19 == 2) {
                            if (i18 == 0) {
                                this.f12560c.setColor(-16777216);
                                this.f12560c.setAlpha(255);
                                canvas2.drawRect(this.f12564h, this.f12560c);
                            }
                            if (gVar2.f12205d) {
                                RectF rectF5 = this.f12564h;
                                p2.a aVar6 = this.f12562e;
                                ThreadLocal<PathMeasure> threadLocal2 = a3.g.f50a;
                                canvas2.saveLayer(rectF5, aVar6);
                                ad.c.E();
                                canvas2.drawRect(this.f12564h, this.f12560c);
                                this.f12562e.setAlpha((int) (((float) ((Integer) aVar5.f()).intValue()) * 2.55f));
                                this.f12558a.set((Path) aVar4.f());
                                this.f12558a.transform(matrix4);
                                canvas2.drawPath(this.f12558a, this.f12562e);
                                canvas.restore();
                            } else {
                                this.f12558a.set((Path) aVar4.f());
                                this.f12558a.transform(matrix4);
                                canvas2.drawPath(this.f12558a, this.f12562e);
                            }
                        } else if (i19 != 3) {
                            if (i19 == 4) {
                                if (gVar2.f12205d) {
                                    RectF rectF6 = this.f12564h;
                                    p2.a aVar7 = this.f12560c;
                                    ThreadLocal<PathMeasure> threadLocal3 = a3.g.f50a;
                                    canvas2.saveLayer(rectF6, aVar7);
                                    ad.c.E();
                                    canvas2.drawRect(this.f12564h, this.f12560c);
                                    this.f12558a.set((Path) aVar4.f());
                                    this.f12558a.transform(matrix4);
                                    this.f12560c.setAlpha((int) (((float) ((Integer) aVar5.f()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f12558a, this.f12562e);
                                    canvas.restore();
                                } else {
                                    this.f12558a.set((Path) aVar4.f());
                                    this.f12558a.transform(matrix4);
                                    this.f12560c.setAlpha((int) (((float) ((Integer) aVar5.f()).intValue()) * 2.55f));
                                    canvas2.drawPath(this.f12558a, this.f12560c);
                                }
                            }
                        } else if (gVar2.f12205d) {
                            RectF rectF7 = this.f12564h;
                            p2.a aVar8 = this.f12561d;
                            ThreadLocal<PathMeasure> threadLocal4 = a3.g.f50a;
                            canvas2.saveLayer(rectF7, aVar8);
                            ad.c.E();
                            canvas2.drawRect(this.f12564h, this.f12560c);
                            this.f12562e.setAlpha((int) (((float) ((Integer) aVar5.f()).intValue()) * 2.55f));
                            this.f12558a.set((Path) aVar4.f());
                            this.f12558a.transform(matrix4);
                            canvas2.drawPath(this.f12558a, this.f12562e);
                            canvas.restore();
                        } else {
                            RectF rectF8 = this.f12564h;
                            p2.a aVar9 = this.f12561d;
                            ThreadLocal<PathMeasure> threadLocal5 = a3.g.f50a;
                            canvas2.saveLayer(rectF8, aVar9);
                            ad.c.E();
                            this.f12558a.set((Path) aVar4.f());
                            this.f12558a.transform(matrix4);
                            this.f12560c.setAlpha((int) (((float) ((Integer) aVar5.f()).intValue()) * 2.55f));
                            canvas2.drawPath(this.f12558a, this.f12560c);
                            canvas.restore();
                        }
                        i18++;
                        i12 = 1;
                    }
                    canvas.restore();
                    ad.c.E();
                }
                if (l()) {
                    canvas2.saveLayer(this.f12564h, this.f12563f);
                    ad.c.E();
                    ad.c.E();
                    i(canvas);
                    this.f12573r.e(canvas2, matrix2, i13);
                    canvas.restore();
                    ad.c.E();
                    ad.c.E();
                }
                canvas.restore();
                ad.c.E();
            }
            if (this.f12579x && (aVar = this.f12580y) != null) {
                aVar.setStyle(Paint.Style.STROKE);
                this.f12580y.setColor(-251901);
                this.f12580y.setStrokeWidth(4.0f);
                canvas2.drawRect(this.f12564h, this.f12580y);
                this.f12580y.setStyle(Paint.Style.FILL);
                this.f12580y.setColor(1357638635);
                canvas2.drawRect(this.f12564h, this.f12580y);
            }
            ad.c.E();
            m();
            return;
        }
        this.f12559b.preConcat(this.f12577v.e());
        j(canvas2, this.f12559b, i13);
        ad.c.E();
        ad.c.E();
        m();
    }

    public <T> void f(T t10, b3.c cVar) {
        this.f12577v.c(t10, cVar);
    }

    public final void g(t2.e eVar, int i10, List<t2.e> list, t2.e eVar2) {
        if (eVar.e(this.f12570o.f12586c, i10)) {
            if (!"__container".equals(this.f12570o.f12586c)) {
                eVar2 = eVar2.a(this.f12570o.f12586c);
                if (eVar.c(this.f12570o.f12586c, i10)) {
                    list.add(eVar2.g(this));
                }
            }
            if (eVar.f(this.f12570o.f12586c, i10)) {
                o(eVar, eVar.d(this.f12570o.f12586c, i10) + i10, list, eVar2);
            }
        }
    }

    public final String getName() {
        return this.f12570o.f12586c;
    }

    public final void h() {
        if (this.f12575t == null) {
            if (this.f12574s == null) {
                this.f12575t = Collections.emptyList();
                return;
            }
            this.f12575t = new ArrayList();
            for (b bVar = this.f12574s; bVar != null; bVar = bVar.f12574s) {
                this.f12575t.add(bVar);
            }
        }
    }

    public final void i(Canvas canvas) {
        RectF rectF = this.f12564h;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.g);
        ad.c.E();
    }

    public abstract void j(Canvas canvas, Matrix matrix, int i10);

    public final boolean k() {
        r2.g gVar = this.f12571p;
        return gVar != null && !((List) gVar.f10539a).isEmpty();
    }

    public final boolean l() {
        return this.f12573r != null;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, a3.e>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Set<o2.t$a>, s.c] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, a3.e>, java.util.HashMap] */
    public final void m() {
        t tVar = this.f12569n.f9228b.f9197a;
        String str = this.f12570o.f12586c;
        if (tVar.f9301a) {
            a3.e eVar = (a3.e) tVar.f9303c.get(str);
            if (eVar == null) {
                eVar = new a3.e();
                tVar.f9303c.put(str, eVar);
            }
            int i10 = eVar.f48a + 1;
            eVar.f48a = i10;
            if (i10 == Integer.MAX_VALUE) {
                eVar.f48a = i10 / 2;
            }
            if (str.equals("__container")) {
                Iterator it = tVar.f9302b.iterator();
                while (true) {
                    f.a aVar = (f.a) it;
                    if (aVar.hasNext()) {
                        ((t.a) aVar.next()).a();
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<r2.a<?, ?>>, java.util.ArrayList] */
    public final void n(r2.a<?, ?> aVar) {
        this.f12576u.remove(aVar);
    }

    public void o(t2.e eVar, int i10, List<t2.e> list, t2.e eVar2) {
    }

    public void p(boolean z) {
        if (z && this.f12580y == null) {
            this.f12580y = new p2.a();
        }
        this.f12579x = z;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.List<r2.a<?, ?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.util.List<r2.a<?, ?>>, java.util.ArrayList] */
    public void q(float f10) {
        o oVar = this.f12577v;
        r2.a<Integer, Integer> aVar = oVar.f10557j;
        if (aVar != null) {
            aVar.i(f10);
        }
        r2.a<?, Float> aVar2 = oVar.f10560m;
        if (aVar2 != null) {
            aVar2.i(f10);
        }
        r2.a<?, Float> aVar3 = oVar.f10561n;
        if (aVar3 != null) {
            aVar3.i(f10);
        }
        r2.a<PointF, PointF> aVar4 = oVar.f10555f;
        if (aVar4 != null) {
            aVar4.i(f10);
        }
        r2.a<?, PointF> aVar5 = oVar.g;
        if (aVar5 != null) {
            aVar5.i(f10);
        }
        r2.a<b3.d, b3.d> aVar6 = oVar.f10556h;
        if (aVar6 != null) {
            aVar6.i(f10);
        }
        r2.a<Float, Float> aVar7 = oVar.i;
        if (aVar7 != null) {
            aVar7.i(f10);
        }
        c cVar = oVar.f10558k;
        if (cVar != null) {
            cVar.i(f10);
        }
        c cVar2 = oVar.f10559l;
        if (cVar2 != null) {
            cVar2.i(f10);
        }
        if (this.f12571p != null) {
            for (int i10 = 0; i10 < ((List) this.f12571p.f10539a).size(); i10++) {
                ((r2.a) ((List) this.f12571p.f10539a).get(i10)).i(f10);
            }
        }
        float f11 = this.f12570o.f12594m;
        if (f11 != 0.0f) {
            f10 /= f11;
        }
        c cVar3 = this.f12572q;
        if (cVar3 != null) {
            cVar3.i(f10 / f11);
        }
        b bVar = this.f12573r;
        if (bVar != null) {
            bVar.q(bVar.f12570o.f12594m * f10);
        }
        for (int i11 = 0; i11 < this.f12576u.size(); i11++) {
            ((r2.a) this.f12576u.get(i11)).i(f10);
        }
    }

    public final void r(boolean z) {
        if (z != this.f12578w) {
            this.f12578w = z;
            this.f12569n.invalidateSelf();
        }
    }
}
