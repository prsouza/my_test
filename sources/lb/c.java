package lb;

import android.util.Log;
import android.view.View;
import e6.e;
import java.math.BigInteger;
import sa.b;

public final /* synthetic */ class c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f8166a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8167b;

    public /* synthetic */ c(d dVar, b bVar) {
        this.f8166a = dVar;
        this.f8167b = bVar;
    }

    public final void onClick(View view) {
        d dVar = this.f8166a;
        b bVar = this.f8167b;
        e.D(dVar, "this$0");
        e.D(bVar, "$trans");
        String str = dVar.f8170f;
        BigInteger bigInteger = bVar.f11038c;
        Log.d(str, "Reward:" + bigInteger);
        dVar.i(bVar);
    }
}
