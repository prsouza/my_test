package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.Objects;

public final class i extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2498b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2499c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ k f2500s;

    public i(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2500s = kVar;
        this.f2497a = aVar;
        this.f2498b = viewPropertyAnimator;
        this.f2499c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2498b.setListener((Animator.AnimatorListener) null);
        this.f2499c.setAlpha(1.0f);
        this.f2499c.setTranslationX(0.0f);
        this.f2499c.setTranslationY(0.0f);
        this.f2500s.c(this.f2497a.f2516a);
        this.f2500s.f2515r.remove(this.f2497a.f2516a);
        this.f2500s.j();
    }

    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2500s;
        RecyclerView.b0 b0Var = this.f2497a.f2516a;
        Objects.requireNonNull(kVar);
    }
}
