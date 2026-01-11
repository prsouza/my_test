package s8;

import a8.a;
import com.github.mikephil.charting.BuildConfig;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import u8.d;

public final class h implements l {

    /* renamed from: a  reason: collision with root package name */
    public final m f11013a;

    /* renamed from: b  reason: collision with root package name */
    public final TaskCompletionSource<j> f11014b;

    public h(m mVar, TaskCompletionSource<j> taskCompletionSource) {
        this.f11013a = mVar;
        this.f11014b = taskCompletionSource;
    }

    public final boolean a(d dVar) {
        if (!dVar.j() || this.f11013a.d(dVar)) {
            return false;
        }
        TaskCompletionSource<j> taskCompletionSource = this.f11014b;
        String a10 = dVar.a();
        Objects.requireNonNull(a10, "Null token");
        Long valueOf = Long.valueOf(dVar.b());
        Long valueOf2 = Long.valueOf(dVar.g());
        String str = valueOf == null ? " tokenExpirationTimestamp" : BuildConfig.FLAVOR;
        if (valueOf2 == null) {
            str = a.c(str, " tokenCreationTimestamp");
        }
        if (str.isEmpty()) {
            taskCompletionSource.setResult(new a(a10, valueOf.longValue(), valueOf2.longValue()));
            return true;
        }
        throw new IllegalStateException(a.c("Missing required properties:", str));
    }

    public final boolean b(Exception exc) {
        this.f11014b.trySetException(exc);
        return true;
    }
}
