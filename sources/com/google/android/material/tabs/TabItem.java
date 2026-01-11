package com.google.android.material.tabs;

import a.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import e5.a;

public class TabItem extends View {

    /* renamed from: a  reason: collision with root package name */
    public final CharSequence f4006a;

    /* renamed from: b  reason: collision with root package name */
    public final Drawable f4007b;

    /* renamed from: c  reason: collision with root package name */
    public final int f4008c;

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.D);
        this.f4006a = obtainStyledAttributes.getText(2);
        if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(0);
        } else {
            drawable = b.a0(context, resourceId);
        }
        this.f4007b = drawable;
        this.f4008c = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
    }
}
