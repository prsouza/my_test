package h;

import android.view.View;
import java.util.WeakHashMap;
import n0.a0;
import n0.b0;
import n0.x;

public final class k extends c3.k {
    public final /* synthetic */ g H;

    public k(g gVar) {
        this.H = gVar;
    }

    public final void c() {
        this.H.D.setAlpha(1.0f);
        this.H.G.d((b0) null);
        this.H.G = null;
    }

    public final void i() {
        this.H.D.setVisibility(0);
        if (this.H.D.getParent() instanceof View) {
            WeakHashMap<View, a0> weakHashMap = x.f8842a;
            x.h.c((View) this.H.D.getParent());
        }
    }
}
