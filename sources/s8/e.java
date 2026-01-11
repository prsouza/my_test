package s8;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i3.t;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import k7.d;
import p8.i;
import s8.g;
import u8.a;
import u8.c;
import v8.b;
import v8.c;
import v8.f;

public final class e implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f10998m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final a f10999n = new a();

    /* renamed from: a  reason: collision with root package name */
    public final d f11000a;

    /* renamed from: b  reason: collision with root package name */
    public final c f11001b;

    /* renamed from: c  reason: collision with root package name */
    public final u8.c f11002c;

    /* renamed from: d  reason: collision with root package name */
    public final m f11003d;

    /* renamed from: e  reason: collision with root package name */
    public final u8.b f11004e;

    /* renamed from: f  reason: collision with root package name */
    public final k f11005f;
    public final Object g = new Object();

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f11006h;
    public final ThreadPoolExecutor i;

    /* renamed from: j  reason: collision with root package name */
    public String f11007j;

    /* renamed from: k  reason: collision with root package name */
    public Set<t8.a> f11008k = new HashSet();

    /* renamed from: l  reason: collision with root package name */
    public final List<l> f11009l = new ArrayList();

    public class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f11010a = new AtomicInteger(1);

        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", new Object[]{Integer.valueOf(this.f11010a.getAndIncrement())}));
        }
    }

    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11011a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11012b;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001d */
        static {
            /*
                v8.f$b[] r0 = v8.f.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f11012b = r0
                r1 = 1
                v8.f$b r2 = v8.f.b.OK     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f11012b     // Catch:{ NoSuchFieldError -> 0x001d }
                v8.f$b r3 = v8.f.b.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r2 = f11012b     // Catch:{ NoSuchFieldError -> 0x0028 }
                v8.f$b r3 = v8.f.b.AUTH_ERROR     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                v8.d$a[] r2 = v8.d.a.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f11011a = r2
                v8.d$a r3 = v8.d.a.OK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f11011a     // Catch:{ NoSuchFieldError -> 0x0043 }
                v8.d$a r2 = v8.d.a.BAD_CONFIG     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s8.e.b.<clinit>():void");
        }
    }

    public e(d dVar, r8.b<i> bVar) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        a aVar = f10999n;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30, timeUnit, linkedBlockingQueue, aVar);
        dVar.a();
        c cVar = new c(dVar.f7453a, bVar);
        u8.c cVar2 = new u8.c(dVar);
        m c10 = m.c();
        u8.b bVar2 = new u8.b(dVar);
        k kVar = new k();
        this.f11000a = dVar;
        this.f11001b = cVar;
        this.f11002c = cVar2;
        this.f11003d = c10;
        this.f11004e = bVar2;
        this.f11005f = kVar;
        this.f11006h = threadPoolExecutor;
        this.i = new ThreadPoolExecutor(0, 1, 30, timeUnit, new LinkedBlockingQueue(), aVar);
    }

    public static e f() {
        d c10 = d.c();
        Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
        return (e) c10.b(f.class);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<s8.l>, java.util.ArrayList] */
    public final Task a() {
        h();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        h hVar = new h(this.f11003d, taskCompletionSource);
        synchronized (this.g) {
            this.f11009l.add(hVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f11006h.execute(new c(this));
        return task;
    }

    public final void b(boolean z) {
        u8.d c10;
        synchronized (f10998m) {
            d dVar = this.f11000a;
            dVar.a();
            t a10 = t.a(dVar.f7453a);
            try {
                c10 = this.f11002c.c();
                if (c10.i()) {
                    String i10 = i(c10);
                    u8.c cVar = this.f11002c;
                    a.C0229a aVar = new a.C0229a((u8.a) c10);
                    aVar.f11734a = i10;
                    aVar.c(c.a.UNREGISTERED);
                    c10 = aVar.a();
                    cVar.b(c10);
                }
            } finally {
                if (a10 != null) {
                    a10.c();
                }
            }
        }
        if (z) {
            a.C0229a aVar2 = new a.C0229a((u8.a) c10);
            aVar2.f11736c = null;
            c10 = aVar2.a();
        }
        l(c10);
        this.i.execute(new d(this, z));
    }

    public final u8.d c(u8.d dVar) throws g {
        f f10;
        v8.c cVar = this.f11001b;
        String d10 = d();
        u8.a aVar = (u8.a) dVar;
        String str = aVar.f11728b;
        String g8 = g();
        String str2 = aVar.f11731e;
        if (cVar.f12353c.a()) {
            URL a10 = cVar.a(String.format("projects/%s/installations/%s/authTokens:generate", new Object[]{g8, str}));
            int i10 = 0;
            while (i10 <= 1) {
                TrafficStats.setThreadStatsTag(32771);
                HttpURLConnection c10 = cVar.c(a10, d10);
                try {
                    c10.setRequestMethod("POST");
                    c10.addRequestProperty("Authorization", "FIS_v2 " + str2);
                    c10.setDoOutput(true);
                    cVar.h(c10);
                    int responseCode = c10.getResponseCode();
                    cVar.f12353c.b(responseCode);
                    if (responseCode >= 200 && responseCode < 300) {
                        f10 = cVar.f(c10);
                    } else {
                        v8.c.b(c10, (String) null, d10, g8);
                        if (responseCode != 401) {
                            if (responseCode != 404) {
                                if (responseCode == 429) {
                                    g.a aVar2 = g.a.TOO_MANY_REQUESTS;
                                    throw new g("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                                } else if (responseCode < 500 || responseCode >= 600) {
                                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                                    b.a aVar3 = (b.a) f.a();
                                    aVar3.f12348c = f.b.BAD_CONFIG;
                                    f10 = aVar3.a();
                                } else {
                                    c10.disconnect();
                                    TrafficStats.clearThreadStatsTag();
                                    i10++;
                                }
                            }
                        }
                        b.a aVar4 = (b.a) f.a();
                        aVar4.f12348c = f.b.AUTH_ERROR;
                        f10 = aVar4.a();
                    }
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    v8.b bVar = (v8.b) f10;
                    int i11 = b.f11012b[bVar.f12345c.ordinal()];
                    if (i11 == 1) {
                        String str3 = bVar.f12343a;
                        long j10 = bVar.f12344b;
                        long b10 = this.f11003d.b();
                        a.C0229a aVar5 = new a.C0229a(aVar);
                        aVar5.f11736c = str3;
                        aVar5.b(j10);
                        aVar5.d(b10);
                        return aVar5.a();
                    } else if (i11 == 2) {
                        a.C0229a aVar6 = new a.C0229a(aVar);
                        aVar6.g = "BAD CONFIG";
                        aVar6.c(c.a.REGISTER_ERROR);
                        return aVar6.a();
                    } else if (i11 == 3) {
                        synchronized (this) {
                            this.f11007j = null;
                        }
                        a.C0229a aVar7 = new a.C0229a(aVar);
                        aVar7.c(c.a.NOT_GENERATED);
                        return aVar7.a();
                    } else {
                        g.a aVar8 = g.a.UNAVAILABLE;
                        throw new g("Firebase Installations Service is unavailable. Please try again later.");
                    }
                } catch (IOException | AssertionError unused) {
                } catch (Throwable th2) {
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    throw th2;
                }
            }
            g.a aVar9 = g.a.UNAVAILABLE;
            throw new g("Firebase Installations Service is unavailable. Please try again later.");
        }
        g.a aVar10 = g.a.UNAVAILABLE;
        throw new g("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final String d() {
        d dVar = this.f11000a;
        dVar.a();
        return dVar.f7455c.f7465a;
    }

    public final String e() {
        d dVar = this.f11000a;
        dVar.a();
        return dVar.f7455c.f7466b;
    }

    public final String g() {
        d dVar = this.f11000a;
        dVar.a();
        return dVar.f7455c.g;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.List<s8.l>, java.util.ArrayList] */
    public final Task<String> getId() {
        String str;
        h();
        synchronized (this) {
            str = this.f11007j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        i iVar = new i(taskCompletionSource);
        synchronized (this.g) {
            this.f11009l.add(iVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f11006h.execute(new b(this, 0));
        return task;
    }

    public final void h() {
        Preconditions.checkNotEmpty(e(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(g(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkNotEmpty(d(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        String e10 = e();
        Pattern pattern = m.f11019c;
        Preconditions.checkArgument(e10.contains(":"), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        Preconditions.checkArgument(m.f11019c.matcher(d()).matches(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String i(u8.d dVar) {
        String string;
        d dVar2 = this.f11000a;
        dVar2.a();
        if (dVar2.f7454b.equals("CHIME_ANDROID_SDK") || this.f11000a.h()) {
            if (((u8.a) dVar).f11729c == c.a.ATTEMPT_MIGRATION) {
                u8.b bVar = this.f11004e;
                synchronized (bVar.f11741a) {
                    synchronized (bVar.f11741a) {
                        string = bVar.f11741a.getString("|S|id", (String) null);
                    }
                    if (string == null) {
                        string = bVar.a();
                    }
                }
                return TextUtils.isEmpty(string) ? this.f11005f.a() : string;
            }
        }
        return this.f11005f.a();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:19|20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0050, code lost:
        if (r9.startsWith("{") == false) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4 = new org.json.JSONObject(r9).getString("token");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0060, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0061 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final u8.d j(u8.d r23) throws s8.g {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            u8.a r0 = (u8.a) r0
            java.lang.String r2 = r0.f11728b
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x006a
            int r2 = r2.length()
            r5 = 11
            if (r2 != r5) goto L_0x006a
            u8.b r2 = r1.f11004e
            android.content.SharedPreferences r5 = r2.f11741a
            monitor-enter(r5)
            java.lang.String[] r6 = u8.b.f11740c     // Catch:{ all -> 0x005e }
            r7 = 4
            r8 = r3
        L_0x001d:
            if (r8 >= r7) goto L_0x0066
            r9 = r6[r8]     // Catch:{ all -> 0x005e }
            java.lang.String r10 = r2.f11742b     // Catch:{ all -> 0x005e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            r11.<init>()     // Catch:{ all -> 0x005e }
            java.lang.String r12 = "|T|"
            r11.append(r12)     // Catch:{ all -> 0x005e }
            r11.append(r10)     // Catch:{ all -> 0x005e }
            java.lang.String r10 = "|"
            r11.append(r10)     // Catch:{ all -> 0x005e }
            r11.append(r9)     // Catch:{ all -> 0x005e }
            java.lang.String r9 = r11.toString()     // Catch:{ all -> 0x005e }
            android.content.SharedPreferences r10 = r2.f11741a     // Catch:{ all -> 0x005e }
            java.lang.String r9 = r10.getString(r9, r4)     // Catch:{ all -> 0x005e }
            if (r9 == 0) goto L_0x0063
            boolean r10 = r9.isEmpty()     // Catch:{ all -> 0x005e }
            if (r10 != 0) goto L_0x0063
            java.lang.String r2 = "{"
            boolean r2 = r9.startsWith(r2)     // Catch:{ all -> 0x005e }
            if (r2 == 0) goto L_0x0060
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0061 }
            r2.<init>(r9)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r6 = "token"
            java.lang.String r4 = r2.getString(r6)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0061
        L_0x005e:
            r0 = move-exception
            goto L_0x0068
        L_0x0060:
            r4 = r9
        L_0x0061:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            goto L_0x006a
        L_0x0063:
            int r8 = r8 + 1
            goto L_0x001d
        L_0x0066:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            goto L_0x006a
        L_0x0068:
            monitor-exit(r5)     // Catch:{ all -> 0x005e }
            throw r0
        L_0x006a:
            v8.c r2 = r1.f11001b
            java.lang.String r5 = r22.d()
            java.lang.String r6 = r0.f11728b
            java.lang.String r7 = r22.g()
            java.lang.String r8 = r22.e()
            v8.e r9 = r2.f12353c
            boolean r9 = r9.a()
            java.lang.String r10 = "Firebase Installations Service is unavailable. Please try again later."
            if (r9 == 0) goto L_0x0189
            r9 = 1
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r3] = r7
            java.lang.String r12 = "projects/%s/installations"
            java.lang.String r11 = java.lang.String.format(r12, r11)
            java.net.URL r11 = r2.a(r11)
            r12 = r3
        L_0x0094:
            if (r12 > r9) goto L_0x0181
            r13 = 32769(0x8001, float:4.5919E-41)
            android.net.TrafficStats.setThreadStatsTag(r13)
            java.net.HttpURLConnection r13 = r2.c(r11, r5)
            java.lang.String r14 = "POST"
            r13.setRequestMethod(r14)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r13.setDoOutput(r9)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            if (r4 == 0) goto L_0x00b3
            java.lang.String r14 = "x-goog-fis-android-iid-migration-auth"
            r13.addRequestProperty(r14, r4)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            goto L_0x00b3
        L_0x00b0:
            r0 = move-exception
            goto L_0x0170
        L_0x00b3:
            r2.g(r13, r6, r8)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            int r14 = r13.getResponseCode()     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            v8.e r15 = r2.f12353c     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r15.b(r14)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r15 = 200(0xc8, float:2.8E-43)
            if (r14 < r15) goto L_0x00c9
            r15 = 300(0x12c, float:4.2E-43)
            if (r14 >= r15) goto L_0x00c9
            r15 = r9
            goto L_0x00ca
        L_0x00c9:
            r15 = r3
        L_0x00ca:
            if (r15 == 0) goto L_0x00d7
            v8.d r2 = r2.e(r13)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x0107
        L_0x00d7:
            v8.c.b(r13, r8, r5, r7)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r15 = 429(0x1ad, float:6.01E-43)
            if (r14 == r15) goto L_0x0166
            r15 = 500(0x1f4, float:7.0E-43)
            if (r14 < r15) goto L_0x00e8
            r15 = 600(0x258, float:8.41E-43)
            if (r14 >= r15) goto L_0x00e8
            goto L_0x0177
        L_0x00e8:
            java.lang.String r14 = "Firebase-Installations"
            java.lang.String r15 = "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase."
            android.util.Log.e(r14, r15)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r20 = 0
            r19 = 0
            r18 = 0
            r17 = 0
            v8.d$a r21 = v8.d.a.BAD_CONFIG     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            v8.a r14 = new v8.a     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r16 = r14
            r16.<init>(r17, r18, r19, r20, r21)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            r2 = r14
        L_0x0107:
            int[] r3 = s8.e.b.f11011a
            v8.a r2 = (v8.a) r2
            v8.d$a r4 = r2.f12342e
            int r4 = r4.ordinal()
            r3 = r3[r4]
            if (r3 == r9) goto L_0x0135
            r2 = 2
            if (r3 != r2) goto L_0x012b
            java.lang.String r2 = "BAD CONFIG"
            u8.a$a r3 = new u8.a$a
            r3.<init>(r0)
            r3.g = r2
            u8.c$a r0 = u8.c.a.REGISTER_ERROR
            r3.c(r0)
            u8.d r0 = r3.a()
            return r0
        L_0x012b:
            s8.g r0 = new s8.g
            java.lang.String r2 = "Firebase Installations Service is unavailable. Please try again later."
            s8.g$a r3 = s8.g.a.UNAVAILABLE
            r0.<init>(r2)
            throw r0
        L_0x0135:
            java.lang.String r3 = r2.f12339b
            java.lang.String r4 = r2.f12340c
            s8.m r5 = r1.f11003d
            long r5 = r5.b()
            v8.f r7 = r2.f12341d
            java.lang.String r7 = r7.c()
            v8.f r2 = r2.f12341d
            long r8 = r2.d()
            u8.a$a r2 = new u8.a$a
            r2.<init>(r0)
            r2.f11734a = r3
            u8.c$a r0 = u8.c.a.REGISTERED
            r2.c(r0)
            r2.f11736c = r7
            r2.f11737d = r4
            r2.b(r8)
            r2.d(r5)
            u8.d r0 = r2.a()
            return r0
        L_0x0166:
            s8.g r14 = new s8.g     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            java.lang.String r15 = "Firebase servers have received too many requests from this client in a short period of time. Please try again later."
            s8.g$a r16 = s8.g.a.TOO_MANY_REQUESTS     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            r14.<init>(r15)     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
            throw r14     // Catch:{ IOException | AssertionError -> 0x0177, all -> 0x00b0 }
        L_0x0170:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        L_0x0177:
            r13.disconnect()
            android.net.TrafficStats.clearThreadStatsTag()
            int r12 = r12 + 1
            goto L_0x0094
        L_0x0181:
            s8.g r0 = new s8.g
            s8.g$a r2 = s8.g.a.UNAVAILABLE
            r0.<init>(r10)
            throw r0
        L_0x0189:
            s8.g r0 = new s8.g
            s8.g$a r2 = s8.g.a.UNAVAILABLE
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e.j(u8.d):u8.d");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<s8.l>, java.util.ArrayList] */
    public final void k(Exception exc) {
        synchronized (this.g) {
            Iterator it = this.f11009l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).b(exc)) {
                    it.remove();
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<s8.l>, java.util.ArrayList] */
    public final void l(u8.d dVar) {
        synchronized (this.g) {
            Iterator it = this.f11009l.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).a(dVar)) {
                    it.remove();
                }
            }
        }
    }
}
