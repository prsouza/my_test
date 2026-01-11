package j5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f7054a;

    public c(BottomAppBar bottomAppBar) {
        this.f7054a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        Objects.requireNonNull(this.f7054a);
        Objects.requireNonNull(this.f7054a);
        this.f7054a.f3675j0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f7054a);
    }
}
