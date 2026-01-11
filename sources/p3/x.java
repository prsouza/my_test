package p3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import g3.h;
import g3.j;
import i3.w;
import j3.c;
import java.io.IOException;
import r3.b;
import r3.d;

public final class x implements j<Uri, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f9644a;

    /* renamed from: b  reason: collision with root package name */
    public final c f9645b;

    public x(d dVar, c cVar) {
        this.f9644a = dVar;
        this.f9645b = cVar;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        return "android.resource".equals(((Uri) obj).getScheme());
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        w<Drawable> c10 = this.f9644a.b((Uri) obj, i, i10, hVar);
        if (c10 == null) {
            return null;
        }
        return n.a(this.f9645b, (Drawable) ((b) c10).get(), i, i10);
    }
}
