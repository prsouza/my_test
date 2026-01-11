package rb;

import android.view.View;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import rb.g;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f10649a;

    public /* synthetic */ e(g gVar) {
        this.f10649a = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.f10649a;
        g.a aVar = g.f10651s;
        e6.e.D(gVar, "this$0");
        OptionsViewModel optionsViewModel = gVar.f10653a;
        if (optionsViewModel != null) {
            String string = optionsViewModel.f6806s.getString(R.string.settingsEULA);
            e6.e.C(string, "app.getString(R.string.settingsEULA)");
            optionsViewModel.l((String) null, string);
            return;
        }
        e6.e.c0("viewModel");
        throw null;
    }
}
