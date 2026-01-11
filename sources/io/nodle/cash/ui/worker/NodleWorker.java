package io.nodle.cash.ui.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import c3.k;
import ge.d0;
import l6.b1;
import md.m;
import net.jpountz.lz4.LZ4FrameOutputStream;
import pd.d;
import rd.c;
import rd.e;
import rd.i;
import xd.p;

public final class NodleWorker extends CoroutineWorker {

    /* renamed from: x  reason: collision with root package name */
    public final String f6832x = "NodleWorker";

    @e(c = "io.nodle.cash.ui.worker.NodleWorker", f = "NodleWorker.kt", l = {58, 80}, m = "doWork")
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public NodleWorker f6833a;

        /* renamed from: b  reason: collision with root package name */
        public /* synthetic */ Object f6834b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ NodleWorker f6835c;

        /* renamed from: s  reason: collision with root package name */
        public int f6836s;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(NodleWorker nodleWorker, d<? super a> dVar) {
            super(dVar);
            this.f6835c = nodleWorker;
        }

        public final Object invokeSuspend(Object obj) {
            this.f6834b = obj;
            this.f6836s |= LZ4FrameOutputStream.LZ4_FRAME_INCOMPRESSIBLE_MASK;
            return this.f6835c.h(this);
        }
    }

    @e(c = "io.nodle.cash.ui.worker.NodleWorker$doWork$2", f = "NodleWorker.kt", l = {74}, m = "invokeSuspend")
    public static final class b extends i implements p<d0, d<? super m>, Object> {

        /* renamed from: a  reason: collision with root package name */
        public int f6837a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ NodleWorker f6838b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(NodleWorker nodleWorker, d<? super b> dVar) {
            super(2, dVar);
            this.f6838b = nodleWorker;
        }

        public final d<m> create(Object obj, d<?> dVar) {
            return new b(this.f6838b, dVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((d0) obj, (d) obj2)).invokeSuspend(m.f8555a);
        }

        public final Object invokeSuspend(Object obj) {
            qd.a aVar = qd.a.COROUTINE_SUSPENDED;
            int i = this.f6837a;
            if (i == 0 || i == 1) {
                b1.w(obj);
                do {
                    Context context = this.f6838b.f2624a;
                    e6.e.C(context, "applicationContext");
                    if (ad.c.Q(context)) {
                        this.f6837a = 1;
                    } else {
                        za.d dVar = za.d.f14195a;
                        Context context2 = this.f6838b.f2624a;
                        e6.e.C(context2, "applicationContext");
                        dVar.b(context2);
                        return m.f8555a;
                    }
                } while (k.f0(1000, this) != aVar);
                return aVar;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NodleWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        e6.e.D(context, "context");
        e6.e.D(workerParameters, "parameters");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00fb A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object h(pd.d<? super androidx.work.ListenableWorker.a> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof io.nodle.cash.ui.worker.NodleWorker.a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            io.nodle.cash.ui.worker.NodleWorker$a r0 = (io.nodle.cash.ui.worker.NodleWorker.a) r0
            int r1 = r0.f6836s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f6836s = r1
            goto L_0x0018
        L_0x0013:
            io.nodle.cash.ui.worker.NodleWorker$a r0 = new io.nodle.cash.ui.worker.NodleWorker$a
            r0.<init>(r8, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f6834b
            qd.a r1 = qd.a.COROUTINE_SUSPENDED
            int r2 = r0.f6836s
            r3 = 2
            r4 = 1
            java.lang.String r5 = "applicationContext"
            if (r2 == 0) goto L_0x003c
            if (r2 == r4) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            l6.b1.w(r9)
            goto L_0x00fc
        L_0x002d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0035:
            io.nodle.cash.ui.worker.NodleWorker r2 = r0.f6833a
            l6.b1.w(r9)
            goto L_0x00d4
        L_0x003c:
            l6.b1.w(r9)
            java.lang.String r9 = r8.f6832x
            java.lang.String r2 = "doWork"
            android.util.Log.d(r9, r2)
            za.d r9 = za.d.f14195a
            android.content.Context r2 = r8.f2624a
            e6.e.C(r2, r5)
            boolean r2 = r9.c(r2)
            if (r2 != 0) goto L_0x0061
            android.content.Context r0 = r8.f2624a
            e6.e.C(r0, r5)
            r9.b(r0)
            androidx.work.ListenableWorker$a$a r9 = new androidx.work.ListenableWorker$a$a
            r9.<init>()
            return r9
        L_0x0061:
            u1.h r9 = new u1.h
            r2 = 9999(0x270f, float:1.4012E-41)
            android.content.Context r6 = r8.f2624a
            e6.e.C(r6, r5)
            android.content.Context r7 = r8.f2624a
            e6.e.C(r7, r5)
            bb.e r7 = ad.c.K(r7)
            android.app.Notification r6 = cb.c.a(r6, r7)
            r7 = 25
            r9.<init>(r2, r6, r7)
            r0.f6833a = r8
            r0.f6836s = r4
            r8.f2628t = r4
            androidx.work.WorkerParameters r2 = r8.f2625b
            u1.i r6 = r2.f2639f
            android.content.Context r7 = r8.f2624a
            java.util.UUID r2 = r2.f2634a
            e2.n r6 = (e2.n) r6
            z6.a r9 = r6.a(r7, r2, r9)
            r2 = r9
            f2.a r2 = (f2.a) r2
            boolean r6 = r2.isDone()
            if (r6 == 0) goto L_0x00a8
            java.lang.Object r9 = r2.get()     // Catch:{ ExecutionException -> 0x009e }
            goto L_0x00cb
        L_0x009e:
            r9 = move-exception
            java.lang.Throwable r0 = r9.getCause()
            if (r0 != 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r9 = r0
        L_0x00a7:
            throw r9
        L_0x00a8:
            ge.l r6 = new ge.l
            pd.d r7 = ad.c.Y(r0)
            r6.<init>(r7, r4)
            r6.u()
            u1.n r4 = new u1.n
            r7 = 0
            r4.<init>(r6, r9, r7)
            u1.e r7 = u1.e.INSTANCE
            r2.d(r4, r7)
            u1.o r2 = new u1.o
            r2.<init>(r9)
            r6.i(r2)
            java.lang.Object r9 = r6.t()
        L_0x00cb:
            if (r9 != r1) goto L_0x00ce
            goto L_0x00d0
        L_0x00ce:
            md.m r9 = md.m.f8555a
        L_0x00d0:
            if (r9 != r1) goto L_0x00d3
            return r1
        L_0x00d3:
            r2 = r8
        L_0x00d4:
            me.c r9 = ge.o0.f5433a
            ge.d0 r9 = c3.k.j(r9)
            io.nodle.cash.ui.worker.NodleWorker$b r4 = new io.nodle.cash.ui.worker.NodleWorker$b
            r6 = 0
            r4.<init>(r2, r6)
            r7 = 3
            ge.g.b(r9, r6, r4, r7)
            android.content.Context r9 = r2.f2624a
            e6.e.C(r9, r5)
            bb.e r9 = ad.c.K(r9)
            long r4 = r9.getScanDuration()
            r0.f6833a = r6
            r0.f6836s = r3
            java.lang.Object r9 = c3.k.f0(r4, r0)
            if (r9 != r1) goto L_0x00fc
            return r1
        L_0x00fc:
            androidx.work.ListenableWorker$a$c r9 = new androidx.work.ListenableWorker$a$c
            r9.<init>()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nodle.cash.ui.worker.NodleWorker.h(pd.d):java.lang.Object");
    }
}
