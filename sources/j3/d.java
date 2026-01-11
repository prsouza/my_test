package j3;

import android.graphics.Bitmap;

public class d implements c {
    public final void a(int i) {
    }

    public final void b() {
    }

    public final Bitmap c(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    public final Bitmap d(int i, int i10, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i10, config);
    }

    public void e(Bitmap bitmap) {
        bitmap.recycle();
    }
}
