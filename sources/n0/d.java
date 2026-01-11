package n0;

import a.a;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Objects;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Object f8792a;

    public d(Object obj) {
        this.f8792a = obj;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f8792a).getSafeInsetBottom();
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f8792a).getSafeInsetLeft();
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f8792a).getSafeInsetRight();
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.f8792a).getSafeInsetTop();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f8792a, ((d) obj).f8792a);
    }

    public final int hashCode() {
        Object obj = this.f8792a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder d10 = a.d("DisplayCutoutCompat{");
        d10.append(this.f8792a);
        d10.append("}");
        return d10.toString();
    }
}
