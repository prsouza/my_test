package tb;

import ge.d0;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "io.nodle.cash.ui.viewmodel.HomeViewModelV2$onClickFlashCallAction$1", f = "HomeViewModelV2.kt", l = {449}, m = "invokeSuspend")
public final class k extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f11497a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ab.i f11498b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(ab.i iVar, d<? super k> dVar) {
        super(2, dVar);
        this.f11498b = iVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new k(this.f11498b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f11497a;
        if (i == 0) {
            b1.w(obj);
            ab.k kVar = ab.k.f279a;
            ab.i iVar = this.f11498b;
            this.f11497a = 1;
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
