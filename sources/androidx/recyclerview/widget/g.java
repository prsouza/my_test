package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class g extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2487a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2488b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2489c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ k f2490s;

    public g(k kVar, RecyclerView.b0 b0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2490s = kVar;
        this.f2487a = b0Var;
        this.f2488b = view;
        this.f2489c = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2488b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2489c.setListener((Animator.AnimatorListener) null);
        this.f2490s.c(this.f2487a);
        this.f2490s.f2512o.remove(this.f2487a);
        this.f2490s.j();
    }

    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2490s);
    }
}
