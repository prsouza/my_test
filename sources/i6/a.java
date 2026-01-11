package i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.textfield.a f6185a;

    public a(com.google.android.material.textfield.a aVar) {
        this.f6185a = aVar;
    }

    public final void onAnimationStart(Animator animator) {
        this.f6185a.f6192a.setEndIconVisible(true);
    }
}
