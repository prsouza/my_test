package z5;

import android.animation.ValueAnimator;

public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f13865a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f13866b;

    public b(a aVar, float f10) {
        this.f13866b = aVar;
        this.f13865a = f10;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f13866b.e(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f13865a);
    }
}
