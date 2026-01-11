package androidx.fragment.app;

import a.a;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.d;
import androidx.fragment.app.r0;
import j0.b;

public final class h implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ View f1907a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1908b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d.c f1909c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ r0.e f1910d;

    public h(View view, ViewGroup viewGroup, d.c cVar, r0.e eVar) {
        this.f1907a = view;
        this.f1908b = viewGroup;
        this.f1909c = cVar;
        this.f1910d = eVar;
    }

    public final void onCancel() {
        this.f1907a.clearAnimation();
        this.f1908b.endViewTransition(this.f1907a);
        this.f1909c.a();
        if (a0.K(2)) {
            StringBuilder d10 = a.d("Animation from operation ");
            d10.append(this.f1910d);
            d10.append(" has been cancelled.");
            Log.v("FragmentManager", d10.toString());
        }
    }
}
