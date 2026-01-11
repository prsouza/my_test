package i6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.textfield.b;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f6188a;

    public f(b bVar) {
        this.f6188a = bVar;
    }

    public final void onAnimationEnd(Animator animator) {
        b bVar = this.f6188a;
        bVar.f6194c.setChecked(bVar.f4123k);
        this.f6188a.f4129q.start();
    }
}
