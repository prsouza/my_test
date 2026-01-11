package l6;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import m3.u;

public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final u f7781c = new u("AssetPackStorage");

    /* renamed from: a  reason: collision with root package name */
    public final Context f7782a;

    /* renamed from: b  reason: collision with root package name */
    public final z1 f7783b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    public a0(Context context, z1 z1Var) {
        this.f7782a = context;
        this.f7783b = z1Var;
    }

    public static long d(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f7781c.g("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e10) {
            f7781c.d(e10, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    public static void i(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long d10 = d(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(d10)) && !file2.getName().equals("stale.tmp")) {
                    j(file2);
                }
            }
        }
    }

    public static boolean j(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File j10 : listFiles) {
                z &= j(j10);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    public final void a(String str, int i, long j10, int i10) throws IOException {
        File file = new File(p(str, i, j10), "merge.tmp");
        Properties properties = new Properties();
        properties.put("numberOfMerges", String.valueOf(i10));
        file.getParentFile().mkdirs();
        file.createNewFile();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        properties.store(fileOutputStream, (String) null);
        fileOutputStream.close();
    }

    public final void b(String str, int i, long j10) {
        File e10 = e(str);
        if (e10.exists()) {
            for (File file : e10.listFiles()) {
                if (!file.getName().equals(String.valueOf(i)) && !file.getName().equals("stale.tmp")) {
                    j(file);
                } else if (file.getName().equals(String.valueOf(i))) {
                    for (File file2 : file.listFiles()) {
                        if (!file2.getName().equals(String.valueOf(j10))) {
                            j(file2);
                        }
                    }
                }
            }
        }
    }

    public final boolean c(String str, int i, long j10) {
        if (!f(str, i, j10).exists()) {
            return true;
        }
        return j(f(str, i, j10));
    }

    public final File e(String str) {
        return new File(g(), str);
    }

    public final File f(String str, int i, long j10) {
        return new File(new File(new File(new File(g(), "_tmp"), str), String.valueOf(i)), String.valueOf(j10));
    }

    public final File g() {
        return new File(this.f7782a.getFilesDir(), "assetpacks");
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        try {
            if (g().exists()) {
                if (g().listFiles() != null) {
                    for (File file : g().listFiles()) {
                        if (!file.getCanonicalPath().equals(new File(g(), "_tmp").getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e10) {
            f7781c.c("Could not process directory while scanning installed packs. %s", e10);
        }
    }

    public final int k(String str, int i, long j10) throws IOException {
        File file = new File(p(str, i, j10), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e10) {
                    throw new t0("Merge checkpoint file corrupt.", (Exception) e10);
                }
            } else {
                throw new t0("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    public final long l(String str) {
        return d(m(str, (int) d(e(str), true)), true);
    }

    public final File m(String str, int i) {
        return new File(e(str), String.valueOf(i));
    }

    public final File n(String str, int i, long j10) {
        return new File(m(str, i), String.valueOf(j10));
    }

    public final File o(String str, int i, long j10) {
        return new File(n(str, i, j10), "_metadata");
    }

    public final File p(String str, int i, long j10) {
        return new File(f(str, i, j10), "_packs");
    }

    public final File q(String str, int i, long j10, String str2) {
        return new File(r(str, i, j10, str2), "checkpoint.dat");
    }

    public final File r(String str, int i, long j10, String str2) {
        return new File(new File(new File(f(str, i, j10), "_slices"), "_metadata"), str2);
    }

    public final File s(String str, int i, long j10, String str2) {
        return new File(new File(new File(f(str, i, j10), "_slices"), "_unverified"), str2);
    }

    public final File t(String str, int i, long j10, String str2) {
        return new File(new File(new File(f(str, i, j10), "_slices"), "_verified"), str2);
    }

    public final String u(String str) throws IOException {
        int length;
        File file = new File(g(), str);
        if (!file.exists()) {
            f7781c.a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f7783b.a()));
        if (!file2.exists()) {
            f7781c.a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f7783b.a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f7781c.a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f7783b.a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f7781c.c("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f7783b.a()));
            return null;
        }
    }

    public final Map v() {
        HashMap hashMap = new HashMap();
        Iterator it = ((ArrayList) h()).iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int d10 = (int) d(e(name), true);
            long d11 = d(m(name, d10), true);
            if (n(name, d10, d11).exists()) {
                hashMap.put(name, Long.valueOf(d11));
            }
        }
        return hashMap;
    }
}
