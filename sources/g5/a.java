package g5;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.appbar.AppBarLayout;
import e6.f;
import java.util.Objects;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f5238a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f5239b;

    public a(AppBarLayout appBarLayout, f fVar) {
        this.f5239b = appBarLayout;
        this.f5238a = fVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f5238a.n(floatValue);
        Drawable drawable = this.f5239b.D;
        if (drawable instanceof f) {
            ((f) drawable).n(floatValue);
        }
        Objects.requireNonNull(this.f5239b);
        throw null;
    }
}
