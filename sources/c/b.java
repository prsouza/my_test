package c;

import ge.d0;
import hf.f;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import si.a;
import xd.p;

@e(c = "io.nodle.sdk.core.dtn.SdkAgent$syncWithStorage$3", f = "SdkAgent.kt", l = {}, m = "invokeSuspend")
public final class b extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f3044a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f3045b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(c cVar, a aVar, d<? super b> dVar) {
        super(2, dVar);
        this.f3044a = cVar;
        this.f3045b = aVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new b(this.f3044a, this.f3045b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        b bVar = new b(this.f3044a, this.f3045b, (d) obj2);
        m mVar = m.f8555a;
        bVar.invokeSuspend(mVar);
        return mVar;
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        b1.w(obj);
        ((f) this.f3044a.f3047b).b().b(jc.b.e(this.f3045b));
        return m.f8555a;
    }
}
