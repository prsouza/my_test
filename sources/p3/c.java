package p3;

import android.graphics.Bitmap;
import g3.g;
import g3.h;
import g3.k;
import j3.b;

public final class c implements k<Bitmap> {

    /* renamed from: b  reason: collision with root package name */
    public static final g<Integer> f9583b = g.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c  reason: collision with root package name */
    public static final g<Bitmap.CompressFormat> f9584c = new g<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, g.f5232e);

    /* renamed from: a  reason: collision with root package name */
    public final b f9585a;

    public c(b bVar) {
        this.f9585a = bVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|41|(0)|45|46) */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0069, code lost:
        if (r6 == null) goto L_0x006e;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00c2 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0064 A[Catch:{ all -> 0x005a }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf A[SYNTHETIC, Splitter:B:43:0x00bf] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(java.lang.Object r9, java.io.File r10, g3.h r11) {
        /*
            r8 = this;
            i3.w r9 = (i3.w) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            g3.g<android.graphics.Bitmap$CompressFormat> r1 = f9584c
            java.lang.Object r1 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r1 = (android.graphics.Bitmap.CompressFormat) r1
            if (r1 == 0) goto L_0x0015
            goto L_0x0020
        L_0x0015:
            boolean r1 = r9.hasAlpha()
            if (r1 == 0) goto L_0x001e
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG
            goto L_0x0020
        L_0x001e:
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
        L_0x0020:
            r9.getWidth()
            r9.getHeight()
            int r2 = c4.f.f3234b     // Catch:{ all -> 0x00c3 }
            long r2 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch:{ all -> 0x00c3 }
            g3.g<java.lang.Integer> r4 = f9583b     // Catch:{ all -> 0x00c3 }
            java.lang.Object r4 = r11.c(r4)     // Catch:{ all -> 0x00c3 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x00c3 }
            int r4 = r4.intValue()     // Catch:{ all -> 0x00c3 }
            r5 = 0
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x005c }
            r7.<init>(r10)     // Catch:{ IOException -> 0x005c }
            j3.b r10 = r8.f9585a     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            if (r10 == 0) goto L_0x004c
            com.bumptech.glide.load.data.c r10 = new com.bumptech.glide.load.data.c     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            j3.b r6 = r8.f9585a     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r10.<init>(r7, r6)     // Catch:{ IOException -> 0x0057, all -> 0x0055 }
            r6 = r10
            goto L_0x004d
        L_0x004c:
            r6 = r7
        L_0x004d:
            r9.compress(r1, r4, r6)     // Catch:{ IOException -> 0x005c }
            r6.close()     // Catch:{ IOException -> 0x005c }
            r5 = 1
            goto L_0x006b
        L_0x0055:
            r9 = move-exception
            goto L_0x00bd
        L_0x0057:
            r10 = move-exception
            r6 = r7
            goto L_0x005d
        L_0x005a:
            r9 = move-exception
            goto L_0x00bc
        L_0x005c:
            r10 = move-exception
        L_0x005d:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x005a }
            if (r4 == 0) goto L_0x0069
            java.lang.String r4 = "Failed to encode Bitmap"
            android.util.Log.d(r0, r4, r10)     // Catch:{ all -> 0x005a }
        L_0x0069:
            if (r6 == 0) goto L_0x006e
        L_0x006b:
            r6.close()     // Catch:{ IOException -> 0x006e }
        L_0x006e:
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r0, r10)     // Catch:{ all -> 0x00c3 }
            if (r10 == 0) goto L_0x00bb
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00c3 }
            r10.<init>()     // Catch:{ all -> 0x00c3 }
            java.lang.String r4 = "Compressed with type: "
            r10.append(r4)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " of size "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            int r1 = c4.j.d(r9)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = " in "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            double r1 = c4.f.a(r2)     // Catch:{ all -> 0x00c3 }
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            java.lang.String r1 = ", options format: "
            r10.append(r1)     // Catch:{ all -> 0x00c3 }
            g3.g<android.graphics.Bitmap$CompressFormat> r1 = f9584c     // Catch:{ all -> 0x00c3 }
            java.lang.Object r11 = r11.c(r1)     // Catch:{ all -> 0x00c3 }
            r10.append(r11)     // Catch:{ all -> 0x00c3 }
            java.lang.String r11 = ", hasAlpha: "
            r10.append(r11)     // Catch:{ all -> 0x00c3 }
            boolean r9 = r9.hasAlpha()     // Catch:{ all -> 0x00c3 }
            r10.append(r9)     // Catch:{ all -> 0x00c3 }
            java.lang.String r9 = r10.toString()     // Catch:{ all -> 0x00c3 }
            android.util.Log.v(r0, r9)     // Catch:{ all -> 0x00c3 }
        L_0x00bb:
            return r5
        L_0x00bc:
            r7 = r6
        L_0x00bd:
            if (r7 == 0) goto L_0x00c2
            r7.close()     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            throw r9     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.c.f(java.lang.Object, java.io.File, g3.h):boolean");
    }

    public final g3.c h(h hVar) {
        return g3.c.TRANSFORMED;
    }
}
