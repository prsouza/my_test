package p3;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import i3.w;
import j3.c;
import j3.d;
import java.util.concurrent.locks.Lock;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final a f9615a = new a();

    public class a extends d {
        public final void e(Bitmap bitmap) {
        }
    }

    /* JADX INFO: finally extract failed */
    public static w<Bitmap> a(c cVar, Drawable drawable, int i, int i10) {
        Drawable current = drawable.getCurrent();
        boolean z = false;
        Bitmap bitmap = null;
        if (current instanceof BitmapDrawable) {
            bitmap = ((BitmapDrawable) current).getBitmap();
        } else if (!(current instanceof Animatable)) {
            if (i != Integer.MIN_VALUE || current.getIntrinsicWidth() > 0) {
                if (i10 != Integer.MIN_VALUE || current.getIntrinsicHeight() > 0) {
                    if (current.getIntrinsicWidth() > 0) {
                        i = current.getIntrinsicWidth();
                    }
                    if (current.getIntrinsicHeight() > 0) {
                        i10 = current.getIntrinsicHeight();
                    }
                    Lock lock = z.f9652c;
                    lock.lock();
                    Bitmap d10 = cVar.d(i, i10, Bitmap.Config.ARGB_8888);
                    try {
                        Canvas canvas = new Canvas(d10);
                        current.setBounds(0, 0, i, i10);
                        current.draw(canvas);
                        canvas.setBitmap((Bitmap) null);
                        lock.unlock();
                        bitmap = d10;
                    } catch (Throwable th2) {
                        lock.unlock();
                        throw th2;
                    }
                } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                    Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
                }
            } else if (Log.isLoggable("DrawableToBitmap", 5)) {
                Log.w("DrawableToBitmap", "Unable to draw " + current + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            z = true;
        }
        if (!z) {
            cVar = f9615a;
        }
        return e.e(bitmap, cVar);
    }
}
