package p6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public final class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f9693a;

    public /* synthetic */ b(c cVar) {
        this.f9693a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f9693a.a(intent);
    }
}
