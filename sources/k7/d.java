package k7;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j0.j;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.slf4j.Marker;
import p8.g;
import s.f;
import s7.k;
import s7.r;

public final class d {

    /* renamed from: k  reason: collision with root package name */
    public static final Object f7450k = new Object();

    /* renamed from: l  reason: collision with root package name */
    public static final c f7451l = new c();

    /* renamed from: m  reason: collision with root package name */
    public static final Map<String, d> f7452m = new s.a();

    /* renamed from: a  reason: collision with root package name */
    public final Context f7453a;

    /* renamed from: b  reason: collision with root package name */
    public final String f7454b;

    /* renamed from: c  reason: collision with root package name */
    public final f f7455c;

    /* renamed from: d  reason: collision with root package name */
    public final k f7456d;

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f7457e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    public final AtomicBoolean f7458f = new AtomicBoolean();
    public final r<w8.a> g;

    /* renamed from: h  reason: collision with root package name */
    public final r8.b<g> f7459h;
    public final List<a> i = new CopyOnWriteArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final List<Object> f7460j = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    public static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        public static AtomicReference<b> f7461a = new AtomicReference<>();

        /* JADX WARNING: type inference failed for: r2v0, types: [s.a, java.util.Map<java.lang.String, k7.d>] */
        /* JADX WARNING: type inference failed for: r2v5, types: [java.util.List<k7.d$a>, java.util.concurrent.CopyOnWriteArrayList] */
        public final void onBackgroundStateChanged(boolean z) {
            Object obj = d.f7450k;
            synchronized (d.f7450k) {
                Iterator it = new ArrayList(d.f7452m.values()).iterator();
                while (it.hasNext()) {
                    d dVar = (d) it.next();
                    if (dVar.f7457e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it2 = dVar.i.iterator();
                        while (it2.hasNext()) {
                            ((a) it2.next()).onBackgroundStateChanged(z);
                        }
                    }
                }
            }
        }
    }

    public static class c implements Executor {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f7462a = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            f7462a.post(runnable);
        }
    }

    /* renamed from: k7.d$d  reason: collision with other inner class name */
    public static class C0132d extends BroadcastReceiver {

        /* renamed from: b  reason: collision with root package name */
        public static AtomicReference<C0132d> f7463b = new AtomicReference<>();

        /* renamed from: a  reason: collision with root package name */
        public final Context f7464a;

        public C0132d(Context context) {
            this.f7464a = context;
        }

        /* JADX WARNING: type inference failed for: r3v2, types: [s.a, java.util.Map<java.lang.String, k7.d>] */
        public final void onReceive(Context context, Intent intent) {
            Object obj = d.f7450k;
            synchronized (d.f7450k) {
                Iterator it = ((f.e) d.f7452m.values()).iterator();
                while (it.hasNext()) {
                    ((d) it.next()).e();
                }
            }
            this.f7464a.unregisterReceiver(this);
        }
    }

    /* JADX WARNING: type inference failed for: r10v12, types: [java.util.List<k7.d$a>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5 A[LOOP:1: B:24:0x00bf->B:26:0x00c5, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public d(android.content.Context r9, java.lang.String r10, k7.f r11) {
        /*
            r8 = this;
            r8.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r8.f7457e = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>()
            r8.f7458f = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.i = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r8.f7460j = r0
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            android.content.Context r0 = (android.content.Context) r0
            r8.f7453a = r0
            java.lang.String r10 = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r10)
            r8.f7454b = r10
            java.lang.Object r10 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r11)
            k7.f r10 = (k7.f) r10
            r8.f7455c = r10
            java.lang.Class<com.google.firebase.components.ComponentDiscoveryService> r10 = com.google.firebase.components.ComponentDiscoveryService.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "ComponentDiscovery"
            r3 = 0
            android.content.pm.PackageManager r4 = r9.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0071 }
            if (r4 != 0) goto L_0x004c
            java.lang.String r10 = "Context has no PackageManager."
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0071 }
            goto L_0x0076
        L_0x004c:
            android.content.ComponentName r5 = new android.content.ComponentName     // Catch:{ NameNotFoundException -> 0x0071 }
            r5.<init>(r9, r10)     // Catch:{ NameNotFoundException -> 0x0071 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ServiceInfo r4 = r4.getServiceInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0071 }
            if (r4 != 0) goto L_0x006e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0071 }
            r4.<init>()     // Catch:{ NameNotFoundException -> 0x0071 }
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0071 }
            java.lang.String r10 = " has no service info."
            r4.append(r10)     // Catch:{ NameNotFoundException -> 0x0071 }
            java.lang.String r10 = r4.toString()     // Catch:{ NameNotFoundException -> 0x0071 }
            android.util.Log.w(r2, r10)     // Catch:{ NameNotFoundException -> 0x0071 }
            goto L_0x0076
        L_0x006e:
            android.os.Bundle r10 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0071 }
            goto L_0x0077
        L_0x0071:
            java.lang.String r10 = "Application info not found."
            android.util.Log.w(r2, r10)
        L_0x0076:
            r10 = r3
        L_0x0077:
            if (r10 != 0) goto L_0x0083
            java.lang.String r10 = "Could not retrieve metadata, returning empty list of registrars."
            android.util.Log.w(r2, r10)
            java.util.List r10 = java.util.Collections.emptyList()
            goto L_0x00bb
        L_0x0083:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r4 = r10.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0090:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00ba
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r10.get(r5)
            java.lang.String r7 = "com.google.firebase.components.ComponentRegistrar"
            boolean r6 = r7.equals(r6)
            if (r6 == 0) goto L_0x0090
            java.lang.String r6 = "com.google.firebase.components:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L_0x0090
            r6 = 31
            java.lang.String r5 = r5.substring(r6)
            r2.add(r5)
            goto L_0x0090
        L_0x00ba:
            r10 = r2
        L_0x00bb:
            java.util.Iterator r10 = r10.iterator()
        L_0x00bf:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x00d4
            java.lang.Object r2 = r10.next()
            java.lang.String r2 = (java.lang.String) r2
            s7.d r4 = new s7.d
            r4.<init>(r2)
            r0.add(r4)
            goto L_0x00bf
        L_0x00d4:
            k7.d$c r10 = f7451l
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.addAll(r0)
            com.google.firebase.FirebaseCommonRegistrar r0 = new com.google.firebase.FirebaseCommonRegistrar
            r0.<init>()
            s7.l r5 = new s7.l
            r5.<init>(r0)
            r2.add(r5)
            java.lang.Class<android.content.Context> r0 = android.content.Context.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            s7.b r0 = s7.b.c(r9, r0, r5)
            r4.add(r0)
            java.lang.Class<k7.d> r0 = k7.d.class
            java.lang.Class[] r5 = new java.lang.Class[r1]
            s7.b r0 = s7.b.c(r8, r0, r5)
            r4.add(r0)
            java.lang.Class<k7.f> r0 = k7.f.class
            java.lang.Class[] r1 = new java.lang.Class[r1]
            s7.b r11 = s7.b.c(r11, r0, r1)
            r4.add(r11)
            s7.k r11 = new s7.k
            r11.<init>(r10, r2, r4, r3)
            r8.f7456d = r11
            s7.r r10 = new s7.r
            k7.c r0 = new k7.c
            r0.<init>(r8, r9)
            r10.<init>(r0)
            r8.g = r10
            java.lang.Class<p8.g> r9 = p8.g.class
            r8.b r9 = r11.d(r9)
            r8.f7459h = r9
            k7.b r9 = new k7.b
            r9.<init>(r8)
            r8.a()
            java.util.concurrent.atomic.AtomicBoolean r10 = r8.f7457e
            boolean r10 = r10.get()
            if (r10 == 0) goto L_0x014a
            com.google.android.gms.common.api.internal.BackgroundDetector r10 = com.google.android.gms.common.api.internal.BackgroundDetector.getInstance()
            boolean r10 = r10.isInBackground()
            if (r10 == 0) goto L_0x014a
            r10 = 1
            r9.onBackgroundStateChanged(r10)
        L_0x014a:
            java.util.List<k7.d$a> r10 = r8.i
            r10.add(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.d.<init>(android.content.Context, java.lang.String, k7.f):void");
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.Map<java.lang.String, k7.d>, s.g] */
    public static d c() {
        d dVar;
        synchronized (f7450k) {
            dVar = (d) f7452m.getOrDefault("[DEFAULT]", null);
            if (dVar == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return dVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.Map<java.lang.String, k7.d>, s.g] */
    public static d f(Context context, f fVar) {
        d dVar;
        AtomicReference<b> atomicReference = b.f7461a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (b.f7461a.get() == null) {
                b bVar = new b();
                if (b.f7461a.compareAndSet((Object) null, bVar)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(bVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7450k) {
            ? r22 = f7452m;
            Preconditions.checkState(!r22.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            dVar = new d(context, "[DEFAULT]", fVar);
            r22.put("[DEFAULT]", dVar);
        }
        dVar.e();
        return dVar;
    }

    public final void a() {
        Preconditions.checkState(!this.f7458f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T b(Class<T> cls) {
        a();
        return this.f7456d.a(cls);
    }

    @KeepForSdk
    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f7454b.getBytes(Charset.defaultCharset())));
        sb2.append(Marker.ANY_NON_NULL_MARKER);
        a();
        sb2.append(Base64Utils.encodeUrlSafeNoPadding(this.f7455c.f7466b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        HashMap hashMap;
        if (!j.a(this.f7453a)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f7454b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f7453a;
            if (C0132d.f7463b.get() == null) {
                C0132d dVar = new C0132d(context);
                if (C0132d.f7463b.compareAndSet((Object) null, dVar)) {
                    context.registerReceiver(dVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f7454b);
        Log.i("FirebaseApp", sb3.toString());
        k kVar = this.f7456d;
        boolean h10 = h();
        if (kVar.A.compareAndSet((Object) null, Boolean.valueOf(h10))) {
            synchronized (kVar) {
                hashMap = new HashMap(kVar.f10956v);
            }
            kVar.r2(hashMap, h10);
        }
        this.f7459h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        String str = this.f7454b;
        d dVar = (d) obj;
        dVar.a();
        return str.equals(dVar.f7454b);
    }

    @KeepForSdk
    public final boolean g() {
        boolean z;
        a();
        w8.a aVar = this.g.get();
        synchronized (aVar) {
            z = aVar.f12612b;
        }
        return z;
    }

    @KeepForSdk
    public final boolean h() {
        a();
        return "[DEFAULT]".equals(this.f7454b);
    }

    public final int hashCode() {
        return this.f7454b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f7454b).add("options", this.f7455c).toString();
    }
}
