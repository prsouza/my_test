package ki;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public interface c<R, T> {

    public static abstract class a {
        public abstract c a(Type type, Annotation[] annotationArr);
    }

    Type a();

    T b(b<R> bVar);
}
