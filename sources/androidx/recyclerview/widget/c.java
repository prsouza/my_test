package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2471a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2472b;

    public c(k kVar, ArrayList arrayList) {
        this.f2472b = kVar;
        this.f2471a = arrayList;
    }

    public final void run() {
        Iterator it = this.f2471a.iterator();
        while (it.hasNext()) {
            k.b bVar = (k.b) it.next();
            k kVar = this.f2472b;
            RecyclerView.b0 b0Var = bVar.f2522a;
            int i = bVar.f2523b;
            int i10 = bVar.f2524c;
            int i11 = bVar.f2525d;
            int i12 = bVar.f2526e;
            Objects.requireNonNull(kVar);
            View view = b0Var.f2311a;
            int i13 = i11 - i;
            int i14 = i12 - i10;
            if (i13 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i14 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            kVar.f2513p.add(b0Var);
            animate.setDuration(kVar.f2337e).setListener(new h(kVar, b0Var, i13, view, i14, animate)).start();
        }
        this.f2471a.clear();
        this.f2472b.f2510m.remove(this.f2471a);
    }
}
