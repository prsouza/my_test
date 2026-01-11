package x7;

import com.google.android.gms.tasks.Task;
import e8.i;
import java.util.concurrent.Callable;

public final class w implements Callable<Task<Void>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ i f12987a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ x f12988b;

    public w(x xVar, i iVar) {
        this.f12988b = xVar;
        this.f12987a = iVar;
    }

    public final Object call() throws Exception {
        return x.a(this.f12988b, this.f12987a);
    }
}
