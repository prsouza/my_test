package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public final class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f3645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f3646b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f3647c;

    public a(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
        this.f3647c = baseBehavior;
        this.f3645a = coordinatorLayout;
        this.f3646b = appBarLayout;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f3647c.B(this.f3645a, this.f3646b, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
