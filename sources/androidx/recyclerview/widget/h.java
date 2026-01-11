package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Objects;

public final class h extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView.b0 f2491a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f2492b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f2493c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ int f2494s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f2495t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ k f2496u;

    public h(k kVar, RecyclerView.b0 b0Var, int i, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f2496u = kVar;
        this.f2491a = b0Var;
        this.f2492b = i;
        this.f2493c = view;
        this.f2494s = i10;
        this.f2495t = viewPropertyAnimator;
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f2492b != 0) {
            this.f2493c.setTranslationX(0.0f);
        }
        if (this.f2494s != 0) {
            this.f2493c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f2495t.setListener((Animator.AnimatorListener) null);
        this.f2496u.c(this.f2491a);
        this.f2496u.f2513p.remove(this.f2491a);
        this.f2496u.j();
    }

    public final void onAnimationStart(Animator animator) {
        Objects.requireNonNull(this.f2496u);
    }
}
