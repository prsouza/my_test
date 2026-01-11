package l6;

import android.os.Bundle;
import android.os.RemoteException;
import java.util.List;
import o6.g0;
import t6.m;

public class j extends g0 {

    /* renamed from: a  reason: collision with root package name */
    public final m f7902a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ r f7903b;

    public j(r rVar, m mVar) {
        this.f7903b = rVar;
        this.f7902a = mVar;
    }

    public void b(Bundle bundle, Bundle bundle2) throws RemoteException {
        this.f7903b.f8004d.c(this.f7902a);
        r.g.e("onGetChunkFileDescriptor", new Object[0]);
    }

    public void d(List list) {
        this.f7903b.f8004d.c(this.f7902a);
        r.g.e("onGetSessionStates", new Object[0]);
    }

    public void i(Bundle bundle, Bundle bundle2) {
        this.f7903b.f8005e.c(this.f7902a);
        r.g.e("onKeepAlive(%b)", Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    public void zzd(Bundle bundle) {
        this.f7903b.f8004d.c(this.f7902a);
        int i = bundle.getInt("error_code");
        r.g.c("onError(%d)", Integer.valueOf(i));
        this.f7902a.a(new a(i));
    }
}
