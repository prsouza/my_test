package c9;

import b9.d;
import b9.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import h1.d0;
import java.util.Date;
import java.util.Objects;
import s8.j;

public final /* synthetic */ class h implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f3294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Task f3295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Task f3296c;

    /* renamed from: s  reason: collision with root package name */
    public final /* synthetic */ Date f3297s;

    public /* synthetic */ h(a aVar, Task task, Task task2, Date date) {
        this.f3294a = aVar;
        this.f3295b = task;
        this.f3296c = task2;
        this.f3297s = date;
    }

    public final Object then(Task task) {
        a aVar = this.f3294a;
        Task task2 = this.f3295b;
        Task task3 = this.f3296c;
        Date date = this.f3297s;
        Objects.requireNonNull(aVar);
        if (!task2.isSuccessful()) {
            return Tasks.forException(new d("Firebase Installations failed to get installation ID for fetch.", task2.getException()));
        }
        if (!task3.isSuccessful()) {
            return Tasks.forException(new d("Firebase Installations failed to get installation auth token for fetch.", task3.getException()));
        }
        try {
            a.C0053a a10 = aVar.a((String) task2.getResult(), ((j) task3.getResult()).a(), date);
            if (a10.f4241a != 0) {
                return Tasks.forResult(a10);
            }
            return aVar.f4239f.c(a10.f4242b).onSuccessTask(aVar.f4236c, new d0(a10, 4));
        } catch (e e10) {
            return Tasks.forException(e10);
        }
    }
}
