package g9;

import android.support.v4.media.b;
import java.lang.reflect.Method;

public final class j extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Method f5310v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f5311w;

    public j(Method method, Object obj) {
        this.f5310v = method;
        this.f5311w = obj;
    }

    public final <T> T E(Class<T> cls) {
        b.h(cls);
        return this.f5310v.invoke(this.f5311w, new Object[]{cls});
    }
}
