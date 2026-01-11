package f2;

import androidx.fragment.app.o;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class a<V> implements z6.a<V> {

    /* renamed from: s  reason: collision with root package name */
    public static final boolean f4910s = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: t  reason: collision with root package name */
    public static final Logger f4911t = Logger.getLogger(a.class.getName());

    /* renamed from: u  reason: collision with root package name */
    public static final C0075a f4912u;

    /* renamed from: v  reason: collision with root package name */
    public static final Object f4913v = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile Object f4914a;

    /* renamed from: b  reason: collision with root package name */
    public volatile d f4915b;

    /* renamed from: c  reason: collision with root package name */
    public volatile h f4916c;

    /* renamed from: f2.a$a  reason: collision with other inner class name */
    public static abstract class C0075a {
        public abstract boolean a(a<?> aVar, d dVar, d dVar2);

        public abstract boolean b(a<?> aVar, Object obj, Object obj2);

        public abstract boolean c(a<?> aVar, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    public static final class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f4917c;

        /* renamed from: d  reason: collision with root package name */
        public static final b f4918d;

        /* renamed from: a  reason: collision with root package name */
        public final boolean f4919a;

        /* renamed from: b  reason: collision with root package name */
        public final Throwable f4920b;

        static {
            if (a.f4910s) {
                f4918d = null;
                f4917c = null;
                return;
            }
            f4918d = new b(false, (Throwable) null);
            f4917c = new b(true, (Throwable) null);
        }

        public b(boolean z, Throwable th2) {
            this.f4919a = z;
            this.f4920b = th2;
        }
    }

    public static final class c {

        /* renamed from: b  reason: collision with root package name */
        public static final c f4921b = new c(new C0076a());

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f4922a;

        /* renamed from: f2.a$c$a  reason: collision with other inner class name */
        public class C0076a extends Throwable {
            public C0076a() {
                super("Failure occurred while trying to finish a future.");
            }

            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public c(Throwable th2) {
            boolean z = a.f4910s;
            Objects.requireNonNull(th2);
            this.f4922a = th2;
        }
    }

    public static final class d {

        /* renamed from: d  reason: collision with root package name */
        public static final d f4923d = new d((Runnable) null, (Executor) null);

        /* renamed from: a  reason: collision with root package name */
        public final Runnable f4924a;

        /* renamed from: b  reason: collision with root package name */
        public final Executor f4925b;

        /* renamed from: c  reason: collision with root package name */
        public d f4926c;

        public d(Runnable runnable, Executor executor) {
            this.f4924a = runnable;
            this.f4925b = executor;
        }
    }

    public static final class e extends C0075a {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, Thread> f4927a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<h, h> f4928b;

        /* renamed from: c  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, h> f4929c;

        /* renamed from: d  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, d> f4930d;

        /* renamed from: e  reason: collision with root package name */
        public final AtomicReferenceFieldUpdater<a, Object> f4931e;

        public e(AtomicReferenceFieldUpdater<h, Thread> atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater<h, h> atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater<a, Object> atomicReferenceFieldUpdater5) {
            this.f4927a = atomicReferenceFieldUpdater;
            this.f4928b = atomicReferenceFieldUpdater2;
            this.f4929c = atomicReferenceFieldUpdater3;
            this.f4930d = atomicReferenceFieldUpdater4;
            this.f4931e = atomicReferenceFieldUpdater5;
        }

        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            AtomicReferenceFieldUpdater<a, d> atomicReferenceFieldUpdater = this.f4930d;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, dVar, dVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != dVar) {
                    return false;
                }
            }
            return true;
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = this.f4931e;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, obj, obj2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != obj) {
                    return false;
                }
            }
            return true;
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            AtomicReferenceFieldUpdater<a, h> atomicReferenceFieldUpdater = this.f4929c;
            while (!atomicReferenceFieldUpdater.compareAndSet(aVar, hVar, hVar2)) {
                if (atomicReferenceFieldUpdater.get(aVar) != hVar) {
                    return false;
                }
            }
            return true;
        }

        public final void d(h hVar, h hVar2) {
            this.f4928b.lazySet(hVar, hVar2);
        }

        public final void e(h hVar, Thread thread) {
            this.f4927a.lazySet(hVar, thread);
        }
    }

    public static final class f<V> implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final a<V> f4932a;

        /* renamed from: b  reason: collision with root package name */
        public final z6.a<? extends V> f4933b;

        public f(a<V> aVar, z6.a<? extends V> aVar2) {
            this.f4932a = aVar;
            this.f4933b = aVar2;
        }

        public final void run() {
            if (this.f4932a.f4914a == this) {
                if (a.f4912u.b(this.f4932a, this, a.f(this.f4933b))) {
                    a.b(this.f4932a);
                }
            }
        }
    }

    public static final class g extends C0075a {
        public final boolean a(a<?> aVar, d dVar, d dVar2) {
            synchronized (aVar) {
                if (aVar.f4915b != dVar) {
                    return false;
                }
                aVar.f4915b = dVar2;
                return true;
            }
        }

        public final boolean b(a<?> aVar, Object obj, Object obj2) {
            synchronized (aVar) {
                if (aVar.f4914a != obj) {
                    return false;
                }
                aVar.f4914a = obj2;
                return true;
            }
        }

        public final boolean c(a<?> aVar, h hVar, h hVar2) {
            synchronized (aVar) {
                if (aVar.f4916c != hVar) {
                    return false;
                }
                aVar.f4916c = hVar2;
                return true;
            }
        }

        public final void d(h hVar, h hVar2) {
            hVar.f4936b = hVar2;
        }

        public final void e(h hVar, Thread thread) {
            hVar.f4935a = thread;
        }
    }

    public static final class h {

        /* renamed from: c  reason: collision with root package name */
        public static final h f4934c = new h(false);

        /* renamed from: a  reason: collision with root package name */
        public volatile Thread f4935a;

        /* renamed from: b  reason: collision with root package name */
        public volatile h f4936b;

        public h(boolean z) {
        }

        public h() {
            a.f4912u.e(this, Thread.currentThread());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: f2.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: f2.a$g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: f2.a$e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: f2.a$e} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<f2.a$h> r0 = f2.a.h.class
            java.lang.String r1 = "guava.concurrent.generate_cancellation_cause"
            java.lang.String r2 = "false"
            java.lang.String r1 = java.lang.System.getProperty(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            f4910s = r1
            java.lang.Class<f2.a> r1 = f2.a.class
            java.lang.String r1 = r1.getName()
            java.util.logging.Logger r1 = java.util.logging.Logger.getLogger(r1)
            f4911t = r1
            f2.a$e r1 = new f2.a$e     // Catch:{ all -> 0x004e }
            java.lang.Class<java.lang.Thread> r2 = java.lang.Thread.class
            java.lang.String r3 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r3)     // Catch:{ all -> 0x004e }
            java.lang.String r2 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r0, r2)     // Catch:{ all -> 0x004e }
            java.lang.Class<f2.a> r2 = f2.a.class
            java.lang.String r5 = "c"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r5)     // Catch:{ all -> 0x004e }
            java.lang.Class<f2.a> r0 = f2.a.class
            java.lang.Class<f2.a$d> r2 = f2.a.d.class
            java.lang.String r6 = "b"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r6)     // Catch:{ all -> 0x004e }
            java.lang.Class<f2.a> r0 = f2.a.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.lang.String r7 = "a"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r0, r2, r7)     // Catch:{ all -> 0x004e }
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x004e }
            r0 = 0
            goto L_0x0054
        L_0x004e:
            r0 = move-exception
            f2.a$g r1 = new f2.a$g
            r1.<init>()
        L_0x0054:
            f4912u = r1
            java.lang.Class<java.util.concurrent.locks.LockSupport> r1 = java.util.concurrent.locks.LockSupport.class
            if (r0 == 0) goto L_0x0063
            java.util.logging.Logger r1 = f4911t
            java.util.logging.Level r2 = java.util.logging.Level.SEVERE
            java.lang.String r3 = "SafeAtomicHelper is broken!"
            r1.log(r2, r3, r0)
        L_0x0063:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            f4913v = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.<clinit>():void");
    }

    public static void b(a<?> aVar) {
        a<V> aVar2;
        d dVar;
        d dVar2;
        d dVar3 = null;
        a<?> aVar3 = aVar;
        while (true) {
            h hVar = aVar3.f4916c;
            if (f4912u.c(aVar3, hVar, h.f4934c)) {
                while (hVar != null) {
                    Thread thread = hVar.f4935a;
                    if (thread != null) {
                        hVar.f4935a = null;
                        LockSupport.unpark(thread);
                    }
                    hVar = hVar.f4936b;
                }
                do {
                    dVar = aVar3.f4915b;
                } while (!f4912u.a(aVar3, dVar, d.f4923d));
                while (true) {
                    dVar2 = dVar3;
                    dVar3 = dVar;
                    if (dVar3 == null) {
                        break;
                    }
                    dVar = dVar3.f4926c;
                    dVar3.f4926c = dVar2;
                }
                while (dVar2 != null) {
                    dVar3 = dVar2.f4926c;
                    Runnable runnable = dVar2.f4924a;
                    if (runnable instanceof f) {
                        f fVar = (f) runnable;
                        a<V> aVar4 = fVar.f4932a;
                        if (aVar4.f4914a == fVar) {
                            if (f4912u.b(aVar4, fVar, f(fVar.f4933b))) {
                                aVar2 = aVar4;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, dVar2.f4925b);
                    }
                    dVar2 = dVar3;
                }
                return;
            }
            aVar2 = aVar3;
            aVar3 = aVar2;
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f4911t;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e10);
        }
    }

    public static Object f(z6.a<?> aVar) {
        if (aVar instanceof a) {
            Object obj = ((a) aVar).f4914a;
            if (!(obj instanceof b)) {
                return obj;
            }
            b bVar = (b) obj;
            if (!bVar.f4919a) {
                return obj;
            }
            if (bVar.f4920b != null) {
                return new b(false, bVar.f4920b);
            }
            return b.f4918d;
        }
        boolean isCancelled = aVar.isCancelled();
        if ((!f4910s) && isCancelled) {
            return b.f4918d;
        }
        try {
            Object g8 = g(aVar);
            return g8 == null ? f4913v : g8;
        } catch (ExecutionException e10) {
            return new c(e10.getCause());
        } catch (CancellationException e11) {
            if (isCancelled) {
                return new b(false, e11);
            }
            return new c(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + aVar, e11));
        } catch (Throwable th2) {
            return new c(th2);
        }
    }

    public static <V> V g(Future<V> future) throws ExecutionException {
        V v10;
        boolean z = false;
        while (true) {
            try {
                v10 = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th2) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v10;
    }

    public final void a(StringBuilder sb2) {
        String str;
        try {
            Object g8 = g(this);
            sb2.append("SUCCESS, result=[");
            if (g8 == this) {
                str = "this future";
            } else {
                str = String.valueOf(g8);
            }
            sb2.append(str);
            sb2.append("]");
        } catch (ExecutionException e10) {
            sb2.append("FAILURE, cause=[");
            sb2.append(e10.getCause());
            sb2.append("]");
        } catch (CancellationException unused) {
            sb2.append("CANCELLED");
        } catch (RuntimeException e11) {
            sb2.append("UNKNOWN, cause=[");
            sb2.append(e11.getClass());
            sb2.append(" thrown from get()]");
        }
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.concurrent.Future, z6.a<? extends V>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean cancel(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f4914a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r2
        L_0x0009:
            boolean r4 = r0 instanceof f2.a.f
            r3 = r3 | r4
            if (r3 == 0) goto L_0x005c
            boolean r3 = f4910s
            if (r3 == 0) goto L_0x001f
            f2.a$b r3 = new f2.a$b
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r5 = "Future.cancel() was called."
            r4.<init>(r5)
            r3.<init>(r8, r4)
            goto L_0x0026
        L_0x001f:
            if (r8 == 0) goto L_0x0024
            f2.a$b r3 = f2.a.b.f4917c
            goto L_0x0026
        L_0x0024:
            f2.a$b r3 = f2.a.b.f4918d
        L_0x0026:
            r4 = r7
            r5 = r2
        L_0x0028:
            f2.a$a r6 = f4912u
            boolean r6 = r6.b(r4, r0, r3)
            if (r6 == 0) goto L_0x0054
            b(r4)
            boolean r4 = r0 instanceof f2.a.f
            if (r4 == 0) goto L_0x005d
            f2.a$f r0 = (f2.a.f) r0
            z6.a<? extends V> r0 = r0.f4933b
            boolean r4 = r0 instanceof f2.a
            if (r4 == 0) goto L_0x0050
            r4 = r0
            f2.a r4 = (f2.a) r4
            java.lang.Object r0 = r4.f4914a
            if (r0 != 0) goto L_0x0048
            r5 = r1
            goto L_0x0049
        L_0x0048:
            r5 = r2
        L_0x0049:
            boolean r6 = r0 instanceof f2.a.f
            r5 = r5 | r6
            if (r5 == 0) goto L_0x005d
            r5 = r1
            goto L_0x0028
        L_0x0050:
            r0.cancel(r8)
            goto L_0x005d
        L_0x0054:
            java.lang.Object r0 = r4.f4914a
            boolean r6 = r0 instanceof f2.a.f
            if (r6 != 0) goto L_0x0028
            r1 = r5
            goto L_0x005d
        L_0x005c:
            r1 = r2
        L_0x005d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.a.cancel(boolean):boolean");
    }

    public final void d(Runnable runnable, Executor executor) {
        Objects.requireNonNull(executor);
        d dVar = this.f4915b;
        if (dVar != d.f4923d) {
            d dVar2 = new d(runnable, executor);
            do {
                dVar2.f4926c = dVar;
                if (!f4912u.a(this, dVar, dVar2)) {
                    dVar = this.f4915b;
                } else {
                    return;
                }
            } while (dVar != d.f4923d);
        }
        c(runnable, executor);
    }

    public final V e(Object obj) throws ExecutionException {
        if (obj instanceof b) {
            Throwable th2 = ((b) obj).f4920b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th2);
            throw cancellationException;
        } else if (obj instanceof c) {
            throw new ExecutionException(((c) obj).f4922a);
        } else if (obj == f4913v) {
            return null;
        } else {
            return obj;
        }
    }

    public final V get(long j10, TimeUnit timeUnit) throws InterruptedException, TimeoutException, ExecutionException {
        long j11 = j10;
        TimeUnit timeUnit2 = timeUnit;
        long nanos = timeUnit2.toNanos(j11);
        if (!Thread.interrupted()) {
            Object obj = this.f4914a;
            boolean z = true;
            if ((obj != null) && (!(obj instanceof f))) {
                return e(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0;
            if (nanos >= 1000) {
                h hVar = this.f4916c;
                if (hVar != h.f4934c) {
                    h hVar2 = new h();
                    do {
                        C0075a aVar = f4912u;
                        aVar.d(hVar2, hVar);
                        if (aVar.c(this, hVar, hVar2)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f4914a;
                                    if ((obj2 != null) && (!(obj2 instanceof f))) {
                                        return e(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    i(hVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            i(hVar2);
                        } else {
                            hVar = this.f4916c;
                        }
                    } while (hVar != h.f4934c);
                }
                return e(this.f4914a);
            }
            while (nanos > 0) {
                Object obj3 = this.f4914a;
                if ((obj3 != null) && (!(obj3 instanceof f))) {
                    return e(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String aVar2 = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            String str = "Waited " + j11 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String c10 = a8.a.c(str, " (plus ");
                long j12 = -nanos;
                long convert = timeUnit2.convert(j12, TimeUnit.NANOSECONDS);
                long nanos2 = j12 - timeUnit2.toNanos(convert);
                int i = (convert > 0 ? 1 : (convert == 0 ? 0 : -1));
                if (i != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (i > 0) {
                    String str2 = c10 + convert + " " + lowerCase;
                    if (z) {
                        str2 = a8.a.c(str2, ",");
                    }
                    c10 = a8.a.c(str2, " ");
                }
                if (z) {
                    c10 = c10 + nanos2 + " nanoseconds ";
                }
                str = a8.a.c(c10, "delay)");
            }
            if (isDone()) {
                throw new TimeoutException(a8.a.c(str, " but future completed as timeout expired"));
            }
            throw new TimeoutException(o.c(str, " for ", aVar2));
        }
        throw new InterruptedException();
    }

    public final String h() {
        String str;
        Object obj = this.f4914a;
        if (obj instanceof f) {
            StringBuilder d10 = a.a.d("setFuture=[");
            z6.a<? extends V> aVar = ((f) obj).f4933b;
            if (aVar == this) {
                str = "this future";
            } else {
                str = String.valueOf(aVar);
            }
            return android.support.v4.media.a.e(d10, str, "]");
        } else if (!(this instanceof ScheduledFuture)) {
            return null;
        } else {
            StringBuilder d11 = a.a.d("remaining delay=[");
            d11.append(((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS));
            d11.append(" ms]");
            return d11.toString();
        }
    }

    public final void i(h hVar) {
        hVar.f4935a = null;
        while (true) {
            h hVar2 = this.f4916c;
            if (hVar2 != h.f4934c) {
                h hVar3 = null;
                while (hVar2 != null) {
                    h hVar4 = hVar2.f4936b;
                    if (hVar2.f4935a != null) {
                        hVar3 = hVar2;
                    } else if (hVar3 != null) {
                        hVar3.f4936b = hVar4;
                        if (hVar3.f4935a == null) {
                        }
                    } else if (!f4912u.c(this, hVar2, hVar4)) {
                    }
                    hVar2 = hVar4;
                }
                return;
            }
            return;
        }
    }

    public final boolean isCancelled() {
        return this.f4914a instanceof b;
    }

    public final boolean isDone() {
        Object obj = this.f4914a;
        return (!(obj instanceof f)) & (obj != null);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("[status=");
        if (this.f4914a instanceof b) {
            sb2.append("CANCELLED");
        } else if (isDone()) {
            a(sb2);
        } else {
            try {
                str = h();
            } catch (RuntimeException e10) {
                StringBuilder d10 = a.a.d("Exception thrown from implementation: ");
                d10.append(e10.getClass());
                str = d10.toString();
            }
            if (str != null && !str.isEmpty()) {
                sb2.append("PENDING, info=[");
                sb2.append(str);
                sb2.append("]");
            } else if (isDone()) {
                a(sb2);
            } else {
                sb2.append("PENDING");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final V get() throws InterruptedException, ExecutionException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f4914a;
            if ((obj2 != null) && (!(obj2 instanceof f))) {
                return e(obj2);
            }
            h hVar = this.f4916c;
            if (hVar != h.f4934c) {
                h hVar2 = new h();
                do {
                    C0075a aVar = f4912u;
                    aVar.d(hVar2, hVar);
                    if (aVar.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f4914a;
                            } else {
                                i(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof f))));
                        return e(obj);
                    }
                    hVar = this.f4916c;
                } while (hVar != h.f4934c);
            }
            return e(this.f4914a);
        }
        throw new InterruptedException();
    }
}
