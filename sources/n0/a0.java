package n0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import h.v;
import java.lang.ref.WeakReference;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<View> f8774a;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b0 f8775a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f8776b;

        public a(b0 b0Var, View view) {
            this.f8775a = b0Var;
            this.f8776b = view;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f8775a.e(this.f8776b);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f8775a.c();
        }

        public final void onAnimationStart(Animator animator) {
            this.f8775a.i();
        }
    }

    public class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c0 f8777a;

        public b(c0 c0Var, View view) {
            this.f8777a = c0Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) v.this.f5624d.getParent()).invalidate();
        }
    }

    public a0(View view) {
        this.f8774a = new WeakReference<>(view);
    }

    public final a0 a(float f10) {
        View view = this.f8774a.get();
        if (view != null) {
            view.animate().alpha(f10);
        }
        return this;
    }

    public final void b() {
        View view = this.f8774a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final a0 c(long j10) {
        View view = this.f8774a.get();
        if (view != null) {
            view.animate().setDuration(j10);
        }
        return this;
    }

    public final a0 d(b0 b0Var) {
        View view = this.f8774a.get();
        if (view != null) {
            e(view, b0Var);
        }
        return this;
    }

    public final void e(View view, b0 b0Var) {
        if (b0Var != null) {
            view.animate().setListener(new a(b0Var, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public final a0 f(c0 c0Var) {
        View view = this.f8774a.get();
        if (view != null) {
            b bVar = null;
            if (c0Var != null) {
                bVar = new b(c0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public final a0 g(float f10) {
        View view = this.f8774a.get();
        if (view != null) {
            view.animate().translationY(f10);
        }
        return this;
    }
}
