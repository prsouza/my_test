package androidx.fragment.app;

import a.a;
import android.animation.Animator;
import android.util.Log;
import androidx.fragment.app.r0;
import j0.b;

public final class f implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Animator f1883a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r0.e f1884b;

    public f(Animator animator, r0.e eVar) {
        this.f1883a = animator;
        this.f1884b = eVar;
    }

    public final void onCancel() {
        this.f1883a.end();
        if (a0.K(2)) {
            StringBuilder d10 = a.d("Animator from operation ");
            d10.append(this.f1884b);
            d10.append(" has been canceled.");
            Log.v("FragmentManager", d10.toString());
        }
    }
}
