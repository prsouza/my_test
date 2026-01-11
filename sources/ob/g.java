package ob;

import ab.k;
import ge.d0;
import io.nodle.cash.R;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.estimate.SimulatorFragment$initViews$8$1", f = "SimulatorFragment.kt", l = {116}, m = "invokeSuspend")
public final class g extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f9407a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ h f9408b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(h hVar, d<? super g> dVar) {
        super(2, dVar);
        this.f9408b = hVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f9408b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f9407a;
        if (i == 0) {
            b1.w(obj);
            ab.i iVar = new ab.i();
            iVar.f272a = this.f9408b.getString(R.string.simulatorInfoTitle);
            iVar.f273b = this.f9408b.getString(R.string.simulatorInfoText);
            iVar.i = new Integer(R.layout.notice_info);
            k kVar = k.f279a;
            this.f9407a = 1;
            if (kVar.a(iVar, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return m.f8555a;
    }
}
