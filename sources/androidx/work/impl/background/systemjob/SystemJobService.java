package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import u1.p;
import v1.a;
import v1.c;
import v1.j;

public class SystemJobService extends JobService implements a {

    /* renamed from: c  reason: collision with root package name */
    public static final String f2715c = p.e("SystemJobService");

    /* renamed from: a  reason: collision with root package name */
    public j f2716a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, JobParameters> f2717b = new HashMap();

    public static String b(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    public final void a(String str, boolean z) {
        JobParameters jobParameters;
        p.c().a(f2715c, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f2717b) {
            jobParameters = (JobParameters) this.f2717b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public final void onCreate() {
        super.onCreate();
        try {
            j s22 = j.s2(getApplicationContext());
            this.f2716a = s22;
            s22.A.b(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                p.c().f(f2715c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f2716a;
        if (jVar != null) {
            jVar.A.e(this);
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r3 < 24) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r2.f2641b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r2.f2640a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3 < 28) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009f, code lost:
        r9 = r8.f2716a;
        ((g2.b) r9.f12153y).a(new e2.j(r9, r0, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ad, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            v1.j r0 = r8.f2716a
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            u1.p r0 = u1.p.c()
            java.lang.String r3 = f2715c
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = b(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            u1.p r9 = u1.p.c()
            java.lang.String r0 = f2715c
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f2717b
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f2717b     // Catch:{ all -> 0x00ae }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00ae }
            if (r4 == 0) goto L_0x0051
            u1.p r9 = u1.p.c()     // Catch:{ all -> 0x00ae }
            java.lang.String r4 = f2715c     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ae }
            r1[r2] = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00ae }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ae }
            r9.a(r4, r0, r1)     // Catch:{ all -> 0x00ae }
            monitor-exit(r3)     // Catch:{ all -> 0x00ae }
            return r2
        L_0x0051:
            u1.p r4 = u1.p.c()     // Catch:{ all -> 0x00ae }
            java.lang.String r5 = f2715c     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ae }
            r7[r2] = r0     // Catch:{ all -> 0x00ae }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00ae }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00ae }
            r4.a(r5, r6, r2)     // Catch:{ all -> 0x00ae }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f2717b     // Catch:{ all -> 0x00ae }
            r2.put(r0, r9)     // Catch:{ all -> 0x00ae }
            monitor-exit(r3)     // Catch:{ all -> 0x00ae }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x009f
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x0088
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f2641b = r4
        L_0x0088:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x0098
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f2640a = r4
        L_0x0098:
            r4 = 28
            if (r3 < r4) goto L_0x009f
            r9.getNetwork()
        L_0x009f:
            v1.j r9 = r8.f2716a
            g2.a r3 = r9.f12153y
            e2.j r4 = new e2.j
            r4.<init>(r9, r0, r2)
            g2.b r3 = (g2.b) r3
            r3.a(r4)
            return r1
        L_0x00ae:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00ae }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [java.util.Map<java.lang.String, android.app.job.JobParameters>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.HashSet, java.util.Set<java.lang.String>] */
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean contains;
        if (this.f2716a == null) {
            p.c().a(f2715c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String b10 = b(jobParameters);
        if (TextUtils.isEmpty(b10)) {
            p.c().b(f2715c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        p.c().a(f2715c, String.format("onStopJob for %s", new Object[]{b10}), new Throwable[0]);
        synchronized (this.f2717b) {
            this.f2717b.remove(b10);
        }
        this.f2716a.w2(b10);
        c cVar = this.f2716a.A;
        synchronized (cVar.z) {
            contains = cVar.f12137x.contains(b10);
        }
        return !contains;
    }
}
