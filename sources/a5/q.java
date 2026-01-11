package a5;

import ad.c;
import android.app.Activity;
import android.util.Log;
import androidx.lifecycle.k0;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.tasks.OnFailureListener;
import e6.e;
import io.nodle.cash.ui.view.activity.HomeActivityV2;

public final /* synthetic */ class q implements OnFailureListener, k0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f111a;

    public /* synthetic */ q(Object obj) {
        this.f111a = obj;
    }

    public final void d(Object obj) {
        HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f111a;
        Boolean bool = (Boolean) obj;
        int i = HomeActivityV2.H;
        e.D(homeActivityV2, "this$0");
        e.C(bool, "it");
        if (bool.booleanValue()) {
            Log.d(homeActivityV2.f6710y, "enableLocation success");
            homeActivityV2.m();
        }
    }

    public final void onFailure(Exception exc) {
        Activity activity = (Activity) this.f111a;
        int i = c.f307d0;
        e.D(activity, "$activity");
        e.D(exc, "it");
        if (exc instanceof ResolvableApiException) {
            try {
                ((ResolvableApiException) exc).startResolutionForResult(activity, 1000);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }
}
