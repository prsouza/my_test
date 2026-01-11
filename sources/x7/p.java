package x7;

import android.util.Log;
import c8.e;
import c8.f;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import x7.q;

public final class p implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Boolean f12957a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.a f12958b;

    public p(q.a aVar, Boolean bool) {
        this.f12958b = aVar;
        this.f12957a = bool;
    }

    public final Object call() throws Exception {
        if (!this.f12957a.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", (Throwable) null);
            }
            f fVar = q.this.g;
            for (File delete : f.i(fVar.f3268a.listFiles(j.f12932a))) {
                delete.delete();
            }
            e eVar = q.this.f12968l.f12939b;
            eVar.a(eVar.f3266b.d());
            eVar.a(eVar.f3266b.c());
            eVar.a(eVar.f3266b.b());
            q.this.f12972p.trySetResult(null);
            return Tasks.forResult(null);
        }
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Sending cached crash reports...", (Throwable) null);
        }
        boolean booleanValue = this.f12957a.booleanValue();
        d0 d0Var = q.this.f12960b;
        Objects.requireNonNull(d0Var);
        if (booleanValue) {
            d0Var.f12907f.trySetResult(null);
            q.a aVar = this.f12958b;
            Executor executor = q.this.f12963e.f12911a;
            return aVar.f12973a.onSuccessTask(executor, new o(this, executor));
        }
        throw new IllegalStateException("An invalid data collection token was used.");
    }
}
