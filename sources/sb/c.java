package sb;

import android.view.View;
import android.widget.ImageButton;
import androidx.fragment.app.r;
import de.h;
import e6.e;
import io.nodle.cash.ui.viewmodel.TransactViewModel;
import ub.f;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e f11048a;

    public /* synthetic */ c(e eVar) {
        this.f11048a = eVar;
    }

    public final void onClick(View view) {
        e eVar = this.f11048a;
        h<Object>[] hVarArr = e.f11050w;
        e.D(eVar, "this$0");
        TransactViewModel transactViewModel = eVar.f11051t;
        if (transactViewModel != null) {
            transactViewModel.B.f11037b = null;
            ImageButton imageButton = eVar.c().f12425t.f12427a;
            e.C(imageButton, "binding.toolbar.backButton");
            f.a(imageButton);
            TransactViewModel transactViewModel2 = eVar.f11051t;
            if (transactViewModel2 != null) {
                transactViewModel2.k();
                r activity = eVar.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                    return;
                }
                return;
            }
            e.c0("viewModel");
            throw null;
        }
        e.c0("viewModel");
        throw null;
    }
}
