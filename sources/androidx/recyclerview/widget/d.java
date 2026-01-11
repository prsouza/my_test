package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2480b;

    public d(k kVar, ArrayList arrayList) {
        this.f2480b = kVar;
        this.f2479a = arrayList;
    }

    public final void run() {
        View view;
        Iterator it = this.f2479a.iterator();
        while (it.hasNext()) {
            k.a aVar = (k.a) it.next();
            k kVar = this.f2480b;
            Objects.requireNonNull(kVar);
            RecyclerView.b0 b0Var = aVar.f2516a;
            View view2 = null;
            if (b0Var == null) {
                view = null;
            } else {
                view = b0Var.f2311a;
            }
            RecyclerView.b0 b0Var2 = aVar.f2517b;
            if (b0Var2 != null) {
                view2 = b0Var2.f2311a;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(kVar.f2338f);
                kVar.f2515r.add(aVar.f2516a);
                duration.translationX((float) (aVar.f2520e - aVar.f2518c));
                duration.translationY((float) (aVar.f2521f - aVar.f2519d));
                duration.alpha(0.0f).setListener(new i(kVar, aVar, duration, view)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                kVar.f2515r.add(aVar.f2517b);
                animate.translationX(0.0f).translationY(0.0f).setDuration(kVar.f2338f).alpha(1.0f).setListener(new j(kVar, aVar, animate, view2)).start();
            }
        }
        this.f2479a.clear();
        this.f2480b.f2511n.remove(this.f2479a);
    }
}
