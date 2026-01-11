package o9;

public final class a<T> implements cc.a<T> {

    /* renamed from: c  reason: collision with root package name */
    public static final Object f9372c = new Object();

    /* renamed from: a  reason: collision with root package name */
    public volatile cc.a<T> f9373a;

    /* renamed from: b  reason: collision with root package name */
    public volatile Object f9374b = f9372c;

    public a(cc.a<T> aVar) {
        this.f9373a = aVar;
    }

    public static <P extends cc.a<T>, T> cc.a<T> a(P p10) {
        if (p10 instanceof a) {
            return p10;
        }
        return new a(p10);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f9372c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public final T get() {
        T t10 = this.f9374b;
        T t11 = f9372c;
        if (t10 == t11) {
            synchronized (this) {
                t10 = this.f9374b;
                if (t10 == t11) {
                    t10 = this.f9373a.get();
                    b(this.f9374b, t10);
                    this.f9374b = t10;
                    this.f9373a = null;
                }
            }
        }
        return t10;
    }
}
