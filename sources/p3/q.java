package p3;

import android.graphics.Bitmap;
import g3.f;
import j3.c;
import java.security.MessageDigest;

public final class q extends f {

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f9618b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(f.f5231a);

    public final void b(MessageDigest messageDigest) {
        messageDigest.update(f9618b);
    }

    public final Bitmap c(c cVar, Bitmap bitmap, int i, int i10) {
        return z.b(cVar, bitmap, i, i10);
    }

    public final boolean equals(Object obj) {
        return obj instanceof q;
    }

    public final int hashCode() {
        return 1572326941;
    }
}
