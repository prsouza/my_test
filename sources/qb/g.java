package qb;

import android.view.View;
import android.widget.LinearLayout;
import e6.e;
import qb.k;

public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f10358a;

    public /* synthetic */ g(k kVar) {
        this.f10358a = kVar;
    }

    public final void onClick(View view) {
        k kVar = this.f10358a;
        k.a aVar = k.f10366y;
        e.D(kVar, "this$0");
        LinearLayout linearLayout = kVar.d().f12430c;
        e.C(linearLayout, "binding.bubbleLayout");
        if (linearLayout.getVisibility() == 0) {
            kVar.c();
        }
    }
}
