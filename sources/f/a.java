package f;

import android.content.Context;
import android.content.Intent;

public abstract class a<I, O> {

    /* renamed from: f.a$a  reason: collision with other inner class name */
    public static final class C0073a<T> {

        /* renamed from: a  reason: collision with root package name */
        public final T f4863a;

        public C0073a(T t10) {
            this.f4863a = t10;
        }
    }

    public abstract Intent a(Object obj);

    public C0073a<O> b(Context context, I i) {
        return null;
    }

    public abstract O c(int i, Intent intent);
}
