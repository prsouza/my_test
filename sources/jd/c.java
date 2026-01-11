package jd;

import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;
import xe.f;

@e(c = "io.nodle.dtn.BundleProtocolAgent$receive$2", f = "BundleProtocolAgent.kt", l = {25, 26}, m = "invokeSuspend")
public final class c extends i implements p<f, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f7188a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f7189b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f7190c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, f fVar, d dVar) {
        super(2, dVar);
        this.f7189b = bVar;
        this.f7190c = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        e6.e.D(dVar, "completion");
        return new c(this.f7189b, this.f7190c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create(obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f7188a;
        if (i == 0) {
            b1.w(obj);
            b bVar = this.f7189b;
            f fVar = this.f7190c;
            this.f7188a = 1;
            obj = bVar.e(fVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else if (i == 2) {
            b1.w(obj);
            return m.f8555a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b bVar2 = this.f7189b;
        this.f7188a = 2;
        if (bVar2.a((si.a) obj, this) == aVar) {
            return aVar;
        }
        return m.f8555a;
    }
}
