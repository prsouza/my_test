package tb;

import bb.g;
import ge.d0;
import io.nodle.cash.ui.viewmodel.HomeViewModelV2;
import java.util.List;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import ua.f;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$manageTransferSummary$1", f = "HomeViewModelV2.kt", l = {389}, m = "invokeSuspend")
public final class h extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11491a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HomeViewModelV2 f11492b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(HomeViewModelV2 homeViewModelV2, d<? super h> dVar) {
        super(2, dVar);
        this.f11492b = homeViewModelV2;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new h(this.f11492b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11491a;
        if (i == 0) {
            b1.w(obj);
            List d10 = this.f11492b.B.d();
            boolean z = false;
            if (d10 != null && d10.isEmpty()) {
                z = true;
            }
            if (z) {
                f fVar = this.f11492b.f6770x;
                this.f11491a = 1;
                obj = fVar.d(this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            this.f11492b.C.j(null);
            return m.f8555a;
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (!((Boolean) obj).booleanValue()) {
            HomeViewModelV2 homeViewModelV2 = this.f11492b;
            homeViewModelV2.C.j(homeViewModelV2.f6765s.getString(g.TRANSFER.getEmptyPlaceholder()));
            return m.f8555a;
        }
        this.f11492b.C.j(null);
        return m.f8555a;
    }
}
