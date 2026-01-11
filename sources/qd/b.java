package qd;

import l6.b1;
import pd.d;
import rd.g;
import xd.l;
import yd.x;

public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public int f10407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f10408b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(d dVar, l lVar) {
        super(dVar);
        this.f10408b = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f10407a;
        if (i == 0) {
            this.f10407a = 1;
            b1.w(obj);
            l lVar = this.f10408b;
            x.a(lVar, 1);
            return lVar.k(this);
        } else if (i == 1) {
            this.f10407a = 2;
            b1.w(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
