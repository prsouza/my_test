package tb;

import ah.v;
import ge.d0;
import java.math.BigDecimal;
import l6.b1;
import md.m;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.EstimateViewModel$getCurrentPricing$1", f = "EstimateViewModel.kt", l = {39}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public c f11479a;

    /* renamed from: b  reason: collision with root package name */
    public int f11480b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ c f11481c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(c cVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f11481c = cVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        return new d(this.f11481c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        c cVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11480b;
        if (i == 0) {
            b1.w(obj);
            c.i(this.f11481c, new BigDecimal(v.J(this.f11481c.f11469s, qa.e.NODLE_DOLLAR_PRICE)));
            c cVar2 = this.f11481c;
            ua.a aVar2 = new ua.a(cVar2.f11469s);
            this.f11479a = cVar2;
            this.f11480b = 1;
            Object a10 = aVar2.a(this);
            if (a10 == aVar) {
                return aVar;
            }
            cVar = cVar2;
            obj = a10;
        } else if (i == 1) {
            cVar = this.f11479a;
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c.i(cVar, (BigDecimal) obj);
        return m.f8555a;
    }
}
