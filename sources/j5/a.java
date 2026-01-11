package j5;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import java.util.Objects;

public final class a extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f7050a;

    public a(BottomAppBar bottomAppBar) {
        this.f7050a = bottomAppBar;
    }

    public final void onAnimationEnd(Animator animator) {
        Objects.requireNonNull(this.f7050a);
        this.f7050a.f3674i0 = null;
    }

    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f7050a);
    }
}
