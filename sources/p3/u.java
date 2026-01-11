package p3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import i3.s;
import i3.w;
import java.util.Objects;

public final class u implements w<BitmapDrawable>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f9635a;

    /* renamed from: b  reason: collision with root package name */
    public final w<Bitmap> f9636b;

    public u(Resources resources, w<Bitmap> wVar) {
        Objects.requireNonNull(resources, "Argument must not be null");
        this.f9635a = resources;
        Objects.requireNonNull(wVar, "Argument must not be null");
        this.f9636b = wVar;
    }

    public static w<BitmapDrawable> e(Resources resources, w<Bitmap> wVar) {
        if (wVar == null) {
            return null;
        }
        return new u(resources, wVar);
    }

    public final void a() {
        w<Bitmap> wVar = this.f9636b;
        if (wVar instanceof s) {
            ((s) wVar).a();
        }
    }

    public final int b() {
        return this.f9636b.b();
    }

    public final Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    public final void d() {
        this.f9636b.d();
    }

    public final Object get() {
        return new BitmapDrawable(this.f9635a, this.f9636b.get());
    }
}
