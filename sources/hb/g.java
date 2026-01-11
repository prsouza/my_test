package hb;

import android.util.Log;
import e6.e;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import t6.a;
import t6.q;

public final /* synthetic */ class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivityV2 f5919a;

    public /* synthetic */ g(HomeActivityV2 homeActivityV2) {
        this.f5919a = homeActivityV2;
    }

    public final void a(q qVar) {
        boolean z;
        HomeActivityV2 homeActivityV2 = this.f5919a;
        int i = HomeActivityV2.H;
        e.D(homeActivityV2, "this$0");
        e.D(qVar, "task");
        String str = homeActivityV2.f6710y;
        synchronized (qVar.f11422a) {
            z = qVar.f11424c;
        }
        Log.d(str, "showAppReview : " + z);
    }
}
