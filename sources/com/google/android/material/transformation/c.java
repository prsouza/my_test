package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import q5.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f4195a;

    public c(d dVar) {
        this.f4195a = dVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d.C0199d revealInfo = this.f4195a.getRevealInfo();
        revealInfo.f10310c = Float.MAX_VALUE;
        this.f4195a.setRevealInfo(revealInfo);
    }
}
