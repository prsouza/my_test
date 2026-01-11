package androidx.lifecycle;

import androidx.lifecycle.r;
import ge.d0;
import ge.g;
import ge.o0;
import l6.b1;
import le.l;
import md.m;
import me.c;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1", f = "Lifecycle.kt", l = {79}, m = "invokeSuspend")
public final class u extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2190a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ v f2191b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p<d0, d<? super m>, Object> f2192c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(v vVar, p<? super d0, ? super d<? super m>, ? extends Object> pVar, d<? super u> dVar) {
        super(2, dVar);
        this.f2191b = vVar;
        this.f2192c = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        return new u(this.f2191b, this.f2192c, dVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f2190a;
        if (i == 0) {
            b1.w(obj);
            r h10 = this.f2191b.h();
            p<d0, d<? super m>, Object> pVar = this.f2192c;
            this.f2190a = 1;
            r.c cVar = r.c.CREATED;
            c cVar2 = o0.f5433a;
            if (g.d(l.f8259a.w0(), new n0(h10, cVar, pVar, (d<? super n0>) null), this) == aVar) {
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
