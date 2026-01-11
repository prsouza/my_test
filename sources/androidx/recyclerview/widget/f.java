package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class f extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2483a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2484b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2485c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ k f2486s;

    public f(k kVar, RecyclerView.b0 b0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2486s = kVar;
        this.f2483a = b0Var;
        this.f2484b = viewPropertyAnimator;
        this.f2485c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2484b.setListener((Animator.AnimatorListener) null);
        this.f2485c.setAlpha(1.0f);
        this.f2486s.c(this.f2483a);
        this.f2486s.f2514q.remove(this.f2483a);
        this.f2486s.j();
    }

    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2486s);
    }
}
