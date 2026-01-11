package g9;

import android.support.v4.media.b;
import java.lang.reflect.Method;

public final class l extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Method f5314v;

    public l(Method method) {
        this.f5314v = method;
    }

    public final <T> T E(Class<T> cls) {
        b.h(cls);
        return this.f5314v.invoke((Object) null, new Object[]{cls, Object.class});
    }
}
