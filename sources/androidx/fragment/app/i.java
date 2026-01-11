package androidx.fragment.app;

import androidx.fragment.app.r0;
import s.a;

public final class i implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r0.e f1915a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r0.e f1916b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f1917c;

    public i(r0.e eVar, r0.e eVar2, boolean z, a aVar) {
        this.f1915a = eVar;
        this.f1916b = eVar2;
        this.f1917c = z;
    }

    public final void run() {
        Fragment fragment = this.f1915a.f1995c;
        Fragment fragment2 = this.f1916b.f1995c;
        boolean z = this.f1917c;
        k0 k0Var = j0.f1942a;
        if (z) {
            fragment2.getEnterTransitionCallback();
        } else {
            fragment.getEnterTransitionCallback();
        }
    }
}
