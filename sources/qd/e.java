package qd;

import l6.b1;
import pd.d;
import pd.f;
import rd.c;
import xd.p;
import yd.x;

public final class e extends c {

    /* renamed from: a  reason: collision with root package name */
    public int f10414a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f10415b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f10416c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(d dVar, f fVar, p pVar, Object obj) {
        super(dVar, fVar);
        this.f10415b = pVar;
        this.f10416c = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.f10414a;
        if (i == 0) {
            this.f10414a = 1;
            b1.w(obj);
            p pVar = this.f10415b;
            x.a(pVar, 2);
            return pVar.invoke(this.f10416c, this);
        } else if (i == 1) {
            this.f10414a = 2;
            b1.w(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
