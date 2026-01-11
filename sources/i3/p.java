package i3;

import a.a;
import g3.f;
import g3.h;
import g3.l;
import java.security.MessageDigest;
import java.util.Map;
import java.util.Objects;
import org.slf4j.helpers.MessageFormatter;

public final class p implements f {

    /* renamed from: b  reason: collision with root package name */
    public final Object f6127b;

    /* renamed from: c  reason: collision with root package name */
    public final int f6128c;

    /* renamed from: d  reason: collision with root package name */
    public final int f6129d;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?> f6130e;

    /* renamed from: f  reason: collision with root package name */
    public final Class<?> f6131f;
    public final f g;

    /* renamed from: h  reason: collision with root package name */
    public final Map<Class<?>, l<?>> f6132h;
    public final h i;

    /* renamed from: j  reason: collision with root package name */
    public int f6133j;

    public p(Object obj, f fVar, int i10, int i11, Map<Class<?>, l<?>> map, Class<?> cls, Class<?> cls2, h hVar) {
        Objects.requireNonNull(obj, "Argument must not be null");
        this.f6127b = obj;
        Objects.requireNonNull(fVar, "Signature must not be null");
        this.g = fVar;
        this.f6128c = i10;
        this.f6129d = i11;
        Objects.requireNonNull(map, "Argument must not be null");
        this.f6132h = map;
        Objects.requireNonNull(cls, "Resource class must not be null");
        this.f6130e = cls;
        Objects.requireNonNull(cls2, "Transcode class must not be null");
        this.f6131f = cls2;
        Objects.requireNonNull(hVar, "Argument must not be null");
        this.i = hVar;
    }

    public final void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (!this.f6127b.equals(pVar.f6127b) || !this.g.equals(pVar.g) || this.f6129d != pVar.f6129d || this.f6128c != pVar.f6128c || !this.f6132h.equals(pVar.f6132h) || !this.f6130e.equals(pVar.f6130e) || !this.f6131f.equals(pVar.f6131f) || !this.i.equals(pVar.i)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        if (this.f6133j == 0) {
            int hashCode = this.f6127b.hashCode();
            this.f6133j = hashCode;
            int hashCode2 = ((((this.g.hashCode() + (hashCode * 31)) * 31) + this.f6128c) * 31) + this.f6129d;
            this.f6133j = hashCode2;
            int hashCode3 = this.f6132h.hashCode() + (hashCode2 * 31);
            this.f6133j = hashCode3;
            int hashCode4 = this.f6130e.hashCode() + (hashCode3 * 31);
            this.f6133j = hashCode4;
            int hashCode5 = this.f6131f.hashCode() + (hashCode4 * 31);
            this.f6133j = hashCode5;
            this.f6133j = this.i.hashCode() + (hashCode5 * 31);
        }
        return this.f6133j;
    }

    public final String toString() {
        StringBuilder d10 = a.d("EngineKey{model=");
        d10.append(this.f6127b);
        d10.append(", width=");
        d10.append(this.f6128c);
        d10.append(", height=");
        d10.append(this.f6129d);
        d10.append(", resourceClass=");
        d10.append(this.f6130e);
        d10.append(", transcodeClass=");
        d10.append(this.f6131f);
        d10.append(", signature=");
        d10.append(this.g);
        d10.append(", hashCode=");
        d10.append(this.f6133j);
        d10.append(", transformations=");
        d10.append(this.f6132h);
        d10.append(", options=");
        d10.append(this.i);
        d10.append(MessageFormatter.DELIM_STOP);
        return d10.toString();
    }
}
