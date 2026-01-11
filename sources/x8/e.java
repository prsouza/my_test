package x8;

import android.content.res.Resources;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import c0.m;
import java.util.concurrent.atomic.AtomicInteger;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f13033a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final m f13034a;

        /* renamed from: b  reason: collision with root package name */
        public final String f13035b;

        public a(m mVar, String str) {
            this.f13034a = mVar;
            this.f13035b = str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        if (r2 != null) goto L_0x002e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0281  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02c4 A[SYNTHETIC, Splitter:B:116:0x02c4] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x02ee A[SYNTHETIC, Splitter:B:122:0x02ee] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x035b  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03c7  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x03d3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03e3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03ed  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0414  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x0428  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d2  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0217  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static x8.e.a a(android.content.Context r14, x8.y r15) {
        /*
            java.lang.String r0 = "Couldn't get own application info: "
            java.lang.String r1 = "FirebaseMessaging"
            android.content.pm.PackageManager r2 = r14.getPackageManager()
            java.lang.String r3 = r14.getPackageName()
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x002c
            android.os.Bundle r2 = r2.metaData     // Catch:{ NameNotFoundException -> 0x0019 }
            if (r2 == 0) goto L_0x002c
            goto L_0x002e
        L_0x0019:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            android.util.Log.w(r1, r2)
        L_0x002c:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x002e:
            java.lang.String r3 = "gcm.n.android_channel_id"
            java.lang.String r3 = r15.j(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 26
            r6 = 0
            r7 = 0
            if (r4 >= r5) goto L_0x003e
            goto L_0x00cc
        L_0x003e:
            android.content.pm.PackageManager r4 = r14.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00cc }
            java.lang.String r8 = r14.getPackageName()     // Catch:{ NameNotFoundException -> 0x00cc }
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r8, r6)     // Catch:{ NameNotFoundException -> 0x00cc }
            int r4 = r4.targetSdkVersion     // Catch:{ NameNotFoundException -> 0x00cc }
            if (r4 >= r5) goto L_0x0050
            goto L_0x00cc
        L_0x0050:
            java.lang.Class<android.app.NotificationManager> r4 = android.app.NotificationManager.class
            java.lang.Object r4 = r14.getSystemService(r4)
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x007e
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 == 0) goto L_0x0065
            goto L_0x00cd
        L_0x0065:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "Notification Channel requested ("
            r5.append(r8)
            r5.append(r3)
            java.lang.String r3 = ") has not been created by the app. Manifest configuration, or default, value will be used."
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            android.util.Log.w(r1, r3)
        L_0x007e:
            java.lang.String r3 = "com.google.firebase.messaging.default_notification_channel_id"
            java.lang.String r3 = r2.getString(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L_0x0097
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 == 0) goto L_0x0091
            goto L_0x00cd
        L_0x0091:
            java.lang.String r3 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used."
            android.util.Log.w(r1, r3)
            goto L_0x009c
        L_0x0097:
            java.lang.String r3 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used."
            android.util.Log.w(r1, r3)
        L_0x009c:
            java.lang.String r3 = "fcm_fallback_notification_channel"
            android.app.NotificationChannel r5 = r4.getNotificationChannel(r3)
            if (r5 != 0) goto L_0x00cd
            android.content.res.Resources r5 = r14.getResources()
            java.lang.String r8 = r14.getPackageName()
            java.lang.String r9 = "fcm_fallback_notification_channel_label"
            java.lang.String r10 = "string"
            int r5 = r5.getIdentifier(r9, r10, r8)
            if (r5 != 0) goto L_0x00be
            java.lang.String r5 = "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name."
            android.util.Log.e(r1, r5)
            java.lang.String r5 = "Misc"
            goto L_0x00c2
        L_0x00be:
            java.lang.String r5 = r14.getString(r5)
        L_0x00c2:
            android.app.NotificationChannel r8 = new android.app.NotificationChannel
            r9 = 3
            r8.<init>(r3, r5, r9)
            r4.createNotificationChannel(r8)
            goto L_0x00cd
        L_0x00cc:
            r3 = r7
        L_0x00cd:
            java.lang.String r4 = r14.getPackageName()
            android.content.res.Resources r5 = r14.getResources()
            android.content.pm.PackageManager r8 = r14.getPackageManager()
            c0.m r9 = new c0.m
            r9.<init>(r14, r3)
            java.lang.String r3 = "gcm.n.title"
            java.lang.String r3 = r15.i(r5, r4, r3)
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x00ed
            r9.f(r3)
        L_0x00ed:
            java.lang.String r3 = "gcm.n.body"
            java.lang.String r3 = r15.i(r5, r4, r3)
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x0107
            r9.e(r3)
            c0.l r10 = new c0.l
            r10.<init>()
            r10.l(r3)
            r9.i(r10)
        L_0x0107:
            java.lang.String r3 = "gcm.n.icon"
            java.lang.String r3 = r15.j(r3)
            boolean r10 = android.text.TextUtils.isEmpty(r3)
            if (r10 != 0) goto L_0x014a
            java.lang.String r10 = "drawable"
            int r10 = r5.getIdentifier(r3, r10, r4)
            if (r10 == 0) goto L_0x0122
            boolean r11 = b(r5, r10)
            if (r11 == 0) goto L_0x0122
            goto L_0x017f
        L_0x0122:
            java.lang.String r10 = "mipmap"
            int r10 = r5.getIdentifier(r3, r10, r4)
            if (r10 == 0) goto L_0x0131
            boolean r11 = b(r5, r10)
            if (r11 == 0) goto L_0x0131
            goto L_0x017f
        L_0x0131:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "Icon resource "
            r10.append(r11)
            r10.append(r3)
            java.lang.String r3 = " not found. Notification will use default icon."
            r10.append(r3)
            java.lang.String r3 = r10.toString()
            android.util.Log.w(r1, r3)
        L_0x014a:
            java.lang.String r3 = "com.google.firebase.messaging.default_notification_icon"
            int r3 = r2.getInt(r3, r6)
            if (r3 == 0) goto L_0x0158
            boolean r10 = b(r5, r3)
            if (r10 != 0) goto L_0x0173
        L_0x0158:
            android.content.pm.ApplicationInfo r10 = r8.getApplicationInfo(r4, r6)     // Catch:{ NameNotFoundException -> 0x0160 }
            int r0 = r10.icon     // Catch:{ NameNotFoundException -> 0x0160 }
            r10 = r0
            goto L_0x0174
        L_0x0160:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r0)
            r11.append(r10)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r1, r0)
        L_0x0173:
            r10 = r3
        L_0x0174:
            if (r10 == 0) goto L_0x017c
            boolean r0 = b(r5, r10)
            if (r0 != 0) goto L_0x017f
        L_0x017c:
            r10 = 17301651(0x1080093, float:2.4979667E-38)
        L_0x017f:
            android.app.Notification r0 = r9.f3102t
            r0.icon = r10
            java.lang.String r0 = "gcm.n.sound2"
            java.lang.String r0 = r15.j(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x0195
            java.lang.String r0 = "gcm.n.sound"
            java.lang.String r0 = r15.j(r0)
        L_0x0195:
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r10 = 2
            if (r3 == 0) goto L_0x019e
            r0 = r7
            goto L_0x01d0
        L_0x019e:
            java.lang.String r3 = "default"
            boolean r3 = r3.equals(r0)
            if (r3 != 0) goto L_0x01cc
            java.lang.String r3 = "raw"
            int r3 = r5.getIdentifier(r0, r3, r4)
            if (r3 == 0) goto L_0x01cc
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "android.resource://"
            r3.append(r5)
            r3.append(r4)
            java.lang.String r5 = "/raw/"
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            goto L_0x01d0
        L_0x01cc:
            android.net.Uri r0 = android.media.RingtoneManager.getDefaultUri(r10)
        L_0x01d0:
            if (r0 == 0) goto L_0x01d5
            r9.h(r0)
        L_0x01d5:
            java.lang.String r0 = "gcm.n.click_action"
            java.lang.String r0 = r15.j(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x01ef
            android.content.Intent r3 = new android.content.Intent
            r3.<init>(r0)
            r3.setPackage(r4)
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r3.setFlags(r0)
            goto L_0x020e
        L_0x01ef:
            android.net.Uri r0 = r15.e()
            if (r0 == 0) goto L_0x0203
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r5 = "android.intent.action.VIEW"
            r3.<init>(r5)
            r3.setPackage(r4)
            r3.setData(r0)
            goto L_0x020e
        L_0x0203:
            android.content.Intent r3 = r8.getLaunchIntentForPackage(r4)
            if (r3 != 0) goto L_0x020e
            java.lang.String r0 = "No activity found to launch app"
            android.util.Log.w(r1, r0)
        L_0x020e:
            r0 = 1140850688(0x44000000, float:512.0)
            java.lang.String r4 = "google.c.a.e"
            r5 = 1
            if (r3 != 0) goto L_0x0217
            r3 = r7
            goto L_0x0277
        L_0x0217:
            r8 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r8)
            android.os.Bundle r8 = new android.os.Bundle
            android.os.Bundle r11 = r15.f13146a
            r8.<init>(r11)
            android.os.Bundle r11 = r15.f13146a
            java.util.Set r11 = r11.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x022d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x025b
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "google.c."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0254
            java.lang.String r13 = "gcm.n."
            boolean r13 = r12.startsWith(r13)
            if (r13 != 0) goto L_0x0254
            java.lang.String r13 = "gcm.notification."
            boolean r13 = r12.startsWith(r13)
            if (r13 == 0) goto L_0x0252
            goto L_0x0254
        L_0x0252:
            r13 = r6
            goto L_0x0255
        L_0x0254:
            r13 = r5
        L_0x0255:
            if (r13 == 0) goto L_0x022d
            r8.remove(r12)
            goto L_0x022d
        L_0x025b:
            r3.putExtras(r8)
            boolean r8 = r15.a(r4)
            if (r8 == 0) goto L_0x026d
            android.os.Bundle r8 = r15.m()
            java.lang.String r11 = "gcm.n.analytics_data"
            r3.putExtra(r11, r8)
        L_0x026d:
            java.util.concurrent.atomic.AtomicInteger r8 = f13033a
            int r8 = r8.incrementAndGet()
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r14, r8, r3, r0)
        L_0x0277:
            r9.g = r3
            boolean r3 = r15.a(r4)
            if (r3 != 0) goto L_0x0281
            r0 = r7
            goto L_0x02b2
        L_0x0281:
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            r3.<init>(r4)
            android.os.Bundle r4 = r15.m()
            android.content.Intent r3 = r3.putExtras(r4)
            java.util.concurrent.atomic.AtomicInteger r4 = f13033a
            int r4 = r4.incrementAndGet()
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r11 = "com.google.firebase.MESSAGING_EVENT"
            r8.<init>(r11)
            android.content.ComponentName r11 = new android.content.ComponentName
            java.lang.String r12 = "com.google.firebase.iid.FirebaseInstanceIdReceiver"
            r11.<init>(r14, r12)
            android.content.Intent r8 = r8.setComponent(r11)
            java.lang.String r11 = "wrapped_intent"
            android.content.Intent r3 = r8.putExtra(r11, r3)
            android.app.PendingIntent r0 = android.app.PendingIntent.getBroadcast(r14, r4, r3, r0)
        L_0x02b2:
            if (r0 == 0) goto L_0x02b8
            android.app.Notification r3 = r9.f3102t
            r3.deleteIntent = r0
        L_0x02b8:
            java.lang.String r0 = "gcm.n.color"
            java.lang.String r0 = r15.j(r0)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L_0x02e6
            int r3 = android.graphics.Color.parseColor(r0)     // Catch:{ IllegalArgumentException -> 0x02cd }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x02cd }
            goto L_0x02ff
        L_0x02cd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Color is invalid: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = ". Notification will use default color."
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.w(r1, r0)
        L_0x02e6:
            java.lang.String r0 = "com.google.firebase.messaging.default_notification_color"
            int r0 = r2.getInt(r0, r6)
            if (r0 == 0) goto L_0x02fe
            java.lang.Object r2 = d0.a.f4256a     // Catch:{ NotFoundException -> 0x02f9 }
            int r14 = d0.a.c.a(r14, r0)     // Catch:{ NotFoundException -> 0x02f9 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ NotFoundException -> 0x02f9 }
            goto L_0x02ff
        L_0x02f9:
            java.lang.String r14 = "Cannot find the color resource referenced in AndroidManifest."
            android.util.Log.w(r1, r14)
        L_0x02fe:
            r14 = r7
        L_0x02ff:
            if (r14 == 0) goto L_0x0307
            int r14 = r14.intValue()
            r9.f3097o = r14
        L_0x0307:
            java.lang.String r14 = "gcm.n.sticky"
            boolean r14 = r15.a(r14)
            r14 = r14 ^ r5
            r9.d(r14)
            java.lang.String r14 = "gcm.n.local_only"
            boolean r14 = r15.a(r14)
            r9.f3095m = r14
            java.lang.String r14 = "gcm.n.ticker"
            java.lang.String r14 = r15.j(r14)
            if (r14 == 0) goto L_0x0329
            android.app.Notification r0 = r9.f3102t
            java.lang.CharSequence r14 = c0.m.c(r14)
            r0.tickerText = r14
        L_0x0329:
            java.lang.String r14 = "gcm.n.notification_priority"
            java.lang.Integer r14 = r15.b(r14)
            r0 = -2
            if (r14 != 0) goto L_0x0333
            goto L_0x0358
        L_0x0333:
            int r2 = r14.intValue()
            if (r2 < r0) goto L_0x033f
            int r2 = r14.intValue()
            if (r2 <= r10) goto L_0x0359
        L_0x033f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notificationPriority is invalid "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = ". Skipping setting notificationPriority."
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            android.util.Log.w(r1, r14)
        L_0x0358:
            r14 = r7
        L_0x0359:
            if (r14 == 0) goto L_0x0361
            int r14 = r14.intValue()
            r9.f3092j = r14
        L_0x0361:
            java.lang.String r14 = "gcm.n.visibility"
            java.lang.Integer r14 = r15.b(r14)
            if (r14 != 0) goto L_0x036a
            goto L_0x0392
        L_0x036a:
            int r2 = r14.intValue()
            r3 = -1
            if (r2 < r3) goto L_0x0377
            int r2 = r14.intValue()
            if (r2 <= r5) goto L_0x0393
        L_0x0377:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "visibility is invalid: "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = ". Skipping setting visibility."
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            java.lang.String r2 = "NotificationParams"
            android.util.Log.w(r2, r14)
        L_0x0392:
            r14 = r7
        L_0x0393:
            if (r14 == 0) goto L_0x039b
            int r14 = r14.intValue()
            r9.f3098p = r14
        L_0x039b:
            java.lang.String r14 = "gcm.n.notification_count"
            java.lang.Integer r14 = r15.b(r14)
            if (r14 != 0) goto L_0x03a4
            goto L_0x03c5
        L_0x03a4:
            int r2 = r14.intValue()
            if (r2 >= 0) goto L_0x03c4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "notificationCount is invalid: "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = ". Skipping setting notificationCount."
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            android.util.Log.w(r1, r14)
            goto L_0x03c5
        L_0x03c4:
            r7 = r14
        L_0x03c5:
            if (r7 == 0) goto L_0x03cd
            int r14 = r7.intValue()
            r9.i = r14
        L_0x03cd:
            java.lang.Long r14 = r15.h()
            if (r14 == 0) goto L_0x03dd
            r9.f3093k = r5
            long r1 = r14.longValue()
            android.app.Notification r14 = r9.f3102t
            r14.when = r1
        L_0x03dd:
            long[] r14 = r15.k()
            if (r14 == 0) goto L_0x03e7
            android.app.Notification r1 = r9.f3102t
            r1.vibrate = r14
        L_0x03e7:
            int[] r14 = r15.d()
            if (r14 == 0) goto L_0x0406
            r1 = r14[r6]
            r2 = r14[r5]
            r14 = r14[r10]
            android.app.Notification r3 = r9.f3102t
            r3.ledARGB = r1
            r3.ledOnMS = r2
            r3.ledOffMS = r14
            if (r2 == 0) goto L_0x0400
            if (r14 == 0) goto L_0x0400
            r6 = r5
        L_0x0400:
            int r14 = r3.flags
            r14 = r14 & r0
            r14 = r14 | r6
            r3.flags = r14
        L_0x0406:
            java.lang.String r14 = "gcm.n.default_sound"
            boolean r14 = r15.a(r14)
            java.lang.String r0 = "gcm.n.default_vibrate_timings"
            boolean r0 = r15.a(r0)
            if (r0 == 0) goto L_0x0416
            r14 = r14 | 2
        L_0x0416:
            java.lang.String r0 = "gcm.n.default_light_settings"
            boolean r0 = r15.a(r0)
            if (r0 == 0) goto L_0x0420
            r14 = r14 | 4
        L_0x0420:
            android.app.Notification r0 = r9.f3102t
            r0.defaults = r14
            r14 = r14 & 4
            if (r14 == 0) goto L_0x042d
            int r14 = r0.flags
            r14 = r14 | r5
            r0.flags = r14
        L_0x042d:
            x8.e$a r14 = new x8.e$a
            java.lang.String r0 = "gcm.n.tag"
            java.lang.String r15 = r15.j(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L_0x043c
            goto L_0x044d
        L_0x043c:
            java.lang.String r15 = "FCM-Notification:"
            java.lang.StringBuilder r15 = a.a.d(r15)
            long r0 = android.os.SystemClock.uptimeMillis()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
        L_0x044d:
            r14.<init>(r9, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: x8.e.a(android.content.Context, x8.y):x8.e$a");
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, (Resources.Theme) null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}
