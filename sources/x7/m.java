package x7;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e8.f;
import e8.i;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class m implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12943a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f12944b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f12945c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ i f12946d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ boolean f12947e = false;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f12948f;

    public m(q qVar, long j10, Throwable th2, Thread thread, i iVar) {
        this.f12948f = qVar;
        this.f12943a = j10;
        this.f12944b = th2;
        this.f12945c = thread;
        this.f12946d = iVar;
    }

    public final Object call() throws Exception {
        long j10 = this.f12943a / 1000;
        String f10 = this.f12948f.f();
        if (f10 == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", (Throwable) null);
            return Tasks.forResult(null);
        }
        this.f12948f.f12961c.a();
        l0 l0Var = this.f12948f.f12968l;
        Throwable th2 = this.f12944b;
        Thread thread = this.f12945c;
        Objects.requireNonNull(l0Var);
        String str = "Persisting fatal event for session " + f10;
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", str, (Throwable) null);
        }
        l0Var.d(th2, thread, f10, AppMeasurement.CRASH_ORIGIN, j10, true);
        this.f12948f.d(this.f12943a);
        this.f12948f.c(false, this.f12946d);
        q qVar = this.f12948f;
        new d(this.f12948f.f12964f);
        q.a(qVar, d.f12901b);
        if (!this.f12948f.f12960b.a()) {
            return Tasks.forResult(null);
        }
        Executor executor = this.f12948f.f12963e.f12911a;
        return ((f) this.f12946d).i.get().getTask().onSuccessTask(executor, new l(this, executor, f10));
    }
}
