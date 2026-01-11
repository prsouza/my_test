package androidx.fragment.app;

import a.a;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.r0;

public final class e extends AnimatorListenerAdapter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1878a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f1879b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1880c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r0.e f1881s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ d.c f1882t;

    public e(ViewGroup viewGroup, View view, boolean z, r0.e eVar, d.c cVar) {
        this.f1878a = viewGroup;
        this.f1879b = view;
        this.f1880c = z;
        this.f1881s = eVar;
        this.f1882t = cVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f1878a.endViewTransition(this.f1879b);
        if (this.f1880c) {
            this.f1881s.f1993a.applyState(this.f1879b);
        }
        this.f1882t.a();
        if (a0.K(2)) {
            StringBuilder d10 = a.d("Animator from operation ");
            d10.append(this.f1881s);
            d10.append(" has ended.");
            Log.v("FragmentManager", d10.toString());
        }
    }
}
