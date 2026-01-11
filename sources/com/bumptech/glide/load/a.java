package com.bumptech.glide.load;

import com.bumptech.glide.load.c;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import j3.b;

public final class a implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ParcelFileDescriptorRewinder f3550a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b f3551b;

    public a(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, b bVar) {
        this.f3550a = parcelFileDescriptorRewinder;
        this.f3551b = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a A[SYNTHETIC, Splitter:B:14:0x002a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.bumptech.glide.load.ImageHeaderParser.ImageType a(com.bumptech.glide.load.ImageHeaderParser r5) throws java.io.IOException {
        /*
            r4 = this;
            r0 = 0
            p3.w r1 = new p3.w     // Catch:{ all -> 0x0027 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0027 }
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r3 = r4.f3550a     // Catch:{ all -> 0x0027 }
            android.os.ParcelFileDescriptor r3 = r3.a()     // Catch:{ all -> 0x0027 }
            java.io.FileDescriptor r3 = r3.getFileDescriptor()     // Catch:{ all -> 0x0027 }
            r2.<init>(r3)     // Catch:{ all -> 0x0027 }
            j3.b r3 = r4.f3551b     // Catch:{ all -> 0x0027 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0027 }
            com.bumptech.glide.load.ImageHeaderParser$ImageType r5 = r5.c(r1)     // Catch:{ all -> 0x0024 }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f3550a
            r0.a()
            return r5
        L_0x0024:
            r5 = move-exception
            r0 = r1
            goto L_0x0028
        L_0x0027:
            r5 = move-exception
        L_0x0028:
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ IOException -> 0x002d }
        L_0x002d:
            com.bumptech.glide.load.data.ParcelFileDescriptorRewinder r0 = r4.f3550a
            r0.a()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.a.a(com.bumptech.glide.load.ImageHeaderParser):com.bumptech.glide.load.ImageHeaderParser$ImageType");
    }
}
