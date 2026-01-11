package o6;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import m3.u;
import t6.m;

public final class p {

    /* renamed from: o  reason: collision with root package name */
    public static final HashMap f9332o = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f9333a;

    /* renamed from: b  reason: collision with root package name */
    public final u f9334b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9335c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f9336d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final HashSet f9337e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public final Object f9338f = new Object();
    public boolean g;

    /* renamed from: h  reason: collision with root package name */
    public final Intent f9339h;
    public final l i;

    /* renamed from: j  reason: collision with root package name */
    public final WeakReference f9340j;

    /* renamed from: k  reason: collision with root package name */
    public final g f9341k = new g(this);

    /* renamed from: l  reason: collision with root package name */
    public final AtomicInteger f9342l = new AtomicInteger(0);

    /* renamed from: m  reason: collision with root package name */
    public o f9343m;

    /* renamed from: n  reason: collision with root package name */
    public IInterface f9344n;

    public p(Context context, u uVar, String str, Intent intent, l lVar) {
        this.f9333a = context;
        this.f9334b = uVar;
        this.f9335c = str;
        this.f9339h = intent;
        this.i = lVar;
        this.f9340j = new WeakReference((Object) null);
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = f9332o;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.f9335c)) {
                HandlerThread handlerThread = new HandlerThread(this.f9335c, 10);
                handlerThread.start();
                hashMap.put(this.f9335c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.f9335c);
        }
        return handler;
    }

    public final void b(f fVar, m mVar) {
        synchronized (this.f9338f) {
            this.f9337e.add(mVar);
            mVar.f11420a.a(new h(this, mVar));
        }
        synchronized (this.f9338f) {
            if (this.f9342l.getAndIncrement() > 0) {
                this.f9334b.a("Already connected to the service.", new Object[0]);
            }
        }
        a().post(new i(this, fVar.f9321a, fVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0029, code lost:
        a().post(new o6.j(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(t6.m r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f9338f
            monitor-enter(r0)
            java.util.HashSet r1 = r3.f9337e     // Catch:{ all -> 0x0039 }
            r1.remove(r4)     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r3.f9338f
            monitor-enter(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f9342l     // Catch:{ all -> 0x0036 }
            int r0 = r0.get()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            java.util.concurrent.atomic.AtomicInteger r0 = r3.f9342l     // Catch:{ all -> 0x0036 }
            int r0 = r0.decrementAndGet()     // Catch:{ all -> 0x0036 }
            if (r0 <= 0) goto L_0x0028
            m3.u r0 = r3.f9334b     // Catch:{ all -> 0x0036 }
            java.lang.String r1 = "Leaving the connection open for other ongoing calls."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0036 }
            r0.e(r1, r2)     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0028:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            o6.j r4 = new o6.j
            r4.<init>(r3)
            android.os.Handler r0 = r3.a()
            r0.post(r4)
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        L_0x0039:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: o6.p.c(t6.m):void");
    }

    public final void d() {
        synchronized (this.f9338f) {
            Iterator it = this.f9337e.iterator();
            while (it.hasNext()) {
                ((m) it.next()).a(new RemoteException(String.valueOf(this.f9335c).concat(" : Binder has died.")));
            }
            this.f9337e.clear();
        }
    }
}
