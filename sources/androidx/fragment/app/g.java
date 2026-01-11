package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import androidx.fragment.app.r0;

public final class g implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0.e f1895a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f1896b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ View f1897c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ d.c f1898d;

    public class a implements Runnable {
        public a() {
        }

        public final void run() {
            g gVar = g.this;
            gVar.f1896b.endViewTransition(gVar.f1897c);
            g.this.f1898d.a();
        }
    }

    public g(r0.e eVar, ViewGroup viewGroup, View view, d.c cVar) {
        this.f1895a = eVar;
        this.f1896b = viewGroup;
        this.f1897c = view;
        this.f1898d = cVar;
    }

    public final void onAnimationEnd(Animation animation) {
        this.f1896b.post(new a());
        if (a0.K(2)) {
            StringBuilder d10 = a.a.d("Animation from operation ");
            d10.append(this.f1895a);
            d10.append(" has ended.");
            Log.v("FragmentManager", d10.toString());
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        if (a0.K(2)) {
            StringBuilder d10 = a.a.d("Animation from operation ");
            d10.append(this.f1895a);
            d10.append(" has reached onAnimationStart.");
            Log.v("FragmentManager", d10.toString());
        }
    }
}
