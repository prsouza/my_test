package ob;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.r;
import de.h;
import e6.e;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import sb.n;

public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9398a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Fragment f9399b;

    public /* synthetic */ b(Fragment fragment, int i) {
        this.f9398a = i;
        this.f9399b = fragment;
    }

    public final void onClick(View view) {
        switch (this.f9398a) {
            case 0:
                h hVar = (h) this.f9399b;
                int i = h.f9409s;
                e.D(hVar, "this$0");
                hVar.c();
                return;
            default:
                n nVar = (n) this.f9399b;
                h<Object>[] hVarArr = n.f11085w;
                e.D(nVar, "this$0");
                TransactViewModel transactViewModel = nVar.f11086t;
                if (transactViewModel != null) {
                    transactViewModel.k();
                    r activity = nVar.getActivity();
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
