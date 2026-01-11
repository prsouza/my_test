package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import q5.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4193a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f4194b;

    public b(d dVar, Drawable drawable) {
        this.f4193a = dVar;
        this.f4194b = drawable;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f4193a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public final void onAnimationStart(Animator animator) {
        this.f4193a.setCircularRevealOverlayDrawable(this.f4194b);
    }
}
