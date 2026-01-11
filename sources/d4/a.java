package d4;

import android.util.Log;
import d4.d;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final e<Object> f4333a = new C0060a();

    /* renamed from: d4.a$a  reason: collision with other inner class name */
    public class C0060a implements e<Object> {
        public final void a(Object obj) {
        }
    }

    public interface b<T> {
        T a();
    }

    public static final class c<T> implements m0.c<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<T> f4334a;

        /* renamed from: b  reason: collision with root package name */
        public final e<T> f4335b;

        /* renamed from: c  reason: collision with root package name */
        public final m0.c<T> f4336c;

        public c(m0.c<T> cVar, b<T> bVar, e<T> eVar) {
            this.f4336c = cVar;
            this.f4334a = bVar;
            this.f4335b = eVar;
        }

        public final boolean a(T t10) {
            if (t10 instanceof d) {
                ((d.a) ((d) t10).h()).f4337a = true;
            }
            this.f4335b.a(t10);
            return this.f4336c.a(t10);
        }

        public final T b() {
            T b10 = this.f4336c.b();
            if (b10 == null) {
                b10 = this.f4334a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    StringBuilder d10 = a.a.d("Created new ");
                    d10.append(b10.getClass());
                    Log.v("FactoryPools", d10.toString());
                }
            }
            if (b10 instanceof d) {
                ((d.a) ((d) b10).h()).f4337a = false;
            }
            return b10;
        }
    }

    public interface d {
        d h();
    }

    public interface e<T> {
        void a(T t10);
    }

    public static <T extends d> m0.c<T> a(int i, b<T> bVar) {
        return new c(new m0.e(i), bVar, f4333a);
    }
}
