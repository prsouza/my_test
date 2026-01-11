package k8;

import android.util.Base64;
import android.util.JsonWriter;
import i8.b;
import i8.c;
import i8.d;
import i8.e;
import i8.g;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

public final class f implements e, g {

    /* renamed from: a  reason: collision with root package name */
    public boolean f7481a = true;

    /* renamed from: b  reason: collision with root package name */
    public final JsonWriter f7482b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<Class<?>, d<?>> f7483c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Class<?>, i8.f<?>> f7484d;

    /* renamed from: e  reason: collision with root package name */
    public final d<Object> f7485e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f7486f;

    public f(Writer writer, Map<Class<?>, d<?>> map, Map<Class<?>, i8.f<?>> map2, d<Object> dVar, boolean z) {
        this.f7482b = new JsonWriter(writer);
        this.f7483c = map;
        this.f7484d = map2;
        this.f7485e = dVar;
        this.f7486f = z;
    }

    public final e a(c cVar, Object obj) throws IOException {
        return h(cVar.f6398a, obj);
    }

    public final g b(String str) throws IOException {
        i();
        this.f7482b.value(str);
        return this;
    }

    public final e c(c cVar, long j10) throws IOException {
        String str = cVar.f6398a;
        i();
        this.f7482b.name(str);
        i();
        this.f7482b.value(j10);
        return this;
    }

    public final g d(boolean z) throws IOException {
        i();
        this.f7482b.value(z);
        return this;
    }

    public final e e(c cVar, int i) throws IOException {
        String str = cVar.f6398a;
        i();
        this.f7482b.name(str);
        i();
        this.f7482b.value((long) i);
        return this;
    }

    public final e f(c cVar, boolean z) throws IOException {
        String str = cVar.f6398a;
        i();
        this.f7482b.name(str);
        i();
        this.f7482b.value(z);
        return this;
    }

    public final f g(Object obj) throws IOException {
        if (obj == null) {
            this.f7482b.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.f7482b.value((Number) obj);
            return this;
        } else {
            int i = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    i();
                    this.f7482b.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.f7482b.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i < length) {
                        this.f7482b.value((long) iArr[i]);
                        i++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i < length2) {
                        long j10 = jArr[i];
                        i();
                        this.f7482b.value(j10);
                        i++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i < length3) {
                        this.f7482b.value(dArr[i]);
                        i++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i < length4) {
                        this.f7482b.value(zArr[i]);
                        i++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i < length5) {
                        g(numberArr[i]);
                        i++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i < length6) {
                        g(objArr[i]);
                        i++;
                    }
                }
                this.f7482b.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.f7482b.beginArray();
                for (Object g : (Collection) obj) {
                    g(g);
                }
                this.f7482b.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.f7482b.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        h((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e10);
                    }
                }
                this.f7482b.endObject();
                return this;
            } else {
                d dVar = this.f7483c.get(obj.getClass());
                if (dVar != null) {
                    this.f7482b.beginObject();
                    dVar.a(obj, this);
                    this.f7482b.endObject();
                    return this;
                }
                i8.f fVar = this.f7484d.get(obj.getClass());
                if (fVar != null) {
                    fVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    i();
                    this.f7482b.value(name);
                    return this;
                } else {
                    d<Object> dVar2 = this.f7485e;
                    this.f7482b.beginObject();
                    dVar2.a(obj, this);
                    this.f7482b.endObject();
                    return this;
                }
            }
        }
    }

    public final f h(String str, Object obj) throws IOException {
        if (!this.f7486f) {
            i();
            this.f7482b.name(str);
            if (obj != null) {
                return g(obj);
            }
            this.f7482b.nullValue();
            return this;
        } else if (obj == null) {
            return this;
        } else {
            i();
            this.f7482b.name(str);
            return g(obj);
        }
    }

    public final void i() throws IOException {
        if (!this.f7481a) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
