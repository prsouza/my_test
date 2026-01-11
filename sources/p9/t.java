package p9;

import a.b;
import aa.c;
import androidx.activity.result.d;
import i2.a0;
import i2.j;
import i2.x;
import i2.z;

public final class t implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Class f9812a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f9813b;

    public class a extends z<Object> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Class f9814a;

        public a(Class cls) {
            this.f9814a = cls;
        }

        public final Object read(aa.a aVar) {
            Object read = t.this.f9813b.read(aVar);
            if (read == null || this.f9814a.isInstance(read)) {
                return read;
            }
            StringBuilder q10 = b.q("Expected a ");
            q10.append(this.f9814a.getName());
            q10.append(" but was ");
            q10.append(read.getClass().getName());
            throw new x(q10.toString());
        }

        public final void write(c cVar, Object obj) {
            t.this.f9813b.write(cVar, obj);
        }
    }

    public t(Class cls, z zVar) {
        this.f9812a = cls;
        this.f9813b = zVar;
    }

    public final <T2> z<T2> create(j jVar, x9.a<T2> aVar) {
        Class<? super T> cls = aVar.f13148a;
        if (!this.f9812a.isAssignableFrom(cls)) {
            return null;
        }
        return new a(cls);
    }

    public final String toString() {
        StringBuilder q10 = b.q("Factory[typeHierarchy=");
        d.h(this.f9812a, q10, ",adapter=");
        q10.append(this.f9813b);
        q10.append("]");
        return q10.toString();
    }
}
