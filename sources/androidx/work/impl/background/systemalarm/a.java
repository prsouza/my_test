package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;
import u1.p;

public final class a implements v1.a {

    /* renamed from: s  reason: collision with root package name */
    public static final String f2681s = p.e("CommandHandler");

    /* renamed from: a  reason: collision with root package name */
    public final Context f2682a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, v1.a> f2683b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Object f2684c = new Object();

    public a(Context context) {
        this.f2682a = context;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent d(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, v1.a>] */
    public final void a(String str, boolean z) {
        synchronized (this.f2684c) {
            v1.a aVar = (v1.a) this.f2683b.remove(str);
            if (aVar != null) {
                aVar.a(str, z);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [java.util.HashMap, java.util.Map<java.lang.String, v1.a>] */
    /* JADX WARNING: type inference failed for: r12v9, types: [java.util.HashMap, java.util.Map<java.lang.String, v1.a>] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0187  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(android.content.Intent r11, int r12, androidx.work.impl.background.systemalarm.d r13) {
        /*
            r10 = this;
            java.lang.String r0 = r11.getAction()
            java.lang.String r1 = "ACTION_CONSTRAINTS_CHANGED"
            boolean r1 = r1.equals(r0)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x011a
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2681s
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r4[r3] = r11
            java.lang.String r11 = "Handling constraints changed %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r0.a(r1, r11, r4)
            androidx.work.impl.background.systemalarm.b r11 = new androidx.work.impl.background.systemalarm.b
            android.content.Context r0 = r10.f2682a
            r11.<init>(r0, r12, r13)
            v1.j r12 = r13.f2704t
            androidx.work.impl.WorkDatabase r12 = r12.f12152x
            d2.p r12 = r12.w()
            d2.q r12 = (d2.q) r12
            java.util.List r12 = r12.e()
            java.lang.String r13 = androidx.work.impl.background.systemalarm.ConstraintProxy.f2672a
            r13 = r12
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r1 = r13.iterator()
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        L_0x0045:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x006e
            java.lang.Object r8 = r1.next()
            d2.o r8 = (d2.o) r8
            u1.c r8 = r8.f4300j
            boolean r9 = r8.f11629d
            r4 = r4 | r9
            boolean r9 = r8.f11627b
            r5 = r5 | r9
            boolean r9 = r8.f11630e
            r6 = r6 | r9
            u1.q r8 = r8.f11626a
            u1.q r9 = u1.q.NOT_REQUIRED
            if (r8 == r9) goto L_0x0064
            r8 = r2
            goto L_0x0065
        L_0x0064:
            r8 = r3
        L_0x0065:
            r7 = r7 | r8
            if (r4 == 0) goto L_0x0045
            if (r5 == 0) goto L_0x0045
            if (r6 == 0) goto L_0x0045
            if (r7 == 0) goto L_0x0045
        L_0x006e:
            java.lang.String r1 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.f2673a
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r8 = "androidx.work.impl.background.systemalarm.UpdateProxies"
            r1.<init>(r8)
            android.content.ComponentName r8 = new android.content.ComponentName
            java.lang.Class<androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver> r9 = androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.class
            r8.<init>(r0, r9)
            r1.setComponent(r8)
            java.lang.String r8 = "KEY_BATTERY_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r1.putExtra(r8, r4)
            java.lang.String r8 = "KEY_BATTERY_CHARGING_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r8, r5)
            java.lang.String r5 = "KEY_STORAGE_NOT_LOW_PROXY_ENABLED"
            android.content.Intent r4 = r4.putExtra(r5, r6)
            java.lang.String r5 = "KEY_NETWORK_STATE_PROXY_ENABLED"
            r4.putExtra(r5, r7)
            r0.sendBroadcast(r1)
            z1.d r0 = r11.f2689d
            r0.b(r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            int r0 = r13.size()
            r12.<init>(r0)
            long r0 = java.lang.System.currentTimeMillis()
            java.util.Iterator r13 = r13.iterator()
        L_0x00b1:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x00d9
            java.lang.Object r4 = r13.next()
            d2.o r4 = (d2.o) r4
            java.lang.String r5 = r4.f4293a
            long r6 = r4.a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 < 0) goto L_0x00b1
            boolean r6 = r4.b()
            if (r6 == 0) goto L_0x00d5
            z1.d r6 = r11.f2689d
            boolean r5 = r6.a(r5)
            if (r5 == 0) goto L_0x00b1
        L_0x00d5:
            r12.add(r4)
            goto L_0x00b1
        L_0x00d9:
            java.util.Iterator r12 = r12.iterator()
        L_0x00dd:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0113
            java.lang.Object r13 = r12.next()
            d2.o r13 = (d2.o) r13
            java.lang.String r13 = r13.f4293a
            android.content.Context r0 = r11.f2686a
            android.content.Intent r0 = c(r0, r13)
            u1.p r1 = u1.p.c()
            java.lang.String r4 = androidx.work.impl.background.systemalarm.b.f2685e
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r13
            java.lang.String r13 = "Creating a delay_met command for workSpec with id (%s)"
            java.lang.String r13 = java.lang.String.format(r13, r5)
            java.lang.Throwable[] r5 = new java.lang.Throwable[r3]
            r1.a(r4, r13, r5)
            androidx.work.impl.background.systemalarm.d r13 = r11.f2688c
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b
            int r4 = r11.f2687b
            r1.<init>(r13, r0, r4)
            r13.e(r1)
            goto L_0x00dd
        L_0x0113:
            z1.d r11 = r11.f2689d
            r11.c()
            goto L_0x0376
        L_0x011a:
            java.lang.String r1 = "ACTION_RESCHEDULE"
            boolean r1 = r1.equals(r0)
            r4 = 2
            if (r1 == 0) goto L_0x0145
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2681s
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling reschedule %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r0.a(r1, r11, r12)
            v1.j r11 = r13.f2704t
            r11.v2()
            goto L_0x0376
        L_0x0145:
            android.os.Bundle r1 = r11.getExtras()
            java.lang.String r5 = "KEY_WORKSPEC_ID"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            if (r1 == 0) goto L_0x0169
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L_0x0158
            goto L_0x0169
        L_0x0158:
            r6 = r3
        L_0x0159:
            if (r6 >= r2) goto L_0x0167
            r7 = r5[r6]
            java.lang.Object r7 = r1.get(r7)
            if (r7 != 0) goto L_0x0164
            goto L_0x0169
        L_0x0164:
            int r6 = r6 + 1
            goto L_0x0159
        L_0x0167:
            r1 = r2
            goto L_0x016a
        L_0x0169:
            r1 = r3
        L_0x016a:
            if (r1 != 0) goto L_0x0187
            u1.p r11 = u1.p.c()
            java.lang.String r12 = f2681s
            java.lang.String r13 = "Invalid request for %s, requires %s."
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            r1[r2] = r0
            java.lang.String r13 = java.lang.String.format(r13, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r11.b(r12, r13, r0)
            goto L_0x0376
        L_0x0187:
            java.lang.String r1 = "ACTION_SCHEDULE_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x026e
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)
            u1.p r0 = u1.p.c()
            java.lang.String r1 = f2681s
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r3] = r11
            java.lang.String r6 = "Handling schedule work for %s"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]
            r0.a(r1, r5, r6)
            v1.j r0 = r13.f2704t
            androidx.work.impl.WorkDatabase r0 = r0.f12152x
            r0.c()
            d2.p r5 = r0.w()     // Catch:{ all -> 0x0269 }
            d2.q r5 = (d2.q) r5     // Catch:{ all -> 0x0269 }
            d2.o r5 = r5.h(r11)     // Catch:{ all -> 0x0269 }
            java.lang.String r6 = "Skipping scheduling "
            if (r5 != 0) goto L_0x01e2
            u1.p r12 = u1.p.c()     // Catch:{ all -> 0x0269 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0269 }
            r13.<init>()     // Catch:{ all -> 0x0269 }
            r13.append(r6)     // Catch:{ all -> 0x0269 }
            r13.append(r11)     // Catch:{ all -> 0x0269 }
            java.lang.String r11 = " because it's no longer in the DB"
            r13.append(r11)     // Catch:{ all -> 0x0269 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0269 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0269 }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x0269 }
            goto L_0x0264
        L_0x01e2:
            u1.v r7 = r5.f4294b     // Catch:{ all -> 0x0269 }
            boolean r7 = r7.isFinished()     // Catch:{ all -> 0x0269 }
            if (r7 == 0) goto L_0x0208
            u1.p r12 = u1.p.c()     // Catch:{ all -> 0x0269 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x0269 }
            r13.<init>()     // Catch:{ all -> 0x0269 }
            r13.append(r6)     // Catch:{ all -> 0x0269 }
            r13.append(r11)     // Catch:{ all -> 0x0269 }
            java.lang.String r11 = "because it is finished."
            r13.append(r11)     // Catch:{ all -> 0x0269 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x0269 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0269 }
            r12.f(r1, r11, r13)     // Catch:{ all -> 0x0269 }
            goto L_0x0264
        L_0x0208:
            long r6 = r5.a()     // Catch:{ all -> 0x0269 }
            boolean r5 = r5.b()     // Catch:{ all -> 0x0269 }
            if (r5 != 0) goto L_0x0233
            u1.p r12 = u1.p.c()     // Catch:{ all -> 0x0269 }
            java.lang.String r5 = "Setting up Alarms for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0269 }
            r4[r3] = r11     // Catch:{ all -> 0x0269 }
            java.lang.Long r8 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0269 }
            r4[r2] = r8     // Catch:{ all -> 0x0269 }
            java.lang.String r2 = java.lang.String.format(r5, r4)     // Catch:{ all -> 0x0269 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0269 }
            r12.a(r1, r2, r3)     // Catch:{ all -> 0x0269 }
            android.content.Context r12 = r10.f2682a     // Catch:{ all -> 0x0269 }
            v1.j r13 = r13.f2704t     // Catch:{ all -> 0x0269 }
            x1.a.b(r12, r13, r11, r6)     // Catch:{ all -> 0x0269 }
            goto L_0x0261
        L_0x0233:
            u1.p r5 = u1.p.c()     // Catch:{ all -> 0x0269 }
            java.lang.String r8 = "Opportunistically setting an alarm for %s at %s"
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0269 }
            r4[r3] = r11     // Catch:{ all -> 0x0269 }
            java.lang.Long r9 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x0269 }
            r4[r2] = r9     // Catch:{ all -> 0x0269 }
            java.lang.String r2 = java.lang.String.format(r8, r4)     // Catch:{ all -> 0x0269 }
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x0269 }
            r5.a(r1, r2, r3)     // Catch:{ all -> 0x0269 }
            android.content.Context r1 = r10.f2682a     // Catch:{ all -> 0x0269 }
            v1.j r2 = r13.f2704t     // Catch:{ all -> 0x0269 }
            x1.a.b(r1, r2, r11, r6)     // Catch:{ all -> 0x0269 }
            android.content.Context r11 = r10.f2682a     // Catch:{ all -> 0x0269 }
            android.content.Intent r11 = b(r11)     // Catch:{ all -> 0x0269 }
            androidx.work.impl.background.systemalarm.d$b r1 = new androidx.work.impl.background.systemalarm.d$b     // Catch:{ all -> 0x0269 }
            r1.<init>(r13, r11, r12)     // Catch:{ all -> 0x0269 }
            r13.e(r1)     // Catch:{ all -> 0x0269 }
        L_0x0261:
            r0.p()     // Catch:{ all -> 0x0269 }
        L_0x0264:
            r0.l()
            goto L_0x0376
        L_0x0269:
            r11 = move-exception
            r0.l()
            throw r11
        L_0x026e:
            java.lang.String r1 = "ACTION_DELAY_MET"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x02c9
            android.os.Bundle r11 = r11.getExtras()
            java.lang.Object r1 = r10.f2684c
            monitor-enter(r1)
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r0)     // Catch:{ all -> 0x02c6 }
            u1.p r0 = u1.p.c()     // Catch:{ all -> 0x02c6 }
            java.lang.String r4 = f2681s     // Catch:{ all -> 0x02c6 }
            java.lang.String r5 = "Handing delay met for %s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c6 }
            r6[r3] = r11     // Catch:{ all -> 0x02c6 }
            java.lang.String r5 = java.lang.String.format(r5, r6)     // Catch:{ all -> 0x02c6 }
            java.lang.Throwable[] r6 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02c6 }
            r0.a(r4, r5, r6)     // Catch:{ all -> 0x02c6 }
            java.util.Map<java.lang.String, v1.a> r0 = r10.f2683b     // Catch:{ all -> 0x02c6 }
            boolean r0 = r0.containsKey(r11)     // Catch:{ all -> 0x02c6 }
            if (r0 != 0) goto L_0x02b0
            androidx.work.impl.background.systemalarm.c r0 = new androidx.work.impl.background.systemalarm.c     // Catch:{ all -> 0x02c6 }
            android.content.Context r2 = r10.f2682a     // Catch:{ all -> 0x02c6 }
            r0.<init>(r2, r12, r11, r13)     // Catch:{ all -> 0x02c6 }
            java.util.Map<java.lang.String, v1.a> r12 = r10.f2683b     // Catch:{ all -> 0x02c6 }
            r12.put(r11, r0)     // Catch:{ all -> 0x02c6 }
            r0.f()     // Catch:{ all -> 0x02c6 }
            goto L_0x02c3
        L_0x02b0:
            u1.p r12 = u1.p.c()     // Catch:{ all -> 0x02c6 }
            java.lang.String r13 = "WorkSpec %s is already being handled for ACTION_DELAY_MET"
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x02c6 }
            r0[r3] = r11     // Catch:{ all -> 0x02c6 }
            java.lang.String r11 = java.lang.String.format(r13, r0)     // Catch:{ all -> 0x02c6 }
            java.lang.Throwable[] r13 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x02c6 }
            r12.a(r4, r11, r13)     // Catch:{ all -> 0x02c6 }
        L_0x02c3:
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            goto L_0x0376
        L_0x02c6:
            r11 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x02c6 }
            throw r11
        L_0x02c9:
            java.lang.String r1 = "ACTION_STOP_WORK"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x032a
            android.os.Bundle r11 = r11.getExtras()
            java.lang.String r12 = "KEY_WORKSPEC_ID"
            java.lang.String r11 = r11.getString(r12)
            u1.p r12 = u1.p.c()
            java.lang.String r0 = f2681s
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r4 = "Handing stopWork work for %s"
            java.lang.String r1 = java.lang.String.format(r4, r1)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.a(r0, r1, r4)
            v1.j r12 = r13.f2704t
            r12.w2(r11)
            android.content.Context r12 = r10.f2682a
            v1.j r0 = r13.f2704t
            java.lang.String r1 = x1.a.f12756a
            androidx.work.impl.WorkDatabase r0 = r0.f12152x
            d2.h r0 = r0.t()
            d2.i r0 = (d2.i) r0
            d2.g r1 = r0.a(r11)
            if (r1 == 0) goto L_0x0326
            int r1 = r1.f4281b
            x1.a.a(r12, r11, r1)
            u1.p r12 = u1.p.c()
            java.lang.String r1 = x1.a.f12756a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r11
            java.lang.String r4 = "Removing SystemIdInfo for workSpecId (%s)"
            java.lang.String r2 = java.lang.String.format(r4, r2)
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]
            r12.a(r1, r2, r4)
            r0.c(r11)
        L_0x0326:
            r13.a(r11, r3)
            goto L_0x0376
        L_0x032a:
            java.lang.String r13 = "ACTION_EXECUTION_COMPLETED"
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x0361
            android.os.Bundle r13 = r11.getExtras()
            java.lang.String r0 = "KEY_WORKSPEC_ID"
            java.lang.String r0 = r13.getString(r0)
            java.lang.String r1 = "KEY_NEEDS_RESCHEDULE"
            boolean r13 = r13.getBoolean(r1)
            u1.p r1 = u1.p.c()
            java.lang.String r5 = f2681s
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r4[r2] = r11
            java.lang.String r11 = "Handling onExecutionCompleted %s, %s"
            java.lang.String r11 = java.lang.String.format(r11, r4)
            java.lang.Throwable[] r12 = new java.lang.Throwable[r3]
            r1.a(r5, r11, r12)
            r10.a(r0, r13)
            goto L_0x0376
        L_0x0361:
            u1.p r12 = u1.p.c()
            java.lang.String r13 = f2681s
            java.lang.String r0 = "Ignoring intent %s"
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r11
            java.lang.String r11 = java.lang.String.format(r0, r1)
            java.lang.Throwable[] r0 = new java.lang.Throwable[r3]
            r12.f(r13, r11, r0)
        L_0x0376:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.a.e(android.content.Intent, int, androidx.work.impl.background.systemalarm.d):void");
    }
}
