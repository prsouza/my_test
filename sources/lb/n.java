package lb;

import ad.c;
import android.view.View;
import e6.e;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.Objects;
import lb.o;
import za.d;

public final /* synthetic */ class n implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o f8210a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ o.a f8211b;

    public /* synthetic */ n(o oVar, o.a aVar) {
        this.f8210a = oVar;
        this.f8211b = aVar;
    }

    public final void onClick(View view) {
        o oVar = this.f8210a;
        o.a aVar = this.f8211b;
        e.D(oVar, "this$0");
        e.D(aVar, "this$1");
        int i = oVar.f8213e;
        Object tag = aVar.f2311a.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
        oVar.f8213e = ((Integer) tag).intValue();
        oVar.e(i);
        oVar.e(oVar.f8213e);
        OptionsViewModel optionsViewModel = oVar.f8214f;
        if (optionsViewModel != null) {
            c.r0(optionsViewModel.f6806s, bb.e.values()[oVar.f8213e]);
            d.f14195a.a(optionsViewModel.f6806s);
        }
    }
}
