package com.bumptech.glide.load;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;

public final class b implements c.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ j3.b f3553b;

    public b(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, j3.b bVar) {
        this.f3552a = parcelFileDescriptorRewinder;
        this.f3553b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c A[SYNTHETIC, Splitter:B:14:0x002c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            p3.w r1 = new p3.w     // Catch:{ all -> 0x0029 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0029 }
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f3552a     // Catch:{ all -> 0x0029 }
            android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0029 }
            java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0029 }
            r2.<init>(r3)     // Catch:{ all -> 0x0029 }
            j3.b r3 = r4.f3553b     // Catch:{ all -> 0x0029 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0029 }
            j3.b r0 = r4.f3553b     // Catch:{ all -> 0x0026 }
            int r5 = r5.b(r1, r0)     // Catch:{ all -> 0x0026 }
            r1.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f3552a
            r0.a()
            return r5
        L_0x0026:
            r5 = move-exception
            r0 = r1
            goto L_0x002a
        L_0x0029:
            r5 = move-exception
        L_0x002a:
            if (r0 == 0) goto L_0x002f
            r0.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f3552a
            r0.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.b.a(com.bumptech.glide.load.ImageHeaderParser):int");
    }
}
