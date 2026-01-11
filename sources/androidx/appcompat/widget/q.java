package androidx.appcompat.widget;

import a.b;
import ad.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import n0.x;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final ImageView f1366a;

    /* renamed from: b  reason: collision with root package name */
    public b1 f1367b;

    /* renamed from: c  reason: collision with root package name */
    public int f1368c = 0;

    public q(ImageView imageView) {
        this.f1366a = imageView;
    }

    public final void a() {
        b1 b1Var;
        Drawable drawable = this.f1366a.getDrawable();
        if (drawable != null) {
            k0.b(drawable);
        }
        if (drawable != null && (b1Var = this.f1367b) != null) {
            l.f(drawable, b1Var, this.f1366a.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int l10;
        Context context = this.f1366a.getContext();
        int[] iArr = c.z;
        d1 q10 = d1.q(context, attributeSet, iArr, i);
        ImageView imageView = this.f1366a;
        x.o(imageView, imageView.getContext(), iArr, attributeSet, q10.f1207b, i);
        try {
            Drawable drawable = this.f1366a.getDrawable();
            if (!(drawable != null || (l10 = q10.l(1, -1)) == -1 || (drawable = b.a0(this.f1366a.getContext(), l10)) == null)) {
                this.f1366a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                k0.b(drawable);
            }
            if (q10.o(2)) {
                this.f1366a.setImageTintList(q10.c(2));
            }
            if (q10.o(3)) {
                this.f1366a.setImageTintMode(k0.e(q10.j(3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            q10.r();
        }
    }

    public final void c(int i) {
        if (i != 0) {
            Drawable a02 = b.a0(this.f1366a.getContext(), i);
            if (a02 != null) {
                k0.b(a02);
            }
            this.f1366a.setImageDrawable(a02);
        } else {
            this.f1366a.setImageDrawable((Drawable) null);
        }
        a();
    }

    public final void d(ColorStateList colorStateList) {
        if (this.f1367b == null) {
            this.f1367b = new b1();
        }
        b1 b1Var = this.f1367b;
        b1Var.f1175a = colorStateList;
        b1Var.f1178d = true;
        a();
    }

    public final void e(PorterDuff.Mode mode) {
        if (this.f1367b == null) {
            this.f1367b = new b1();
        }
        b1 b1Var = this.f1367b;
        b1Var.f1176b = mode;
        b1Var.f1177c = true;
        a();
    }
}
