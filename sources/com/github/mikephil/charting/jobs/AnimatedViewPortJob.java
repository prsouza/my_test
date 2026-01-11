package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.github.mikephil.charting.utils.Transformer;
import com.github.mikephil.charting.utils.ViewPortHandler;

public abstract class AnimatedViewPortJob extends ViewPortJob implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {
    public ObjectAnimator animator;
    public float phase;
    public float xOrigin;
    public float yOrigin;

    public AnimatedViewPortJob(ViewPortHandler viewPortHandler, float f10, float f11, Transformer transformer, View view, float f12, float f13, long j10) {
        super(viewPortHandler, f10, f11, transformer, view);
        this.xOrigin = f12;
        this.yOrigin = f13;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, "phase", new float[]{0.0f, 1.0f});
        this.animator = ofFloat;
        ofFloat.setDuration(j10);
        this.animator.addUpdateListener(this);
        this.animator.addListener(this);
    }

    public float getPhase() {
        return this.phase;
    }

    public float getXOrigin() {
        return this.xOrigin;
    }

    public float getYOrigin() {
        return this.yOrigin;
    }

    public void onAnimationCancel(Animator animator2) {
        try {
            recycleSelf();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void onAnimationEnd(Animator animator2) {
        try {
            recycleSelf();
        } catch (IllegalArgumentException unused) {
        }
    }

    public void onAnimationRepeat(Animator animator2) {
    }

    public void onAnimationStart(Animator animator2) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    public abstract void recycleSelf();

    public void resetAnimator() {
        this.animator.removeAllListeners();
        this.animator.removeAllUpdateListeners();
        this.animator.reverse();
        this.animator.addUpdateListener(this);
        this.animator.addListener(this);
    }

    public void run() {
        this.animator.start();
    }

    public void setPhase(float f10) {
        this.phase = f10;
    }
}
