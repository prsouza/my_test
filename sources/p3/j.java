package p3;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import g3.f;
import j3.c;
import java.security.MessageDigest;

public final class j extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9593b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(f.f5231a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f9593b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i, int i10) {
        Paint paint = z.f9650a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i10) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return z.b(cVar, bitmap, i, i10);
        } else if (!Log.isLoggable("TransformationUtils", 2)) {
            return bitmap;
        } else {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
            return bitmap;
        }
    }

    public final boolean equals(Object obj) {
        return obj instanceof j;
    }

    public final int hashCode() {
        return -670243078;
    }
}
