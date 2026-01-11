package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class c extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f3938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ d.g f3939b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d f3940c;

    public c(d dVar, boolean z, d.g gVar) {
        this.f3940c = dVar;
        this.f3938a = z;
        this.f3939b = gVar;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3940c;
        dVar.f3953n = 0;
        dVar.f3948h = null;
        d.g gVar = this.f3939b;
        if (gVar != null) {
            ((a) gVar).f3932a.b();
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f3940c.f3957r.b(0, this.f3938a);
        d dVar = this.f3940c;
        dVar.f3953n = 2;
        dVar.f3948h = animator;
    }
}
