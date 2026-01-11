package p3;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import g3.h;
import g3.j;
import i3.w;
import java.io.IOException;
import java.util.Objects;
import p3.s;

public final class v implements j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f9637a;

    public v(m mVar) {
        this.f9637a = mVar;
    }

    public final boolean a(Object obj, h hVar) throws IOException {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
        Objects.requireNonNull(this.f9637a);
        return true;
    }

    public final w b(Object obj, int i, int i10, h hVar) throws IOException {
        m mVar = this.f9637a;
        return mVar.a(new s.b((ParcelFileDescriptor) obj, mVar.f9613d, mVar.f9612c), i, i10, hVar, m.f9608k);
    }
}
