package d9;

import a.a;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import c3.k;
import java.util.Locale;

public final class h extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f4397a;

    public h(g gVar) {
        this.f4397a = gVar;
    }

    public final void onReceive(Context context, Intent intent) {
        StringBuilder d10 = a.d("Locale changed: ");
        d10.append(Locale.getDefault());
        k.E0(d10.toString());
        this.f4397a.b();
        this.f4397a.c((k) null);
    }
}
