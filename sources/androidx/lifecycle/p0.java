package androidx.lifecycle;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.r;

public final class p0 extends l {
    public final /* synthetic */ o0 this$0;

    public class a extends l {
        public a() {
        }

        public void onActivityPostResumed(Activity activity) {
            p0.this.this$0.a();
        }

        public void onActivityPostStarted(Activity activity) {
            p0.this.this$0.b();
        }
    }

    public p0(o0 o0Var) {
        this.this$0 = o0Var;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = q0.f2161b;
            ((q0) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).f2162a = this.this$0.f2158w;
        }
    }

    public void onActivityPaused(Activity activity) {
        o0 o0Var = this.this$0;
        int i = o0Var.f2152b - 1;
        o0Var.f2152b = i;
        if (i == 0) {
            o0Var.f2155t.postDelayed(o0Var.f2157v, 700);
        }
    }

    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new a());
    }

    public void onActivityStopped(Activity activity) {
        o0 o0Var = this.this$0;
        int i = o0Var.f2151a - 1;
        o0Var.f2151a = i;
        if (i == 0 && o0Var.f2153c) {
            o0Var.f2156u.f(r.b.ON_STOP);
            o0Var.f2154s = true;
        }
    }
}
