package i5;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;
import n0.a0;
import n0.x;
import o0.d;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f6184a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f6184a = swipeDismissBehavior;
    }

    public final boolean a(View view) {
        boolean z = false;
        if (!this.f6184a.s(view)) {
            return false;
        }
        WeakHashMap<View, a0> weakHashMap = x.f8842a;
        boolean z10 = x.e.d(view) == 1;
        int i = this.f6184a.f3662c;
        if ((i == 0 && z10) || (i == 1 && !z10)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f6184a);
        return true;
    }
}
