package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import io.nodle.cash.R;

public final class y extends SeekBar {

    /* renamed from: a  reason: collision with root package name */
    public final z f1421a;

    public y(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        y0.a(this, getContext());
        z zVar = new z(this);
        this.f1421a = zVar;
        zVar.a(attributeSet, R.attr.seekBarStyle);
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        z zVar = this.f1421a;
        Drawable drawable = zVar.f1429e;
        if (drawable != null && drawable.isStateful() && drawable.setState(zVar.f1428d.getDrawableState())) {
            zVar.f1428d.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1421a.f1429e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1421a.d(canvas);
    }
}
