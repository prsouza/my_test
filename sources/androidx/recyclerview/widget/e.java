package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ArrayList f2481a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k f2482b;

    public e(k kVar, ArrayList arrayList) {
        this.f2482b = kVar;
        this.f2481a = arrayList;
    }

    public final void run() {
        Iterator it = this.f2481a.iterator();
        while (it.hasNext()) {
            RecyclerView.b0 b0Var = (RecyclerView.b0) it.next();
            k kVar = this.f2482b;
            Objects.requireNonNull(kVar);
            View view = b0Var.f2311a;
            ViewPropertyAnimator animate = view.animate();
            kVar.f2512o.add(b0Var);
            animate.alpha(1.0f).setDuration(kVar.f2335c).setListener(new g(kVar, b0Var, view, animate)).start();
        }
        this.f2481a.clear();
        this.f2482b.f2509l.remove(this.f2481a);
    }
}
