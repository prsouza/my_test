package v1;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.support.v4.media.b;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.impl.utils.ForceStopRunnable;
import d2.q;
import e2.f;
import e2.g;
import e2.i;
import e2.k;
import h1.b0;
import h1.e0;
import io.nodle.cash.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import l1.e;
import u1.p;
import u1.s;
import u1.w;
import w1.c;

public final class j extends b {
    public static j E = null;
    public static j F = null;
    public static final Object G = new Object();
    public c A;
    public g B;
    public boolean C;
    public BroadcastReceiver.PendingResult D;

    /* renamed from: v  reason: collision with root package name */
    public Context f12150v;

    /* renamed from: w  reason: collision with root package name */
    public a f12151w;

    /* renamed from: x  reason: collision with root package name */
    public WorkDatabase f12152x;

    /* renamed from: y  reason: collision with root package name */
    public g2.a f12153y;
    public List<d> z;

    static {
        p.e("WorkManagerImpl");
    }

    /* JADX INFO: finally extract failed */
    public j(Context context, a aVar, g2.a aVar2) {
        e0.a<WorkDatabase> aVar3;
        a aVar4 = aVar;
        g2.a aVar5 = aVar2;
        boolean z10 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        i iVar = ((g2.b) aVar5).f5227a;
        int i = WorkDatabase.f2654o;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z10) {
            aVar3 = new e0.a<>(applicationContext, cls, (String) null);
            aVar3.f5692h = true;
        } else {
            String str = i.f12148a;
            aVar3 = b0.a(applicationContext, cls, "androidx.work.workdb");
            aVar3.g = new g(applicationContext);
        }
        aVar3.f5690e = iVar;
        h hVar = new h();
        if (aVar3.f5689d == null) {
            aVar3.f5689d = new ArrayList<>();
        }
        aVar3.f5689d.add(hVar);
        aVar3.a(androidx.work.impl.a.f2664a);
        aVar3.a(new a.h(applicationContext, 2, 3));
        aVar3.a(androidx.work.impl.a.f2665b);
        aVar3.a(androidx.work.impl.a.f2666c);
        aVar3.a(new a.h(applicationContext, 5, 6));
        aVar3.a(androidx.work.impl.a.f2667d);
        aVar3.a(androidx.work.impl.a.f2668e);
        aVar3.a(androidx.work.impl.a.f2669f);
        aVar3.a(new a.i(applicationContext));
        aVar3.a(new a.h(applicationContext, 10, 11));
        aVar3.a(androidx.work.impl.a.g);
        aVar3.c();
        WorkDatabase b10 = aVar3.b();
        Context applicationContext2 = context.getApplicationContext();
        p.a aVar6 = new p.a(aVar4.f2647f);
        synchronized (p.class) {
            try {
                p.f11651a = aVar6;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        String str2 = e.f12142a;
        y1.b bVar = new y1.b(applicationContext2, this);
        f.a(applicationContext2, SystemJobService.class, true);
        p.c().a(e.f12142a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List<d> asList = Arrays.asList(new d[]{bVar, new c(applicationContext2, aVar, aVar5, this)});
        c cVar = new c(context, aVar, aVar2, b10, asList);
        Context applicationContext3 = context.getApplicationContext();
        this.f12150v = applicationContext3;
        this.f12151w = aVar4;
        this.f12153y = aVar5;
        this.f12152x = b10;
        this.z = asList;
        this.A = cVar;
        this.B = new g(b10);
        this.C = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext3.isDeviceProtectedStorage()) {
            ((g2.b) this.f12153y).a(new ForceStopRunnable(applicationContext3, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static v1.j s2(android.content.Context r2) {
        /*
            java.lang.Object r0 = G
            monitor-enter(r0)
            monitor-enter(r0)     // Catch:{ all -> 0x0033 }
            v1.j r1 = E     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x000a
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            goto L_0x000d
        L_0x000a:
            v1.j r1 = F     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
        L_0x000d:
            if (r1 != 0) goto L_0x002e
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0033 }
            boolean r1 = r2 instanceof androidx.work.a.b     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x0026
            r1 = r2
            androidx.work.a$b r1 = (androidx.work.a.b) r1     // Catch:{ all -> 0x0033 }
            androidx.work.a r1 = r1.a()     // Catch:{ all -> 0x0033 }
            t2(r2, r1)     // Catch:{ all -> 0x0033 }
            v1.j r1 = s2(r2)     // Catch:{ all -> 0x0033 }
            goto L_0x002e
        L_0x0026:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0033 }
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r2.<init>(r1)     // Catch:{ all -> 0x0033 }
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r1
        L_0x0030:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r2     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.j.s2(android.content.Context):v1.j");
    }

    public static void t2(Context context, androidx.work.a aVar) {
        synchronized (G) {
            j jVar = E;
            if (jVar != null) {
                if (F != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (jVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (F == null) {
                    F = new j(applicationContext, aVar, new g2.b(aVar.f2643b));
                }
                E = F;
            }
        }
    }

    public final s r2(List<? extends w> list) {
        if (!list.isEmpty()) {
            return new f(this, (String) null, u1.g.KEEP, list, (List<f>) null).r2();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public final void u2() {
        synchronized (G) {
            this.C = true;
            BroadcastReceiver.PendingResult pendingResult = this.D;
            if (pendingResult != null) {
                pendingResult.finish();
                this.D = null;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void v2() {
        List<JobInfo> d10;
        Context context = this.f12150v;
        String str = y1.b.f13370t;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (!(jobScheduler == null || (d10 = y1.b.d(context, jobScheduler)) == null)) {
            ArrayList arrayList = (ArrayList) d10;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    y1.b.a(jobScheduler, ((JobInfo) it.next()).getId());
                }
            }
        }
        q qVar = (q) this.f12152x.w();
        qVar.f4311a.b();
        e a10 = qVar.i.a();
        qVar.f4311a.c();
        try {
            a10.x();
            qVar.f4311a.p();
            qVar.f4311a.l();
            qVar.i.d(a10);
            e.a(this.f12151w, this.f12152x, this.z);
        } catch (Throwable th2) {
            qVar.f4311a.l();
            qVar.i.d(a10);
            throw th2;
        }
    }

    public final void w2(String str) {
        ((g2.b) this.f12153y).a(new k(this, str, false));
    }
}
