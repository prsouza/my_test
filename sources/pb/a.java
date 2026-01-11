package pb;

import ab.f;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import de.h;
import e6.e;
import ge.g;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import jc.b;
import pb.c;
import pd.d;
import sb.q;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9816a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f9817b;

    public /* synthetic */ a(Fragment fragment, int i) {
        this.f9816a = i;
        this.f9817b = fragment;
    }

    public final void onClick(View view) {
        HomeViewModelV2 homeViewModelV2;
        switch (this.f9816a) {
            case 0:
                c cVar = (c) this.f9817b;
                c.a aVar = c.f9820c;
                e.D(cVar, "this$0");
                f fVar = f.f215a;
                if (c.b.f9824a[f.f228p.ordinal()] == 1 && (homeViewModelV2 = cVar.f9822a) != null) {
                    g.b(b.y(homeViewModelV2), (pd.f) null, new e(cVar, (d<? super e>) null), 3);
                    return;
                }
                return;
            default:
                q qVar = (q) this.f9817b;
                h<Object>[] hVarArr = q.f11092w;
                e.D(qVar, "this$0");
                r activity = qVar.getActivity();
                if (activity != null) {
                    activity.finish();
                    return;
                }
                return;
        }
    }
}
