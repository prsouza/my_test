package qb;

import android.util.Log;
import e6.e;
import qb.k;
import va.x0;

public final /* synthetic */ class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f10359a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0 f10360b;

    public /* synthetic */ h(float f10, x0 x0Var) {
        this.f10359a = f10;
        this.f10360b = x0Var;
    }

    public final void run() {
        float f10 = this.f10359a;
        x0 x0Var = this.f10360b;
        k.a aVar = k.f10366y;
        e.D(x0Var, "$this_apply");
        float width = f10 - ((float) (x0Var.f12430c.getWidth() / 2));
        if (width < 0.0f) {
            width = 0.0f;
        } else if (((float) x0Var.f12430c.getWidth()) + width > ((float) x0Var.f12429b.getWidth())) {
            width = (float) (x0Var.f12429b.getWidth() - x0Var.f12430c.getWidth());
        }
        Log.d(k.A, "Move: Show at " + width);
        x0Var.f12430c.setX(width);
        x0Var.f12431s.setX(f10);
    }
}
