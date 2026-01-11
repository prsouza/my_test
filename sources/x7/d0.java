package x7;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import k7.d;

public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final d f12902a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f12903b = new Object();

    /* renamed from: c  reason: collision with root package name */
    public TaskCompletionSource<Void> f12904c = new TaskCompletionSource<>();

    /* renamed from: d  reason: collision with root package name */
    public boolean f12905d = false;

    /* renamed from: e  reason: collision with root package name */
    public Boolean f12906e;

    /* renamed from: f  reason: collision with root package name */
    public final TaskCompletionSource<Void> f12907f = new TaskCompletionSource<>();

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0076  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d0(k7.d r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r6.f12903b = r0
            com.google.android.gms.tasks.TaskCompletionSource r0 = new com.google.android.gms.tasks.TaskCompletionSource
            r0.<init>()
            r6.f12904c = r0
            r0 = 0
            r6.f12905d = r0
            com.google.android.gms.tasks.TaskCompletionSource r1 = new com.google.android.gms.tasks.TaskCompletionSource
            r1.<init>()
            r6.f12907f = r1
            r7.a()
            android.content.Context r1 = r7.f7453a
            r6.f12902a = r7
            android.content.SharedPreferences r7 = x7.e.g(r1)
            java.lang.String r2 = "firebase_crashlytics_collection_enabled"
            boolean r3 = r7.contains(r2)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x003b
            r6.f12905d = r0
            boolean r7 = r7.getBoolean(r2, r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x003c
        L_0x003b:
            r7 = r5
        L_0x003c:
            if (r7 != 0) goto L_0x0082
            java.lang.String r7 = "firebase_crashlytics_collection_enabled"
            android.content.pm.PackageManager r2 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r2 == 0) goto L_0x006f
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x0067 }
            r3 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r1 = r2.getApplicationInfo(r1, r3)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r1 == 0) goto L_0x006f
            android.os.Bundle r2 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r2 == 0) goto L_0x006f
            boolean r2 = r2.containsKey(r7)     // Catch:{ NameNotFoundException -> 0x0067 }
            if (r2 == 0) goto L_0x006f
            android.os.Bundle r1 = r1.metaData     // Catch:{ NameNotFoundException -> 0x0067 }
            boolean r7 = r1.getBoolean(r7)     // Catch:{ NameNotFoundException -> 0x0067 }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch:{ NameNotFoundException -> 0x0067 }
            goto L_0x0070
        L_0x0067:
            r7 = move-exception
            java.lang.String r1 = "FirebaseCrashlytics"
            java.lang.String r2 = "Could not read data collection permission from manifest"
            android.util.Log.e(r1, r2, r7)
        L_0x006f:
            r7 = r5
        L_0x0070:
            if (r7 != 0) goto L_0x0076
            r6.f12905d = r0
            r7 = r5
            goto L_0x0082
        L_0x0076:
            r6.f12905d = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r7 = r0.equals(r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
        L_0x0082:
            r6.f12906e = r7
            java.lang.Object r7 = r6.f12903b
            monitor-enter(r7)
            boolean r0 = r6.a()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x0092
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r6.f12904c     // Catch:{ all -> 0x0094 }
            r0.trySetResult(r5)     // Catch:{ all -> 0x0094 }
        L_0x0092:
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            return
        L_0x0094:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0094 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.d0.<init>(k7.d):void");
    }

    public final synchronized boolean a() {
        boolean z;
        Boolean bool = this.f12906e;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.f12902a.g();
        }
        b(z);
        return z;
    }

    public final void b(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f12906e == null) {
            str = "global Firebase setting";
        } else {
            str = this.f12905d ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        boolean z10 = false;
        String format = String.format("Crashlytics automatic data collection %s by %s.", new Object[]{str2, str});
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            z10 = true;
        }
        if (z10) {
            Log.d("FirebaseCrashlytics", format, (Throwable) null);
        }
    }
}
