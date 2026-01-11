package u3;

import android.graphics.Bitmap;
import g3.h;
import i3.w;
import java.io.ByteArrayOutputStream;
import q3.b;

public final class a implements c<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f11679a = Bitmap.CompressFormat.JPEG;

    /* renamed from: b  reason: collision with root package name */
    public final int f11680b = 100;

    public final w<byte[]> b(w<Bitmap> wVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        wVar.get().compress(this.f11679a, this.f11680b, byteArrayOutputStream);
        wVar.d();
        return new b(byteArrayOutputStream.toByteArray());
    }
}
