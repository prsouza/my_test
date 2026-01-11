package androidx.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import java.util.concurrent.atomic.AtomicBoolean;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static AtomicBoolean f2206a = new AtomicBoolean(false);

    public static class a extends l {
        public void onActivityCreated(Activity activity, Bundle bundle) {
            q0.c(activity);
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }
}
