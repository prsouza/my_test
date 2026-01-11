package w2;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o2.f;
import o2.l;
import o2.p;
import r2.n;
import t2.b;
import t2.d;
import u2.k;

public final class i extends b {
    public final RectF A = new RectF();
    public final Matrix B = new Matrix();
    public final a C = new a();
    public final b D = new b();
    public final Map<d, List<q2.c>> E = new HashMap();
    public final s.d<String> F = new s.d<>();
    public final n G;
    public final l H;
    public final f I;
    public r2.a<Integer, Integer> J;
    public r2.a<Integer, Integer> K;
    public r2.a<Integer, Integer> L;
    public r2.a<Integer, Integer> M;
    public r2.a<Float, Float> N;
    public r2.a<Float, Float> O;
    public r2.a<Float, Float> P;
    public r2.a<Float, Float> Q;
    public r2.a<Float, Float> R;
    public final StringBuilder z = new StringBuilder(2);

    public class a extends Paint {
        public a() {
            super(1);
            setStyle(Paint.Style.FILL);
        }
    }

    public class b extends Paint {
        public b() {
            super(1);
            setStyle(Paint.Style.STROKE);
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12604a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                t2.b$a[] r0 = t2.b.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12604a = r0
                t2.b$a r1 = t2.b.a.LEFT_ALIGN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12604a     // Catch:{ NoSuchFieldError -> 0x001d }
                t2.b$a r1 = t2.b.a.RIGHT_ALIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12604a     // Catch:{ NoSuchFieldError -> 0x0028 }
                t2.b$a r1 = t2.b.a.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: w2.i.c.<clinit>():void");
        }
    }

    public i(l lVar, e eVar) {
        super(lVar, eVar);
        u2.b bVar;
        u2.b bVar2;
        u2.a aVar;
        u2.a aVar2;
        this.H = lVar;
        this.I = eVar.f12585b;
        n nVar = new n((List) eVar.f12598q.f11678b);
        this.G = nVar;
        nVar.a(this);
        d(nVar);
        k kVar = eVar.f12599r;
        if (!(kVar == null || (aVar2 = kVar.f11666a) == null)) {
            r2.a<Integer, Integer> a10 = aVar2.a();
            this.J = (r2.b) a10;
            a10.a(this);
            d(this.J);
        }
        if (!(kVar == null || (aVar = kVar.f11667b) == null)) {
            r2.a<Integer, Integer> a11 = aVar.a();
            this.L = (r2.b) a11;
            a11.a(this);
            d(this.L);
        }
        if (!(kVar == null || (bVar2 = kVar.f11668c) == null)) {
            r2.a<Float, Float> a12 = bVar2.a();
            this.N = (r2.c) a12;
            a12.a(this);
            d(this.N);
        }
        if (kVar != null && (bVar = kVar.f11669d) != null) {
            r2.a<Float, Float> a13 = bVar.a();
            this.P = (r2.c) a13;
            a13.a(this);
            d(this.P);
        }
    }

    public final void a(RectF rectF, Matrix matrix, boolean z10) {
        super.a(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, (float) this.I.f9204j.width(), (float) this.I.f9204j.height());
    }

    public final <T> void f(T t10, b3.c cVar) {
        super.f(t10, cVar);
        if (t10 == p.f9269a) {
            r2.a<Integer, Integer> aVar = this.K;
            if (aVar != null) {
                n(aVar);
            }
            if (cVar == null) {
                this.K = null;
                return;
            }
            r2.p pVar = new r2.p(cVar, null);
            this.K = pVar;
            pVar.a(this);
            d(this.K);
        } else if (t10 == p.f9270b) {
            r2.a<Integer, Integer> aVar2 = this.M;
            if (aVar2 != null) {
                n(aVar2);
            }
            if (cVar == null) {
                this.M = null;
                return;
            }
            r2.p pVar2 = new r2.p(cVar, null);
            this.M = pVar2;
            pVar2.a(this);
            d(this.M);
        } else if (t10 == p.f9281o) {
            r2.a<Float, Float> aVar3 = this.O;
            if (aVar3 != null) {
                n(aVar3);
            }
            if (cVar == null) {
                this.O = null;
                return;
            }
            r2.p pVar3 = new r2.p(cVar, null);
            this.O = pVar3;
            pVar3.a(this);
            d(this.O);
        } else if (t10 == p.f9282p) {
            r2.a<Float, Float> aVar4 = this.Q;
            if (aVar4 != null) {
                n(aVar4);
            }
            if (cVar == null) {
                this.Q = null;
                return;
            }
            r2.p pVar4 = new r2.p(cVar, null);
            this.Q = pVar4;
            pVar4.a(this);
            d(this.Q);
        } else if (t10 == p.B) {
            r2.a<Float, Float> aVar5 = this.R;
            if (aVar5 != null) {
                n(aVar5);
            }
            if (cVar == null) {
                this.R = null;
                return;
            }
            r2.p pVar5 = new r2.p(cVar, null);
            this.R = pVar5;
            pVar5.a(this);
            d(this.R);
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [r2.p, r2.a<java.lang.Integer, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r5v2, types: [r2.p, r2.a<java.lang.Integer, java.lang.Integer>] */
    /* JADX WARNING: type inference failed for: r5v8, types: [r2.a<java.lang.Float, java.lang.Float>, r2.p] */
    /* JADX WARNING: type inference failed for: r5v18, types: [r2.a<java.lang.Float, java.lang.Float>, r2.p] */
    /* JADX WARNING: type inference failed for: r9v1, types: [r2.a<java.lang.Float, java.lang.Float>, r2.p] */
    /* JADX WARNING: type inference failed for: r9v14, types: [java.util.Map<t2.i, android.graphics.Typeface>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r8v14, types: [java.util.Map<java.lang.String, android.graphics.Typeface>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v9, types: [java.util.Map<t2.i, android.graphics.Typeface>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r9v18, types: [java.util.Map<java.lang.String, android.graphics.Typeface>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v14, types: [r2.a<java.lang.Float, java.lang.Float>, r2.p] */
    /* JADX WARNING: type inference failed for: r12v12, types: [java.util.Map<t2.d, java.util.List<q2.c>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r10v39, types: [r2.a<java.lang.Float, java.lang.Float>, r2.p] */
    /* JADX WARNING: type inference failed for: r6v27, types: [java.util.Map<t2.d, java.util.List<q2.c>>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r12v23, types: [java.util.Map<t2.d, java.util.List<q2.c>>, java.util.HashMap] */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(android.graphics.Canvas r20, android.graphics.Matrix r21, int r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r20.save()
            o2.l r2 = r0.H
            o2.f r2 = r2.f9228b
            s.h<t2.d> r2 = r2.g
            int r2 = r2.f10847c
            r3 = 1
            if (r2 <= 0) goto L_0x0014
            r2 = r3
            goto L_0x0015
        L_0x0014:
            r2 = 0
        L_0x0015:
            if (r2 != 0) goto L_0x001a
            r20.concat(r21)
        L_0x001a:
            r2.n r2 = r0.G
            java.lang.Object r2 = r2.f()
            t2.b r2 = (t2.b) r2
            o2.f r4 = r0.I
            java.util.Map<java.lang.String, t2.c> r4 = r4.f9201e
            java.lang.String r5 = r2.f11257b
            java.lang.Object r4 = r4.get(r5)
            t2.c r4 = (t2.c) r4
            if (r4 != 0) goto L_0x0034
            r20.restore()
            return
        L_0x0034:
            r2.a<java.lang.Integer, java.lang.Integer> r5 = r0.K
            if (r5 == 0) goto L_0x0048
            w2.i$a r6 = r0.C
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0063
        L_0x0048:
            r2.a<java.lang.Integer, java.lang.Integer> r5 = r0.J
            if (r5 == 0) goto L_0x005c
            w2.i$a r6 = r0.C
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0063
        L_0x005c:
            w2.i$a r5 = r0.C
            int r6 = r2.f11262h
            r5.setColor(r6)
        L_0x0063:
            r2.a<java.lang.Integer, java.lang.Integer> r5 = r0.M
            if (r5 == 0) goto L_0x0077
            w2.i$b r6 = r0.D
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0092
        L_0x0077:
            r2.a<java.lang.Integer, java.lang.Integer> r5 = r0.L
            if (r5 == 0) goto L_0x008b
            w2.i$b r6 = r0.D
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6.setColor(r5)
            goto L_0x0092
        L_0x008b:
            w2.i$b r5 = r0.D
            int r6 = r2.i
            r5.setColor(r6)
        L_0x0092:
            r2.o r5 = r0.f12577v
            r2.a<java.lang.Integer, java.lang.Integer> r5 = r5.f10557j
            r6 = 100
            if (r5 != 0) goto L_0x009c
            r5 = r6
            goto L_0x00a6
        L_0x009c:
            java.lang.Object r5 = r5.f()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
        L_0x00a6:
            int r5 = r5 * 255
            int r5 = r5 / r6
            w2.i$a r6 = r0.C
            r6.setAlpha(r5)
            w2.i$b r6 = r0.D
            r6.setAlpha(r5)
            r2.a<java.lang.Float, java.lang.Float> r5 = r0.O
            if (r5 == 0) goto L_0x00c7
            w2.i$b r6 = r0.D
            java.lang.Object r5 = r5.f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r6.setStrokeWidth(r5)
            goto L_0x00ec
        L_0x00c7:
            r2.a<java.lang.Float, java.lang.Float> r5 = r0.N
            if (r5 == 0) goto L_0x00db
            w2.i$b r6 = r0.D
            java.lang.Object r5 = r5.f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            r6.setStrokeWidth(r5)
            goto L_0x00ec
        L_0x00db:
            float r5 = a3.g.d(r21)
            w2.i$b r6 = r0.D
            float r7 = r2.f11263j
            float r8 = a3.g.c()
            float r8 = r8 * r7
            float r8 = r8 * r5
            r6.setStrokeWidth(r8)
        L_0x00ec:
            o2.l r5 = r0.H
            o2.f r5 = r5.f9228b
            s.h<t2.d> r5 = r5.g
            int r5 = r5.f10847c
            if (r5 <= 0) goto L_0x00f8
            r5 = r3
            goto L_0x00f9
        L_0x00f8:
            r5 = 0
        L_0x00f9:
            r6 = 1120403456(0x42c80000, float:100.0)
            if (r5 == 0) goto L_0x02b4
            r2.a<java.lang.Float, java.lang.Float> r3 = r0.R
            if (r3 == 0) goto L_0x010c
            java.lang.Object r3 = r3.f()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L_0x010e
        L_0x010c:
            float r3 = r2.f11258c
        L_0x010e:
            float r3 = r3 / r6
            float r5 = a3.g.d(r21)
            java.lang.String r6 = r2.f11256a
            float r7 = r2.f11261f
            float r8 = a3.g.c()
            float r8 = r8 * r7
            java.util.List r6 = r0.v(r6)
            int r7 = r6.size()
            r9 = 0
        L_0x0125:
            if (r9 >= r7) goto L_0x04b2
            java.lang.Object r10 = r6.get(r9)
            java.lang.String r10 = (java.lang.String) r10
            r11 = 0
            r12 = 0
        L_0x012f:
            int r13 = r10.length()
            if (r12 >= r13) goto L_0x0171
            char r13 = r10.charAt(r12)
            java.lang.String r14 = r4.f11265a
            java.lang.String r15 = r4.f11266b
            int r13 = t2.d.a(r13, r14, r15)
            o2.f r14 = r0.I
            s.h<t2.d> r14 = r14.g
            r15 = 0
            java.lang.Object r13 = r14.c(r13, r15)
            t2.d r13 = (t2.d) r13
            if (r13 != 0) goto L_0x0154
            r13 = r8
            r16 = r9
            r22 = r10
            goto L_0x0169
        L_0x0154:
            double r14 = (double) r11
            r22 = r10
            double r10 = r13.f11269c
            r13 = r8
            r16 = r9
            double r8 = (double) r3
            double r10 = r10 * r8
            float r8 = a3.g.c()
            double r8 = (double) r8
            double r10 = r10 * r8
            double r8 = (double) r5
            double r10 = r10 * r8
            double r10 = r10 + r14
            float r8 = (float) r10
            r11 = r8
        L_0x0169:
            int r12 = r12 + 1
            r10 = r22
            r8 = r13
            r9 = r16
            goto L_0x012f
        L_0x0171:
            r13 = r8
            r16 = r9
            r22 = r10
            r20.save()
            t2.b$a r8 = r2.f11259d
            r0.s(r8, r1, r11)
            int r8 = r7 + -1
            float r8 = (float) r8
            float r8 = r8 * r13
            r9 = 1073741824(0x40000000, float:2.0)
            float r8 = r8 / r9
            r9 = r16
            float r10 = (float) r9
            float r10 = r10 * r13
            float r10 = r10 - r8
            r8 = 0
            r1.translate(r8, r10)
            r8 = 0
        L_0x018f:
            int r10 = r22.length()
            if (r8 >= r10) goto L_0x02a6
            r10 = r22
            char r11 = r10.charAt(r8)
            java.lang.String r12 = r4.f11265a
            java.lang.String r14 = r4.f11266b
            int r11 = t2.d.a(r11, r12, r14)
            o2.f r12 = r0.I
            s.h<t2.d> r12 = r12.g
            r14 = 0
            java.lang.Object r11 = r12.c(r11, r14)
            t2.d r11 = (t2.d) r11
            if (r11 != 0) goto L_0x01ba
            r14 = r21
            r22 = r6
            r17 = r7
            r16 = r10
            goto L_0x029c
        L_0x01ba:
            java.util.Map<t2.d, java.util.List<q2.c>> r12 = r0.E
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x01d1
            java.util.Map<t2.d, java.util.List<q2.c>> r12 = r0.E
            java.lang.Object r12 = r12.get(r11)
            java.util.List r12 = (java.util.List) r12
            r22 = r6
            r17 = r7
            r16 = r10
            goto L_0x020f
        L_0x01d1:
            java.util.List<v2.n> r12 = r11.f11267a
            int r14 = r12.size()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>(r14)
            r16 = 0
            r22 = r6
            r6 = r16
        L_0x01e2:
            if (r6 >= r14) goto L_0x0205
            java.lang.Object r16 = r12.get(r6)
            r17 = r7
            r7 = r16
            v2.n r7 = (v2.n) r7
            r16 = r10
            q2.c r10 = new q2.c
            r18 = r12
            o2.l r12 = r0.H
            r10.<init>(r12, r0, r7)
            r15.add(r10)
            int r6 = r6 + 1
            r10 = r16
            r7 = r17
            r12 = r18
            goto L_0x01e2
        L_0x0205:
            r17 = r7
            r16 = r10
            java.util.Map<t2.d, java.util.List<q2.c>> r6 = r0.E
            r6.put(r11, r15)
            r12 = r15
        L_0x020f:
            r6 = 0
        L_0x0210:
            int r7 = r12.size()
            if (r6 >= r7) goto L_0x0266
            java.lang.Object r7 = r12.get(r6)
            q2.c r7 = (q2.c) r7
            android.graphics.Path r7 = r7.getPath()
            android.graphics.RectF r10 = r0.A
            r14 = 0
            r7.computeBounds(r10, r14)
            android.graphics.Matrix r10 = r0.B
            r14 = r21
            r10.set(r14)
            android.graphics.Matrix r10 = r0.B
            float r15 = r2.g
            float r15 = -r15
            float r18 = a3.g.c()
            float r15 = r15 * r18
            r18 = r12
            r12 = 0
            r10.preTranslate(r12, r15)
            android.graphics.Matrix r10 = r0.B
            r10.preScale(r3, r3)
            android.graphics.Matrix r10 = r0.B
            r7.transform(r10)
            boolean r10 = r2.f11264k
            if (r10 == 0) goto L_0x0257
            w2.i$a r10 = r0.C
            r0.u(r7, r10, r1)
            w2.i$b r10 = r0.D
            r0.u(r7, r10, r1)
            goto L_0x0261
        L_0x0257:
            w2.i$b r10 = r0.D
            r0.u(r7, r10, r1)
            w2.i$a r10 = r0.C
            r0.u(r7, r10, r1)
        L_0x0261:
            int r6 = r6 + 1
            r12 = r18
            goto L_0x0210
        L_0x0266:
            r14 = r21
            double r6 = r11.f11269c
            float r6 = (float) r6
            float r6 = r6 * r3
            float r7 = a3.g.c()
            float r7 = r7 * r6
            float r7 = r7 * r5
            int r6 = r2.f11260e
            float r6 = (float) r6
            r10 = 1092616192(0x41200000, float:10.0)
            float r6 = r6 / r10
            r2.a<java.lang.Float, java.lang.Float> r10 = r0.Q
            if (r10 == 0) goto L_0x0287
            java.lang.Object r10 = r10.f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            goto L_0x0295
        L_0x0287:
            r2.a<java.lang.Float, java.lang.Float> r10 = r0.P
            if (r10 == 0) goto L_0x0296
            java.lang.Object r10 = r10.f()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
        L_0x0295:
            float r6 = r6 + r10
        L_0x0296:
            float r6 = r6 * r5
            float r6 = r6 + r7
            r7 = 0
            r1.translate(r6, r7)
        L_0x029c:
            int r8 = r8 + 1
            r6 = r22
            r22 = r16
            r7 = r17
            goto L_0x018f
        L_0x02a6:
            r14 = r21
            r22 = r6
            r17 = r7
            r20.restore()
            int r9 = r9 + 1
            r8 = r13
            goto L_0x0125
        L_0x02b4:
            r14 = r21
            a3.g.d(r21)
            o2.l r5 = r0.H
            java.lang.String r7 = r4.f11265a
            java.lang.String r4 = r4.f11266b
            android.graphics.drawable.Drawable$Callback r8 = r5.getCallback()
            if (r8 != 0) goto L_0x02c7
            r5 = 0
            goto L_0x02d8
        L_0x02c7:
            s2.a r8 = r5.B
            if (r8 != 0) goto L_0x02d6
            s2.a r8 = new s2.a
            android.graphics.drawable.Drawable$Callback r9 = r5.getCallback()
            r8.<init>(r9)
            r5.B = r8
        L_0x02d6:
            s2.a r5 = r5.B
        L_0x02d8:
            if (r5 == 0) goto L_0x033f
            t2.i r8 = r5.f10850a
            r8.f11281b = r7
            r8.f11282c = r4
            java.util.Map<t2.i, android.graphics.Typeface> r9 = r5.f10851b
            java.lang.Object r8 = r9.get(r8)
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            if (r8 == 0) goto L_0x02eb
            goto L_0x0340
        L_0x02eb:
            java.util.Map<java.lang.String, android.graphics.Typeface> r8 = r5.f10852c
            java.lang.Object r8 = r8.get(r7)
            android.graphics.Typeface r8 = (android.graphics.Typeface) r8
            if (r8 == 0) goto L_0x02f6
            goto L_0x0310
        L_0x02f6:
            java.lang.String r8 = "fonts/"
            java.lang.StringBuilder r8 = b9.m.c(r8, r7)
            java.lang.String r9 = r5.f10854e
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.content.res.AssetManager r9 = r5.f10853d
            android.graphics.Typeface r8 = android.graphics.Typeface.createFromAsset(r9, r8)
            java.util.Map<java.lang.String, android.graphics.Typeface> r9 = r5.f10852c
            r9.put(r7, r8)
        L_0x0310:
            java.lang.String r7 = "Italic"
            boolean r7 = r4.contains(r7)
            java.lang.String r9 = "Bold"
            boolean r4 = r4.contains(r9)
            if (r7 == 0) goto L_0x0322
            if (r4 == 0) goto L_0x0322
            r4 = 3
            goto L_0x032b
        L_0x0322:
            if (r7 == 0) goto L_0x0326
            r4 = 2
            goto L_0x032b
        L_0x0326:
            if (r4 == 0) goto L_0x032a
            r4 = r3
            goto L_0x032b
        L_0x032a:
            r4 = 0
        L_0x032b:
            int r7 = r8.getStyle()
            if (r7 != r4) goto L_0x0332
            goto L_0x0337
        L_0x0332:
            android.graphics.Typeface r4 = android.graphics.Typeface.create(r8, r4)
            r8 = r4
        L_0x0337:
            java.util.Map<t2.i, android.graphics.Typeface> r4 = r5.f10851b
            t2.i r5 = r5.f10850a
            r4.put(r5, r8)
            goto L_0x0340
        L_0x033f:
            r8 = 0
        L_0x0340:
            if (r8 != 0) goto L_0x0344
            goto L_0x04b2
        L_0x0344:
            java.lang.String r4 = r2.f11256a
            o2.l r5 = r0.H
            java.util.Objects.requireNonNull(r5)
            w2.i$a r5 = r0.C
            r5.setTypeface(r8)
            r2.a<java.lang.Float, java.lang.Float> r5 = r0.R
            if (r5 == 0) goto L_0x035f
            java.lang.Object r5 = r5.f()
            java.lang.Float r5 = (java.lang.Float) r5
            float r5 = r5.floatValue()
            goto L_0x0361
        L_0x035f:
            float r5 = r2.f11258c
        L_0x0361:
            w2.i$a r7 = r0.C
            float r8 = a3.g.c()
            float r8 = r8 * r5
            r7.setTextSize(r8)
            w2.i$b r7 = r0.D
            w2.i$a r8 = r0.C
            android.graphics.Typeface r8 = r8.getTypeface()
            r7.setTypeface(r8)
            w2.i$b r7 = r0.D
            w2.i$a r8 = r0.C
            float r8 = r8.getTextSize()
            r7.setTextSize(r8)
            float r7 = r2.f11261f
            float r8 = a3.g.c()
            float r8 = r8 * r7
            int r7 = r2.f11260e
            float r7 = (float) r7
            r9 = 1092616192(0x41200000, float:10.0)
            float r7 = r7 / r9
            r2.a<java.lang.Float, java.lang.Float> r9 = r0.Q
            if (r9 == 0) goto L_0x039d
            java.lang.Object r9 = r9.f()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
            goto L_0x03ab
        L_0x039d:
            r2.a<java.lang.Float, java.lang.Float> r9 = r0.P
            if (r9 == 0) goto L_0x03ac
            java.lang.Object r9 = r9.f()
            java.lang.Float r9 = (java.lang.Float) r9
            float r9 = r9.floatValue()
        L_0x03ab:
            float r7 = r7 + r9
        L_0x03ac:
            float r9 = a3.g.c()
            float r9 = r9 * r7
            float r9 = r9 * r5
            float r9 = r9 / r6
            java.util.List r4 = r0.v(r4)
            int r5 = r4.size()
            r6 = 0
        L_0x03bc:
            if (r6 >= r5) goto L_0x04b2
            java.lang.Object r7 = r4.get(r6)
            java.lang.String r7 = (java.lang.String) r7
            w2.i$b r10 = r0.D
            float r10 = r10.measureText(r7)
            int r11 = r7.length()
            int r11 = r11 - r3
            float r3 = (float) r11
            float r3 = r3 * r9
            float r3 = r3 + r10
            r20.save()
            t2.b$a r10 = r2.f11259d
            r0.s(r10, r1, r3)
            int r3 = r5 + -1
            float r3 = (float) r3
            float r3 = r3 * r8
            r10 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 / r10
            float r10 = (float) r6
            float r10 = r10 * r8
            float r10 = r10 - r3
            r3 = 0
            r1.translate(r3, r10)
            r3 = 0
        L_0x03e9:
            int r10 = r7.length()
            if (r3 >= r10) goto L_0x04aa
            int r10 = r7.codePointAt(r3)
            int r11 = java.lang.Character.charCount(r10)
            int r11 = r11 + r3
        L_0x03f8:
            int r12 = r7.length()
            if (r11 >= r12) goto L_0x0439
            int r12 = r7.codePointAt(r11)
            int r13 = java.lang.Character.getType(r12)
            r14 = 16
            if (r13 == r14) goto L_0x042c
            int r13 = java.lang.Character.getType(r12)
            r14 = 27
            if (r13 == r14) goto L_0x042c
            int r13 = java.lang.Character.getType(r12)
            r14 = 6
            if (r13 == r14) goto L_0x042c
            int r13 = java.lang.Character.getType(r12)
            r14 = 28
            if (r13 == r14) goto L_0x042c
            int r13 = java.lang.Character.getType(r12)
            r14 = 19
            if (r13 != r14) goto L_0x042a
            goto L_0x042c
        L_0x042a:
            r13 = 0
            goto L_0x042d
        L_0x042c:
            r13 = 1
        L_0x042d:
            if (r13 != 0) goto L_0x0430
            goto L_0x0439
        L_0x0430:
            int r13 = java.lang.Character.charCount(r12)
            int r11 = r11 + r13
            int r10 = r10 * 31
            int r10 = r10 + r12
            goto L_0x03f8
        L_0x0439:
            s.d<java.lang.String> r12 = r0.F
            long r13 = (long) r10
            boolean r10 = r12.f10818a
            if (r10 == 0) goto L_0x0443
            r12.d()
        L_0x0443:
            long[] r10 = r12.f10819b
            int r12 = r12.f10821s
            int r10 = ge.g0.k(r10, r12, r13)
            if (r10 < 0) goto L_0x044f
            r10 = 1
            goto L_0x0450
        L_0x044f:
            r10 = 0
        L_0x0450:
            if (r10 == 0) goto L_0x045c
            s.d<java.lang.String> r10 = r0.F
            r11 = 0
            java.lang.Object r10 = r10.g(r13, r11)
            java.lang.String r10 = (java.lang.String) r10
            goto L_0x047f
        L_0x045c:
            java.lang.StringBuilder r10 = r0.z
            r12 = 0
            r10.setLength(r12)
            r10 = r3
        L_0x0463:
            if (r10 >= r11) goto L_0x0474
            int r12 = r7.codePointAt(r10)
            java.lang.StringBuilder r15 = r0.z
            r15.appendCodePoint(r12)
            int r12 = java.lang.Character.charCount(r12)
            int r10 = r10 + r12
            goto L_0x0463
        L_0x0474:
            java.lang.StringBuilder r10 = r0.z
            java.lang.String r10 = r10.toString()
            s.d<java.lang.String> r11 = r0.F
            r11.i(r13, r10)
        L_0x047f:
            int r11 = r10.length()
            int r3 = r3 + r11
            boolean r11 = r2.f11264k
            if (r11 == 0) goto L_0x0493
            w2.i$a r11 = r0.C
            r0.t(r10, r11, r1)
            w2.i$b r11 = r0.D
            r0.t(r10, r11, r1)
            goto L_0x049d
        L_0x0493:
            w2.i$b r11 = r0.D
            r0.t(r10, r11, r1)
            w2.i$a r11 = r0.C
            r0.t(r10, r11, r1)
        L_0x049d:
            w2.i$a r11 = r0.C
            float r10 = r11.measureText(r10)
            float r10 = r10 + r9
            r11 = 0
            r1.translate(r10, r11)
            goto L_0x03e9
        L_0x04aa:
            r20.restore()
            int r6 = r6 + 1
            r3 = 1
            goto L_0x03bc
        L_0x04b2:
            r20.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w2.i.j(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void s(b.a aVar, Canvas canvas, float f10) {
        int i = c.f12604a[aVar.ordinal()];
        if (i == 2) {
            canvas.translate(-f10, 0.0f);
        } else if (i == 3) {
            canvas.translate((-f10) / 2.0f, 0.0f);
        }
    }

    public final void t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
            }
        }
    }

    public final void u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() != Paint.Style.STROKE || paint.getStrokeWidth() != 0.0f) {
                canvas.drawPath(path, paint);
            }
        }
    }

    public final List<String> v(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }
}
