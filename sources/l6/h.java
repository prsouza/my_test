package l6;

import android.os.RemoteException;
import o6.f;
import o6.f0;
import t6.m;

public final class h extends f {

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f7870b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f7871c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ String f7872s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ int f7873t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ m f7874u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ r f7875v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(r rVar, m mVar, int i, String str, String str2, int i10, m mVar2) {
        super(mVar);
        this.f7875v = rVar;
        this.f7870b = i;
        this.f7871c = str;
        this.f7872s = str2;
        this.f7873t = i10;
        this.f7874u = mVar2;
    }

    public final void a() {
        try {
            r rVar = this.f7875v;
            ((f0) rVar.f8004d.f9344n).e(rVar.f8001a, r.j(this.f7870b, this.f7871c, this.f7872s, this.f7873t), r.g(), new l(this.f7875v, this.f7874u));
        } catch (RemoteException e10) {
            r.g.c("getChunkFileDescriptor(%s, %s, %d, session=%d)", this.f7871c, this.f7872s, Integer.valueOf(this.f7873t), Integer.valueOf(this.f7870b));
            this.f7874u.a(new RuntimeException(e10));
        }
    }
}
