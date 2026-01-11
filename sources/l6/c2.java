package l6;

import m3.u;
import o6.w;

public final class c2 {

    /* renamed from: c  reason: collision with root package name */
    public static final u f7807c = new u("PatchSliceTaskHandler");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f7808a;

    /* renamed from: b  reason: collision with root package name */
    public final w f7809b;

    public c2(a0 a0Var, w wVar) {
        this.f7808a = a0Var;
        this.f7809b = wVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00ab */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(l6.b2 r15) {
        /*
            r14 = this;
            l6.a0 r0 = r14.f7808a
            java.lang.String r1 = r15.f2905b
            int r2 = r15.f7790c
            long r3 = r15.f7791d
            java.io.File r0 = r0.n(r1, r2, r3)
            l6.a0 r1 = r14.f7808a
            java.lang.String r2 = r15.f2905b
            int r3 = r15.f7790c
            long r4 = r15.f7791d
            java.lang.String r6 = r15.f7794h
            java.io.File r7 = new java.io.File
            java.io.File r1 = r1.o(r2, r3, r4)
            r7.<init>(r1, r6)
            r1 = 2
            r2 = 1
            r3 = 0
            java.io.InputStream r4 = r15.f7795j     // Catch:{ IOException -> 0x00ac }
            int r5 = r15.g     // Catch:{ IOException -> 0x00ac }
            if (r5 == r1) goto L_0x0029
            goto L_0x0031
        L_0x0029:
            java.util.zip.GZIPInputStream r5 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x00ac }
            r6 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r4, r6)     // Catch:{ IOException -> 0x00ac }
            r4 = r5
        L_0x0031:
            l6.d0 r5 = new l6.d0     // Catch:{ all -> 0x00a7 }
            r5.<init>(r0, r7)     // Catch:{ all -> 0x00a7 }
            l6.a0 r8 = r14.f7808a     // Catch:{ all -> 0x00a7 }
            java.lang.String r9 = r15.f2905b     // Catch:{ all -> 0x00a7 }
            int r10 = r15.f7792e     // Catch:{ all -> 0x00a7 }
            long r11 = r15.f7793f     // Catch:{ all -> 0x00a7 }
            java.lang.String r13 = r15.f7794h     // Catch:{ all -> 0x00a7 }
            java.io.File r0 = r8.s(r9, r10, r11, r13)     // Catch:{ all -> 0x00a7 }
            boolean r6 = r0.exists()     // Catch:{ all -> 0x00a7 }
            if (r6 != 0) goto L_0x004d
            r0.mkdirs()     // Catch:{ all -> 0x00a7 }
        L_0x004d:
            l6.h2 r13 = new l6.h2     // Catch:{ all -> 0x00a7 }
            l6.a0 r7 = r14.f7808a     // Catch:{ all -> 0x00a7 }
            java.lang.String r8 = r15.f2905b     // Catch:{ all -> 0x00a7 }
            int r9 = r15.f7792e     // Catch:{ all -> 0x00a7 }
            long r10 = r15.f7793f     // Catch:{ all -> 0x00a7 }
            java.lang.String r12 = r15.f7794h     // Catch:{ all -> 0x00a7 }
            r6 = r13
            r6.<init>(r7, r8, r9, r10, r12)     // Catch:{ all -> 0x00a7 }
            l6.w0 r6 = new l6.w0     // Catch:{ all -> 0x00a7 }
            r6.<init>(r0, r13)     // Catch:{ all -> 0x00a7 }
            long r7 = r15.i     // Catch:{ all -> 0x00a7 }
            o6.t.a(r5, r4, r6, r7)     // Catch:{ all -> 0x00a7 }
            r13.h(r3)     // Catch:{ all -> 0x00a7 }
            r4.close()     // Catch:{ IOException -> 0x00ac }
            m3.u r0 = f7807c
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f7794h
            r4[r3] = r5
            java.lang.String r5 = r15.f2905b
            r4[r2] = r5
            java.lang.String r5 = "Patching and extraction finished for slice %s of pack %s."
            r0.e(r5, r4)
            o6.w r0 = r14.f7809b
            java.lang.Object r0 = r0.zza()
            l6.v2 r0 = (l6.v2) r0
            int r4 = r15.f2904a
            java.lang.String r5 = r15.f2905b
            java.lang.String r6 = r15.f7794h
            r0.a(r4, r5, r6, r3)
            java.io.InputStream r0 = r15.f7795j     // Catch:{ IOException -> 0x0095 }
            r0.close()     // Catch:{ IOException -> 0x0095 }
            return
        L_0x0095:
            m3.u r0 = f7807c
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r4 = r15.f7794h
            r1[r3] = r4
            java.lang.String r15 = r15.f2905b
            r1[r2] = r15
            java.lang.String r15 = "Could not close file for slice %s of pack %s."
            r0.g(r15, r1)
            return
        L_0x00a7:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            throw r0     // Catch:{ IOException -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            m3.u r4 = f7807c
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.String r6 = r0.getMessage()
            r5[r3] = r6
            java.lang.String r6 = "IOException during patching %s."
            r4.c(r6, r5)
            l6.t0 r4 = new l6.t0
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r5 = r15.f7794h
            r1[r3] = r5
            java.lang.String r3 = r15.f2905b
            r1[r2] = r3
            java.lang.String r2 = "Error patching slice %s of pack %s."
            java.lang.String r1 = java.lang.String.format(r2, r1)
            int r15 = r15.f2904a
            r4.<init>(r1, r0, r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.c2.a(l6.b2):void");
    }
}
