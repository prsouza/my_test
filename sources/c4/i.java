package c4;

import a.a;
import org.slf4j.helpers.MessageFormatter;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public Class<?> f3241a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f3242b;

    /* renamed from: c  reason: collision with root package name */
    public Class<?> f3243c;

    public i() {
    }

    public final void a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.f3241a = cls;
        this.f3242b = cls2;
        this.f3243c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3241a.equals(iVar.f3241a) && this.f3242b.equals(iVar.f3242b) && j.b(this.f3243c, iVar.f3243c);
    }

    public final int hashCode() {
        int hashCode = (this.f3242b.hashCode() + (this.f3241a.hashCode() * 31)) * 31;
        Class<?> cls = this.f3243c;
        return hashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder d10 = a.d("MultiClassKey{first=");
        d10.append(this.f3241a);
        d10.append(", second=");
        d10.append(this.f3242b);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }

    public i(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        a(cls, cls2, cls3);
    }
}
