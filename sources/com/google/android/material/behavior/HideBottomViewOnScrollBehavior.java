package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    public int f3655a = 0;

    /* renamed from: b  reason: collision with root package name */
    public int f3656b = 2;

    /* renamed from: c  reason: collision with root package name */
    public int f3657c = 0;

    /* renamed from: d  reason: collision with root package name */
    public ViewPropertyAnimator f3658d;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public final void onAnimationEnd(Animator animator) {
            HideBottomViewOnScrollBehavior.this.f3658d = null;
        }
    }

    public HideBottomViewOnScrollBehavior() {
    }

    public boolean h(CoordinatorLayout coordinatorLayout, V v10, int i) {
        this.f3655a = v10.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v10.getLayoutParams()).bottomMargin;
        return false;
    }

    public final void l(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        boolean z = false;
        if (i > 0) {
            if (this.f3656b == 1) {
                z = true;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator = this.f3658d;
                if (viewPropertyAnimator != null) {
                    viewPropertyAnimator.cancel();
                    view.clearAnimation();
                }
                this.f3656b = 1;
                s(view, this.f3655a + this.f3657c, 175, f5.a.f4986c);
            }
        } else if (i < 0) {
            if (this.f3656b == 2) {
                z = true;
            }
            if (!z) {
                ViewPropertyAnimator viewPropertyAnimator2 = this.f3658d;
                if (viewPropertyAnimator2 != null) {
                    viewPropertyAnimator2.cancel();
                    view.clearAnimation();
                }
                this.f3656b = 2;
                s(view, 0, 225, f5.a.f4987d);
            }
        }
    }

    public boolean p(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i10) {
        return i == 2;
    }

    public final void s(V v10, int i, long j10, TimeInterpolator timeInterpolator) {
        this.f3658d = v10.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j10).setListener(new a());
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
