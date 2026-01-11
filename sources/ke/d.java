package ke;

import ie.n;
import l6.b1;
import md.m;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {60}, m = "invokeSuspend")
public final class d extends i implements p<n<Object>, pd.d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7509a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7510b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e<Object> f7511c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(e<Object> eVar, pd.d<? super d> dVar) {
        super(2, dVar);
        this.f7511c = eVar;
    }

    public final pd.d<m> create(Object obj, pd.d<?> dVar) {
        d dVar2 = new d(this.f7511c, dVar);
        dVar2.f7510b = obj;
        return dVar2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((n) obj, (pd.d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f7509a;
        if (i == 0) {
            b1.w(obj);
            e<Object> eVar = this.f7511c;
            this.f7509a = 1;
            if (eVar.d((n) this.f7510b, this) == aVar) {
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
