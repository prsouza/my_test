package r3;

import android.graphics.drawable.Drawable;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;

public final class e implements j<Drawable, Drawable> {
    public final /* bridge */ /* synthetic */ boolean a(Object obj, h hVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        return true;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            return new c(drawable);
        }
        return null;
    }
}
