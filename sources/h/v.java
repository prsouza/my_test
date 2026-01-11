package h;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.j0;
import androidx.appcompat.widget.w0;
import c3.k;
import h.a;
import io.nodle.cash.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import m.a;
import m.f;
import m.g;
import n0.a0;
import n0.c0;
import n0.x;

public final class v extends a implements ActionBarOverlayLayout.d {
    public static final DecelerateInterpolator A = new DecelerateInterpolator();
    public static final AccelerateInterpolator z = new AccelerateInterpolator();

    /* renamed from: a  reason: collision with root package name */
    public Context f5621a;

    /* renamed from: b  reason: collision with root package name */
    public Context f5622b;

    /* renamed from: c  reason: collision with root package name */
    public ActionBarOverlayLayout f5623c;

    /* renamed from: d  reason: collision with root package name */
    public ActionBarContainer f5624d;

    /* renamed from: e  reason: collision with root package name */
    public j0 f5625e;

    /* renamed from: f  reason: collision with root package name */
    public ActionBarContextView f5626f;
    public View g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f5627h;
    public d i;

    /* renamed from: j  reason: collision with root package name */
    public d f5628j;

    /* renamed from: k  reason: collision with root package name */
    public a.C0149a f5629k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f5630l;

    /* renamed from: m  reason: collision with root package name */
    public ArrayList<a.b> f5631m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    public boolean f5632n;

    /* renamed from: o  reason: collision with root package name */
    public int f5633o = 0;

    /* renamed from: p  reason: collision with root package name */
    public boolean f5634p = true;

    /* renamed from: q  reason: collision with root package name */
    public boolean f5635q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f5636r;

    /* renamed from: s  reason: collision with root package name */
    public boolean f5637s = true;

    /* renamed from: t  reason: collision with root package name */
    public g f5638t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f5639u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f5640v;

    /* renamed from: w  reason: collision with root package name */
    public final a f5641w = new a();

    /* renamed from: x  reason: collision with root package name */
    public final b f5642x = new b();

    /* renamed from: y  reason: collision with root package name */
    public final c f5643y = new c();

    public class a extends k {
        public a() {
        }

        public final void c() {
            View view;
            v vVar = v.this;
            if (vVar.f5634p && (view = vVar.g) != null) {
                view.setTranslationY(0.0f);
                v.this.f5624d.setTranslationY(0.0f);
            }
            v.this.f5624d.setVisibility(8);
            v.this.f5624d.setTransitioning(false);
            v vVar2 = v.this;
            vVar2.f5638t = null;
            a.C0149a aVar = vVar2.f5629k;
            if (aVar != null) {
                aVar.b(vVar2.f5628j);
                vVar2.f5628j = null;
                vVar2.f5629k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = v.this.f5623c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                x.h.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends k {
        public b() {
        }

        public final void c() {
            v vVar = v.this;
            vVar.f5638t = null;
            vVar.f5624d.requestLayout();
        }
    }

    public class c implements c0 {
        public c() {
        }
    }

    public class d extends m.a implements e.a {

        /* renamed from: c  reason: collision with root package name */
        public final Context f5645c;

        /* renamed from: s  reason: collision with root package name */
        public final e f5646s;

        /* renamed from: t  reason: collision with root package name */
        public a.C0149a f5647t;

        /* renamed from: u  reason: collision with root package name */
        public WeakReference<View> f5648u;

        public d(Context context, a.C0149a aVar) {
            this.f5645c = context;
            this.f5647t = aVar;
            e eVar = new e(context);
            eVar.f932l = 1;
            this.f5646s = eVar;
            eVar.f927e = this;
        }

        public final boolean a(e eVar, MenuItem menuItem) {
            a.C0149a aVar = this.f5647t;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        public final void b(e eVar) {
            if (this.f5647t != null) {
                i();
                androidx.appcompat.widget.c cVar = v.this.f5626f.f1143s;
                if (cVar != null) {
                    cVar.m();
                }
            }
        }

        public final void c() {
            v vVar = v.this;
            if (vVar.i == this) {
                if (!(!vVar.f5635q)) {
                    vVar.f5628j = this;
                    vVar.f5629k = this.f5647t;
                } else {
                    this.f5647t.b(this);
                }
                this.f5647t = null;
                v.this.a(false);
                ActionBarContextView actionBarContextView = v.this.f5626f;
                if (actionBarContextView.z == null) {
                    actionBarContextView.h();
                }
                v vVar2 = v.this;
                vVar2.f5623c.setHideOnContentScrollEnabled(vVar2.f5640v);
                v.this.i = null;
            }
        }

        public final View d() {
            WeakReference<View> weakReference = this.f5648u;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        public final Menu e() {
            return this.f5646s;
        }

        public final MenuInflater f() {
            return new f(this.f5645c);
        }

        public final CharSequence g() {
            return v.this.f5626f.getSubtitle();
        }

        public final CharSequence h() {
            return v.this.f5626f.getTitle();
        }

        public final void i() {
            if (v.this.i == this) {
                this.f5646s.B();
                try {
                    this.f5647t.c(this, this.f5646s);
                } finally {
                    this.f5646s.A();
                }
            }
        }

        public final boolean j() {
            return v.this.f5626f.H;
        }

        public final void k(View view) {
            v.this.f5626f.setCustomView(view);
            this.f5648u = new WeakReference<>(view);
        }

        public final void l(int i) {
            v.this.f5626f.setSubtitle(v.this.f5621a.getResources().getString(i));
        }

        public final void m(CharSequence charSequence) {
            v.this.f5626f.setSubtitle(charSequence);
        }

        public final void n(int i) {
            v.this.f5626f.setTitle(v.this.f5621a.getResources().getString(i));
        }

        public final void o(CharSequence charSequence) {
            v.this.f5626f.setTitle(charSequence);
        }

        public final void p(boolean z) {
            this.f8305b = z;
            v.this.f5626f.setTitleOptional(z);
        }
    }

    public v(Activity activity, boolean z10) {
        new ArrayList();
        View decorView = activity.getWindow().getDecorView();
        d(decorView);
        if (!z10) {
            this.g = decorView.findViewById(16908290);
        }
    }

    public final void a(boolean z10) {
        a0 a0Var;
        a0 a0Var2;
        if (z10) {
            if (!this.f5636r) {
                this.f5636r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5623c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                g(false);
            }
        } else if (this.f5636r) {
            this.f5636r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5623c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            g(false);
        }
        ActionBarContainer actionBarContainer = this.f5624d;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        if (x.g.c(actionBarContainer)) {
            if (z10) {
                a0Var = this.f5625e.q(4, 100);
                a0Var2 = this.f5626f.e(0, 200);
            } else {
                a0Var2 = this.f5625e.q(0, 200);
                a0Var = this.f5626f.e(8, 100);
            }
            g gVar = new g();
            gVar.f8355a.add(a0Var);
            View view = a0Var.f8774a.get();
            long duration = view != null ? view.animate().getDuration() : 0;
            View view2 = a0Var2.f8774a.get();
            if (view2 != null) {
                view2.animate().setStartDelay(duration);
            }
            gVar.f8355a.add(a0Var2);
            gVar.c();
        } else if (z10) {
            this.f5625e.i(4);
            this.f5626f.setVisibility(0);
        } else {
            this.f5625e.i(0);
            this.f5626f.setVisibility(8);
        }
    }

    public final void b(boolean z10) {
        if (z10 != this.f5630l) {
            this.f5630l = z10;
            int size = this.f5631m.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f5631m.get(i10).a();
            }
        }
    }

    public final Context c() {
        if (this.f5622b == null) {
            TypedValue typedValue = new TypedValue();
            this.f5621a.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 != 0) {
                this.f5622b = new ContextThemeWrapper(this.f5621a, i10);
            } else {
                this.f5622b = this.f5621a;
            }
        }
        return this.f5622b;
    }

    public final void d(View view) {
        j0 j0Var;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.f5623c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof j0) {
            j0Var = (j0) findViewById;
        } else if (findViewById instanceof Toolbar) {
            j0Var = ((Toolbar) findViewById).getWrapper();
        } else {
            StringBuilder d10 = a.a.d("Can't make a decor toolbar out of ");
            d10.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
            throw new IllegalStateException(d10.toString());
        }
        this.f5625e = j0Var;
        this.f5626f = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.f5624d = actionBarContainer;
        j0 j0Var2 = this.f5625e;
        if (j0Var2 == null || this.f5626f == null || actionBarContainer == null) {
            throw new IllegalStateException(v.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f5621a = j0Var2.getContext();
        if ((this.f5625e.n() & 4) != 0) {
            this.f5627h = true;
        }
        Context context = this.f5621a;
        int i10 = context.getApplicationInfo().targetSdkVersion;
        this.f5625e.j();
        f(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f5621a.obtainStyledAttributes((AttributeSet) null, ad.c.f336u, R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f5623c;
            if (actionBarOverlayLayout2.f1014w) {
                this.f5640v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            } else {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f5624d;
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.i.s(actionBarContainer2, (float) dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void e(boolean z10) {
        if (!this.f5627h) {
            int i10 = z10 ? 4 : 0;
            int n10 = this.f5625e.n();
            this.f5627h = true;
            this.f5625e.l((i10 & 4) | (n10 & -5));
        }
    }

    public final void f(boolean z10) {
        this.f5632n = z10;
        if (!z10) {
            this.f5625e.m();
            this.f5624d.setTabContainer((w0) null);
        } else {
            this.f5624d.setTabContainer((w0) null);
            this.f5625e.m();
        }
        this.f5625e.p();
        j0 j0Var = this.f5625e;
        boolean z11 = this.f5632n;
        j0Var.t(false);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f5623c;
        boolean z12 = this.f5632n;
        actionBarOverlayLayout.setHasNonEmbeddedTabs(false);
    }

    public final void g(boolean z10) {
        View view;
        View view2;
        View view3;
        if (this.f5636r || !this.f5635q) {
            if (!this.f5637s) {
                this.f5637s = true;
                g gVar = this.f5638t;
                if (gVar != null) {
                    gVar.a();
                }
                this.f5624d.setVisibility(0);
                if (this.f5633o != 0 || (!this.f5639u && !z10)) {
                    this.f5624d.setAlpha(1.0f);
                    this.f5624d.setTranslationY(0.0f);
                    if (this.f5634p && (view2 = this.g) != null) {
                        view2.setTranslationY(0.0f);
                    }
                    this.f5642x.c();
                } else {
                    this.f5624d.setTranslationY(0.0f);
                    float f10 = (float) (-this.f5624d.getHeight());
                    if (z10) {
                        int[] iArr = {0, 0};
                        this.f5624d.getLocationInWindow(iArr);
                        f10 -= (float) iArr[1];
                    }
                    this.f5624d.setTranslationY(f10);
                    g gVar2 = new g();
                    a0 b10 = x.b(this.f5624d);
                    b10.g(0.0f);
                    b10.f(this.f5643y);
                    gVar2.b(b10);
                    if (this.f5634p && (view3 = this.g) != null) {
                        view3.setTranslationY(f10);
                        a0 b11 = x.b(this.g);
                        b11.g(0.0f);
                        gVar2.b(b11);
                    }
                    DecelerateInterpolator decelerateInterpolator = A;
                    boolean z11 = gVar2.f8359e;
                    if (!z11) {
                        gVar2.f8357c = decelerateInterpolator;
                    }
                    if (!z11) {
                        gVar2.f8356b = 250;
                    }
                    b bVar = this.f5642x;
                    if (!z11) {
                        gVar2.f8358d = bVar;
                    }
                    this.f5638t = gVar2;
                    gVar2.c();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.f5623c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap<View, a0> weakHashMap = x.f8842a;
                    x.h.c(actionBarOverlayLayout);
                }
            }
        } else if (this.f5637s) {
            this.f5637s = false;
            g gVar3 = this.f5638t;
            if (gVar3 != null) {
                gVar3.a();
            }
            if (this.f5633o != 0 || (!this.f5639u && !z10)) {
                this.f5641w.c();
                return;
            }
            this.f5624d.setAlpha(1.0f);
            this.f5624d.setTransitioning(true);
            g gVar4 = new g();
            float f11 = (float) (-this.f5624d.getHeight());
            if (z10) {
                int[] iArr2 = {0, 0};
                this.f5624d.getLocationInWindow(iArr2);
                f11 -= (float) iArr2[1];
            }
            a0 b12 = x.b(this.f5624d);
            b12.g(f11);
            b12.f(this.f5643y);
            gVar4.b(b12);
            if (this.f5634p && (view = this.g) != null) {
                a0 b13 = x.b(view);
                b13.g(f11);
                gVar4.b(b13);
            }
            AccelerateInterpolator accelerateInterpolator = z;
            boolean z12 = gVar4.f8359e;
            if (!z12) {
                gVar4.f8357c = accelerateInterpolator;
            }
            if (!z12) {
                gVar4.f8356b = 250;
            }
            a aVar = this.f5641w;
            if (!z12) {
                gVar4.f8358d = aVar;
            }
            this.f5638t = gVar4;
            gVar4.c();
        }
    }

    public v(Dialog dialog) {
        new ArrayList();
        d(dialog.getWindow().getDecorView());
    }
}
