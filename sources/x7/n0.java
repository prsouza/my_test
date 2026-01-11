package x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

public final class n0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f12951a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f12952b;

    public class a implements Continuation<Object, Void> {
        public a() {
        }

        public final Object then(Task task) throws Exception {
            if (task.isSuccessful()) {
                n0.this.f12952b.setResult(task.getResult());
                return null;
            }
            n0.this.f12952b.setException(task.getException());
            return null;
        }
    }

    public n0(Callable callable, TaskCompletionSource taskCompletionSource) {
        this.f12951a = callable;
        this.f12952b = taskCompletionSource;
    }

    public final void run() {
        try {
            ((Task) this.f12951a.call()).continueWith(new a());
        } catch (Exception e10) {
            this.f12952b.setException(e10);
        }
    }
}
