package f5;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

public final class e extends Property<ImageView, Matrix> {

    /* renamed from: a  reason: collision with root package name */
    public final Matrix f4992a = new Matrix();

    public e() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final Object get(Object obj) {
        this.f4992a.set(((ImageView) obj).getImageMatrix());
        return this.f4992a;
    }

    public final void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
