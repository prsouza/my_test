package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e8.c;
import java.util.concurrent.Executor;

public final class o implements SuccessContinuation<c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f12954a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p f12955b;

    public o(p pVar, Executor executor) {
        this.f12955b = pVar;
        this.f12954a = executor;
    }

    public final Task then(Object obj) throws Exception {
        if (((c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", (Throwable) null);
            return Tasks.forResult(null);
        }
        q.b(q.this);
        q.this.f12968l.e(this.f12954a, (String) null);
        q.this.f12972p.trySetResult(null);
        return Tasks.forResult(null);
    }
}
