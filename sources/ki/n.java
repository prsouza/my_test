package ki;

import e6.e;
import ge.k;
import java.lang.reflect.Method;
import java.util.Objects;
import l6.b1;
import md.c;
import p002if.x;

public final class n implements d<Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ k f7616a;

    public n(k kVar) {
        this.f7616a = kVar;
    }

    public final void a(b<Object> bVar, Throwable th2) {
        e.E(bVar, "call");
        e.E(th2, "t");
        this.f7616a.resumeWith(b1.k(th2));
    }

    public final void b(b<Object> bVar, z<Object> zVar) {
        e.E(bVar, "call");
        e.E(zVar, "response");
        if (zVar.a()) {
            T t10 = zVar.f7733b;
            if (t10 == null) {
                x e10 = bVar.e();
                Class<l> cls = l.class;
                Objects.requireNonNull(e10);
                l cast = cls.cast(e10.f6631f.get(cls));
                if (cast != null) {
                    e.A(cast, "call.request().tag(Invocation::class.java)!!");
                    Method method = cast.f7613a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Response from ");
                    e.A(method, "method");
                    Class<?> declaringClass = method.getDeclaringClass();
                    e.A(declaringClass, "method.declaringClass");
                    sb2.append(declaringClass.getName());
                    sb2.append('.');
                    sb2.append(method.getName());
                    sb2.append(" was null but response body type was declared as non-null");
                    this.f7616a.resumeWith(b1.k(new c(sb2.toString())));
                    return;
                }
                c cVar = new c();
                e.W(cVar, e.class.getName());
                throw cVar;
            }
            this.f7616a.resumeWith(t10);
            return;
        }
        this.f7616a.resumeWith(b1.k(new j(zVar)));
    }
}
