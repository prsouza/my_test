package androidx.appcompat.widget;

import a.b;
import ad.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import c3.k;
import io.nodle.cash.R;
import n0.a0;
import n0.x;

public final class f1 implements j0 {

    /* renamed from: a  reason: collision with root package name */
    public Toolbar f1230a;

    /* renamed from: b  reason: collision with root package name */
    public int f1231b;

    /* renamed from: c  reason: collision with root package name */
    public w0 f1232c;

    /* renamed from: d  reason: collision with root package name */
    public View f1233d;

    /* renamed from: e  reason: collision with root package name */
    public Drawable f1234e;

    /* renamed from: f  reason: collision with root package name */
    public Drawable f1235f;
    public Drawable g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1236h;
    public CharSequence i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f1237j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f1238k;

    /* renamed from: l  reason: collision with root package name */
    public Window.Callback f1239l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1240m;

    /* renamed from: n  reason: collision with root package name */
    public c f1241n;

    /* renamed from: o  reason: collision with root package name */
    public int f1242o = 0;

    /* renamed from: p  reason: collision with root package name */
    public Drawable f1243p;

    public class a extends k {
        public boolean H = false;
        public final /* synthetic */ int I;

        public a(int i) {
            this.I = i;
        }

        public final void c() {
            if (!this.H) {
                f1.this.f1230a.setVisibility(this.I);
            }
        }

        public final void e(View view) {
            this.H = true;
        }

        public final void i() {
            f1.this.f1230a.setVisibility(0);
        }
    }

    public f1(Toolbar toolbar) {
        Drawable drawable;
        this.f1230a = toolbar;
        this.i = toolbar.getTitle();
        this.f1237j = toolbar.getSubtitle();
        this.f1236h = this.i != null;
        this.g = toolbar.getNavigationIcon();
        String str = null;
        d1 q10 = d1.q(toolbar.getContext(), (AttributeSet) null, c.f336u, R.attr.actionBarStyle);
        this.f1243p = q10.g(15);
        CharSequence n10 = q10.n(27);
        if (!TextUtils.isEmpty(n10)) {
            this.f1236h = true;
            u(n10);
        }
        CharSequence n11 = q10.n(25);
        if (!TextUtils.isEmpty(n11)) {
            this.f1237j = n11;
            if ((this.f1231b & 8) != 0) {
                this.f1230a.setSubtitle(n11);
            }
        }
        Drawable g8 = q10.g(20);
        if (g8 != null) {
            this.f1235f = g8;
            x();
        }
        Drawable g10 = q10.g(17);
        if (g10 != null) {
            setIcon(g10);
        }
        if (this.g == null && (drawable = this.f1243p) != null) {
            this.g = drawable;
            w();
        }
        l(q10.j(10, 0));
        int l10 = q10.l(9, 0);
        if (l10 != 0) {
            View inflate = LayoutInflater.from(this.f1230a.getContext()).inflate(l10, this.f1230a, false);
            View view = this.f1233d;
            if (!(view == null || (this.f1231b & 16) == 0)) {
                this.f1230a.removeView(view);
            }
            this.f1233d = inflate;
            if (!(inflate == null || (this.f1231b & 16) == 0)) {
                this.f1230a.addView(inflate);
            }
            l(this.f1231b | 16);
        }
        int k10 = q10.k(13, 0);
        if (k10 > 0) {
            ViewGroup.LayoutParams layoutParams = this.f1230a.getLayoutParams();
            layoutParams.height = k10;
            this.f1230a.setLayoutParams(layoutParams);
        }
        int e10 = q10.e(7, -1);
        int e11 = q10.e(3, -1);
        if (e10 >= 0 || e11 >= 0) {
            Toolbar toolbar2 = this.f1230a;
            int max = Math.max(e10, 0);
            int max2 = Math.max(e11, 0);
            toolbar2.d();
            toolbar2.I.a(max, max2);
        }
        int l11 = q10.l(28, 0);
        if (l11 != 0) {
            Toolbar toolbar3 = this.f1230a;
            Context context = toolbar3.getContext();
            toolbar3.A = l11;
            f0 f0Var = toolbar3.f1112b;
            if (f0Var != null) {
                f0Var.setTextAppearance(context, l11);
            }
        }
        int l12 = q10.l(26, 0);
        if (l12 != 0) {
            Toolbar toolbar4 = this.f1230a;
            Context context2 = toolbar4.getContext();
            toolbar4.B = l12;
            f0 f0Var2 = toolbar4.f1113c;
            if (f0Var2 != null) {
                f0Var2.setTextAppearance(context2, l12);
            }
        }
        int l13 = q10.l(22, 0);
        if (l13 != 0) {
            this.f1230a.setPopupTheme(l13);
        }
        q10.r();
        if (R.string.abc_action_bar_up_description != this.f1242o) {
            this.f1242o = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(this.f1230a.getNavigationContentDescription())) {
                int i10 = this.f1242o;
                this.f1238k = i10 != 0 ? getContext().getString(i10) : str;
                v();
            }
        }
        this.f1238k = this.f1230a.getNavigationContentDescription();
        this.f1230a.setNavigationOnClickListener(new e1(this));
    }

    public final void a(Menu menu, i.a aVar) {
        g gVar;
        if (this.f1241n == null) {
            this.f1241n = new c(this.f1230a.getContext());
        }
        c cVar = this.f1241n;
        cVar.f885t = aVar;
        Toolbar toolbar = this.f1230a;
        e eVar = (e) menu;
        if (eVar != null || toolbar.f1110a != null) {
            toolbar.f();
            e eVar2 = toolbar.f1110a.E;
            if (eVar2 != eVar) {
                if (eVar2 != null) {
                    eVar2.v(toolbar.f1115d0);
                    eVar2.v(toolbar.f1116e0);
                }
                if (toolbar.f1116e0 == null) {
                    toolbar.f1116e0 = new Toolbar.d();
                }
                cVar.F = true;
                if (eVar != null) {
                    eVar.c(cVar, toolbar.f1125y);
                    eVar.c(toolbar.f1116e0, toolbar.f1125y);
                } else {
                    cVar.e(toolbar.f1125y, (e) null);
                    Toolbar.d dVar = toolbar.f1116e0;
                    e eVar3 = dVar.f1129a;
                    if (!(eVar3 == null || (gVar = dVar.f1130b) == null)) {
                        eVar3.e(gVar);
                    }
                    dVar.f1129a = null;
                    cVar.f();
                    toolbar.f1116e0.f();
                }
                toolbar.f1110a.setPopupTheme(toolbar.z);
                toolbar.f1110a.setPresenter(cVar);
                toolbar.f1115d0 = cVar;
            }
        }
    }

    public final boolean b() {
        return this.f1230a.p();
    }

    public final void c() {
        this.f1240m = true;
    }

    public final void collapseActionView() {
        g gVar;
        Toolbar.d dVar = this.f1230a.f1116e0;
        if (dVar == null) {
            gVar = null;
        } else {
            gVar = dVar.f1130b;
        }
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r4 = this;
            androidx.appcompat.widget.Toolbar r0 = r4.f1230a
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1110a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0022
            androidx.appcompat.widget.c r0 = r0.I
            if (r0 == 0) goto L_0x001e
            androidx.appcompat.widget.c$c r3 = r0.J
            if (r3 != 0) goto L_0x0019
            boolean r0 = r0.l()
            if (r0 == 0) goto L_0x0017
            goto L_0x0019
        L_0x0017:
            r0 = r2
            goto L_0x001a
        L_0x0019:
            r0 = r1
        L_0x001a:
            if (r0 == 0) goto L_0x001e
            r0 = r1
            goto L_0x001f
        L_0x001e:
            r0 = r2
        L_0x001f:
            if (r0 == 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r1 = r2
        L_0x0023:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f1.d():boolean");
    }

    public final boolean e() {
        ActionMenuView actionMenuView = this.f1230a.f1110a;
        if (actionMenuView != null) {
            c cVar = actionMenuView.I;
            if (cVar != null && cVar.g()) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.f1230a.v();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = r0.f1110a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() {
        /*
            r2 = this;
            androidx.appcompat.widget.Toolbar r0 = r2.f1230a
            int r1 = r0.getVisibility()
            if (r1 != 0) goto L_0x0012
            androidx.appcompat.widget.ActionMenuView r0 = r0.f1110a
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.H
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.f1.g():boolean");
    }

    public final Context getContext() {
        return this.f1230a.getContext();
    }

    public final CharSequence getTitle() {
        return this.f1230a.getTitle();
    }

    public final void h() {
        c cVar;
        ActionMenuView actionMenuView = this.f1230a.f1110a;
        if (actionMenuView != null && (cVar = actionMenuView.I) != null) {
            cVar.b();
        }
    }

    public final void i(int i10) {
        this.f1230a.setVisibility(i10);
    }

    public final void j() {
    }

    public final boolean k() {
        Toolbar.d dVar = this.f1230a.f1116e0;
        return (dVar == null || dVar.f1130b == null) ? false : true;
    }

    public final void l(int i10) {
        View view;
        int i11 = this.f1231b ^ i10;
        this.f1231b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    v();
                }
                w();
            }
            if ((i11 & 3) != 0) {
                x();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    this.f1230a.setTitle(this.i);
                    this.f1230a.setSubtitle(this.f1237j);
                } else {
                    this.f1230a.setTitle((CharSequence) null);
                    this.f1230a.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) != 0 && (view = this.f1233d) != null) {
                if ((i10 & 16) != 0) {
                    this.f1230a.addView(view);
                } else {
                    this.f1230a.removeView(view);
                }
            }
        }
    }

    public final void m() {
        Toolbar toolbar;
        w0 w0Var = this.f1232c;
        if (w0Var != null && w0Var.getParent() == (toolbar = this.f1230a)) {
            toolbar.removeView(this.f1232c);
        }
        this.f1232c = null;
    }

    public final int n() {
        return this.f1231b;
    }

    public final void o(int i10) {
        this.f1235f = i10 != 0 ? b.a0(getContext(), i10) : null;
        x();
    }

    public final void p() {
    }

    public final a0 q(int i10, long j10) {
        a0 b10 = x.b(this.f1230a);
        b10.a(i10 == 0 ? 1.0f : 0.0f);
        b10.c(j10);
        b10.d(new a(i10));
        return b10;
    }

    public final void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void setIcon(int i10) {
        setIcon(i10 != 0 ? b.a0(getContext(), i10) : null);
    }

    public final void setWindowCallback(Window.Callback callback) {
        this.f1239l = callback;
    }

    public final void setWindowTitle(CharSequence charSequence) {
        if (!this.f1236h) {
            u(charSequence);
        }
    }

    public final void t(boolean z) {
        this.f1230a.setCollapsible(z);
    }

    public final void u(CharSequence charSequence) {
        this.i = charSequence;
        if ((this.f1231b & 8) != 0) {
            this.f1230a.setTitle(charSequence);
            if (this.f1236h) {
                x.q(this.f1230a.getRootView(), charSequence);
            }
        }
    }

    public final void v() {
        if ((this.f1231b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f1238k)) {
            this.f1230a.setNavigationContentDescription(this.f1242o);
        } else {
            this.f1230a.setNavigationContentDescription(this.f1238k);
        }
    }

    public final void w() {
        if ((this.f1231b & 4) != 0) {
            Toolbar toolbar = this.f1230a;
            Drawable drawable = this.g;
            if (drawable == null) {
                drawable = this.f1243p;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f1230a.setNavigationIcon((Drawable) null);
    }

    public final void x() {
        Drawable drawable;
        int i10 = this.f1231b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) != 0) {
            drawable = this.f1235f;
            if (drawable == null) {
                drawable = this.f1234e;
            }
        } else {
            drawable = this.f1234e;
        }
        this.f1230a.setLogo(drawable);
    }

    public final void setIcon(Drawable drawable) {
        this.f1234e = drawable;
        x();
    }
}
