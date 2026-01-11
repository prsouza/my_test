package a7;

import a7.q;
import java.security.GeneralSecurityException;
import java.util.Set;

public final class o implements q.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ g f160a;

    public o(g gVar) {
        this.f160a = gVar;
    }

    public final <Q> d<Q> a(Class<Q> cls) throws GeneralSecurityException {
        try {
            return new e(this.f160a, cls);
        } catch (IllegalArgumentException e10) {
            throw new GeneralSecurityException("Primitive type not supported", e10);
        }
    }

    public final d<?> b() {
        g gVar = this.f160a;
        return new e(gVar, gVar.f146c);
    }

    public final Class<?> c() {
        return this.f160a.getClass();
    }

    public final Set<Class<?>> d() {
        return this.f160a.f145b.keySet();
    }
}
