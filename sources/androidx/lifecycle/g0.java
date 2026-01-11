package androidx.lifecycle;

import ge.d0;
import ge.g;
import ge.o0;
import l6.b1;
import le.l;
import md.m;
import me.c;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import xd.p;

public final class g0<T> implements f0<T> {

    /* renamed from: a  reason: collision with root package name */
    public h<T> f2113a;

    /* renamed from: b  reason: collision with root package name */
    public final f f2114b;

    @e(c = "androidx.lifecycle.LiveDataScopeImpl$emit$2", f = "CoroutineLiveData.kt", l = {100}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f2115a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ g0<T> f2116b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ T f2117c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(g0<T> g0Var, T t10, d<? super a> dVar) {
            super(2, dVar);
            this.f2116b = g0Var;
            this.f2117c = t10;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f2116b, this.f2117c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f2115a;
            if (i == 0) {
                b1.w(obj);
                h<T> hVar = this.f2116b.f2113a;
                this.f2115a = 1;
                hVar.l(this);
                if (m.f8555a == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2116b.f2113a.j(this.f2117c);
            return m.f8555a;
        }
    }

    public g0(h<T> hVar, f fVar) {
        e6.e.D(hVar, "target");
        e6.e.D(fVar, "context");
        this.f2113a = hVar;
        c cVar = o0.f5433a;
        this.f2114b = fVar.plus(l.f8259a.w0());
    }

    public final Object a(T t10, d<? super m> dVar) {
        Object d10 = g.d(this.f2114b, new a(this, t10, (d<? super a>) null), dVar);
        if (d10 == qd.a.COROUTINE_SUSPENDED) {
            return d10;
        }
        return m.f8555a;
    }
}
