package c0;

import android.util.Log;
import java.lang.reflect.Method;

public final class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f3070a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3071b;

    public e(Object obj, Object obj2) {
        this.f3070a = obj;
        this.f3071b = obj2;
    }

    public final void run() {
        try {
            Method method = d.f3057d;
            if (method != null) {
                method.invoke(this.f3070a, new Object[]{this.f3071b, Boolean.FALSE, "AppCompat recreation"});
                return;
            }
            d.f3058e.invoke(this.f3070a, new Object[]{this.f3071b, Boolean.FALSE});
        } catch (RuntimeException e10) {
            if (e10.getClass() == RuntimeException.class && e10.getMessage() != null && e10.getMessage().startsWith("Unable to stop")) {
                throw e10;
            }
        } catch (Throwable th2) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
        }
    }
}
