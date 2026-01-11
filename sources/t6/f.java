package t6;

import java.util.Objects;
import java.util.concurrent.ExecutionException;

public final class f {
    public static <ResultT> ResultT a(q qVar) throws ExecutionException, InterruptedException {
        boolean z;
        Objects.requireNonNull(qVar, "Task must not be null");
        synchronized (qVar.f11422a) {
            z = qVar.f11424c;
        }
        if (z) {
            return b(qVar);
        }
        r rVar = new r();
        o oVar = e.f11405b;
        qVar.f11423b.a(new j(oVar, rVar));
        qVar.g();
        qVar.f11423b.a(new h(oVar, rVar));
        qVar.g();
        rVar.f11427a.await();
        return b(qVar);
    }

    public static Object b(q qVar) throws ExecutionException {
        if (qVar.d()) {
            return qVar.c();
        }
        throw new ExecutionException(qVar.b());
    }
}
