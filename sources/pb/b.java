package pb;

import ab.f;
import ab.i;
import ab.j;
import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import de.h;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import java.util.Map;
import pb.c;
import pd.d;
import sb.q;
import tb.k;
import ya.f;
import ya.g;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9818a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f9819b;

    public /* synthetic */ b(Fragment fragment, int i) {
        this.f9818a = i;
        this.f9819b = fragment;
    }

    public final void onClick(View view) {
        i iVar;
        switch (this.f9818a) {
            case 0:
                c cVar = (c) this.f9819b;
                c.a aVar = c.f9820c;
                e.D(cVar, "this$0");
                HomeViewModelV2 homeViewModelV2 = cVar.f9822a;
                if (homeViewModelV2 != null) {
                    f fVar = f.f215a;
                    int i = HomeViewModelV2.b.f6772a[f.f232t.ordinal()];
                    if (i == 1) {
                        homeViewModelV2.f6766t.b(new f.a(g.LOCATION_PERMISSION_REQUEST, (Map<String, ? extends Object>) null));
                        iVar = new i();
                        iVar.f272a = homeViewModelV2.f6765s.getString(R.string.locPermissionTitle);
                        iVar.f273b = homeViewModelV2.f6765s.getString(R.string.locPermissionRationale);
                        iVar.f274c = homeViewModelV2.f6765s.getString(R.string.locPermissionBtn);
                        iVar.a(j.LOCATION_PERMISSION);
                        iVar.f277f = Integer.valueOf(R.drawable.img_location_permission);
                        iVar.i = Integer.valueOf(R.layout.notice_call_action);
                    } else if (i == 2) {
                        homeViewModelV2.f6766t.b(new f.a(g.BLE_PERMISSION_REQUEST, (Map<String, ? extends Object>) null));
                        iVar = new i();
                        iVar.f272a = homeViewModelV2.f6765s.getString(R.string.blePermissionTitle);
                        iVar.f273b = homeViewModelV2.f6765s.getString(R.string.blePermissionRationale);
                        iVar.f274c = homeViewModelV2.f6765s.getString(R.string.blePermissionBtn);
                        iVar.a(j.BLUETOOTH_PERMISSION);
                        iVar.f277f = Integer.valueOf(R.drawable.img_ble_permission);
                        iVar.i = Integer.valueOf(R.layout.notice_call_action);
                    } else if (i == 3) {
                        homeViewModelV2.f6766t.b(new f.a(g.LOCATION_ENABLE_REQUEST, (Map<String, ? extends Object>) null));
                        iVar = new i();
                        iVar.f272a = homeViewModelV2.f6765s.getString(R.string.locationSheetTitle);
                        iVar.f273b = homeViewModelV2.f6765s.getString(R.string.locationSheetText);
                        iVar.f274c = homeViewModelV2.f6765s.getString(R.string.locationSheetAction);
                        iVar.a(j.ENABLE_LOCATION);
                        iVar.f277f = Integer.valueOf(R.drawable.img_location_permission);
                        iVar.i = Integer.valueOf(R.layout.notice_call_action);
                    } else if (i == 4) {
                        homeViewModelV2.f6766t.b(new f.a(g.BLE_ENABLE_REQUEST, (Map<String, ? extends Object>) null));
                        iVar = new i();
                        iVar.f272a = homeViewModelV2.f6765s.getString(R.string.bleSheetTitle);
                        iVar.f273b = homeViewModelV2.f6765s.getString(R.string.bleSheetText);
                        iVar.f274c = homeViewModelV2.f6765s.getString(R.string.bleSheetAction);
                        iVar.a(j.ENABLE_BLUETOOTH);
                        iVar.f277f = Integer.valueOf(R.drawable.img_ble_permission);
                        iVar.i = Integer.valueOf(R.layout.notice_call_action);
                    } else if (i == 5) {
                        iVar = null;
                    } else {
                        throw new md.e();
                    }
                    ge.g.b(jc.b.y(homeViewModelV2), (pd.f) null, new k(iVar, (d<? super k>) null), 3);
                    return;
                }
                return;
            default:
                q qVar = (q) this.f9819b;
                h<Object>[] hVarArr = q.f11092w;
                e.D(qVar, "this$0");
                ImageButton imageButton = qVar.c().f12447y.f12427a;
                e.C(imageButton, "binding.toolbar.backButton");
                ub.f.a(imageButton);
                TransactViewModel transactViewModel = qVar.f11093t;
                if (transactViewModel != null) {
                    transactViewModel.k();
                    r activity = qVar.getActivity();
                    if (activity != null) {
                        activity.onBackPressed();
                        return;
                    }
                    return;
                }
                e.c0("viewModel");
                throw null;
        }
    }
}
