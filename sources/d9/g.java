package d9;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import e6.e;
import f9.a;
import f9.c;
import f9.d;
import fe.k;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import l6.b0;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f4381a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f4382b;

    /* renamed from: c  reason: collision with root package name */
    public final ExecutorService f4383c;

    /* renamed from: d  reason: collision with root package name */
    public final d f4384d;

    /* renamed from: e  reason: collision with root package name */
    public final c f4385e;

    /* renamed from: f  reason: collision with root package name */
    public final r2.g f4386f;
    public final String g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4387h = "b60f376107041c3ba0066825c58607fc";
    public final String i;

    public static final class a<V> implements Callable<i> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4388a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f4389b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ c f4390c;

        public a(g gVar, String str, c cVar) {
            this.f4388a = gVar;
            this.f4389b = str;
            this.f4390c = cVar;
        }

        public final Object call() {
            f9.b bVar;
            c cVar = this.f4388a.f4385e;
            String str = this.f4389b;
            Objects.requireNonNull(cVar);
            e.D(str, "localeHash");
            try {
                bVar = cVar.b(str);
            } catch (Throwable unused) {
                bVar = null;
            }
            if (bVar != null) {
                return new j(bVar, this.f4390c);
            }
            return null;
        }
    }

    public static final class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g f4391a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ c f4392b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f4393c;

        /* renamed from: s  reason: collision with root package name */
        public final /* synthetic */ k f4394s;

        public static final class a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ b f4395a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ f9.a f4396b;

            public a(b bVar, f9.a aVar) {
                this.f4395a = bVar;
                this.f4396b = aVar;
            }

            public final void run() {
                k kVar;
                f9.a aVar = this.f4396b;
                if (aVar instanceof a.C0082a) {
                    j jVar = new j(((a.C0082a) aVar).f5019a, this.f4395a.f4392b);
                    f fVar = f.f4380d;
                    b0 b0Var = f.f4379c;
                    a aVar2 = new a(jVar);
                    Objects.requireNonNull(b0Var);
                    b0Var.f7786a = aVar2;
                    b bVar = this.f4395a;
                    d dVar = bVar.f4391a.f4384d;
                    String str = bVar.f4393c;
                    String str2 = ((a.C0082a) this.f4396b).f5020b;
                    Objects.requireNonNull(dVar);
                    e.D(str, "localeHash");
                    e.D(str2, "version");
                    dVar.f5034a.edit().putString(str, str2).apply();
                    d dVar2 = this.f4395a.f4391a.f4384d;
                    Objects.requireNonNull(dVar2);
                    dVar2.f5035b.a(d.f5033d[0], String.valueOf(System.currentTimeMillis() / 1000));
                    k kVar2 = this.f4395a.f4394s;
                    if (kVar2 != null) {
                        kVar2.b();
                    }
                } else if (aVar instanceof a.c) {
                    k kVar3 = this.f4395a.f4394s;
                    if (kVar3 != null) {
                        kVar3.b();
                    }
                } else if ((aVar instanceof a.b) && (kVar = this.f4395a.f4394s) != null) {
                    kVar.a();
                }
            }
        }

        public b(g gVar, c cVar, String str, k kVar) {
            this.f4391a = gVar;
            this.f4392b = cVar;
            this.f4393c = str;
            this.f4394s = kVar;
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0177, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            ad.c.z(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x017b, code lost:
            throw r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r13 = this;
                d9.g r0 = r13.f4391a
                r2.g r1 = r0.f4386f
                d9.c r2 = r13.f4392b
                java.lang.String r2 = r2.f4374b
                java.lang.String r3 = r13.f4393c
                f9.d r0 = r0.f4384d
                f9.d$a r4 = r0.f5036c
                de.h[] r5 = f9.d.f5033d
                r6 = 1
                r7 = r5[r6]
                java.util.Objects.requireNonNull(r4)
                java.lang.String r8 = "property"
                e6.e.D(r7, r8)
                f9.d r7 = r4.f5038b
                android.content.SharedPreferences r7 = r7.f5034a
                java.lang.String r4 = r4.f5037a
                r9 = 0
                java.lang.String r4 = r7.getString(r4, r9)
                if (r4 == 0) goto L_0x0029
                goto L_0x003d
            L_0x0029:
                java.util.UUID r4 = java.util.UUID.randomUUID()
                java.lang.String r4 = r4.toString()
                f9.d$a r0 = r0.f5036c
                r7 = r5[r6]
                r0.a(r7, r4)
                java.lang.String r0 = "UUID.randomUUID().toStri…).also { _uniqueId = it }"
                e6.e.C(r4, r0)
            L_0x003d:
                d9.g r0 = r13.f4391a
                f9.d r0 = r0.f4384d
                f9.d$a r0 = r0.f5035b
                r7 = 0
                r5 = r5[r7]
                java.util.Objects.requireNonNull(r0)
                e6.e.D(r5, r8)
                f9.d r5 = r0.f5038b
                android.content.SharedPreferences r5 = r5.f5034a
                java.lang.String r0 = r0.f5037a
                java.lang.String r0 = r5.getString(r0, r9)
                d9.g r5 = r13.f4391a
                f9.d r5 = r5.f4384d
                java.lang.String r8 = r13.f4393c
                java.util.Objects.requireNonNull(r5)
                java.lang.String r10 = "localeHash"
                e6.e.D(r8, r10)
                android.content.SharedPreferences r5 = r5.f5034a
                java.lang.String r5 = r5.getString(r8, r9)
                d9.g r8 = r13.f4391a
                java.util.Objects.requireNonNull(r8)
                d9.g r8 = r13.f4391a
                java.lang.String r8 = r8.g
                java.util.Objects.requireNonNull(r1)
                java.lang.String r11 = "locale"
                e6.e.D(r2, r11)
                e6.e.D(r3, r10)
                android.net.Uri$Builder r10 = new android.net.Uri$Builder
                r10.<init>()
                java.lang.String r11 = "client"
                java.lang.String r12 = "android"
                r10.appendQueryParameter(r11, r12)
                java.lang.String r11 = "unique_identifier"
                r10.appendQueryParameter(r11, r4)
                java.lang.String r4 = "sdk_version"
                java.lang.String r11 = "3.0.5"
                r10.appendQueryParameter(r4, r11)
                if (r0 == 0) goto L_0x009d
                java.lang.String r4 = "last_update"
                r10.appendQueryParameter(r4, r0)
            L_0x009d:
                if (r5 == 0) goto L_0x00a4
                java.lang.String r0 = "current_version"
                r10.appendQueryParameter(r0, r5)
            L_0x00a4:
                if (r8 == 0) goto L_0x00ab
                java.lang.String r0 = "app_version"
                r10.appendQueryParameter(r0, r8)
            L_0x00ab:
                android.net.Uri r0 = r10.build()
                java.lang.String r4 = "with(Uri.Builder()){\n   …        build()\n        }"
                e6.e.C(r0, r4)
                java.lang.String r0 = r0.getEncodedQuery()
                java.lang.String r4 = "https://ota.phraseapp.com/"
                java.lang.StringBuilder r4 = a.a.d(r4)
                java.lang.Object r5 = r1.f10539a
                java.lang.String r5 = (java.lang.String) r5
                r4.append(r5)
                r5 = 47
                r4.append(r5)
                java.lang.Object r8 = r1.f10540b
                java.lang.String r8 = (java.lang.String) r8
                r4.append(r8)
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = "/xml?"
                r4.append(r2)
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                java.net.URL r2 = new java.net.URL
                r2.<init>(r0)
                java.net.URLConnection r0 = r2.openConnection()
                java.lang.String r2 = "null cannot be cast to non-null type java.net.HttpURLConnection"
                java.util.Objects.requireNonNull(r0, r2)
                java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0
                java.lang.String r2 = "GET"
                r0.setRequestMethod(r2)
                r0.setInstanceFollowRedirects(r6)
                r2 = 10000(0x2710, float:1.4013E-41)
                r0.setConnectTimeout(r2)
                r0.setReadTimeout(r2)
                int r2 = r0.getResponseCode()     // Catch:{ all -> 0x01c9 }
                r4 = 200(0xc8, float:2.8E-43)
                if (r2 == r4) goto L_0x0187
                r1 = 304(0x130, float:4.26E-43)
                if (r2 == r1) goto L_0x017c
                java.io.InputStream r1 = r0.getErrorStream()     // Catch:{ all -> 0x01c9 }
                java.lang.String r2 = "connection.errorStream"
                e6.e.C(r1, r2)     // Catch:{ all -> 0x01c9 }
                java.nio.charset.Charset r2 = fe.a.f5086b     // Catch:{ all -> 0x01c9 }
                java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x01c9 }
                r3.<init>(r1, r2)     // Catch:{ all -> 0x01c9 }
                boolean r1 = r3 instanceof java.io.BufferedReader     // Catch:{ all -> 0x01c9 }
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r1 == 0) goto L_0x0128
                java.io.BufferedReader r3 = (java.io.BufferedReader) r3     // Catch:{ all -> 0x01c9 }
                goto L_0x012e
            L_0x0128:
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ all -> 0x01c9 }
                r1.<init>(r3, r2)     // Catch:{ all -> 0x01c9 }
                r3 = r1
            L_0x012e:
                java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x0175 }
                r1.<init>()     // Catch:{ all -> 0x0175 }
                char[] r2 = new char[r2]     // Catch:{ all -> 0x0175 }
                int r4 = r3.read(r2)     // Catch:{ all -> 0x0175 }
            L_0x0139:
                if (r4 < 0) goto L_0x0143
                r1.write(r2, r7, r4)     // Catch:{ all -> 0x0175 }
                int r4 = r3.read(r2)     // Catch:{ all -> 0x0175 }
                goto L_0x0139
            L_0x0143:
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0175 }
                java.lang.String r2 = "buffer.toString()"
                e6.e.C(r1, r2)     // Catch:{ all -> 0x0175 }
                ad.c.z(r3, r9)     // Catch:{ all -> 0x01c9 }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c9 }
                r2.<init>()     // Catch:{ all -> 0x01c9 }
                java.lang.String r3 = "Could not update translations. Got status: "
                r2.append(r3)     // Catch:{ all -> 0x01c9 }
                int r3 = r0.getResponseCode()     // Catch:{ all -> 0x01c9 }
                r2.append(r3)     // Catch:{ all -> 0x01c9 }
                java.lang.String r3 = ": "
                r2.append(r3)     // Catch:{ all -> 0x01c9 }
                r2.append(r1)     // Catch:{ all -> 0x01c9 }
                java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x01c9 }
                c3.k.E0(r1)     // Catch:{ all -> 0x01c9 }
                d9.b r1 = new d9.b     // Catch:{ all -> 0x01c9 }
                r1.<init>()     // Catch:{ all -> 0x01c9 }
                throw r1     // Catch:{ all -> 0x01c9 }
            L_0x0175:
                r1 = move-exception
                throw r1     // Catch:{ all -> 0x0177 }
            L_0x0177:
                r2 = move-exception
                ad.c.z(r3, r1)     // Catch:{ all -> 0x01c9 }
                throw r2     // Catch:{ all -> 0x01c9 }
            L_0x017c:
                java.lang.String r1 = "Translations already up to date"
                c3.k.E0(r1)     // Catch:{ all -> 0x01c9 }
                f9.a$c r1 = f9.a.c.f5022a     // Catch:{ all -> 0x01c9 }
                r0.disconnect()
                goto L_0x01d3
            L_0x0187:
                java.net.URL r2 = r0.getURL()     // Catch:{ all -> 0x01c9 }
                java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01c9 }
                java.lang.String r4 = "connection.url.toString()"
                e6.e.C(r2, r4)     // Catch:{ all -> 0x01c9 }
                android.net.UrlQuerySanitizer r4 = new android.net.UrlQuerySanitizer     // Catch:{ all -> 0x01c9 }
                r4.<init>(r2)     // Catch:{ all -> 0x01c9 }
                java.lang.String r2 = "version"
                java.lang.String r2 = r4.getValue(r2)     // Catch:{ all -> 0x01c9 }
                if (r2 == 0) goto L_0x01c3
                java.lang.Object r4 = r1.f10541c     // Catch:{ all -> 0x01c9 }
                f9.c r4 = (f9.c) r4     // Catch:{ all -> 0x01c9 }
                java.io.InputStream r5 = r0.getInputStream()     // Catch:{ all -> 0x01c9 }
                java.lang.String r6 = "connection.inputStream"
                e6.e.C(r5, r6)     // Catch:{ all -> 0x01c9 }
                r4.c(r3, r5)     // Catch:{ all -> 0x01c9 }
                java.lang.Object r1 = r1.f10541c     // Catch:{ all -> 0x01c9 }
                f9.c r1 = (f9.c) r1     // Catch:{ all -> 0x01c9 }
                f9.b r1 = r1.b(r3)     // Catch:{ all -> 0x01c9 }
                f9.a$a r3 = new f9.a$a     // Catch:{ all -> 0x01c9 }
                r3.<init>(r1, r2)     // Catch:{ all -> 0x01c9 }
                r0.disconnect()
                r1 = r3
                goto L_0x01d3
            L_0x01c3:
                d9.d r1 = new d9.d     // Catch:{ all -> 0x01c9 }
                r1.<init>()     // Catch:{ all -> 0x01c9 }
                throw r1     // Catch:{ all -> 0x01c9 }
            L_0x01c9:
                r1 = move-exception
                f9.a$b r2 = new f9.a$b     // Catch:{ all -> 0x01e0 }
                r2.<init>(r1)     // Catch:{ all -> 0x01e0 }
                r0.disconnect()
                r1 = r2
            L_0x01d3:
                d9.g r0 = r13.f4391a
                android.os.Handler r0 = r0.f4381a
                d9.g$b$a r2 = new d9.g$b$a
                r2.<init>(r13, r1)
                r0.post(r2)
                return
            L_0x01e0:
                r1 = move-exception
                r0.disconnect()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: d9.g.b.run():void");
        }
    }

    public g(Context context, String str) {
        String str2;
        this.i = str;
        this.f4381a = new Handler(Looper.getMainLooper());
        this.f4382b = Executors.newSingleThreadExecutor();
        this.f4383c = Executors.newSingleThreadExecutor();
        this.f4384d = new d(context);
        c cVar = new c(context);
        this.f4385e = cVar;
        this.f4386f = new r2.g(str, cVar);
        try {
            boolean z = false;
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            e.C(packageInfo, "context.packageManager.g…o(context.packageName, 0)");
            String str3 = packageInfo.versionName;
            if (!((str3 == null || k.Z0(str3)) ? true : z)) {
                str2 = packageInfo.versionName;
                this.g = str2;
                b();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.LOCALE_CHANGED");
                context.registerReceiver(new h(this), intentFilter);
                return;
            }
            throw new PackageManager.NameNotFoundException();
        } catch (PackageManager.NameNotFoundException unused) {
            c3.k.E0("Could not read app version");
            str2 = null;
        }
    }

    public final String a(String str) {
        String str2 = this.f4387h + '-' + this.i + '-' + str;
        e.D(str2, "s");
        MessageDigest instance = MessageDigest.getInstance("SHA-512");
        byte[] bytes = str2.getBytes(fe.a.f5086b);
        e.C(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        e.C(digest, "digest");
        StringBuilder sb2 = new StringBuilder();
        int length = digest.length;
        for (int i10 = 0; i10 < length; i10++) {
            String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i10])}, 1));
            e.C(format, "java.lang.String.format(this, *args)");
            sb2.append(format);
        }
        String sb3 = sb2.toString();
        e.C(sb3, "digest.fold(StringBuilde…rmat(byte)) }).toString()");
        return sb3;
    }

    public final void b() {
        f fVar = f.f4380d;
        b0 b0Var = f.f4379c;
        c cVar = (c) b0Var.f7787b;
        Future submit = this.f4382b.submit(new a(this, a(cVar.f4374b), cVar));
        e.C(submit, "futureTask");
        Objects.requireNonNull(b0Var);
        b0Var.f7786a = submit;
    }

    public final void c(k kVar) {
        f fVar = f.f4380d;
        c cVar = (c) f.f4379c.f7787b;
        this.f4383c.submit(new b(this, cVar, a(cVar.f4374b), kVar));
    }
}
