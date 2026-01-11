package k3;

import android.util.Log;
import e3.a;
import g3.f;
import java.io.File;
import java.io.IOException;

public final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    public final k f7410a;

    /* renamed from: b  reason: collision with root package name */
    public final File f7411b;

    /* renamed from: c  reason: collision with root package name */
    public final long f7412c;

    /* renamed from: d  reason: collision with root package name */
    public final c f7413d = new c();

    /* renamed from: e  reason: collision with root package name */
    public a f7414e;

    @Deprecated
    public e(File file, long j10) {
        this.f7411b = file;
        this.f7412c = j10;
        this.f7410a = new k();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, k3.c$a>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v8, types: [java.util.Queue<k3.c$a>, java.util.ArrayDeque] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.Map<java.lang.String, k3.c$a>, java.util.HashMap] */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:50:0x00a3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(g3.f r6, k3.a.b r7) {
        /*
            r5 = this;
            k3.k r0 = r5.f7410a
            java.lang.String r0 = r0.a(r6)
            k3.c r1 = r5.f7413d
            monitor-enter(r1)
            java.util.Map<java.lang.String, k3.c$a> r2 = r1.f7403a     // Catch:{ all -> 0x00d4 }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x00d4 }
            k3.c$a r2 = (k3.c.a) r2     // Catch:{ all -> 0x00d4 }
            if (r2 != 0) goto L_0x0031
            k3.c$b r2 = r1.f7404b     // Catch:{ all -> 0x00d4 }
            java.util.Queue<k3.c$a> r3 = r2.f7407a     // Catch:{ all -> 0x00d4 }
            monitor-enter(r3)     // Catch:{ all -> 0x00d4 }
            java.util.Queue<k3.c$a> r2 = r2.f7407a     // Catch:{ all -> 0x002e }
            java.lang.Object r2 = r2.poll()     // Catch:{ all -> 0x002e }
            k3.c$a r2 = (k3.c.a) r2     // Catch:{ all -> 0x002e }
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            if (r2 != 0) goto L_0x0028
            k3.c$a r2 = new k3.c$a     // Catch:{ all -> 0x00d4 }
            r2.<init>()     // Catch:{ all -> 0x00d4 }
        L_0x0028:
            java.util.Map<java.lang.String, k3.c$a> r3 = r1.f7403a     // Catch:{ all -> 0x00d4 }
            r3.put(r0, r2)     // Catch:{ all -> 0x00d4 }
            goto L_0x0031
        L_0x002e:
            r6 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002e }
            throw r6     // Catch:{ all -> 0x00d4 }
        L_0x0031:
            int r3 = r2.f7406b     // Catch:{ all -> 0x00d4 }
            r4 = 1
            int r3 = r3 + r4
            r2.f7406b = r3     // Catch:{ all -> 0x00d4 }
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            java.util.concurrent.locks.ReentrantLock r1 = r2.f7405a
            r1.lock()
            java.lang.String r1 = "DiskLruCacheWrapper"
            r2 = 2
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x0064
            java.lang.String r1 = "DiskLruCacheWrapper"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cd }
            r2.<init>()     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = "Put: Obtained: "
            r2.append(r3)     // Catch:{ all -> 0x00cd }
            r2.append(r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = " for for Key: "
            r2.append(r3)     // Catch:{ all -> 0x00cd }
            r2.append(r6)     // Catch:{ all -> 0x00cd }
            java.lang.String r6 = r2.toString()     // Catch:{ all -> 0x00cd }
            android.util.Log.v(r1, r6)     // Catch:{ all -> 0x00cd }
        L_0x0064:
            e3.a r6 = r5.c()     // Catch:{ IOException -> 0x00bb }
            e3.a$e r1 = r6.w(r0)     // Catch:{ IOException -> 0x00bb }
            if (r1 == 0) goto L_0x0074
        L_0x006e:
            k3.c r6 = r5.f7413d
            r6.a(r0)
            return
        L_0x0074:
            e3.a$c r6 = r6.s(r0)     // Catch:{ IOException -> 0x00bb }
            if (r6 == 0) goto L_0x00a4
            java.io.File r1 = r6.b()     // Catch:{ all -> 0x009b }
            i3.g r7 = (i3.g) r7     // Catch:{ all -> 0x009b }
            g3.d<DataType> r2 = r7.f6039a     // Catch:{ all -> 0x009b }
            DataType r3 = r7.f6040b     // Catch:{ all -> 0x009b }
            g3.h r7 = r7.f6041c     // Catch:{ all -> 0x009b }
            boolean r7 = r2.f(r3, r1, r7)     // Catch:{ all -> 0x009b }
            if (r7 == 0) goto L_0x0093
            e3.a r7 = e3.a.this     // Catch:{ all -> 0x009b }
            e3.a.a(r7, r6, r4)     // Catch:{ all -> 0x009b }
            r6.f4600c = r4     // Catch:{ all -> 0x009b }
        L_0x0093:
            boolean r7 = r6.f4600c     // Catch:{ IOException -> 0x00bb }
            if (r7 != 0) goto L_0x006e
            r6.a()     // Catch:{ IOException -> 0x006e }
            goto L_0x006e
        L_0x009b:
            r7 = move-exception
            boolean r1 = r6.f4600c     // Catch:{ IOException -> 0x00bb }
            if (r1 != 0) goto L_0x00a3
            r6.a()     // Catch:{ IOException -> 0x00a3 }
        L_0x00a3:
            throw r7     // Catch:{ IOException -> 0x00bb }
        L_0x00a4:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x00bb }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00bb }
            r7.<init>()     // Catch:{ IOException -> 0x00bb }
            java.lang.String r1 = "Had two simultaneous puts for: "
            r7.append(r1)     // Catch:{ IOException -> 0x00bb }
            r7.append(r0)     // Catch:{ IOException -> 0x00bb }
            java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x00bb }
            r6.<init>(r7)     // Catch:{ IOException -> 0x00bb }
            throw r6     // Catch:{ IOException -> 0x00bb }
        L_0x00bb:
            r6 = move-exception
            java.lang.String r7 = "DiskLruCacheWrapper"
            r1 = 5
            boolean r7 = android.util.Log.isLoggable(r7, r1)     // Catch:{ all -> 0x00cd }
            if (r7 == 0) goto L_0x006e
            java.lang.String r7 = "DiskLruCacheWrapper"
            java.lang.String r1 = "Unable to put to disk cache"
            android.util.Log.w(r7, r1, r6)     // Catch:{ all -> 0x00cd }
            goto L_0x006e
        L_0x00cd:
            r6 = move-exception
            k3.c r7 = r5.f7413d
            r7.a(r0)
            throw r6
        L_0x00d4:
            r6 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00d4 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k3.e.a(g3.f, k3.a$b):void");
    }

    public final File b(f fVar) {
        String a10 = this.f7410a.a(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + a10 + " for for Key: " + fVar);
        }
        try {
            a.e w6 = c().w(a10);
            if (w6 != null) {
                return w6.f4609a[0];
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    public final synchronized a c() throws IOException {
        if (this.f7414e == null) {
            this.f7414e = a.B(this.f7411b, this.f7412c);
        }
        return this.f7414e;
    }
}
