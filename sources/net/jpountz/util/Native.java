package net.jpountz.util;

import a.a;
import androidx.activity.result.d;
import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintStream;

public enum Native {
    ;
    
    private static boolean loaded = false;

    public enum OS {
        WINDOWS("win32", "so"),
        LINUX("linux", "so"),
        MAC("darwin", "dylib"),
        SOLARIS("solaris", "so");
        
        public final String libExtension;
        public final String name;

        private OS(String str, String str2) {
            this.name = str;
            this.libExtension = str2;
        }
    }

    private static String arch() {
        return System.getProperty("os.arch");
    }

    private static void cleanupOldTempLibs() {
        File[] listFiles = new File(new File(System.getProperty("java.io.tmpdir")).getAbsolutePath()).listFiles(new FilenameFilter() {
            private final String searchPattern;

            {
                this.searchPattern = "liblz4-java-";
            }

            public boolean accept(File file, String str) {
                return str.startsWith("liblz4-java-") && !str.endsWith(".lck");
            }
        });
        if (listFiles != null) {
            for (File file : listFiles) {
                if (!new File(file.getAbsolutePath() + ".lck").exists()) {
                    try {
                        file.delete();
                    } catch (SecurityException e10) {
                        PrintStream printStream = System.err;
                        StringBuilder d10 = a.d("Failed to delete old temp lib");
                        d10.append(e10.getMessage());
                        printStream.println(d10.toString());
                    }
                }
            }
        }
    }

    public static synchronized boolean isLoaded() {
        boolean z;
        synchronized (Native.class) {
            z = loaded;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = resourceName();
        r3 = r0.getResourceAsStream(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x001e, code lost:
        if (r3 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = java.io.File.createTempFile("liblz4-java-", "." + os().libExtension + ".lck");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5 = new java.io.File(r4.getAbsolutePath().replaceFirst(".lck$", com.github.mikephil.charting.BuildConfig.FLAVOR));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r2 = new java.io.FileOutputStream(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6 = new byte[net.jpountz.lz4.LZ4Constants.HASH_TABLE_SIZE];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005d, code lost:
        r7 = r3.read(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        if (r7 == -1) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r2.close();
        java.lang.System.load(r5.getAbsolutePath());
        loaded = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        r5.deleteOnExit();
        r4.deleteOnExit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0077, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        r2.write(r6, 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x007f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0084, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0088, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0089, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008a, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x008c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x008d, code lost:
        r2 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008f, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0091, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0092, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0094, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0095, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00ac, code lost:
        throw new java.lang.ExceptionInInitializerError("Cannot unpack liblz4-java: " + r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ad, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00b0, code lost:
        if (loaded == false) goto L_0x00b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00be, code lost:
        if (r2.delete() != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00d7, code lost:
        throw new java.lang.ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary native library " + r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00fc, code lost:
        throw new java.lang.ExceptionInInitializerError("Cannot unpack liblz4-java / cannot delete a temporary lock file " + r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00fd, code lost:
        r2.deleteOnExit();
        r4.deleteOnExit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0103, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x011f, code lost:
        throw new java.lang.UnsupportedOperationException("Unsupported OS/arch, cannot find " + r2 + ". Please try building from source.");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0016 */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00b2 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00fd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void load() {
        /*
            java.lang.Class<net.jpountz.util.Native> r0 = net.jpountz.util.Native.class
            monitor-enter(r0)
            boolean r1 = loaded     // Catch:{ all -> 0x0120 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            cleanupOldTempLibs()     // Catch:{ all -> 0x0120 }
            r1 = 1
            java.lang.String r2 = "lz4-java"
            java.lang.System.loadLibrary(r2)     // Catch:{ UnsatisfiedLinkError -> 0x0016 }
            loaded = r1     // Catch:{ UnsatisfiedLinkError -> 0x0016 }
            monitor-exit(r0)
            return
        L_0x0016:
            java.lang.String r2 = resourceName()     // Catch:{ all -> 0x0120 }
            java.io.InputStream r3 = r0.getResourceAsStream(r2)     // Catch:{ all -> 0x0120 }
            if (r3 == 0) goto L_0x0104
            r2 = 0
            java.lang.String r4 = "liblz4-java-"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r5.<init>()     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.lang.String r6 = "."
            r5.append(r6)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            net.jpountz.util.Native$OS r6 = os()     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.lang.String r6 = r6.libExtension     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            r5.append(r6)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.lang.String r6 = ".lck"
            r5.append(r6)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.io.File r4 = java.io.File.createTempFile(r4, r5)     // Catch:{ IOException -> 0x0094, all -> 0x0091 }
            java.io.File r5 = new java.io.File     // Catch:{ IOException -> 0x008f }
            java.lang.String r6 = r4.getAbsolutePath()     // Catch:{ IOException -> 0x008f }
            java.lang.String r7 = ".lck$"
            java.lang.String r8 = ""
            java.lang.String r6 = r6.replaceFirst(r7, r8)     // Catch:{ IOException -> 0x008f }
            r5.<init>(r6)     // Catch:{ IOException -> 0x008f }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r6 = 4096(0x1000, float:5.74E-42)
            byte[] r6 = new byte[r6]     // Catch:{ all -> 0x007d }
        L_0x005d:
            int r7 = r3.read(r6)     // Catch:{ all -> 0x007d }
            r8 = -1
            if (r7 != r8) goto L_0x0078
            r2.close()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.String r2 = r5.getAbsolutePath()     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            java.lang.System.load(r2)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            loaded = r1     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
            r5.deleteOnExit()     // Catch:{ all -> 0x0120 }
            r4.deleteOnExit()     // Catch:{ all -> 0x0120 }
            monitor-exit(r0)
            return
        L_0x0078:
            r8 = 0
            r2.write(r6, r8, r7)     // Catch:{ all -> 0x007d }
            goto L_0x005d
        L_0x007d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007f }
        L_0x007f:
            r3 = move-exception
            r2.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0088
        L_0x0084:
            r2 = move-exception
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
        L_0x0088:
            throw r3     // Catch:{ IOException -> 0x008c, all -> 0x0089 }
        L_0x0089:
            r1 = move-exception
            r2 = r5
            goto L_0x00ae
        L_0x008c:
            r1 = move-exception
            r2 = r5
            goto L_0x0096
        L_0x008f:
            r1 = move-exception
            goto L_0x0096
        L_0x0091:
            r1 = move-exception
            r4 = r2
            goto L_0x00ae
        L_0x0094:
            r1 = move-exception
            r4 = r2
        L_0x0096:
            java.lang.ExceptionInInitializerError r3 = new java.lang.ExceptionInInitializerError     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ad }
            r5.<init>()     // Catch:{ all -> 0x00ad }
            java.lang.String r6 = "Cannot unpack liblz4-java: "
            r5.append(r6)     // Catch:{ all -> 0x00ad }
            r5.append(r1)     // Catch:{ all -> 0x00ad }
            java.lang.String r1 = r5.toString()     // Catch:{ all -> 0x00ad }
            r3.<init>(r1)     // Catch:{ all -> 0x00ad }
            throw r3     // Catch:{ all -> 0x00ad }
        L_0x00ad:
            r1 = move-exception
        L_0x00ae:
            boolean r3 = loaded     // Catch:{ all -> 0x0120 }
            if (r3 != 0) goto L_0x00fd
            if (r2 == 0) goto L_0x00d8
            boolean r3 = r2.exists()     // Catch:{ all -> 0x0120 }
            if (r3 == 0) goto L_0x00d8
            boolean r3 = r2.delete()     // Catch:{ all -> 0x0120 }
            if (r3 == 0) goto L_0x00c1
            goto L_0x00d8
        L_0x00c1:
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r3.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = "Cannot unpack liblz4-java / cannot delete a temporary native library "
            r3.append(r4)     // Catch:{ all -> 0x0120 }
            r3.append(r2)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0120 }
            r1.<init>(r2)     // Catch:{ all -> 0x0120 }
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x00d8:
            if (r4 == 0) goto L_0x0103
            boolean r2 = r4.exists()     // Catch:{ all -> 0x0120 }
            if (r2 == 0) goto L_0x0103
            boolean r2 = r4.delete()     // Catch:{ all -> 0x0120 }
            if (r2 != 0) goto L_0x0103
            java.lang.ExceptionInInitializerError r1 = new java.lang.ExceptionInInitializerError     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r2.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r3 = "Cannot unpack liblz4-java / cannot delete a temporary lock file "
            r2.append(r3)     // Catch:{ all -> 0x0120 }
            r2.append(r4)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0120 }
            r1.<init>(r2)     // Catch:{ all -> 0x0120 }
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x00fd:
            r2.deleteOnExit()     // Catch:{ all -> 0x0120 }
            r4.deleteOnExit()     // Catch:{ all -> 0x0120 }
        L_0x0103:
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x0104:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ all -> 0x0120 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0120 }
            r3.<init>()     // Catch:{ all -> 0x0120 }
            java.lang.String r4 = "Unsupported OS/arch, cannot find "
            r3.append(r4)     // Catch:{ all -> 0x0120 }
            r3.append(r2)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = ". Please try building from source."
            r3.append(r2)     // Catch:{ all -> 0x0120 }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x0120 }
            r1.<init>(r2)     // Catch:{ all -> 0x0120 }
            throw r1     // Catch:{ all -> 0x0120 }
        L_0x0120:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.util.Native.load():void");
    }

    private static OS os() {
        String property = System.getProperty("os.name");
        if (property.contains("Linux")) {
            return OS.LINUX;
        }
        if (property.contains("Mac")) {
            return OS.MAC;
        }
        if (property.contains("Windows")) {
            return OS.WINDOWS;
        }
        if (property.contains("Solaris") || property.contains("SunOS")) {
            return OS.SOLARIS;
        }
        throw new UnsupportedOperationException(a8.a.c("Unsupported operating system: ", property));
    }

    private static String resourceName() {
        OS os = os();
        StringBuilder d10 = d.d("/", Native.class.getPackage().getName().replace('.', '/'), "/");
        d10.append(os.name);
        d10.append("/");
        d10.append(arch());
        d10.append("/liblz4-java.");
        d10.append(os.libExtension);
        return d10.toString();
    }
}
