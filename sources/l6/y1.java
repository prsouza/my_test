package l6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.Properties;
import m3.u;
import n6.c;

public final class y1 {

    /* renamed from: d  reason: collision with root package name */
    public static final u f8104d = new u("PackMetadataManager");

    /* renamed from: a  reason: collision with root package name */
    public final a0 f8105a;

    /* renamed from: b  reason: collision with root package name */
    public final z1 f8106b;

    /* renamed from: c  reason: collision with root package name */
    public final c f8107c;

    public y1(a0 a0Var, z1 z1Var, c cVar) {
        this.f8105a = a0Var;
        this.f8106b = z1Var;
        this.f8107c = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0060 */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r8) {
        /*
            r7 = this;
            n6.c r0 = r7.f8107c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x006c
            l6.a0 r0 = r7.f8105a
            java.util.Objects.requireNonNull(r0)
            r1 = 1
            r2 = 0
            java.lang.String r0 = r0.u(r8)     // Catch:{ IOException -> 0x0017 }
            if (r0 == 0) goto L_0x0017
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            if (r0 != 0) goto L_0x001b
            goto L_0x006c
        L_0x001b:
            l6.z1 r0 = r7.f8106b
            int r0 = r0.a()
            l6.a0 r3 = r7.f8105a
            long r4 = r3.l(r8)
            java.io.File r6 = new java.io.File
            java.io.File r3 = r3.o(r8, r0, r4)
            java.lang.String r4 = "properties.dat"
            r6.<init>(r3, r4)
            boolean r3 = r6.exists()     // Catch:{ IOException -> 0x0061 }
            if (r3 != 0) goto L_0x003d
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0061 }
            goto L_0x005b
        L_0x003d:
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0061 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0061 }
            java.util.Properties r4 = new java.util.Properties     // Catch:{ all -> 0x005c }
            r4.<init>()     // Catch:{ all -> 0x005c }
            r4.load(r3)     // Catch:{ all -> 0x005c }
            r3.close()     // Catch:{ IOException -> 0x0061 }
            java.lang.String r3 = "moduleVersionTag"
            java.lang.String r3 = r4.getProperty(r3)     // Catch:{ IOException -> 0x0061 }
            if (r3 != 0) goto L_0x005a
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x0061 }
            goto L_0x005b
        L_0x005a:
            r8 = r3
        L_0x005b:
            return r8
        L_0x005c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0060 }
        L_0x0060:
            throw r0     // Catch:{ IOException -> 0x0061 }
        L_0x0061:
            m3.u r0 = f8104d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r8
            java.lang.String r8 = "Failed to read pack version tag for pack %s"
            r0.c(r8, r1)
        L_0x006c:
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.y1.a(java.lang.String):java.lang.String");
    }

    public final void b(String str, int i, long j10, String str2) throws IOException {
        if (str2 == null || str2.isEmpty()) {
            str2 = String.valueOf(i);
        }
        Properties properties = new Properties();
        properties.put("moduleVersionTag", str2);
        a0 a0Var = this.f8105a;
        Objects.requireNonNull(a0Var);
        File file = new File(a0Var.o(str, i, j10), "properties.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            return;
        } catch (Throwable unused) {
        }
        throw th;
    }
}
