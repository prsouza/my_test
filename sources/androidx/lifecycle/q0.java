package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.r;

public final class q0 extends Fragment {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f2161b = 0;

    /* renamed from: a  reason: collision with root package name */
    public a f2162a;

    public interface a {
    }

    public static class b implements Application.ActivityLifecycleCallbacks {
        public static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            q0.a(activity, r.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            q0.a(activity, r.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            q0.a(activity, r.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            q0.a(activity, r.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            q0.a(activity, r.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            q0.a(activity, r.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    public static void a(Activity activity, r.b bVar) {
        if (activity instanceof c0) {
            ((c0) activity).getLifecycle().f(bVar);
        } else if (activity instanceof a0) {
            r lifecycle = ((a0) activity).getLifecycle();
            if (lifecycle instanceof b0) {
                ((b0) lifecycle).f(bVar);
            }
        }
    }

    public static void c(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new q0(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public final void b(r.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        b(r.b.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        b(r.b.ON_DESTROY);
        this.f2162a = null;
    }

    public final void onPause() {
        super.onPause();
        b(r.b.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        a aVar = this.f2162a;
        if (aVar != null) {
            o0.this.a();
        }
        b(r.b.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        a aVar = this.f2162a;
        if (aVar != null) {
            o0.this.b();
        }
        b(r.b.ON_START);
    }

    public final void onStop() {
        super.onStop();
        b(r.b.ON_STOP);
    }
}
