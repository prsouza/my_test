package androidx.databinding;

import androidx.lifecycle.a0;
import androidx.lifecycle.u;
import androidx.lifecycle.v;
import ge.d0;
import ge.g;
import ge.v1;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import jc.b;
import je.e;
import je.f;
import l6.b1;
import md.m;
import pd.d;
import rd.i;
import xd.p;

public final class j implements g<e<? extends Object>> {

    /* renamed from: a  reason: collision with root package name */
    public WeakReference<a0> f1684a;

    /* renamed from: b  reason: collision with root package name */
    public v1 f1685b;

    /* renamed from: c  reason: collision with root package name */
    public final k<e<Object>> f1686c;

    @rd.e(c = "androidx.databinding.ViewDataBindingKtx$StateFlowListener$startCollection$1", f = "ViewDataBindingKtx.kt", l = {116}, m = "invokeSuspend")
    public static final class a extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f1687a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ e<Object> f1688b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ j f1689c;

        /* renamed from: androidx.databinding.j$a$a  reason: collision with other inner class name */
        public static final class C0011a implements f<Object> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ j f1690a;

            public C0011a(j jVar) {
                this.f1690a = jVar;
            }

            public final Object a(Object obj, d dVar) {
                m mVar;
                ViewDataBinding a10 = this.f1690a.f1686c.a();
                if (a10 == null) {
                    mVar = null;
                } else {
                    k<e<Object>> kVar = this.f1690a.f1686c;
                    a10.f(kVar.f1692b, kVar.f1693c, 0);
                    mVar = m.f8555a;
                }
                if (mVar == qd.a.COROUTINE_SUSPENDED) {
                    return mVar;
                }
                return m.f8555a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(e<? extends Object> eVar, j jVar, d<? super a> dVar) {
            super(2, dVar);
            this.f1688b = eVar;
            this.f1689c = jVar;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new a(this.f1688b, this.f1689c, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f1687a;
            if (i == 0) {
                b1.w(obj);
                e<Object> eVar = this.f1688b;
                C0011a aVar2 = new C0011a(this.f1689c);
                this.f1687a = 1;
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

    public j(ViewDataBinding viewDataBinding, int i, ReferenceQueue<ViewDataBinding> referenceQueue) {
        e6.e.D(referenceQueue, "referenceQueue");
        this.f1686c = new k<>(viewDataBinding, i, this, referenceQueue);
    }

    public final void a(Object obj) {
        e eVar = (e) obj;
        v1 v1Var = this.f1685b;
        if (v1Var != null) {
            v1Var.c((CancellationException) null);
        }
        this.f1685b = null;
    }

    public final void b(Object obj) {
        e eVar = (e) obj;
        WeakReference<a0> weakReference = this.f1684a;
        a0 a0Var = weakReference == null ? null : weakReference.get();
        if (a0Var != null && eVar != null) {
            d(a0Var, eVar);
        }
    }

    public final void c(a0 a0Var) {
        WeakReference<a0> weakReference = this.f1684a;
        if ((weakReference == null ? null : weakReference.get()) != a0Var) {
            v1 v1Var = this.f1685b;
            if (v1Var != null) {
                v1Var.c((CancellationException) null);
            }
            if (a0Var == null) {
                this.f1684a = null;
                return;
            }
            this.f1684a = new WeakReference<>(a0Var);
            e eVar = (e) this.f1686c.f1693c;
            if (eVar != null) {
                d(a0Var, eVar);
            }
        }
    }

    public final void d(a0 a0Var, e<? extends Object> eVar) {
        v1 v1Var = this.f1685b;
        if (v1Var != null) {
            v1Var.c((CancellationException) null);
        }
        v u10 = b.u(a0Var);
        this.f1685b = (v1) g.b(u10, (pd.f) null, new u(u10, new a(eVar, this, (d<? super a>) null), (d<? super u>) null), 3);
    }
}
