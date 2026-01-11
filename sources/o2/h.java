package o2;

import android.content.Context;
import java.util.concurrent.Callable;

public final class h implements Callable<q<f>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f9215a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f9216b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f9217c;

    public h(Context context, String str, String str2) {
        this.f9215a = context;
        this.f9216b = str;
        this.f9217c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00c7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() throws java.lang.Exception {
        /*
            r10 = this;
            android.content.Context r0 = r10.f9215a
            x2.f r1 = ad.c.Z
            if (r1 != 0) goto L_0x003b
            java.lang.Class<x2.f> r2 = x2.f.class
            monitor-enter(r2)
            x2.f r1 = ad.c.Z     // Catch:{ all -> 0x0038 }
            if (r1 != 0) goto L_0x0036
            x2.f r1 = new x2.f     // Catch:{ all -> 0x0038 }
            x2.e r3 = ad.c.f302a0     // Catch:{ all -> 0x0038 }
            if (r3 != 0) goto L_0x002c
            java.lang.Class<x2.e> r3 = x2.e.class
            monitor-enter(r3)     // Catch:{ all -> 0x0038 }
            x2.e r4 = ad.c.f302a0     // Catch:{ all -> 0x0029 }
            if (r4 != 0) goto L_0x0026
            x2.e r4 = new x2.e     // Catch:{ all -> 0x0029 }
            o2.c r5 = new o2.c     // Catch:{ all -> 0x0029 }
            r5.<init>(r0)     // Catch:{ all -> 0x0029 }
            r4.<init>(r5)     // Catch:{ all -> 0x0029 }
            ad.c.f302a0 = r4     // Catch:{ all -> 0x0029 }
        L_0x0026:
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            r3 = r4
            goto L_0x002c
        L_0x0029:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0029 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x002c:
            x2.b r0 = new x2.b     // Catch:{ all -> 0x0038 }
            r0.<init>()     // Catch:{ all -> 0x0038 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0038 }
            ad.c.Z = r1     // Catch:{ all -> 0x0038 }
        L_0x0036:
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            goto L_0x003b
        L_0x0038:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0038 }
            throw r0
        L_0x003b:
            java.lang.String r0 = r10.f9216b
            java.lang.String r2 = r10.f9217c
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L_0x0045
            goto L_0x00be
        L_0x0045:
            x2.e r5 = r1.f12759a
            java.util.Objects.requireNonNull(r5)
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0099 }
            java.io.File r7 = r5.b()     // Catch:{ FileNotFoundException -> 0x0099 }
            x2.c r8 = x2.c.JSON     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r9 = x2.e.a(r0, r8, r3)     // Catch:{ FileNotFoundException -> 0x0099 }
            r6.<init>(r7, r9)     // Catch:{ FileNotFoundException -> 0x0099 }
            boolean r7 = r6.exists()     // Catch:{ FileNotFoundException -> 0x0099 }
            if (r7 == 0) goto L_0x0060
            goto L_0x0077
        L_0x0060:
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0099 }
            java.io.File r5 = r5.b()     // Catch:{ FileNotFoundException -> 0x0099 }
            x2.c r7 = x2.c.ZIP     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r7 = x2.e.a(r0, r7, r3)     // Catch:{ FileNotFoundException -> 0x0099 }
            r6.<init>(r5, r7)     // Catch:{ FileNotFoundException -> 0x0099 }
            boolean r5 = r6.exists()     // Catch:{ FileNotFoundException -> 0x0099 }
            if (r5 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0076:
            r6 = r4
        L_0x0077:
            if (r6 != 0) goto L_0x007a
            goto L_0x0099
        L_0x007a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0099 }
            r5.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0099 }
            java.lang.String r7 = r6.getAbsolutePath()
            java.lang.String r9 = ".zip"
            boolean r7 = r7.endsWith(r9)
            if (r7 == 0) goto L_0x008d
            x2.c r8 = x2.c.ZIP
        L_0x008d:
            r6.getAbsolutePath()
            a3.c.a()
            android.util.Pair r6 = new android.util.Pair
            r6.<init>(r8, r5)
            goto L_0x009a
        L_0x0099:
            r6 = r4
        L_0x009a:
            if (r6 != 0) goto L_0x009d
            goto L_0x00be
        L_0x009d:
            java.lang.Object r5 = r6.first
            x2.c r5 = (x2.c) r5
            java.lang.Object r6 = r6.second
            java.io.InputStream r6 = (java.io.InputStream) r6
            x2.c r7 = x2.c.ZIP
            if (r5 != r7) goto L_0x00b3
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream
            r5.<init>(r6)
            o2.q r5 = o2.g.f(r5, r0)
            goto L_0x00b7
        L_0x00b3:
            o2.q r5 = o2.g.c(r6, r0)
        L_0x00b7:
            V r5 = r5.f9292a
            if (r5 == 0) goto L_0x00be
            o2.f r5 = (o2.f) r5
            goto L_0x00bf
        L_0x00be:
            r5 = r4
        L_0x00bf:
            if (r5 == 0) goto L_0x00c7
            o2.q r0 = new o2.q
            r0.<init>(r5)
            goto L_0x0122
        L_0x00c7:
            a3.c.a()
            java.lang.String r5 = "LottieFetchResult close failed "
            a3.c.a()
            x2.b r6 = r1.f12760b     // Catch:{ Exception -> 0x0111 }
            x2.a r4 = r6.a(r0)     // Catch:{ Exception -> 0x0111 }
            r6 = 1
            java.net.HttpURLConnection r7 = r4.f12757a     // Catch:{ IOException -> 0x00e2 }
            int r7 = r7.getResponseCode()     // Catch:{ IOException -> 0x00e2 }
            int r7 = r7 / 100
            r8 = 2
            if (r7 != r8) goto L_0x00e2
            r3 = r6
        L_0x00e2:
            if (r3 == 0) goto L_0x00f8
            java.net.HttpURLConnection r3 = r4.f12757a     // Catch:{ Exception -> 0x0111 }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ Exception -> 0x0111 }
            java.net.HttpURLConnection r6 = r4.f12757a     // Catch:{ Exception -> 0x0111 }
            java.lang.String r6 = r6.getContentType()     // Catch:{ Exception -> 0x0111 }
            o2.q r0 = r1.a(r0, r3, r6, r2)     // Catch:{ Exception -> 0x0111 }
            a3.c.a()     // Catch:{ Exception -> 0x0111 }
            goto L_0x0106
        L_0x00f8:
            o2.q r0 = new o2.q     // Catch:{ Exception -> 0x0111 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x0111 }
            java.lang.String r2 = r4.a()     // Catch:{ Exception -> 0x0111 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0111 }
            r0.<init>((java.lang.Throwable) r1)     // Catch:{ Exception -> 0x0111 }
        L_0x0106:
            r4.close()     // Catch:{ IOException -> 0x010a }
            goto L_0x0122
        L_0x010a:
            r1 = move-exception
            a3.c.c(r5, r1)
            goto L_0x0122
        L_0x010f:
            r0 = move-exception
            goto L_0x0132
        L_0x0111:
            r0 = move-exception
            o2.q r1 = new o2.q     // Catch:{ all -> 0x010f }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ all -> 0x010f }
            if (r4 == 0) goto L_0x0121
            r4.close()     // Catch:{ IOException -> 0x011d }
            goto L_0x0121
        L_0x011d:
            r0 = move-exception
            a3.c.c(r5, r0)
        L_0x0121:
            r0 = r1
        L_0x0122:
            java.lang.String r1 = r10.f9217c
            if (r1 == 0) goto L_0x0131
            V r2 = r0.f9292a
            if (r2 == 0) goto L_0x0131
            t2.g r3 = t2.g.f11275b
            o2.f r2 = (o2.f) r2
            r3.a(r1, r2)
        L_0x0131:
            return r0
        L_0x0132:
            if (r4 == 0) goto L_0x013c
            r4.close()     // Catch:{ IOException -> 0x0138 }
            goto L_0x013c
        L_0x0138:
            r1 = move-exception
            a3.c.c(r5, r1)
        L_0x013c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.h.call():java.lang.Object");
    }
}
