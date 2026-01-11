package qb;

import android.animation.ObjectAnimator;
import android.util.Log;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import e6.e;
import qb.k;
import va.x0;

public final /* synthetic */ class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ float f10361a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x0 f10362b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ k f10363c;

    public /* synthetic */ i(float f10, x0 x0Var, k kVar) {
        this.f10361a = f10;
        this.f10362b = x0Var;
        this.f10363c = kVar;
    }

    public final void run() {
        float f10 = this.f10361a;
        x0 x0Var = this.f10362b;
        k kVar = this.f10363c;
        k.a aVar = k.f10366y;
        e.D(x0Var, "$this_apply");
        e.D(kVar, "this$0");
        float width = f10 - ((float) ((x0Var.f12430c.getWidth() / 2) + x0Var.f12430c.getLeft()));
        if (width < 0.0f) {
            width = 0.0f;
        } else if (((float) x0Var.f12430c.getWidth()) + width > ((float) x0Var.f12429b.getWidth())) {
            width = (float) (x0Var.f12429b.getWidth() - x0Var.f12430c.getWidth());
        }
        Log.d(k.A, "Move: " + x0Var.f12430c.getX() + " >> " + width);
        x0Var.f12431s.setVisibility(4);
        x0Var.f12431s.setX(f10);
        x0Var.f12432t.setVisibility(4);
        ImageView imageView = x0Var.f12432t;
        imageView.setX(f10 - ((float) ((x0Var.f12432t.getWidth() / 2) + imageView.getLeft())));
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(x0Var.f12430c, View.TRANSLATION_X, new float[]{width});
        ofFloat.setDuration(kVar.f10367t);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.addListener(new n(x0Var));
        ofFloat.start();
    }
}
