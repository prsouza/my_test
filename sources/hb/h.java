package hb;

import ab.k;
import androidx.lifecycle.j0;
import ge.d0;
import io.nodle.cash.ui.view.activity.HomeActivityV2;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import x8.q0;
import xd.p;

@e(c = "io.nodle.cash.ui.view.activity.HomeActivityV2$manageNotice$1", f = "HomeActivityV2.kt", l = {}, m = "invokeSuspend")
public final class h extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ HomeActivityV2 f5920a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(HomeActivityV2 homeActivityV2, d<? super h> dVar) {
        super(2, dVar);
        this.f5920a = homeActivityV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f5920a, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        m mVar = m.f8555a;
        ((h) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
        return mVar;
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        k kVar = k.f279a;
        j0<ab.i> j0Var = k.f281c;
        HomeActivityV2 homeActivityV2 = this.f5920a;
        j0Var.e(homeActivityV2, new q0(homeActivityV2, 1));
        return m.f8555a;
    }
}
