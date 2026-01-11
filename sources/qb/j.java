package qb;

import android.widget.ImageView;
import e6.e;
import qb.k;
import va.x0;

public final /* synthetic */ class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x0 f10364a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ float f10365b;

    public /* synthetic */ j(x0 x0Var, float f10) {
        this.f10364a = x0Var;
        this.f10365b = f10;
    }

    public final void run() {
        x0 x0Var = this.f10364a;
        float f10 = this.f10365b;
        k.a aVar = k.f10366y;
        e.D(x0Var, "$this_apply");
        ImageView imageView = x0Var.f12432t;
        imageView.setX(f10 - ((float) (imageView.getWidth() / 2)));
    }
}
