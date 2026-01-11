package m3;

import com.bumptech.glide.h;
import g3.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import m3.o;

public final class s {

    /* renamed from: e  reason: collision with root package name */
    public static final c f8442e = new c();

    /* renamed from: f  reason: collision with root package name */
    public static final o<Object, Object> f8443f = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b<?, ?>> f8444a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final c f8445b;

    /* renamed from: c  reason: collision with root package name */
    public final Set<b<?, ?>> f8446c = new HashSet();

    /* renamed from: d  reason: collision with root package name */
    public final m0.c<List<Throwable>> f8447d;

    public static class a implements o<Object, Object> {
        public final o.a<Object> a(Object obj, int i, int i10, h hVar) {
            return null;
        }

        public final boolean b(Object obj) {
            return false;
        }
    }

    public static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final Class<Model> f8448a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<Data> f8449b;

        /* renamed from: c  reason: collision with root package name */
        public final p<? extends Model, ? extends Data> f8450c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f8448a = cls;
            this.f8449b = cls2;
            this.f8450c = pVar;
        }

        public final boolean a(Class<?> cls) {
            return this.f8448a.isAssignableFrom(cls);
        }
    }

    public static class c {
    }

    public s(m0.c<List<Throwable>> cVar) {
        c cVar2 = f8442e;
        this.f8447d = cVar;
        this.f8445b = cVar2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<m3.s$b<?, ?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    public final synchronized <Model> List<o<Model, ?>> a(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f8444a.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (!this.f8446c.contains(bVar)) {
                    if (bVar.a(cls)) {
                        this.f8446c.add(bVar);
                        o<? extends Model, ? extends Data> b10 = bVar.f8450c.b(this);
                        Objects.requireNonNull(b10, "Argument must not be null");
                        arrayList.add(b10);
                        this.f8446c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f8446c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<m3.s$b<?, ?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r6v4, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    /* JADX WARNING: type inference failed for: r6v6, types: [java.util.HashSet, java.util.Set<m3.s$b<?, ?>>] */
    public final synchronized <Model, Data> o<Model, Data> b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f8444a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (this.f8446c.contains(bVar)) {
                    z = true;
                } else {
                    if (bVar.a(cls) && bVar.f8449b.isAssignableFrom(cls2)) {
                        this.f8446c.add(bVar);
                        arrayList.add(c(bVar));
                        this.f8446c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                c cVar = this.f8445b;
                m0.c<List<Throwable>> cVar2 = this.f8447d;
                Objects.requireNonNull(cVar);
                return new r(arrayList, cVar2);
            } else if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            } else if (z) {
                return f8443f;
            } else {
                throw new h.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f8446c.clear();
            throw th2;
        }
    }

    public final <Model, Data> o<Model, Data> c(b<?, ?> bVar) {
        o<? extends Model, ? extends Data> b10 = bVar.f8450c.b(this);
        Objects.requireNonNull(b10, "Argument must not be null");
        return b10;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<m3.s$b<?, ?>>, java.util.ArrayList] */
    public final synchronized List<Class<?>> d(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f8444a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!arrayList.contains(bVar.f8449b) && bVar.a(cls)) {
                arrayList.add(bVar.f8449b);
            }
        }
        return arrayList;
    }
}
