package androidx.appcompat.widget;

import ad.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final View f1218a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1219b;

    /* renamed from: c  reason: collision with root package name */
    public int f1220c = -1;

    /* renamed from: d  reason: collision with root package name */
    public b1 f1221d;

    /* renamed from: e  reason: collision with root package name */
    public b1 f1222e;

    /* renamed from: f  reason: collision with root package name */
    public b1 f1223f;

    public f(View view) {
        this.f1218a = view;
        this.f1219b = l.a();
    }

    public final void a() {
        Drawable background = this.f1218a.getBackground();
        if (background != null) {
            boolean z = true;
            if (this.f1221d != null) {
                if (this.f1223f == null) {
                    this.f1223f = new b1();
                }
                b1 b1Var = this.f1223f;
                b1Var.f1175a = null;
                b1Var.f1178d = false;
                b1Var.f1176b = null;
                b1Var.f1177c = false;
                View view = this.f1218a;
                WeakHashMap<View, a0> weakHashMap = x.f8842a;
                ColorStateList g = x.i.g(view);
                if (g != null) {
                    b1Var.f1178d = true;
                    b1Var.f1175a = g;
                }
                PorterDuff.Mode h10 = x.i.h(this.f1218a);
                if (h10 != null) {
                    b1Var.f1177c = true;
                    b1Var.f1176b = h10;
                }
                if (b1Var.f1178d || b1Var.f1177c) {
                    l.f(background, b1Var, this.f1218a.getDrawableState());
                } else {
                    z = false;
                }
                if (z) {
                    return;
                }
            }
            b1 b1Var2 = this.f1222e;
            if (b1Var2 != null) {
                l.f(background, b1Var2, this.f1218a.getDrawableState());
                return;
            }
            b1 b1Var3 = this.f1221d;
            if (b1Var3 != null) {
                l.f(background, b1Var3, this.f1218a.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        b1 b1Var = this.f1222e;
        if (b1Var != null) {
            return b1Var.f1175a;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        b1 b1Var = this.f1222e;
        if (b1Var != null) {
            return b1Var.f1176b;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i) {
        Context context = this.f1218a.getContext();
        int[] iArr = c.U;
        d1 q10 = d1.q(context, attributeSet, iArr, i);
        View view = this.f1218a;
        x.o(view, view.getContext(), iArr, attributeSet, q10.f1207b, i);
        try {
            if (q10.o(0)) {
                this.f1220c = q10.l(0, -1);
                ColorStateList d10 = this.f1219b.d(this.f1218a.getContext(), this.f1220c);
                if (d10 != null) {
                    g(d10);
                }
            }
            if (q10.o(1)) {
                x.i.q(this.f1218a, q10.c(1));
            }
            if (q10.o(2)) {
                x.i.r(this.f1218a, k0.e(q10.j(2, -1), (PorterDuff.Mode) null));
            }
        } finally {
            q10.r();
        }
    }

    public final void e() {
        this.f1220c = -1;
        g((ColorStateList) null);
        a();
    }

    public final void f(int i) {
        this.f1220c = i;
        l lVar = this.f1219b;
        g(lVar != null ? lVar.d(this.f1218a.getContext(), i) : null);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1221d == null) {
                this.f1221d = new b1();
            }
            b1 b1Var = this.f1221d;
            b1Var.f1175a = colorStateList;
            b1Var.f1178d = true;
        } else {
            this.f1221d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1222e == null) {
            this.f1222e = new b1();
        }
        b1 b1Var = this.f1222e;
        b1Var.f1175a = colorStateList;
        b1Var.f1178d = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1222e == null) {
            this.f1222e = new b1();
        }
        b1 b1Var = this.f1222e;
        b1Var.f1176b = mode;
        b1Var.f1177c = true;
        a();
    }
}
