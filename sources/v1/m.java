package v1;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import d2.b;
import d2.n;
import d2.o;
import d2.q;
import d2.s;
import e2.f;
import f2.c;
import h1.g0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import u1.p;
import u1.v;

public final class m implements Runnable {
    public static final String I = p.e("WorkerWrapper");
    public d2.p A;
    public b B;
    public s C;
    public List<String> D;
    public String E;
    public c<Boolean> F = new c<>();
    public z6.a<ListenableWorker.a> G = null;
    public volatile boolean H;

    /* renamed from: a  reason: collision with root package name */
    public Context f12160a;

    /* renamed from: b  reason: collision with root package name */
    public String f12161b;

    /* renamed from: c  reason: collision with root package name */
    public List<d> f12162c;

    /* renamed from: s  reason: collision with root package name */
    public WorkerParameters.a f12163s;

    /* renamed from: t  reason: collision with root package name */
    public o f12164t;

    /* renamed from: u  reason: collision with root package name */
    public ListenableWorker f12165u;

    /* renamed from: v  reason: collision with root package name */
    public g2.a f12166v;

    /* renamed from: w  reason: collision with root package name */
    public ListenableWorker.a f12167w = new ListenableWorker.a.C0023a();

    /* renamed from: x  reason: collision with root package name */
    public androidx.work.a f12168x;

    /* renamed from: y  reason: collision with root package name */
    public c2.a f12169y;
    public WorkDatabase z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Context f12170a;

        /* renamed from: b  reason: collision with root package name */
        public c2.a f12171b;

        /* renamed from: c  reason: collision with root package name */
        public g2.a f12172c;

        /* renamed from: d  reason: collision with root package name */
        public androidx.work.a f12173d;

        /* renamed from: e  reason: collision with root package name */
        public WorkDatabase f12174e;

        /* renamed from: f  reason: collision with root package name */
        public String f12175f;
        public List<d> g;

        /* renamed from: h  reason: collision with root package name */
        public WorkerParameters.a f12176h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, g2.a aVar2, c2.a aVar3, WorkDatabase workDatabase, String str) {
            this.f12170a = context.getApplicationContext();
            this.f12172c = aVar2;
            this.f12171b = aVar3;
            this.f12173d = aVar;
            this.f12174e = workDatabase;
            this.f12175f = str;
        }
    }

    public m(a aVar) {
        this.f12160a = aVar.f12170a;
        this.f12166v = aVar.f12172c;
        this.f12169y = aVar.f12171b;
        this.f12161b = aVar.f12175f;
        this.f12162c = aVar.g;
        this.f12163s = aVar.f12176h;
        this.f12165u = null;
        this.f12168x = aVar.f12173d;
        WorkDatabase workDatabase = aVar.f12174e;
        this.z = workDatabase;
        this.A = workDatabase.w();
        this.B = this.z.r();
        this.C = this.z.x();
    }

    public final void a(ListenableWorker.a aVar) {
        if (aVar instanceof ListenableWorker.a.c) {
            p.c().d(I, String.format("Worker result SUCCESS for %s", new Object[]{this.E}), new Throwable[0]);
            if (this.f12164t.c()) {
                e();
                return;
            }
            this.z.c();
            try {
                d2.p pVar = this.A;
                ((q) pVar).o(v.SUCCEEDED, this.f12161b);
                androidx.work.b bVar = ((ListenableWorker.a.c) this.f12167w).f2630a;
                ((q) this.A).m(this.f12161b, bVar);
                long currentTimeMillis = System.currentTimeMillis();
                Iterator it = ((ArrayList) ((d2.c) this.B).a(this.f12161b)).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (((q) this.A).f(str) == v.BLOCKED && ((d2.c) this.B).b(str)) {
                        p.c().d(I, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                        d2.p pVar2 = this.A;
                        ((q) pVar2).o(v.ENQUEUED, str);
                        ((q) this.A).n(str, currentTimeMillis);
                    }
                }
                this.z.p();
            } finally {
                this.z.l();
                f(false);
            }
        } else if (aVar instanceof ListenableWorker.a.b) {
            p.c().d(I, String.format("Worker result RETRY for %s", new Object[]{this.E}), new Throwable[0]);
            d();
        } else {
            p.c().d(I, String.format("Worker result FAILURE for %s", new Object[]{this.E}), new Throwable[0]);
            if (this.f12164t.c()) {
                e();
            } else {
                h();
            }
        }
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (((q) this.A).f(str2) != v.CANCELLED) {
                d2.p pVar = this.A;
                ((q) pVar).o(v.FAILED, str2);
            }
            linkedList.addAll(((d2.c) this.B).a(str2));
        }
    }

    public final void c() {
        if (!i()) {
            this.z.c();
            try {
                v f10 = ((q) this.A).f(this.f12161b);
                ((n) this.z.v()).a(this.f12161b);
                if (f10 == null) {
                    f(false);
                } else if (f10 == v.RUNNING) {
                    a(this.f12167w);
                } else if (!f10.isFinished()) {
                    d();
                }
                this.z.p();
            } finally {
                this.z.l();
            }
        }
        List<d> list = this.f12162c;
        if (list != null) {
            for (d b10 : list) {
                b10.b(this.f12161b);
            }
            e.a(this.f12168x, this.z, this.f12162c);
        }
    }

    public final void d() {
        this.z.c();
        try {
            d2.p pVar = this.A;
            ((q) pVar).o(v.ENQUEUED, this.f12161b);
            ((q) this.A).n(this.f12161b, System.currentTimeMillis());
            ((q) this.A).k(this.f12161b, -1);
            this.z.p();
        } finally {
            this.z.l();
            f(true);
        }
    }

    public final void e() {
        this.z.c();
        try {
            ((q) this.A).n(this.f12161b, System.currentTimeMillis());
            d2.p pVar = this.A;
            ((q) pVar).o(v.ENQUEUED, this.f12161b);
            ((q) this.A).l(this.f12161b);
            ((q) this.A).k(this.f12161b, -1);
            this.z.p();
        } finally {
            this.z.l();
            f(false);
        }
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final void f(boolean z10) {
        g0 e10;
        Cursor o4;
        ListenableWorker listenableWorker;
        this.z.c();
        try {
            q qVar = (q) this.z.w();
            Objects.requireNonNull(qVar);
            e10 = g0.e("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
            qVar.f4311a.b();
            o4 = qVar.f4311a.o(e10);
            boolean z11 = o4.moveToFirst() && o4.getInt(0) != 0;
            o4.close();
            e10.release();
            if (!z11) {
                f.a(this.f12160a, RescheduleReceiver.class, false);
            }
            if (z10) {
                ((q) this.A).o(v.ENQUEUED, this.f12161b);
                ((q) this.A).k(this.f12161b, -1);
            }
            if (!(this.f12164t == null || (listenableWorker = this.f12165u) == null || !listenableWorker.b())) {
                c2.a aVar = this.f12169y;
                String str = this.f12161b;
                c cVar = (c) aVar;
                synchronized (cVar.z) {
                    cVar.f12134u.remove(str);
                    cVar.h();
                }
            }
            this.z.p();
            this.z.l();
            this.F.j(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            this.z.l();
            throw th2;
        }
    }

    public final void g() {
        v f10 = ((q) this.A).f(this.f12161b);
        if (f10 == v.RUNNING) {
            p.c().a(I, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.f12161b}), new Throwable[0]);
            f(true);
            return;
        }
        p.c().a(I, String.format("Status for %s is %s; not doing any work", new Object[]{this.f12161b, f10}), new Throwable[0]);
        f(false);
    }

    public final void h() {
        this.z.c();
        try {
            b(this.f12161b);
            androidx.work.b bVar = ((ListenableWorker.a.C0023a) this.f12167w).f2629a;
            ((q) this.A).m(this.f12161b, bVar);
            this.z.p();
        } finally {
            this.z.l();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.H) {
            return false;
        }
        p.c().a(I, String.format("Work interrupted for %s", new Object[]{this.E}), new Throwable[0]);
        v f10 = ((q) this.A).f(this.f12161b);
        if (f10 == null) {
            f(false);
        } else {
            f(!f10.isFinished());
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00c1, code lost:
        if ((r0.f4294b == r3 && r0.f4301k > 0) != false) goto L_0x00c3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            d2.s r0 = r14.C
            java.lang.String r1 = r14.f12161b
            d2.t r0 = (d2.t) r0
            java.util.List r0 = r0.a(r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r14.D = r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Work [ id="
            r1.<init>(r2)
            java.lang.String r2 = r14.f12161b
            r1.append(r2)
            java.lang.String r2 = ", tags={ "
            r1.append(r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
            r3 = r2
        L_0x0025:
            boolean r4 = r0.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r3 == 0) goto L_0x0036
            r3 = r5
            goto L_0x003b
        L_0x0036:
            java.lang.String r5 = ", "
            r1.append(r5)
        L_0x003b:
            r1.append(r4)
            goto L_0x0025
        L_0x003f:
            java.lang.String r0 = " } ]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.E = r0
            boolean r0 = r14.i()
            if (r0 == 0) goto L_0x0052
            goto L_0x02c9
        L_0x0052:
            androidx.work.impl.WorkDatabase r0 = r14.z
            r0.c()
            d2.p r0 = r14.A     // Catch:{ all -> 0x02d9 }
            java.lang.String r1 = r14.f12161b     // Catch:{ all -> 0x02d9 }
            d2.q r0 = (d2.q) r0     // Catch:{ all -> 0x02d9 }
            d2.o r0 = r0.h(r1)     // Catch:{ all -> 0x02d9 }
            r14.f12164t = r0     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x0086
            u1.p r0 = u1.p.c()     // Catch:{ all -> 0x02d9 }
            java.lang.String r1 = I     // Catch:{ all -> 0x02d9 }
            java.lang.String r3 = "Didn't find WorkSpec for id %s"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d9 }
            java.lang.String r4 = r14.f12161b     // Catch:{ all -> 0x02d9 }
            r2[r5] = r4     // Catch:{ all -> 0x02d9 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02d9 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d9 }
            r0.b(r1, r2, r3)     // Catch:{ all -> 0x02d9 }
            r14.f(r5)     // Catch:{ all -> 0x02d9 }
            androidx.work.impl.WorkDatabase r0 = r14.z     // Catch:{ all -> 0x02d9 }
            r0.p()     // Catch:{ all -> 0x02d9 }
            goto L_0x00ff
        L_0x0086:
            u1.v r1 = r0.f4294b     // Catch:{ all -> 0x02d9 }
            u1.v r3 = u1.v.ENQUEUED     // Catch:{ all -> 0x02d9 }
            if (r1 == r3) goto L_0x00ae
            r14.g()     // Catch:{ all -> 0x02d9 }
            androidx.work.impl.WorkDatabase r0 = r14.z     // Catch:{ all -> 0x02d9 }
            r0.p()     // Catch:{ all -> 0x02d9 }
            u1.p r0 = u1.p.c()     // Catch:{ all -> 0x02d9 }
            java.lang.String r1 = I     // Catch:{ all -> 0x02d9 }
            java.lang.String r3 = "%s is not in ENQUEUED state. Nothing more to do."
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d9 }
            d2.o r4 = r14.f12164t     // Catch:{ all -> 0x02d9 }
            java.lang.String r4 = r4.f4295c     // Catch:{ all -> 0x02d9 }
            r2[r5] = r4     // Catch:{ all -> 0x02d9 }
            java.lang.String r2 = java.lang.String.format(r3, r2)     // Catch:{ all -> 0x02d9 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d9 }
            r0.a(r1, r2, r3)     // Catch:{ all -> 0x02d9 }
            goto L_0x00ff
        L_0x00ae:
            boolean r0 = r0.c()     // Catch:{ all -> 0x02d9 }
            if (r0 != 0) goto L_0x00c3
            d2.o r0 = r14.f12164t     // Catch:{ all -> 0x02d9 }
            u1.v r1 = r0.f4294b     // Catch:{ all -> 0x02d9 }
            if (r1 != r3) goto L_0x00c0
            int r0 = r0.f4301k     // Catch:{ all -> 0x02d9 }
            if (r0 <= 0) goto L_0x00c0
            r0 = r2
            goto L_0x00c1
        L_0x00c0:
            r0 = r5
        L_0x00c1:
            if (r0 == 0) goto L_0x0106
        L_0x00c3:
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02d9 }
            d2.o r3 = r14.f12164t     // Catch:{ all -> 0x02d9 }
            long r6 = r3.f4304n     // Catch:{ all -> 0x02d9 }
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x00d3
            r4 = r2
            goto L_0x00d4
        L_0x00d3:
            r4 = r5
        L_0x00d4:
            if (r4 != 0) goto L_0x0106
            long r3 = r3.a()     // Catch:{ all -> 0x02d9 }
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0106
            u1.p r0 = u1.p.c()     // Catch:{ all -> 0x02d9 }
            java.lang.String r1 = I     // Catch:{ all -> 0x02d9 }
            java.lang.String r3 = "Delaying execution for %s because it is being executed before schedule."
            java.lang.Object[] r4 = new java.lang.Object[r2]     // Catch:{ all -> 0x02d9 }
            d2.o r6 = r14.f12164t     // Catch:{ all -> 0x02d9 }
            java.lang.String r6 = r6.f4295c     // Catch:{ all -> 0x02d9 }
            r4[r5] = r6     // Catch:{ all -> 0x02d9 }
            java.lang.String r3 = java.lang.String.format(r3, r4)     // Catch:{ all -> 0x02d9 }
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]     // Catch:{ all -> 0x02d9 }
            r0.a(r1, r3, r4)     // Catch:{ all -> 0x02d9 }
            r14.f(r2)     // Catch:{ all -> 0x02d9 }
            androidx.work.impl.WorkDatabase r0 = r14.z     // Catch:{ all -> 0x02d9 }
            r0.p()     // Catch:{ all -> 0x02d9 }
        L_0x00ff:
            androidx.work.impl.WorkDatabase r0 = r14.z
            r0.l()
            goto L_0x02c9
        L_0x0106:
            androidx.work.impl.WorkDatabase r0 = r14.z     // Catch:{ all -> 0x02d9 }
            r0.p()     // Catch:{ all -> 0x02d9 }
            androidx.work.impl.WorkDatabase r0 = r14.z
            r0.l()
            d2.o r0 = r14.f12164t
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x011f
            d2.o r0 = r14.f12164t
            androidx.work.b r0 = r0.f4297e
        L_0x011c:
            r8 = r0
            goto L_0x01c6
        L_0x011f:
            androidx.work.a r0 = r14.f12168x
            u1.k r0 = r0.f2645d
            d2.o r1 = r14.f12164t
            java.lang.String r1 = r1.f4296d
            java.util.Objects.requireNonNull(r0)
            java.lang.String r0 = u1.j.f11643a
            r0 = 0
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch:{ Exception -> 0x0139 }
            java.lang.Object r3 = r3.newInstance()     // Catch:{ Exception -> 0x0139 }
            u1.j r3 = (u1.j) r3     // Catch:{ Exception -> 0x0139 }
            r0 = r3
            goto L_0x014d
        L_0x0139:
            r3 = move-exception
            u1.p r4 = u1.p.c()
            java.lang.String r6 = u1.j.f11643a
            java.lang.String r7 = "Trouble instantiating + "
            java.lang.String r1 = a8.a.c(r7, r1)
            java.lang.Throwable[] r7 = new java.lang.Throwable[r2]
            r7[r5] = r3
            r4.b(r6, r1, r7)
        L_0x014d:
            if (r0 != 0) goto L_0x016d
            u1.p r0 = u1.p.c()
            java.lang.String r1 = I
            java.lang.Object[] r2 = new java.lang.Object[r2]
            d2.o r3 = r14.f12164t
            java.lang.String r3 = r3.f4296d
            r2[r5] = r3
            java.lang.String r3 = "Could not create Input Merger %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.b(r1, r2, r3)
            r14.h()
            goto L_0x02c9
        L_0x016d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            d2.o r3 = r14.f12164t
            androidx.work.b r3 = r3.f4297e
            r1.add(r3)
            d2.p r3 = r14.A
            java.lang.String r4 = r14.f12161b
            d2.q r3 = (d2.q) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.String r6 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            h1.g0 r6 = h1.g0.e(r6, r2)
            if (r4 != 0) goto L_0x018e
            r6.D(r2)
            goto L_0x0191
        L_0x018e:
            r6.r(r2, r4)
        L_0x0191:
            h1.e0 r4 = r3.f4311a
            r4.b()
            h1.e0 r3 = r3.f4311a
            android.database.Cursor r3 = r3.o(r6)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x02d1 }
            int r7 = r3.getCount()     // Catch:{ all -> 0x02d1 }
            r4.<init>(r7)     // Catch:{ all -> 0x02d1 }
        L_0x01a5:
            boolean r7 = r3.moveToNext()     // Catch:{ all -> 0x02d1 }
            if (r7 == 0) goto L_0x01b7
            byte[] r7 = r3.getBlob(r5)     // Catch:{ all -> 0x02d1 }
            androidx.work.b r7 = androidx.work.b.a(r7)     // Catch:{ all -> 0x02d1 }
            r4.add(r7)     // Catch:{ all -> 0x02d1 }
            goto L_0x01a5
        L_0x01b7:
            r3.close()
            r6.release()
            r1.addAll(r4)
            androidx.work.b r0 = r0.a(r1)
            goto L_0x011c
        L_0x01c6:
            androidx.work.WorkerParameters r0 = new androidx.work.WorkerParameters
            java.lang.String r1 = r14.f12161b
            java.util.UUID r7 = java.util.UUID.fromString(r1)
            java.util.List<java.lang.String> r9 = r14.D
            d2.o r1 = r14.f12164t
            int r1 = r1.f4301k
            androidx.work.a r1 = r14.f12168x
            java.util.concurrent.ExecutorService r10 = r1.f2642a
            g2.a r11 = r14.f12166v
            u1.x r12 = r1.f2644c
            e2.o r1 = new e2.o
            e2.n r13 = new e2.n
            androidx.work.impl.WorkDatabase r1 = r14.z
            c2.a r3 = r14.f12169y
            g2.a r4 = r14.f12166v
            r13.<init>(r1, r3, r4)
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            androidx.work.ListenableWorker r1 = r14.f12165u
            if (r1 != 0) goto L_0x0201
            androidx.work.a r1 = r14.f12168x
            u1.x r1 = r1.f2644c
            android.content.Context r3 = r14.f12160a
            d2.o r4 = r14.f12164t
            java.lang.String r4 = r4.f4295c
            androidx.work.ListenableWorker r1 = r1.a(r3, r4, r0)
            r14.f12165u = r1
        L_0x0201:
            androidx.work.ListenableWorker r1 = r14.f12165u
            if (r1 != 0) goto L_0x0223
            u1.p r0 = u1.p.c()
            java.lang.String r1 = I
            java.lang.Object[] r2 = new java.lang.Object[r2]
            d2.o r3 = r14.f12164t
            java.lang.String r3 = r3.f4295c
            r2[r5] = r3
            java.lang.String r3 = "Could not create Worker %s"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.b(r1, r2, r3)
            r14.h()
            goto L_0x02c9
        L_0x0223:
            boolean r3 = r1.f2627s
            if (r3 == 0) goto L_0x0245
            u1.p r0 = u1.p.c()
            java.lang.String r1 = I
            java.lang.Object[] r2 = new java.lang.Object[r2]
            d2.o r3 = r14.f12164t
            java.lang.String r3 = r3.f4295c
            r2[r5] = r3
            java.lang.String r3 = "Received an already-used Worker %s; WorkerFactory should return new instances"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
            r0.b(r1, r2, r3)
            r14.h()
            goto L_0x02c9
        L_0x0245:
            r1.f2627s = r2
            androidx.work.impl.WorkDatabase r1 = r14.z
            r1.c()
            d2.p r1 = r14.A     // Catch:{ all -> 0x02ca }
            java.lang.String r3 = r14.f12161b     // Catch:{ all -> 0x02ca }
            d2.q r1 = (d2.q) r1     // Catch:{ all -> 0x02ca }
            u1.v r1 = r1.f(r3)     // Catch:{ all -> 0x02ca }
            u1.v r3 = u1.v.ENQUEUED     // Catch:{ all -> 0x02ca }
            if (r1 != r3) goto L_0x0273
            d2.p r1 = r14.A     // Catch:{ all -> 0x02ca }
            u1.v r3 = u1.v.RUNNING     // Catch:{ all -> 0x02ca }
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x02ca }
            java.lang.String r6 = r14.f12161b     // Catch:{ all -> 0x02ca }
            r4[r5] = r6     // Catch:{ all -> 0x02ca }
            d2.q r1 = (d2.q) r1     // Catch:{ all -> 0x02ca }
            r1.o(r3, r4)     // Catch:{ all -> 0x02ca }
            d2.p r1 = r14.A     // Catch:{ all -> 0x02ca }
            java.lang.String r3 = r14.f12161b     // Catch:{ all -> 0x02ca }
            d2.q r1 = (d2.q) r1     // Catch:{ all -> 0x02ca }
            r1.j(r3)     // Catch:{ all -> 0x02ca }
            goto L_0x0274
        L_0x0273:
            r2 = r5
        L_0x0274:
            androidx.work.impl.WorkDatabase r1 = r14.z     // Catch:{ all -> 0x02ca }
            r1.p()     // Catch:{ all -> 0x02ca }
            androidx.work.impl.WorkDatabase r1 = r14.z
            r1.l()
            if (r2 == 0) goto L_0x02c6
            boolean r1 = r14.i()
            if (r1 == 0) goto L_0x0287
            goto L_0x02c9
        L_0x0287:
            f2.c r1 = new f2.c
            r1.<init>()
            e2.m r8 = new e2.m
            android.content.Context r3 = r14.f12160a
            d2.o r4 = r14.f12164t
            androidx.work.ListenableWorker r5 = r14.f12165u
            u1.i r6 = r0.f2639f
            g2.a r7 = r14.f12166v
            r2 = r8
            r2.<init>(r3, r4, r5, r6, r7)
            g2.a r0 = r14.f12166v
            g2.b r0 = (g2.b) r0
            g2.b$a r0 = r0.f5229c
            r0.execute(r8)
            f2.c<java.lang.Void> r0 = r8.f4560a
            v1.k r2 = new v1.k
            r2.<init>(r14, r0, r1)
            g2.a r3 = r14.f12166v
            g2.b r3 = (g2.b) r3
            g2.b$a r3 = r3.f5229c
            r0.d(r2, r3)
            java.lang.String r0 = r14.E
            v1.l r2 = new v1.l
            r2.<init>(r14, r1, r0)
            g2.a r0 = r14.f12166v
            g2.b r0 = (g2.b) r0
            e2.i r0 = r0.f5227a
            r1.d(r2, r0)
            goto L_0x02c9
        L_0x02c6:
            r14.g()
        L_0x02c9:
            return
        L_0x02ca:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r14.z
            r1.l()
            throw r0
        L_0x02d1:
            r0 = move-exception
            r3.close()
            r6.release()
            throw r0
        L_0x02d9:
            r0 = move-exception
            androidx.work.impl.WorkDatabase r1 = r14.z
            r1.l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.m.run():void");
    }
}
