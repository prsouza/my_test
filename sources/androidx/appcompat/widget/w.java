package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import io.nodle.cash.R;

public final class w extends RatingBar {

    /* renamed from: a  reason: collision with root package name */
    public final u f1413a;

    public w(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        y0.a(this, getContext());
        u uVar = new u(this);
        this.f1413a = uVar;
        uVar.a(attributeSet, R.attr.ratingBarStyle);
    }

    public final synchronized void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        Bitmap bitmap = this.f1413a.f1401b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
