package l6;

import android.os.RemoteException;
import java.util.Map;
import o6.f;
import o6.f0;
import t6.m;

public final class d extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Map f7810b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f7811c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r f7812s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(r rVar, m mVar, Map map, m mVar2) {
        super(mVar);
        this.f7812s = rVar;
        this.f7810b = map;
        this.f7811c = mVar2;
    }

    public final void a() {
        try {
            r rVar = this.f7812s;
            ((f0) rVar.f8004d.f9344n).k(rVar.f8001a, r.k(this.f7810b), new m(this.f7812s, this.f7811c));
        } catch (RemoteException e10) {
            r.g.d(e10, "syncPacks", new Object[0]);
            this.f7811c.a(new RuntimeException(e10));
        }
    }
}
