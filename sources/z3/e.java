package z3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public abstract class e<Z> extends i<ImageView, Z> {

    /* renamed from: c  reason: collision with root package name */
    public Animatable f13785c;

    public e(ImageView imageView) {
        super(imageView);
    }

    public final void c(Drawable drawable) {
        j((Object) null);
        h(drawable);
    }

    public final void d(Drawable drawable) {
        j((Object) null);
        h(drawable);
    }

    public final void f(Drawable drawable) {
        this.f13787b.a();
        Animatable animatable = this.f13785c;
        if (animatable != null) {
            animatable.stop();
        }
        j((Object) null);
        h(drawable);
    }

    public final void g(Object obj) {
        j(obj);
    }

    public final void h(Drawable drawable) {
        ((ImageView) this.f13786a).setImageDrawable(drawable);
    }

    public abstract void i(Z z);

    public final void j(Z z) {
        i(z);
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.f13785c = animatable;
            animatable.start();
            return;
        }
        this.f13785c = null;
    }

    public final void onStart() {
        Animatable animatable = this.f13785c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void onStop() {
        Animatable animatable = this.f13785c;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
