package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class k extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f9542a;

    public k(i iVar) {
        this.f9542a = iVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9542a.o();
        animator.removeListener(this);
    }
}
