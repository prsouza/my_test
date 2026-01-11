package l6;

import android.os.Bundle;
import android.os.RemoteException;
import o6.f;
import o6.f0;
import t6.m;

public final class g extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7856b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f7857c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r f7858s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(r rVar, m mVar, int i, m mVar2) {
        super(mVar);
        this.f7858s = rVar;
        this.f7856b = i;
        this.f7857c = mVar2;
    }

    public final void a() {
        try {
            r rVar = this.f7858s;
            String str = rVar.f8001a;
            int i = this.f7856b;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            ((f0) rVar.f8004d.f9344n).a(str, bundle, r.g(), new q(this.f7858s, this.f7857c));
        } catch (RemoteException e10) {
            r.g.d(e10, "notifySessionFailed", new Object[0]);
        }
    }
}
