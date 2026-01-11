package kb;

import android.content.Context;
import e.b;
import io.nodle.cash.ui.view.activity.transact.HistoryActivityV2;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ b f7489a;

    public a(b bVar) {
        this.f7489a = bVar;
    }

    public final void a(Context context) {
        b bVar = this.f7489a;
        if (!bVar.f7492x) {
            bVar.f7492x = true;
            HistoryActivityV2 historyActivityV2 = (HistoryActivityV2) bVar;
            ((e) bVar.a()).f();
        }
    }
}
