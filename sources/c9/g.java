package c9;

import android.text.format.DateUtils;
import b9.f;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.a;
import com.google.firebase.remoteconfig.internal.b;
import h1.h;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public final /* synthetic */ class g implements Continuation {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f3292a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ long f3293b;

    public /* synthetic */ g(a aVar, long j10) {
        this.f3292a = aVar;
        this.f3293b = j10;
    }

    public final Object then(Task task) {
        Task<TContinuationResult> task2;
        boolean z;
        a aVar = this.f3292a;
        long j10 = this.f3293b;
        Objects.requireNonNull(aVar);
        Date date = new Date(aVar.f4237d.currentTimeMillis());
        Date date2 = null;
        if (task.isSuccessful()) {
            b bVar = aVar.f4240h;
            Objects.requireNonNull(bVar);
            Date date3 = new Date(bVar.f4246a.getLong("last_fetch_time_in_millis", -1));
            if (date3.equals(b.f4244d)) {
                z = false;
            } else {
                z = date.before(new Date(TimeUnit.SECONDS.toMillis(j10) + date3.getTime()));
            }
            if (z) {
                return Tasks.forResult(new a.C0053a(2, (f) null, (String) null));
            }
        }
        Date date4 = aVar.f4240h.a().f4250b;
        if (date.before(date4)) {
            date2 = date4;
        }
        if (date2 != null) {
            String format = String.format("Fetch is throttled. Please wait before calling fetch again: %s", new Object[]{DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date2.getTime() - date.getTime()))});
            date2.getTime();
            task2 = Tasks.forException(new f(format));
        } else {
            Task<String> id2 = aVar.f4234a.getId();
            Task a10 = aVar.f4234a.a();
            task2 = Tasks.whenAllComplete((Task<?>[]) new Task[]{id2, a10}).continueWithTask(aVar.f4236c, new h(aVar, id2, a10, date));
        }
        return task2.continueWithTask(aVar.f4236c, new h(aVar, date));
    }
}
