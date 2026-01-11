package p3;

import android.graphics.Bitmap;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;

public final class a0 implements j<Bitmap, Bitmap> {

    public static final class a implements w<Bitmap> {

        /* renamed from: a  reason: collision with root package name */
        public final Bitmap f9572a;

        public a(Bitmap bitmap) {
            this.f9572a = bitmap;
        }

        public final int b() {
            return c4.j.d(this.f9572a);
        }

        public final Class<Bitmap> c() {
            return Bitmap.class;
        }

        public final void d() {
        }

        public final Object get() {
            return this.f9572a;
        }
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) throws IOException {
        Bitmap bitmap = (Bitmap) obj;
        return true;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        return new a((Bitmap) obj);
    }
}
