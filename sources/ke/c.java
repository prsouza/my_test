package ke;

import ge.d0;
import je.f;
import je.g;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {123}, m = "invokeSuspend")
public final class c extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7505a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f7506b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f<Object> f7507c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ e<Object> f7508s;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(f<Object> fVar, e<Object> eVar, d<? super c> dVar) {
        super(2, dVar);
        this.f7507c = fVar;
        this.f7508s = eVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        c cVar = new c(this.f7507c, this.f7508s, dVar);
        cVar.f7506b = obj;
        return cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f7505a;
        if (i == 0) {
            b1.w(obj);
            f<Object> fVar = this.f7507c;
            ie.p<Object> e10 = this.f7508s.e((d0) this.f7506b);
            this.f7505a = 1;
            Object a10 = g.a(fVar, e10, true, this);
            if (a10 != aVar) {
                a10 = m.f8555a;
            }
            if (a10 == aVar) {
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
