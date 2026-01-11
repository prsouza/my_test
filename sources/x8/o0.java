package x8;

import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final long f13109a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    public static final Object f13110b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public static WakeLock f13111c;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.ComponentName a(android.content.Context r4, android.content.Intent r5) {
        /*
            java.lang.Object r0 = f13110b
            monitor-enter(r0)
            com.google.android.gms.stats.WakeLock r1 = f13111c     // Catch:{ all -> 0x0034 }
            r2 = 1
            if (r1 != 0) goto L_0x0014
            com.google.android.gms.stats.WakeLock r1 = new com.google.android.gms.stats.WakeLock     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "wake:com.google.firebase.iid.WakeLockHolder"
            r1.<init>(r4, r2, r3)     // Catch:{ all -> 0x0034 }
            f13111c = r1     // Catch:{ all -> 0x0034 }
            r1.setReferenceCounted(r2)     // Catch:{ all -> 0x0034 }
        L_0x0014:
            java.lang.String r1 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r3 = 0
            boolean r1 = r5.getBooleanExtra(r1, r3)     // Catch:{ all -> 0x0034 }
            java.lang.String r3 = "com.google.firebase.iid.WakeLockHolder.wakefulintent"
            r5.putExtra(r3, r2)     // Catch:{ all -> 0x0034 }
            android.content.ComponentName r4 = r4.startService(r5)     // Catch:{ all -> 0x0034 }
            if (r4 != 0) goto L_0x0029
            r4 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r4
        L_0x0029:
            if (r1 != 0) goto L_0x0032
            com.google.android.gms.stats.WakeLock r5 = f13111c     // Catch:{ all -> 0x0034 }
            long r1 = f13109a     // Catch:{ all -> 0x0034 }
            r5.acquire(r1)     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return r4
        L_0x0034:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.o0.a(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
