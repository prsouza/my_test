package tb;

import ab.k;
import ge.d0;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$showAnnouncements$1$1", f = "HomeViewModelV2.kt", l = {469}, m = "invokeSuspend")
public final class l extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11499a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ab.i f11500b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(ab.i iVar, d<? super l> dVar) {
        super(2, dVar);
        this.f11500b = iVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new l(this.f11500b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11499a;
        if (i == 0) {
            b1.w(obj);
            k kVar = k.f279a;
            ab.i iVar = this.f11500b;
            this.f11499a = 1;
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
