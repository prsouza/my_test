package qb;

import android.animation.Animator;
import android.widget.LinearLayout;
import com.github.mikephil.charting.BuildConfig;
import e6.e;
import va.x0;

public final class l implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f10380a;

    public l(x0 x0Var) {
        this.f10380a = x0Var;
    }

    public final void onAnimationCancel(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animator");
        this.f10380a.f12434v.setText(BuildConfig.FLAVOR);
        LinearLayout linearLayout = this.f10380a.f12430c;
        e.C(linearLayout, "bubbleLayout");
        linearLayout.setVisibility(8);
    }

    public final void onAnimationRepeat(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        e.D(animator, "animator");
    }
}
