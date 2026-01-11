package x8;

import android.content.Context;
import java.util.concurrent.ExecutorService;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f13039a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f13040b;

    /* renamed from: c  reason: collision with root package name */
    public final y f13041c;

    public g(Context context, y yVar, ExecutorService executorService) {
        this.f13039a = executorService;
        this.f13040b = context;
        this.f13041c = yVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r10 = this;
            x8.y r0 = r10.f13041c
            java.lang.String r1 = "gcm.n.noui"
            boolean r0 = r0.a(r1)
            r1 = 1
            if (r0 == 0) goto L_0x000c
            return r1
        L_0x000c:
            android.content.Context r0 = r10.f13040b
            java.lang.String r2 = "keyguard"
            java.lang.Object r0 = r0.getSystemService(r2)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.inKeyguardRestrictedInputMode()
            r2 = 0
            if (r0 == 0) goto L_0x001e
            goto L_0x0059
        L_0x001e:
            boolean r0 = com.google.android.gms.common.util.PlatformVersion.isAtLeastLollipop()
            if (r0 != 0) goto L_0x0029
            r3 = 10
            android.os.SystemClock.sleep(r3)
        L_0x0029:
            int r0 = android.os.Process.myPid()
            android.content.Context r3 = r10.f13040b
            java.lang.String r4 = "activity"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.ActivityManager r3 = (android.app.ActivityManager) r3
            java.util.List r3 = r3.getRunningAppProcesses()
            if (r3 == 0) goto L_0x0059
            java.util.Iterator r3 = r3.iterator()
        L_0x0041:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0059
            java.lang.Object r4 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r4 = (android.app.ActivityManager.RunningAppProcessInfo) r4
            int r5 = r4.pid
            if (r5 != r0) goto L_0x0041
            int r0 = r4.importance
            r3 = 100
            if (r0 != r3) goto L_0x0059
            r0 = r1
            goto L_0x005a
        L_0x0059:
            r0 = r2
        L_0x005a:
            if (r0 == 0) goto L_0x005d
            return r2
        L_0x005d:
            x8.y r0 = r10.f13041c
            java.lang.String r3 = "gcm.n.image"
            java.lang.String r0 = r0.j(r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 0
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 == 0) goto L_0x006f
            goto L_0x008f
        L_0x006f:
            x8.v r3 = new x8.v     // Catch:{ MalformedURLException -> 0x007b }
            java.net.URL r6 = new java.net.URL     // Catch:{ MalformedURLException -> 0x007b }
            r6.<init>(r0)     // Catch:{ MalformedURLException -> 0x007b }
            r3.<init>(r6)     // Catch:{ MalformedURLException -> 0x007b }
            r4 = r3
            goto L_0x008f
        L_0x007b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "Not downloading image, bad URL: "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r5, r0)
        L_0x008f:
            if (r4 == 0) goto L_0x00a9
            java.util.concurrent.ExecutorService r0 = r10.f13039a
            com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource
            r3.<init>()
            x8.u r6 = new x8.u
            r6.<init>(r4, r3)
            java.util.concurrent.Future r0 = r0.submit(r6)
            r4.f13139b = r0
            com.google.android.gms.tasks.Task r0 = r3.getTask()
            r4.f13140c = r0
        L_0x00a9:
            android.content.Context r0 = r10.f13040b
            x8.y r3 = r10.f13041c
            x8.e$a r0 = x8.e.a(r0, r3)
            c0.m r3 = r0.f13034a
            if (r4 != 0) goto L_0x00b6
            goto L_0x0107
        L_0x00b6:
            com.google.android.gms.tasks.Task<android.graphics.Bitmap> r6 = r4.f13140c     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            java.lang.Object r6 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            com.google.android.gms.tasks.Task r6 = (com.google.android.gms.tasks.Task) r6     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r7 = 5
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            java.lang.Object r6 = com.google.android.gms.tasks.Tasks.await(r6, r7, r9)     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r3.g(r6)     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            c0.k r7 = new c0.k     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r7.<init>()     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r7.f3081b = r6     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r7.l()     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            r3.i(r7)     // Catch:{ ExecutionException -> 0x00f2, InterruptedException -> 0x00e2, TimeoutException -> 0x00d9 }
            goto L_0x0107
        L_0x00d9:
            java.lang.String r3 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r5, r3)
            r4.close()
            goto L_0x0107
        L_0x00e2:
            java.lang.String r3 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r5, r3)
            r4.close()
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            r3.interrupt()
            goto L_0x0107
        L_0x00f2:
            r3 = move-exception
            java.lang.String r4 = "Failed to download image: "
            java.lang.StringBuilder r4 = a.a.d(r4)
            java.lang.Throwable r3 = r3.getCause()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.w(r5, r3)
        L_0x0107:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r5, r3)
            if (r3 == 0) goto L_0x0113
            java.lang.String r3 = "Showing notification"
            android.util.Log.d(r5, r3)
        L_0x0113:
            android.content.Context r3 = r10.f13040b
            java.lang.String r4 = "notification"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
            java.lang.String r4 = r0.f13035b
            c0.m r0 = r0.f13034a
            android.app.Notification r0 = r0.a()
            r3.notify(r4, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.g.a():boolean");
    }
}
