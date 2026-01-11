package x7;

import android.content.Context;
import android.util.Log;
import c8.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e8.i;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k7.d;
import l6.t2;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final Context f12989a;

    /* renamed from: b  reason: collision with root package name */
    public final d0 f12990b;

    /* renamed from: c  reason: collision with root package name */
    public final t2 f12991c = new t2();

    /* renamed from: d  reason: collision with root package name */
    public final long f12992d = System.currentTimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public z f12993e;

    /* renamed from: f  reason: collision with root package name */
    public z f12994f;
    public q g;

    /* renamed from: h  reason: collision with root package name */
    public final i0 f12995h;
    public final f i;

    /* renamed from: j  reason: collision with root package name */
    public final w7.b f12996j;

    /* renamed from: k  reason: collision with root package name */
    public final v7.a f12997k;

    /* renamed from: l  reason: collision with root package name */
    public final ExecutorService f12998l;

    /* renamed from: m  reason: collision with root package name */
    public final f f12999m;

    /* renamed from: n  reason: collision with root package name */
    public final u7.a f13000n;

    public class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f13001a;

        public a(i iVar) {
            this.f13001a = iVar;
        }

        public final void run() {
            x.a(x.this, this.f13001a);
        }
    }

    public class b implements Callable<Boolean> {
        public b() {
        }

        public final Object call() throws Exception {
            try {
                boolean delete = x.this.f12993e.b().delete();
                if (!delete) {
                    Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", (Throwable) null);
                }
                return Boolean.valueOf(delete);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e10);
                return Boolean.FALSE;
            }
        }
    }

    public x(d dVar, i0 i0Var, u7.a aVar, d0 d0Var, w7.b bVar, v7.a aVar2, f fVar, ExecutorService executorService) {
        this.f12990b = d0Var;
        dVar.a();
        this.f12989a = dVar.f7453a;
        this.f12995h = i0Var;
        this.f13000n = aVar;
        this.f12996j = bVar;
        this.f12997k = aVar2;
        this.f12998l = executorService;
        this.i = fVar;
        this.f12999m = new f(executorService);
    }

    public static Task a(x xVar, i iVar) {
        Task<Void> task;
        xVar.f12999m.a();
        xVar.f12993e.a();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", (Throwable) null);
        }
        try {
            xVar.f12996j.b(new v(xVar));
            e8.f fVar = (e8.f) iVar;
            if (!fVar.b().f4758b.f4763a) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", (Throwable) null);
                }
                task = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            } else {
                if (!xVar.g.e(fVar)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", (Throwable) null);
                }
                task = xVar.g.h(fVar.i.get().getTask());
            }
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e10);
            task = Tasks.forException(e10);
        } catch (Throwable th2) {
            xVar.c();
            throw th2;
        }
        xVar.c();
        return task;
    }

    public final void b(i iVar) {
        Future<?> submit = this.f12998l.submit(new a(iVar));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", (Throwable) null);
        }
        try {
            submit.get(4, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e10);
        } catch (ExecutionException e11) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e12);
        }
    }

    public final void c() {
        this.f12999m.b(new b());
    }

    public final void d(String str, String str2) {
        q qVar = this.g;
        Objects.requireNonNull(qVar);
        try {
            qVar.f12962d.a(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = qVar.f12959a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e10;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", (Throwable) null);
        }
    }
}
