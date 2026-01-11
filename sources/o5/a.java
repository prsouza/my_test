package o5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.h;
import b6.c;
import io.nodle.cash.R;
import x5.o;
import x5.t;

public final class a extends h {

    /* renamed from: w  reason: collision with root package name */
    public static final int[][] f9312w = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: t  reason: collision with root package name */
    public ColorStateList f9313t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f9314u;

    /* renamed from: v  reason: collision with root package name */
    public boolean f9315v;

    public a(Context context, AttributeSet attributeSet) {
        super(j6.a.a(context, attributeSet, R.attr.checkboxStyle, 2131821576), attributeSet, R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d10 = o.d(context2, attributeSet, e5.a.f4632r, R.attr.checkboxStyle, 2131821576, new int[0]);
        if (d10.hasValue(0)) {
            setButtonTintList(c.a(context2, d10, 0));
        }
        this.f9314u = d10.getBoolean(2, false);
        this.f9315v = d10.getBoolean(1, true);
        d10.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f9313t == null) {
            int[][] iArr = f9312w;
            int B = y.c.B(this, R.attr.colorControlActivated);
            int B2 = y.c.B(this, R.attr.colorSurface);
            int B3 = y.c.B(this, R.attr.colorOnSurface);
            this.f9313t = new ColorStateList(iArr, new int[]{y.c.N(B2, B, 1.0f), y.c.N(B2, B3, 0.54f), y.c.N(B2, B3, 0.38f), y.c.N(B2, B3, 0.38f)});
        }
        return this.f9313t;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9314u && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public final void onDraw(Canvas canvas) {
        Drawable buttonDrawable;
        if (!this.f9315v || !TextUtils.isEmpty(getText()) || (buttonDrawable = getButtonDrawable()) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - buttonDrawable.getIntrinsicWidth()) / 2) * (t.c(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate((float) width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = buttonDrawable.getBounds();
            getBackground().setHotspotBounds(bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f9315v = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f9314u = z;
        if (z) {
            setButtonTintList(getMaterialThemeColorsTintList());
        } else {
            setButtonTintList((ColorStateList) null);
        }
    }
}
