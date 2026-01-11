package n0;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Objects;

public final class q implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final View f8837a;

    /* renamed from: b  reason: collision with root package name */
    public ViewTreeObserver f8838b;

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f8839c;

    public q(View view, Runnable runnable) {
        this.f8837a = view;
        this.f8838b = view.getViewTreeObserver();
        this.f8839c = runnable;
    }

    public static q a(View view, Runnable runnable) {
        Objects.requireNonNull(view, "view == null");
        Objects.requireNonNull(runnable, "runnable == null");
        q qVar = new q(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(qVar);
        view.addOnAttachStateChangeListener(qVar);
        return qVar;
    }

    public final void b() {
        if (this.f8838b.isAlive()) {
            this.f8838b.removeOnPreDrawListener(this);
        } else {
            this.f8837a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f8837a.removeOnAttachStateChangeListener(this);
    }

    public final boolean onPreDraw() {
        b();
        this.f8839c.run();
        return true;
    }

    public final void onViewAttachedToWindow(View view) {
        this.f8838b = view.getViewTreeObserver();
    }

    public final void onViewDetachedFromWindow(View view) {
        b();
    }
}
