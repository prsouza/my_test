package x5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.o0;
import e5.a;

public class h extends o0 {
    public Drawable E;
    public final Rect F;
    public final Rect G;
    public int H;
    public boolean I;
    public boolean J;

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.E;
        if (drawable != null) {
            if (this.J) {
                this.J = false;
                Rect rect = this.F;
                Rect rect2 = this.G;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.I) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.H, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    public final void drawableHotspotChanged(float f10, float f11) {
        super.drawableHotspotChanged(f10, f11);
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.setHotspot(f10, f11);
        }
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.E;
        if (drawable != null && drawable.isStateful()) {
            this.E.setState(getDrawableState());
        }
    }

    public Drawable getForeground() {
        return this.E;
    }

    public int getForegroundGravity() {
        return this.H;
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.E;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        this.J = z | this.J;
    }

    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        this.J = true;
    }

    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.E;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback((Drawable.Callback) null);
                unscheduleDrawable(this.E);
            }
            this.E = drawable;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.H == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    public void setForegroundGravity(int i) {
        if (this.H != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.H = i;
            if (i == 119 && this.E != null) {
                this.E.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.E;
    }

    public h(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.F = new Rect();
        this.G = new Rect();
        this.H = 119;
        this.I = true;
        this.J = false;
        TypedArray d10 = o.d(context, attributeSet, a.f4626l, 0, 0, new int[0]);
        this.H = d10.getInt(1, this.H);
        Drawable drawable = d10.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.I = d10.getBoolean(2, true);
        d10.recycle();
    }
}
