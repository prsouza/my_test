package androidx.fragment.app;

import a.a;
import android.util.Log;
import androidx.fragment.app.d;
import androidx.fragment.app.r0;

public final class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d.e f1949a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r0.e f1950b;

    public l(d.e eVar, r0.e eVar2) {
        this.f1949a = eVar;
        this.f1950b = eVar2;
    }

    public final void run() {
        this.f1949a.a();
        if (a0.K(2)) {
            StringBuilder d10 = a.d("Transition for operation ");
            d10.append(this.f1950b);
            d10.append("has completed");
            Log.v("FragmentManager", d10.toString());
        }
    }
}
