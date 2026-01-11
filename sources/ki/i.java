package ki;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;
import ki.c;
import p002if.x;

public final class i extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f7601a;

    public static final class a<T> implements b<T> {

        /* renamed from: a  reason: collision with root package name */
        public final Executor f7602a;

        /* renamed from: b  reason: collision with root package name */
        public final b<T> f7603b;

        /* renamed from: ki.i$a$a  reason: collision with other inner class name */
        public class C0138a implements d<T> {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ d f7604a;

            public C0138a(d dVar) {
                this.f7604a = dVar;
            }

            public final void a(b<T> bVar, Throwable th2) {
                a.this.f7602a.execute(new h(this, this.f7604a, th2));
            }

            public final void b(b<T> bVar, z<T> zVar) {
                a.this.f7602a.execute(new c9.i(this, this.f7604a, zVar, 1));
            }
        }

        public a(Executor executor, b<T> bVar) {
            this.f7602a = executor;
            this.f7603b = bVar;
        }

        public final void cancel() {
            this.f7603b.cancel();
        }

        public final Object clone() throws CloneNotSupportedException {
            return new a(this.f7602a, this.f7603b.clone());
        }

        public final x e() {
            return this.f7603b.e();
        }

        public final boolean f() {
            return this.f7603b.f();
        }

        public final void t(d<T> dVar) {
            this.f7603b.t(new C0138a(dVar));
        }

        /* renamed from: clone  reason: collision with other method in class */
        public final b<T> m12clone() {
            return new a(this.f7602a, this.f7603b.clone());
        }
    }

    public i(Executor executor) {
        this.f7601a = executor;
    }

    public final c a(Type type, Annotation[] annotationArr) {
        Executor executor = null;
        if (e0.f(type) != b.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = e0.e(0, (ParameterizedType) type);
            if (!e0.i(annotationArr, c0.class)) {
                executor = this.f7601a;
            }
            return new g(e10, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
