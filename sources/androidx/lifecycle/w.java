package androidx.lifecycle;

import ad.c;
import androidx.lifecycle.r;
import ge.d0;
import java.util.concurrent.CancellationException;
import l6.b1;
import md.m;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScopeImpl$register$1", f = "Lifecycle.kt", l = {}, m = "invokeSuspend")
public final class w extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public /* synthetic */ Object f2199a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ LifecycleCoroutineScopeImpl f2200b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl, d<? super w> dVar) {
        super(2, dVar);
        this.f2200b = lifecycleCoroutineScopeImpl;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        w wVar = new w(this.f2200b, dVar);
        wVar.f2199a = obj;
        return wVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        m mVar = m.f8555a;
        ((w) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
        return mVar;
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        b1.w(obj);
        d0 d0Var = (d0) this.f2199a;
        if (this.f2200b.f2023a.b().compareTo(r.c.INITIALIZED) >= 0) {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = this.f2200b;
            lifecycleCoroutineScopeImpl.f2023a.a(lifecycleCoroutineScopeImpl);
        } else {
            c.y(d0Var.f(), (CancellationException) null);
        }
        return m.f8555a;
    }
}
