package x7;

import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import e8.c;
import java.util.concurrent.Executor;

public final class l implements SuccessContinuation<c, Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Executor f12935a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f12936b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ m f12937c;

    public l(m mVar, Executor executor, String str) {
        this.f12937c = mVar;
        this.f12935a = executor;
        this.f12936b = str;
    }

    public final Task then(Object obj) throws Exception {
        String str = null;
        if (((c) obj) == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", (Throwable) null);
            return Tasks.forResult(null);
        }
        Task[] taskArr = new Task[2];
        taskArr[0] = q.b(this.f12937c.f12948f);
        m mVar = this.f12937c;
        l0 l0Var = mVar.f12948f.f12968l;
        Executor executor = this.f12935a;
        if (mVar.f12947e) {
            str = this.f12936b;
        }
        taskArr[1] = l0Var.e(executor, str);
        return Tasks.whenAll((Task<?>[]) taskArr);
    }
}
