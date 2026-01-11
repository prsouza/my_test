package x5;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

public class j extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f12835a;

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        getWidth();
        getHeight();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f12835a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f12835a;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
    }

    public void setDrawTopInsetForeground(boolean z) {
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f12835a = drawable;
    }
}
