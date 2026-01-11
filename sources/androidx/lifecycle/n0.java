package androidx.lifecycle;

import androidx.lifecycle.r;
import ge.d0;
import ge.g;
import ge.g1;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import qd.a;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2", f = "PausingDispatcher.kt", l = {162}, m = "invokeSuspend")
public final class n0 extends i implements p<d0, d<Object>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2145a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2146b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f2147c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r.c f2148s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ p<d0, d<Object>, Object> f2149t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n0(r rVar, r.c cVar, p<? super d0, ? super d<Object>, ? extends Object> pVar, d<? super n0> dVar) {
        super(2, dVar);
        this.f2147c = rVar;
        this.f2148s = cVar;
        this.f2149t = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        n0 n0Var = new n0(this.f2147c, this.f2148s, this.f2149t, dVar);
        n0Var.f2146b = obj;
        return n0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n0) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        t tVar;
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f2145a;
        if (i == 0) {
            b1.w(obj);
            f f10 = ((d0) this.f2146b).f();
            int i10 = g1.f5400e;
            g1 g1Var = (g1) f10.get(g1.b.f5401a);
            if (g1Var != null) {
                m0 m0Var = new m0();
                t tVar2 = new t(this.f2147c, this.f2148s, m0Var.f2140b, g1Var);
                try {
                    p<d0, d<Object>, Object> pVar = this.f2149t;
                    this.f2146b = tVar2;
                    this.f2145a = 1;
                    obj = g.d(m0Var, pVar, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    tVar = tVar2;
                } catch (Throwable th2) {
                    th = th2;
                    tVar = tVar2;
                    tVar.a();
                    throw th;
                }
            } else {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
        } else if (i == 1) {
            tVar = (t) this.f2146b;
            try {
                b1.w(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        tVar.a();
        return obj;
    }
}
