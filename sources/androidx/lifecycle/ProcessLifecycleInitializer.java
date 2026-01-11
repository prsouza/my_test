package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import n1.b;

public final class ProcessLifecycleInitializer implements b<a0> {
    public final List<Class<? extends b<?>>> a() {
        return Collections.emptyList();
    }

    public final Object b(Context context) {
        if (!x.f2206a.getAndSet(true)) {
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new x.a());
        }
        o0 o0Var = o0.f2150x;
        Objects.requireNonNull(o0Var);
        o0Var.f2155t = new Handler();
        o0Var.f2156u.f(r.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new p0(o0Var));
        return o0Var;
    }
}
