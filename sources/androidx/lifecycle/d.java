package androidx.lifecycle;

import ge.d0;
import l6.b1;
import md.m;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.BlockRunner$maybeRun$1", f = "CoroutineLiveData.kt", l = {178}, m = "invokeSuspend")
public final class d extends i implements p<d0, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2093a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2094b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e<Object> f2095c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f2095c = eVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        d dVar2 = new d(this.f2095c, dVar);
        dVar2.f2094b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((d0) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f2093a;
        if (i == 0) {
            b1.w(obj);
            g0 g0Var = new g0(this.f2095c.f2097a, ((d0) this.f2094b).f());
            p<f0<T>, pd.d<? super m>, Object> pVar = this.f2095c.f2098b;
            this.f2093a = 1;
            if (pVar.invoke(g0Var, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.f2095c.f2101e.c();
        return m.f8555a;
    }
}
