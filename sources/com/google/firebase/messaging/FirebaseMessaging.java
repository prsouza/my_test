package com.google.firebase.messaging;

import a5.m;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.a;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.d;
import m8.b;
import org.slf4j.Marker;
import p8.j;
import q4.g;
import s8.f;
import x8.d0;
import x8.e0;
import x8.i0;
import x8.l0;
import x8.m0;
import x8.n;
import x8.o;
import x8.q;
import x8.r;
import x8.t;
import x8.x;

public class FirebaseMessaging {

    /* renamed from: l  reason: collision with root package name */
    public static final long f4201l = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: m  reason: collision with root package name */
    public static a f4202m;

    /* renamed from: n  reason: collision with root package name */
    public static g f4203n;

    /* renamed from: o  reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f4204o;

    /* renamed from: a  reason: collision with root package name */
    public final d f4205a;

    /* renamed from: b  reason: collision with root package name */
    public final q8.a f4206b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4207c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f4208d;

    /* renamed from: e  reason: collision with root package name */
    public final t f4209e;

    /* renamed from: f  reason: collision with root package name */
    public final e0 f4210f;
    public final a g;

    /* renamed from: h  reason: collision with root package name */
    public final Task<m0> f4211h;
    public final x i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4212j = false;

    /* renamed from: k  reason: collision with root package name */
    public final n f4213k;

    public class a {

        /* renamed from: a  reason: collision with root package name */
        public final m8.d f4214a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f4215b;

        /* renamed from: c  reason: collision with root package name */
        public b<k7.a> f4216c;

        /* renamed from: d  reason: collision with root package name */
        public Boolean f4217d;

        public a(m8.d dVar) {
            this.f4214a = dVar;
        }

        public final synchronized void a() {
            if (!this.f4215b) {
                Boolean c10 = c();
                this.f4217d = c10;
                if (c10 == null) {
                    r rVar = new r(this);
                    this.f4216c = rVar;
                    this.f4214a.a(rVar);
                }
                this.f4215b = true;
            }
        }

        public final synchronized boolean b() {
            boolean z;
            a();
            Boolean bool = this.f4217d;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                z = FirebaseMessaging.this.f4205a.g();
            }
            return z;
        }

        public final Boolean c() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            d dVar = FirebaseMessaging.this.f4205a;
            dVar.a();
            Context context = dVar.f7453a;
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
    }

    public FirebaseMessaging(d dVar, q8.a aVar, r8.b<a9.g> bVar, r8.b<j> bVar2, f fVar, g gVar, m8.d dVar2) {
        dVar.a();
        x xVar = new x(dVar.f7453a);
        t tVar = new t(dVar, xVar, bVar, bVar2, fVar);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        f4203n = gVar;
        this.f4205a = dVar;
        this.f4206b = aVar;
        this.f4207c = fVar;
        this.g = new a(dVar2);
        dVar.a();
        Context context = dVar.f7453a;
        this.f4208d = context;
        n nVar = new n();
        this.f4213k = nVar;
        this.i = xVar;
        this.f4209e = tVar;
        this.f4210f = new e0(newSingleThreadExecutor);
        dVar.a();
        Context context2 = dVar.f7453a;
        if (context2 instanceof Application) {
            ((Application) context2).registerActivityLifecycleCallbacks(nVar);
        } else {
            Log.w("FirebaseMessaging", "Context " + context2 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.c();
        }
        scheduledThreadPoolExecutor.execute(new h1.t(this, 1));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i10 = m0.f13087j;
        Task<m0> call = Tasks.call(scheduledThreadPoolExecutor2, new l0(context, scheduledThreadPoolExecutor2, this, xVar, tVar));
        this.f4211h = call;
        call.addOnSuccessListener((Executor) scheduledThreadPoolExecutor, (OnSuccessListener<? super m0>) new m(this, 1));
        scheduledThreadPoolExecutor.execute(new q(this));
    }

    public static synchronized a c(Context context) {
        a aVar;
        synchronized (FirebaseMessaging.class) {
            if (f4202m == null) {
                f4202m = new a(context);
            }
            aVar = f4202m;
        }
        return aVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(d dVar) {
        FirebaseMessaging firebaseMessaging;
        Class cls = FirebaseMessaging.class;
        synchronized (cls) {
            firebaseMessaging = (FirebaseMessaging) dVar.b(cls);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>>, s.g] */
    /* JADX WARNING: type inference failed for: r0v7, types: [java.util.Map<java.lang.String, com.google.android.gms.tasks.Task<java.lang.String>>, s.g] */
    public final String a() throws IOException {
        Task<TContinuationResult> task;
        q8.a aVar = this.f4206b;
        if (aVar != null) {
            try {
                return (String) Tasks.await(aVar.b());
            } catch (InterruptedException | ExecutionException e10) {
                throw new IOException(e10);
            }
        } else {
            a.C0052a e11 = e();
            if (!i(e11)) {
                return e11.f4222a;
            }
            String b10 = x.b(this.f4205a);
            e0 e0Var = this.f4210f;
            synchronized (e0Var) {
                task = (Task) e0Var.f13037b.getOrDefault(b10, null);
                if (task == null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Making new request for: " + b10);
                    }
                    t tVar = this.f4209e;
                    task = tVar.a(tVar.c(x.b(tVar.f13130a), Marker.ANY_MARKER, new Bundle())).onSuccessTask(c9.d.f3279a, new o(this, b10, e11)).continueWithTask(e0Var.f13036a, new d0(e0Var, b10));
                    e0Var.f13037b.put(b10, task);
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Joining ongoing request for: " + b10);
                }
            }
            try {
                return (String) Tasks.await(task);
            } catch (InterruptedException | ExecutionException e12) {
                throw new IOException(e12);
            }
        }
    }

    public final void b(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            if (f4204o == null) {
                f4204o = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            f4204o.schedule(runnable, j10, TimeUnit.SECONDS);
        }
    }

    public final String d() {
        d dVar = this.f4205a;
        dVar.a();
        if ("[DEFAULT]".equals(dVar.f7454b)) {
            return BuildConfig.FLAVOR;
        }
        return this.f4205a.d();
    }

    public final a.C0052a e() {
        a.C0052a b10;
        a c10 = c(this.f4208d);
        String d10 = d();
        String b11 = x.b(this.f4205a);
        synchronized (c10) {
            b10 = a.C0052a.b(c10.f4220a.getString(c10.a(d10, b11), (String) null));
        }
        return b10;
    }

    public final synchronized void f(boolean z) {
        this.f4212j = z;
    }

    public final void g() {
        q8.a aVar = this.f4206b;
        if (aVar != null) {
            aVar.a();
        } else if (i(e())) {
            synchronized (this) {
                if (!this.f4212j) {
                    h(0);
                }
            }
        }
    }

    public final synchronized void h(long j10) {
        b(new i0(this, Math.min(Math.max(30, 2 * j10), f4201l)), j10);
        this.f4212j = true;
    }

    public final boolean i(a.C0052a aVar) {
        if (aVar != null) {
            if (!(System.currentTimeMillis() > aVar.f4224c + a.C0052a.f4221d || !this.i.a().equals(aVar.f4223b))) {
                return false;
            }
        }
        return true;
    }
}
