package androidx.lifecycle;

import c3.k;
import ge.d0;
import ge.g1;
import java.util.concurrent.CancellationException;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.BlockRunner$cancel$1", f = "CoroutineLiveData.kt", l = {189}, m = "invokeSuspend")
public final class c extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2091a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e<Object> f2092b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(e<Object> eVar, d<? super c> dVar) {
        super(2, dVar);
        this.f2092b = eVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new c(this.f2092b, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f2091a;
        if (i == 0) {
            b1.w(obj);
            long j10 = this.f2092b.f2099c;
            this.f2091a = 1;
            if (k.f0(j10, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            b1.w(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        e<Object> eVar = this.f2092b;
        if (!(eVar.f2097a.f2028c > 0)) {
            g1 g1Var = eVar.f2102f;
            if (g1Var != null) {
                g1Var.c((CancellationException) null);
            }
            this.f2092b.f2102f = null;
        }
        return m.f8555a;
    }
}
