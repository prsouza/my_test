package qd;

import l6.b1;
import rd.g;
import xd.p;
import yd.x;

public final class d extends g {

    /* renamed from: a  reason: collision with root package name */
    public int f10411a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10412b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10413c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(pd.d dVar, p pVar, Object obj) {
        super(dVar);
        this.f10412b = pVar;
        this.f10413c = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f10411a;
        if (i == 0) {
            this.f10411a = 1;
            b1.w(obj);
            p pVar = this.f10412b;
            x.a(pVar, 2);
            return pVar.invoke(this.f10413c, this);
        } else if (i == 1) {
            this.f10411a = 2;
            b1.w(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
