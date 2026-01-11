package lb;

import android.view.View;
import e6.e;
import gb.f;
import io.nodle.cash.R;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import rb.g;

public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f8191b;

    public /* synthetic */ i(Object obj, int i) {
        this.f8190a = i;
        this.f8191b = obj;
    }

    public final void onClick(View view) {
        switch (this.f8190a) {
            case 0:
                f fVar = (f) this.f8191b;
                e.D(fVar, "$notifState");
                fVar.g.c();
                return;
            default:
                g gVar = (g) this.f8191b;
                g.a aVar = g.f10651s;
                e.D(gVar, "this$0");
                OptionsViewModel optionsViewModel = gVar.f10653a;
                if (optionsViewModel != null) {
                    String string = optionsViewModel.f6806s.getString(R.string.privacy);
                    e.C(string, "app.getString(R.string.privacy)");
                    optionsViewModel.l((String) null, string);
                    return;
                }
                e.c0("viewModel");
                throw null;
        }
    }
}
