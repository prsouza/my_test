package p1;

import android.animation.AnimatorListenerAdapter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b extends i {
    public static final String[] M = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final Property<Drawable, PointF> N = new a(PointF.class);
    public static final Property<i, PointF> O = new C0186b(PointF.class);
    public static final Property<i, PointF> P = new c(PointF.class);
    public static final Property<View, PointF> Q = new d(PointF.class);
    public static final Property<View, PointF> R = new e(PointF.class);
    public static final Property<View, PointF> S = new f(PointF.class);

    public class a extends Property<Drawable, PointF> {

        /* renamed from: a  reason: collision with root package name */
        public Rect f9501a = new Rect();

        public a(Class cls) {
            super(cls, "boundsOrigin");
        }

        public final Object get(Object obj) {
            ((Drawable) obj).copyBounds(this.f9501a);
            Rect rect = this.f9501a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        public final void set(Object obj, Object obj2) {
            Drawable drawable = (Drawable) obj;
            PointF pointF = (PointF) obj2;
            drawable.copyBounds(this.f9501a);
            this.f9501a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f9501a);
        }
    }

    /* renamed from: p1.b$b  reason: collision with other inner class name */
    public class C0186b extends Property<i, PointF> {
        public C0186b(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f9504a = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f9505b = round;
            int i = iVar.f9509f + 1;
            iVar.f9509f = i;
            if (i == iVar.g) {
                t.b(iVar.f9508e, iVar.f9504a, round, iVar.f9506c, iVar.f9507d);
                iVar.f9509f = 0;
                iVar.g = 0;
            }
        }
    }

    public class c extends Property<i, PointF> {
        public c(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            i iVar = (i) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            i iVar = (i) obj;
            PointF pointF = (PointF) obj2;
            Objects.requireNonNull(iVar);
            iVar.f9506c = Math.round(pointF.x);
            int round = Math.round(pointF.y);
            iVar.f9507d = round;
            int i = iVar.g + 1;
            iVar.g = i;
            if (iVar.f9509f == i) {
                t.b(iVar.f9508e, iVar.f9504a, iVar.f9505b, iVar.f9506c, round);
                iVar.f9509f = 0;
                iVar.g = 0;
            }
        }
    }

    public class d extends Property<View, PointF> {
        public d(Class cls) {
            super(cls, "bottomRight");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            t.b(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    public class e extends Property<View, PointF> {
        public e(Class cls) {
            super(cls, "topLeft");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            t.b(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    public class f extends Property<View, PointF> {
        public f(Class cls) {
            super(cls, "position");
        }

        public final /* bridge */ /* synthetic */ Object get(Object obj) {
            View view = (View) obj;
            return null;
        }

        public final void set(Object obj, Object obj2) {
            View view = (View) obj;
            PointF pointF = (PointF) obj2;
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            t.b(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    public class g extends AnimatorListenerAdapter {
        private i mViewBounds;

        public g(i iVar) {
            this.mViewBounds = iVar;
        }
    }

    public class h extends l {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9502a = false;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f9503b;

        public h(ViewGroup viewGroup) {
            this.f9503b = viewGroup;
        }

        public final void a(i iVar) {
            if (!this.f9502a) {
                s.a(this.f9503b, false);
            }
            iVar.z(this);
        }

        public final void b() {
            s.a(this.f9503b, false);
        }

        public final void c() {
            s.a(this.f9503b, true);
        }

        public final void d() {
            s.a(this.f9503b, false);
            this.f9502a = true;
        }
    }

    public static class i {

        /* renamed from: a  reason: collision with root package name */
        public int f9504a;

        /* renamed from: b  reason: collision with root package name */
        public int f9505b;

        /* renamed from: c  reason: collision with root package name */
        public int f9506c;

        /* renamed from: d  reason: collision with root package name */
        public int f9507d;

        /* renamed from: e  reason: collision with root package name */
        public View f9508e;

        /* renamed from: f  reason: collision with root package name */
        public int f9509f;
        public int g;

        public i(View view) {
            this.f9508e = view;
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void L(p pVar) {
        View view = pVar.f9556b;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.g.c(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            pVar.f9555a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            pVar.f9555a.put("android:changeBounds:parent", pVar.f9556b.getParent());
        }
    }

    public final void d(p pVar) {
        L(pVar);
    }

    public final void i(p pVar) {
        L(pVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v16, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v9, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r5v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r7v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m(android.view.ViewGroup r19, p1.p r20, p1.p r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = r21
            if (r1 == 0) goto L_0x0139
            if (r2 != 0) goto L_0x000c
            goto L_0x0139
        L_0x000c:
            java.util.Map<java.lang.String, java.lang.Object> r4 = r1.f9555a
            java.util.Map<java.lang.String, java.lang.Object> r5 = r2.f9555a
            java.lang.String r6 = "android:changeBounds:parent"
            java.lang.Object r4 = r4.get(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r5 = r5.get(r6)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r4 == 0) goto L_0x0137
            if (r5 != 0) goto L_0x0024
            goto L_0x0137
        L_0x0024:
            android.view.View r4 = r2.f9556b
            java.util.Map<java.lang.String, java.lang.Object> r5 = r1.f9555a
            java.lang.String r6 = "android:changeBounds:bounds"
            java.lang.Object r5 = r5.get(r6)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            java.util.Map<java.lang.String, java.lang.Object> r7 = r2.f9555a
            java.lang.Object r6 = r7.get(r6)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            int r7 = r5.left
            int r8 = r6.left
            int r9 = r5.top
            int r10 = r6.top
            int r11 = r5.right
            int r12 = r6.right
            int r5 = r5.bottom
            int r6 = r6.bottom
            int r13 = r11 - r7
            int r14 = r5 - r9
            int r15 = r12 - r8
            int r3 = r6 - r10
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f9555a
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.f9555a
            java.lang.Object r0 = r2.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r2 = 1
            if (r13 == 0) goto L_0x0067
            if (r14 != 0) goto L_0x006b
        L_0x0067:
            if (r15 == 0) goto L_0x007c
            if (r3 == 0) goto L_0x007c
        L_0x006b:
            if (r7 != r8) goto L_0x0073
            if (r9 == r10) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            r16 = 0
            goto L_0x0075
        L_0x0073:
            r16 = r2
        L_0x0075:
            if (r11 != r12) goto L_0x0079
            if (r5 == r6) goto L_0x007e
        L_0x0079:
            int r16 = r16 + 1
            goto L_0x007e
        L_0x007c:
            r16 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x0086
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L_0x008a
        L_0x0086:
            if (r1 != 0) goto L_0x008c
            if (r0 == 0) goto L_0x008c
        L_0x008a:
            int r16 = r16 + 1
        L_0x008c:
            r0 = r16
            if (r0 <= 0) goto L_0x0133
            p1.t.b(r4, r7, r9, r11, r5)
            r1 = 2
            if (r0 != r1) goto L_0x00ef
            if (r13 != r15) goto L_0x00ae
            if (r14 != r3) goto L_0x00ae
            r0 = r18
            android.support.v4.media.b r1 = r0.I
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            android.graphics.Path r1 = r1.t0(r3, r5, r6, r7)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = S
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
            goto L_0x0119
        L_0x00ae:
            r0 = r18
            p1.b$i r3 = new p1.b$i
            r3.<init>(r4)
            android.support.v4.media.b r13 = r0.I
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            android.graphics.Path r7 = r13.t0(r7, r9, r8, r10)
            android.util.Property<p1.b$i, android.graphics.PointF> r8 = O
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            android.support.v4.media.b r8 = r0.I
            float r10 = (float) r11
            float r5 = (float) r5
            float r11 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r5 = r8.t0(r10, r5, r11, r6)
            android.util.Property<p1.b$i, android.graphics.PointF> r6 = P
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r8 = 0
            r1[r8] = r7
            r1[r2] = r5
            r6.playTogether(r1)
            p1.b$g r1 = new p1.b$g
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L_0x0119
        L_0x00ef:
            r0 = r18
            if (r7 != r8) goto L_0x0108
            if (r9 == r10) goto L_0x00f6
            goto L_0x0108
        L_0x00f6:
            android.support.v4.media.b r1 = r0.I
            float r3 = (float) r11
            float r5 = (float) r5
            float r7 = (float) r12
            float r6 = (float) r6
            android.graphics.Path r1 = r1.t0(r3, r5, r7, r6)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = Q
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
            goto L_0x0119
        L_0x0108:
            r5 = 0
            android.support.v4.media.b r1 = r0.I
            float r3 = (float) r7
            float r6 = (float) r9
            float r7 = (float) r8
            float r8 = (float) r10
            android.graphics.Path r1 = r1.t0(r3, r6, r7, r8)
            android.util.Property<android.view.View, android.graphics.PointF> r3 = R
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r4, r3, r5, r1)
        L_0x0119:
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0132
            android.view.ViewParent r3 = r4.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            p1.s.a(r3, r2)
            p1.b$h r2 = new p1.b$h
            r2.<init>(r3)
            r0.a(r2)
        L_0x0132:
            return r1
        L_0x0133:
            r0 = r18
            r1 = 0
            return r1
        L_0x0137:
            r1 = 0
            return r1
        L_0x0139:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.b.m(android.view.ViewGroup, p1.p, p1.p):android.animation.Animator");
    }

    public final String[] r() {
        return M;
    }
}
