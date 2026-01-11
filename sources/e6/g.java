package e6;

import android.graphics.RectF;
import java.util.Arrays;

public final class g implements c {

    /* renamed from: a  reason: collision with root package name */
    public final float f4683a;

    public g(float f10) {
        this.f4683a = f10;
    }

    public final float a(RectF rectF) {
        return rectF.height() * this.f4683a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        if (this.f4683a == ((g) obj).f4683a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4683a)});
    }
}
