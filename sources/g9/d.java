package g9;

import aa.c;
import i2.a0;
import i2.b;
import i2.j;
import i2.z;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class d implements a0, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    public static final d f5274c = new d();

    /* renamed from: a  reason: collision with root package name */
    public List<b> f5275a = Collections.emptyList();

    /* renamed from: b  reason: collision with root package name */
    public List<b> f5276b = Collections.emptyList();

    public class a extends z<T> {

        /* renamed from: a  reason: collision with root package name */
        public z<T> f5277a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f5278b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ boolean f5279c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ j f5280d;

        /* renamed from: e  reason: collision with root package name */
        public final /* synthetic */ x9.a f5281e;

        public a(boolean z, boolean z10, j jVar, x9.a aVar) {
            this.f5278b = z;
            this.f5279c = z10;
            this.f5280d = jVar;
            this.f5281e = aVar;
        }

        public final T read(aa.a aVar) {
            if (this.f5278b) {
                aVar.D0();
                return null;
            }
            z<T> zVar = this.f5277a;
            if (zVar == null) {
                zVar = this.f5280d.b(d.this, this.f5281e);
                this.f5277a = zVar;
            }
            return zVar.read(aVar);
        }

        public final void write(c cVar, T t10) {
            if (this.f5279c) {
                cVar.f0();
                return;
            }
            z<T> zVar = this.f5277a;
            if (zVar == null) {
                zVar = this.f5280d.b(d.this, this.f5281e);
                this.f5277a = zVar;
            }
            zVar.write(cVar, t10);
        }
    }

    public final boolean a(Class<?> cls) {
        return !Enum.class.isAssignableFrom(cls) && (cls.isAnonymousClass() || cls.isLocalClass());
    }

    public final boolean b(Class<?> cls, boolean z) {
        for (b b10 : z ? this.f5275a : this.f5276b) {
            if (b10.b()) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Field field, boolean z) {
        if ((field.getModifiers() & 136) != 0 || field.isSynthetic() || a(field.getType())) {
            return true;
        }
        List<b> list = z ? this.f5275a : this.f5276b;
        if (list.isEmpty()) {
            return false;
        }
        Objects.requireNonNull(field);
        for (b a10 : list) {
            if (a10.a()) {
                return true;
            }
        }
        return false;
    }

    public final Object clone() {
        try {
            return (d) super.clone();
        } catch (CloneNotSupportedException e10) {
            throw new AssertionError(e10);
        }
    }

    public final <T> z<T> create(j jVar, x9.a<T> aVar) {
        Class<? super T> cls = aVar.f13148a;
        boolean a10 = a(cls);
        boolean z = a10 || b(cls, true);
        boolean z10 = a10 || b(cls, false);
        if (z || z10) {
            return new a(z10, z, jVar, aVar);
        }
        return null;
    }
}
