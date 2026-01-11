package a5;

import android.content.Context;
import cc.a;
import java.util.Objects;

public final class g implements a {

    /* renamed from: a  reason: collision with root package name */
    public final a<Context> f85a;

    public g(a<Context> aVar) {
        this.f85a = aVar;
    }

    public final Object get() {
        String packageName = this.f85a.get().getPackageName();
        Objects.requireNonNull(packageName, "Cannot return null from a non-@Nullable @Provides method");
        return packageName;
    }
}
