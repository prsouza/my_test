package lb;

import android.view.View;
import e6.e;
import io.nodle.cash.ui.viewmodel.OptionsViewModel;
import java.util.List;
import java.util.Objects;
import lb.m;
import qa.d;

public final /* synthetic */ class l implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ m.a f8199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f8200b;

    public /* synthetic */ l(m.a aVar, m mVar) {
        this.f8199a = aVar;
        this.f8200b = mVar;
    }

    public final void onClick(View view) {
        m.a aVar = this.f8199a;
        m mVar = this.f8200b;
        e.D(aVar, "this$0");
        e.D(mVar, "this$1");
        Object tag = aVar.f2311a.getTag();
        Objects.requireNonNull(tag, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) tag).intValue();
        int i = mVar.g;
        boolean z = false;
        if (i >= 0 && i != intValue) {
            mVar.f8201d.get(i).f10335e = false;
            mVar.e(mVar.g);
            mVar.g = -1;
        }
        List<d> list = mVar.f8201d.get(intValue).f10333c;
        if (list != null && !list.isEmpty()) {
            z = true;
        }
        if (z) {
            mVar.f8201d.get(intValue).f10335e = !mVar.f8201d.get(intValue).f10335e;
            mVar.e(intValue);
            if (mVar.f8201d.get(intValue).f10335e) {
                mVar.g = intValue;
                return;
            }
            return;
        }
        OptionsViewModel optionsViewModel = mVar.f8204h;
        if (optionsViewModel != null) {
            optionsViewModel.l(mVar.f8202e, mVar.f8201d.get(intValue).f10331a);
        }
    }
}
