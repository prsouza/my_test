package com.google.android.material.appbar;

import a.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import e6.f;
import io.nodle.cash.R;
import j6.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import x5.o;
import x5.p;

public class MaterialToolbar extends Toolbar {

    /* renamed from: m0  reason: collision with root package name */
    public static final ImageView.ScaleType[] f3639m0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: h0  reason: collision with root package name */
    public Integer f3640h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f3641i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f3642j0;

    /* renamed from: k0  reason: collision with root package name */
    public ImageView.ScaleType f3643k0;

    /* renamed from: l0  reason: collision with root package name */
    public Boolean f3644l0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, 2131821651), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        int i = 0;
        TypedArray d10 = o.d(context2, attributeSet, e5.a.f4637w, R.attr.toolbarStyle, 2131821651, new int[0]);
        if (d10.hasValue(2)) {
            setNavigationIconTint(d10.getColor(2, -1));
        }
        this.f3641i0 = d10.getBoolean(4, false);
        this.f3642j0 = d10.getBoolean(3, false);
        int i10 = d10.getInt(1, -1);
        if (i10 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3639m0;
            if (i10 < scaleTypeArr.length) {
                this.f3643k0 = scaleTypeArr[i10];
            }
        }
        if (d10.hasValue(0)) {
            this.f3644l0 = Boolean.valueOf(d10.getBoolean(0, false));
        }
        d10.recycle();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            f fVar = new f();
            fVar.o(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : i));
            fVar.m(context2);
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            fVar.n(x.i.i(this));
            x.d.q(this, fVar);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3643k0;
    }

    public Integer getNavigationIconTint() {
        return this.f3640h0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b.E0(this);
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        int i13 = 0;
        ImageView imageView = null;
        if (this.f3641i0 || this.f3642j0) {
            List<TextView> a10 = p.a(this, getTitle());
            TextView textView = ((ArrayList) a10).isEmpty() ? null : (TextView) Collections.min(a10, p.f12862a);
            List<TextView> a11 = p.a(this, getSubtitle());
            TextView textView2 = ((ArrayList) a11).isEmpty() ? null : (TextView) Collections.max(a11, p.f12862a);
            if (!(textView == null && textView2 == null)) {
                int measuredWidth = getMeasuredWidth();
                int i14 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i15 = 0; i15 < getChildCount(); i15++) {
                    View childAt = getChildAt(i15);
                    if (!(childAt.getVisibility() == 8 || childAt == textView || childAt == textView2)) {
                        if (childAt.getRight() < i14 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i14 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3641i0 && textView != null) {
                    w(textView, pair);
                }
                if (this.f3642j0 && textView2 != null) {
                    w(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        while (true) {
            if (i13 >= getChildCount()) {
                break;
            }
            View childAt2 = getChildAt(i13);
            if (childAt2 instanceof ImageView) {
                ImageView imageView2 = (ImageView) childAt2;
                if (logo != null && imageView2.getDrawable().getConstantState().equals(logo.getConstantState())) {
                    imageView = imageView2;
                    break;
                }
            }
            i13++;
        }
        if (imageView != null) {
            Boolean bool = this.f3644l0;
            if (bool != null) {
                imageView.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3643k0;
            if (scaleType != null) {
                imageView.setScaleType(scaleType);
            }
        }
    }

    public void setElevation(float f10) {
        super.setElevation(f10);
        b.D0(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.f3644l0;
        if (bool == null || bool.booleanValue() != z) {
            this.f3644l0 = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3643k0 != scaleType) {
            this.f3643k0 = scaleType;
            requestLayout();
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (!(drawable == null || this.f3640h0 == null)) {
            drawable = drawable.mutate();
            drawable.setTint(this.f3640h0.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3640h0 = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.f3642j0 != z) {
            this.f3642j0 = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.f3641i0 != z) {
            this.f3641i0 = z;
            requestLayout();
        }
    }

    public final void w(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i10 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i10 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i10 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i10 - i, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i, view.getTop(), i10, view.getBottom());
    }
}
