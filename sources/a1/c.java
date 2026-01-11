package a1;

import android.util.Log;
import e6.e;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f21a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f22b;

    public /* synthetic */ c(String str, m mVar) {
        this.f21a = str;
        this.f22b = mVar;
    }

    public final void run() {
        String str = this.f21a;
        m mVar = this.f22b;
        e.D(mVar, "$violation");
        Log.e("FragmentStrictMode", e.a0("Policy violation with PENALTY_DEATH in ", str), mVar);
        throw mVar;
    }
}
