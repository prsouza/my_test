package rb;

import ah.v;
import android.app.Application;
import android.view.View;
import androidx.fragment.app.m;
import e6.e;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import rb.g;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f10650a;

    public /* synthetic */ f(g gVar) {
        this.f10650a = gVar;
    }

    public final void onClick(View view) {
        g gVar = this.f10650a;
        g.a aVar = g.f10651s;
        e.D(gVar, "this$0");
        OptionsViewModel optionsViewModel = gVar.f10653a;
        if (optionsViewModel != null) {
            Application application = optionsViewModel.f6806s;
            qa.e eVar = qa.e.APP_ANALYTICS;
            int parseInt = Integer.parseInt(v.J(application, eVar));
            if (parseInt == 901) {
                v.f0(optionsViewModel.f6806s, eVar, 902);
            } else if (parseInt == 902) {
                v.f0(optionsViewModel.f6806s, eVar, 901);
            }
            m.g("App analytics: ", v.J(optionsViewModel.f6806s, eVar), "OptionsViewModel");
            return;
        }
        e.c0("viewModel");
        throw null;
    }
}
