package o6;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

public final /* synthetic */ class g implements IBinder.DeathRecipient {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9322a;

    public /* synthetic */ g(p pVar) {
        this.f9322a = pVar;
    }

    public final void binderDied() {
        p pVar = this.f9322a;
        pVar.f9334b.e("reportBinderDeath", new Object[0]);
        k kVar = (k) pVar.f9340j.get();
        if (kVar != null) {
            pVar.f9334b.e("calling onBinderDied", new Object[0]);
            kVar.zza();
        } else {
            pVar.f9334b.e("%s : Binder has died.", pVar.f9335c);
            Iterator it = pVar.f9336d.iterator();
            while (it.hasNext()) {
                ((f) it.next()).b(new RemoteException(String.valueOf(pVar.f9335c).concat(" : Binder has died.")));
            }
            pVar.f9336d.clear();
        }
        pVar.d();
    }
}
