package p3;

import android.graphics.Bitmap;
import c4.j;
import i3.s;
import i3.w;
import j3.c;
import java.util.Objects;

public final class e implements w<Bitmap>, s {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap f9588a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9589b;

    public e(Bitmap bitmap, c cVar) {
        Objects.requireNonNull(bitmap, "Bitmap must not be null");
        this.f9588a = bitmap;
        Objects.requireNonNull(cVar, "BitmapPool must not be null");
        this.f9589b = cVar;
    }

    public static e e(Bitmap bitmap, c cVar) {
        if (bitmap == null) {
            return null;
        }
        return new e(bitmap, cVar);
    }

    public final void a() {
        this.f9588a.prepareToDraw();
    }

    public final int b() {
        return j.d(this.f9588a);
    }

    public final Class<Bitmap> c() {
        return Bitmap.class;
    }

    public final void d() {
        this.f9589b.e(this.f9588a);
    }

    public final Object get() {
        return this.f9588a;
    }
}
