package p9;

import aa.c;
import ah.v;
import androidx.fragment.app.m;
import c3.k;
import g9.b;
import g9.h;
import i2.a0;
import i2.j;
import i2.p;
import i2.r;
import i2.s;
import i2.u;
import i2.x;
import i2.z;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;

public final class g implements a0 {

    /* renamed from: a  reason: collision with root package name */
    public final b f9735a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f9736b = false;

    public final class a<K, V> extends z<Map<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        public final z<K> f9737a;

        /* renamed from: b  reason: collision with root package name */
        public final z<V> f9738b;

        /* renamed from: c  reason: collision with root package name */
        public final h<? extends Map<K, V>> f9739c;

        public a(j jVar, Type type, z<K> zVar, Type type2, z<V> zVar2, h<? extends Map<K, V>> hVar) {
            this.f9737a = new n(jVar, zVar, type);
            this.f9738b = new n(jVar, zVar2, type2);
            this.f9739c = hVar;
        }

        /* JADX WARNING: type inference failed for: r0v4, types: [p9.n, i2.z<K>] */
        /* JADX WARNING: type inference failed for: r3v1, types: [i2.z<V>, p9.n] */
        /* JADX WARNING: type inference failed for: r0v17, types: [p9.n, i2.z<K>] */
        /* JADX WARNING: type inference failed for: r1v3, types: [i2.z<V>, p9.n] */
        public final Object read(aa.a aVar) {
            int i;
            int A0 = aVar.A0();
            if (A0 == 9) {
                aVar.x0();
                return null;
            }
            Map map = (Map) this.f9739c.a();
            if (A0 == 1) {
                aVar.e();
                while (aVar.a0()) {
                    aVar.e();
                    Object read = this.f9737a.read(aVar);
                    if (map.put(read, this.f9738b.read(aVar)) == null) {
                        aVar.R();
                    } else {
                        throw new x(m.c("duplicate key: ", read));
                    }
                }
                aVar.R();
            } else {
                aVar.w();
                while (aVar.a0()) {
                    Objects.requireNonNull(android.support.v4.media.b.f729b);
                    if (aVar instanceof e) {
                        e eVar = (e) aVar;
                        eVar.F0(5);
                        Map.Entry entry = (Map.Entry) ((Iterator) eVar.H0()).next();
                        eVar.E0(entry.getValue());
                        eVar.E0(new u((String) entry.getKey()));
                    } else {
                        int i10 = aVar.f186w;
                        if (i10 == 0) {
                            i10 = aVar.O();
                        }
                        if (i10 == 13) {
                            aVar.f186w = 9;
                        } else {
                            if (i10 == 12) {
                                i = 8;
                            } else if (i10 == 14) {
                                i = 10;
                            } else {
                                StringBuilder q10 = a.b.q("Expected a name but was ");
                                q10.append(v.h(aVar.A0()));
                                throw new IllegalStateException(k.o(aVar, q10));
                            }
                            aVar.f186w = i;
                        }
                    }
                    Object read2 = this.f9737a.read(aVar);
                    if (map.put(read2, this.f9738b.read(aVar)) != null) {
                        throw new x(m.c("duplicate key: ", read2));
                    }
                }
                aVar.S();
            }
            return map;
        }

        /* JADX WARNING: type inference failed for: r3v5, types: [i2.z<V>, p9.n] */
        /* JADX WARNING: type inference failed for: r4v5, types: [p9.o$b0, i2.z<i2.p>] */
        /* JADX WARNING: type inference failed for: r3v16, types: [i2.z<V>, p9.n] */
        /* JADX WARNING: type inference failed for: r1v4, types: [i2.z<V>, p9.n] */
        public final void write(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.f0();
                return;
            }
            if (!g.this.f9736b) {
                cVar.R();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.s(String.valueOf(entry.getKey()));
                    this.f9738b.write(cVar, entry.getValue());
                }
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i = 0;
                boolean z = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    p jsonTree = this.f9737a.toJsonTree(entry2.getKey());
                    arrayList.add(jsonTree);
                    arrayList2.add(entry2.getValue());
                    Objects.requireNonNull(jsonTree);
                    z |= (jsonTree instanceof i2.m) || (jsonTree instanceof s);
                }
                if (z) {
                    cVar.B();
                    int size = arrayList.size();
                    while (i < size) {
                        cVar.B();
                        o.C.write(cVar, (p) arrayList.get(i));
                        this.f9738b.write(cVar, arrayList2.get(i));
                        cVar.T();
                        i++;
                    }
                    cVar.T();
                    return;
                }
                cVar.R();
                int size2 = arrayList.size();
                while (i < size2) {
                    p pVar = (p) arrayList.get(i);
                    Objects.requireNonNull(pVar);
                    if (pVar instanceof u) {
                        u d10 = pVar.d();
                        Serializable serializable = d10.f6006a;
                        if (serializable instanceof Number) {
                            str = String.valueOf(d10.i());
                        } else if (serializable instanceof Boolean) {
                            str = Boolean.toString(d10.h());
                        } else if (serializable instanceof String) {
                            str = d10.e();
                        } else {
                            throw new AssertionError();
                        }
                    } else if (pVar instanceof r) {
                        str = "null";
                    } else {
                        throw new AssertionError();
                    }
                    cVar.s(str);
                    this.f9738b.write(cVar, arrayList2.get(i));
                    i++;
                }
            }
            cVar.a0();
        }
    }

    public g(b bVar) {
        this.f9735a = bVar;
    }

    public final <T> z<T> create(j jVar, x9.a<T> aVar) {
        Type[] typeArr;
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        Type type = aVar.f13149b;
        if (!Map.class.isAssignableFrom(aVar.f13148a)) {
            return null;
        }
        Class<?> h10 = g9.a.h(type);
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type f10 = g9.a.f(type, h10, Map.class);
            typeArr = f10 instanceof ParameterizedType ? ((ParameterizedType) f10).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        return new a(jVar, typeArr[0], (type2 == Boolean.TYPE || type2 == Boolean.class) ? o.f9778c : jVar.c(new x9.a(type2)), typeArr[1], jVar.c(new x9.a(typeArr[1])), this.f9735a.a(aVar));
    }
}
