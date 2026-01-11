package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import e2.h;
import j0.a;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import u1.p;
import v1.j;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: s  reason: collision with root package name */
    public static final String f2738s = p.e("ForceStopRunnable");

    /* renamed from: t  reason: collision with root package name */
    public static final long f2739t = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: a  reason: collision with root package name */
    public final Context f2740a;

    /* renamed from: b  reason: collision with root package name */
    public final j f2741b;

    /* renamed from: c  reason: collision with root package name */
    public int f2742c = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        public static final String f2743a = p.e("ForceStopRunnable$Rcvr");

        public final void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                p c10 = p.c();
                String str = f2743a;
                if (((p.a) c10).f11652b <= 2) {
                    Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
                }
                ForceStopRunnable.d(context);
            }
        }
    }

    public ForceStopRunnable(Context context, j jVar) {
        this.f2740a = context.getApplicationContext();
        this.f2741b = jVar;
    }

    public static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    public static void d(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b10 = b(context, a.a() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + f2739t;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b10);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:89:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0202  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r14 = this;
            android.content.Context r0 = r14.f2740a
            v1.j r1 = r14.f2741b
            java.lang.String r2 = y1.b.f13370t
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            java.util.List r0 = y1.b.d(r0, r2)
            androidx.work.impl.WorkDatabase r3 = r1.f12152x
            d2.h r3 = r3.t()
            d2.i r3 = (d2.i) r3
            java.util.Objects.requireNonNull(r3)
            java.lang.String r4 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            r5 = 0
            h1.g0 r4 = h1.g0.e(r4, r5)
            h1.e0 r6 = r3.f4282a
            r6.b()
            h1.e0 r3 = r3.f4282a
            android.database.Cursor r3 = r3.o(r4)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0222 }
            int r7 = r3.getCount()     // Catch:{ all -> 0x0222 }
            r6.<init>(r7)     // Catch:{ all -> 0x0222 }
        L_0x0038:
            boolean r7 = r3.moveToNext()     // Catch:{ all -> 0x0222 }
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r3.getString(r5)     // Catch:{ all -> 0x0222 }
            r6.add(r7)     // Catch:{ all -> 0x0222 }
            goto L_0x0038
        L_0x0046:
            r3.close()
            r4.release()
            if (r0 == 0) goto L_0x0056
            r3 = r0
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r3 = r3.size()
            goto L_0x0057
        L_0x0056:
            r3 = r5
        L_0x0057:
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>(r3)
            if (r0 == 0) goto L_0x008c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L_0x008c
            java.util.Iterator r0 = r0.iterator()
        L_0x006a:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x008c
            java.lang.Object r3 = r0.next()
            android.app.job.JobInfo r3 = (android.app.job.JobInfo) r3
            java.lang.String r7 = y1.b.g(r3)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x0084
            r4.add(r7)
            goto L_0x006a
        L_0x0084:
            int r3 = r3.getId()
            y1.b.a(r2, r3)
            goto L_0x006a
        L_0x008c:
            java.util.Iterator r0 = r6.iterator()
        L_0x0090:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto L_0x0090
            u1.p r0 = u1.p.c()
            java.lang.String r2 = y1.b.f13370t
            java.lang.Throwable[] r4 = new java.lang.Throwable[r5]
            java.lang.String r7 = "Reconciling jobs"
            r0.a(r2, r7, r4)
            r0 = r3
            goto L_0x00b3
        L_0x00b2:
            r0 = r5
        L_0x00b3:
            r7 = -1
            if (r0 == 0) goto L_0x00e3
            androidx.work.impl.WorkDatabase r1 = r1.f12152x
            r1.c()
            d2.p r2 = r1.w()     // Catch:{ all -> 0x00de }
            java.util.Iterator r4 = r6.iterator()     // Catch:{ all -> 0x00de }
        L_0x00c4:
            boolean r6 = r4.hasNext()     // Catch:{ all -> 0x00de }
            if (r6 == 0) goto L_0x00d7
            java.lang.Object r6 = r4.next()     // Catch:{ all -> 0x00de }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00de }
            r9 = r2
            d2.q r9 = (d2.q) r9     // Catch:{ all -> 0x00de }
            r9.k(r6, r7)     // Catch:{ all -> 0x00de }
            goto L_0x00c4
        L_0x00d7:
            r1.p()     // Catch:{ all -> 0x00de }
            r1.l()
            goto L_0x00e3
        L_0x00de:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x00e3:
            v1.j r1 = r14.f2741b
            androidx.work.impl.WorkDatabase r1 = r1.f12152x
            d2.p r2 = r1.w()
            d2.m r4 = r1.v()
            r1.c()
            d2.q r2 = (d2.q) r2     // Catch:{ all -> 0x021d }
            java.util.List r6 = r2.d()     // Catch:{ all -> 0x021d }
            r9 = r6
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch:{ all -> 0x021d }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x021d }
            r9 = r9 ^ r3
            if (r9 == 0) goto L_0x0125
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch:{ all -> 0x021d }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x021d }
        L_0x0108:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x021d }
            if (r10 == 0) goto L_0x0125
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x021d }
            d2.o r10 = (d2.o) r10     // Catch:{ all -> 0x021d }
            u1.v r11 = u1.v.ENQUEUED     // Catch:{ all -> 0x021d }
            java.lang.String[] r12 = new java.lang.String[r3]     // Catch:{ all -> 0x021d }
            java.lang.String r13 = r10.f4293a     // Catch:{ all -> 0x021d }
            r12[r5] = r13     // Catch:{ all -> 0x021d }
            r2.o(r11, r12)     // Catch:{ all -> 0x021d }
            java.lang.String r10 = r10.f4293a     // Catch:{ all -> 0x021d }
            r2.k(r10, r7)     // Catch:{ all -> 0x021d }
            goto L_0x0108
        L_0x0125:
            d2.n r4 = (d2.n) r4     // Catch:{ all -> 0x021d }
            r4.b()     // Catch:{ all -> 0x021d }
            r1.p()     // Catch:{ all -> 0x021d }
            r1.l()
            if (r9 != 0) goto L_0x0137
            if (r0 == 0) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r0 = r5
            goto L_0x0138
        L_0x0137:
            r0 = r3
        L_0x0138:
            v1.j r1 = r14.f2741b
            e2.g r1 = r1.B
            androidx.work.impl.WorkDatabase r1 = r1.f4542a
            d2.e r1 = r1.s()
            d2.f r1 = (d2.f) r1
            java.lang.String r2 = "reschedule_needed"
            java.lang.Long r1 = r1.a(r2)
            if (r1 == 0) goto L_0x0158
            long r1 = r1.longValue()
            r6 = 1
            int r1 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0158
            r1 = r3
            goto L_0x0159
        L_0x0158:
            r1 = r5
        L_0x0159:
            if (r1 == 0) goto L_0x0186
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2738s
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            java.lang.String r3 = "Rescheduling Workers."
            r0.a(r1, r3, r2)
            v1.j r0 = r14.f2741b
            r0.v2()
            v1.j r0 = r14.f2741b
            e2.g r0 = r0.B
            java.util.Objects.requireNonNull(r0)
            d2.d r1 = new d2.d
            r1.<init>()
            androidx.work.impl.WorkDatabase r0 = r0.f4542a
            d2.e r0 = r0.s()
            d2.f r0 = (d2.f) r0
            r0.b(r1)
            goto L_0x021c
        L_0x0186:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r2 = j0.a.a()     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            if (r2 == 0) goto L_0x0190
            r1 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x0190:
            android.content.Context r2 = r14.f2740a     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            android.app.PendingIntent r1 = b(r2, r1)     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            r4 = 30
            if (r2 < r4) goto L_0x01d1
            if (r1 == 0) goto L_0x01a1
            r1.cancel()     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
        L_0x01a1:
            android.content.Context r1 = r14.f2740a     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            r2 = 0
            java.util.List r1 = r1.getHistoricalProcessExitReasons(r2, r5, r5)     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            if (r1 == 0) goto L_0x01d9
            boolean r2 = r1.isEmpty()     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            if (r2 != 0) goto L_0x01d9
            r2 = r5
        L_0x01b9:
            int r4 = r1.size()     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            if (r2 >= r4) goto L_0x01d9
            java.lang.Object r4 = r1.get(r2)     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            android.app.ApplicationExitInfo r4 = (android.app.ApplicationExitInfo) r4     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            int r4 = r4.getReason()     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            r6 = 10
            if (r4 != r6) goto L_0x01ce
            goto L_0x01ed
        L_0x01ce:
            int r2 = r2 + 1
            goto L_0x01b9
        L_0x01d1:
            if (r1 != 0) goto L_0x01d9
            android.content.Context r1 = r14.f2740a     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            d(r1)     // Catch:{ SecurityException -> 0x01dd, IllegalArgumentException -> 0x01db }
            goto L_0x01ed
        L_0x01d9:
            r3 = r5
            goto L_0x01ed
        L_0x01db:
            r1 = move-exception
            goto L_0x01de
        L_0x01dd:
            r1 = move-exception
        L_0x01de:
            u1.p r2 = u1.p.c()
            java.lang.String r4 = f2738s
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r6[r5] = r1
            java.lang.String r1 = "Ignoring exception"
            r2.f(r4, r1, r6)
        L_0x01ed:
            if (r3 == 0) goto L_0x0202
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2738s
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            java.lang.String r3 = "Application was force-stopped, rescheduling."
            r0.a(r1, r3, r2)
            v1.j r0 = r14.f2741b
            r0.v2()
            goto L_0x021c
        L_0x0202:
            if (r0 == 0) goto L_0x021c
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2738s
            java.lang.Throwable[] r2 = new java.lang.Throwable[r5]
            java.lang.String r3 = "Found unfinished work, scheduling it."
            r0.a(r1, r3, r2)
            v1.j r0 = r14.f2741b
            androidx.work.a r1 = r0.f12151w
            androidx.work.impl.WorkDatabase r2 = r0.f12152x
            java.util.List<v1.d> r0 = r0.z
            v1.e.a(r1, r2, r0)
        L_0x021c:
            return
        L_0x021d:
            r0 = move-exception
            r1.l()
            throw r0
        L_0x0222:
            r0 = move-exception
            r3.close()
            r4.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean c() {
        androidx.work.a aVar = this.f2741b.f12151w;
        Objects.requireNonNull(aVar);
        if (TextUtils.isEmpty((CharSequence) null)) {
            p.c().a(f2738s, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a10 = h.a(this.f2740a, aVar);
        p.c().a(f2738s, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(a10)}), new Throwable[0]);
        return a10;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c A[LOOP:0: B:5:0x000c->B:26:0x000c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            boolean r0 = r11.c()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x000c
            v1.j r0 = r11.f2741b
            r0.u2()
            return
        L_0x000c:
            android.content.Context r0 = r11.f2740a     // Catch:{ all -> 0x007f }
            v1.i.a(r0)     // Catch:{ all -> 0x007f }
            u1.p r0 = u1.p.c()     // Catch:{ all -> 0x007f }
            java.lang.String r1 = f2738s     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "Performing cleanup operations."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x007f }
            r0.a(r1, r2, r4)     // Catch:{ all -> 0x007f }
            r11.a()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x0032, SQLiteDatabaseCorruptException -> 0x0030, SQLiteDatabaseLockedException -> 0x002e, SQLiteTableLockedException -> 0x002c, SQLiteConstraintException -> 0x002a, SQLiteAccessPermException -> 0x0028 }
            v1.j r0 = r11.f2741b
            r0.u2()
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0 = move-exception
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            int r1 = r11.f2742c     // Catch:{ all -> 0x007f }
            r2 = 1
            int r1 = r1 + r2
            r11.f2742c = r1     // Catch:{ all -> 0x007f }
            r4 = 3
            if (r1 >= r4) goto L_0x0063
            long r4 = (long) r1     // Catch:{ all -> 0x007f }
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            u1.p r1 = u1.p.c()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = f2738s     // Catch:{ all -> 0x007f }
            java.lang.String r9 = "Retrying after %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            r10[r3] = r4     // Catch:{ all -> 0x007f }
            java.lang.String r4 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x007f }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x007f }
            r2[r3] = r0     // Catch:{ all -> 0x007f }
            r1.a(r8, r4, r2)     // Catch:{ all -> 0x007f }
            int r0 = r11.f2742c     // Catch:{ all -> 0x007f }
            long r0 = (long) r0
            long r0 = r0 * r6
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x0063:
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            u1.p r4 = u1.p.c()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = f2738s     // Catch:{ all -> 0x007f }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x007f }
            r2[r3] = r0     // Catch:{ all -> 0x007f }
            r4.b(r5, r1, r2)     // Catch:{ all -> 0x007f }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x007f }
            v1.j r0 = r11.f2741b     // Catch:{ all -> 0x007f }
            androidx.work.a r0 = r0.f12151w     // Catch:{ all -> 0x007f }
            java.util.Objects.requireNonNull(r0)     // Catch:{ all -> 0x007f }
            throw r2     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            v1.j r1 = r11.f2741b
            r1.u2()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
