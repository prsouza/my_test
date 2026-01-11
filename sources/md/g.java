package md;

import e6.e;
import java.io.Serializable;

public final class g<T> implements Serializable {

    public static final class a implements Serializable {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f8543a;

        public a(Throwable th2) {
            e.D(th2, "exception");
            this.f8543a = th2;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof a) && e.r(this.f8543a, ((a) obj).f8543a);
        }

        public final int hashCode() {
            return this.f8543a.hashCode();
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("Failure(");
            d10.append(this.f8543a);
            d10.append(')');
            return d10.toString();
        }
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).f8543a;
        }
        return null;
    }
}
