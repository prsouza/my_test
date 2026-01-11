package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b9.m;
import e6.f;
import e6.i;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import net.jpountz.lz4.LZ4FrameOutputStream;
import o0.b;
import o0.d;
import t0.c;
import x5.r;
import x5.s;
import x5.t;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public int A;
    public int B;
    public int C;
    public float D = 0.5f;
    public int E;
    public float F = -1.0f;
    public boolean G;
    public boolean H;
    public boolean I = true;
    public int J = 4;
    public t0.c K;
    public boolean L;
    public int M;
    public boolean N;
    public int O;
    public int P;
    public int Q;
    public WeakReference<V> R;
    public WeakReference<View> S;
    public final ArrayList<c> T = new ArrayList<>();
    public VelocityTracker U;
    public int V;
    public int W;
    public boolean X;
    public Map<View, Integer> Y;
    public int Z = -1;

    /* renamed from: a  reason: collision with root package name */
    public int f3688a = 0;

    /* renamed from: a0  reason: collision with root package name */
    public final b f3689a0 = new b();

    /* renamed from: b  reason: collision with root package name */
    public boolean f3690b = true;

    /* renamed from: c  reason: collision with root package name */
    public float f3691c;

    /* renamed from: d  reason: collision with root package name */
    public int f3692d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f3693e;

    /* renamed from: f  reason: collision with root package name */
    public int f3694f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public f f3695h;
    public ColorStateList i;

    /* renamed from: j  reason: collision with root package name */
    public int f3696j = -1;

    /* renamed from: k  reason: collision with root package name */
    public int f3697k = -1;

    /* renamed from: l  reason: collision with root package name */
    public int f3698l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f3699m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f3700n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3701o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f3702p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3703q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f3704r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f3705s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f3706t;

    /* renamed from: u  reason: collision with root package name */
    public int f3707u;

    /* renamed from: v  reason: collision with root package name */
    public int f3708v;

    /* renamed from: w  reason: collision with root package name */
    public i f3709w;

    /* renamed from: x  reason: collision with root package name */
    public boolean f3710x;

    /* renamed from: y  reason: collision with root package name */
    public final BottomSheetBehavior<V>.e f3711y = new e();
    public ValueAnimator z;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f3712a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int f3713b;

        public a(View view, int i) {
            this.f3712a = view;
            this.f3713b = i;
        }

        public final void run() {
            BottomSheetBehavior.this.H(this.f3712a, this.f3713b, false);
        }
    }

    public class b extends c.C0221c {
        public b() {
        }

        public final int a(View view, int i) {
            return view.getLeft();
        }

        public final int b(View view, int i) {
            int z = BottomSheetBehavior.this.z();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return y.c.s(i, z, bottomSheetBehavior.G ? bottomSheetBehavior.Q : bottomSheetBehavior.E);
        }

        public final int d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (bottomSheetBehavior.G) {
                return bottomSheetBehavior.Q;
            }
            return bottomSheetBehavior.E;
        }

        public final void f(int i) {
            if (i == 1) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.I) {
                    bottomSheetBehavior.F(1);
                }
            }
        }

        public final void g(View view, int i, int i10) {
            BottomSheetBehavior.this.v(i10);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0080, code lost:
            if (java.lang.Math.abs(r8.getTop() - r7.f3715a.z()) < java.lang.Math.abs(r8.getTop() - r7.f3715a.C)) goto L_0x000f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d6, code lost:
            if (java.lang.Math.abs(r9 - r10.B) < java.lang.Math.abs(r9 - r7.f3715a.E)) goto L_0x000f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (r9 > r7.f3715a.C) goto L_0x00b9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void h(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r0 = 0
                int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                r2 = 1
                r3 = 4
                r4 = 6
                r5 = 3
                if (r1 >= 0) goto L_0x0026
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f3690b
                if (r9 == 0) goto L_0x0012
            L_0x000f:
                r3 = r5
                goto L_0x0107
            L_0x0012:
                int r9 = r8.getTop()
                java.lang.System.currentTimeMillis()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.C
                if (r9 <= r10) goto L_0x000f
                goto L_0x00b9
            L_0x0026:
                com.google.android.material.bottomsheet.BottomSheetBehavior r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r6 = r1.G
                if (r6 == 0) goto L_0x0083
                boolean r1 = r1.G(r8, r10)
                if (r1 == 0) goto L_0x0083
                float r9 = java.lang.Math.abs(r9)
                float r0 = java.lang.Math.abs(r10)
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x0044
                r9 = 1140457472(0x43fa0000, float:500.0)
                int r9 = (r10 > r9 ? 1 : (r10 == r9 ? 0 : -1))
                if (r9 > 0) goto L_0x005a
            L_0x0044:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r10.Q
                int r10 = r10.z()
                int r10 = r10 + r0
                int r10 = r10 / 2
                if (r9 <= r10) goto L_0x0057
                r9 = r2
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                if (r9 == 0) goto L_0x005d
            L_0x005a:
                r3 = 5
                goto L_0x0107
            L_0x005d:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f3690b
                if (r9 == 0) goto L_0x0064
                goto L_0x000f
            L_0x0064:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.z()
                int r9 = r9 - r10
                int r9 = java.lang.Math.abs(r9)
                int r10 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.C
                int r10 = r10 - r0
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00b9
                goto L_0x000f
            L_0x0083:
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L_0x00bb
                float r9 = java.lang.Math.abs(r9)
                float r10 = java.lang.Math.abs(r10)
                int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
                if (r9 <= 0) goto L_0x0094
                goto L_0x00bb
            L_0x0094:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r9 = r9.f3690b
                if (r9 == 0) goto L_0x009b
                goto L_0x0107
            L_0x009b:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r10 = r10.C
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.E
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0107
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r9)
            L_0x00b9:
                r3 = r4
                goto L_0x0107
            L_0x00bb:
                int r9 = r8.getTop()
                com.google.android.material.bottomsheet.BottomSheetBehavior r10 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                boolean r0 = r10.f3690b
                if (r0 == 0) goto L_0x00da
                int r10 = r10.B
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.E
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0107
                goto L_0x000f
            L_0x00da:
                int r0 = r10.C
                if (r9 >= r0) goto L_0x00f0
                int r10 = r10.E
                int r10 = r9 - r10
                int r10 = java.lang.Math.abs(r10)
                if (r9 >= r10) goto L_0x00ea
                goto L_0x000f
            L_0x00ea:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r9)
                goto L_0x00b9
            L_0x00f0:
                int r10 = r9 - r0
                int r10 = java.lang.Math.abs(r10)
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                int r0 = r0.E
                int r9 = r9 - r0
                int r9 = java.lang.Math.abs(r9)
                if (r10 >= r9) goto L_0x0107
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r9)
                goto L_0x00b9
            L_0x0107:
                com.google.android.material.bottomsheet.BottomSheetBehavior r9 = com.google.android.material.bottomsheet.BottomSheetBehavior.this
                java.util.Objects.requireNonNull(r9)
                r9.H(r8, r3, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.b.h(android.view.View, float, float):void");
        }

        public final boolean i(View view, int i) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i10 = bottomSheetBehavior.J;
            if (i10 == 1 || bottomSheetBehavior.X) {
                return false;
            }
            if (i10 == 3 && bottomSheetBehavior.V == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.S;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.R;
            if (weakReference2 == null || weakReference2.get() != view) {
                return false;
            }
            return true;
        }
    }

    public static abstract class c {
        public void a(View view) {
        }

        public abstract void b(View view);

        public abstract void c(View view, int i);
    }

    public class e {

        /* renamed from: a  reason: collision with root package name */
        public int f3721a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f3722b;

        /* renamed from: c  reason: collision with root package name */
        public final a f3723c = new a();

        public class a implements Runnable {
            public a() {
            }

            public final void run() {
                e eVar = e.this;
                eVar.f3722b = false;
                t0.c cVar = BottomSheetBehavior.this.K;
                if (cVar == null || !cVar.h()) {
                    e eVar2 = e.this;
                    BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                    if (bottomSheetBehavior.J == 2) {
                        bottomSheetBehavior.F(eVar2.f3721a);
                        return;
                    }
                    return;
                }
                e eVar3 = e.this;
                eVar3.a(eVar3.f3721a);
            }
        }

        public e() {
        }

        public final void a(int i) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.R;
            if (weakReference != null && weakReference.get() != null) {
                this.f3721a = i;
                if (!this.f3722b) {
                    a aVar = this.f3723c;
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.d.m((View) BottomSheetBehavior.this.R.get(), aVar);
                    this.f3722b = true;
                }
            }
        }
    }

    public BottomSheetBehavior() {
    }

    public static <V extends View> BottomSheetBehavior<V> x(V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.f) {
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) layoutParams).f1619a;
            if (cVar instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) cVar;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public final int A(int i10) {
        if (i10 == 3) {
            return z();
        }
        if (i10 == 4) {
            return this.E;
        }
        if (i10 == 5) {
            return this.Q;
        }
        if (i10 == 6) {
            return this.C;
        }
        throw new IllegalArgumentException(m.b("Invalid state to get top offset: ", i10));
    }

    public final void B(V v10, b.a aVar, int i10) {
        x.n(v10, aVar, new l5.c(this, i10));
    }

    public final void C(boolean z10) {
        if (this.G != z10) {
            this.G = z10;
            if (!z10 && this.J == 5) {
                E(4);
            }
            I();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D(int r4) {
        /*
            r3 = this;
            r0 = 1
            r1 = -1
            r2 = 0
            if (r4 != r1) goto L_0x000c
            boolean r4 = r3.f3693e
            if (r4 != 0) goto L_0x0015
            r3.f3693e = r0
            goto L_0x001f
        L_0x000c:
            boolean r1 = r3.f3693e
            if (r1 != 0) goto L_0x0017
            int r1 = r3.f3692d
            if (r1 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r2
            goto L_0x001f
        L_0x0017:
            r3.f3693e = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.f3692d = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.L()
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        if (n0.x.g.b(r4) != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void E(int r4) {
        /*
            r3 = this;
            r0 = 1
            if (r4 == r0) goto L_0x0074
            r1 = 2
            if (r4 != r1) goto L_0x0008
            goto L_0x0074
        L_0x0008:
            boolean r1 = r3.G
            if (r1 != 0) goto L_0x0026
            r1 = 5
            if (r4 != r1) goto L_0x0026
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot set state: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "BottomSheetBehavior"
            android.util.Log.w(r0, r4)
            return
        L_0x0026:
            r1 = 6
            if (r4 != r1) goto L_0x0037
            boolean r1 = r3.f3690b
            if (r1 == 0) goto L_0x0037
            int r1 = r3.A(r4)
            int r2 = r3.B
            if (r1 > r2) goto L_0x0037
            r1 = 3
            goto L_0x0038
        L_0x0037:
            r1 = r4
        L_0x0038:
            java.lang.ref.WeakReference<V> r2 = r3.R
            if (r2 == 0) goto L_0x0070
            java.lang.Object r2 = r2.get()
            if (r2 != 0) goto L_0x0043
            goto L_0x0070
        L_0x0043:
            java.lang.ref.WeakReference<V> r4 = r3.R
            java.lang.Object r4 = r4.get()
            android.view.View r4 = (android.view.View) r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$a r2 = new com.google.android.material.bottomsheet.BottomSheetBehavior$a
            r2.<init>(r4, r1)
            android.view.ViewParent r1 = r4.getParent()
            if (r1 == 0) goto L_0x0065
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L_0x0065
            java.util.WeakHashMap<android.view.View, n0.a0> r1 = n0.x.f8842a
            boolean r1 = n0.x.g.b(r4)
            if (r1 == 0) goto L_0x0065
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r0 == 0) goto L_0x006c
            r4.post(r2)
            goto L_0x0073
        L_0x006c:
            r2.run()
            goto L_0x0073
        L_0x0070:
            r3.F(r4)
        L_0x0073:
            return
        L_0x0074:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "STATE_"
            java.lang.StringBuilder r2 = a.a.d(r2)
            if (r4 != r0) goto L_0x0081
            java.lang.String r4 = "DRAGGING"
            goto L_0x0083
        L_0x0081:
            java.lang.String r4 = "SETTLING"
        L_0x0083:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r4 = android.support.v4.media.a.e(r2, r4, r0)
            r1.<init>(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.E(int):void");
    }

    public final void F(int i10) {
        View view;
        if (this.J != i10) {
            this.J = i10;
            if (!(i10 == 4 || i10 == 3 || i10 == 6)) {
                boolean z10 = this.G;
            }
            WeakReference<V> weakReference = this.R;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i10 == 3) {
                    K(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    K(false);
                }
                J(i10);
                for (int i11 = 0; i11 < this.T.size(); i11++) {
                    this.T.get(i11).c(view, i10);
                }
                I();
            }
        }
    }

    public final boolean G(View view, float f10) {
        if (this.H) {
            return true;
        }
        if (view.getTop() < this.E) {
            return false;
        }
        if (Math.abs(((f10 * 0.1f) + ((float) view.getTop())) - ((float) this.E)) / ((float) u()) > 0.5f) {
            return true;
        }
        return false;
    }

    public final void H(View view, int i10, boolean z10) {
        int A2 = A(i10);
        t0.c cVar = this.K;
        if (cVar != null && (!z10 ? cVar.v(view, view.getLeft(), A2) : cVar.t(view.getLeft(), A2))) {
            F(2);
            J(i10);
            this.f3711y.a(i10);
            return;
        }
        F(i10);
    }

    public final void I() {
        View view;
        int i10;
        WeakReference<V> weakReference = this.R;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            x.m(524288, view);
            x.j(view, 0);
            x.m(262144, view);
            x.j(view, 0);
            x.m(1048576, view);
            x.j(view, 0);
            int i11 = this.Z;
            if (i11 != -1) {
                x.m(i11, view);
                x.j(view, 0);
            }
            int i12 = 6;
            if (!this.f3690b && this.J != 6) {
                String string = view.getResources().getString(R.string.bottomsheet_action_expand_halfway);
                l5.c cVar = new l5.c(this, 6);
                List<b.a> h10 = x.h(view);
                int i13 = 0;
                while (true) {
                    if (i13 >= h10.size()) {
                        int i14 = 0;
                        int i15 = -1;
                        while (true) {
                            int[] iArr = x.f8845d;
                            if (i14 >= iArr.length || i15 != -1) {
                                i10 = i15;
                            } else {
                                int i16 = iArr[i14];
                                boolean z10 = true;
                                for (int i17 = 0; i17 < h10.size(); i17++) {
                                    z10 &= h10.get(i17).a() != i16;
                                }
                                if (z10) {
                                    i15 = i16;
                                }
                                i14++;
                            }
                        }
                        i10 = i15;
                    } else if (TextUtils.equals(string, h10.get(i13).b())) {
                        i10 = h10.get(i13).a();
                        break;
                    } else {
                        i13++;
                    }
                }
                if (i10 != -1) {
                    x.a(view, new b.a((Object) null, i10, string, cVar, (Class<? extends d.a>) null));
                }
                this.Z = i10;
            }
            if (this.G && this.J != 5) {
                B(view, b.a.f9179j, 5);
            }
            int i18 = this.J;
            if (i18 == 3) {
                if (this.f3690b) {
                    i12 = 4;
                }
                B(view, b.a.i, i12);
            } else if (i18 == 4) {
                if (this.f3690b) {
                    i12 = 3;
                }
                B(view, b.a.f9178h, i12);
            } else if (i18 == 6) {
                B(view, b.a.i, 4);
                B(view, b.a.f9178h, 3);
            }
        }
    }

    public final void J(int i10) {
        ValueAnimator valueAnimator;
        if (i10 != 2) {
            boolean z10 = i10 == 3;
            if (this.f3710x != z10) {
                this.f3710x = z10;
                if (this.f3695h != null && (valueAnimator = this.z) != null) {
                    if (valueAnimator.isRunning()) {
                        this.z.reverse();
                        return;
                    }
                    float f10 = z10 ? 0.0f : 1.0f;
                    this.z.setFloatValues(new float[]{1.0f - f10, f10});
                    this.z.start();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.Map<android.view.View, java.lang.Integer>, java.util.HashMap] */
    public final void K(boolean z10) {
        WeakReference<V> weakReference = this.R;
        if (weakReference != null) {
            ViewParent parent = weakReference.get().getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z10) {
                    if (this.Y == null) {
                        this.Y = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i10 = 0; i10 < childCount; i10++) {
                    V childAt = coordinatorLayout.getChildAt(i10);
                    if (childAt != this.R.get() && z10) {
                        this.Y.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    }
                }
                if (!z10) {
                    this.Y = null;
                }
            }
        }
    }

    public final void L() {
        View view;
        if (this.R != null) {
            t();
            if (this.J == 4 && (view = (View) this.R.get()) != null) {
                view.requestLayout();
            }
        }
    }

    public final void c(CoordinatorLayout.f fVar) {
        this.R = null;
        this.K = null;
    }

    public final void f() {
        this.R = null;
        this.K = null;
    }

    public final boolean g(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        t0.c cVar;
        if (!v10.isShown() || !this.I) {
            this.L = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        View view = null;
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.W = (int) motionEvent.getY();
            if (this.J != 2) {
                WeakReference<View> weakReference = this.S;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.p(view2, x10, this.W)) {
                    this.V = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.X = true;
                }
            }
            this.L = this.V == -1 && !coordinatorLayout.p(v10, x10, this.W);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.X = false;
            this.V = -1;
            if (this.L) {
                this.L = false;
                return false;
            }
        }
        if (!this.L && (cVar = this.K) != null && cVar.u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.S;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        if (actionMasked != 2 || view == null || this.L || this.J == 1 || coordinatorLayout.p(view, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.K == null || Math.abs(((float) this.W) - motionEvent.getY()) <= ((float) this.K.f11218b)) {
            return false;
        }
        return true;
    }

    public final boolean h(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.d.b(coordinatorLayout) && !x.d.b(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.R == null) {
            this.f3694f = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            boolean z10 = Build.VERSION.SDK_INT >= 29 && !this.f3699m && !this.f3693e;
            if (this.f3700n || this.f3701o || this.f3702p || this.f3704r || this.f3705s || this.f3706t || z10) {
                x.i.u(v10, new r(new l5.b(this, z10), new t.b(x.e.f(v10), v10.getPaddingTop(), x.e.e(v10), v10.getPaddingBottom())));
                if (x.g.b(v10)) {
                    x.h.c(v10);
                } else {
                    v10.addOnAttachStateChangeListener(new s());
                }
            }
            this.R = new WeakReference<>(v10);
            f fVar = this.f3695h;
            if (fVar != null) {
                x.d.q(v10, fVar);
                f fVar2 = this.f3695h;
                float f10 = this.F;
                if (f10 == -1.0f) {
                    f10 = x.i.i(v10);
                }
                fVar2.n(f10);
                boolean z11 = this.J == 3;
                this.f3710x = z11;
                this.f3695h.p(z11 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.i;
                if (colorStateList != null) {
                    x.i.q(v10, colorStateList);
                }
            }
            I();
            if (x.d.c(v10) == 0) {
                x.d.s(v10, 1);
            }
        }
        if (this.K == null) {
            this.K = new t0.c(coordinatorLayout.getContext(), coordinatorLayout, this.f3689a0);
        }
        int top = v10.getTop();
        coordinatorLayout.r(v10, i10);
        this.P = coordinatorLayout.getWidth();
        this.Q = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.O = height;
        int i11 = this.Q;
        int i12 = i11 - height;
        int i13 = this.f3708v;
        if (i12 < i13) {
            if (this.f3703q) {
                this.O = i11;
            } else {
                this.O = i11 - i13;
            }
        }
        this.B = Math.max(0, i11 - this.O);
        this.C = (int) ((1.0f - this.D) * ((float) this.Q));
        t();
        int i14 = this.J;
        if (i14 == 3) {
            v10.offsetTopAndBottom(z());
        } else if (i14 == 6) {
            v10.offsetTopAndBottom(this.C);
        } else if (this.G && i14 == 5) {
            v10.offsetTopAndBottom(this.Q);
        } else if (i14 == 4) {
            v10.offsetTopAndBottom(this.E);
        } else if (i14 == 1 || i14 == 2) {
            v10.offsetTopAndBottom(top - v10.getTop());
        }
        this.S = new WeakReference<>(w(v10));
        for (int i15 = 0; i15 < this.T.size(); i15++) {
            this.T.get(i15).a(v10);
        }
        return true;
    }

    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i10, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f3696j, marginLayoutParams.width), y(i12, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.f3697k, marginLayoutParams.height));
        return true;
    }

    public final boolean j(View view) {
        WeakReference<View> weakReference = this.S;
        return (weakReference == null || view != weakReference.get() || this.J == 3) ? false : true;
    }

    public final void k(CoordinatorLayout coordinatorLayout, V v10, View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 != 1) {
            WeakReference<View> weakReference = this.S;
            if (view == (weakReference != null ? weakReference.get() : null)) {
                int top = v10.getTop();
                int i13 = top - i11;
                if (i11 > 0) {
                    if (i13 < z()) {
                        iArr[1] = top - z();
                        WeakHashMap<View, a0> weakHashMap = x.f8842a;
                        v10.offsetTopAndBottom(-iArr[1]);
                        F(3);
                    } else if (this.I) {
                        iArr[1] = i11;
                        WeakHashMap<View, a0> weakHashMap2 = x.f8842a;
                        v10.offsetTopAndBottom(-i11);
                        F(1);
                    } else {
                        return;
                    }
                } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                    int i14 = this.E;
                    if (i13 > i14 && !this.G) {
                        iArr[1] = top - i14;
                        WeakHashMap<View, a0> weakHashMap3 = x.f8842a;
                        v10.offsetTopAndBottom(-iArr[1]);
                        F(4);
                    } else if (this.I) {
                        iArr[1] = i11;
                        WeakHashMap<View, a0> weakHashMap4 = x.f8842a;
                        v10.offsetTopAndBottom(-i11);
                        F(1);
                    } else {
                        return;
                    }
                }
                v(v10.getTop());
                this.M = i11;
                this.N = true;
            }
        }
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int[] iArr) {
    }

    public final void n(View view, Parcelable parcelable) {
        d dVar = (d) parcelable;
        int i10 = this.f3688a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f3692d = dVar.f3717s;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f3690b = dVar.f3718t;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.G = dVar.f3719u;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.H = dVar.f3720v;
            }
        }
        int i11 = dVar.f3716c;
        if (i11 == 1 || i11 == 2) {
            this.J = 4;
        } else {
            this.J = i11;
        }
    }

    public final Parcelable o(View view) {
        return new d((Parcelable) View.BaseSavedState.EMPTY_STATE, (BottomSheetBehavior<?>) this);
    }

    public final boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i10, int i11) {
        this.M = 0;
        this.N = false;
        if ((i10 & 2) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0031, code lost:
        if (r5.getTop() <= r3.C) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        if (java.lang.Math.abs(r4 - r3.B) < java.lang.Math.abs(r4 - r3.E)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        if (r4 < java.lang.Math.abs(r4 - r3.E)) goto L_0x00b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        if (java.lang.Math.abs(r4 - r1) < java.lang.Math.abs(r4 - r3.E)) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (java.lang.Math.abs(r4 - r3.C) < java.lang.Math.abs(r4 - r3.E)) goto L_0x00ad;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, int r7) {
        /*
            r3 = this;
            int r4 = r5.getTop()
            int r7 = r3.z()
            r0 = 3
            if (r4 != r7) goto L_0x000f
            r3.F(r0)
            return
        L_0x000f:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.S
            if (r4 == 0) goto L_0x00b6
            java.lang.Object r4 = r4.get()
            if (r6 != r4) goto L_0x00b6
            boolean r4 = r3.N
            if (r4 != 0) goto L_0x001f
            goto L_0x00b6
        L_0x001f:
            int r4 = r3.M
            r6 = 4
            r7 = 6
            if (r4 <= 0) goto L_0x0035
            boolean r4 = r3.f3690b
            if (r4 == 0) goto L_0x002b
            goto L_0x00b0
        L_0x002b:
            int r4 = r5.getTop()
            int r6 = r3.C
            if (r4 <= r6) goto L_0x00b0
            goto L_0x00ad
        L_0x0035:
            boolean r4 = r3.G
            if (r4 == 0) goto L_0x0056
            android.view.VelocityTracker r4 = r3.U
            if (r4 != 0) goto L_0x003f
            r4 = 0
            goto L_0x004e
        L_0x003f:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.f3691c
            r4.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r4 = r3.U
            int r1 = r3.V
            float r4 = r4.getYVelocity(r1)
        L_0x004e:
            boolean r4 = r3.G(r5, r4)
            if (r4 == 0) goto L_0x0056
            r0 = 5
            goto L_0x00b0
        L_0x0056:
            int r4 = r3.M
            if (r4 != 0) goto L_0x0093
            int r4 = r5.getTop()
            boolean r1 = r3.f3690b
            if (r1 == 0) goto L_0x0074
            int r7 = r3.B
            int r7 = r4 - r7
            int r7 = java.lang.Math.abs(r7)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r7 >= r4) goto L_0x00af
            goto L_0x00b0
        L_0x0074:
            int r1 = r3.C
            if (r4 >= r1) goto L_0x0083
            int r6 = r3.E
            int r6 = r4 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r4 >= r6) goto L_0x00ad
            goto L_0x00b0
        L_0x0083:
            int r0 = r4 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
            goto L_0x00ad
        L_0x0093:
            boolean r4 = r3.f3690b
            if (r4 == 0) goto L_0x0098
            goto L_0x00af
        L_0x0098:
            int r4 = r5.getTop()
            int r0 = r3.C
            int r0 = r4 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r3.E
            int r4 = r4 - r1
            int r4 = java.lang.Math.abs(r4)
            if (r0 >= r4) goto L_0x00af
        L_0x00ad:
            r0 = r7
            goto L_0x00b0
        L_0x00af:
            r0 = r6
        L_0x00b0:
            r4 = 0
            r3.H(r5, r0, r4)
            r3.N = r4
        L_0x00b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.q(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    public final boolean r(CoordinatorLayout coordinatorLayout, V v10, MotionEvent motionEvent) {
        boolean z10 = false;
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i10 = this.J;
        if (i10 == 1 && actionMasked == 0) {
            return true;
        }
        t0.c cVar = this.K;
        if (cVar != null && (this.I || i10 == 1)) {
            cVar.n(motionEvent);
        }
        if (actionMasked == 0) {
            this.V = -1;
            VelocityTracker velocityTracker = this.U;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.U = null;
            }
        }
        if (this.U == null) {
            this.U = VelocityTracker.obtain();
        }
        this.U.addMovement(motionEvent);
        if (this.K != null && (this.I || this.J == 1)) {
            z10 = true;
        }
        if (z10 && actionMasked == 2 && !this.L) {
            float abs = Math.abs(((float) this.W) - motionEvent.getY());
            t0.c cVar2 = this.K;
            if (abs > ((float) cVar2.f11218b)) {
                cVar2.b(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.L;
    }

    public final void s(c cVar) {
        if (!this.T.contains(cVar)) {
            this.T.add(cVar);
        }
    }

    public final void t() {
        int u10 = u();
        if (this.f3690b) {
            this.E = Math.max(this.Q - u10, this.B);
        } else {
            this.E = this.Q - u10;
        }
    }

    public final int u() {
        int i10;
        if (this.f3693e) {
            return Math.min(Math.max(this.f3694f, this.Q - ((this.P * 9) / 16)), this.O) + this.f3707u;
        }
        if (this.f3699m || this.f3700n || (i10 = this.f3698l) <= 0) {
            return this.f3692d + this.f3707u;
        }
        return Math.max(this.f3692d, i10 + this.g);
    }

    public final void v(int i10) {
        View view = (View) this.R.get();
        if (view != null && !this.T.isEmpty()) {
            int i11 = this.E;
            if (i10 <= i11 && i11 != z()) {
                z();
            }
            for (int i12 = 0; i12 < this.T.size(); i12++) {
                this.T.get(i12).b(view);
            }
        }
    }

    public final View w(View view) {
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.i.p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View w6 = w(viewGroup.getChildAt(i10));
            if (w6 != null) {
                return w6;
            }
        }
        return null;
    }

    public final int y(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK);
    }

    public final int z() {
        if (this.f3690b) {
            return this.B;
        }
        return Math.max(this.A, this.f3703q ? 0 : this.f3708v);
    }

    public static class d extends s0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public final int f3716c;

        /* renamed from: s  reason: collision with root package name */
        public int f3717s;

        /* renamed from: t  reason: collision with root package name */
        public boolean f3718t;

        /* renamed from: u  reason: collision with root package name */
        public boolean f3719u;

        /* renamed from: v  reason: collision with root package name */
        public boolean f3720v;

        public class a implements Parcelable.ClassLoaderCreator<d> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new d[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new d(parcel, (ClassLoader) null);
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3716c = parcel.readInt();
            this.f3717s = parcel.readInt();
            boolean z = false;
            this.f3718t = parcel.readInt() == 1;
            this.f3719u = parcel.readInt() == 1;
            this.f3720v = parcel.readInt() == 1 ? true : z;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f10849a, i);
            parcel.writeInt(this.f3716c);
            parcel.writeInt(this.f3717s);
            parcel.writeInt(this.f3718t ? 1 : 0);
            parcel.writeInt(this.f3719u ? 1 : 0);
            parcel.writeInt(this.f3720v ? 1 : 0);
        }

        public d(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f3716c = bottomSheetBehavior.J;
            this.f3717s = bottomSheetBehavior.f3692d;
            this.f3718t = bottomSheetBehavior.f3690b;
            this.f3719u = bottomSheetBehavior.G;
            this.f3720v = bottomSheetBehavior.H;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i10;
        this.g = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e5.a.f4620d);
        int i11 = 3;
        if (obtainStyledAttributes.hasValue(3)) {
            this.i = b6.c.a(context, obtainStyledAttributes, 3);
        }
        if (obtainStyledAttributes.hasValue(20)) {
            this.f3709w = new i(i.b(context, attributeSet, R.attr.bottomSheetStyle, 2131821386));
        }
        if (this.f3709w != null) {
            f fVar = new f(this.f3709w);
            this.f3695h = fVar;
            fVar.m(context);
            ColorStateList colorStateList = this.i;
            if (colorStateList != null) {
                this.f3695h.o(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.f3695h.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.z = ofFloat;
        ofFloat.setDuration(500);
        this.z.addUpdateListener(new l5.a(this));
        this.F = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f3696j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.f3697k = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i10 = peekValue.data) != -1) {
            D(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            D(i10);
        }
        C(obtainStyledAttributes.getBoolean(8, false));
        this.f3699m = obtainStyledAttributes.getBoolean(12, false);
        boolean z10 = obtainStyledAttributes.getBoolean(6, true);
        if (this.f3690b != z10) {
            this.f3690b = z10;
            if (this.R != null) {
                t();
            }
            F((!this.f3690b || this.J != 6) ? this.J : i11);
            I();
        }
        this.H = obtainStyledAttributes.getBoolean(11, false);
        this.I = obtainStyledAttributes.getBoolean(4, true);
        this.f3688a = obtainStyledAttributes.getInt(10, 0);
        float f10 = obtainStyledAttributes.getFloat(7, 0.5f);
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.D = f10;
        if (this.R != null) {
            this.C = (int) ((1.0f - f10) * ((float) this.Q));
        }
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
            if (dimensionPixelOffset >= 0) {
                this.A = dimensionPixelOffset;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        } else {
            int i12 = peekValue2.data;
            if (i12 >= 0) {
                this.A = i12;
            } else {
                throw new IllegalArgumentException("offset must be greater than or equal to 0");
            }
        }
        this.f3700n = obtainStyledAttributes.getBoolean(16, false);
        this.f3701o = obtainStyledAttributes.getBoolean(17, false);
        this.f3702p = obtainStyledAttributes.getBoolean(18, false);
        this.f3703q = obtainStyledAttributes.getBoolean(19, true);
        this.f3704r = obtainStyledAttributes.getBoolean(13, false);
        this.f3705s = obtainStyledAttributes.getBoolean(14, false);
        this.f3706t = obtainStyledAttributes.getBoolean(15, false);
        obtainStyledAttributes.recycle();
        this.f3691c = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
