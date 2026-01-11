package x8;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

public final /* synthetic */ class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ v f13136a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f13137b;

    public /* synthetic */ u(v vVar, TaskCompletionSource taskCompletionSource) {
        this.f13136a = vVar;
        this.f13137b = taskCompletionSource;
    }

    public final void run() {
        v vVar = this.f13136a;
        TaskCompletionSource taskCompletionSource = this.f13137b;
        Objects.requireNonNull(vVar);
        try {
            taskCompletionSource.setResult(vVar.a());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }
}
