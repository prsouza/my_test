package v1;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import u1.p;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final String f12148a = p.e("WrkDbPathHelper");

    /* renamed from: b  reason: collision with root package name */
    public static final String[] f12149b = {"-journal", "-shm", "-wal"};

    public static void a(Context context) {
        String str;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            p.c().a(f12148a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : f12149b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        p.c().f(f12148a, String.format("Over-writing contents of %s", new Object[]{file3}), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        str = String.format("Migrated %s to %s", new Object[]{file2, file3});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{file2, file3});
                    }
                    p.c().a(f12148a, str, new Throwable[0]);
                }
            }
        }
    }
}
