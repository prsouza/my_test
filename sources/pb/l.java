package pb;

import android.animation.Animator;
import android.widget.ImageView;
import e6.e;
import io.nodle.cash.R;

public final class l implements Animator.AnimatorListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f9860a;

    public l(j jVar) {
        this.f9860a = jVar;
    }

    public final void onAnimationCancel(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationEnd(Animator animator) {
        e.D(animator, "animator");
        ImageView imageView = (ImageView) this.f9860a.b(R.id.curtainView);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        e.D(animator, "animator");
    }

    public final void onAnimationStart(Animator animator) {
        e.D(animator, "animator");
    }
}
