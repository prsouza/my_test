package qb;

import ge.d0;
import ge.g;
import io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel;
import java.util.List;
import je.o;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.view.fragment.home.stats.StatsViewModel$onShow$1", f = "StatsViewModel.kt", l = {36}, m = "invokeSuspend")
public final class v extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f10396a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ StatsViewModel f10397b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v(StatsViewModel statsViewModel, d<? super v> dVar) {
        super(2, dVar);
        this.f10397b = statsViewModel;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new v(this.f10397b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((v) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f10396a;
        if (i == 0) {
            b1.w(obj);
            c cVar = this.f10397b.f6748v;
            this.f10396a = 1;
            obj = g.d(cVar.f10349c.f11926b, new a(cVar, (d<? super a>) null), this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o oVar = this.f10397b.f11465c;
        u uVar = (u) oVar.getValue();
        e6.e.D(uVar, "it");
        oVar.h((Object) null, u.a(uVar, 0, (List) obj, 1));
        return m.f8555a;
    }
}
