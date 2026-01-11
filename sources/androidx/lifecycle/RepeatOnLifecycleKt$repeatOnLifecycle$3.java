package androidx.lifecycle;

import androidx.lifecycle.r;
import ge.d0;
import ge.g;
import ge.g0;
import ge.g1;
import ge.n1;
import ge.o0;
import java.util.concurrent.CancellationException;
import l6.b1;
import le.l;
import md.m;
import me.c;
import pd.d;
import qd.a;
import rd.e;
import rd.i;
import xd.p;
import yd.u;

@e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends i implements p<d0, d<? super m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f2043a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f2044b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ r f2045c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ r.c f2046s;

    /* renamed from: t  reason: collision with root package name */
    public final /* synthetic */ p<d0, d<? super m>, Object> f2047t;

    @e(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    public static final class AnonymousClass1 extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public u f2048a;

        /* renamed from: b  reason: collision with root package name */
        public u f2049b;

        /* renamed from: c  reason: collision with root package name */
        public r.c f2050c;

        /* renamed from: s  reason: collision with root package name */
        public r f2051s;

        /* renamed from: t  reason: collision with root package name */
        public d0 f2052t;

        /* renamed from: u  reason: collision with root package name */
        public p f2053u;

        /* renamed from: v  reason: collision with root package name */
        public int f2054v;

        public final d<m> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(rVar, cVar2, d0Var, pVar, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            u uVar;
            u uVar2;
            a aVar = a.COROUTINE_SUSPENDED;
            int i = this.f2054v;
            if (i == 0) {
                b1.w(obj);
                if (rVar.b() == r.c.DESTROYED) {
                    return m.f8555a;
                }
                u uVar3 = new u();
                u uVar4 = new u();
                try {
                    r.c cVar = cVar2;
                    r rVar = rVar;
                    d0 d0Var = d0Var;
                    p<d0, d<? super m>, Object> pVar = pVar;
                    this.f2048a = uVar3;
                    this.f2049b = uVar4;
                    this.f2050c = cVar;
                    this.f2051s = rVar;
                    this.f2052t = d0Var;
                    this.f2053u = pVar;
                    this.f2054v = 1;
                    ge.l lVar = new ge.l(ad.c.Y(this), 1);
                    lVar.u();
                    RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1(r.b.upTo(cVar), uVar3, d0Var, r.b.downFrom(cVar), lVar, g0.i(), pVar);
                    uVar4.f13622a = repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1;
                    rVar.a(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1);
                    if (lVar.t() == aVar) {
                        return aVar;
                    }
                    uVar = uVar3;
                    uVar2 = uVar4;
                } catch (Throwable th2) {
                    th = th2;
                    uVar = uVar3;
                    uVar2 = uVar4;
                    g1 g1Var = (g1) uVar.f13622a;
                    if (g1Var != null) {
                        g1Var.c((CancellationException) null);
                    }
                    y yVar = (y) uVar2.f13622a;
                    if (yVar != null) {
                        rVar.c(yVar);
                    }
                    throw th;
                }
            } else if (i == 1) {
                uVar2 = this.f2049b;
                uVar = this.f2048a;
                try {
                    b1.w(obj);
                } catch (Throwable th3) {
                    th = th3;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g1 g1Var2 = (g1) uVar.f13622a;
            if (g1Var2 != null) {
                g1Var2.c((CancellationException) null);
            }
            y yVar2 = (y) uVar2.f13622a;
            if (yVar2 != null) {
                rVar.c(yVar2);
            }
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(r rVar, r.c cVar, p<? super d0, ? super d<? super m>, ? extends Object> pVar, d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f2045c = rVar;
        this.f2046s = cVar;
        this.f2047t = pVar;
    }

    public final d<m> create(Object obj, d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f2045c, this.f2046s, this.f2047t, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f2044b = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
    }

    public final Object invokeSuspend(Object obj) {
        a aVar = a.COROUTINE_SUSPENDED;
        int i = this.f2043a;
        if (i == 0) {
            b1.w(obj);
            final d0 d0Var = (d0) this.f2044b;
            c cVar = o0.f5433a;
            n1 w02 = l.f8259a.w0();
            final r rVar = this.f2045c;
            final r.c cVar2 = this.f2046s;
            final p<d0, d<? super m>, Object> pVar = this.f2047t;
            AnonymousClass1 r32 = new AnonymousClass1((d<? super AnonymousClass1>) null);
            this.f2043a = 1;
            if (g.d(w02, r32, this) == aVar) {
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
