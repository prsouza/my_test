package x7;

import android.util.Log;
import java.util.Objects;

public final class s implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f12978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Throwable f12979b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Thread f12980c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ q f12981s;

    public s(q qVar, long j10, Throwable th2, Thread thread) {
        this.f12981s = qVar;
        this.f12978a = j10;
        this.f12979b = th2;
        this.f12980c = thread;
    }

    public final void run() {
        if (!this.f12981s.g()) {
            long j10 = this.f12978a / 1000;
            String f10 = this.f12981s.f();
            if (f10 == null) {
                Log.w("FirebaseCrashlytics", "Tried to write a non-fatal exception while no session was open.", (Throwable) null);
                return;
            }
            l0 l0Var = this.f12981s.f12968l;
            Throwable th2 = this.f12979b;
            Thread thread = this.f12980c;
            Objects.requireNonNull(l0Var);
            String str = "Persisting non-fatal event for session " + f10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str, (Throwable) null);
            }
            l0Var.d(th2, thread, f10, "error", j10, false);
        }
    }
}
