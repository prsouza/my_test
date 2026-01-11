package y1;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.impl.background.systemjob.SystemJobService;
import u1.p;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final String f13367b = p.e("SystemJobInfoConverter");

    /* renamed from: a  reason: collision with root package name */
    public final ComponentName f13368a;

    /* renamed from: y1.a$a  reason: collision with other inner class name */
    public static /* synthetic */ class C0258a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13369a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                u1.q[] r0 = u1.q.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13369a = r0
                u1.q r1 = u1.q.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13369a     // Catch:{ NoSuchFieldError -> 0x001d }
                u1.q r1 = u1.q.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13369a     // Catch:{ NoSuchFieldError -> 0x0028 }
                u1.q r1 = u1.q.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13369a     // Catch:{ NoSuchFieldError -> 0x0033 }
                u1.q r1 = u1.q.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13369a     // Catch:{ NoSuchFieldError -> 0x003e }
                u1.q r1 = u1.q.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: y1.a.C0258a.<clinit>():void");
        }
    }

    public a(Context context) {
        this.f13368a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [java.util.HashSet, java.util.Set<u1.d$a>] */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006a, code lost:
        if (r2 < 26) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006d, code lost:
        if (r2 >= 24) goto L_0x008b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.app.job.JobInfo a(d2.o r13, int r14) {
        /*
            r12 = this;
            u1.c r0 = r13.f4300j
            android.os.PersistableBundle r1 = new android.os.PersistableBundle
            r1.<init>()
            java.lang.String r2 = r13.f4293a
            java.lang.String r3 = "EXTRA_WORK_SPEC_ID"
            r1.putString(r3, r2)
            boolean r2 = r13.c()
            java.lang.String r3 = "EXTRA_IS_PERIODIC"
            r1.putBoolean(r3, r2)
            android.app.job.JobInfo$Builder r2 = new android.app.job.JobInfo$Builder
            android.content.ComponentName r3 = r12.f13368a
            r2.<init>(r14, r3)
            boolean r14 = r0.f11627b
            android.app.job.JobInfo$Builder r14 = r2.setRequiresCharging(r14)
            boolean r2 = r0.f11628c
            android.app.job.JobInfo$Builder r14 = r14.setRequiresDeviceIdle(r2)
            android.app.job.JobInfo$Builder r14 = r14.setExtras(r1)
            u1.q r1 = r0.f11626a
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 26
            r5 = 24
            r6 = 0
            r7 = 1
            if (r2 < r3) goto L_0x0053
            u1.q r3 = u1.q.TEMPORARILY_UNMETERED
            if (r1 != r3) goto L_0x0053
            android.net.NetworkRequest$Builder r1 = new android.net.NetworkRequest$Builder
            r1.<init>()
            r3 = 25
            android.net.NetworkRequest$Builder r1 = r1.addCapability(r3)
            android.net.NetworkRequest r1 = r1.build()
            r14.setRequiredNetwork(r1)
            goto L_0x008e
        L_0x0053:
            int[] r3 = y1.a.C0258a.f13369a
            int r8 = r1.ordinal()
            r3 = r3[r8]
            if (r3 == r7) goto L_0x008a
            r8 = 2
            if (r3 == r8) goto L_0x0088
            r9 = 3
            if (r3 == r9) goto L_0x0086
            r8 = 4
            if (r3 == r8) goto L_0x006d
            r9 = 5
            if (r3 == r9) goto L_0x006a
            goto L_0x0070
        L_0x006a:
            if (r2 < r4) goto L_0x0070
            goto L_0x0086
        L_0x006d:
            if (r2 < r5) goto L_0x0070
            goto L_0x008b
        L_0x0070:
            u1.p r3 = u1.p.c()
            java.lang.String r8 = f13367b
            java.lang.Object[] r9 = new java.lang.Object[r7]
            r9[r6] = r1
            java.lang.String r1 = "API version too low. Cannot convert network type value %s"
            java.lang.String r1 = java.lang.String.format(r1, r9)
            java.lang.Throwable[] r9 = new java.lang.Throwable[r6]
            r3.a(r8, r1, r9)
            goto L_0x0088
        L_0x0086:
            r9 = r8
            goto L_0x008b
        L_0x0088:
            r9 = r7
            goto L_0x008b
        L_0x008a:
            r9 = r6
        L_0x008b:
            r14.setRequiredNetworkType(r9)
        L_0x008e:
            boolean r1 = r0.f11628c
            if (r1 != 0) goto L_0x00a0
            u1.a r1 = r13.f4302l
            u1.a r3 = u1.a.LINEAR
            if (r1 != r3) goto L_0x009a
            r1 = r6
            goto L_0x009b
        L_0x009a:
            r1 = r7
        L_0x009b:
            long r8 = r13.f4303m
            r14.setBackoffCriteria(r8, r1)
        L_0x00a0:
            long r8 = r13.a()
            long r10 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r10
            r10 = 0
            long r8 = java.lang.Math.max(r8, r10)
            r1 = 28
            if (r2 > r1) goto L_0x00b7
            r14.setMinimumLatency(r8)
            goto L_0x00c6
        L_0x00b7:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x00bf
            r14.setMinimumLatency(r8)
            goto L_0x00c6
        L_0x00bf:
            boolean r1 = r13.f4307q
            if (r1 != 0) goto L_0x00c6
            r14.setImportantWhileForeground(r7)
        L_0x00c6:
            if (r2 < r5) goto L_0x00f9
            boolean r1 = r0.a()
            if (r1 == 0) goto L_0x00f9
            u1.d r1 = r0.f11632h
            java.util.Set<u1.d$a> r1 = r1.f11637a
            java.util.Iterator r1 = r1.iterator()
        L_0x00d6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ef
            java.lang.Object r2 = r1.next()
            u1.d$a r2 = (u1.d.a) r2
            boolean r3 = r2.f11639b
            android.app.job.JobInfo$TriggerContentUri r5 = new android.app.job.JobInfo$TriggerContentUri
            android.net.Uri r2 = r2.f11638a
            r5.<init>(r2, r3)
            r14.addTriggerContentUri(r5)
            goto L_0x00d6
        L_0x00ef:
            long r1 = r0.f11631f
            r14.setTriggerContentUpdateDelay(r1)
            long r1 = r0.g
            r14.setTriggerContentMaxDelay(r1)
        L_0x00f9:
            r14.setPersisted(r6)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r4) goto L_0x010a
            boolean r1 = r0.f11629d
            r14.setRequiresBatteryNotLow(r1)
            boolean r0 = r0.f11630e
            r14.setRequiresStorageNotLow(r0)
        L_0x010a:
            int r0 = r13.f4301k
            if (r0 <= 0) goto L_0x0110
            r0 = r7
            goto L_0x0111
        L_0x0110:
            r0 = r6
        L_0x0111:
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0116
            r6 = r7
        L_0x0116:
            boolean r1 = j0.a.a()
            if (r1 == 0) goto L_0x0127
            boolean r13 = r13.f4307q
            if (r13 == 0) goto L_0x0127
            if (r0 != 0) goto L_0x0127
            if (r6 != 0) goto L_0x0127
            r14.setExpedited(r7)
        L_0x0127:
            android.app.job.JobInfo r13 = r14.build()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.a.a(d2.o, int):android.app.job.JobInfo");
    }
}
