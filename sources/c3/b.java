package c3;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

public final class b implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a  reason: collision with root package name */
    public e f3121a;

    public b(e eVar) {
        this.f3121a = eVar;
        eVar.A = true;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        e eVar = this.f3121a;
        if (eVar == null) {
            Log.e("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            eVar.k(new i(eVar, System.currentTimeMillis()));
        }
    }

    public final void onActivityResumed(Activity activity) {
        e eVar = this.f3121a;
        if (eVar == null) {
            Log.e("com.amplitude.api.AmplitudeCallbacks", "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            eVar.k(new j(eVar, System.currentTimeMillis()));
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
