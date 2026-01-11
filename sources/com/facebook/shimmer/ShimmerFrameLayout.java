package com.facebook.shimmer;

import aa.b;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.shimmer.a;
import f4.a;

public class ShimmerFrameLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public final Paint f3582a = new Paint();

    /* renamed from: b  reason: collision with root package name */
    public final a f3583b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3584c;

    public ShimmerFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a();
        this.f3583b = aVar;
        this.f3584c = true;
        setWillNotDraw(false);
        aVar.setCallback(this);
        if (attributeSet == null) {
            a(new a.C0039a().a());
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.z, 0, 0);
        try {
            a(((!obtainStyledAttributes.hasValue(4) || !obtainStyledAttributes.getBoolean(4, false)) ? new a.C0039a() : new a.c()).b(obtainStyledAttributes).a());
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final ShimmerFrameLayout a(a aVar) {
        boolean z;
        f4.a aVar2 = this.f3583b;
        aVar2.f4982f = aVar;
        if (aVar != null) {
            aVar2.f4978b.setXfermode(new PorterDuffXfermode(aVar2.f4982f.f3598p ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        }
        aVar2.b();
        if (aVar2.f4982f != null) {
            ValueAnimator valueAnimator = aVar2.f4981e;
            if (valueAnimator != null) {
                z = valueAnimator.isStarted();
                aVar2.f4981e.cancel();
                aVar2.f4981e.removeAllUpdateListeners();
            } else {
                z = false;
            }
            a aVar3 = aVar2.f4982f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, ((float) (aVar3.f3602t / aVar3.f3601s)) + 1.0f});
            aVar2.f4981e = ofFloat;
            ofFloat.setRepeatMode(aVar2.f4982f.f3600r);
            aVar2.f4981e.setRepeatCount(aVar2.f4982f.f3599q);
            ValueAnimator valueAnimator2 = aVar2.f4981e;
            a aVar4 = aVar2.f4982f;
            valueAnimator2.setDuration(aVar4.f3601s + aVar4.f3602t);
            aVar2.f4981e.addUpdateListener(aVar2.f4977a);
            if (z) {
                aVar2.f4981e.start();
            }
        }
        aVar2.invalidateSelf();
        if (aVar == null || !aVar.f3596n) {
            setLayerType(0, (Paint) null);
        } else {
            setLayerType(2, this.f3582a);
        }
        return this;
    }

    public final void b() {
        if (!this.f3584c) {
            this.f3584c = true;
            f4.a aVar = this.f3583b;
            ValueAnimator valueAnimator = aVar.f4981e;
            if (valueAnimator != null && !valueAnimator.isStarted() && aVar.getCallback() != null) {
                aVar.f4981e.start();
            }
        }
    }

    public final void c() {
        f4.a aVar = this.f3583b;
        ValueAnimator valueAnimator = aVar.f4981e;
        if (valueAnimator != null) {
            if (valueAnimator.isStarted()) {
                aVar.f4981e.cancel();
            }
        }
    }

    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f3584c) {
            this.f3583b.draw(canvas);
        }
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f3583b.a();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    public final void onLayout(boolean z, int i, int i10, int i11, int i12) {
        super.onLayout(z, i, i10, i11, i12);
        this.f3583b.setBounds(0, 0, getWidth(), getHeight());
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f3583b;
    }
}
