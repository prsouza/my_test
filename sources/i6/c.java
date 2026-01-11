package i6;

import android.animation.ValueAnimator;
import com.google.android.material.textfield.a;

public final class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f6187a;

    public c(a aVar) {
        this.f6187a = aVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f6187a.f6194c.setScaleX(floatValue);
        this.f6187a.f6194c.setScaleY(floatValue);
    }
}
