package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.Objects;

public final class j extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k.a f2501a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2502b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2503c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ k f2504s;

    public j(k kVar, k.a aVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f2504s = kVar;
        this.f2501a = aVar;
        this.f2502b = viewPropertyAnimator;
        this.f2503c = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2502b.setListener((Animator.AnimatorListener) null);
        this.f2503c.setAlpha(1.0f);
        this.f2503c.setTranslationX(0.0f);
        this.f2503c.setTranslationY(0.0f);
        this.f2504s.c(this.f2501a.f2517b);
        this.f2504s.f2515r.remove(this.f2501a.f2517b);
        this.f2504s.j();
    }

    public final void onAnimationStart(Animator animator) {
        k kVar = this.f2504s;
        RecyclerView.b0 b0Var = this.f2501a.f2517b;
        Objects.requireNonNull(kVar);
    }
}
