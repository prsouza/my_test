package lb;

import ah.v;
import android.app.Application;
import android.view.View;
import e6.e;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import lb.b;

public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b.a f8157a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8158b;

    public /* synthetic */ a(b.a aVar, b bVar) {
        this.f8157a = aVar;
        this.f8158b = bVar;
    }

    public final void onClick(View view) {
        OptionsViewModel optionsViewModel;
        b.a aVar = this.f8157a;
        b bVar = this.f8158b;
        e.D(aVar, "this$0");
        e.D(bVar, "this$1");
        Object tag = aVar.f2311a.getTag();
        if (e.r(tag, 0)) {
            OptionsViewModel optionsViewModel2 = bVar.f8160e;
            if (optionsViewModel2 != null) {
                Application application = optionsViewModel2.f6806s;
                qa.e eVar = qa.e.WIFI_ONLY;
                int parseInt = Integer.parseInt(v.J(application, eVar));
                if (parseInt == 1001) {
                    v.f0(optionsViewModel2.f6806s, eVar, 1002);
                } else if (parseInt == 1002) {
                    v.f0(optionsViewModel2.f6806s, eVar, 1001);
                }
                optionsViewModel2.f6807t.j(Boolean.valueOf(optionsViewModel2.k()));
            }
        } else if (e.r(tag, 1)) {
            OptionsViewModel optionsViewModel3 = bVar.f8160e;
            if (optionsViewModel3 != null) {
                optionsViewModel3.i(OptionsViewModel.a.OPTIMIZE_BATTERY);
            }
        } else if (e.r(tag, 2)) {
            OptionsViewModel optionsViewModel4 = bVar.f8160e;
            if (optionsViewModel4 != null) {
                optionsViewModel4.i(OptionsViewModel.a.GOTO_APP_LOCK);
            }
        } else if (e.r(tag, 3) && (optionsViewModel = bVar.f8160e) != null) {
            Application application2 = optionsViewModel.f6806s;
            qa.e eVar2 = qa.e.NOTIFICATION;
            int parseInt2 = Integer.parseInt(v.J(application2, eVar2));
            if (parseInt2 == 201) {
                v.f0(optionsViewModel.f6806s, eVar2, 202);
            } else if (parseInt2 == 202) {
                v.f0(optionsViewModel.f6806s, eVar2, 201);
            }
            optionsViewModel.f6808u.j(Boolean.valueOf(optionsViewModel.j()));
        }
        aVar.f8162u.post(new a1.b(bVar, aVar, 2));
    }
}
