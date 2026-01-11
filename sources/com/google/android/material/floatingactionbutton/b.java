package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.d;

public final class b extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public boolean f3934a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f3935b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.g f3936c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ d f3937s;

    public b(d dVar, boolean z, d.g gVar) {
        this.f3937s = dVar;
        this.f3935b = z;
        this.f3936c = gVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f3934a = true;
    }

    public final void onAnimationEnd(Animator animator) {
        d dVar = this.f3937s;
        dVar.f3953n = 0;
        dVar.f3948h = null;
        if (!this.f3934a) {
            FloatingActionButton floatingActionButton = dVar.f3957r;
            boolean z = this.f3935b;
            floatingActionButton.b(z ? 8 : 4, z);
            d.g gVar = this.f3936c;
            if (gVar != null) {
                a aVar = (a) gVar;
                aVar.f3932a.a(aVar.f3933b);
            }
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f3937s.f3957r.b(0, this.f3935b);
        d dVar = this.f3937s;
        dVar.f3953n = 1;
        dVar.f3948h = animator;
        this.f3934a = false;
    }
}
