package ki;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import ki.c;

public final class e extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final e f7583a = new e();

    public static final class a<R> implements c<R, CompletableFuture<R>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f7584a;

        /* renamed from: ki.e$a$a  reason: collision with other inner class name */
        public class C0137a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<R> f7585a;

            public C0137a(CompletableFuture<R> completableFuture) {
                this.f7585a = completableFuture;
            }

            public final void a(b<R> bVar, Throwable th2) {
                this.f7585a.completeExceptionally(th2);
            }

            public final void b(b<R> bVar, z<R> zVar) {
                if (zVar.a()) {
                    this.f7585a.complete(zVar.f7733b);
                } else {
                    this.f7585a.completeExceptionally(new j(zVar));
                }
            }
        }

        public a(Type type) {
            this.f7584a = type;
        }

        public final Type a() {
            return this.f7584a;
        }

        public final Object b(b bVar) {
            b bVar2 = new b(bVar);
            ((r) bVar).t(new C0137a(bVar2));
            return bVar2;
        }
    }

    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: a  reason: collision with root package name */
        public final b<?> f7586a;

        public b(b<?> bVar) {
            this.f7586a = bVar;
        }

        public final boolean cancel(boolean z) {
            if (z) {
                this.f7586a.cancel();
            }
            return super.cancel(z);
        }
    }

    public static final class c<R> implements c<R, CompletableFuture<z<R>>> {

        /* renamed from: a  reason: collision with root package name */
        public final Type f7587a;

        public class a implements d<R> {

            /* renamed from: a  reason: collision with root package name */
            public final CompletableFuture<z<R>> f7588a;

            public a(CompletableFuture<z<R>> completableFuture) {
                this.f7588a = completableFuture;
            }

            public final void a(b<R> bVar, Throwable th2) {
                this.f7588a.completeExceptionally(th2);
            }

            public final void b(b<R> bVar, z<R> zVar) {
                this.f7588a.complete(zVar);
            }
        }

        public c(Type type) {
            this.f7587a = type;
        }

        public final Type a() {
            return this.f7587a;
        }

        public final Object b(b bVar) {
            b bVar2 = new b(bVar);
            ((r) bVar).t(new a(bVar2));
            return bVar2;
        }
    }

    public final c a(Type type, Annotation[] annotationArr) {
        if (e0.f(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type e10 = e0.e(0, (ParameterizedType) type);
            if (e0.f(e10) != z.class) {
                return new a(e10);
            }
            if (e10 instanceof ParameterizedType) {
                return new c(e0.e(0, (ParameterizedType) e10));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
