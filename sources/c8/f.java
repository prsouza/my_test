package c8;

import android.content.Context;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public final File f3268a;

    /* renamed from: b  reason: collision with root package name */
    public final File f3269b;

    /* renamed from: c  reason: collision with root package name */
    public final File f3270c;

    /* renamed from: d  reason: collision with root package name */
    public final File f3271d;

    /* renamed from: e  reason: collision with root package name */
    public final File f3272e;

    public f(Context context) {
        File file = new File(context.getFilesDir(), ".com.google.firebase.crashlytics.files.v1");
        g(file);
        this.f3268a = file;
        File file2 = new File(file, "open-sessions");
        g(file2);
        this.f3269b = file2;
        File file3 = new File(file, "reports");
        g(file3);
        this.f3270c = file3;
        File file4 = new File(file, "priority-reports");
        g(file4);
        this.f3271d = file4;
        File file5 = new File(file, "native-reports");
        g(file5);
        this.f3272e = file5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        return r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.io.File g(java.io.File r5) {
        /*
            java.lang.Class<c8.f> r0 = c8.f.class
            monitor-enter(r0)
            boolean r1 = r5.exists()     // Catch:{ all -> 0x0057 }
            r2 = 0
            if (r1 == 0) goto L_0x0039
            boolean r1 = r5.isDirectory()     // Catch:{ all -> 0x0057 }
            if (r1 == 0) goto L_0x0012
            monitor-exit(r0)
            return r5
        L_0x0012:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r1.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "Unexpected non-directory file: "
            r1.append(r3)     // Catch:{ all -> 0x0057 }
            r1.append(r5)     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "; deleting file and creating new directory."
            r1.append(r3)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0057 }
            r3 = 3
            java.lang.String r4 = "FirebaseCrashlytics"
            boolean r3 = android.util.Log.isLoggable(r4, r3)     // Catch:{ all -> 0x0057 }
            if (r3 == 0) goto L_0x0036
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.d(r3, r1, r2)     // Catch:{ all -> 0x0057 }
        L_0x0036:
            r5.delete()     // Catch:{ all -> 0x0057 }
        L_0x0039:
            boolean r1 = r5.mkdirs()     // Catch:{ all -> 0x0057 }
            if (r1 != 0) goto L_0x0055
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0057 }
            r1.<init>()     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "Could not create Crashlytics-specific directory: "
            r1.append(r3)     // Catch:{ all -> 0x0057 }
            r1.append(r5)     // Catch:{ all -> 0x0057 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0057 }
            java.lang.String r3 = "FirebaseCrashlytics"
            android.util.Log.e(r3, r1, r2)     // Catch:{ all -> 0x0057 }
        L_0x0055:
            monitor-exit(r0)
            return r5
        L_0x0057:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.f.g(java.io.File):java.io.File");
    }

    public static boolean h(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File h10 : listFiles) {
                h(h10);
            }
        }
        return file.delete();
    }

    public static <T> List<T> i(T[] tArr) {
        return tArr == null ? Collections.emptyList() : Arrays.asList(tArr);
    }

    public final File a(String str) {
        return new File(this.f3268a, str);
    }

    public final List<File> b() {
        return i(this.f3272e.listFiles());
    }

    public final List<File> c() {
        return i(this.f3271d.listFiles());
    }

    public final List<File> d() {
        return i(this.f3270c.listFiles());
    }

    public final File e(String str) {
        File file = new File(this.f3269b, str);
        file.mkdirs();
        return file;
    }

    public final File f(String str, String str2) {
        return new File(e(str), str2);
    }
}
