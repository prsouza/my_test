package androidx.lifecycle;

import androidx.lifecycle.r;
import c3.k;
import ge.d0;
import ie.n;
import je.b;
import je.f;
import l6.b1;
import pd.d;
import rd.e;
import rd.i;
import xd.p;

public final class m {

    @e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    public static final class a extends i implements p<n<? super T>, d<? super md.m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f2131a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f2132b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ r f2133c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ r.c f2134s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ je.e<T> f2135t;

        @e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.m$a$a  reason: collision with other inner class name */
        public static final class C0017a extends i implements p<d0, d<? super md.m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f2136a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ je.e<T> f2137b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ n<T> f2138c;

            /* renamed from: androidx.lifecycle.m$a$a$a  reason: collision with other inner class name */
            public static final class C0018a<T> implements f {

                /* renamed from: a  reason: collision with root package name */
                public final /* synthetic */ n<T> f2139a;

                public C0018a(n<? super T> nVar) {
                    this.f2139a = nVar;
                }

                public final Object a(T t10, d<? super md.m> dVar) {
                    Object h10 = this.f2139a.h(t10, dVar);
                    if (h10 == qd.a.COROUTINE_SUSPENDED) {
                        return h10;
                    }
                    return md.m.f8555a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0017a(je.e<? extends T> eVar, n<? super T> nVar, d<? super C0017a> dVar) {
                super(2, dVar);
                this.f2137b = eVar;
                this.f2138c = nVar;
            }

            public final d<md.m> create(Object obj, d<?> dVar) {
                return new C0017a(this.f2137b, this.f2138c, dVar);
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0017a) create((d0) obj, (d) obj2)).invokeSuspend(md.m.f8555a);
            }

            public final Object invokeSuspend(Object obj) {
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                int i = this.f2136a;
                if (i == 0) {
                    b1.w(obj);
                    je.e<T> eVar = this.f2137b;
                    C0018a aVar2 = new C0018a(this.f2138c);
                    this.f2136a = 1;
                    if (eVar.b(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    b1.w(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return md.m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r rVar, r.c cVar, je.e<? extends T> eVar, d<? super a> dVar) {
            super(2, dVar);
            this.f2133c = rVar;
            this.f2134s = cVar;
            this.f2135t = eVar;
        }

        public final d<md.m> create(Object obj, d<?> dVar) {
            a aVar = new a(this.f2133c, this.f2134s, this.f2135t, dVar);
            aVar.f2132b = obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((n) obj, (d) obj2)).invokeSuspend(md.m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            n nVar;
            Object obj2;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f2131a;
            boolean z = true;
            if (i == 0) {
                b1.w(obj);
                n nVar2 = (n) this.f2132b;
                r rVar = this.f2133c;
                r.c cVar = this.f2134s;
                C0017a aVar2 = new C0017a(this.f2135t, nVar2, (d<? super C0017a>) null);
                this.f2132b = nVar2;
                this.f2131a = 1;
                if (cVar == r.c.INITIALIZED) {
                    z = false;
                }
                if (z) {
                    if (rVar.b() == r.c.DESTROYED) {
                        obj2 = md.m.f8555a;
                    } else {
                        obj2 = k.d0(new RepeatOnLifecycleKt$repeatOnLifecycle$3(rVar, cVar, aVar2, (d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3>) null), this);
                        if (obj2 != aVar) {
                            obj2 = md.m.f8555a;
                        }
                    }
                    if (obj2 == aVar) {
                        return aVar;
                    }
                    nVar = nVar2;
                } else {
                    throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString());
                }
            } else if (i == 1) {
                nVar = (n) this.f2132b;
                b1.w(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar.b((Throwable) null);
            return md.m.f8555a;
        }
    }

    public static final <T> je.e<T> a(je.e<? extends T> eVar, r rVar, r.c cVar) {
        e6.e.D(eVar, "<this>");
        e6.e.D(cVar, "minActiveState");
        return new b(new a(rVar, cVar, eVar, (d<? super a>) null));
    }
}
