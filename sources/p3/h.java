package p3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import g3.j;
import i3.w;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class h implements j<ByteBuffer, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final d f9591a = new d();

    public final /* bridge */ /* synthetic */ boolean a(Object obj, g3.h hVar) throws IOException {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        return true;
    }

    public final w b(Object obj, int i, int i10, g3.h hVar) throws IOException {
        return this.f9591a.b(ImageDecoder.createSource((ByteBuffer) obj), i, i10, hVar);
    }
}
