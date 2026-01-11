package l6;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import e6.e;
import j0.d;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import mf.j;
import o6.z;
import v7.a;

public final class a2 implements z, a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f7785a;

    public /* synthetic */ a2(Object obj) {
        this.f7785a = obj;
    }

    public void c(Bundle bundle) {
        ((o7.a) this.f7785a).g("clx", "_ae", bundle);
    }

    public /* bridge */ /* synthetic */ Object zza() {
        return new z1(((u2) ((z) this.f7785a)).a());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(int i) {
        this();
        Handler handler;
        Handler handler2;
        if (i != 1) {
            Looper mainLooper = Looper.getMainLooper();
            if (Build.VERSION.SDK_INT >= 28) {
                handler = d.a(mainLooper);
            } else {
                Class<Handler> cls = Handler.class;
                try {
                    handler2 = cls.getDeclaredConstructor(new Class[]{Looper.class, Handler.Callback.class, Boolean.TYPE}).newInstance(new Object[]{mainLooper, null, Boolean.TRUE});
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException e10) {
                    Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e10);
                    handler2 = new Handler(mainLooper);
                } catch (InvocationTargetException e11) {
                    Throwable cause = e11.getCause();
                    if (cause instanceof RuntimeException) {
                        throw ((RuntimeException) cause);
                    } else if (cause instanceof Error) {
                        throw ((Error) cause);
                    } else {
                        throw new RuntimeException(cause);
                    }
                }
                handler = handler2;
            }
            this.f7785a = handler;
            return;
        }
        TimeUnit timeUnit = TimeUnit.MINUTES;
    }

    public /* synthetic */ a2() {
        e.D(TimeUnit.MINUTES, "timeUnit");
        this.f7785a = new j(lf.d.f8287h);
    }
}
