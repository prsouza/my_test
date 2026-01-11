package p1;

import android.view.View;
import android.view.WindowId;

public final class b0 implements c0 {

    /* renamed from: a  reason: collision with root package name */
    public final WindowId f9510a;

    public b0(View view) {
        this.f9510a = view.getWindowId();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).f9510a.equals(this.f9510a);
    }

    public final int hashCode() {
        return this.f9510a.hashCode();
    }
}
