package t7;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import x7.n0;
import x7.o0;
import x7.w;
import x7.x;

public final class f implements Callable<Void> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ boolean f11435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f11436b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ e8.f f11437c;

    public f(boolean z, x xVar, e8.f fVar) {
        this.f11435a = z;
        this.f11436b = xVar;
        this.f11437c = fVar;
    }

    public final Object call() throws Exception {
        if (!this.f11435a) {
            return null;
        }
        x xVar = this.f11436b;
        e8.f fVar = this.f11437c;
        ExecutorService executorService = xVar.f12998l;
        w wVar = new w(xVar, fVar);
        ExecutorService executorService2 = o0.f12956a;
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executorService.execute(new n0(wVar, taskCompletionSource));
        taskCompletionSource.getTask();
        return null;
    }
}
