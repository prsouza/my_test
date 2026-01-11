package ki;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import ki.f;
import p002if.b0;

public final class s extends f.a {

    /* renamed from: a  reason: collision with root package name */
    public static final s f7640a = new s();

    public static final class a<T> implements f<b0, Optional<T>> {

        /* renamed from: a  reason: collision with root package name */
        public final f<b0, T> f7641a;

        public a(f<b0, T> fVar) {
            this.f7641a = fVar;
        }

        public final Object a(Object obj) throws IOException {
            return Optional.ofNullable(this.f7641a.a((b0) obj));
        }
    }

    public final f<b0, ?> b(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (e0.f(type) != Optional.class) {
            return null;
        }
        return new a(a0Var.e(e0.e(0, (ParameterizedType) type), annotationArr));
    }
}
