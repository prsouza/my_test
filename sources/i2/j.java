package i2;

import aa.c;
import g9.b;
import g9.i;
import java.io.EOFException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import p9.d;
import p9.g;
import p9.h;
import p9.k;
import p9.l;
import p9.o;
import p9.p;
import p9.q;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal<Map<x9.a<?>, a<?>>> f5983a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public final Map<x9.a<?>, z<?>> f5984b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    public final b f5985c;

    /* renamed from: d  reason: collision with root package name */
    public final d f5986d;

    /* renamed from: e  reason: collision with root package name */
    public final List<a0> f5987e;

    /* renamed from: f  reason: collision with root package name */
    public final g9.d f5988f;
    public final d g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5989h;
    public final boolean i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f5990j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5991k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f5992l;

    /* renamed from: m  reason: collision with root package name */
    public final List<a0> f5993m;

    /* renamed from: n  reason: collision with root package name */
    public final List<a0> f5994n;

    public static class a<T> extends z<T> {

        /* renamed from: a  reason: collision with root package name */
        public z<T> f5995a;

        public final T read(aa.a aVar) {
            z<T> zVar = this.f5995a;
            if (zVar != null) {
                return zVar.read(aVar);
            }
            throw new IllegalStateException();
        }

        public final void write(c cVar, T t10) {
            z<T> zVar = this.f5995a;
            if (zVar != null) {
                zVar.write(cVar, t10);
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Objects.requireNonNull(cls);
        Type a10 = g9.a.a(cls);
        g9.a.h(a10);
        a10.hashCode();
    }

    public j(g9.d dVar, d dVar2, Map map, boolean z, y yVar, List list, List list2, List list3) {
        this.f5988f = dVar;
        this.g = dVar2;
        b bVar = new b(map);
        this.f5985c = bVar;
        this.f5989h = false;
        this.i = false;
        this.f5990j = z;
        this.f5991k = false;
        this.f5992l = false;
        this.f5993m = list;
        this.f5994n = list2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(o.D);
        arrayList.add(h.f9741b);
        arrayList.add(dVar);
        arrayList.addAll(list3);
        arrayList.add(o.f9791r);
        arrayList.add(o.g);
        arrayList.add(o.f9779d);
        arrayList.add(o.f9780e);
        arrayList.add(o.f9781f);
        z gVar = yVar == y.DEFAULT ? o.f9784k : new g();
        arrayList.add(new q(Long.TYPE, Long.class, gVar));
        arrayList.add(new q(Double.TYPE, Double.class, new e()));
        arrayList.add(new q(Float.TYPE, Float.class, new f()));
        arrayList.add(o.f9787n);
        arrayList.add(o.f9782h);
        arrayList.add(o.i);
        arrayList.add(new p(AtomicLong.class, new h(gVar).nullSafe()));
        arrayList.add(new p(AtomicLongArray.class, new i(gVar).nullSafe()));
        arrayList.add(o.f9783j);
        arrayList.add(o.f9788o);
        arrayList.add(o.f9792s);
        arrayList.add(o.f9793t);
        arrayList.add(new p(BigDecimal.class, o.f9789p));
        arrayList.add(new p(BigInteger.class, o.f9790q));
        arrayList.add(o.f9794u);
        arrayList.add(o.f9795v);
        arrayList.add(o.f9797x);
        arrayList.add(o.f9798y);
        arrayList.add(o.B);
        arrayList.add(o.f9796w);
        arrayList.add(o.f9777b);
        arrayList.add(p9.c.f9732b);
        arrayList.add(o.A);
        arrayList.add(l.f9759b);
        arrayList.add(k.f9757b);
        arrayList.add(o.z);
        arrayList.add(p9.a.f9726c);
        arrayList.add(o.f9776a);
        arrayList.add(new p9.b(bVar));
        arrayList.add(new g(bVar));
        d dVar3 = new d(bVar);
        this.f5986d = dVar3;
        arrayList.add(dVar3);
        arrayList.add(o.E);
        arrayList.add(new p9.j(bVar, dVar2, dVar, dVar3));
        this.f5987e = Collections.unmodifiableList(arrayList);
    }

    public static void g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10)) {
            throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public static void i(Object obj, aa.a aVar) {
        if (obj != null) {
            try {
                if (aVar.A0() != 10) {
                    throw new q("JSON document was not fully consumed.");
                }
            } catch (aa.d e10) {
                throw new x((Throwable) e10);
            } catch (IOException e11) {
                throw new q((Throwable) e11);
            }
        }
    }

    public final c a(Writer writer) {
        if (this.i) {
            writer.write(")]}'\n");
        }
        c cVar = new c(writer);
        if (this.f5991k) {
            cVar.f203s = "  ";
            cVar.f204t = ": ";
        }
        cVar.f208x = this.f5989h;
        return cVar;
    }

    public final <T> z<T> b(a0 a0Var, x9.a<T> aVar) {
        if (!this.f5987e.contains(a0Var)) {
            a0Var = this.f5986d;
        }
        boolean z = false;
        for (a0 next : this.f5987e) {
            if (z) {
                z<T> create = next.create(this, aVar);
                if (create != null) {
                    return create;
                }
            } else if (next == a0Var) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<x9.a<?>, i2.z<?>>] */
    /* JADX WARNING: type inference failed for: r2v6, types: [java.util.concurrent.ConcurrentHashMap, java.util.Map<x9.a<?>, i2.z<?>>] */
    public final <T> z<T> c(x9.a<T> aVar) {
        z<T> zVar = (z) this.f5984b.get(aVar);
        if (zVar != null) {
            return zVar;
        }
        Map map = this.f5983a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.f5983a.set(map);
            z = true;
        }
        a aVar2 = (a) map.get(aVar);
        if (aVar2 != null) {
            return aVar2;
        }
        try {
            a aVar3 = new a();
            map.put(aVar, aVar3);
            for (a0 create : this.f5987e) {
                z<T> create2 = create.create(this, aVar);
                if (create2 != null) {
                    if (aVar3.f5995a == null) {
                        aVar3.f5995a = create2;
                        this.f5984b.put(aVar, create2);
                        return create2;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.f5983a.remove();
            }
        }
    }

    public final <T> T d(aa.a aVar, Type type) {
        boolean z = aVar.f180b;
        aVar.f180b = true;
        try {
            aVar.A0();
            T read = c(new x9.a(type)).read(aVar);
            aVar.f180b = z;
            return read;
        } catch (EOFException e10) {
            if (1 != 0) {
                aVar.f180b = z;
                return null;
            }
            throw new x((Throwable) e10);
        } catch (IllegalStateException e11) {
            throw new x((Throwable) e11);
        } catch (IOException e12) {
            throw new x((Throwable) e12);
        } catch (AssertionError e13) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e13.getMessage());
            assertionError.initCause(e13);
            throw assertionError;
        } catch (Throwable th2) {
            aVar.f180b = z;
            throw th2;
        }
    }

    public final <T> T e(String str, Class<T> cls) {
        aa.a aVar = new aa.a(new StringReader(str));
        aVar.f180b = this.f5992l;
        T d10 = d(aVar, cls);
        i(d10, aVar);
        return a.b.n(cls).cast(d10);
    }

    public final String f(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                h(a(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new q((Throwable) e10);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            k(obj, cls, stringWriter2);
            return stringWriter2.toString();
        }
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [p9.o$b0, i2.z<i2.p>, java.lang.Object] */
    public final void h(c cVar) {
        r rVar = r.f6004a;
        boolean z = cVar.f205u;
        cVar.f205u = true;
        boolean z10 = cVar.f206v;
        cVar.f206v = this.f5990j;
        boolean z11 = cVar.f208x;
        cVar.f208x = this.f5989h;
        try {
            ? r42 = o.C;
            Objects.requireNonNull(r42);
            r42.write(cVar, rVar);
            cVar.f205u = z;
            cVar.f206v = z10;
            cVar.f208x = z11;
        } catch (IOException e10) {
            throw new q((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            cVar.f205u = z;
            cVar.f206v = z10;
            cVar.f208x = z11;
            throw th2;
        }
    }

    public final void j(Object obj, Type type, c cVar) {
        z c10 = c(new x9.a(type));
        boolean z = cVar.f205u;
        cVar.f205u = true;
        boolean z10 = cVar.f206v;
        cVar.f206v = this.f5990j;
        boolean z11 = cVar.f208x;
        cVar.f208x = this.f5989h;
        try {
            c10.write(cVar, obj);
            cVar.f205u = z;
            cVar.f206v = z10;
            cVar.f208x = z11;
        } catch (IOException e10) {
            throw new q((Throwable) e10);
        } catch (AssertionError e11) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e11.getMessage());
            assertionError.initCause(e11);
            throw assertionError;
        } catch (Throwable th2) {
            cVar.f205u = z;
            cVar.f206v = z10;
            cVar.f208x = z11;
            throw th2;
        }
    }

    public final void k(Object obj, Type type, Appendable appendable) {
        try {
            j(obj, type, a(appendable instanceof Writer ? (Writer) appendable : new i.a(appendable)));
        } catch (IOException e10) {
            throw new q((Throwable) e10);
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f5989h + ",factories:" + this.f5987e + ",instanceCreators:" + this.f5985c + "}";
    }
}
