package t7;

import com.google.firebase.crashlytics.CrashlyticsRegistrar;
import s7.e;

public final /* synthetic */ class d implements e {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CrashlyticsRegistrar f11434a;

    public /* synthetic */ d(CrashlyticsRegistrar crashlyticsRegistrar) {
        this.f11434a = crashlyticsRegistrar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x02ab  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x03fd A[Catch:{ Exception -> 0x041d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(s7.c r43) {
        /*
            r42 = this;
            r1 = r42
            com.google.firebase.crashlytics.CrashlyticsRegistrar r0 = r1.f11434a
            java.util.Objects.requireNonNull(r0)
            java.lang.Class<k7.d> r0 = k7.d.class
            r2 = r43
            s7.x r2 = (s7.x) r2
            java.lang.Object r0 = r2.a(r0)
            k7.d r0 = (k7.d) r0
            java.lang.Class<u7.a> r3 = u7.a.class
            r8.a r3 = r2.f(r3)
            java.lang.Class<o7.a> r4 = o7.a.class
            r8.a r4 = r2.f(r4)
            java.lang.Class<s8.f> r5 = s8.f.class
            java.lang.Object r2 = r2.a(r5)
            s8.f r2 = (s8.f) r2
            r0.a()
            android.content.Context r12 = r0.f7453a
            java.lang.String r5 = r12.getPackageName()
            c3.k r13 = c3.k.E
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Initializing Firebase Crashlytics "
            r6.append(r7)
            java.lang.String r7 = "18.2.10"
            r6.append(r7)
            java.lang.String r7 = " for "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r14 = 4
            boolean r7 = r13.M(r14)
            r15 = 0
            if (r7 == 0) goto L_0x005a
            java.lang.String r7 = "FirebaseCrashlytics"
            android.util.Log.i(r7, r6, r15)
        L_0x005a:
            c8.f r11 = new c8.f
            r11.<init>(r12)
            x7.d0 r10 = new x7.d0
            r10.<init>(r0)
            x7.i0 r9 = new x7.i0
            r9.<init>(r12, r5, r2, r10)
            u7.c r6 = new u7.c
            r6.<init>(r3)
            t7.b r2 = new t7.b
            r2.<init>(r4)
            java.lang.String r3 = "Crashlytics Exception Handler"
            java.util.concurrent.ExecutorService r16 = x7.h0.a(r3)
            x7.x r8 = new x7.x
            a5.o r7 = new a5.o
            r7.<init>(r2)
            z4.q r5 = new z4.q
            r5.<init>(r2)
            r3 = r8
            r4 = r0
            r2 = r5
            r5 = r9
            r17 = r7
            r7 = r10
            r26 = r8
            r8 = r17
            r43 = r9
            r9 = r2
            r2 = r10
            r10 = r11
            r15 = r11
            r11 = r16
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r0.a()
            k7.f r0 = r0.f7455c
            java.lang.String r0 = r0.f7466b
            java.lang.String r5 = x7.e.e(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Mapping file ID is: "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r13.e0(r3)
            u7.d r10 = new u7.d
            r10.<init>(r12)
            java.lang.String r7 = r12.getPackageName()     // Catch:{ NameNotFoundException -> 0x0445 }
            java.lang.String r11 = r43.d()     // Catch:{ NameNotFoundException -> 0x0445 }
            android.content.pm.PackageManager r3 = r12.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0445 }
            r9 = 0
            android.content.pm.PackageInfo r3 = r3.getPackageInfo(r7, r9)     // Catch:{ NameNotFoundException -> 0x0445 }
            int r4 = r3.versionCode     // Catch:{ NameNotFoundException -> 0x0445 }
            java.lang.String r24 = java.lang.Integer.toString(r4)     // Catch:{ NameNotFoundException -> 0x0445 }
            java.lang.String r3 = r3.versionName     // Catch:{ NameNotFoundException -> 0x0445 }
            if (r3 != 0) goto L_0x00dc
            java.lang.String r3 = "0.0"
        L_0x00dc:
            r23 = r3
            x7.a r8 = new x7.a     // Catch:{ NameNotFoundException -> 0x0445 }
            r3 = r8
            r4 = r0
            r6 = r11
            r40 = r8
            r8 = r24
            r41 = r9
            r9 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ NameNotFoundException -> 0x0445 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Installer package name is: "
            r3.append(r4)
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            r13.b1(r3)
            java.lang.String r3 = "com.google.firebase.crashlytics.startup"
            java.util.concurrent.ExecutorService r3 = x7.h0.a(r3)
            ah.v r4 = new ah.v
            r4.<init>()
            java.lang.String r5 = r43.d()
            c3.k r8 = new c3.k
            r8.<init>()
            e8.g r9 = new e8.g
            r9.<init>(r8)
            u2.e r10 = new u2.e
            r10.<init>((c8.f) r15)
            java.util.Locale r6 = java.util.Locale.US
            r13 = 1
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r41] = r0
            java.lang.String r11 = "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings"
            java.lang.String r7 = java.lang.String.format(r6, r11, r7)
            e8.b r11 = new e8.b
            r11.<init>(r7, r4)
            r4 = 2
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r15 = android.os.Build.MANUFACTURER
            r4 = r43
            java.lang.String r15 = r4.e(r15)
            r7[r41] = r15
            java.lang.String r15 = android.os.Build.MODEL
            java.lang.String r15 = r4.e(r15)
            r7[r13] = r15
            java.lang.String r15 = "%s/%s"
            java.lang.String r18 = java.lang.String.format(r6, r15, r7)
            java.lang.String r6 = android.os.Build.VERSION.INCREMENTAL
            java.lang.String r19 = r4.e(r6)
            java.lang.String r6 = android.os.Build.VERSION.RELEASE
            java.lang.String r20 = r4.e(r6)
            java.lang.String[] r6 = new java.lang.String[r14]
            java.lang.String r7 = x7.e.e(r12)
            r6[r41] = r7
            r6[r13] = r0
            r7 = 2
            r6[r7] = r23
            r15 = 3
            r6[r15] = r24
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r15 = r41
        L_0x0170:
            if (r15 >= r14) goto L_0x018e
            r14 = r6[r15]
            if (r14 == 0) goto L_0x0187
            java.lang.String r13 = "-"
            java.lang.String r1 = ""
            java.lang.String r1 = r14.replace(r13, r1)
            java.util.Locale r13 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r13)
            r7.add(r1)
        L_0x0187:
            int r15 = r15 + 1
            r1 = r42
            r13 = 1
            r14 = 4
            goto L_0x0170
        L_0x018e:
            java.util.Collections.sort(r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.util.Iterator r6 = r7.iterator()
        L_0x019a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x01aa
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            r1.append(r7)
            goto L_0x019a
        L_0x01aa:
            java.lang.String r1 = r1.toString()
            int r6 = r1.length()
            if (r6 <= 0) goto L_0x01bb
            java.lang.String r1 = x7.e.l(r1)
            r22 = r1
            goto L_0x01bd
        L_0x01bb:
            r22 = 0
        L_0x01bd:
            x7.e0 r1 = x7.e0.determineFrom(r5)
            int r25 = r1.getId()
            e8.j r7 = new e8.j
            r16 = r7
            r17 = r0
            r21 = r4
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25)
            e8.f r1 = new e8.f
            r5 = r1
            r6 = r12
            r12 = r2
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            e8.d r0 = e8.d.USE_CACHE
            android.content.Context r2 = r1.f4767a
            android.content.SharedPreferences r2 = x7.e.g(r2)
            java.lang.String r4 = "existing_instance_identifier"
            java.lang.String r5 = ""
            java.lang.String r2 = r2.getString(r4, r5)
            e8.j r4 = r1.f4768b
            java.lang.String r4 = r4.f4780f
            boolean r2 = r2.equals(r4)
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != 0) goto L_0x0210
            e8.c r0 = r1.a(r0)
            if (r0 == 0) goto L_0x0210
            java.util.concurrent.atomic.AtomicReference<e8.c> r2 = r1.f4773h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<e8.c>> r2 = r1.i
            java.lang.Object r2 = r2.get()
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            r2.trySetResult(r0)
            r2 = 0
            com.google.android.gms.tasks.Task r0 = com.google.android.gms.tasks.Tasks.forResult(r2)
            goto L_0x025a
        L_0x0210:
            e8.d r0 = e8.d.IGNORE_CACHE_EXPIRATION
            e8.c r0 = r1.a(r0)
            if (r0 == 0) goto L_0x0228
            java.util.concurrent.atomic.AtomicReference<e8.c> r2 = r1.f4773h
            r2.set(r0)
            java.util.concurrent.atomic.AtomicReference<com.google.android.gms.tasks.TaskCompletionSource<e8.c>> r2 = r1.i
            java.lang.Object r2 = r2.get()
            com.google.android.gms.tasks.TaskCompletionSource r2 = (com.google.android.gms.tasks.TaskCompletionSource) r2
            r2.trySetResult(r0)
        L_0x0228:
            x7.d0 r0 = r1.g
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r2 = r0.f12907f
            com.google.android.gms.tasks.Task r2 = r2.getTask()
            java.lang.Object r4 = r0.f12903b
            monitor-enter(r4)
            com.google.android.gms.tasks.TaskCompletionSource<java.lang.Void> r0 = r0.f12904c     // Catch:{ all -> 0x0442 }
            com.google.android.gms.tasks.Task r0 = r0.getTask()     // Catch:{ all -> 0x0442 }
            monitor-exit(r4)     // Catch:{ all -> 0x0442 }
            java.util.concurrent.ExecutorService r4 = x7.o0.f12956a
            com.google.android.gms.tasks.TaskCompletionSource r4 = new com.google.android.gms.tasks.TaskCompletionSource
            r4.<init>()
            a5.p r5 = new a5.p
            r6 = 1
            r5.<init>(r4, r6)
            r2.continueWith(r3, r5)
            r0.continueWith(r3, r5)
            com.google.android.gms.tasks.Task r0 = r4.getTask()
            e8.e r2 = new e8.e
            r2.<init>(r1)
            com.google.android.gms.tasks.Task r0 = r0.onSuccessTask(r3, r2)
        L_0x025a:
            t7.e r2 = new t7.e
            r2.<init>()
            r0.continueWith(r3, r2)
            r2 = r26
            android.content.Context r0 = r2.f12989a
            if (r0 == 0) goto L_0x0292
            android.content.res.Resources r4 = r0.getResources()
            if (r4 == 0) goto L_0x0292
            java.lang.String r5 = "com.crashlytics.RequireBuildId"
            java.lang.String r6 = "bool"
            int r6 = x7.e.f(r0, r5, r6)
            if (r6 <= 0) goto L_0x027e
            boolean r0 = r4.getBoolean(r6)
        L_0x027c:
            r4 = r0
            goto L_0x028f
        L_0x027e:
            java.lang.String r4 = "string"
            int r4 = x7.e.f(r0, r5, r4)
            if (r4 <= 0) goto L_0x0292
            java.lang.String r0 = r0.getString(r4)
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            goto L_0x027c
        L_0x028f:
            r0 = r40
            goto L_0x0295
        L_0x0292:
            r0 = r40
            r4 = 1
        L_0x0295:
            java.lang.String r5 = r0.f12881b
            java.lang.String r6 = "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account."
            java.lang.String r7 = "FirebaseCrashlytics"
            if (r4 != 0) goto L_0x02ab
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r7, r4)
            if (r4 == 0) goto L_0x02b1
            java.lang.String r4 = "Configured not to require a build ID."
            r5 = 0
            android.util.Log.v(r7, r4, r5)
            goto L_0x02b1
        L_0x02ab:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L_0x02b3
        L_0x02b1:
            r9 = 1
            goto L_0x0304
        L_0x02b3:
            java.lang.String r4 = "."
            android.util.Log.e(r7, r4)
            java.lang.String r5 = ".     |  | "
            android.util.Log.e(r7, r5)
            java.lang.String r5 = ".     |  |"
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            java.lang.String r8 = ".   \\ |  | /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    \\    /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     \\  /"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".      \\/"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r4)
            android.util.Log.e(r7, r6)
            android.util.Log.e(r7, r4)
            java.lang.String r8 = ".      /\\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".     /  \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".    /    \\"
            android.util.Log.e(r7, r8)
            java.lang.String r8 = ".   / |  | \\"
            android.util.Log.e(r7, r8)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r5)
            android.util.Log.e(r7, r4)
            r9 = r41
        L_0x0304:
            if (r9 == 0) goto L_0x043c
            x7.d r4 = new x7.d
            x7.i0 r5 = r2.f12995h
            r4.<init>(r5)
            java.lang.String r4 = x7.d.f12901b
            x7.z r5 = new x7.z     // Catch:{ Exception -> 0x041f }
            java.lang.String r6 = "crash_marker"
            c8.f r8 = r2.i     // Catch:{ Exception -> 0x041f }
            r5.<init>(r6, r8)     // Catch:{ Exception -> 0x041f }
            r2.f12994f = r5     // Catch:{ Exception -> 0x041f }
            x7.z r5 = new x7.z     // Catch:{ Exception -> 0x041f }
            java.lang.String r6 = "initialization_marker"
            r5.<init>(r6, r8)     // Catch:{ Exception -> 0x041f }
            r2.f12993e = r5     // Catch:{ Exception -> 0x041f }
            y7.k r5 = new y7.k     // Catch:{ Exception -> 0x041f }
            x7.f r6 = r2.f12999m     // Catch:{ Exception -> 0x041f }
            r5.<init>(r4, r8, r6)     // Catch:{ Exception -> 0x041f }
            y7.c r6 = new y7.c     // Catch:{ Exception -> 0x041f }
            c8.f r8 = r2.i     // Catch:{ Exception -> 0x041f }
            r6.<init>(r8)     // Catch:{ Exception -> 0x041f }
            f8.a r8 = new f8.a     // Catch:{ Exception -> 0x041f }
            r9 = 1
            f8.c[] r10 = new f8.c[r9]     // Catch:{ Exception -> 0x041f }
            ge.g0 r11 = new ge.g0     // Catch:{ Exception -> 0x041f }
            r11.<init>()     // Catch:{ Exception -> 0x041f }
            r10[r41] = r11     // Catch:{ Exception -> 0x041f }
            r8.<init>(r10)     // Catch:{ Exception -> 0x041f }
            android.content.Context r10 = r2.f12989a     // Catch:{ Exception -> 0x041f }
            x7.i0 r11 = r2.f12995h     // Catch:{ Exception -> 0x041f }
            c8.f r12 = r2.i     // Catch:{ Exception -> 0x041f }
            l6.t2 r13 = r2.f12991c     // Catch:{ Exception -> 0x041f }
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r0
            r31 = r6
            r32 = r5
            r33 = r8
            r34 = r1
            r35 = r13
            x7.l0 r37 = x7.l0.b(r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ Exception -> 0x041f }
            x7.q r8 = new x7.q     // Catch:{ Exception -> 0x041f }
            android.content.Context r10 = r2.f12989a     // Catch:{ Exception -> 0x041f }
            x7.f r11 = r2.f12999m     // Catch:{ Exception -> 0x041f }
            x7.i0 r12 = r2.f12995h     // Catch:{ Exception -> 0x041f }
            x7.d0 r13 = r2.f12990b     // Catch:{ Exception -> 0x041f }
            c8.f r14 = r2.i     // Catch:{ Exception -> 0x041f }
            x7.z r15 = r2.f12994f     // Catch:{ Exception -> 0x041f }
            u7.a r9 = r2.f13000n     // Catch:{ Exception -> 0x041f }
            r16 = r3
            v7.a r3 = r2.f12997k     // Catch:{ Exception -> 0x041d }
            r27 = r8
            r28 = r10
            r29 = r11
            r30 = r12
            r31 = r13
            r32 = r14
            r33 = r15
            r34 = r0
            r35 = r5
            r36 = r6
            r38 = r9
            r39 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ Exception -> 0x041d }
            r2.g = r8     // Catch:{ Exception -> 0x041d }
            x7.z r0 = r2.f12993e     // Catch:{ Exception -> 0x041d }
            java.io.File r0 = r0.b()     // Catch:{ Exception -> 0x041d }
            boolean r0 = r0.exists()     // Catch:{ Exception -> 0x041d }
            x7.f r3 = r2.f12999m     // Catch:{ Exception -> 0x041d }
            x7.y r5 = new x7.y     // Catch:{ Exception -> 0x041d }
            r5.<init>(r2)     // Catch:{ Exception -> 0x041d }
            com.google.android.gms.tasks.Task r3 = r3.b(r5)     // Catch:{ Exception -> 0x041d }
            java.lang.Object r3 = x7.o0.a(r3)     // Catch:{ Exception -> 0x03af }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x03af }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x041d }
            r5.equals(r3)     // Catch:{ Exception -> 0x041d }
        L_0x03af:
            x7.q r3 = r2.g     // Catch:{ Exception -> 0x041d }
            java.lang.Thread$UncaughtExceptionHandler r5 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch:{ Exception -> 0x041d }
            x7.f r6 = r3.f12963e     // Catch:{ Exception -> 0x041d }
            x7.t r8 = new x7.t     // Catch:{ Exception -> 0x041d }
            r8.<init>(r3, r4)     // Catch:{ Exception -> 0x041d }
            r6.b(r8)     // Catch:{ Exception -> 0x041d }
            x7.k r4 = new x7.k     // Catch:{ Exception -> 0x041d }
            r4.<init>(r3)     // Catch:{ Exception -> 0x041d }
            x7.c0 r6 = new x7.c0     // Catch:{ Exception -> 0x041d }
            u7.a r8 = r3.f12966j     // Catch:{ Exception -> 0x041d }
            r6.<init>(r4, r1, r5, r8)     // Catch:{ Exception -> 0x041d }
            r3.f12969m = r6     // Catch:{ Exception -> 0x041d }
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r6)     // Catch:{ Exception -> 0x041d }
            if (r0 == 0) goto L_0x040e
            android.content.Context r0 = r2.f12989a     // Catch:{ Exception -> 0x041d }
            java.lang.String r3 = "android.permission.ACCESS_NETWORK_STATE"
            int r3 = r0.checkCallingOrSelfPermission(r3)     // Catch:{ Exception -> 0x041d }
            if (r3 != 0) goto L_0x03de
            r9 = 1
            goto L_0x03e0
        L_0x03de:
            r9 = r41
        L_0x03e0:
            if (r9 == 0) goto L_0x03fa
            java.lang.String r3 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r3)     // Catch:{ Exception -> 0x041d }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ Exception -> 0x041d }
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ Exception -> 0x041d }
            if (r0 == 0) goto L_0x03f7
            boolean r0 = r0.isConnectedOrConnecting()     // Catch:{ Exception -> 0x041d }
            if (r0 == 0) goto L_0x03f7
            goto L_0x03fa
        L_0x03f7:
            r9 = r41
            goto L_0x03fb
        L_0x03fa:
            r9 = 1
        L_0x03fb:
            if (r9 == 0) goto L_0x040e
            java.lang.String r0 = "Crashlytics did not finish previous background initialization. Initializing synchronously."
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r7, r3)     // Catch:{ Exception -> 0x041d }
            if (r3 == 0) goto L_0x040a
            r3 = 0
            android.util.Log.d(r7, r0, r3)     // Catch:{ Exception -> 0x041d }
        L_0x040a:
            r2.b(r1)     // Catch:{ Exception -> 0x041d }
            goto L_0x042a
        L_0x040e:
            r0 = 3
            boolean r0 = android.util.Log.isLoggable(r7, r0)
            if (r0 == 0) goto L_0x041b
            java.lang.String r0 = "Successfully configured exception handler."
            r3 = 0
            android.util.Log.d(r7, r0, r3)
        L_0x041b:
            r9 = 1
            goto L_0x042c
        L_0x041d:
            r0 = move-exception
            goto L_0x0422
        L_0x041f:
            r0 = move-exception
            r16 = r3
        L_0x0422:
            java.lang.String r3 = "Crashlytics was not started due to an exception during initialization"
            android.util.Log.e(r7, r3, r0)
            r3 = 0
            r2.g = r3
        L_0x042a:
            r9 = r41
        L_0x042c:
            t7.f r0 = new t7.f
            r0.<init>(r9, r2, r1)
            r1 = r16
            com.google.android.gms.tasks.Tasks.call(r1, r0)
            t7.g r15 = new t7.g
            r15.<init>(r2)
            goto L_0x044f
        L_0x043c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r6)
            throw r0
        L_0x0442:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0442 }
            throw r0
        L_0x0445:
            r0 = move-exception
            r3 = 0
            java.lang.String r1 = "Error retrieving app package info."
            java.lang.String r2 = "FirebaseCrashlytics"
            android.util.Log.e(r2, r1, r0)
            r15 = r3
        L_0x044f:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: t7.d.f(s7.c):java.lang.Object");
    }
}
