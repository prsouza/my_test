package w5;

import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.d;

public final class b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f12610a;

    public b(d dVar) {
        this.f12610a = dVar;
    }

    public final boolean onPreDraw() {
        d dVar = this.f12610a;
        float rotation = dVar.f3957r.getRotation();
        if (dVar.f3950k == rotation) {
            return true;
        }
        dVar.f3950k = rotation;
        dVar.s();
        return true;
    }
}
