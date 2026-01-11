package v1;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import d0.a;
import e2.l;
import g2.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import u1.h;
import u1.p;
import v1.m;

public final class c implements a, c2.a {
    public static final String A = p.e("Processor");

    /* renamed from: a  reason: collision with root package name */
    public PowerManager.WakeLock f12129a;

    /* renamed from: b  reason: collision with root package name */
    public Context f12130b;

    /* renamed from: c  reason: collision with root package name */
    public androidx.work.a f12131c;

    /* renamed from: s  reason: collision with root package name */
    public g2.a f12132s;

    /* renamed from: t  reason: collision with root package name */
    public WorkDatabase f12133t;

    /* renamed from: u  reason: collision with root package name */
    public Map<String, m> f12134u = new HashMap();

    /* renamed from: v  reason: collision with root package name */
    public Map<String, m> f12135v = new HashMap();

    /* renamed from: w  reason: collision with root package name */
    public List<d> f12136w;

    /* renamed from: x  reason: collision with root package name */
    public Set<String> f12137x;

    /* renamed from: y  reason: collision with root package name */
    public final List<a> f12138y;
    public final Object z;

    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public a f12139a;

        /* renamed from: b  reason: collision with root package name */
        public String f12140b;

        /* renamed from: c  reason: collision with root package name */
        public z6.a<Boolean> f12141c;

        public a(a aVar, String str, z6.a<Boolean> aVar2) {
            this.f12139a = aVar;
            this.f12140b = str;
            this.f12141c = aVar2;
        }

        public final void run() {
            boolean z;
            try {
                z = this.f12141c.get().booleanValue();
            } catch (InterruptedException | ExecutionException unused) {
                z = true;
            }
            this.f12139a.a(this.f12140b, z);
        }
    }

    public c(Context context, androidx.work.a aVar, g2.a aVar2, WorkDatabase workDatabase, List<d> list) {
        this.f12130b = context;
        this.f12131c = aVar;
        this.f12132s = aVar2;
        this.f12133t = workDatabase;
        this.f12136w = list;
        this.f12137x = new HashSet();
        this.f12138y = new ArrayList();
        this.f12129a = null;
        this.z = new Object();
    }

    public static boolean c(String str, m mVar) {
        boolean z10;
        if (mVar != null) {
            mVar.H = true;
            mVar.i();
            z6.a<ListenableWorker.a> aVar = mVar.G;
            if (aVar != null) {
                z10 = aVar.isDone();
                mVar.G.cancel(true);
            } else {
                z10 = false;
            }
            ListenableWorker listenableWorker = mVar.f12165u;
            if (listenableWorker == null || z10) {
                p.c().a(m.I, String.format("WorkSpec %s is already done. Not interrupting.", new Object[]{mVar.f12164t}), new Throwable[0]);
            } else {
                listenableWorker.f2626c = true;
                listenableWorker.e();
            }
            p.c().a(A, String.format("WorkerWrapper interrupted for %s", new Object[]{str}), new Throwable[0]);
            return true;
        }
        p.c().a(A, String.format("WorkerWrapper could not be found for %s", new Object[]{str}), new Throwable[0]);
        return false;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<v1.a>, java.util.ArrayList] */
    public final void a(String str, boolean z10) {
        synchronized (this.z) {
            this.f12135v.remove(str);
            p.c().a(A, String.format("%s %s executed; reschedule = %s", new Object[]{c.class.getSimpleName(), str, Boolean.valueOf(z10)}), new Throwable[0]);
            Iterator it = this.f12138y.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a(str, z10);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<v1.a>, java.util.ArrayList] */
    public final void b(a aVar) {
        synchronized (this.z) {
            this.f12138y.add(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final boolean d(String str) {
        boolean z10;
        synchronized (this.z) {
            if (!this.f12135v.containsKey(str)) {
                if (!this.f12134u.containsKey(str)) {
                    z10 = false;
                }
            }
            z10 = true;
        }
        return z10;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<v1.a>, java.util.ArrayList] */
    public final void e(a aVar) {
        synchronized (this.z) {
            this.f12138y.remove(aVar);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final void f(String str, h hVar) {
        synchronized (this.z) {
            p.c().d(A, String.format("Moving WorkSpec (%s) to the foreground", new Object[]{str}), new Throwable[0]);
            m mVar = (m) this.f12135v.remove(str);
            if (mVar != null) {
                if (this.f12129a == null) {
                    PowerManager.WakeLock a10 = l.a(this.f12130b, "ProcessorForegroundLck");
                    this.f12129a = a10;
                    a10.acquire();
                }
                this.f12134u.put(str, mVar);
                Intent e10 = androidx.work.impl.foreground.a.e(this.f12130b, str, hVar);
                Context context = this.f12130b;
                Object obj = d0.a.f4256a;
                if (Build.VERSION.SDK_INT >= 26) {
                    a.e.a(context, e10);
                } else {
                    context.startService(e10);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final boolean g(String str, WorkerParameters.a aVar) {
        synchronized (this.z) {
            if (d(str)) {
                p.c().a(A, String.format("Work %s is already enqueued for processing", new Object[]{str}), new Throwable[0]);
                return false;
            }
            m.a aVar2 = new m.a(this.f12130b, this.f12131c, this.f12132s, this, this.f12133t, str);
            aVar2.g = this.f12136w;
            if (aVar != null) {
                aVar2.f12176h = aVar;
            }
            m mVar = new m(aVar2);
            f2.c<Boolean> cVar = mVar.F;
            cVar.d(new a(this, str, cVar), ((b) this.f12132s).f5229c);
            this.f12135v.put(str, mVar);
            ((b) this.f12132s).f5227a.execute(mVar);
            p.c().a(A, String.format("%s: processing %s", new Object[]{c.class.getSimpleName(), str}), new Throwable[0]);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final void h() {
        synchronized (this.z) {
            if (!(!this.f12134u.isEmpty())) {
                Context context = this.f12130b;
                String str = androidx.work.impl.foreground.a.z;
                Intent intent = new Intent(context, SystemForegroundService.class);
                intent.setAction("ACTION_STOP_FOREGROUND");
                try {
                    this.f12130b.startService(intent);
                } catch (Throwable th2) {
                    p.c().b(A, "Unable to stop foreground service", th2);
                }
                PowerManager.WakeLock wakeLock = this.f12129a;
                if (wakeLock != null) {
                    wakeLock.release();
                    this.f12129a = null;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final boolean i(String str) {
        boolean c10;
        synchronized (this.z) {
            p.c().a(A, String.format("Processor stopping foreground work %s", new Object[]{str}), new Throwable[0]);
            c10 = c(str, (m) this.f12134u.remove(str));
        }
        return c10;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, v1.m>, java.util.HashMap] */
    public final boolean j(String str) {
        boolean c10;
        synchronized (this.z) {
            p.c().a(A, String.format("Processor stopping background work %s", new Object[]{str}), new Throwable[0]);
            c10 = c(str, (m) this.f12135v.remove(str));
        }
        return c10;
    }
}
