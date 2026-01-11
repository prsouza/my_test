package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import b6.b;
import e5.a;
import io.nodle.cash.R;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final b f3830a;

    /* renamed from: b  reason: collision with root package name */
    public final b f3831b;

    /* renamed from: c  reason: collision with root package name */
    public final b f3832c;

    /* renamed from: d  reason: collision with root package name */
    public final b f3833d;

    /* renamed from: e  reason: collision with root package name */
    public final b f3834e;

    /* renamed from: f  reason: collision with root package name */
    public final b f3835f;
    public final b g;

    /* renamed from: h  reason: collision with root package name */
    public final Paint f3836h;

    public c(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(b.b(context, R.attr.materialCalendarStyle, h.class.getCanonicalName()), a.f4630p);
        this.f3830a = b.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = b.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3831b = b.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3832c = b.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList a10 = b6.c.a(context, obtainStyledAttributes, 6);
        this.f3833d = b.a(context, obtainStyledAttributes.getResourceId(8, 0));
        this.f3834e = b.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3835f = b.a(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.f3836h = paint;
        paint.setColor(a10.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
