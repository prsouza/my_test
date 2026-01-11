package qb;

import android.animation.Animator;
import android.view.View;
import android.widget.ImageView;
import e6.e;
import va.x0;

public final class o implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f10383a;

    public o(x0 x0Var) {
        this.f10383a = x0Var;
    }

    public final void onAnimationCancel(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animator");
        View view = this.f10383a.f12431s;
        e.C(view, "bubbleLineView");
        view.setVisibility(0);
        ImageView imageView = this.f10383a.f12432t;
        e.C(imageView, "bubbleNotchView");
        imageView.setVisibility(0);
    }

    public final void onAnimationRepeat(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        e.D(animator, "animator");
    }
}
