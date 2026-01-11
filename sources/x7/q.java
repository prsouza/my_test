package x7;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import c8.f;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e8.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Objects;
import java.util.SortedSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import u7.d;
import x7.e;
import y7.c;
import y7.k;
import z7.a0;
import z7.b;
import z7.g;
import z7.h;
import z7.j;
import z7.u;
import z7.w;
import z7.x;
import z7.y;
import z7.z;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12959a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f12960b;

    /* renamed from: c  reason: collision with root package name */
    public final z f12961c;

    /* renamed from: d  reason: collision with root package name */
    public final k f12962d;

    /* renamed from: e  reason: collision with root package name */
    public final f f12963e;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f12964f;
    public final f g;

    /* renamed from: h  reason: collision with root package name */
    public final a f12965h;
    public final c i;

    /* renamed from: j  reason: collision with root package name */
    public final u7.a f12966j;

    /* renamed from: k  reason: collision with root package name */
    public final v7.a f12967k;

    /* renamed from: l  reason: collision with root package name */
    public final l0 f12968l;

    /* renamed from: m  reason: collision with root package name */
    public c0 f12969m;

    /* renamed from: n  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f12970n = new TaskCompletionSource<>();

    /* renamed from: o  reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f12971o = new TaskCompletionSource<>();

    /* renamed from: p  reason: collision with root package name */
    public final TaskCompletionSource<Void> f12972p = new TaskCompletionSource<>();

    public class a implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Task f12973a;

        public a(Task task) {
            this.f12973a = task;
        }

        public final Task then(Object obj) throws Exception {
            return q.this.f12963e.c(new p(this, (Boolean) obj));
        }
    }

    public q(Context context, f fVar, i0 i0Var, d0 d0Var, f fVar2, z zVar, a aVar, k kVar, c cVar, l0 l0Var, u7.a aVar2, v7.a aVar3) {
        new AtomicBoolean(false);
        this.f12959a = context;
        this.f12963e = fVar;
        this.f12964f = i0Var;
        this.f12960b = d0Var;
        this.g = fVar2;
        this.f12961c = zVar;
        this.f12965h = aVar;
        this.f12962d = kVar;
        this.i = cVar;
        this.f12966j = aVar2;
        this.f12967k = aVar3;
        this.f12968l = l0Var;
    }

    /* JADX WARNING: type inference failed for: r6v13, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Integer>] */
    public static void a(q qVar, String str) {
        OutputStreamWriter outputStreamWriter;
        Throwable th2;
        Integer num;
        q qVar2 = qVar;
        String str2 = str;
        Objects.requireNonNull(qVar);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String c10 = a8.a.c("Opening a new session with ID ", str2);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", c10, (Throwable) null);
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", new Object[]{"18.2.10"});
        i0 i0Var = qVar2.f12964f;
        a aVar = qVar2.f12965h;
        String str3 = i0Var.f12928c;
        String str4 = aVar.f12884e;
        x xVar = new x(str3, str4, aVar.f12885f, i0Var.c(), e0.determineFrom(aVar.f12882c).getId(), aVar.g);
        Context context = qVar2.f12959a;
        String str5 = Build.VERSION.RELEASE;
        String str6 = Build.VERSION.CODENAME;
        z zVar = new z(e.k(context));
        Context context2 = qVar2.f12959a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        String str7 = str5;
        String str8 = str6;
        long blockCount = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        int ordinal = e.a.getValue().ordinal();
        String str9 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long h10 = e.h();
        boolean j10 = e.j(context2);
        int d10 = e.d(context2);
        String str10 = Build.MANUFACTURER;
        String str11 = Build.PRODUCT;
        y yVar = new y(ordinal, availableProcessors, h10, blockCount, j10, d10);
        String str12 = str11;
        String str13 = "FirebaseCrashlytics";
        String str14 = str12;
        qVar2.f12966j.d(str, format, currentTimeMillis, new w(xVar, zVar, yVar));
        qVar2.i.a(str2);
        l0 l0Var = qVar2.f12968l;
        a0 a0Var = l0Var.f12938a;
        Objects.requireNonNull(a0Var);
        Charset charset = a0.f13991a;
        b.a aVar2 = new b.a();
        aVar2.f13998a = "18.2.10";
        String str15 = a0Var.f12890c.f12880a;
        Objects.requireNonNull(str15, "Null gmpAppId");
        aVar2.f13999b = str15;
        String c11 = a0Var.f12889b.c();
        Objects.requireNonNull(c11, "Null installationUuid");
        aVar2.f14001d = c11;
        String str16 = a0Var.f12890c.f12884e;
        Objects.requireNonNull(str16, "Null buildVersion");
        aVar2.f14002e = str16;
        String str17 = a0Var.f12890c.f12885f;
        Objects.requireNonNull(str17, "Null displayVersion");
        aVar2.f14003f = str17;
        aVar2.f14000c = 4;
        g.b bVar = new g.b();
        bVar.b(false);
        bVar.f14039c = Long.valueOf(currentTimeMillis);
        Objects.requireNonNull(str2, "Null identifier");
        bVar.f14038b = str2;
        String str18 = a0.f12887f;
        Objects.requireNonNull(str18, "Null generator");
        bVar.f14037a = str18;
        String str19 = a0Var.f12889b.f12928c;
        Objects.requireNonNull(str19, "Null identifier");
        String str20 = a0Var.f12890c.f12884e;
        Objects.requireNonNull(str20, "Null version");
        String str21 = a0Var.f12890c.f12885f;
        String c12 = a0Var.f12889b.c();
        d dVar = a0Var.f12890c.g;
        if (dVar.f11725b == null) {
            dVar.f11725b = new d.a(dVar);
        }
        String str22 = dVar.f11725b.f11726a;
        d dVar2 = a0Var.f12890c.g;
        if (dVar2.f11725b == null) {
            dVar2.f11725b = new d.a(dVar2);
        }
        bVar.f14042f = new h(str19, str20, str21, c12, str22, dVar2.f11725b.f11727b);
        u.a aVar3 = new u.a();
        aVar3.f14148a = 3;
        aVar3.f14149b = str7;
        aVar3.f14150c = str8;
        aVar3.f14151d = Boolean.valueOf(e.k(a0Var.f12888a));
        bVar.f14043h = aVar3.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        String str23 = Build.CPU_ABI;
        int i10 = 7;
        if (!TextUtils.isEmpty(str23) && (num = (Integer) a0.f12886e.get(str23.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long h11 = e.h();
        long blockCount2 = ((long) statFs2.getBlockCount()) * ((long) statFs2.getBlockSize());
        boolean j11 = e.j(a0Var.f12888a);
        int d11 = e.d(a0Var.f12888a);
        j.a aVar4 = new j.a();
        aVar4.f14059a = Integer.valueOf(i10);
        aVar4.f14060b = str9;
        aVar4.f14061c = Integer.valueOf(availableProcessors2);
        aVar4.f14062d = Long.valueOf(h11);
        aVar4.f14063e = Long.valueOf(blockCount2);
        aVar4.f14064f = Boolean.valueOf(j11);
        aVar4.g = Integer.valueOf(d11);
        aVar4.f14065h = str10;
        aVar4.i = str14;
        bVar.i = aVar4.a();
        bVar.f14045k = 3;
        aVar2.g = bVar.a();
        a0 a10 = aVar2.a();
        c8.e eVar = l0Var.f12939b;
        Objects.requireNonNull(eVar);
        a0.e eVar2 = ((b) a10).f13997h;
        if (eVar2 == null) {
            String str24 = str13;
            if (Log.isLoggable(str24, 3)) {
                Log.d(str24, "Could not get session for report", (Throwable) null);
                return;
            }
            return;
        }
        String str25 = str13;
        String g8 = eVar2.g();
        try {
            c8.e.f(eVar.f3266b.f(g8, "report"), c8.e.f3263f.h(a10));
            File f10 = eVar.f3266b.f(g8, "start-time");
            long i11 = eVar2.i();
            outputStreamWriter = new OutputStreamWriter(new FileOutputStream(f10), c8.e.f3261d);
            outputStreamWriter.write(BuildConfig.FLAVOR);
            f10.setLastModified(i11 * 1000);
            outputStreamWriter.close();
            return;
        } catch (IOException e10) {
            String c13 = a8.a.c("Could not persist report for session ", g8);
            if (Log.isLoggable(str25, 3)) {
                Log.d(str25, c13, e10);
                return;
            }
            return;
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
        throw th2;
    }

    public static Task b(q qVar) {
        Task task;
        Objects.requireNonNull(qVar);
        ArrayList arrayList = new ArrayList();
        for (File file : f.i(qVar.g.f3268a.listFiles(j.f12932a))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                boolean z = false;
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z = true;
                } catch (ClassNotFoundException unused) {
                }
                if (z) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", (Throwable) null);
                    task = Tasks.forResult(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", (Throwable) null);
                    }
                    task = Tasks.call(new ScheduledThreadPoolExecutor(1), new u(qVar, parseLong));
                }
                arrayList.add(task);
            } catch (NumberFormatException unused2) {
                StringBuilder d10 = a.a.d("Could not parse app exception timestamp from file ");
                d10.append(file.getName());
                Log.w("FirebaseCrashlytics", d10.toString(), (Throwable) null);
            }
            file.delete();
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x019c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x01de  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(boolean r23, e8.i r24) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            java.util.ArrayList r3 = new java.util.ArrayList
            x7.l0 r0 = r1.f12968l
            c8.e r0 = r0.f12939b
            java.util.SortedSet r0 = r0.c()
            r3.<init>(r0)
            int r0 = r3.size()
            r4 = 2
            r5 = 0
            java.lang.String r6 = "FirebaseCrashlytics"
            if (r0 > r2) goto L_0x0027
            boolean r0 = android.util.Log.isLoggable(r6, r4)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "No open sessions to be closed."
            android.util.Log.v(r6, r0, r5)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r0 = r3.get(r2)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            r0 = r24
            e8.f r0 = (e8.f) r0
            e8.c r0 = r0.b()
            e8.c$a r0 = r0.f4758b
            boolean r0 = r0.f4764b
            r8 = 0
            r9 = 1
            if (r0 == 0) goto L_0x020d
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 30
            if (r0 < r10) goto L_0x01fd
            android.content.Context r0 = r1.f12959a
            java.lang.String r10 = "activity"
            java.lang.Object r0 = r0.getSystemService(r10)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            java.util.List r0 = r0.getHistoricalProcessExitReasons(r5, r8, r8)
            int r10 = r0.size()
            if (r10 == 0) goto L_0x01ec
            y7.c r10 = new y7.c
            c8.f r11 = r1.g
            r10.<init>(r11, r7)
            c8.f r11 = r1.g
            x7.f r12 = r1.f12963e
            y7.e r13 = new y7.e
            r13.<init>(r11)
            y7.k r14 = new y7.k
            r14.<init>(r7, r11, r12)
            y7.k$a r11 = r14.f13528d
            java.util.concurrent.atomic.AtomicMarkableReference<y7.b> r11 = r11.f13531a
            java.lang.Object r11 = r11.getReference()
            y7.b r11 = (y7.b) r11
            java.util.Map r12 = r13.b(r7, r8)
            r11.c(r12)
            y7.k$a r11 = r14.f13529e
            java.util.concurrent.atomic.AtomicMarkableReference<y7.b> r11 = r11.f13531a
            java.lang.Object r11 = r11.getReference()
            y7.b r11 = (y7.b) r11
            java.util.Map r9 = r13.b(r7, r9)
            r11.c(r9)
            java.util.concurrent.atomic.AtomicMarkableReference<java.lang.String> r9 = r14.f13530f
            java.lang.String r11 = r13.c(r7)
            r9.set(r11, r8)
            x7.l0 r9 = r1.f12968l
            c8.e r11 = r9.f12939b
            c8.f r11 = r11.f3266b
            java.lang.String r12 = "start-time"
            java.io.File r11 = r11.f(r7, r12)
            long r11 = r11.lastModified()
            java.util.Iterator r0 = r0.iterator()
        L_0x00ac:
            boolean r13 = r0.hasNext()
            if (r13 == 0) goto L_0x00ca
            java.lang.Object r13 = r0.next()
            android.app.ApplicationExitInfo r13 = (android.app.ApplicationExitInfo) r13
            long r15 = r13.getTimestamp()
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x00c1
            goto L_0x00ca
        L_0x00c1:
            int r15 = r13.getReason()
            r8 = 6
            if (r15 == r8) goto L_0x00cb
            r8 = 0
            goto L_0x00ac
        L_0x00ca:
            r13 = r5
        L_0x00cb:
            if (r13 != 0) goto L_0x00de
            java.lang.String r0 = "No relevant ApplicationExitInfo occurred during session: "
            java.lang.String r0 = a8.a.c(r0, r7)
            boolean r4 = android.util.Log.isLoggable(r6, r4)
            if (r4 == 0) goto L_0x0218
            android.util.Log.v(r6, r0, r5)
            goto L_0x0218
        L_0x00de:
            x7.a0 r4 = r9.f12938a
            java.io.InputStream r0 = r13.getTraceInputStream()     // Catch:{ IOException -> 0x0106 }
            if (r0 == 0) goto L_0x0123
            java.io.ByteArrayOutputStream r8 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x0106 }
            r8.<init>()     // Catch:{ IOException -> 0x0106 }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch:{ IOException -> 0x0106 }
        L_0x00ef:
            int r12 = r0.read(r11)     // Catch:{ IOException -> 0x0106 }
            r15 = -1
            if (r12 == r15) goto L_0x00fb
            r15 = 0
            r8.write(r11, r15, r12)     // Catch:{ IOException -> 0x0106 }
            goto L_0x00ef
        L_0x00fb:
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = r0.name()     // Catch:{ IOException -> 0x0106 }
            java.lang.String r0 = r8.toString(r0)     // Catch:{ IOException -> 0x0106 }
            goto L_0x0124
        L_0x0106:
            r0 = move-exception
            java.lang.String r8 = "Could not get input trace in application exit info: "
            java.lang.StringBuilder r8 = a.a.d(r8)
            java.lang.String r11 = r13.toString()
            r8.append(r11)
            java.lang.String r11 = " Error: "
            r8.append(r11)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.w(r6, r0, r5)
        L_0x0123:
            r0 = r5
        L_0x0124:
            z7.c$a r8 = new z7.c$a
            r8.<init>()
            int r11 = r13.getImportance()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.f14016d = r11
            java.lang.String r11 = r13.getProcessName()
            java.lang.String r12 = "Null processName"
            java.util.Objects.requireNonNull(r11, r12)
            r8.f14014b = r11
            int r11 = r13.getReason()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.f14015c = r11
            long r11 = r13.getTimestamp()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r8.g = r11
            int r11 = r13.getPid()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r8.f14013a = r11
            long r11 = r13.getPss()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r8.f14017e = r11
            long r11 = r13.getRss()
            java.lang.Long r11 = java.lang.Long.valueOf(r11)
            r8.f14018f = r11
            r8.f14019h = r0
            z7.a0$a r18 = r8.a()
            android.content.Context r0 = r4.f12888a
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            z7.k$a r8 = new z7.k$a
            r8.<init>()
            java.lang.String r11 = "anr"
            r8.f14072b = r11
            r11 = r18
            z7.c r11 = (z7.c) r11
            long r12 = r11.g
            r8.b(r12)
            int r11 = r11.f14009d
            r12 = 100
            if (r11 == r12) goto L_0x019c
            r11 = 1
            goto L_0x019d
        L_0x019c:
            r11 = 0
        L_0x019d:
            z7.l$b r12 = new z7.l$b
            r12.<init>()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r12.f14084d = r11
            r12.b(r0)
            r17 = 0
            r16 = 0
            z7.a0$e$d$a$b$c r19 = r4.e()
            z7.b0 r20 = r4.a()
            z7.m r11 = new z7.m
            r21 = 0
            r15 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r12.f14081a = r11
            z7.a0$e$d$a r11 = r12.a()
            r8.f14073c = r11
            z7.a0$e$d$c r0 = r4.b(r0)
            r8.f14074d = r0
            z7.a0$e$d r0 = r8.a()
            java.lang.String r4 = "Persisting anr for session "
            java.lang.String r4 = a8.a.c(r4, r7)
            r8 = 3
            boolean r8 = android.util.Log.isLoggable(r6, r8)
            if (r8 == 0) goto L_0x01e1
            android.util.Log.d(r6, r4, r5)
        L_0x01e1:
            c8.e r4 = r9.f12939b
            z7.a0$e$d r0 = r9.a(r0, r10, r14)
            r8 = 1
            r4.d(r0, r7, r8)
            goto L_0x0218
        L_0x01ec:
            java.lang.String r0 = "No ApplicationExitInfo available. Session: "
            java.lang.String r0 = a8.a.c(r0, r7)
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r6, r4)
            if (r4 == 0) goto L_0x0218
            android.util.Log.v(r6, r0, r5)
            goto L_0x0218
        L_0x01fd:
            java.lang.String r8 = "ANR feature enabled, but device is API "
            java.lang.String r0 = b9.m.b(r8, r0)
            boolean r4 = android.util.Log.isLoggable(r6, r4)
            if (r4 == 0) goto L_0x0218
            android.util.Log.v(r6, r0, r5)
            goto L_0x0218
        L_0x020d:
            boolean r0 = android.util.Log.isLoggable(r6, r4)
            if (r0 == 0) goto L_0x0218
            java.lang.String r0 = "ANR feature disabled."
            android.util.Log.v(r6, r0, r5)
        L_0x0218:
            u7.a r0 = r1.f12966j
            boolean r0 = r0.c(r7)
            if (r0 == 0) goto L_0x024d
            java.lang.String r0 = "Finalizing native report for session "
            java.lang.String r0 = a8.a.c(r0, r7)
            r4 = 2
            boolean r4 = android.util.Log.isLoggable(r6, r4)
            if (r4 == 0) goto L_0x0230
            android.util.Log.v(r6, r0, r5)
        L_0x0230:
            u7.a r0 = r1.f12966j
            u7.e r0 = r0.a(r7)
            java.util.Objects.requireNonNull(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "No minidump data found for session "
            r0.append(r4)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0, r5)
        L_0x024d:
            if (r2 == 0) goto L_0x0257
            r2 = 0
            java.lang.Object r0 = r3.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0258
        L_0x0257:
            r0 = r5
        L_0x0258:
            x7.l0 r2 = r1.f12968l
            long r3 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r7
            c8.e r2 = r2.f12939b
            c8.f r7 = r2.f3266b
            java.util.Objects.requireNonNull(r7)
            r8 = 2
            java.io.File[] r8 = new java.io.File[r8]
            java.io.File r9 = new java.io.File
            java.io.File r10 = r7.f3268a
            java.lang.String r10 = r10.getParent()
            java.lang.String r11 = ".com.google.firebase.crashlytics"
            r9.<init>(r10, r11)
            r15 = 0
            r8[r15] = r9
            java.io.File r9 = new java.io.File
            java.io.File r7 = r7.f3268a
            java.lang.String r7 = r7.getParent()
            java.lang.String r10 = ".com.google.firebase.crashlytics-ndk"
            r9.<init>(r7, r10)
            r7 = 1
            r8[r7] = r9
            r7 = r15
        L_0x028c:
            r9 = 2
            if (r7 >= r9) goto L_0x02bb
            r9 = r8[r7]
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x02b8
            boolean r10 = c8.f.h(r9)
            if (r10 == 0) goto L_0x02b8
            java.lang.String r10 = "Deleted legacy Crashlytics files from "
            java.lang.StringBuilder r10 = a.a.d(r10)
            java.lang.String r9 = r9.getPath()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r6, r10)
            if (r10 == 0) goto L_0x02b8
            android.util.Log.d(r6, r9, r5)
        L_0x02b8:
            int r7 = r7 + 1
            goto L_0x028c
        L_0x02bb:
            java.util.SortedSet r7 = r2.c()
            if (r0 == 0) goto L_0x02c4
            r7.remove(r0)
        L_0x02c4:
            int r0 = r7.size()
            r8 = 8
            if (r0 > r8) goto L_0x02cd
            goto L_0x02fc
        L_0x02cd:
            int r0 = r7.size()
            if (r0 <= r8) goto L_0x02fc
            java.lang.Object r0 = r7.last()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r9 = "Removing session over cap: "
            java.lang.String r9 = a8.a.c(r9, r0)
            r10 = 3
            boolean r10 = android.util.Log.isLoggable(r6, r10)
            if (r10 == 0) goto L_0x02e9
            android.util.Log.d(r6, r9, r5)
        L_0x02e9:
            c8.f r9 = r2.f3266b
            java.util.Objects.requireNonNull(r9)
            java.io.File r10 = new java.io.File
            java.io.File r9 = r9.f3269b
            r10.<init>(r9, r0)
            c8.f.h(r10)
            r7.remove(r0)
            goto L_0x02cd
        L_0x02fc:
            java.util.Iterator r7 = r7.iterator()
            r8 = r15
        L_0x0301:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0490
            java.lang.Object r0 = r7.next()
            r9 = r0
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r0 = "Finalizing report for session "
            java.lang.String r0 = a8.a.c(r0, r9)
            r10 = 2
            boolean r10 = android.util.Log.isLoggable(r6, r10)
            if (r10 == 0) goto L_0x031e
            android.util.Log.v(r6, r0, r5)
        L_0x031e:
            c8.f r0 = r2.f3266b
            c8.a r10 = c8.e.f3264h
            java.io.File r0 = r0.e(r9)
            java.io.File[] r0 = r0.listFiles(r10)
            java.util.List r0 = c8.f.i(r0)
            boolean r10 = r0.isEmpty()
            if (r10 == 0) goto L_0x0348
            java.lang.String r0 = "Session "
            java.lang.String r8 = " has no events."
            java.lang.String r0 = androidx.fragment.app.o.c(r0, r9, r8)
            r8 = 2
            boolean r8 = android.util.Log.isLoggable(r6, r8)
            if (r8 == 0) goto L_0x047e
            android.util.Log.v(r6, r0, r5)
            goto L_0x047e
        L_0x0348:
            java.util.Collections.sort(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r11 = r0.iterator()
        L_0x0354:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x03c7
            java.lang.Object r0 = r11.next()
            r12 = r0
            java.io.File r12 = (java.io.File) r12
            a8.c r0 = c8.e.f3263f     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r13 = c8.e.e(r12)     // Catch:{ IOException -> 0x03b1 }
            java.util.Objects.requireNonNull(r0)     // Catch:{ IOException -> 0x03b1 }
            android.util.JsonReader r14 = new android.util.JsonReader     // Catch:{ IllegalStateException -> 0x03aa }
            java.io.StringReader r0 = new java.io.StringReader     // Catch:{ IllegalStateException -> 0x03aa }
            r0.<init>(r13)     // Catch:{ IllegalStateException -> 0x03aa }
            r14.<init>(r0)     // Catch:{ IllegalStateException -> 0x03aa }
            z7.a0$e$d r0 = a8.c.d(r14)     // Catch:{ all -> 0x039e }
            r14.close()     // Catch:{ IllegalStateException -> 0x03aa }
            r10.add(r0)     // Catch:{ IOException -> 0x03b1 }
            if (r8 != 0) goto L_0x039c
            java.lang.String r0 = r12.getName()     // Catch:{ IOException -> 0x03b1 }
            java.lang.String r13 = "event"
            boolean r13 = r0.startsWith(r13)     // Catch:{ IOException -> 0x03b1 }
            if (r13 == 0) goto L_0x0396
            java.lang.String r13 = "_"
            boolean r0 = r0.endsWith(r13)     // Catch:{ IOException -> 0x03b1 }
            if (r0 == 0) goto L_0x0396
            r0 = 1
            goto L_0x0397
        L_0x0396:
            r0 = 0
        L_0x0397:
            if (r0 == 0) goto L_0x039a
            goto L_0x039c
        L_0x039a:
            r8 = 0
            goto L_0x0354
        L_0x039c:
            r8 = 1
            goto L_0x0354
        L_0x039e:
            r0 = move-exception
            r13 = r0
            r14.close()     // Catch:{ all -> 0x03a4 }
            goto L_0x03a9
        L_0x03a4:
            r0 = move-exception
            r14 = r0
            r13.addSuppressed(r14)     // Catch:{ IllegalStateException -> 0x03aa }
        L_0x03a9:
            throw r13     // Catch:{ IllegalStateException -> 0x03aa }
        L_0x03aa:
            r0 = move-exception
            java.io.IOException r13 = new java.io.IOException     // Catch:{ IOException -> 0x03b1 }
            r13.<init>(r0)     // Catch:{ IOException -> 0x03b1 }
            throw r13     // Catch:{ IOException -> 0x03b1 }
        L_0x03b1:
            r0 = move-exception
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Could not add event to report for "
            r13.append(r14)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.util.Log.w(r6, r12, r0)
            goto L_0x0354
        L_0x03c7:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x03e3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r8 = "Could not parse event files for session "
            r0.append(r8)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            android.util.Log.w(r6, r0, r5)
            goto L_0x047e
        L_0x03e3:
            c8.f r0 = r2.f3266b
            y7.e r11 = new y7.e
            r11.<init>(r0)
            java.lang.String r0 = r11.c(r9)
            c8.f r11 = r2.f3266b
            java.lang.String r12 = "report"
            java.io.File r11 = r11.f(r9, r12)
            a8.c r12 = c8.e.f3263f     // Catch:{ IOException -> 0x0469 }
            java.lang.String r13 = c8.e.e(r11)     // Catch:{ IOException -> 0x0469 }
            z7.a0 r13 = r12.g(r13)     // Catch:{ IOException -> 0x0469 }
            z7.a0 r0 = r13.i(r3, r8, r0)     // Catch:{ IOException -> 0x0469 }
            z7.b0 r13 = new z7.b0     // Catch:{ IOException -> 0x0469 }
            r13.<init>(r10)     // Catch:{ IOException -> 0x0469 }
            r10 = r0
            z7.b r10 = (z7.b) r10     // Catch:{ IOException -> 0x0469 }
            z7.a0$e r10 = r10.f13997h     // Catch:{ IOException -> 0x0469 }
            if (r10 == 0) goto L_0x0461
            r10 = r0
            z7.b r10 = (z7.b) r10     // Catch:{ IOException -> 0x0469 }
            z7.b$a r14 = new z7.b$a     // Catch:{ IOException -> 0x0469 }
            r14.<init>(r10)     // Catch:{ IOException -> 0x0469 }
            z7.b r0 = (z7.b) r0     // Catch:{ IOException -> 0x0469 }
            z7.a0$e r0 = r0.f13997h     // Catch:{ IOException -> 0x0469 }
            z7.a0$e$b r0 = r0.l()     // Catch:{ IOException -> 0x0469 }
            z7.g$b r0 = (z7.g.b) r0     // Catch:{ IOException -> 0x0469 }
            r0.f14044j = r13     // Catch:{ IOException -> 0x0469 }
            z7.a0$e r0 = r0.a()     // Catch:{ IOException -> 0x0469 }
            r14.g = r0     // Catch:{ IOException -> 0x0469 }
            z7.a0 r0 = r14.a()     // Catch:{ IOException -> 0x0469 }
            r10 = r0
            z7.b r10 = (z7.b) r10     // Catch:{ IOException -> 0x0469 }
            z7.a0$e r10 = r10.f13997h     // Catch:{ IOException -> 0x0469 }
            if (r10 != 0) goto L_0x0436
            goto L_0x047e
        L_0x0436:
            if (r8 == 0) goto L_0x0449
            c8.f r8 = r2.f3266b     // Catch:{ IOException -> 0x0469 }
            java.lang.String r10 = r10.g()     // Catch:{ IOException -> 0x0469 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ IOException -> 0x0469 }
            java.io.File r13 = new java.io.File     // Catch:{ IOException -> 0x0469 }
            java.io.File r8 = r8.f3271d     // Catch:{ IOException -> 0x0469 }
            r13.<init>(r8, r10)     // Catch:{ IOException -> 0x0469 }
            goto L_0x0459
        L_0x0449:
            c8.f r8 = r2.f3266b     // Catch:{ IOException -> 0x0469 }
            java.lang.String r10 = r10.g()     // Catch:{ IOException -> 0x0469 }
            java.util.Objects.requireNonNull(r8)     // Catch:{ IOException -> 0x0469 }
            java.io.File r13 = new java.io.File     // Catch:{ IOException -> 0x0469 }
            java.io.File r8 = r8.f3270c     // Catch:{ IOException -> 0x0469 }
            r13.<init>(r8, r10)     // Catch:{ IOException -> 0x0469 }
        L_0x0459:
            java.lang.String r0 = r12.h(r0)     // Catch:{ IOException -> 0x0469 }
            c8.e.f(r13, r0)     // Catch:{ IOException -> 0x0469 }
            goto L_0x047e
        L_0x0461:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IOException -> 0x0469 }
            java.lang.String r8 = "Reports without sessions cannot have events added to them."
            r0.<init>(r8)     // Catch:{ IOException -> 0x0469 }
            throw r0     // Catch:{ IOException -> 0x0469 }
        L_0x0469:
            r0 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r10 = "Could not synthesize final report file for "
            r8.append(r10)
            r8.append(r11)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r6, r8, r0)
        L_0x047e:
            c8.f r0 = r2.f3266b
            java.util.Objects.requireNonNull(r0)
            java.io.File r8 = new java.io.File
            java.io.File r0 = r0.f3269b
            r8.<init>(r0, r9)
            c8.f.h(r8)
            r8 = 0
            goto L_0x0301
        L_0x0490:
            e8.i r0 = r2.f3267c
            e8.f r0 = (e8.f) r0
            e8.c r0 = r0.b()
            e8.c$b r0 = r0.f4757a
            java.util.Objects.requireNonNull(r0)
            java.util.List r0 = r2.b()
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r2 = r0.size()
            r3 = 4
            if (r2 > r3) goto L_0x04ab
            goto L_0x04c3
        L_0x04ab:
            java.util.List r0 = r0.subList(r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x04b3:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x04c3
            java.lang.Object r2 = r0.next()
            java.io.File r2 = (java.io.File) r2
            r2.delete()
            goto L_0x04b3
        L_0x04c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x7.q.c(boolean, e8.i):void");
    }

    public final void d(long j10) {
        try {
            f fVar = this.g;
            if (!fVar.a(".ae" + j10).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e10);
        }
    }

    public final boolean e(i iVar) {
        this.f12963e.a();
        if (g()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", (Throwable) null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", (Throwable) null);
        }
        try {
            c(true, iVar);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", (Throwable) null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String f() {
        SortedSet<String> c10 = this.f12968l.f12939b.c();
        if (!c10.isEmpty()) {
            return c10.first();
        }
        return null;
    }

    public final boolean g() {
        c0 c0Var = this.f12969m;
        return c0Var != null && c0Var.f12899t.get();
    }

    public final Task<Void> h(Task<e8.c> task) {
        Task task2;
        Task<Void> task3;
        c8.e eVar = this.f12968l.f12939b;
        if (!(!eVar.f3266b.d().isEmpty() || !eVar.f3266b.c().isEmpty() || !eVar.f3266b.b().isEmpty())) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", (Throwable) null);
            }
            this.f12970n.trySetResult(Boolean.FALSE);
            return Tasks.forResult(null);
        }
        c3.k kVar = c3.k.E;
        kVar.b1("Crash reports are available to be sent.");
        if (this.f12960b.a()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", (Throwable) null);
            }
            this.f12970n.trySetResult(Boolean.FALSE);
            task2 = Tasks.forResult(Boolean.TRUE);
        } else {
            kVar.e0("Automatic data collection is disabled.");
            kVar.b1("Notifying that unsent reports are available.");
            this.f12970n.trySetResult(Boolean.TRUE);
            d0 d0Var = this.f12960b;
            synchronized (d0Var.f12903b) {
                task3 = d0Var.f12904c.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task3.onSuccessTask(new n());
            kVar.e0("Waiting for send/deleteUnsentReports to be called.");
            Task<Boolean> task4 = this.f12971o.getTask();
            ExecutorService executorService = o0.f12956a;
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            m0 m0Var = new m0(taskCompletionSource, 0);
            onSuccessTask.continueWith(m0Var);
            task4.continueWith(m0Var);
            task2 = taskCompletionSource.getTask();
        }
        return task2.onSuccessTask(new a(task));
    }
}
