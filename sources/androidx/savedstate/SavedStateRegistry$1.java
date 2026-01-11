package androidx.savedstate;

import androidx.lifecycle.a0;
import androidx.lifecycle.r;
import androidx.lifecycle.y;

class SavedStateRegistry$1 implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f2605a;

    public SavedStateRegistry$1(a aVar) {
        this.f2605a = aVar;
    }

    public final void c(a0 a0Var, r.b bVar) {
        if (bVar == r.b.ON_START) {
            this.f2605a.f2610e = true;
        } else if (bVar == r.b.ON_STOP) {
            this.f2605a.f2610e = false;
        }
    }
}
