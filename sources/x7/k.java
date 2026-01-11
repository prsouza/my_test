package x7;

import android.util.Log;
import e8.i;
import java.util.concurrent.TimeoutException;
import x7.c0;

public final class k implements c0.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ q f12933a;

    public k(q qVar) {
        this.f12933a = qVar;
    }

    public final void a(i iVar, Thread thread, Throwable th2) {
        q qVar = this.f12933a;
        synchronized (qVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
            try {
                o0.a(qVar.f12963e.c(new m(qVar, System.currentTimeMillis(), th2, thread, iVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", (Throwable) null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
