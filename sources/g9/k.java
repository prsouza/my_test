package g9;

import android.support.v4.media.b;
import java.lang.reflect.Method;

public final class k extends b {

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ Method f5312v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ int f5313w;

    public k(Method method, int i) {
        this.f5312v = method;
        this.f5313w = i;
    }

    public final <T> T E(Class<T> cls) {
        b.h(cls);
        return this.f5312v.invoke((Object) null, new Object[]{cls, Integer.valueOf(this.f5313w)});
    }
}
