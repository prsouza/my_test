package c9;

import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final Set<BiConsumer<String, f>> f3302a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    public final Executor f3303b;

    /* renamed from: c  reason: collision with root package name */
    public final e f3304c;

    /* renamed from: d  reason: collision with root package name */
    public final e f3305d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public j(Executor executor, e eVar, e eVar2) {
        this.f3303b = executor;
        this.f3304c = eVar;
        this.f3305d = eVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r2 = r2.b();
        r0 = java.util.concurrent.TimeUnit.SECONDS;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        android.util.Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return (c9.f) c9.e.a(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static c9.f a(c9.e r2) {
        /*
            monitor-enter(r2)
            com.google.android.gms.tasks.Task<c9.f> r0 = r2.f3284c     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isSuccessful()     // Catch:{ all -> 0x0032 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.Task<c9.f> r0 = r2.f3284c     // Catch:{ all -> 0x0032 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ all -> 0x0032 }
            c9.f r0 = (c9.f) r0     // Catch:{ all -> 0x0032 }
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            goto L_0x0031
        L_0x0015:
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            com.google.android.gms.tasks.Task r2 = r2.b()     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            java.lang.Object r2 = c9.e.a(r2)     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            r0 = r2
            c9.f r0 = (c9.f) r0     // Catch:{ InterruptedException -> 0x0028, ExecutionException -> 0x0026, TimeoutException -> 0x0024 }
            goto L_0x0031
        L_0x0024:
            r2 = move-exception
            goto L_0x0029
        L_0x0026:
            r2 = move-exception
            goto L_0x0029
        L_0x0028:
            r2 = move-exception
        L_0x0029:
            java.lang.String r0 = "FirebaseRemoteConfig"
            java.lang.String r1 = "Reading from storage file failed."
            android.util.Log.d(r0, r1, r2)
            r0 = 0
        L_0x0031:
            return r0
        L_0x0032:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0032 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c9.j.a(c9.e):c9.f");
    }
}
