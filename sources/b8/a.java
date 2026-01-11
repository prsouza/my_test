package b8;

import androidx.fragment.app.o;
import com.github.mikephil.charting.BuildConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final String f2901a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f2902b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, String> f2903c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f2901a = str;
        this.f2902b = map;
    }

    public final String a(String str, Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        StringBuilder sb3 = new StringBuilder();
        sb3.append((String) next.getKey());
        sb3.append("=");
        sb3.append(next.getValue() != null ? (String) next.getValue() : BuildConfig.FLAVOR);
        sb2.append(sb3.toString());
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            StringBuilder d10 = a.a.d("&");
            d10.append((String) next2.getKey());
            d10.append("=");
            d10.append(next2.getValue() != null ? (String) next2.getValue() : BuildConfig.FLAVOR);
            sb2.append(d10.toString());
        }
        String sb4 = sb2.toString();
        if (sb4.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return o.c(str, "?", sb4);
        }
        if (!str.endsWith("&")) {
            sb4 = a8.a.c("&", sb4);
        }
        return a8.a.c(str, sb4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    /* JADX WARNING: type inference failed for: r1v4 */
    /* JADX WARNING: type inference failed for: r1v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final b8.b b() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = "FirebaseCrashlytics"
            r1 = 0
            java.lang.String r2 = r9.f2901a     // Catch:{ all -> 0x00ab }
            java.util.Map<java.lang.String, java.lang.String> r3 = r9.f2902b     // Catch:{ all -> 0x00ab }
            java.lang.String r2 = r9.a(r2, r3)     // Catch:{ all -> 0x00ab }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ab }
            r3.<init>()     // Catch:{ all -> 0x00ab }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x00ab }
            r3.append(r2)     // Catch:{ all -> 0x00ab }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00ab }
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00ab }
            r5 = 0
            if (r4 == 0) goto L_0x0027
            android.util.Log.v(r0, r3, r1)     // Catch:{ all -> 0x00ab }
        L_0x0027:
            java.net.URL r0 = new java.net.URL     // Catch:{ all -> 0x00ab }
            r0.<init>(r2)     // Catch:{ all -> 0x00ab }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ all -> 0x00ab }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ all -> 0x00ab }
            r2 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r2)     // Catch:{ all -> 0x00a9 }
            r0.setConnectTimeout(r2)     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "GET"
            r0.setRequestMethod(r2)     // Catch:{ all -> 0x00a9 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r9.f2903c     // Catch:{ all -> 0x00a9 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a9 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a9 }
        L_0x0049:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x0065
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00a9 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x00a9 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x00a9 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x00a9 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x00a9 }
            r0.addRequestProperty(r4, r3)     // Catch:{ all -> 0x00a9 }
            goto L_0x0049
        L_0x0065:
            r0.connect()     // Catch:{ all -> 0x00a9 }
            int r2 = r0.getResponseCode()     // Catch:{ all -> 0x00a9 }
            java.io.InputStream r3 = r0.getInputStream()     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x009b
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x0097 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ all -> 0x0097 }
            java.lang.String r6 = "UTF-8"
            r4.<init>(r3, r6)     // Catch:{ all -> 0x0097 }
            r1.<init>(r4)     // Catch:{ all -> 0x0097 }
            r4 = 8192(0x2000, float:1.14794E-41)
            char[] r4 = new char[r4]     // Catch:{ all -> 0x0097 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0097 }
            r6.<init>()     // Catch:{ all -> 0x0097 }
        L_0x0087:
            int r7 = r1.read(r4)     // Catch:{ all -> 0x0097 }
            r8 = -1
            if (r7 == r8) goto L_0x0092
            r6.append(r4, r5, r7)     // Catch:{ all -> 0x0097 }
            goto L_0x0087
        L_0x0092:
            java.lang.String r1 = r6.toString()     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r1 = move-exception
            r2 = r1
            r1 = r3
            goto L_0x00ae
        L_0x009b:
            if (r3 == 0) goto L_0x00a0
            r3.close()
        L_0x00a0:
            r0.disconnect()
            b8.b r0 = new b8.b
            r0.<init>(r2, r1)
            return r0
        L_0x00a9:
            r2 = move-exception
            goto L_0x00ae
        L_0x00ab:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L_0x00ae:
            if (r1 == 0) goto L_0x00b3
            r1.close()
        L_0x00b3:
            if (r0 == 0) goto L_0x00b8
            r0.disconnect()
        L_0x00b8:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.a.b():b8.b");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.String>, java.util.HashMap] */
    public final a c(String str, String str2) {
        this.f2903c.put(str, str2);
        return this;
    }
}
