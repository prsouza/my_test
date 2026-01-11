package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.b;
import t0.c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public c f3660a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3661b;

    /* renamed from: c  reason: collision with root package name */
    public int f3662c = 2;

    /* renamed from: d  reason: collision with root package name */
    public float f3663d = 0.5f;

    /* renamed from: e  reason: collision with root package name */
    public float f3664e = 0.0f;

    /* renamed from: f  reason: collision with root package name */
    public float f3665f = 0.5f;
    public final a g = new a();

    public class a extends c.C0221c {

        /* renamed from: a  reason: collision with root package name */
        public int f3666a;

        /* renamed from: b  reason: collision with root package name */
        public int f3667b = -1;

        public a() {
        }

        public final int a(View view, int i) {
            int i10;
            int i11;
            int i12;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            boolean z = x.e.d(view) == 1;
            int i13 = SwipeDismissBehavior.this.f3662c;
            if (i13 != 0) {
                if (i13 != 1) {
                    i11 = this.f3666a - view.getWidth();
                    i10 = view.getWidth() + this.f3666a;
                } else if (z) {
                    i11 = this.f3666a;
                    i12 = view.getWidth();
                } else {
                    i11 = this.f3666a - view.getWidth();
                    i10 = this.f3666a;
                }
                return Math.min(Math.max(i11, i), i10);
            } else if (z) {
                i11 = this.f3666a - view.getWidth();
                i10 = this.f3666a;
                return Math.min(Math.max(i11, i), i10);
            } else {
                i11 = this.f3666a;
                i12 = view.getWidth();
            }
            i10 = i12 + i11;
            return Math.min(Math.max(i11, i), i10);
        }

        public final int b(View view, int i) {
            return view.getTop();
        }

        public final int c(View view) {
            return view.getWidth();
        }

        public final void e(View view, int i) {
            this.f3667b = i;
            this.f3666a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public final void f(int i) {
            Objects.requireNonNull(SwipeDismissBehavior.this);
        }

        public final void g(View view, int i, int i10) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f3664e) + ((float) this.f3666a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f3665f) + ((float) this.f3666a);
            float f10 = (float) i;
            if (f10 <= width) {
                view.setAlpha(1.0f);
            } else if (f10 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.t(1.0f - ((f10 - width) / (width2 - width))));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.f3666a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f3668c.f3663d)) goto L_0x0054;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0083  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f3667b = r10
                int r10 = r8.getWidth()
                r0 = 0
                int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                r2 = 1
                r3 = 0
                if (r1 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, n0.a0> r4 = n0.x.f8842a
                int r4 = n0.x.e.d(r8)
                if (r4 != r2) goto L_0x0018
                r4 = r2
                goto L_0x0019
            L_0x0018:
                r4 = r3
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f3662c
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x0054
            L_0x0021:
                if (r5 != 0) goto L_0x002d
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x002a:
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x002d:
                if (r5 != r2) goto L_0x0056
                if (r4 == 0) goto L_0x0034
                if (r1 <= 0) goto L_0x0056
                goto L_0x0054
            L_0x0034:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0056
                goto L_0x0054
            L_0x0039:
                int r9 = r8.getLeft()
                int r0 = r7.f3666a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r1 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r1 = r1.f3663d
                float r0 = r0 * r1
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x0056
            L_0x0054:
                r9 = r2
                goto L_0x0057
            L_0x0056:
                r9 = r3
            L_0x0057:
                if (r9 == 0) goto L_0x0065
                int r9 = r8.getLeft()
                int r0 = r7.f3666a
                if (r9 >= r0) goto L_0x0063
                int r0 = r0 - r10
                goto L_0x0068
            L_0x0063:
                int r0 = r0 + r10
                goto L_0x0068
            L_0x0065:
                int r0 = r7.f3666a
                r2 = r3
            L_0x0068:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                t0.c r9 = r9.f3660a
                int r10 = r8.getTop()
                boolean r9 = r9.t(r0, r10)
                if (r9 == 0) goto L_0x0083
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = new com.google.android.material.behavior.SwipeDismissBehavior$b
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r2)
                java.util.WeakHashMap<android.view.View, n0.a0> r10 = n0.x.f8842a
                n0.x.d.m(r8, r9)
                goto L_0x008a
            L_0x0083:
                if (r2 == 0) goto L_0x008a
                com.google.android.material.behavior.SwipeDismissBehavior r8 = com.google.android.material.behavior.SwipeDismissBehavior.this
                java.util.Objects.requireNonNull(r8)
            L_0x008a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i) {
            int i10 = this.f3667b;
            return (i10 == -1 || i10 == i) && SwipeDismissBehavior.this.s(view);
        }
    }

    public class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final View f3669a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f3670b;

        public b(View view, boolean z) {
            this.f3669a = view;
            this.f3670b = z;
        }

        public final void run() {
            c cVar = SwipeDismissBehavior.this.f3660a;
            if (cVar != null && cVar.h()) {
                View view = this.f3669a;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.d.m(view, this);
            } else if (this.f3670b) {
                Objects.requireNonNull(SwipeDismissBehavior.this);
            }
        }
    }

    public static float t(float f10) {
        return Math.min(Math.max(0.0f, f10), 1.0f);
    }

    public boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z = this.f3661b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.p(v10, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f3661b = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f3661b = false;
        }
        if (!z) {
            return false;
        }
        if (this.f3660a == null) {
            this.f3660a = new c(coordinatorLayout.getContext(), coordinatorLayout, this.g);
        }
        return this.f3660a.u(motionEvent);
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.d.c(v10) == 0) {
            x.d.s(v10, 1);
            x.m(1048576, v10);
            x.j(v10, 0);
            if (s(v10)) {
                x.n(v10, b.a.f9179j, new i5.a(this));
            }
        }
        return false;
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        c cVar = this.f3660a;
        if (cVar == null) {
            return false;
        }
        cVar.n(motionEvent);
        return true;
    }

    public boolean s(View view) {
        return true;
    }
}
