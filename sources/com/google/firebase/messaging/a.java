package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f4220a;

    /* renamed from: com.google.firebase.messaging.a$a  reason: collision with other inner class name */
    public static class C0052a {

        /* renamed from: d  reason: collision with root package name */
        public static final long f4221d = TimeUnit.DAYS.toMillis(7);

        /* renamed from: a  reason: collision with root package name */
        public final String f4222a;

        /* renamed from: b  reason: collision with root package name */
        public final String f4223b;

        /* renamed from: c  reason: collision with root package name */
        public final long f4224c;

        public C0052a(String str, String str2, long j10) {
            this.f4222a = str;
            this.f4223b = str2;
            this.f4224c = j10;
        }

        public static String a(String str, String str2, long j10) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j10);
                return jSONObject.toString();
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e10);
                return null;
            }
        }

        public static C0052a b(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0052a(str, (String) null, 0);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0052a(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e10) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e10);
                return null;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0055, code lost:
        if (android.util.Log.isLoggable("FirebaseMessaging", 3) != false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0057, code lost:
        r1 = a.a.d("Error creating file in no backup dir: ");
        r1.append(r4.getMessage());
        android.util.Log.d("FirebaseMessaging", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            java.lang.String r0 = "com.google.android.gms.appid"
            r1 = 0
            android.content.SharedPreferences r0 = r4.getSharedPreferences(r0, r1)
            r3.f4220a = r0
            java.lang.String r1 = "com.google.android.gms.appid-no-backup"
            java.lang.Object r2 = d0.a.f4256a
            java.io.File r4 = d0.a.b.c(r4)
            java.io.File r2 = new java.io.File
            r2.<init>(r4, r1)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x0020
            goto L_0x006d
        L_0x0020:
            boolean r4 = r2.createNewFile()     // Catch:{ IOException -> 0x004d }
            if (r4 == 0) goto L_0x006d
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            java.util.Map r4 = r0.getAll()     // Catch:{ all -> 0x004a }
            boolean r4 = r4.isEmpty()     // Catch:{ all -> 0x004a }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            if (r4 != 0) goto L_0x006d
            java.lang.String r4 = "FirebaseMessaging"
            java.lang.String r1 = "App restored, clearing state"
            android.util.Log.i(r4, r1)     // Catch:{ IOException -> 0x004d }
            monitor-enter(r3)     // Catch:{ IOException -> 0x004d }
            android.content.SharedPreferences$Editor r4 = r0.edit()     // Catch:{ all -> 0x0047 }
            android.content.SharedPreferences$Editor r4 = r4.clear()     // Catch:{ all -> 0x0047 }
            r4.commit()     // Catch:{ all -> 0x0047 }
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            goto L_0x006d
        L_0x0047:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004a:
            r4 = move-exception
            monitor-exit(r3)     // Catch:{ IOException -> 0x004d }
            throw r4     // Catch:{ IOException -> 0x004d }
        L_0x004d:
            r4 = move-exception
            java.lang.String r0 = "FirebaseMessaging"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "FirebaseMessaging"
            java.lang.String r1 = "Error creating file in no backup dir: "
            java.lang.StringBuilder r1 = a.a.d(r1)
            java.lang.String r4 = r4.getMessage()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.d(r0, r4)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.a.<init>(android.content.Context):void");
    }

    public final String a(String str, String str2) {
        return str + "|T|" + str2 + "|" + Marker.ANY_MARKER;
    }
}
