package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.lifecycle.r;
import java.util.Objects;

public class d0 extends Service implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final t0 f2096a = new t0(this);

    public final r getLifecycle() {
        return this.f2096a.f2184a;
    }

    public final IBinder onBind(Intent intent) {
        t0 t0Var = this.f2096a;
        Objects.requireNonNull(t0Var);
        t0Var.a(r.b.ON_START);
        return null;
    }

    public void onCreate() {
        t0 t0Var = this.f2096a;
        Objects.requireNonNull(t0Var);
        t0Var.a(r.b.ON_CREATE);
        super.onCreate();
    }

    public void onDestroy() {
        t0 t0Var = this.f2096a;
        Objects.requireNonNull(t0Var);
        t0Var.a(r.b.ON_STOP);
        t0Var.a(r.b.ON_DESTROY);
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        t0 t0Var = this.f2096a;
        Objects.requireNonNull(t0Var);
        t0Var.a(r.b.ON_START);
        super.onStart(intent, i);
    }

    public int onStartCommand(Intent intent, int i, int i10) {
        return super.onStartCommand(intent, i, i10);
    }
}
