package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import b6.c;
import c3.k;
import e5.a;
import e6.f;
import e6.i;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f3824a;

    /* renamed from: b  reason: collision with root package name */
    public final ColorStateList f3825b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorStateList f3826c;

    /* renamed from: d  reason: collision with root package name */
    public final ColorStateList f3827d;

    /* renamed from: e  reason: collision with root package name */
    public final int f3828e;

    /* renamed from: f  reason: collision with root package name */
    public final i f3829f;

    public b(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, i iVar, Rect rect) {
        k.P(rect.left);
        k.P(rect.top);
        k.P(rect.right);
        k.P(rect.bottom);
        this.f3824a = rect;
        this.f3825b = colorStateList2;
        this.f3826c = colorStateList;
        this.f3827d = colorStateList3;
        this.f3828e = i;
        this.f3829f = iVar;
    }

    public static b a(Context context, int i) {
        k.O(i != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, a.f4631q);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList a10 = c.a(context, obtainStyledAttributes, 4);
        ColorStateList a11 = c.a(context, obtainStyledAttributes, 9);
        ColorStateList a12 = c.a(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        i a13 = i.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new e6.a((float) 0)).a();
        obtainStyledAttributes.recycle();
        return new b(a10, a11, a12, dimensionPixelSize, a13, rect);
    }

    public final void b(TextView textView) {
        f fVar = new f();
        f fVar2 = new f();
        fVar.setShapeAppearanceModel(this.f3829f);
        fVar2.setShapeAppearanceModel(this.f3829f);
        fVar.o(this.f3826c);
        fVar.r((float) this.f3828e, this.f3827d);
        textView.setTextColor(this.f3825b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f3825b.withAlpha(30), fVar, fVar2);
        Rect rect = this.f3824a;
        InsetDrawable insetDrawable = new InsetDrawable(rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        x.d.q(textView, insetDrawable);
    }
}
