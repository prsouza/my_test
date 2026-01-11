package e3;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class a implements Closeable {
    public long A = 0;
    public final ThreadPoolExecutor B = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());
    public final Callable<Void> C = new C0069a();

    /* renamed from: a  reason: collision with root package name */
    public final File f4587a;

    /* renamed from: b  reason: collision with root package name */
    public final File f4588b;

    /* renamed from: c  reason: collision with root package name */
    public final File f4589c;

    /* renamed from: s  reason: collision with root package name */
    public final File f4590s;

    /* renamed from: t  reason: collision with root package name */
    public final int f4591t;

    /* renamed from: u  reason: collision with root package name */
    public long f4592u;

    /* renamed from: v  reason: collision with root package name */
    public final int f4593v;

    /* renamed from: w  reason: collision with root package name */
    public long f4594w = 0;

    /* renamed from: x  reason: collision with root package name */
    public BufferedWriter f4595x;

    /* renamed from: y  reason: collision with root package name */
    public final LinkedHashMap<String, d> f4596y = new LinkedHashMap<>(0, 0.75f, true);
    public int z;

    /* renamed from: e3.a$a  reason: collision with other inner class name */
    public class C0069a implements Callable<Void> {
        public C0069a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return null;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object call() throws java.lang.Exception {
            /*
                r3 = this;
                e3.a r0 = e3.a.this
                monitor-enter(r0)
                e3.a r1 = e3.a.this     // Catch:{ all -> 0x0023 }
                java.io.BufferedWriter r2 = r1.f4595x     // Catch:{ all -> 0x0023 }
                if (r2 != 0) goto L_0x000b
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                goto L_0x0021
            L_0x000b:
                r1.a0()     // Catch:{ all -> 0x0023 }
                e3.a r1 = e3.a.this     // Catch:{ all -> 0x0023 }
                boolean r1 = r1.y()     // Catch:{ all -> 0x0023 }
                if (r1 == 0) goto L_0x0020
                e3.a r1 = e3.a.this     // Catch:{ all -> 0x0023 }
                r1.S()     // Catch:{ all -> 0x0023 }
                e3.a r1 = e3.a.this     // Catch:{ all -> 0x0023 }
                r2 = 0
                r1.z = r2     // Catch:{ all -> 0x0023 }
            L_0x0020:
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            L_0x0021:
                r0 = 0
                return r0
            L_0x0023:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0023 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: e3.a.C0069a.call():java.lang.Object");
        }
    }

    public static final class b implements ThreadFactory {
        public final synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f4598a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f4599b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f4600c;

        public c(d dVar) {
            boolean[] zArr;
            this.f4598a = dVar;
            if (dVar.f4606e) {
                zArr = null;
            } else {
                zArr = new boolean[a.this.f4593v];
            }
            this.f4599b = zArr;
        }

        public final void a() throws IOException {
            a.a(a.this, this, false);
        }

        public final File b() throws IOException {
            File file;
            synchronized (a.this) {
                d dVar = this.f4598a;
                if (dVar.f4607f == this) {
                    if (!dVar.f4606e) {
                        this.f4599b[0] = true;
                    }
                    file = dVar.f4605d[0];
                    a.this.f4587a.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return file;
        }
    }

    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f4602a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f4603b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f4604c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f4605d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f4606e;

        /* renamed from: f  reason: collision with root package name */
        public c f4607f;
        public long g;

        public d(String str) {
            this.f4602a = str;
            int i = a.this.f4593v;
            this.f4603b = new long[i];
            this.f4604c = new File[i];
            this.f4605d = new File[i];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f4593v; i10++) {
                sb2.append(i10);
                this.f4604c[i10] = new File(a.this.f4587a, sb2.toString());
                sb2.append(".tmp");
                this.f4605d[i10] = new File(a.this.f4587a, sb2.toString());
                sb2.setLength(length);
            }
        }

        public final String a() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long append : this.f4603b) {
                sb2.append(' ');
                sb2.append(append);
            }
            return sb2.toString();
        }

        public final IOException b(String[] strArr) throws IOException {
            StringBuilder d10 = a.a.d("unexpected journal line: ");
            d10.append(Arrays.toString(strArr));
            throw new IOException(d10.toString());
        }
    }

    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final File[] f4609a;

        public e(File[] fileArr) {
            this.f4609a = fileArr;
        }
    }

    public a(File file, long j10) {
        File file2 = file;
        this.f4587a = file2;
        this.f4591t = 1;
        this.f4588b = new File(file2, "journal");
        this.f4589c = new File(file2, "journal.tmp");
        this.f4590s = new File(file2, "journal.bkp");
        this.f4593v = 1;
        this.f4592u = j10;
    }

    public static a B(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    T(file2, file3, false);
                }
            }
            a aVar = new a(file, j10);
            if (aVar.f4588b.exists()) {
                try {
                    aVar.O();
                    aVar.E();
                    return aVar;
                } catch (IOException e10) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    aVar.close();
                    c.a(aVar.f4587a);
                }
            }
            file.mkdirs();
            a aVar2 = new a(file, j10);
            aVar2.S();
            return aVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void T(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            f(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(e3.a r9, e3.a.c r10, boolean r11) throws java.io.IOException {
        /*
            monitor-enter(r9)
            e3.a$d r0 = r10.f4598a     // Catch:{ all -> 0x00f8 }
            e3.a$c r1 = r0.f4607f     // Catch:{ all -> 0x00f8 }
            if (r1 != r10) goto L_0x00f2
            r1 = 0
            if (r11 == 0) goto L_0x0046
            boolean r2 = r0.f4606e     // Catch:{ all -> 0x00f8 }
            if (r2 != 0) goto L_0x0046
            r2 = r1
        L_0x000f:
            int r3 = r9.f4593v     // Catch:{ all -> 0x00f8 }
            if (r2 >= r3) goto L_0x0046
            boolean[] r3 = r10.f4599b     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3[r2]     // Catch:{ all -> 0x00f8 }
            if (r3 == 0) goto L_0x002c
            java.io.File[] r3 = r0.f4605d     // Catch:{ all -> 0x00f8 }
            r3 = r3[r2]     // Catch:{ all -> 0x00f8 }
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00f8 }
            if (r3 != 0) goto L_0x0029
            r10.a()     // Catch:{ all -> 0x00f8 }
            monitor-exit(r9)
            goto L_0x00f1
        L_0x0029:
            int r2 = r2 + 1
            goto L_0x000f
        L_0x002c:
            r10.a()     // Catch:{ all -> 0x00f8 }
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            r11.<init>()     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = "Newly created entry didn't create value for index "
            r11.append(r0)     // Catch:{ all -> 0x00f8 }
            r11.append(r2)     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x00f8 }
            r10.<init>(r11)     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x0046:
            int r10 = r9.f4593v     // Catch:{ all -> 0x00f8 }
            if (r1 >= r10) goto L_0x0076
            java.io.File[] r10 = r0.f4605d     // Catch:{ all -> 0x00f8 }
            r10 = r10[r1]     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x0070
            boolean r2 = r10.exists()     // Catch:{ all -> 0x00f8 }
            if (r2 == 0) goto L_0x0073
            java.io.File[] r2 = r0.f4604c     // Catch:{ all -> 0x00f8 }
            r2 = r2[r1]     // Catch:{ all -> 0x00f8 }
            r10.renameTo(r2)     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.f4603b     // Catch:{ all -> 0x00f8 }
            r3 = r10[r1]     // Catch:{ all -> 0x00f8 }
            long r5 = r2.length()     // Catch:{ all -> 0x00f8 }
            long[] r10 = r0.f4603b     // Catch:{ all -> 0x00f8 }
            r10[r1] = r5     // Catch:{ all -> 0x00f8 }
            long r7 = r9.f4594w     // Catch:{ all -> 0x00f8 }
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.f4594w = r7     // Catch:{ all -> 0x00f8 }
            goto L_0x0073
        L_0x0070:
            f(r10)     // Catch:{ all -> 0x00f8 }
        L_0x0073:
            int r1 = r1 + 1
            goto L_0x0046
        L_0x0076:
            int r10 = r9.z     // Catch:{ all -> 0x00f8 }
            r1 = 1
            int r10 = r10 + r1
            r9.z = r10     // Catch:{ all -> 0x00f8 }
            r10 = 0
            r0.f4607f = r10     // Catch:{ all -> 0x00f8 }
            boolean r10 = r0.f4606e     // Catch:{ all -> 0x00f8 }
            r10 = r10 | r11
            r2 = 10
            r3 = 32
            if (r10 == 0) goto L_0x00b7
            r0.f4606e = r1     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = "CLEAN"
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            r10.append(r3)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r0.f4602a     // Catch:{ all -> 0x00f8 }
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r0.a()     // Catch:{ all -> 0x00f8 }
            r10.append(r1)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            r10.append(r2)     // Catch:{ all -> 0x00f8 }
            if (r11 == 0) goto L_0x00d6
            long r10 = r9.A     // Catch:{ all -> 0x00f8 }
            r1 = 1
            long r1 = r1 + r10
            r9.A = r1     // Catch:{ all -> 0x00f8 }
            r0.g = r10     // Catch:{ all -> 0x00f8 }
            goto L_0x00d6
        L_0x00b7:
            java.util.LinkedHashMap<java.lang.String, e3.a$d> r10 = r9.f4596y     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.f4602a     // Catch:{ all -> 0x00f8 }
            r10.remove(r11)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = "REMOVE"
            r10.append(r11)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            r10.append(r3)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            java.lang.String r11 = r0.f4602a     // Catch:{ all -> 0x00f8 }
            r10.append(r11)     // Catch:{ all -> 0x00f8 }
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            r10.append(r2)     // Catch:{ all -> 0x00f8 }
        L_0x00d6:
            java.io.BufferedWriter r10 = r9.f4595x     // Catch:{ all -> 0x00f8 }
            t(r10)     // Catch:{ all -> 0x00f8 }
            long r10 = r9.f4594w     // Catch:{ all -> 0x00f8 }
            long r0 = r9.f4592u     // Catch:{ all -> 0x00f8 }
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x00e9
            boolean r10 = r9.y()     // Catch:{ all -> 0x00f8 }
            if (r10 == 0) goto L_0x00f0
        L_0x00e9:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.B     // Catch:{ all -> 0x00f8 }
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.C     // Catch:{ all -> 0x00f8 }
            r10.submit(r11)     // Catch:{ all -> 0x00f8 }
        L_0x00f0:
            monitor-exit(r9)
        L_0x00f1:
            return
        L_0x00f2:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f8 }
            r10.<init>()     // Catch:{ all -> 0x00f8 }
            throw r10     // Catch:{ all -> 0x00f8 }
        L_0x00f8:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.a(e3.a, e3.a$c, boolean):void");
    }

    public static void e(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void f(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void t(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void E() throws IOException {
        f(this.f4589c);
        Iterator<d> it = this.f4596y.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i = 0;
            if (next.f4607f == null) {
                while (i < this.f4593v) {
                    this.f4594w += next.f4603b[i];
                    i++;
                }
            } else {
                next.f4607f = null;
                while (i < this.f4593v) {
                    f(next.f4604c[i]);
                    f(next.f4605d[i]);
                    i++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:16|17|(1:19)|(1:21)(1:22)|23|24|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r9.z = r2 - r9.f4596y.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1.f4614t == -1) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        if (r0 != false) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0072, code lost:
        S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0076, code lost:
        r9.f4595x = new java.io.BufferedWriter(new java.io.OutputStreamWriter(new java.io.FileOutputStream(r9.f4588b, true), e3.c.f4616a));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0090, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0060 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0060=Splitter:B:16:0x0060, B:29:0x0093=Splitter:B:29:0x0093} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void O() throws java.io.IOException {
        /*
            r9 = this;
            java.lang.String r0 = ", "
            e3.b r1 = new e3.b
            java.io.FileInputStream r2 = new java.io.FileInputStream
            java.io.File r3 = r9.f4588b
            r2.<init>(r3)
            java.nio.charset.Charset r3 = e3.c.f4616a
            r1.<init>(r2, r3)
            java.lang.String r2 = r1.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r3 = r1.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = r1.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r5 = r1.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r6 = r1.c()     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = "libcore.io.DiskLruCache"
            boolean r7 = r7.equals(r2)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            java.lang.String r7 = "1"
            boolean r7 = r7.equals(r3)     // Catch:{ all -> 0x0091 }
            if (r7 == 0) goto L_0x0093
            int r7 = r9.f4591t     // Catch:{ all -> 0x0091 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x0091 }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            int r4 = r9.f4593v     // Catch:{ all -> 0x0091 }
            java.lang.String r4 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x0091 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            java.lang.String r4 = ""
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0091 }
            if (r4 == 0) goto L_0x0093
            r0 = 0
            r2 = r0
        L_0x0056:
            java.lang.String r3 = r1.c()     // Catch:{ EOFException -> 0x0060 }
            r9.R(r3)     // Catch:{ EOFException -> 0x0060 }
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0060:
            java.util.LinkedHashMap<java.lang.String, e3.a$d> r3 = r9.f4596y     // Catch:{ all -> 0x0091 }
            int r3 = r3.size()     // Catch:{ all -> 0x0091 }
            int r2 = r2 - r3
            r9.z = r2     // Catch:{ all -> 0x0091 }
            int r2 = r1.f4614t     // Catch:{ all -> 0x0091 }
            r3 = -1
            r4 = 1
            if (r2 != r3) goto L_0x0070
            r0 = r4
        L_0x0070:
            if (r0 == 0) goto L_0x0076
            r9.S()     // Catch:{ all -> 0x0091 }
            goto L_0x008b
        L_0x0076:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch:{ all -> 0x0091 }
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0091 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0091 }
            java.io.File r5 = r9.f4588b     // Catch:{ all -> 0x0091 }
            r3.<init>(r5, r4)     // Catch:{ all -> 0x0091 }
            java.nio.charset.Charset r4 = e3.c.f4616a     // Catch:{ all -> 0x0091 }
            r2.<init>(r3, r4)     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            r9.f4595x = r0     // Catch:{ all -> 0x0091 }
        L_0x008b:
            r1.close()     // Catch:{ RuntimeException -> 0x008f, Exception -> 0x008e }
        L_0x008e:
            return
        L_0x008f:
            r0 = move-exception
            throw r0
        L_0x0091:
            r0 = move-exception
            goto L_0x00c1
        L_0x0093:
            java.io.IOException r4 = new java.io.IOException     // Catch:{ all -> 0x0091 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r7.<init>()     // Catch:{ all -> 0x0091 }
            java.lang.String r8 = "unexpected journal header: ["
            r7.append(r8)     // Catch:{ all -> 0x0091 }
            r7.append(r2)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r3)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r5)     // Catch:{ all -> 0x0091 }
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            r7.append(r6)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = "]"
            r7.append(r0)     // Catch:{ all -> 0x0091 }
            java.lang.String r0 = r7.toString()     // Catch:{ all -> 0x0091 }
            r4.<init>(r0)     // Catch:{ all -> 0x0091 }
            throw r4     // Catch:{ all -> 0x0091 }
        L_0x00c1:
            r1.close()     // Catch:{ RuntimeException -> 0x00c5, Exception -> 0x00c4 }
        L_0x00c4:
            throw r0
        L_0x00c5:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e3.a.O():void");
    }

    public final void R(String str) throws IOException {
        String str2;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                str2 = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f4596y.remove(str2);
                    return;
                }
            } else {
                str2 = str.substring(i, indexOf2);
            }
            d dVar = this.f4596y.get(str2);
            if (dVar == null) {
                dVar = new d(str2);
                this.f4596y.put(str2, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f4606e = true;
                dVar.f4607f = null;
                if (split.length == a.this.f4593v) {
                    int i10 = 0;
                    while (i10 < split.length) {
                        try {
                            dVar.f4603b[i10] = Long.parseLong(split[i10]);
                            i10++;
                        } catch (NumberFormatException unused) {
                            dVar.b(split);
                            throw null;
                        }
                    }
                    return;
                }
                dVar.b(split);
                throw null;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f4607f = new c(dVar);
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException(a8.a.c("unexpected journal line: ", str));
            }
        } else {
            throw new IOException(a8.a.c("unexpected journal line: ", str));
        }
    }

    /* JADX INFO: finally extract failed */
    public final synchronized void S() throws IOException {
        BufferedWriter bufferedWriter = this.f4595x;
        if (bufferedWriter != null) {
            e(bufferedWriter);
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4589c), c.f4616a));
        try {
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f4591t));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f4593v));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (d next : this.f4596y.values()) {
                if (next.f4607f != null) {
                    bufferedWriter2.write("DIRTY " + next.f4602a + 10);
                } else {
                    bufferedWriter2.write("CLEAN " + next.f4602a + next.a() + 10);
                }
            }
            e(bufferedWriter2);
            if (this.f4588b.exists()) {
                T(this.f4588b, this.f4590s, true);
            }
            T(this.f4589c, this.f4588b, false);
            this.f4590s.delete();
            this.f4595x = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f4588b, true), c.f4616a));
        } catch (Throwable th2) {
            e(bufferedWriter2);
            throw th2;
        }
    }

    public final void a0() throws IOException {
        while (this.f4594w > this.f4592u) {
            String str = (String) this.f4596y.entrySet().iterator().next().getKey();
            synchronized (this) {
                c();
                d dVar = this.f4596y.get(str);
                if (dVar != null) {
                    if (dVar.f4607f == null) {
                        for (int i = 0; i < this.f4593v; i++) {
                            File file = dVar.f4604c[i];
                            if (file.exists()) {
                                if (!file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                            }
                            long j10 = this.f4594w;
                            long[] jArr = dVar.f4603b;
                            this.f4594w = j10 - jArr[i];
                            jArr[i] = 0;
                        }
                        this.z++;
                        this.f4595x.append("REMOVE");
                        this.f4595x.append(' ');
                        this.f4595x.append(str);
                        this.f4595x.append(10);
                        this.f4596y.remove(str);
                        if (y()) {
                            this.B.submit(this.C);
                        }
                    }
                }
            }
        }
    }

    public final void c() {
        if (this.f4595x == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void close() throws IOException {
        if (this.f4595x != null) {
            Iterator it = new ArrayList(this.f4596y.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f4607f;
                if (cVar != null) {
                    cVar.a();
                }
            }
            a0();
            e(this.f4595x);
            this.f4595x = null;
        }
    }

    public final c s(String str) throws IOException {
        c cVar;
        synchronized (this) {
            c();
            d dVar = this.f4596y.get(str);
            cVar = null;
            if (dVar == null) {
                dVar = new d(str);
                this.f4596y.put(str, dVar);
            } else if (dVar.f4607f != null) {
            }
            cVar = new c(dVar);
            dVar.f4607f = cVar;
            this.f4595x.append("DIRTY");
            this.f4595x.append(' ');
            this.f4595x.append(str);
            this.f4595x.append(10);
            t(this.f4595x);
        }
        return cVar;
    }

    public final synchronized e w(String str) throws IOException {
        c();
        d dVar = this.f4596y.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f4606e) {
            return null;
        }
        for (File exists : dVar.f4604c) {
            if (!exists.exists()) {
                return null;
            }
        }
        this.z++;
        this.f4595x.append("READ");
        this.f4595x.append(' ');
        this.f4595x.append(str);
        this.f4595x.append(10);
        if (y()) {
            this.B.submit(this.C);
        }
        return new e(dVar.f4604c);
    }

    public final boolean y() {
        int i = this.z;
        return i >= 2000 && i >= this.f4596y.size();
    }
}
