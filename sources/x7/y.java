package x7;

import android.util.Log;
import java.util.concurrent.Callable;

public final class y implements Callable<Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f13004a;

    public y(x xVar) {
        this.f13004a = xVar;
    }

    public final Object call() throws Exception {
        q qVar = this.f13004a.g;
        boolean z = false;
        boolean z10 = true;
        if (!qVar.f12961c.b().exists()) {
            String f10 = qVar.f();
            if (f10 != null && qVar.f12966j.c(f10)) {
                z = true;
            }
            z10 = z;
        } else {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Found previous crash marker.", (Throwable) null);
            }
            qVar.f12961c.b().delete();
        }
        return Boolean.valueOf(z10);
    }
}
