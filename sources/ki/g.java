package ki;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import ki.i;

public final class g implements c<Object, b<?>> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Type f7596a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Executor f7597b;

    public g(Type type, Executor executor) {
        this.f7596a = type;
        this.f7597b = executor;
    }

    public final Type a() {
        return this.f7596a;
    }

    public final Object b(b bVar) {
        Executor executor = this.f7597b;
        return executor == null ? bVar : new i.a(executor, bVar);
    }
}
