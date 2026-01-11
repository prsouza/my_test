package q6;

import android.os.Bundle;
import android.os.RemoteException;
import n6.b;
import o6.c;
import o6.f;
import t6.m;

public final class e extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m f10316b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ g f10317c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(g gVar, m mVar, m mVar2) {
        super(mVar);
        this.f10317c = gVar;
        this.f10316b = mVar2;
    }

    public final void a() {
        try {
            g gVar = this.f10317c;
            String str = gVar.f10323b;
            Bundle a10 = b.a();
            g gVar2 = this.f10317c;
            m mVar = this.f10316b;
            String str2 = gVar2.f10323b;
            ((c) gVar.f10322a.f9344n).j(str, a10, new f(gVar2, mVar));
        } catch (RemoteException e10) {
            g.f10321c.d(e10, "error requesting in-app review for %s", this.f10317c.f10323b);
            this.f10316b.a(new RuntimeException(e10));
        }
    }
}
