package i8;

import java.util.Collections;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f6398a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, Object> f6399b;

    public c(String str, Map<Class<?>, Object> map) {
        this.f6398a = str;
        this.f6399b = map;
    }

    public static c a(String str) {
        return new c(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (!this.f6398a.equals(cVar.f6398a) || !this.f6399b.equals(cVar.f6399b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6399b.hashCode() + (this.f6398a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("FieldDescriptor{name=");
        d10.append(this.f6398a);
        d10.append(", properties=");
        d10.append(this.f6399b.values());
        d10.append("}");
        return d10.toString();
    }

    public c(String str, Map map, a aVar) {
        this.f6398a = str;
        this.f6399b = map;
    }
}
