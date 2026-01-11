package lb;

import android.util.Log;
import android.view.View;
import java.math.BigInteger;
import sa.b;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f8180a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f8181b;

    public /* synthetic */ e(d dVar, b bVar) {
        this.f8180a = dVar;
        this.f8181b = bVar;
    }

    public final void onClick(View view) {
        d dVar = this.f8180a;
        b bVar = this.f8181b;
        e6.e.D(dVar, "this$0");
        e6.e.D(bVar, "$trans");
        String str = dVar.f8170f;
        BigInteger bigInteger = bVar.f11038c;
        Log.d(str, "Transfer:" + bigInteger);
        dVar.i(bVar);
    }
}
