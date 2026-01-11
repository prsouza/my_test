package ua;

public abstract class e<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f11771a;

    /* renamed from: b  reason: collision with root package name */
    public final String f11772b = null;

    public static final class a<T> extends e<T> {

        /* renamed from: c  reason: collision with root package name */
        public final boolean f11773c;

        public a() {
            this(true);
        }

        public a(boolean z) {
            super((Object) null);
            this.f11773c = z;
        }
    }

    public static final class b<T> extends e<T> {
        public b() {
            super((Object) null);
        }

        public b(T t10) {
            super(t10);
        }
    }

    public e(Object obj) {
        this.f11771a = obj;
    }
}
