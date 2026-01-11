package qd;

import l6.b1;
import pd.d;
import pd.f;
import xd.l;
import yd.x;

public final class c extends rd.c {

    /* renamed from: a  reason: collision with root package name */
    public int f10409a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ l f10410b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(d dVar, f fVar, l lVar) {
        super(dVar, fVar);
        this.f10410b = lVar;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f10409a;
        if (i == 0) {
            this.f10409a = 1;
            b1.w(obj);
            l lVar = this.f10410b;
            x.a(lVar, 1);
            return lVar.k(this);
        } else if (i == 1) {
            this.f10409a = 2;
            b1.w(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
