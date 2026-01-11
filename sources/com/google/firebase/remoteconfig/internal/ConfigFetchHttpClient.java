package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import b9.d;
import b9.e;
import e0.a;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f4225h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a  reason: collision with root package name */
    public final Context f4226a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4227b;

    /* renamed from: c  reason: collision with root package name */
    public final String f4228c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4229d;

    /* renamed from: e  reason: collision with root package name */
    public final String f4230e;

    /* renamed from: f  reason: collision with root package name */
    public final long f4231f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j10, long j11) {
        this.f4226a = context;
        this.f4227b = str;
        this.f4228c = str2;
        Matcher matcher = f4225h.matcher(str);
        this.f4229d = matcher.matches() ? matcher.group(1) : null;
        this.f4230e = "firebase";
        this.f4231f = j10;
        this.g = j11;
    }

    public final JSONObject a(String str, String str2, Map<String, String> map) throws d {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f4227b);
            Locale locale = this.f4226a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            int i = Build.VERSION.SDK_INT;
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(i));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.f4226a.getPackageManager().getPackageInfo(this.f4226a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                    hashMap.put("appBuild", Long.toString(a.a(packageInfo)));
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.f4226a.getPackageName());
            hashMap.put("sdkVersion", "21.0.2");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new d("Fetch failed: Firebase installation id is null.");
    }

    public final HttpURLConnection b() throws e {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.f4229d, this.f4230e})).openConnection();
        } catch (IOException e10) {
            throw new e(e10.getMessage());
        }
    }

    public final JSONObject c(URLConnection uRLConnection) throws IOException, JSONException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb2.toString());
            }
            sb2.append((char) read);
        }
    }

    public final void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(16:30|31|32|(2:33|34)|(3:38|39|40)|41|(2:43|44)|(3:48|49|50)|51|53|54|(3:57|58|59)|60|61|62|63) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x014e */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a4 A[LOOP:0: B:10:0x009e->B:12:0x00a4, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d6 A[Catch:{ IOException | JSONException -> 0x016e, all -> 0x016c }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0162 A[SYNTHETIC, Splitter:B:67:0x0162] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.firebase.remoteconfig.internal.a.C0053a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) throws b9.e {
        /*
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f4231f
            long r2 = r1.toMillis(r2)
            int r2 = (int) r2
            r7.setConnectTimeout(r2)
            long r2 = r6.g
            long r1 = r1.toMillis(r2)
            int r1 = (int) r1
            r7.setReadTimeout(r1)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = r6.f4228c
            java.lang.String r1 = "X-Goog-Api-Key"
            r7.setRequestProperty(r1, r11)
            android.content.Context r11 = r6.f4226a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "FirebaseRemoteConfig"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.f4226a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r3.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            byte[] r3 = com.google.android.gms.common.util.AndroidUtilsLight.getPackageCertificateHashBytes(r3, r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            if (r3 != 0) goto L_0x005c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = "Could not get fingerprint hash for package: "
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            android.content.Context r4 = r6.f4226a     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0061 }
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0061 }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0061 }
            android.util.Log.e(r11, r3)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0078
        L_0x005c:
            java.lang.String r11 = com.google.android.gms.common.util.Hex.bytesToStringUppercase(r3, r1)     // Catch:{ NameNotFoundException -> 0x0061 }
            goto L_0x0079
        L_0x0061:
            r3 = move-exception
            java.lang.String r4 = "No such package: "
            java.lang.StringBuilder r4 = a.a.d(r4)
            android.content.Context r5 = r6.f4226a
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r11, r4, r3)
        L_0x0078:
            r11 = r2
        L_0x0079:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r11, r3)
            java.lang.String r11 = "X-Goog-Firebase-Installations-Auth"
            r7.setRequestProperty(r11, r9)
            java.lang.String r11 = "application/json"
            java.lang.String r3 = "Content-Type"
            r7.setRequestProperty(r3, r11)
            java.lang.String r3 = "Accept"
            r7.setRequestProperty(r3, r11)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009e:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00ba
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r3, r12)
            goto L_0x009e
        L_0x00ba:
            org.json.JSONObject r8 = r6.a(r8, r9, r10)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            r6.d(r7, r8)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            r7.connect()     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0162
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            org.json.JSONObject r9 = r6.c(r7)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00ea }
            r7.close()     // Catch:{ IOException -> 0x00ea }
        L_0x00ea:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch:{ JSONException -> 0x00f8 }
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch:{ JSONException -> 0x00f8 }
            r7 = r7 ^ r0
            goto L_0x00f9
        L_0x00f8:
            r7 = r0
        L_0x00f9:
            if (r7 != 0) goto L_0x0101
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r0, r2, r2)
            return r7
        L_0x0101:
            java.util.Date r7 = c9.f.f3286f     // Catch:{ JSONException -> 0x0159 }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0159 }
            r7.<init>()     // Catch:{ JSONException -> 0x0159 }
            java.util.Date r10 = c9.f.f3286f     // Catch:{ JSONException -> 0x0159 }
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0159 }
            r10.<init>()     // Catch:{ JSONException -> 0x0159 }
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0159 }
            r11.<init>()     // Catch:{ JSONException -> 0x0159 }
            java.lang.String r12 = "entries"
            org.json.JSONObject r12 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x011b }
            goto L_0x011c
        L_0x011b:
            r12 = r2
        L_0x011c:
            if (r12 == 0) goto L_0x0128
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0128 }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x0128 }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x0128 }
            r7 = r0
        L_0x0128:
            java.lang.String r12 = "experimentDescriptions"
            org.json.JSONArray r12 = r9.getJSONArray(r12)     // Catch:{ JSONException -> 0x012f }
            goto L_0x0130
        L_0x012f:
            r12 = r2
        L_0x0130:
            if (r12 == 0) goto L_0x013c
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x013c }
            java.lang.String r12 = r12.toString()     // Catch:{ JSONException -> 0x013c }
            r0.<init>(r12)     // Catch:{ JSONException -> 0x013c }
            r10 = r0
        L_0x013c:
            java.lang.String r12 = "personalizationMetadata"
            org.json.JSONObject r2 = r9.getJSONObject(r12)     // Catch:{ JSONException -> 0x0142 }
        L_0x0142:
            if (r2 == 0) goto L_0x014e
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch:{ JSONException -> 0x014e }
            java.lang.String r12 = r2.toString()     // Catch:{ JSONException -> 0x014e }
            r9.<init>(r12)     // Catch:{ JSONException -> 0x014e }
            r11 = r9
        L_0x014e:
            c9.f r9 = new c9.f     // Catch:{ JSONException -> 0x0159 }
            r9.<init>(r7, r13, r10, r11)     // Catch:{ JSONException -> 0x0159 }
            com.google.firebase.remoteconfig.internal.a$a r7 = new com.google.firebase.remoteconfig.internal.a$a
            r7.<init>(r1, r9, r8)
            return r7
        L_0x0159:
            r7 = move-exception
            b9.d r8 = new b9.d
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L_0x0162:
            b9.g r9 = new b9.g     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            java.lang.String r10 = r7.getResponseMessage()     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
            throw r9     // Catch:{ IOException -> 0x0170, JSONException -> 0x016e }
        L_0x016c:
            r8 = move-exception
            goto L_0x0179
        L_0x016e:
            r8 = move-exception
            goto L_0x0171
        L_0x0170:
            r8 = move-exception
        L_0x0171:
            b9.d r9 = new b9.d     // Catch:{ all -> 0x016c }
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x016c }
            throw r9     // Catch:{ all -> 0x016c }
        L_0x0179:
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0183 }
            r7.close()     // Catch:{ IOException -> 0x0183 }
        L_0x0183:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):com.google.firebase.remoteconfig.internal.a$a");
    }
}
