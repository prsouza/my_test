package x7;

import com.google.android.gms.tasks.Task;
import h1.d0;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class o0 {

    /* renamed from: a  reason: collision with root package name */
    public static final ExecutorService f12956a = h0.a("awaitEvenIfOnMainThread task continuation executor");

    public static <T> T a(Task<T> task) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f12956a, new d0(countDownLatch, 2));
        countDownLatch.await(4, TimeUnit.SECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        } else if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        } else {
            throw new TimeoutException();
        }
    }
}
