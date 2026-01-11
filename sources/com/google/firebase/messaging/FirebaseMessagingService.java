package com.google.firebase.messaging;

import android.content.Intent;
import java.util.ArrayDeque;
import java.util.Queue;
import x8.b0;
import x8.g0;
import x8.j;

public class FirebaseMessagingService extends j {

    /* renamed from: v  reason: collision with root package name */
    public static final Queue<String> f4219v = new ArrayDeque(10);

    /* JADX WARNING: type inference failed for: r1v2, types: [java.util.Queue<android.content.Intent>, java.util.ArrayDeque] */
    public final Intent b(Intent intent) {
        return (Intent) g0.a().f13046d.poll();
    }

    /* JADX WARNING: type inference failed for: r6v23, types: [java.util.ArrayDeque, java.util.Queue<java.lang.String>] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02b8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x02f8  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0308  */
    /* JADX WARNING: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0159  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.content.Intent r28) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r0 = r28.getAction()
            java.lang.String r3 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r3 = r3.equals(r0)
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            java.lang.String r5 = "FirebaseMessaging"
            if (r3 != 0) goto L_0x0044
            boolean r3 = r4.equals(r0)
            if (r3 == 0) goto L_0x001b
            goto L_0x0044
        L_0x001b:
            java.lang.String r3 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "token"
            java.lang.String r0 = r2.getStringExtra(r0)
            r1.e(r0)
            goto L_0x0348
        L_0x002e:
            java.lang.String r0 = "Unknown intent action: "
            java.lang.StringBuilder r0 = a.a.d(r0)
            java.lang.String r2 = r28.getAction()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r5, r0)
            goto L_0x0348
        L_0x0044:
            java.lang.String r0 = "google.message_id"
            java.lang.String r3 = r2.getStringExtra(r0)
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            r7 = 0
            r8 = 1
            r9 = 3
            if (r6 == 0) goto L_0x0054
            goto L_0x0077
        L_0x0054:
            java.util.Queue<java.lang.String> r6 = f4219v
            boolean r10 = r6.contains(r3)
            if (r10 == 0) goto L_0x0069
            boolean r6 = android.util.Log.isLoggable(r5, r9)
            if (r6 == 0) goto L_0x0067
            java.lang.String r6 = "Received duplicate message: "
            androidx.fragment.app.m.g(r6, r3, r5)
        L_0x0067:
            r3 = r8
            goto L_0x0078
        L_0x0069:
            int r10 = r6.size()
            r11 = 10
            if (r10 < r11) goto L_0x0074
            r6.remove()
        L_0x0074:
            r6.add(r3)
        L_0x0077:
            r3 = r7
        L_0x0078:
            if (r3 != 0) goto L_0x0348
            java.lang.String r3 = "message_type"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r6 = "gcm"
            if (r3 != 0) goto L_0x0085
            r3 = r6
        L_0x0085:
            r10 = -1
            int r11 = r3.hashCode()
            r12 = 2
            switch(r11) {
                case -2062414158: goto L_0x00ae;
                case 102161: goto L_0x00a5;
                case 814694033: goto L_0x009a;
                case 814800675: goto L_0x008f;
                default: goto L_0x008e;
            }
        L_0x008e:
            goto L_0x00b8
        L_0x008f:
            java.lang.String r6 = "send_event"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x0098
            goto L_0x00b8
        L_0x0098:
            r10 = r9
            goto L_0x00b8
        L_0x009a:
            java.lang.String r6 = "send_error"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00a3
            goto L_0x00b8
        L_0x00a3:
            r10 = r12
            goto L_0x00b8
        L_0x00a5:
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00ac
            goto L_0x00b8
        L_0x00ac:
            r10 = r8
            goto L_0x00b8
        L_0x00ae:
            java.lang.String r6 = "deleted_messages"
            boolean r6 = r3.equals(r6)
            if (r6 != 0) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r10 = r7
        L_0x00b8:
            java.lang.String r6 = "message_id"
            if (r10 == 0) goto L_0x0348
            if (r10 == r8) goto L_0x00f3
            if (r10 == r12) goto L_0x00dd
            if (r10 == r9) goto L_0x00d8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Received message with unknown type: "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r5, r0)
            goto L_0x0348
        L_0x00d8:
            r2.getStringExtra(r0)
            goto L_0x0348
        L_0x00dd:
            java.lang.String r0 = r2.getStringExtra(r0)
            if (r0 != 0) goto L_0x00e6
            r2.getStringExtra(r6)
        L_0x00e6:
            x8.f0 r0 = new x8.f0
            java.lang.String r3 = "error"
            java.lang.String r2 = r2.getStringExtra(r3)
            r0.<init>(r2)
            goto L_0x0348
        L_0x00f3:
            boolean r3 = x8.w.b(r28)
            if (r3 == 0) goto L_0x0102
            android.os.Bundle r3 = r28.getExtras()
            java.lang.String r9 = "_nr"
            x8.w.a(r9, r3)
        L_0x0102:
            java.lang.String r3 = r28.getAction()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x010d
            goto L_0x0156
        L_0x010d:
            java.lang.String r3 = "delivery_metrics_exported_to_big_query_enabled"
            k7.d.c()     // Catch:{ IllegalStateException -> 0x0151 }
            k7.d r4 = k7.d.c()
            r4.a()
            android.content.Context r4 = r4.f7453a
            java.lang.String r9 = "com.google.firebase.messaging"
            android.content.SharedPreferences r9 = r4.getSharedPreferences(r9, r7)
            java.lang.String r10 = "export_to_big_query"
            boolean r11 = r9.contains(r10)
            if (r11 == 0) goto L_0x012e
            boolean r3 = r9.getBoolean(r10, r7)
            goto L_0x0157
        L_0x012e:
            android.content.pm.PackageManager r9 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0156 }
            if (r9 == 0) goto L_0x0156
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0156 }
            r10 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r9.getApplicationInfo(r4, r10)     // Catch:{ NameNotFoundException -> 0x0156 }
            if (r4 == 0) goto L_0x0156
            android.os.Bundle r9 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0156 }
            if (r9 == 0) goto L_0x0156
            boolean r9 = r9.containsKey(r3)     // Catch:{ NameNotFoundException -> 0x0156 }
            if (r9 == 0) goto L_0x0156
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0156 }
            boolean r3 = r4.getBoolean(r3, r7)     // Catch:{ NameNotFoundException -> 0x0156 }
            goto L_0x0157
        L_0x0151:
            java.lang.String r3 = "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query"
            android.util.Log.i(r5, r3)
        L_0x0156:
            r3 = r7
        L_0x0157:
            if (r3 == 0) goto L_0x02f2
            y8.a$a r24 = y8.a.C0260a.MESSAGE_DELIVERED
            q4.g r3 = com.google.firebase.messaging.FirebaseMessaging.f4203n
            if (r3 != 0) goto L_0x0166
            java.lang.String r0 = "TransportFactory is null. Skip exporting message delivery metrics to Big Query"
            android.util.Log.e(r5, r0)
            goto L_0x02f2
        L_0x0166:
            android.os.Bundle r4 = r28.getExtras()
            if (r4 != 0) goto L_0x016e
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x016e:
            int r9 = y8.a.f13535p
            java.lang.String r9 = ""
            y8.a$b r10 = y8.a.b.UNKNOWN
            y8.a$c r10 = y8.a.c.UNKNOWN_OS
            y8.a$a r10 = y8.a.C0260a.UNKNOWN_EVENT
            java.lang.String r10 = "google.ttl"
            java.lang.Object r10 = r4.get(r10)
            boolean r11 = r10 instanceof java.lang.Integer
            if (r11 == 0) goto L_0x0189
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r7 = r10.intValue()
            goto L_0x01a9
        L_0x0189:
            boolean r11 = r10 instanceof java.lang.String
            if (r11 == 0) goto L_0x01a9
            r11 = r10
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ NumberFormatException -> 0x0195 }
            int r7 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x0195 }
            goto L_0x01a9
        L_0x0195:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Invalid TTL: "
            r11.append(r13)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            android.util.Log.w(r5, r10)
        L_0x01a9:
            r22 = r7
            java.lang.String r7 = "google.to"
            java.lang.String r7 = r4.getString(r7)
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 != 0) goto L_0x01ba
        L_0x01b7:
            r17 = r7
            goto L_0x01d8
        L_0x01ba:
            k7.d r7 = k7.d.c()     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Object r10 = s8.e.f10998m     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.String r10 = "Null is not a valid value of FirebaseApp."
            com.google.android.gms.common.internal.Preconditions.checkArgument(r8, r10)     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Class<s8.f> r10 = s8.f.class
            java.lang.Object r7 = r7.b(r10)     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            s8.e r7 = (s8.e) r7     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            com.google.android.gms.tasks.Task r7 = r7.getId()     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.Object r7 = com.google.android.gms.tasks.Tasks.await(r7)     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ ExecutionException -> 0x02eb, InterruptedException -> 0x02e9 }
            goto L_0x01b7
        L_0x01d8:
            k7.d r7 = k7.d.c()
            r7.a()
            android.content.Context r7 = r7.f7453a
            java.lang.String r20 = r7.getPackageName()
            y8.a$c r19 = y8.a.c.ANDROID
            boolean r7 = x8.y.l(r4)
            if (r7 == 0) goto L_0x01f0
            y8.a$b r7 = y8.a.b.DISPLAY_NOTIFICATION
            goto L_0x01f2
        L_0x01f0:
            y8.a$b r7 = y8.a.b.DATA_MESSAGE
        L_0x01f2:
            r18 = r7
            java.lang.String r0 = r4.getString(r0)
            if (r0 != 0) goto L_0x01fe
            java.lang.String r0 = r4.getString(r6)
        L_0x01fe:
            if (r0 == 0) goto L_0x0203
            r16 = r0
            goto L_0x0205
        L_0x0203:
            r16 = r9
        L_0x0205:
            java.lang.String r0 = "from"
            java.lang.String r0 = r4.getString(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0217
            java.lang.String r7 = "/topics/"
            boolean r7 = r0.startsWith(r7)
            if (r7 == 0) goto L_0x0217
            goto L_0x0218
        L_0x0217:
            r0 = r6
        L_0x0218:
            if (r0 == 0) goto L_0x021d
            r23 = r0
            goto L_0x021f
        L_0x021d:
            r23 = r9
        L_0x021f:
            java.lang.String r0 = "collapse_key"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x022a
            r21 = r0
            goto L_0x022c
        L_0x022a:
            r21 = r9
        L_0x022c:
            java.lang.String r0 = "google.c.a.m_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0237
            r25 = r0
            goto L_0x0239
        L_0x0237:
            r25 = r9
        L_0x0239:
            java.lang.String r0 = "google.c.a.c_l"
            java.lang.String r0 = r4.getString(r0)
            if (r0 == 0) goto L_0x0244
            r26 = r0
            goto L_0x0246
        L_0x0244:
            r26 = r9
        L_0x0246:
            java.lang.String r0 = "google.c.sender.id"
            boolean r6 = r4.containsKey(r0)
            r9 = 0
            if (r6 == 0) goto L_0x025f
            java.lang.String r0 = r4.getString(r0)     // Catch:{ NumberFormatException -> 0x0259 }
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0259 }
            goto L_0x02b2
        L_0x0259:
            r0 = move-exception
            java.lang.String r4 = "error parsing project number"
            android.util.Log.w(r5, r4, r0)
        L_0x025f:
            k7.d r4 = k7.d.c()
            r4.a()
            k7.f r0 = r4.f7455c
            java.lang.String r0 = r0.f7469e
            if (r0 == 0) goto L_0x0278
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0271 }
            goto L_0x02b2
        L_0x0271:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "error parsing sender ID"
            android.util.Log.w(r5, r0, r6)
        L_0x0278:
            r4.a()
            k7.f r0 = r4.f7455c
            java.lang.String r0 = r0.f7466b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            java.lang.String r6 = "error parsing app ID"
            if (r4 != 0) goto L_0x0294
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x028e }
            goto L_0x02b2
        L_0x028e:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
            goto L_0x02b1
        L_0x0294:
            java.lang.String r4 = ":"
            java.lang.String[] r0 = r0.split(r4)
            int r4 = r0.length
            if (r4 >= r12) goto L_0x029e
            goto L_0x02b1
        L_0x029e:
            r0 = r0[r8]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x02a7
            goto L_0x02b1
        L_0x02a7:
            long r6 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x02ac }
            goto L_0x02b2
        L_0x02ac:
            r0 = move-exception
            r4 = r0
            android.util.Log.w(r5, r6, r4)
        L_0x02b1:
            r6 = r9
        L_0x02b2:
            int r0 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x02b8
            r14 = r6
            goto L_0x02b9
        L_0x02b8:
            r14 = r9
        L_0x02b9:
            y8.a r0 = new y8.a
            r13 = r0
            r13.<init>(r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r4 = "FCM_CLIENT_EVENT_LOGGING"
            java.lang.String r6 = "proto"
            q4.b r7 = new q4.b     // Catch:{ RuntimeException -> 0x02e2 }
            r7.<init>(r6)     // Catch:{ RuntimeException -> 0x02e2 }
            h1.i r6 = h1.i.f5730c     // Catch:{ RuntimeException -> 0x02e2 }
            q4.f r3 = r3.a(r4, r7, r6)     // Catch:{ RuntimeException -> 0x02e2 }
            y8.b r4 = new y8.b     // Catch:{ RuntimeException -> 0x02e2 }
            r4.<init>(r0)     // Catch:{ RuntimeException -> 0x02e2 }
            q4.a r0 = new q4.a     // Catch:{ RuntimeException -> 0x02e2 }
            q4.d r6 = q4.d.VERY_LOW     // Catch:{ RuntimeException -> 0x02e2 }
            r0.<init>(r4, r6)     // Catch:{ RuntimeException -> 0x02e2 }
            t4.t r3 = (t4.t) r3     // Catch:{ RuntimeException -> 0x02e2 }
            t4.s r4 = t4.s.f11388a     // Catch:{ RuntimeException -> 0x02e2 }
            r3.a(r0, r4)     // Catch:{ RuntimeException -> 0x02e2 }
            goto L_0x02f2
        L_0x02e2:
            r0 = move-exception
            java.lang.String r3 = "Failed to send big query analytics payload."
            android.util.Log.w(r5, r3, r0)
            goto L_0x02f2
        L_0x02e9:
            r0 = move-exception
            goto L_0x02ec
        L_0x02eb:
            r0 = move-exception
        L_0x02ec:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r0)
            throw r2
        L_0x02f2:
            android.os.Bundle r0 = r28.getExtras()
            if (r0 != 0) goto L_0x02fd
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        L_0x02fd:
            java.lang.String r3 = "androidx.content.wakelockid"
            r0.remove(r3)
            boolean r3 = x8.y.l(r0)
            if (r3 == 0) goto L_0x0340
            x8.y r3 = new x8.y
            r3.<init>(r0)
            com.google.android.gms.common.util.concurrent.NamedThreadFactory r4 = new com.google.android.gms.common.util.concurrent.NamedThreadFactory
            java.lang.String r5 = "Firebase-Messaging-Network-Io"
            r4.<init>(r5)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r4)
            x8.g r5 = new x8.g
            r5.<init>(r1, r3, r4)
            boolean r3 = r5.a()     // Catch:{ all -> 0x033a }
            if (r3 == 0) goto L_0x0327
            r4.shutdown()
            goto L_0x0348
        L_0x0327:
            r4.shutdown()
            boolean r3 = x8.w.b(r28)
            if (r3 == 0) goto L_0x0340
            android.os.Bundle r2 = r28.getExtras()
            java.lang.String r3 = "_nf"
            x8.w.a(r3, r2)
            goto L_0x0340
        L_0x033a:
            r0 = move-exception
            r2 = r0
            r4.shutdown()
            throw r2
        L_0x0340:
            x8.b0 r2 = new x8.b0
            r2.<init>(r0)
            r1.d(r2)
        L_0x0348:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.c(android.content.Intent):void");
    }

    public void d(b0 b0Var) {
    }

    public void e(String str) {
    }
}
