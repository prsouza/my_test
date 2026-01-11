package o6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class o implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9331a;

    public /* synthetic */ o(p pVar) {
        this.f9331a = pVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9331a.f9334b.e("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        p pVar = this.f9331a;
        pVar.a().post(new m(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f9331a.f9334b.e("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        p pVar = this.f9331a;
        pVar.a().post(new n(this));
    }
}
