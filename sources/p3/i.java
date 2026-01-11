package p3;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import g3.f;
import j3.c;
import java.security.MessageDigest;

public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9592b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(f.f5231a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f9592b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i, int i10) {
        float f10;
        float f11;
        Paint paint = z.f9650a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        if (bitmap.getWidth() * i10 > bitmap.getHeight() * i) {
            f11 = ((float) i10) / ((float) bitmap.getHeight());
            f12 = (((float) i) - (((float) bitmap.getWidth()) * f11)) * 0.5f;
            f10 = 0.0f;
        } else {
            f11 = ((float) i) / ((float) bitmap.getWidth());
            f10 = (((float) i10) - (((float) bitmap.getHeight()) * f11)) * 0.5f;
        }
        matrix.setScale(f11, f11);
        matrix.postTranslate((float) ((int) (f12 + 0.5f)), (float) ((int) (f10 + 0.5f)));
        Bitmap d10 = cVar.d(i, i10, z.c(bitmap));
        d10.setHasAlpha(bitmap.hasAlpha());
        z.a(bitmap, d10, matrix);
        return d10;
    }

    public final boolean equals(Object obj) {
        return obj instanceof i;
    }

    public final int hashCode() {
        return -599754482;
    }
}
