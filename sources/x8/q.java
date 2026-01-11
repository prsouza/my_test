package x8;

import com.google.firebase.messaging.FirebaseMessaging;

public final /* synthetic */ class q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f13115a;

    public /* synthetic */ q(FirebaseMessaging firebaseMessaging) {
        this.f13115a = firebaseMessaging;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            com.google.firebase.messaging.FirebaseMessaging r0 = r5.f13115a
            android.content.Context r0 = r0.f4208d
            android.content.Context r1 = r0.getApplicationContext()
            if (r1 != 0) goto L_0x000b
            r1 = r0
        L_0x000b:
            r2 = 0
            java.lang.String r3 = "com.google.firebase.messaging"
            android.content.SharedPreferences r1 = r1.getSharedPreferences(r3, r2)
            java.lang.String r3 = "proxy_notification_initialized"
            boolean r1 = r1.getBoolean(r3, r2)
            if (r1 == 0) goto L_0x001b
            goto L_0x005b
        L_0x001b:
            java.lang.String r1 = "firebase_messaging_notification_delegation_enabled"
            android.content.Context r2 = r0.getApplicationContext()     // Catch:{ NameNotFoundException -> 0x0044 }
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0044 }
            if (r3 == 0) goto L_0x0044
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x0044 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x0044 }
            if (r2 == 0) goto L_0x0044
            android.os.Bundle r3 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0044 }
            if (r3 == 0) goto L_0x0044
            boolean r3 = r3.containsKey(r1)     // Catch:{ NameNotFoundException -> 0x0044 }
            if (r3 == 0) goto L_0x0044
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0044 }
            boolean r1 = r2.getBoolean(r1)     // Catch:{ NameNotFoundException -> 0x0044 }
            goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            boolean r2 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
            if (r2 != 0) goto L_0x0050
            r0 = 0
            com.google.android.gms.tasks.Tasks.forResult(r0)
            goto L_0x005b
        L_0x0050:
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            x8.a0.a(r0, r1, r2)
            r2.getTask()
        L_0x005b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.q.run():void");
    }
}
