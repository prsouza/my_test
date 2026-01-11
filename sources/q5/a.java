package q5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f10303a;

    public a(d dVar) {
        this.f10303a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f10303a.a();
    }

    public final void onAnimationStart(Animator animator) {
        this.f10303a.b();
    }
}
