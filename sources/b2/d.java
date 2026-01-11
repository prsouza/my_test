package b2;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u1.p;

public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f2827f = p.e("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    public final g2.a f2828a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2829b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2830c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Set<z1.a<T>> f2831d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public T f2832e;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f2833a;

        public a(List list) {
            this.f2833a = list;
        }

        public final void run() {
            for (z1.a a10 : this.f2833a) {
                a10.a(d.this.f2832e);
            }
        }
    }

    public d(Context context, g2.a aVar) {
        this.f2829b = context.getApplicationContext();
        this.f2828a = aVar;
    }

    public abstract T a();

    public final void b(z1.a<T> aVar) {
        synchronized (this.f2830c) {
            if (this.f2831d.remove(aVar) && this.f2831d.isEmpty()) {
                e();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(T r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f2830c
            monitor-enter(r0)
            T r1 = r3.f2832e     // Catch:{ all -> 0x002b }
            if (r1 == r4) goto L_0x0029
            if (r1 == 0) goto L_0x0010
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0010
            goto L_0x0029
        L_0x0010:
            r3.f2832e = r4     // Catch:{ all -> 0x002b }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x002b }
            java.util.Set<z1.a<T>> r1 = r3.f2831d     // Catch:{ all -> 0x002b }
            r4.<init>(r1)     // Catch:{ all -> 0x002b }
            g2.a r1 = r3.f2828a     // Catch:{ all -> 0x002b }
            g2.b r1 = (g2.b) r1     // Catch:{ all -> 0x002b }
            g2.b$a r1 = r1.f5229c     // Catch:{ all -> 0x002b }
            b2.d$a r2 = new b2.d$a     // Catch:{ all -> 0x002b }
            r2.<init>(r4)     // Catch:{ all -> 0x002b }
            r1.execute(r2)     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d.c(java.lang.Object):void");
    }

    public abstract void d();

    public abstract void e();
}
