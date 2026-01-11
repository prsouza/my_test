package tb;

import androidx.lifecycle.j0;
import ge.d0;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import sa.b;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$loadHistorySummaryLocal$1", f = "HomeViewModelV2.kt", l = {199, 200}, m = "invokeSuspend")
public final class g extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public j0 f11488a;

    /* renamed from: b  reason: collision with root package name */
    public int f11489b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV2 f11490c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(HomeViewModelV2 homeViewModelV2, d<? super g> dVar) {
        super(2, dVar);
        this.f11490c = homeViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new g(this.f11490c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        j0<List<b>> j0Var;
        j0<List<b>> j0Var2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11489b;
        if (i == 0) {
            b1.w(obj);
            HomeViewModelV2 homeViewModelV2 = this.f11490c;
            j0Var2 = homeViewModelV2.A;
            this.f11488a = j0Var2;
            this.f11489b = 1;
            obj = homeViewModelV2.f6770x.c(bb.g.REWARD, homeViewModelV2.f6768v + 1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            j0Var2 = this.f11488a;
            b1.w(obj);
        } else if (i == 2) {
            j0Var = this.f11488a;
            b1.w(obj);
            j0Var.j(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        j0Var2.j(obj);
        HomeViewModelV2 homeViewModelV22 = this.f11490c;
        j0<List<b>> j0Var3 = homeViewModelV22.B;
        this.f11488a = j0Var3;
        this.f11489b = 2;
        obj = homeViewModelV22.f6770x.c(bb.g.TRANSFER, homeViewModelV22.f6768v + 1, this);
        if (obj == aVar) {
            return aVar;
        }
        j0Var = j0Var3;
        j0Var.j(obj);
        return m.f8555a;
    }
}
