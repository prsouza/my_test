package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import e2.i;
import e2.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import u1.p;
import v1.j;

public final class d implements v1.a {
    public static final String z = p.e("SystemAlarmDispatcher");

    /* renamed from: a  reason: collision with root package name */
    public final Context f2700a;

    /* renamed from: b  reason: collision with root package name */
    public final g2.a f2701b;

    /* renamed from: c  reason: collision with root package name */
    public final e2.p f2702c = new e2.p();

    /* renamed from: s  reason: collision with root package name */
    public final v1.c f2703s;

    /* renamed from: t  reason: collision with root package name */
    public final j f2704t;

    /* renamed from: u  reason: collision with root package name */
    public final a f2705u;

    /* renamed from: v  reason: collision with root package name */
    public final Handler f2706v;

    /* renamed from: w  reason: collision with root package name */
    public final List<Intent> f2707w;

    /* renamed from: x  reason: collision with root package name */
    public Intent f2708x;

    /* renamed from: y  reason: collision with root package name */
    public c f2709y;

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        public final void run() {
            C0026d dVar;
            d dVar2;
            synchronized (d.this.f2707w) {
                d dVar3 = d.this;
                dVar3.f2708x = (Intent) dVar3.f2707w.get(0);
            }
            Intent intent = d.this.f2708x;
            if (intent != null) {
                Object action = intent.getAction();
                int intExtra = d.this.f2708x.getIntExtra("KEY_START_ID", 0);
                p c10 = p.c();
                String str = d.z;
                c10.a(str, String.format("Processing command %s, %s", new Object[]{d.this.f2708x, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock a10 = l.a(d.this.f2700a, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    p.c().a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.acquire();
                    d dVar4 = d.this;
                    dVar4.f2705u.e(dVar4.f2708x, intExtra, dVar4);
                    p.c().a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.release();
                    dVar2 = d.this;
                    dVar = new C0026d(dVar2);
                } catch (Throwable th2) {
                    p.c().a(d.z, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, a10}), new Throwable[0]);
                    a10.release();
                    d dVar5 = d.this;
                    dVar5.e(new C0026d(dVar5));
                    throw th2;
                }
                dVar2.e(dVar);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f2711a;

        /* renamed from: b  reason: collision with root package name */
        public final Intent f2712b;

        /* renamed from: c  reason: collision with root package name */
        public final int f2713c;

        public b(d dVar, Intent intent, int i) {
            this.f2711a = dVar;
            this.f2712b = intent;
            this.f2713c = i;
        }

        public final void run() {
            this.f2711a.b(this.f2712b, this.f2713c);
        }
    }

    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d  reason: collision with other inner class name */
    public static class C0026d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final d f2714a;

        public C0026d(d dVar) {
            this.f2714a = dVar;
        }

        /* JADX WARNING: type inference failed for: r6v1, types: [java.util.HashMap, java.util.Map<java.lang.String, v1.a>] */
        /* JADX WARNING: type inference failed for: r2v1, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r6v4, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
        public final void run() {
            boolean z;
            d dVar = this.f2714a;
            Objects.requireNonNull(dVar);
            p c10 = p.c();
            String str = d.z;
            c10.a(str, "Checking if commands are complete.", new Throwable[0]);
            dVar.c();
            synchronized (dVar.f2707w) {
                boolean z10 = true;
                if (dVar.f2708x != null) {
                    p.c().a(str, String.format("Removing command %s", new Object[]{dVar.f2708x}), new Throwable[0]);
                    if (((Intent) dVar.f2707w.remove(0)).equals(dVar.f2708x)) {
                        dVar.f2708x = null;
                    } else {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                }
                i iVar = ((g2.b) dVar.f2701b).f5227a;
                a aVar = dVar.f2705u;
                synchronized (aVar.f2684c) {
                    z = !aVar.f2683b.isEmpty();
                }
                if (!z) {
                    if (dVar.f2707w.isEmpty()) {
                        synchronized (iVar.f4546c) {
                            if (iVar.f4544a.isEmpty()) {
                                z10 = false;
                            }
                        }
                        if (!z10) {
                            p.c().a(str, "No more commands & intents.", new Throwable[0]);
                            c cVar = dVar.f2709y;
                            if (cVar != null) {
                                ((SystemAlarmService) cVar).b();
                            }
                        }
                    }
                }
                if (!dVar.f2707w.isEmpty()) {
                    dVar.f();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f2700a = applicationContext;
        this.f2705u = new a(applicationContext);
        j s22 = j.s2(context);
        this.f2704t = s22;
        v1.c cVar = s22.A;
        this.f2703s = cVar;
        this.f2701b = s22.f12153y;
        cVar.b(this);
        this.f2707w = new ArrayList();
        this.f2708x = null;
        this.f2706v = new Handler(Looper.getMainLooper());
    }

    public final void a(String str, boolean z10) {
        Context context = this.f2700a;
        String str2 = a.f2681s;
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        e(new b(this, intent, 0));
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r2v3, types: [java.util.List<android.content.Intent>, java.util.ArrayList] */
    public final boolean b(Intent intent, int i) {
        boolean z10;
        p c10 = p.c();
        String str = z;
        c10.a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.c().f(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f2707w) {
                Iterator it = this.f2707w.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            z10 = true;
                            break;
                        }
                    } else {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                return false;
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.f2707w) {
            boolean z11 = !this.f2707w.isEmpty();
            this.f2707w.add(intent);
            if (!z11) {
                f();
            }
        }
        return true;
    }

    public final void c() {
        if (this.f2706v.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void d() {
        p.c().a(z, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f2703s.e(this);
        e2.p pVar = this.f2702c;
        if (!pVar.f4580b.isShutdown()) {
            pVar.f4580b.shutdownNow();
        }
        this.f2709y = null;
    }

    public final void e(Runnable runnable) {
        this.f2706v.post(runnable);
    }

    public final void f() {
        c();
        PowerManager.WakeLock a10 = l.a(this.f2700a, "ProcessCommand");
        try {
            a10.acquire();
            ((g2.b) this.f2704t.f12153y).a(new a());
        } finally {
            a10.release();
        }
    }
}
