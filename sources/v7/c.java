package v7;

import android.os.Bundle;
import android.util.Log;
import c3.k;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import l6.a2;

public final class c implements b, a {

    /* renamed from: a  reason: collision with root package name */
    public final a2 f12334a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12335b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public CountDownLatch f12336c;

    public c(a2 a2Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f12334a = a2Var;
    }

    public final void a(String str, Bundle bundle) {
        CountDownLatch countDownLatch = this.f12336c;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }

    public final void c(Bundle bundle) {
        synchronized (this.f12335b) {
            k kVar = k.E;
            kVar.b1("Logging event " + "_ae" + " to Firebase Analytics with params " + bundle);
            this.f12336c = new CountDownLatch(1);
            this.f12334a.c(bundle);
            kVar.b1("Awaiting app exception callback from Analytics...");
            try {
                if (this.f12336c.await((long) 500, TimeUnit.MILLISECONDS)) {
                    kVar.b1("App exception callback received from Analytics listener.");
                } else {
                    kVar.d1("Timeout exceeded while awaiting app exception callback from Analytics listener.", (Throwable) null);
                }
            } catch (InterruptedException unused) {
                Log.e("FirebaseCrashlytics", "Interrupted while awaiting app exception callback from Analytics listener.", (Throwable) null);
            }
            this.f12336c = null;
        }
    }
}
