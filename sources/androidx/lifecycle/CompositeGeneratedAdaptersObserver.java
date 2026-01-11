package androidx.lifecycle;

import androidx.lifecycle.r;
import java.util.HashMap;

class CompositeGeneratedAdaptersObserver implements y {

    /* renamed from: a  reason: collision with root package name */
    public final p[] f2019a;

    public CompositeGeneratedAdaptersObserver(p[] pVarArr) {
        this.f2019a = pVarArr;
    }

    public final void c(a0 a0Var, r.b bVar) {
        new HashMap();
        for (p a10 : this.f2019a) {
            a10.a();
        }
        for (p a11 : this.f2019a) {
            a11.a();
        }
    }
}
