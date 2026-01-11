package qb;

import android.animation.Animator;
import e6.e;
import va.x0;

public final class n implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f10382a;

    public n(x0 x0Var) {
        this.f10382a = x0Var;
    }

    public final void onAnimationCancel(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animator");
        this.f10382a.f12431s.setVisibility(0);
        this.f10382a.f12432t.setVisibility(0);
    }

    public final void onAnimationRepeat(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        e.D(animator, "animator");
    }
}
