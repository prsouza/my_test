package p1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import s.a;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f9540a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f9541b;

    public j(i iVar, a aVar) {
        this.f9541b = iVar;
        this.f9540a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9540a.remove(animator);
        this.f9541b.B.remove(animator);
    }

    public final void onAnimationStart(Animator animator) {
        this.f9541b.B.add(animator);
    }
}
