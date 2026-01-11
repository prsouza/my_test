package x8;

import ab.i;
import ah.v;
import android.location.Location;
import android.util.Log;
import androidx.fragment.app.a0;
import androidx.lifecycle.k0;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e6.e;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryTracer;
import java.math.BigInteger;
import java.util.concurrent.ScheduledFuture;
import pb.j;
import pb.o;
import za.d;

public final /* synthetic */ class q0 implements OnCompleteListener, k0, OnSuccessListener, ScopeCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13116a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f13117b;

    public /* synthetic */ q0(Object obj, int i) {
        this.f13116a = i;
        this.f13117b = obj;
    }

    public final void d(Object obj) {
        switch (this.f13116a) {
            case 1:
                HomeActivityV2 homeActivityV2 = (HomeActivityV2) this.f13117b;
                if (((i) obj) != null) {
                    o.a aVar = o.f9867c;
                    o oVar = new o();
                    homeActivityV2.A = oVar;
                    a0 supportFragmentManager = homeActivityV2.getSupportFragmentManager();
                    o.a aVar2 = o.f9867c;
                    oVar.show(supportFragmentManager, o.f9868s);
                    return;
                }
                o oVar2 = homeActivityV2.A;
                if (oVar2 != null) {
                    oVar2.dismiss();
                    return;
                }
                return;
            default:
                HomeViewModelV2 homeViewModelV2 = (HomeViewModelV2) this.f13117b;
                Boolean bool = (Boolean) obj;
                String str = homeViewModelV2.f6767u;
                Log.d(str, "onCreate allPermGranted " + bool);
                e.C(bool, "it");
                if (bool.booleanValue()) {
                    d.f14195a.a(homeViewModelV2.f6765s);
                    if (!HomeViewModelV2.i(homeViewModelV2) && Long.parseLong(v.J(homeViewModelV2.f6765s, qa.e.LAUNCH_COUNT)) % ((long) 10) == 0 && new BigInteger(v.J(homeViewModelV2.f6765s, qa.e.NODLE_AMOUNT)).compareTo(BigInteger.ZERO) > 0) {
                        homeViewModelV2.m(HomeViewModelV2.a.SHOW_APP_REVIEW);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public final void onComplete(Task task) {
        ((ScheduledFuture) this.f13117b).cancel(false);
    }

    public final void onSuccess(Object obj) {
        j jVar = (j) this.f13117b;
        Location location = (Location) obj;
        j.a aVar = j.F;
        e.D(jVar, "this$0");
        if (location != null) {
            LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
            GoogleMap googleMap = jVar.f9850v;
            if (googleMap != null) {
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, jVar.f9844a));
            }
        }
    }

    public final void run(Scope scope) {
        ((SentryTracer) this.f13117b).lambda$finish$2(scope);
    }
}
