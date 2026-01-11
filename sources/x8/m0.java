package x8;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s.a;

public final class m0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f13087j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Context f13088a;

    /* renamed from: b  reason: collision with root package name */
    public final x f13089b;

    /* renamed from: c  reason: collision with root package name */
    public final t f13090c;

    /* renamed from: d  reason: collision with root package name */
    public final FirebaseMessaging f13091d;

    /* renamed from: e  reason: collision with root package name */
    public final Map<String, ArrayDeque<TaskCompletionSource<Void>>> f13092e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final ScheduledExecutorService f13093f;
    public boolean g = false;

    /* renamed from: h  reason: collision with root package name */
    public final k0 f13094h;

    public m0(FirebaseMessaging firebaseMessaging, x xVar, k0 k0Var, t tVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f13091d = firebaseMessaging;
        this.f13089b = xVar;
        this.f13094h = k0Var;
        this.f13090c = tVar;
        this.f13088a = context;
        this.f13093f = scheduledExecutorService;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e10);
            }
        } catch (InterruptedException | TimeoutException e11) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e11);
        }
    }

    public static boolean d() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    public final void b(String str) throws IOException {
        t tVar = this.f13090c;
        String a10 = this.f13091d.a();
        Objects.requireNonNull(tVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(tVar.a(tVar.c(a10, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        t tVar = this.f13090c;
        String a10 = this.f13091d.a();
        Objects.requireNonNull(tVar);
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(tVar.a(tVar.c(a10, "/topics/" + str, bundle)));
    }

    public final synchronized void e(boolean z) {
        this.g = z;
    }

    public final void f() {
        boolean z;
        if (this.f13094h.a() != null) {
            synchronized (this) {
                z = this.g;
            }
            if (!z) {
                h(0);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v4, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>>, s.g] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r4 = r0.f13071b;
        r5 = 65535;
        r6 = r4.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r6 == 83) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r6 == 85) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        if (r4.equals("U") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r5 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        if (r4.equals("S") == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003f, code lost:
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r5 == 0) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0044, code lost:
        if (r5 == 1) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        if (d() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004c, code lost:
        android.util.Log.d("FirebaseMessaging", "Unknown topic operation" + r0 + ".");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0066, code lost:
        c(r0.f13070a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006f, code lost:
        if (d() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0071, code lost:
        android.util.Log.d("FirebaseMessaging", "Unsubscribe from topic: " + r0.f13070a + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008b, code lost:
        b(r0.f13070a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0094, code lost:
        if (d() == false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0096, code lost:
        android.util.Log.d("FirebaseMessaging", "Subscribe to topic: " + r0.f13070a + " succeeded.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b1, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bc, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r4.getMessage()) != false) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cf, code lost:
        if (r4.getMessage() == null) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d1, code lost:
        android.util.Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d8, code lost:
        r5 = a.a.d("Topic operation failed: ");
        r5.append(r4.getMessage());
        r5.append(". Will retry Topic operation.");
        android.util.Log.e("FirebaseMessaging", r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f1, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean g() throws java.io.IOException {
        /*
            r8 = this;
        L_0x0000:
            monitor-enter(r8)
            x8.k0 r0 = r8.f13094h     // Catch:{ all -> 0x014e }
            x8.j0 r0 = r0.a()     // Catch:{ all -> 0x014e }
            r1 = 1
            if (r0 != 0) goto L_0x0019
            boolean r0 = d()     // Catch:{ all -> 0x014e }
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r2 = "topic sync succeeded"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x014e }
        L_0x0017:
            monitor-exit(r8)     // Catch:{ all -> 0x014e }
            return r1
        L_0x0019:
            monitor-exit(r8)     // Catch:{ all -> 0x014e }
            java.lang.String r2 = "FirebaseMessaging"
            r3 = 0
            java.lang.String r4 = r0.f13071b     // Catch:{ IOException -> 0x00b1 }
            r5 = -1
            int r6 = r4.hashCode()     // Catch:{ IOException -> 0x00b1 }
            r7 = 83
            if (r6 == r7) goto L_0x0037
            r7 = 85
            if (r6 == r7) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r6 = "U"
            boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x00b1 }
            if (r4 == 0) goto L_0x0040
            r5 = r1
            goto L_0x0040
        L_0x0037:
            java.lang.String r6 = "S"
            boolean r4 = r4.equals(r6)     // Catch:{ IOException -> 0x00b1 }
            if (r4 == 0) goto L_0x0040
            r5 = r3
        L_0x0040:
            java.lang.String r4 = " succeeded."
            if (r5 == 0) goto L_0x008b
            if (r5 == r1) goto L_0x0066
            boolean r4 = d()     // Catch:{ IOException -> 0x00b1 }
            if (r4 == 0) goto L_0x00af
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b1 }
            r4.<init>()     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = "Unknown topic operation"
            r4.append(r5)     // Catch:{ IOException -> 0x00b1 }
            r4.append(r0)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r5 = "."
            r4.append(r5)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r4 = r4.toString()     // Catch:{ IOException -> 0x00b1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00af
        L_0x0066:
            java.lang.String r5 = r0.f13070a     // Catch:{ IOException -> 0x00b1 }
            r8.c(r5)     // Catch:{ IOException -> 0x00b1 }
            boolean r5 = d()     // Catch:{ IOException -> 0x00b1 }
            if (r5 == 0) goto L_0x00af
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b1 }
            r5.<init>()     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r6 = "Unsubscribe from topic: "
            r5.append(r6)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r6 = r0.f13070a     // Catch:{ IOException -> 0x00b1 }
            r5.append(r6)     // Catch:{ IOException -> 0x00b1 }
            r5.append(r4)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x00b1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00b1 }
            goto L_0x00af
        L_0x008b:
            java.lang.String r5 = r0.f13070a     // Catch:{ IOException -> 0x00b1 }
            r8.b(r5)     // Catch:{ IOException -> 0x00b1 }
            boolean r5 = d()     // Catch:{ IOException -> 0x00b1 }
            if (r5 == 0) goto L_0x00af
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x00b1 }
            r5.<init>()     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r6 = "Subscribe to topic: "
            r5.append(r6)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r6 = r0.f13070a     // Catch:{ IOException -> 0x00b1 }
            r5.append(r6)     // Catch:{ IOException -> 0x00b1 }
            r5.append(r4)     // Catch:{ IOException -> 0x00b1 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x00b1 }
            android.util.Log.d(r2, r4)     // Catch:{ IOException -> 0x00b1 }
        L_0x00af:
            r2 = r1
            goto L_0x00f2
        L_0x00b1:
            r4 = move-exception
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "SERVICE_NOT_AVAILABLE"
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x00d8
            java.lang.String r5 = r4.getMessage()
            java.lang.String r6 = "INTERNAL_SERVER_ERROR"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L_0x00cb
            goto L_0x00d8
        L_0x00cb:
            java.lang.String r5 = r4.getMessage()
            if (r5 != 0) goto L_0x00d7
            java.lang.String r4 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r2, r4)
            goto L_0x00f1
        L_0x00d7:
            throw r4
        L_0x00d8:
            java.lang.String r5 = "Topic operation failed: "
            java.lang.StringBuilder r5 = a.a.d(r5)
            java.lang.String r4 = r4.getMessage()
            r5.append(r4)
            java.lang.String r4 = ". Will retry Topic operation."
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            android.util.Log.e(r2, r4)
        L_0x00f1:
            r2 = r3
        L_0x00f2:
            if (r2 != 0) goto L_0x00f5
            return r3
        L_0x00f5:
            x8.k0 r2 = r8.f13094h
            monitor-enter(r2)
            x8.h0 r3 = r2.f13076a     // Catch:{ all -> 0x014b }
            java.lang.String r4 = r0.f13072c     // Catch:{ all -> 0x014b }
            java.util.ArrayDeque<java.lang.String> r5 = r3.f13053d     // Catch:{ all -> 0x014b }
            monitor-enter(r5)     // Catch:{ all -> 0x014b }
            java.util.ArrayDeque<java.lang.String> r6 = r3.f13053d     // Catch:{ all -> 0x0148 }
            boolean r4 = r6.remove(r4)     // Catch:{ all -> 0x0148 }
            if (r4 == 0) goto L_0x0111
            java.util.concurrent.Executor r4 = r3.f13054e     // Catch:{ all -> 0x0148 }
            h1.v r6 = new h1.v     // Catch:{ all -> 0x0148 }
            r6.<init>(r3, r1)     // Catch:{ all -> 0x0148 }
            r4.execute(r6)     // Catch:{ all -> 0x0148 }
        L_0x0111:
            monitor-exit(r5)     // Catch:{ all -> 0x0148 }
            monitor-exit(r2)
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r1 = r8.f13092e
            monitor-enter(r1)
            java.lang.String r0 = r0.f13072c     // Catch:{ all -> 0x0145 }
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r8.f13092e     // Catch:{ all -> 0x0145 }
            boolean r2 = r2.containsKey(r0)     // Catch:{ all -> 0x0145 }
            if (r2 != 0) goto L_0x0123
            monitor-exit(r1)     // Catch:{ all -> 0x0145 }
            goto L_0x0000
        L_0x0123:
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r8.f13092e     // Catch:{ all -> 0x0145 }
            r3 = 0
            java.lang.Object r2 = r2.getOrDefault(r0, r3)     // Catch:{ all -> 0x0145 }
            java.util.ArrayDeque r2 = (java.util.ArrayDeque) r2     // Catch:{ all -> 0x0145 }
            java.lang.Object r4 = r2.poll()     // Catch:{ all -> 0x0145 }
            com.google.android.gms.tasks.TaskCompletionSource r4 = (com.google.android.gms.tasks.TaskCompletionSource) r4     // Catch:{ all -> 0x0145 }
            if (r4 == 0) goto L_0x0137
            r4.setResult(r3)     // Catch:{ all -> 0x0145 }
        L_0x0137:
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0145 }
            if (r2 == 0) goto L_0x0142
            java.util.Map<java.lang.String, java.util.ArrayDeque<com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void>>> r2 = r8.f13092e     // Catch:{ all -> 0x0145 }
            r2.remove(r0)     // Catch:{ all -> 0x0145 }
        L_0x0142:
            monitor-exit(r1)     // Catch:{ all -> 0x0145 }
            goto L_0x0000
        L_0x0145:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0145 }
            throw r0
        L_0x0148:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0148 }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x014e:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x014e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.m0.g():boolean");
    }

    public final void h(long j10) {
        this.f13093f.schedule(new n0(this, this.f13088a, this.f13089b, Math.min(Math.max(30, 2 * j10), i)), j10, TimeUnit.SECONDS);
        e(true);
    }
}
