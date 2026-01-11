package androidx.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import c3.k;
import f2.a;
import ge.d0;
import ge.g;
import ge.j1;
import ge.o0;
import ge.r;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import l6.b1;
import md.m;
import pd.d;
import pd.f;
import rd.e;
import rd.i;
import u1.h;
import xd.p;

public abstract class CoroutineWorker extends ListenableWorker {

    /* renamed from: u  reason: collision with root package name */
    public final j1 f2614u = ((j1) ad.c.b());

    /* renamed from: v  reason: collision with root package name */
    public final f2.c<ListenableWorker.a> f2615v;

    /* renamed from: w  reason: collision with root package name */
    public final me.c f2616w;

    public static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f2617a;

        public a(CoroutineWorker coroutineWorker) {
            this.f2617a = coroutineWorker;
        }

        public final void run() {
            if (this.f2617a.f2615v.f4914a instanceof a.b) {
                this.f2617a.f2614u.c((CancellationException) null);
            }
        }
    }

    @e(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public u1.m f2618a;

        /* renamed from: b  reason: collision with root package name */
        public int f2619b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ u1.m<h> f2620c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f2621s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(u1.m<h> mVar, CoroutineWorker coroutineWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f2620c = mVar;
            this.f2621s = coroutineWorker;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f2620c, this.f2621s, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            m mVar = m.f8555a;
            ((b) create((d0) obj, (d) obj2)).invokeSuspend(mVar);
            return mVar;
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f2619b;
            if (i == 0) {
                b1.w(obj);
                u1.m<h> mVar = this.f2620c;
                CoroutineWorker coroutineWorker = this.f2621s;
                this.f2618a = mVar;
                this.f2619b = 1;
                Objects.requireNonNull(coroutineWorker);
                throw new IllegalStateException("Not implemented");
            } else if (i == 1) {
                u1.m mVar2 = this.f2618a;
                b1.w(obj);
                mVar2.f11646b.j(obj);
                return m.f8555a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @e(c = "androidx.work.CoroutineWorker$startWork$1", f = "CoroutineWorker.kt", l = {68}, m = "invokeSuspend")
    public static final class c extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f2622a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ CoroutineWorker f2623b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(CoroutineWorker coroutineWorker, d<? super c> dVar) {
            super(2, dVar);
            this.f2623b = coroutineWorker;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new c(this.f2623b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f2622a;
            if (i == 0) {
                b1.w(obj);
                CoroutineWorker coroutineWorker = this.f2623b;
                this.f2622a = 1;
                obj = coroutineWorker.h(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                try {
                    b1.w(obj);
                } catch (Throwable th2) {
                    this.f2623b.f2615v.k(th2);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f2623b.f2615v.j((ListenableWorker.a) obj);
            return m.f8555a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        e6.e.D(context, "appContext");
        e6.e.D(workerParameters, "params");
        f2.c<ListenableWorker.a> cVar = new f2.c<>();
        this.f2615v = cVar;
        cVar.d(new a(this), ((g2.b) this.f2625b.f2637d).f5227a);
        this.f2616w = o0.f5433a;
    }

    public final z6.a<h> a() {
        r b10 = ad.c.b();
        d0 j10 = k.j(this.f2616w.plus(b10));
        u1.m mVar = new u1.m(b10);
        g.b(j10, (f) null, new b(mVar, this, (d<? super b>) null), 3);
        return mVar;
    }

    public final void e() {
        this.f2615v.cancel(false);
    }

    public final z6.a<ListenableWorker.a> f() {
        g.b(k.j(this.f2616w.plus(this.f2614u)), (f) null, new c(this, (d<? super c>) null), 3);
        return this.f2615v;
    }

    public abstract Object h(d<? super ListenableWorker.a> dVar);
}
