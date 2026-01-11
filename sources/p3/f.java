package p3;

import android.content.Context;
import android.graphics.Bitmap;
import c4.j;
import com.bumptech.glide.b;
import g3.l;
import i3.w;
import j3.c;

public abstract class f implements l<Bitmap> {
    public final w<Bitmap> a(Context context, w<Bitmap> wVar, int i, int i10) {
        if (j.j(i, i10)) {
            c cVar = b.b(context).f3493a;
            Bitmap bitmap = wVar.get();
            if (i == Integer.MIN_VALUE) {
                i = bitmap.getWidth();
            }
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getHeight();
            }
            Bitmap c10 = c(cVar, bitmap, i, i10);
            return bitmap.equals(c10) ? wVar : e.e(c10, cVar);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap c(c cVar, Bitmap bitmap, int i, int i10);
}
