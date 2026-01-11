package x7;

import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public final class g0 extends c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f12920a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ExecutorService f12921b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ long f12922c = 2;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ TimeUnit f12923s;

    public g0(String str, ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f12920a = str;
        this.f12921b = executorService;
        this.f12923s = timeUnit;
    }

    public final void a() {
        boolean z = false;
        try {
            String str = "Executing shutdown hook for " + this.f12920a;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, (Throwable) null);
            }
            this.f12921b.shutdown();
            if (!this.f12921b.awaitTermination(this.f12922c, this.f12923s)) {
                String str2 = this.f12920a + " did not shut down in the allocated time. Requesting immediate shutdown.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str2, (Throwable) null);
                }
                this.f12921b.shutdownNow();
            }
        } catch (InterruptedException unused) {
            String format = String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", new Object[]{this.f12920a});
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                z = true;
            }
            if (z) {
                Log.d("FirebaseCrashlytics", format, (Throwable) null);
            }
            this.f12921b.shutdownNow();
        }
    }
}
