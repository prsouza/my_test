package b9;

import a5.m;
import c9.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Objects;

public final /* synthetic */ class a implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ c f2906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f2907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f2908c;

    public /* synthetic */ a(c cVar, Task task, Task task2) {
        this.f2906a = cVar;
        this.f2907b = task;
        this.f2908c = task2;
    }

    public final Object then(Task task) {
        c cVar = this.f2906a;
        Task task2 = this.f2907b;
        Task task3 = this.f2908c;
        Objects.requireNonNull(cVar);
        if (!task2.isSuccessful() || task2.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        f fVar = (f) task2.getResult();
        if (task3.isSuccessful()) {
            f fVar2 = (f) task3.getResult();
            if (!(fVar2 == null || !fVar.f3289c.equals(fVar2.f3289c))) {
                return Tasks.forResult(Boolean.FALSE);
            }
        }
        return cVar.f2916e.c(fVar).continueWith(cVar.f2914c, new m(cVar, 2));
    }
}
