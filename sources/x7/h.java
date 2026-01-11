package x7;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

public final class h implements Continuation<Void, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Callable f12924a;

    public h(Callable callable) {
        this.f12924a = callable;
    }

    public final Object then(Task<Void> task) throws Exception {
        return this.f12924a.call();
    }
}
