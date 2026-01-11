package f9;

import android.content.Context;
import java.io.File;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import md.h;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final h f5029a = new h(a.f5032b);

    /* renamed from: b  reason: collision with root package name */
    public final ReentrantReadWriteLock f5030b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    public final Context f5031c;

    public static final class a extends yd.h implements xd.a<e> {

        /* renamed from: b  reason: collision with root package name */
        public static final a f5032b = new a();

        public a() {
            super(0);
        }

        public final Object c() {
            return new e();
        }
    }

    public c(Context context) {
        this.f5031c = context;
    }

    public final File a(String str) {
        File file = new File(this.f5031c.getFilesDir(), ".phrase_cache");
        file.mkdirs();
        return new File(file, str + ".xml");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        ad.c.z(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f9.b b(java.lang.String r4) {
        /*
            r3 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r3.f5030b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r0.lock()
            java.io.File r4 = r3.a(r4)     // Catch:{ all -> 0x002d }
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x002d }
            r1.<init>(r4)     // Catch:{ all -> 0x002d }
            r4 = 0
            md.h r2 = r3.f5029a     // Catch:{ all -> 0x0026 }
            java.lang.Object r2 = r2.a()     // Catch:{ all -> 0x0026 }
            f9.e r2 = (f9.e) r2     // Catch:{ all -> 0x0026 }
            f9.b r2 = r2.c(r1)     // Catch:{ all -> 0x0026 }
            ad.c.z(r1, r4)     // Catch:{ all -> 0x002d }
            r0.unlock()
            return r2
        L_0x0026:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2 = move-exception
            ad.c.z(r1, r4)     // Catch:{ all -> 0x002d }
            throw r2     // Catch:{ all -> 0x002d }
        L_0x002d:
            r4 = move-exception
            r0.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.c.b(java.lang.String):f9.b");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void c(java.lang.String r6, java.io.InputStream r7) {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.f5030b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r1 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            r3 = 0
            if (r2 != 0) goto L_0x0012
            int r2 = r0.getReadHoldCount()
            goto L_0x0013
        L_0x0012:
            r2 = r3
        L_0x0013:
            r4 = r3
        L_0x0014:
            if (r4 >= r2) goto L_0x001c
            r1.unlock()
            int r4 = r4 + 1
            goto L_0x0014
        L_0x001c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.io.File r6 = r5.a(r6)     // Catch:{ all -> 0x003b }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x003b }
            r4.<init>(r6)     // Catch:{ all -> 0x003b }
            y.c.t(r7, r4)     // Catch:{ all -> 0x003b }
        L_0x002f:
            if (r3 >= r2) goto L_0x0037
            r1.lock()
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0037:
            r0.unlock()
            return
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r3 >= r2) goto L_0x0044
            r1.lock()
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0044:
            r0.unlock()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.c.c(java.lang.String, java.io.InputStream):void");
    }
}
