package z9;

import c.c;
import ge.d0;
import l6.b1;
import md.m;
import oi.a;
import pd.d;
import rd.i;
import xd.p;
import xe.f;

@rd.e(c = "io.nodle.sdk.core.nvm.nasm.OpDTNKt$DTN_SEND$1", f = "OpDTN.kt", l = {96}, m = "invokeSuspend")
public final class e extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f14191a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f14192b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ f f14193c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(a aVar, f fVar, d<? super e> dVar) {
        super(2, dVar);
        this.f14192b = aVar;
        this.f14193c = fVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new e(this.f14192b, this.f14193c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        d0 d0Var = (d0) obj;
        return new e(this.f14192b, this.f14193c, (d) obj2).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f14191a;
        if (i == 0) {
            b1.w(obj);
            c cVar = this.f14192b.f9454e;
            f fVar = this.f14193c;
            this.f14191a = 1;
            if (cVar.f(fVar, this) == aVar) {
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
