package s8;

import com.google.android.gms.tasks.TaskCompletionSource;
import u8.c;
import u8.d;

public final class i implements l {

    /* renamed from: a  reason: collision with root package name */
    public final TaskCompletionSource<String> f11015a;

    public i(TaskCompletionSource<String> taskCompletionSource) {
        this.f11015a = taskCompletionSource;
    }

    public final boolean a(d dVar) {
        if (!(dVar.f() == c.a.UNREGISTERED) && !dVar.j() && !dVar.h()) {
            return false;
        }
        this.f11015a.trySetResult(dVar.c());
        return true;
    }

    public final boolean b(Exception exc) {
        return false;
    }
}
