package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import p1.i;

public abstract class a0 extends i {
    public static final String[] N = {"android:visibility:visibility", "android:visibility:parent"};
    public int M = 3;

    public static class a extends AnimatorListenerAdapter implements i.d {

        /* renamed from: a  reason: collision with root package name */
        public final View f9489a;

        /* renamed from: b  reason: collision with root package name */
        public final int f9490b;

        /* renamed from: c  reason: collision with root package name */
        public final ViewGroup f9491c;

        /* renamed from: s  reason: collision with root package name */
        public final boolean f9492s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f9493t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f9494u = false;

        public a(View view, int i) {
            this.f9489a = view;
            this.f9490b = i;
            this.f9491c = (ViewGroup) view.getParent();
            this.f9492s = true;
            g(true);
        }

        public final void a(i iVar) {
            f();
            iVar.z(this);
        }

        public final void b() {
            g(false);
        }

        public final void c() {
            g(true);
        }

        public final void d() {
        }

        public final void e(i iVar) {
        }

        public final void f() {
            if (!this.f9494u) {
                t.d(this.f9489a, this.f9490b);
                ViewGroup viewGroup = this.f9491c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            g(false);
        }

        public final void g(boolean z) {
            ViewGroup viewGroup;
            if (this.f9492s && this.f9493t != z && (viewGroup = this.f9491c) != null) {
                this.f9493t = z;
                s.a(viewGroup, z);
            }
        }

        public final void onAnimationCancel(Animator animator) {
            this.f9494u = true;
        }

        public final void onAnimationEnd(Animator animator) {
            f();
        }

        public final void onAnimationPause(Animator animator) {
            if (!this.f9494u) {
                t.d(this.f9489a, this.f9490b);
            }
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationResume(Animator animator) {
            if (!this.f9494u) {
                t.d(this.f9489a, 0);
            }
        }

        public final void onAnimationStart(Animator animator) {
        }
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f9495a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f9496b;

        /* renamed from: c  reason: collision with root package name */
        public int f9497c;

        /* renamed from: d  reason: collision with root package name */
        public int f9498d;

        /* renamed from: e  reason: collision with root package name */
        public ViewGroup f9499e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f9500f;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final void L(p pVar) {
        pVar.f9555a.put("android:visibility:visibility", Integer.valueOf(pVar.f9556b.getVisibility()));
        pVar.f9555a.put("android:visibility:parent", pVar.f9556b.getParent());
        int[] iArr = new int[2];
        pVar.f9556b.getLocationOnScreen(iArr);
        pVar.f9555a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r6v8, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final b M(p pVar, p pVar2) {
        b bVar = new b();
        bVar.f9495a = false;
        bVar.f9496b = false;
        if (pVar == null || !pVar.f9555a.containsKey("android:visibility:visibility")) {
            bVar.f9497c = -1;
            bVar.f9499e = null;
        } else {
            bVar.f9497c = ((Integer) pVar.f9555a.get("android:visibility:visibility")).intValue();
            bVar.f9499e = (ViewGroup) pVar.f9555a.get("android:visibility:parent");
        }
        if (pVar2 == null || !pVar2.f9555a.containsKey("android:visibility:visibility")) {
            bVar.f9498d = -1;
            bVar.f9500f = null;
        } else {
            bVar.f9498d = ((Integer) pVar2.f9555a.get("android:visibility:visibility")).intValue();
            bVar.f9500f = (ViewGroup) pVar2.f9555a.get("android:visibility:parent");
        }
        if (pVar != null && pVar2 != null) {
            int i = bVar.f9497c;
            int i10 = bVar.f9498d;
            if (i == i10 && bVar.f9499e == bVar.f9500f) {
                return bVar;
            }
            if (i != i10) {
                if (i == 0) {
                    bVar.f9496b = false;
                    bVar.f9495a = true;
                } else if (i10 == 0) {
                    bVar.f9496b = true;
                    bVar.f9495a = true;
                }
            } else if (bVar.f9500f == null) {
                bVar.f9496b = false;
                bVar.f9495a = true;
            } else if (bVar.f9499e == null) {
                bVar.f9496b = true;
                bVar.f9495a = true;
            }
        } else if (pVar == null && bVar.f9498d == 0) {
            bVar.f9496b = true;
            bVar.f9495a = true;
        } else if (pVar2 == null && bVar.f9497c == 0) {
            bVar.f9496b = false;
            bVar.f9495a = true;
        }
        return bVar;
    }

    public abstract Animator N(View view, p pVar);

    public final void d(p pVar) {
        L(pVar);
    }

    /* JADX WARNING: type inference failed for: r14v3, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r13v4, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r13 = (java.lang.Float) r13.f9555a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator m(android.view.ViewGroup r12, p1.p r13, p1.p r14) {
        /*
            r11 = this;
            p1.a0$b r0 = r11.M(r13, r14)
            boolean r1 = r0.f9495a
            r2 = 0
            if (r1 == 0) goto L_0x014f
            android.view.ViewGroup r1 = r0.f9499e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f9500f
            if (r1 == 0) goto L_0x014f
        L_0x0011:
            boolean r1 = r0.f9496b
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0061
            int r12 = r11.M
            r12 = r12 & r3
            if (r12 != r3) goto L_0x0060
            if (r14 != 0) goto L_0x001f
            goto L_0x0060
        L_0x001f:
            if (r13 != 0) goto L_0x003a
            android.view.View r12 = r14.f9556b
            android.view.ViewParent r12 = r12.getParent()
            android.view.View r12 = (android.view.View) r12
            p1.p r0 = r11.p(r12, r4)
            p1.p r12 = r11.u(r12, r4)
            p1.a0$b r12 = r11.M(r0, r12)
            boolean r12 = r12.f9495a
            if (r12 == 0) goto L_0x003a
            goto L_0x0060
        L_0x003a:
            android.view.View r12 = r14.f9556b
            r14 = r11
            p1.c r14 = (p1.c) r14
            r0 = 0
            if (r13 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Object> r13 = r13.f9555a
            java.lang.String r1 = "android:fade:transitionAlpha"
            java.lang.Object r13 = r13.get(r1)
            java.lang.Float r13 = (java.lang.Float) r13
            if (r13 == 0) goto L_0x0053
            float r13 = r13.floatValue()
            goto L_0x0054
        L_0x0053:
            r13 = r0
        L_0x0054:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r13
        L_0x005c:
            android.animation.Animator r2 = r14.O(r12, r0, r1)
        L_0x0060:
            return r2
        L_0x0061:
            int r0 = r0.f9498d
            int r1 = r11.M
            r5 = 2
            r1 = r1 & r5
            if (r1 == r5) goto L_0x006b
            goto L_0x014f
        L_0x006b:
            if (r13 != 0) goto L_0x006f
            goto L_0x014f
        L_0x006f:
            android.view.View r1 = r13.f9556b
            if (r14 == 0) goto L_0x0076
            android.view.View r14 = r14.f9556b
            goto L_0x0077
        L_0x0076:
            r14 = r2
        L_0x0077:
            r6 = 2131231233(0x7f080201, float:1.8078541E38)
            java.lang.Object r7 = r1.getTag(r6)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x0086
            r14 = r2
            r8 = r3
            goto L_0x00de
        L_0x0086:
            if (r14 == 0) goto L_0x0097
            android.view.ViewParent r7 = r14.getParent()
            if (r7 != 0) goto L_0x008f
            goto L_0x0097
        L_0x008f:
            r7 = 4
            if (r0 != r7) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            if (r1 != r14) goto L_0x009d
        L_0x0095:
            r7 = r2
            goto L_0x009b
        L_0x0097:
            if (r14 == 0) goto L_0x009d
            r7 = r14
            r14 = r2
        L_0x009b:
            r8 = r4
            goto L_0x00a0
        L_0x009d:
            r14 = r2
            r7 = r14
            r8 = r3
        L_0x00a0:
            if (r8 == 0) goto L_0x00dd
            android.view.ViewParent r8 = r1.getParent()
            if (r8 != 0) goto L_0x00aa
            r7 = r1
            goto L_0x00dd
        L_0x00aa:
            android.view.ViewParent r8 = r1.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x00dd
            android.view.ViewParent r8 = r1.getParent()
            android.view.View r8 = (android.view.View) r8
            p1.p r9 = r11.u(r8, r3)
            p1.p r10 = r11.p(r8, r3)
            p1.a0$b r9 = r11.M(r9, r10)
            boolean r9 = r9.f9495a
            if (r9 != 0) goto L_0x00cd
            android.view.View r7 = p1.o.a(r12, r1, r8)
            goto L_0x00dd
        L_0x00cd:
            int r9 = r8.getId()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 != 0) goto L_0x00dd
            r8 = -1
            if (r9 == r8) goto L_0x00dd
            r12.findViewById(r9)
        L_0x00dd:
            r8 = r4
        L_0x00de:
            if (r7 == 0) goto L_0x012e
            if (r8 != 0) goto L_0x0112
            java.util.Map<java.lang.String, java.lang.Object> r14 = r13.f9555a
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r14 = r14.get(r0)
            int[] r14 = (int[]) r14
            r0 = r14[r4]
            r14 = r14[r3]
            int[] r2 = new int[r5]
            r12.getLocationOnScreen(r2)
            r4 = r2[r4]
            int r0 = r0 - r4
            int r4 = r7.getLeft()
            int r0 = r0 - r4
            r7.offsetLeftAndRight(r0)
            r0 = r2[r3]
            int r14 = r14 - r0
            int r0 = r7.getTop()
            int r14 = r14 - r0
            r7.offsetTopAndBottom(r14)
            android.view.ViewGroupOverlay r14 = r12.getOverlay()
            r14.add(r7)
        L_0x0112:
            android.animation.Animator r2 = r11.N(r7, r13)
            if (r8 != 0) goto L_0x014f
            if (r2 != 0) goto L_0x0122
            android.view.ViewGroupOverlay r12 = r12.getOverlay()
            r12.remove(r7)
            goto L_0x014f
        L_0x0122:
            r1.setTag(r6, r7)
            p1.z r13 = new p1.z
            r13.<init>(r11, r12, r7, r1)
            r11.a(r13)
            goto L_0x014f
        L_0x012e:
            if (r14 == 0) goto L_0x014f
            int r12 = r14.getVisibility()
            p1.t.d(r14, r4)
            android.animation.Animator r2 = r11.N(r14, r13)
            if (r2 == 0) goto L_0x014c
            p1.a0$a r12 = new p1.a0$a
            r12.<init>(r14, r0)
            r2.addListener(r12)
            r2.addPauseListener(r12)
            r11.a(r12)
            goto L_0x014f
        L_0x014c:
            p1.t.d(r14, r12)
        L_0x014f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.a0.m(android.view.ViewGroup, p1.p, p1.p):android.animation.Animator");
    }

    public final String[] r() {
        return N;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.String, java.lang.Object>, java.util.HashMap] */
    public final boolean v(p pVar, p pVar2) {
        if (pVar == null && pVar2 == null) {
            return false;
        }
        if (pVar != null && pVar2 != null && pVar2.f9555a.containsKey("android:visibility:visibility") != pVar.f9555a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b M2 = M(pVar, pVar2);
        if (!M2.f9495a) {
            return false;
        }
        if (M2.f9497c == 0 || M2.f9498d == 0) {
            return true;
        }
        return false;
    }
}
