package e2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public final class p {

    /* renamed from: f  reason: collision with root package name */
    public static final String f4578f = u1.p.e("WorkTimer");

    /* renamed from: a  reason: collision with root package name */
    public final a f4579a;

    /* renamed from: b  reason: collision with root package name */
    public final ScheduledExecutorService f4580b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, c> f4581c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, b> f4582d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final Object f4583e = new Object();

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public int f4584a = 0;

        public final Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            StringBuilder d10 = a.a.d("WorkManager-WorkTimer-thread-");
            d10.append(this.f4584a);
            newThread.setName(d10.toString());
            this.f4584a++;
            return newThread;
        }
    }

    public interface b {
        void b(String str);
    }

    public static class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final p f4585a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4586b;

        public c(p pVar, String str) {
            this.f4585a = pVar;
            this.f4586b = str;
        }

        /* JADX WARNING: type inference failed for: r1v2, types: [java.util.HashMap, java.util.Map<java.lang.String, e2.p$c>] */
        /* JADX WARNING: type inference failed for: r1v7, types: [java.util.Map<java.lang.String, e2.p$b>, java.util.HashMap] */
        public final void run() {
            synchronized (this.f4585a.f4583e) {
                if (((c) this.f4585a.f4581c.remove(this.f4586b)) != null) {
                    b bVar = (b) this.f4585a.f4582d.remove(this.f4586b);
                    if (bVar != null) {
                        bVar.b(this.f4586b);
                    }
                } else {
                    u1.p.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", new Object[]{this.f4586b}), new Throwable[0]);
                }
            }
        }
    }

    public p() {
        a aVar = new a();
        this.f4579a = aVar;
        this.f4580b = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.String, e2.p$c>] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, e2.p$b>, java.util.HashMap] */
    public final void a(String str, b bVar) {
        synchronized (this.f4583e) {
            u1.p.c().a(f4578f, String.format("Starting timer for %s", new Object[]{str}), new Throwable[0]);
            b(str);
            c cVar = new c(this, str);
            this.f4581c.put(str, cVar);
            this.f4582d.put(str, bVar);
            this.f4580b.schedule(cVar, 600000, TimeUnit.MILLISECONDS);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, e2.p$c>] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.Map<java.lang.String, e2.p$b>, java.util.HashMap] */
    public final void b(String str) {
        synchronized (this.f4583e) {
            if (((c) this.f4581c.remove(str)) != null) {
                u1.p.c().a(f4578f, String.format("Stopping timer for %s", new Object[]{str}), new Throwable[0]);
                this.f4582d.remove(str);
            }
        }
    }
}
