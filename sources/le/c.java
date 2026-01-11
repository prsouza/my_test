package le;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final Method f8234a;

    static {
        Method method;
        Class<ScheduledThreadPoolExecutor> cls = ScheduledThreadPoolExecutor.class;
        try {
            method = cls.getMethod("setRemoveOnCancelPolicy", new Class[]{Boolean.TYPE});
        } catch (Throwable unused) {
            method = null;
        }
        f8234a = method;
    }
}
