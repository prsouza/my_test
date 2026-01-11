package x8;

import a5.l;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;
import java.util.concurrent.Executor;
import x8.r0;

public final class p0 extends Binder {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f13113b = 0;

    /* renamed from: a  reason: collision with root package name */
    public final a f13114a;

    public interface a {
    }

    public p0(a aVar) {
        this.f13114a = aVar;
    }

    public final void a(r0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            a aVar2 = this.f13114a;
            Intent intent = aVar.f13125a;
            j jVar = j.this;
            Objects.requireNonNull(jVar);
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            jVar.f13063a.execute(new h(jVar, intent, taskCompletionSource));
            taskCompletionSource.getTask().addOnCompleteListener((Executor) i.f13056c, new l(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}
