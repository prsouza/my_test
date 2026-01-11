package l6;

import android.app.NotificationManager;
import android.content.Context;
import m3.u;
import o6.i0;

public final class v extends i0 {

    /* renamed from: a  reason: collision with root package name */
    public final u f8046a = new u("AssetPackExtractionService");

    /* renamed from: b  reason: collision with root package name */
    public final Context f8047b;

    /* renamed from: c  reason: collision with root package name */
    public final a0 f8048c;

    /* renamed from: d  reason: collision with root package name */
    public final o2 f8049d;

    /* renamed from: e  reason: collision with root package name */
    public final s0 f8050e;

    /* renamed from: f  reason: collision with root package name */
    public final NotificationManager f8051f;

    public v(Context context, a0 a0Var, o2 o2Var, s0 s0Var) {
        this.f8047b = context;
        this.f8048c = a0Var;
        this.f8049d = o2Var;
        this.f8050e = s0Var;
        this.f8051f = (NotificationManager) context.getSystemService("notification");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void n(android.os.Bundle r11, o6.j0 r12) throws android.os.RemoteException {
        /*
            r10 = this;
            monitor-enter(r10)
            m3.u r0 = r10.f8046a     // Catch:{ all -> 0x012f }
            java.lang.String r1 = "updateServiceState AIDL call"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x012f }
            r0.a(r1, r3)     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f8047b     // Catch:{ all -> 0x012f }
            boolean r0 = o6.s.b(r0)     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x0125
            android.content.Context r0 = r10.f8047b     // Catch:{ all -> 0x012f }
            boolean r0 = o6.s.a(r0)     // Catch:{ all -> 0x012f }
            if (r0 != 0) goto L_0x001d
            goto L_0x0125
        L_0x001d:
            java.lang.String r0 = "action_type"
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x012f }
            l6.s0 r1 = r10.f8050e     // Catch:{ all -> 0x012f }
            java.util.ArrayList r3 = r1.f8016b     // Catch:{ all -> 0x012f }
            monitor-enter(r3)     // Catch:{ all -> 0x012f }
            java.util.ArrayList r1 = r1.f8016b     // Catch:{ all -> 0x0122 }
            r1.add(r12)     // Catch:{ all -> 0x0122 }
            monitor-exit(r3)     // Catch:{ all -> 0x0122 }
            r1 = 2
            r3 = 1
            if (r0 != r3) goto L_0x00dd
            int r12 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x012f }
            r0 = 26
            if (r12 < r0) goto L_0x0054
            java.lang.String r4 = "notification_channel_name"
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x012f }
            monitor-enter(r10)     // Catch:{ all -> 0x012f }
            if (r4 != 0) goto L_0x0043
            java.lang.String r4 = "File downloads by Play"
        L_0x0043:
            android.app.NotificationChannel r5 = new android.app.NotificationChannel     // Catch:{ all -> 0x0051 }
            java.lang.String r6 = "playcore-assetpacks-service-notification-channel"
            r5.<init>(r6, r4, r1)     // Catch:{ all -> 0x0051 }
            android.app.NotificationManager r1 = r10.f8051f     // Catch:{ all -> 0x0051 }
            r1.createNotificationChannel(r5)     // Catch:{ all -> 0x0051 }
            monitor-exit(r10)     // Catch:{ all -> 0x012f }
            goto L_0x0054
        L_0x0051:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x012f }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0054:
            l6.o2 r1 = r10.f8049d     // Catch:{ all -> 0x012f }
            r1.a(r3)     // Catch:{ all -> 0x012f }
            l6.s0 r1 = r10.f8050e     // Catch:{ all -> 0x012f }
            java.lang.String r4 = "notification_title"
            java.lang.String r4 = r11.getString(r4)     // Catch:{ all -> 0x012f }
            java.lang.String r5 = "notification_subtext"
            java.lang.String r5 = r11.getString(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r6 = "notification_timeout"
            r7 = 600000(0x927c0, double:2.964394E-318)
            long r6 = r11.getLong(r6, r7)     // Catch:{ all -> 0x012f }
            java.lang.String r8 = "notification_on_click_intent"
            android.os.Parcelable r8 = r11.getParcelable(r8)     // Catch:{ all -> 0x012f }
            if (r12 < r0) goto L_0x0086
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f8047b     // Catch:{ all -> 0x012f }
            java.lang.String r9 = "playcore-assetpacks-service-notification-channel"
            r12.<init>(r0, r9)     // Catch:{ all -> 0x012f }
            android.app.Notification$Builder r12 = r12.setTimeoutAfter(r6)     // Catch:{ all -> 0x012f }
            goto L_0x0092
        L_0x0086:
            android.app.Notification$Builder r12 = new android.app.Notification$Builder     // Catch:{ all -> 0x012f }
            android.content.Context r0 = r10.f8047b     // Catch:{ all -> 0x012f }
            r12.<init>(r0)     // Catch:{ all -> 0x012f }
            r0 = -2
            android.app.Notification$Builder r12 = r12.setPriority(r0)     // Catch:{ all -> 0x012f }
        L_0x0092:
            boolean r0 = r8 instanceof android.app.PendingIntent     // Catch:{ all -> 0x012f }
            if (r0 == 0) goto L_0x009b
            android.app.PendingIntent r8 = (android.app.PendingIntent) r8     // Catch:{ all -> 0x012f }
            r12.setContentIntent(r8)     // Catch:{ all -> 0x012f }
        L_0x009b:
            r0 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r0 = r12.setSmallIcon(r0)     // Catch:{ all -> 0x012f }
            android.app.Notification$Builder r0 = r0.setOngoing(r2)     // Catch:{ all -> 0x012f }
            if (r4 != 0) goto L_0x00aa
            java.lang.String r4 = "Downloading additional file"
        L_0x00aa:
            android.app.Notification$Builder r0 = r0.setContentTitle(r4)     // Catch:{ all -> 0x012f }
            if (r5 != 0) goto L_0x00b2
            java.lang.String r5 = "Transferring"
        L_0x00b2:
            r0.setSubText(r5)     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "notification_color"
            int r11 = r11.getInt(r0)     // Catch:{ all -> 0x012f }
            if (r11 == 0) goto L_0x00c5
            android.app.Notification$Builder r11 = r12.setColor(r11)     // Catch:{ all -> 0x012f }
            r0 = -1
            r11.setVisibility(r0)     // Catch:{ all -> 0x012f }
        L_0x00c5:
            android.app.Notification r11 = r12.build()     // Catch:{ all -> 0x012f }
            r1.f8019e = r11     // Catch:{ all -> 0x012f }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r10.f8047b     // Catch:{ all -> 0x012f }
            java.lang.Class<com.google.android.play.core.assetpacks.ExtractionForegroundService> r0 = com.google.android.play.core.assetpacks.ExtractionForegroundService.class
            r11.<init>(r12, r0)     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r10.f8047b     // Catch:{ all -> 0x012f }
            l6.s0 r0 = r10.f8050e     // Catch:{ all -> 0x012f }
            r12.bindService(r11, r0, r3)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x00dd:
            if (r0 != r1) goto L_0x0109
            l6.o2 r11 = r10.f8049d     // Catch:{ all -> 0x012f }
            r11.a(r2)     // Catch:{ all -> 0x012f }
            l6.s0 r11 = r10.f8050e     // Catch:{ all -> 0x012f }
            m3.u r12 = r11.f8015a     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "Stopping foreground installation service."
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ all -> 0x012f }
            r12.a(r0, r1)     // Catch:{ all -> 0x012f }
            android.content.Context r12 = r11.f8017c     // Catch:{ all -> 0x012f }
            r12.unbindService(r11)     // Catch:{ all -> 0x012f }
            com.google.android.play.core.assetpacks.ExtractionForegroundService r12 = r11.f8018d     // Catch:{ all -> 0x012f }
            if (r12 == 0) goto L_0x0104
            monitor-enter(r12)     // Catch:{ all -> 0x012f }
            r12.stopForeground(r3)     // Catch:{ all -> 0x0101 }
            r12.stopSelf()     // Catch:{ all -> 0x0101 }
            monitor-exit(r12)     // Catch:{ all -> 0x012f }
            goto L_0x0104
        L_0x0101:
            r11 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x012f }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0104:
            r11.a()     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x0109:
            m3.u r11 = r10.f8046a     // Catch:{ all -> 0x012f }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x012f }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x012f }
            r1[r2] = r0     // Catch:{ all -> 0x012f }
            java.lang.String r0 = "Unknown action type received: %d"
            r11.c(r0, r1)     // Catch:{ all -> 0x012f }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x012f }
            r11.<init>()     // Catch:{ all -> 0x012f }
            r12.zzd(r11)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
            goto L_0x012e
        L_0x0122:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0122 }
            throw r11     // Catch:{ all -> 0x012f }
        L_0x0125:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x012f }
            r11.<init>()     // Catch:{ all -> 0x012f }
            r12.zzd(r11)     // Catch:{ all -> 0x012f }
            monitor-exit(r10)
        L_0x012e:
            return
        L_0x012f:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.v.n(android.os.Bundle, o6.j0):void");
    }
}
