package l8;

import java.lang.annotation.Annotation;
import l8.d;

public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final int f8125a;

    /* renamed from: b  reason: collision with root package name */
    public final d.a f8126b;

    public a(int i, d.a aVar) {
        this.f8125a = i;
        this.f8126b = aVar;
    }

    public final Class<? extends Annotation> annotationType() {
        return d.class;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f8125a != ((a) dVar).f8125a || !this.f8126b.equals(((a) dVar).f8126b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f8125a ^ 14552422) + (this.f8126b.hashCode() ^ 2041407134);
    }

    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf" + '(' + "tag=" + this.f8125a + "intEncoding=" + this.f8126b + ')';
    }
}
