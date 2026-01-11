package c9;

import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class e {

    /* renamed from: d  reason: collision with root package name */
    public static final Map<String, e> f3280d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public static final d f3281e = d.f3279a;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3282a;

    /* renamed from: b  reason: collision with root package name */
    public final k f3283b;

    /* renamed from: c  reason: collision with root package name */
    public Task<f> f3284c = null;

    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f3285a = new CountDownLatch(1);

        public final void onCanceled() {
            this.f3285a.countDown();
        }

        public final void onFailure(Exception exc) {
            this.f3285a.countDown();
        }

        public final void onSuccess(TResult tresult) {
            this.f3285a.countDown();
        }
    }

    public e(ExecutorService executorService, k kVar) {
        this.f3282a = executorService;
        this.f3283b = kVar;
    }

    public static <TResult> Object a(Task task) throws ExecutionException, InterruptedException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a aVar = new a();
        d dVar = f3281e;
        task.addOnSuccessListener((Executor) dVar, aVar);
        task.addOnFailureListener((Executor) dVar, (OnFailureListener) aVar);
        task.addOnCanceledListener((Executor) dVar, (OnCanceledListener) aVar);
        if (!aVar.f3285a.await(5, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        } else if (task.isSuccessful()) {
            return task.getResult();
        } else {
            throw new ExecutionException(task.getException());
        }
    }

    public final synchronized Task<f> b() {
        Task<f> task = this.f3284c;
        if (task == null || (task.isComplete() && !this.f3284c.isSuccessful())) {
            ExecutorService executorService = this.f3282a;
            k kVar = this.f3283b;
            Objects.requireNonNull(kVar);
            this.f3284c = Tasks.call(executorService, new c(kVar));
        }
        return this.f3284c;
    }

    public final Task<f> c(f fVar) {
        return Tasks.call(this.f3282a, new b(this, fVar)).onSuccessTask(this.f3282a, new a(this, fVar));
    }
}
