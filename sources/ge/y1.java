package ge;

public final class y1 {

    /* renamed from: a  reason: collision with root package name */
    public static final y1 f5472a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadLocal<u0> f5473b = new ThreadLocal<>();

    public static final u0 a() {
        ThreadLocal<u0> threadLocal = f5473b;
        u0 u0Var = threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        f fVar = new f(Thread.currentThread());
        threadLocal.set(fVar);
        return fVar;
    }
}
