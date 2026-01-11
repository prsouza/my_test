package kb;

import android.content.Context;
import e.b;
import io.nodle.cash.ui.view.activity.transact.TransactActivity;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f7493a;

    public c(d dVar) {
        this.f7493a = dVar;
    }

    public final void a(Context context) {
        d dVar = this.f7493a;
        if (!dVar.f7496x) {
            dVar.f7496x = true;
            TransactActivity transactActivity = (TransactActivity) dVar;
            ((f) dVar.a()).c();
        }
    }
}
