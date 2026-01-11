package l6;

import android.os.RemoteException;
import o6.f;
import o6.f0;
import t6.m;

public final class i extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f7893b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f7894c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(r rVar, m mVar, m mVar2) {
        super(mVar);
        this.f7894c = rVar;
        this.f7893b = mVar2;
    }

    public final void a() {
        try {
            r rVar = this.f7894c;
            ((f0) rVar.f8005e.f9344n).c(rVar.f8001a, r.g(), new n(this.f7894c, this.f7893b));
        } catch (RemoteException e10) {
            r.g.d(e10, "keepAlive", new Object[0]);
        }
    }
}
