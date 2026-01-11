package androidx.lifecycle;

import androidx.lifecycle.r;
import ge.d0;
import ge.g;
import ge.g1;
import ge.k;
import java.util.concurrent.CancellationException;
import l6.b1;
import md.m;
import ne.b;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import xd.p;
import yd.u;

public final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 implements y {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ r.b f2058a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ u<g1> f2059b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ d0 f2060c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r.b f2061s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ k<m> f2062t;

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ b f2063u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ p<d0, d<? super m>, Object> f2064v;

    @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {171, 110}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public b f2065a;

        /* renamed from: b  reason: collision with root package name */
        public p f2066b;

        /* renamed from: c  reason: collision with root package name */
        public int f2067c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ b f2068s;

        /* renamed from: t  reason: collision with root package name */
        public final /* synthetic */ p<d0, d<? super m>, Object> f2069t;

        @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {111}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$a$a  reason: collision with other inner class name */
        public static final class C0016a extends i implements p<d0, d<? super m>, Object> {

            /* renamed from: a  reason: collision with root package name */
            public int f2070a;

            /* renamed from: b  reason: collision with root package name */
            public /* synthetic */ Object f2071b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ p<d0, d<? super m>, Object> f2072c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C0016a(p<? super d0, ? super d<? super m>, ? extends Object> pVar, d<? super C0016a> dVar) {
                super(2, dVar);
                this.f2072c = pVar;
            }

            public final d<m> create(Object obj, d<?> dVar) {
                C0016a aVar = new C0016a(this.f2072c, dVar);
                aVar.f2071b = obj;
                return aVar;
            }

            public final Object invoke(Object obj, Object obj2) {
                return ((C0016a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
            }

            public final Object invokeSuspend(Object obj) {
                qd.a aVar = qd.a.COROUTINE_SUSPENDED;
                int i = this.f2070a;
                if (i == 0) {
                    b1.w(obj);
                    p<d0, d<? super m>, Object> pVar = this.f2072c;
                    this.f2070a = 1;
                    if (pVar.invoke((d0) this.f2071b, this) == aVar) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(b bVar, p<? super d0, ? super d<? super m>, ? extends Object> pVar, d<? super a> dVar) {
            super(2, dVar);
            this.f2068s = bVar;
            this.f2069t = pVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f2068s, this.f2069t, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            b bVar;
            b bVar2;
            p<d0, d<? super m>, Object> pVar;
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f2067c;
            if (i == 0) {
                b1.w(obj);
                b bVar3 = this.f2068s;
                pVar = this.f2069t;
                this.f2065a = bVar3;
                this.f2066b = pVar;
                this.f2067c = 1;
                if (bVar3.b((Object) null, this) == aVar) {
                    return aVar;
                }
                bVar = bVar3;
            } else if (i == 1) {
                pVar = this.f2066b;
                bVar = this.f2065a;
                b1.w(obj);
            } else if (i == 2) {
                bVar2 = this.f2065a;
                try {
                    b1.w(obj);
                    m mVar = m.f8555a;
                    bVar2.a((Object) null);
                    return mVar;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVar2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                C0016a aVar2 = new C0016a(pVar, (d<? super C0016a>) null);
                this.f2065a = bVar;
                this.f2066b = null;
                this.f2067c = 2;
                if (c3.k.d0(aVar2, this) == aVar) {
                    return aVar;
                }
                bVar2 = bVar;
                m mVar2 = m.f8555a;
                bVar2.a((Object) null);
                return mVar2;
            } catch (Throwable th3) {
                th = th3;
                bVar.a((Object) null);
                throw th;
            }
        }
    }

    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(r.b bVar, u<g1> uVar, d0 d0Var, r.b bVar2, k<? super m> kVar, b bVar3, p<? super d0, ? super d<? super m>, ? extends Object> pVar) {
        this.f2058a = bVar;
        this.f2059b = uVar;
        this.f2060c = d0Var;
        this.f2061s = bVar2;
        this.f2062t = kVar;
        this.f2063u = bVar3;
        this.f2064v = pVar;
    }

    public final void c(a0 a0Var, r.b bVar) {
        if (bVar == this.f2058a) {
            this.f2059b.f13622a = g.b(this.f2060c, (f) null, new a(this.f2063u, this.f2064v, (d<? super a>) null), 3);
            return;
        }
        if (bVar == this.f2061s) {
            g1 g1Var = (g1) this.f2059b.f13622a;
            if (g1Var != null) {
                g1Var.c((CancellationException) null);
            }
            this.f2059b.f13622a = null;
        }
        if (bVar == r.b.ON_DESTROY) {
            this.f2062t.resumeWith(m.f8555a);
        }
    }
}
