package r3;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import i3.s;
import i3.w;
import java.util.Objects;
import t3.c;

public abstract class b<T extends Drawable> implements w<T>, s {

    /* renamed from: a  reason: collision with root package name */
    public final T f10563a;

    public b(T t10) {
        Objects.requireNonNull(t10, "Argument must not be null");
        this.f10563a = t10;
    }

    public void a() {
        T t10 = this.f10563a;
        if (t10 instanceof BitmapDrawable) {
            ((BitmapDrawable) t10).getBitmap().prepareToDraw();
        } else if (t10 instanceof c) {
            ((c) t10).b().prepareToDraw();
        }
    }

    public final Object get() {
        Drawable.ConstantState constantState = this.f10563a.getConstantState();
        if (constantState == null) {
            return this.f10563a;
        }
        return constantState.newDrawable();
    }
}
