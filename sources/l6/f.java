package l6;

import android.os.Bundle;
import android.os.RemoteException;
import o6.f0;
import t6.m;

public final class f extends o6.f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7839b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7840c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ m f7841s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7842t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ r f7843u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(r rVar, m mVar, int i, String str, m mVar2, int i10) {
        super(mVar);
        this.f7843u = rVar;
        this.f7839b = i;
        this.f7840c = str;
        this.f7841s = mVar2;
        this.f7842t = i10;
    }

    public final void a() {
        try {
            r rVar = this.f7843u;
            String str = rVar.f8001a;
            int i = this.f7839b;
            String str2 = this.f7840c;
            Bundle bundle = new Bundle();
            bundle.putInt("session_id", i);
            bundle.putString("module_name", str2);
            ((f0) rVar.f8004d.f9344n).f(str, bundle, r.g(), new p(this.f7843u, this.f7841s, this.f7839b, this.f7840c, this.f7842t));
        } catch (RemoteException e10) {
            r.g.d(e10, "notifyModuleCompleted", new Object[0]);
        }
    }
}
