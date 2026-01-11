package hb;

import android.util.Log;
import androidx.fragment.app.a;
import com.google.android.material.tabs.TabLayout;
import e6.e;
import io.nodle.cash.R;
import io.nodle.cash.ui.view.activity.EstimateActivity;
import ob.h;

public final class b implements TabLayout.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EstimateActivity f5910a;

    public b(EstimateActivity estimateActivity) {
        this.f5910a = estimateActivity;
    }

    public final void a(TabLayout.f fVar) {
        if (fVar != null) {
            c(fVar);
        }
    }

    public final void b() {
    }

    public final void c(TabLayout.f fVar) {
        e.D(fVar, "tab");
        int i = fVar.f4041d;
        if (i == 0) {
            EstimateActivity estimateActivity = this.f5910a;
            Log.d(estimateActivity.f6706v, "load Simulator fragment");
            h hVar = estimateActivity.f6708x;
            if (hVar != null) {
                a aVar = new a(estimateActivity.getSupportFragmentManager());
                aVar.n(hVar);
                aVar.d();
            } else {
                estimateActivity.f6708x = new h();
                a aVar2 = new a(estimateActivity.getSupportFragmentManager());
                h hVar2 = estimateActivity.f6708x;
                e.B(hVar2);
                aVar2.e(R.id.estimateContainer, hVar2, (String) null, 1);
                aVar2.d();
            }
            ob.a aVar3 = estimateActivity.f6709y;
            if (aVar3 != null) {
                a aVar4 = new a(estimateActivity.getSupportFragmentManager());
                aVar4.l(aVar3);
                aVar4.d();
            }
        } else if (i == 1) {
            EstimateActivity estimateActivity2 = this.f5910a;
            Log.d(estimateActivity2.f6706v, "load Current fragment");
            ob.a aVar5 = estimateActivity2.f6709y;
            if (aVar5 != null) {
                a aVar6 = new a(estimateActivity2.getSupportFragmentManager());
                aVar6.n(aVar5);
                aVar6.d();
            } else {
                estimateActivity2.f6709y = new ob.a();
                a aVar7 = new a(estimateActivity2.getSupportFragmentManager());
                ob.a aVar8 = estimateActivity2.f6709y;
                e.B(aVar8);
                aVar7.e(R.id.estimateContainer, aVar8, (String) null, 1);
                aVar7.d();
            }
            h hVar3 = estimateActivity2.f6708x;
            if (hVar3 != null) {
                a aVar9 = new a(estimateActivity2.getSupportFragmentManager());
                aVar9.l(hVar3);
                aVar9.d();
            }
        }
    }
}
