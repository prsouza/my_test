package pb;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MapStyleOptions;
import e6.e;
import ge.g;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import jc.b;
import pb.j;
import pd.d;
import pd.f;

public final /* synthetic */ class i implements OnMapReadyCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j f9843a;

    public /* synthetic */ i(j jVar) {
        this.f9843a = jVar;
    }

    public final void onMapReady(GoogleMap googleMap) {
        j jVar = this.f9843a;
        j.a aVar = j.F;
        e.D(jVar, "this$0");
        e.D(googleMap, "googleMap");
        HomeViewModelV2 homeViewModelV2 = jVar.f9845b;
        if (homeViewModelV2 != null) {
            g.b(b.y(homeViewModelV2), (f) null, new k(jVar, (d<? super k>) null), 3);
        }
        Context context = jVar.getContext();
        if (context != null) {
            googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(context, R.raw.map_style));
        }
        googleMap.getUiSettings().setAllGesturesEnabled(false);
        googleMap.getUiSettings().setMapToolbarEnabled(false);
        googleMap.getUiSettings().setMyLocationButtonEnabled(false);
        jVar.f9850v = googleMap;
    }
}
