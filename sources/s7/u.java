package s7;

import io.sentry.ITransaction;
import io.sentry.Scope;
import io.sentry.SentryTracer;
import r8.a;
import r8.b;

public final /* synthetic */ class u implements a.C0207a, Scope.IWithTransaction {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Object f10978a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f10979b;

    public /* synthetic */ u(Object obj, Object obj2) {
        this.f10978a = obj;
        this.f10979b = obj2;
    }

    public final void accept(ITransaction iTransaction) {
        ((SentryTracer) this.f10978a).lambda$finish$1((Scope) this.f10979b, iTransaction);
    }

    public final void b(b bVar) {
        ((a.C0207a) this.f10978a).b(bVar);
        ((a.C0207a) this.f10979b).b(bVar);
    }
}
