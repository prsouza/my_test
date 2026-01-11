package g9;

import ah.v;
import c3.k;
import ge.g0;
import i2.l;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.EnumSet;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import m3.c;
import p1.r;
import z3.f;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final Map<Type, l<?>> f5267a;

    /* renamed from: b  reason: collision with root package name */
    public final u9.b f5268b = u9.b.f11746a;

    public class a implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f5269a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f5270b;

        public a(l lVar, Type type) {
            this.f5269a = lVar;
            this.f5270b = type;
        }

        public final T a() {
            return this.f5269a.a();
        }
    }

    /* renamed from: g9.b$b  reason: collision with other inner class name */
    public class C0086b implements h<T> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ l f5271a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Type f5272b;

        public C0086b(l lVar, Type type) {
            this.f5271a = lVar;
            this.f5272b = type;
        }

        public final T a() {
            return this.f5271a.a();
        }
    }

    public b(Map<Type, l<?>> map) {
        this.f5267a = map;
    }

    public final <T> h<T> a(x9.a<T> aVar) {
        r rVar;
        Type type = aVar.f13149b;
        Class<? super T> cls = aVar.f13148a;
        l lVar = this.f5267a.get(type);
        if (lVar != null) {
            return new a(lVar, type);
        }
        l lVar2 = this.f5267a.get(cls);
        if (lVar2 != null) {
            return new C0086b(lVar2, type);
        }
        h<T> hVar = null;
        try {
            Constructor<? super T> declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                this.f5268b.a(declaredConstructor);
            }
            rVar = new r(declaredConstructor);
        } catch (NoSuchMethodException unused) {
            rVar = null;
        }
        if (rVar != null) {
            return rVar;
        }
        if (Collection.class.isAssignableFrom(cls)) {
            hVar = SortedSet.class.isAssignableFrom(cls) ? new v(this) : EnumSet.class.isAssignableFrom(cls) ? new c(type) : Set.class.isAssignableFrom(cls) ? new a.b(this) : Queue.class.isAssignableFrom(cls) ? new g4.a(this) : new g0(this);
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                hVar = new jc.b(this);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                hVar = new k(this);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                hVar = new aa.b(this);
            } else {
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    Objects.requireNonNull(type2);
                    Type a10 = a.a(type2);
                    Class<?> h10 = a.h(a10);
                    a10.hashCode();
                    if (!String.class.isAssignableFrom(h10)) {
                        hVar = new c(this);
                    }
                }
                hVar = new f(this);
            }
        }
        if (hVar != null) {
            return hVar;
        }
        return new u3.b(cls, type);
    }

    public final String toString() {
        return this.f5267a.toString();
    }
}
