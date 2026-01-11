package androidx.lifecycle;

import je.f;
import l6.b1;
import md.m;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

@e(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {75}, m = "invokeSuspend")
public final class n extends i implements p<f0<Object>, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2141a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2142b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ je.e<Object> f2143c;

    public static final class a<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f0<T> f2144a;

        public a(f0<T> f0Var) {
            this.f2144a = f0Var;
        }

        public final Object a(T t10, d<? super m> dVar) {
            Object a10 = this.f2144a.a(t10, dVar);
            if (a10 == qd.a.COROUTINE_SUSPENDED) {
                return a10;
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(je.e<Object> eVar, d<? super n> dVar) {
        super(2, dVar);
        this.f2143c = eVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        n nVar = new n(this.f2143c, dVar);
        nVar.f2142b = obj;
        return nVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((n) create((f0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        qd.a aVar = qd.a.COROUTINE_SUSPENDED;
        int i = this.f2141a;
        if (i == 0) {
            b1.w(obj);
            je.e<Object> eVar = this.f2143c;
            a aVar2 = new a((f0) this.f2142b);
            this.f2141a = 1;
            if (eVar.b(aVar2, this) == aVar) {
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
