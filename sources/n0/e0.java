package n0;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.x;

public final class e0 {

    /* renamed from: b  reason: collision with root package name */
    public static final e0 f8797b;

    /* renamed from: a  reason: collision with root package name */
    public final k f8798a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static Field f8799a;

        /* renamed from: b  reason: collision with root package name */
        public static Field f8800b;

        /* renamed from: c  reason: collision with root package name */
        public static Field f8801c;

        /* renamed from: d  reason: collision with root package name */
        public static boolean f8802d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f8799a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f8800b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f8801c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder d10 = a.a.d("Failed to get visible insets from AttachInfo ");
                d10.append(e10.getMessage());
                Log.w("WindowInsetsCompat", d10.toString(), e10);
            }
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(e0 e0Var) {
            super(e0Var);
        }
    }

    public static class e {

        /* renamed from: a  reason: collision with root package name */
        public final e0 f8809a;

        public e() {
            this(new e0());
        }

        public final void a() {
        }

        public e0 b() {
            throw null;
        }

        public void c(g0.b bVar) {
            throw null;
        }

        public void d(g0.b bVar) {
            throw null;
        }

        public e(e0 e0Var) {
            this.f8809a = e0Var;
        }
    }

    public static class f extends k {

        /* renamed from: h  reason: collision with root package name */
        public static boolean f8810h = false;
        public static Method i;

        /* renamed from: j  reason: collision with root package name */
        public static Class<?> f8811j;

        /* renamed from: k  reason: collision with root package name */
        public static Field f8812k;

        /* renamed from: l  reason: collision with root package name */
        public static Field f8813l;

        /* renamed from: c  reason: collision with root package name */
        public final WindowInsets f8814c;

        /* renamed from: d  reason: collision with root package name */
        public g0.b[] f8815d;

        /* renamed from: e  reason: collision with root package name */
        public g0.b f8816e = null;

        /* renamed from: f  reason: collision with root package name */
        public e0 f8817f;
        public g0.b g;

        public f(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var);
            this.f8814c = windowInsets;
        }

        private g0.b r(int i10, boolean z) {
            g0.b bVar = g0.b.f5202e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    bVar = g0.b.a(bVar, s(i11, z));
                }
            }
            return bVar;
        }

        private g0.b t() {
            e0 e0Var = this.f8817f;
            if (e0Var != null) {
                return e0Var.f8798a.h();
            }
            return g0.b.f5202e;
        }

        private g0.b u(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f8810h) {
                    v();
                }
                Method method = i;
                if (!(method == null || f8811j == null || f8812k == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f8812k.get(f8813l.get(invoke));
                        if (rect != null) {
                            return g0.b.c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e10) {
                        StringBuilder d10 = a.a.d("Failed to get visible insets. (Reflection error). ");
                        d10.append(e10.getMessage());
                        Log.e("WindowInsetsCompat", d10.toString(), e10);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        private static void v() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f8811j = cls;
                f8812k = cls.getDeclaredField("mVisibleInsets");
                f8813l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f8812k.setAccessible(true);
                f8813l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                StringBuilder d10 = a.a.d("Failed to get visible insets. (Reflection error). ");
                d10.append(e10.getMessage());
                Log.e("WindowInsetsCompat", d10.toString(), e10);
            }
            f8810h = true;
        }

        public void d(View view) {
            g0.b u10 = u(view);
            if (u10 == null) {
                u10 = g0.b.f5202e;
            }
            w(u10);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.g, ((f) obj).g);
        }

        public g0.b f(int i10) {
            return r(i10, false);
        }

        public final g0.b j() {
            if (this.f8816e == null) {
                this.f8816e = g0.b.b(this.f8814c.getSystemWindowInsetLeft(), this.f8814c.getSystemWindowInsetTop(), this.f8814c.getSystemWindowInsetRight(), this.f8814c.getSystemWindowInsetBottom());
            }
            return this.f8816e;
        }

        public e0 l(int i10, int i11, int i12, int i13) {
            e eVar;
            e0 k10 = e0.k(this.f8814c, (View) null);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                eVar = new d(k10);
            } else if (i14 >= 29) {
                eVar = new c(k10);
            } else {
                eVar = new b(k10);
            }
            eVar.d(e0.g(j(), i10, i11, i12, i13));
            eVar.c(e0.g(h(), i10, i11, i12, i13));
            return eVar.b();
        }

        public boolean n() {
            return this.f8814c.isRound();
        }

        public void o(g0.b[] bVarArr) {
            this.f8815d = bVarArr;
        }

        public void p(e0 e0Var) {
            this.f8817f = e0Var;
        }

        public g0.b s(int i10, boolean z) {
            int i11;
            d dVar;
            if (i10 != 1) {
                g0.b bVar = null;
                if (i10 != 2) {
                    if (i10 == 8) {
                        g0.b[] bVarArr = this.f8815d;
                        if (bVarArr != null) {
                            bVar = bVarArr[3];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        g0.b j10 = j();
                        g0.b t10 = t();
                        int i12 = j10.f5206d;
                        if (i12 > t10.f5206d) {
                            return g0.b.b(0, 0, 0, i12);
                        }
                        g0.b bVar2 = this.g;
                        if (bVar2 == null || bVar2.equals(g0.b.f5202e) || (i11 = this.g.f5206d) <= t10.f5206d) {
                            return g0.b.f5202e;
                        }
                        return g0.b.b(0, 0, 0, i11);
                    } else if (i10 == 16) {
                        return i();
                    } else {
                        if (i10 == 32) {
                            return g();
                        }
                        if (i10 == 64) {
                            return k();
                        }
                        if (i10 != 128) {
                            return g0.b.f5202e;
                        }
                        e0 e0Var = this.f8817f;
                        if (e0Var != null) {
                            dVar = e0Var.f8798a.e();
                        } else {
                            dVar = e();
                        }
                        if (dVar != null) {
                            return g0.b.b(dVar.b(), dVar.d(), dVar.c(), dVar.a());
                        }
                        return g0.b.f5202e;
                    }
                } else if (z) {
                    g0.b t11 = t();
                    g0.b h10 = h();
                    return g0.b.b(Math.max(t11.f5203a, h10.f5203a), 0, Math.max(t11.f5205c, h10.f5205c), Math.max(t11.f5206d, h10.f5206d));
                } else {
                    g0.b j11 = j();
                    e0 e0Var2 = this.f8817f;
                    if (e0Var2 != null) {
                        bVar = e0Var2.f8798a.h();
                    }
                    int i13 = j11.f5206d;
                    if (bVar != null) {
                        i13 = Math.min(i13, bVar.f5206d);
                    }
                    return g0.b.b(j11.f5203a, 0, j11.f5205c, i13);
                }
            } else if (z) {
                return g0.b.b(0, Math.max(t().f5204b, j().f5204b), 0, 0);
            } else {
                return g0.b.b(0, j().f5204b, 0, 0);
            }
        }

        public void w(g0.b bVar) {
            this.g = bVar;
        }
    }

    public static class g extends f {

        /* renamed from: m  reason: collision with root package name */
        public g0.b f8818m = null;

        public g(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public e0 b() {
            return e0.k(this.f8814c.consumeStableInsets(), (View) null);
        }

        public e0 c() {
            return e0.k(this.f8814c.consumeSystemWindowInsets(), (View) null);
        }

        public final g0.b h() {
            if (this.f8818m == null) {
                this.f8818m = g0.b.b(this.f8814c.getStableInsetLeft(), this.f8814c.getStableInsetTop(), this.f8814c.getStableInsetRight(), this.f8814c.getStableInsetBottom());
            }
            return this.f8818m;
        }

        public boolean m() {
            return this.f8814c.isConsumed();
        }

        public void q(g0.b bVar) {
            this.f8818m = bVar;
        }
    }

    public static class h extends g {
        public h(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public e0 a() {
            return e0.k(this.f8814c.consumeDisplayCutout(), (View) null);
        }

        public d e() {
            DisplayCutout displayCutout = this.f8814c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new d(displayCutout);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            if (!Objects.equals(this.f8814c, hVar.f8814c) || !Objects.equals(this.g, hVar.g)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return this.f8814c.hashCode();
        }
    }

    public static class i extends h {

        /* renamed from: n  reason: collision with root package name */
        public g0.b f8819n = null;

        /* renamed from: o  reason: collision with root package name */
        public g0.b f8820o = null;

        /* renamed from: p  reason: collision with root package name */
        public g0.b f8821p = null;

        public i(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public g0.b g() {
            if (this.f8820o == null) {
                this.f8820o = g0.b.d(this.f8814c.getMandatorySystemGestureInsets());
            }
            return this.f8820o;
        }

        public g0.b i() {
            if (this.f8819n == null) {
                this.f8819n = g0.b.d(this.f8814c.getSystemGestureInsets());
            }
            return this.f8819n;
        }

        public g0.b k() {
            if (this.f8821p == null) {
                this.f8821p = g0.b.d(this.f8814c.getTappableElementInsets());
            }
            return this.f8821p;
        }

        public e0 l(int i, int i10, int i11, int i12) {
            return e0.k(this.f8814c.inset(i, i10, i11, i12), (View) null);
        }

        public void q(g0.b bVar) {
        }
    }

    public static class j extends i {

        /* renamed from: q  reason: collision with root package name */
        public static final e0 f8822q = e0.k(WindowInsets.CONSUMED, (View) null);

        public j(e0 e0Var, WindowInsets windowInsets) {
            super(e0Var, windowInsets);
        }

        public final void d(View view) {
        }

        public g0.b f(int i) {
            return g0.b.d(this.f8814c.getInsets(l.a(i)));
        }
    }

    public static class k {

        /* renamed from: b  reason: collision with root package name */
        public static final e0 f8823b;

        /* renamed from: a  reason: collision with root package name */
        public final e0 f8824a;

        static {
            e eVar;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                eVar = new d();
            } else if (i >= 29) {
                eVar = new c();
            } else {
                eVar = new b();
            }
            f8823b = eVar.b().f8798a.a().f8798a.b().f8798a.c();
        }

        public k(e0 e0Var) {
            this.f8824a = e0Var;
        }

        public e0 a() {
            return this.f8824a;
        }

        public e0 b() {
            return this.f8824a;
        }

        public e0 c() {
            return this.f8824a;
        }

        public void d(View view) {
        }

        public d e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            if (n() != kVar.n() || m() != kVar.m() || !Objects.equals(j(), kVar.j()) || !Objects.equals(h(), kVar.h()) || !Objects.equals(e(), kVar.e())) {
                return false;
            }
            return true;
        }

        public g0.b f(int i) {
            return g0.b.f5202e;
        }

        public g0.b g() {
            return j();
        }

        public g0.b h() {
            return g0.b.f5202e;
        }

        public int hashCode() {
            return Objects.hash(new Object[]{Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e()});
        }

        public g0.b i() {
            return j();
        }

        public g0.b j() {
            return g0.b.f5202e;
        }

        public g0.b k() {
            return j();
        }

        public e0 l(int i, int i10, int i11, int i12) {
            return f8823b;
        }

        public boolean m() {
            return false;
        }

        public boolean n() {
            return false;
        }

        public void o(g0.b[] bVarArr) {
        }

        public void p(e0 e0Var) {
        }

        public void q(g0.b bVar) {
        }
    }

    public static final class l {
        public static int a(int i) {
            int i10;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i & i12) != 0) {
                    if (i12 == 1) {
                        i10 = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        i10 = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        i10 = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        i10 = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        i10 = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        i10 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        i10 = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        i10 = WindowInsets.Type.displayCutout();
                    }
                    i11 |= i10;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f8797b = j.f8822q;
        } else {
            f8797b = k.f8823b;
        }
    }

    public e0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f8798a = new j(this, windowInsets);
        } else if (i10 >= 29) {
            this.f8798a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f8798a = new h(this, windowInsets);
        } else {
            this.f8798a = new g(this, windowInsets);
        }
    }

    public static g0.b g(g0.b bVar, int i10, int i11, int i12, int i13) {
        int max = Math.max(0, bVar.f5203a - i10);
        int max2 = Math.max(0, bVar.f5204b - i11);
        int max3 = Math.max(0, bVar.f5205c - i12);
        int max4 = Math.max(0, bVar.f5206d - i13);
        if (max == i10 && max2 == i11 && max3 == i12 && max4 == i13) {
            return bVar;
        }
        return g0.b.b(max, max2, max3, max4);
    }

    public static e0 k(WindowInsets windowInsets, View view) {
        Objects.requireNonNull(windowInsets);
        e0 e0Var = new e0(windowInsets);
        if (view != null) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            if (x.g.b(view)) {
                e0Var.i(x.j.a(view));
                e0Var.a(view.getRootView());
            }
        }
        return e0Var;
    }

    public final void a(View view) {
        this.f8798a.d(view);
    }

    public final g0.b b(int i10) {
        return this.f8798a.f(i10);
    }

    @Deprecated
    public final int c() {
        return this.f8798a.j().f5206d;
    }

    @Deprecated
    public final int d() {
        return this.f8798a.j().f5203a;
    }

    @Deprecated
    public final int e() {
        return this.f8798a.j().f5205c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return Objects.equals(this.f8798a, ((e0) obj).f8798a);
    }

    @Deprecated
    public final int f() {
        return this.f8798a.j().f5204b;
    }

    public final boolean h() {
        return this.f8798a.m();
    }

    public final int hashCode() {
        k kVar = this.f8798a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public final void i(e0 e0Var) {
        this.f8798a.p(e0Var);
    }

    public final WindowInsets j() {
        k kVar = this.f8798a;
        if (kVar instanceof f) {
            return ((f) kVar).f8814c;
        }
        return null;
    }

    public static class b extends e {

        /* renamed from: d  reason: collision with root package name */
        public static Field f8803d = null;

        /* renamed from: e  reason: collision with root package name */
        public static boolean f8804e = false;

        /* renamed from: f  reason: collision with root package name */
        public static Constructor<WindowInsets> f8805f = null;
        public static boolean g = false;

        /* renamed from: b  reason: collision with root package name */
        public WindowInsets f8806b;

        /* renamed from: c  reason: collision with root package name */
        public g0.b f8807c;

        public b() {
            this.f8806b = e();
        }

        private static WindowInsets e() {
            if (!f8804e) {
                try {
                    f8803d = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f8804e = true;
            }
            Field field = f8803d;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!g) {
                try {
                    f8805f = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                g = true;
            }
            Constructor<WindowInsets> constructor = f8805f;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        public e0 b() {
            a();
            e0 k10 = e0.k(this.f8806b, (View) null);
            k10.f8798a.o((g0.b[]) null);
            k10.f8798a.q(this.f8807c);
            return k10;
        }

        public void c(g0.b bVar) {
            this.f8807c = bVar;
        }

        public void d(g0.b bVar) {
            WindowInsets windowInsets = this.f8806b;
            if (windowInsets != null) {
                this.f8806b = windowInsets.replaceSystemWindowInsets(bVar.f5203a, bVar.f5204b, bVar.f5205c, bVar.f5206d);
            }
        }

        public b(e0 e0Var) {
            super(e0Var);
            this.f8806b = e0Var.j();
        }
    }

    public static class c extends e {

        /* renamed from: b  reason: collision with root package name */
        public final WindowInsets.Builder f8808b;

        public c() {
            this.f8808b = new WindowInsets.Builder();
        }

        public e0 b() {
            a();
            e0 k10 = e0.k(this.f8808b.build(), (View) null);
            k10.f8798a.o((g0.b[]) null);
            return k10;
        }

        public void c(g0.b bVar) {
            this.f8808b.setStableInsets(bVar.e());
        }

        public void d(g0.b bVar) {
            this.f8808b.setSystemWindowInsets(bVar.e());
        }

        public c(e0 e0Var) {
            super(e0Var);
            WindowInsets.Builder builder;
            WindowInsets j10 = e0Var.j();
            if (j10 != null) {
                builder = new WindowInsets.Builder(j10);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f8808b = builder;
        }
    }

    public e0() {
        this.f8798a = new k(this);
    }
}
