package p3;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import i3.w;
import java.io.IOException;
import o3.a;

public final class d extends a<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public final j3.d f9587b = new j3.d();

    public final w<Bitmap> c(ImageDecoder.Source source, int i, int i10, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder d10 = a.a.d("Decoded [");
            d10.append(decodeBitmap.getWidth());
            d10.append("x");
            d10.append(decodeBitmap.getHeight());
            d10.append("] for [");
            d10.append(i);
            d10.append("x");
            d10.append(i10);
            d10.append("]");
            Log.v("BitmapImageDecoder", d10.toString());
        }
        return new e(decodeBitmap, this.f9587b);
    }
}
