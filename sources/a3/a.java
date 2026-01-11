package a3;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class a extends ValueAnimator {

    /* renamed from: a  reason: collision with root package name */
    public final Set<ValueAnimator.AnimatorUpdateListener> f36a = new CopyOnWriteArraySet();

    /* renamed from: b  reason: collision with root package name */
    public final Set<Animator.AnimatorListener> f37b = new CopyOnWriteArraySet();

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void a(boolean z) {
        Iterator it = this.f37b.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void addListener(Animator.AnimatorListener animatorListener) {
        this.f37b.add(animatorListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CopyOnWriteArraySet, java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>] */
    public final void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f36a.add(animatorUpdateListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void b(boolean z) {
        Iterator it = this.f37b.iterator();
        while (it.hasNext()) {
            Animator.AnimatorListener animatorListener = (Animator.AnimatorListener) it.next();
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CopyOnWriteArraySet, java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>] */
    public final void c() {
        Iterator it = this.f36a.iterator();
        while (it.hasNext()) {
            ((ValueAnimator.AnimatorUpdateListener) it.next()).onAnimationUpdate(this);
        }
    }

    public final long getStartDelay() {
        throw new UnsupportedOperationException("LottieAnimator does not support getStartDelay.");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void removeAllListeners() {
        this.f37b.clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CopyOnWriteArraySet, java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>] */
    public final void removeAllUpdateListeners() {
        this.f36a.clear();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Set<android.animation.Animator$AnimatorListener>, java.util.concurrent.CopyOnWriteArraySet] */
    public final void removeListener(Animator.AnimatorListener animatorListener) {
        this.f37b.remove(animatorListener);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.CopyOnWriteArraySet, java.util.Set<android.animation.ValueAnimator$AnimatorUpdateListener>] */
    public final void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f36a.remove(animatorUpdateListener);
    }

    public final void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException("LottieAnimator does not support setInterpolator.");
    }

    public final void setStartDelay(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setStartDelay.");
    }

    public final ValueAnimator setDuration(long j10) {
        throw new UnsupportedOperationException("LottieAnimator does not support setDuration.");
    }
}
