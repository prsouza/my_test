package l6;

import android.os.RemoteException;
import o6.f;
import o6.f0;
import t6.m;

public final class e extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7820b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7821c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f7822s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7823t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f7824u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ r f7825v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(r rVar, m mVar, int i, String str, String str2, int i10, m mVar2) {
        super(mVar);
        this.f7825v = rVar;
        this.f7820b = i;
        this.f7821c = str;
        this.f7822s = str2;
        this.f7823t = i10;
        this.f7824u = mVar2;
    }

    public final void a() {
        try {
            r rVar = this.f7825v;
            ((f0) rVar.f8004d.f9344n).l(rVar.f8001a, r.j(this.f7820b, this.f7821c, this.f7822s, this.f7823t), r.g(), new o(this.f7825v, this.f7824u));
        } catch (RemoteException e10) {
            r.g.d(e10, "notifyChunkTransferred", new Object[0]);
        }
    }
}
