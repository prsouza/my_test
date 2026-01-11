package o6;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

public final class m extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ IBinder f9328b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ o f9329c;

    public m(o oVar, IBinder iBinder) {
        this.f9329c = oVar;
        this.f9328b = iBinder;
    }

    public final void a() {
        p pVar = this.f9329c.f9331a;
        pVar.f9344n = (IInterface) pVar.i.zza(this.f9328b);
        p pVar2 = this.f9329c.f9331a;
        pVar2.f9334b.e("linkToDeath", new Object[0]);
        try {
            pVar2.f9344n.asBinder().linkToDeath(pVar2.f9341k, 0);
        } catch (RemoteException e10) {
            pVar2.f9334b.d(e10, "linkToDeath failed", new Object[0]);
        }
        p pVar3 = this.f9329c.f9331a;
        pVar3.g = false;
        Iterator it = pVar3.f9336d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f9329c.f9331a.f9336d.clear();
    }
}
