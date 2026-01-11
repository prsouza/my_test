package m5;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
import e6.f;
import e6.i;
import e6.l;
import io.nodle.cash.R;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import y.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MaterialButton f8488a;

    /* renamed from: b  reason: collision with root package name */
    public i f8489b;

    /* renamed from: c  reason: collision with root package name */
    public int f8490c;

    /* renamed from: d  reason: collision with root package name */
    public int f8491d;

    /* renamed from: e  reason: collision with root package name */
    public int f8492e;

    /* renamed from: f  reason: collision with root package name */
    public int f8493f;
    public int g;

    /* renamed from: h  reason: collision with root package name */
    public int f8494h;
    public PorterDuff.Mode i;

    /* renamed from: j  reason: collision with root package name */
    public ColorStateList f8495j;

    /* renamed from: k  reason: collision with root package name */
    public ColorStateList f8496k;

    /* renamed from: l  reason: collision with root package name */
    public ColorStateList f8497l;

    /* renamed from: m  reason: collision with root package name */
    public f f8498m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f8499n = false;

    /* renamed from: o  reason: collision with root package name */
    public boolean f8500o = false;

    /* renamed from: p  reason: collision with root package name */
    public boolean f8501p = false;

    /* renamed from: q  reason: collision with root package name */
    public boolean f8502q;

    /* renamed from: r  reason: collision with root package name */
    public RippleDrawable f8503r;

    /* renamed from: s  reason: collision with root package name */
    public int f8504s;

    public a(MaterialButton materialButton, i iVar) {
        this.f8488a = materialButton;
        this.f8489b = iVar;
    }

    public final l a() {
        RippleDrawable rippleDrawable = this.f8503r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        if (this.f8503r.getNumberOfLayers() > 2) {
            return (l) this.f8503r.getDrawable(2);
        }
        return (l) this.f8503r.getDrawable(1);
    }

    public final f b(boolean z) {
        RippleDrawable rippleDrawable = this.f8503r;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (f) ((LayerDrawable) ((InsetDrawable) this.f8503r.getDrawable(0)).getDrawable()).getDrawable(z ^ true ? 1 : 0);
    }

    public final void c(i iVar) {
        this.f8489b = iVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(iVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(iVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(iVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.f8488a;
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        int f10 = x.e.f(materialButton);
        int paddingTop = this.f8488a.getPaddingTop();
        int e10 = x.e.e(this.f8488a);
        int paddingBottom = this.f8488a.getPaddingBottom();
        int i12 = this.f8492e;
        int i13 = this.f8493f;
        this.f8493f = i11;
        this.f8492e = i10;
        if (!this.f8500o) {
            e();
        }
        x.e.k(this.f8488a, f10, (paddingTop + i10) - i12, e10, (paddingBottom + i11) - i13);
    }

    public final void e() {
        MaterialButton materialButton = this.f8488a;
        f fVar = new f(this.f8489b);
        fVar.m(this.f8488a.getContext());
        fVar.setTintList(this.f8495j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            fVar.setTintMode(mode);
        }
        fVar.r((float) this.f8494h, this.f8496k);
        f fVar2 = new f(this.f8489b);
        fVar2.setTint(0);
        fVar2.q((float) this.f8494h, this.f8499n ? c.B(this.f8488a, R.attr.colorSurface) : 0);
        f fVar3 = new f(this.f8489b);
        this.f8498m = fVar3;
        fVar3.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(c6.a.c(this.f8497l), new InsetDrawable(new LayerDrawable(new Drawable[]{fVar2, fVar}), this.f8490c, this.f8492e, this.f8491d, this.f8493f), this.f8498m);
        this.f8503r = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        f b10 = b(false);
        if (b10 != null) {
            b10.n((float) this.f8504s);
        }
    }

    public final void f() {
        int i10 = 0;
        f b10 = b(false);
        f b11 = b(true);
        if (b10 != null) {
            b10.r((float) this.f8494h, this.f8496k);
            if (b11 != null) {
                float f10 = (float) this.f8494h;
                if (this.f8499n) {
                    i10 = c.B(this.f8488a, R.attr.colorSurface);
                }
                b11.q(f10, i10);
            }
        }
    }
}
