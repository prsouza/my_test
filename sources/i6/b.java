package i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.a;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f6186a;

    public b(a aVar) {
        this.f6186a = aVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f6186a.f6192a.setEndIconVisible(false);
    }
}
