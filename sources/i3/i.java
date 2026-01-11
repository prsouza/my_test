package i3;

import com.bumptech.glide.d;
import com.bumptech.glide.g;
import com.bumptech.glide.h;
import g3.f;
import g3.h;
import g3.l;
import i3.j;
import i3.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import k3.a;
import m3.o;
import o3.b;
import u3.c;
import u3.d;
import x3.a;
import x3.e;

public final class i<Transcode> {

    /* renamed from: a  reason: collision with root package name */
    public final List<o.a<?>> f6042a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public final List<f> f6043b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public d f6044c;

    /* renamed from: d  reason: collision with root package name */
    public Object f6045d;

    /* renamed from: e  reason: collision with root package name */
    public int f6046e;

    /* renamed from: f  reason: collision with root package name */
    public int f6047f;
    public Class<?> g;

    /* renamed from: h  reason: collision with root package name */
    public j.e f6048h;
    public h i;

    /* renamed from: j  reason: collision with root package name */
    public Map<Class<?>, l<?>> f6049j;

    /* renamed from: k  reason: collision with root package name */
    public Class<Transcode> f6050k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f6051l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f6052m;

    /* renamed from: n  reason: collision with root package name */
    public f f6053n;

    /* renamed from: o  reason: collision with root package name */
    public g f6054o;

    /* renamed from: p  reason: collision with root package name */
    public l f6055p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f6056q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f6057r;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<g3.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<g3.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v3, types: [java.util.List<g3.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.util.List<g3.f>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v5, types: [java.util.List<g3.f>, java.util.ArrayList] */
    public final List<f> a() {
        if (!this.f6052m) {
            this.f6052m = true;
            this.f6043b.clear();
            ArrayList arrayList = (ArrayList) c();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a aVar = (o.a) arrayList.get(i10);
                if (!this.f6043b.contains(aVar.f8426a)) {
                    this.f6043b.add(aVar.f8426a);
                }
                for (int i11 = 0; i11 < aVar.f8427b.size(); i11++) {
                    if (!this.f6043b.contains(aVar.f8427b.get(i11))) {
                        this.f6043b.add(aVar.f8427b.get(i11));
                    }
                }
            }
        }
        return this.f6043b;
    }

    public final a b() {
        return ((m.c) this.f6048h).a();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<m3.o$a<?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List<m3.o$a<?>>, java.util.ArrayList] */
    public final List<o.a<?>> c() {
        if (!this.f6051l) {
            this.f6051l = true;
            this.f6042a.clear();
            List f10 = this.f6044c.f3517b.f(this.f6045d);
            int size = f10.size();
            for (int i10 = 0; i10 < size; i10++) {
                o.a a10 = ((o) f10.get(i10)).a(this.f6045d, this.f6046e, this.f6047f, this.i);
                if (a10 != null) {
                    this.f6042a.add(a10);
                }
            }
        }
        return this.f6042a;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.util.List<u3.d$a<?, ?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r7v9, types: [java.util.Map<java.lang.String, java.util.List<x3.e$a<?, ?>>>, java.util.HashMap] */
    public final <Data> u<Data, ?, Transcode> d(Class<Data> cls) {
        u<Data, ?, Transcode> orDefault;
        u<Data, ?, Transcode> uVar;
        u<?, ?, ?> uVar2;
        ArrayList arrayList;
        boolean z;
        c cVar;
        Class<Data> cls2 = cls;
        com.bumptech.glide.h hVar = this.f6044c.f3517b;
        Class<?> cls3 = this.g;
        Class<Transcode> cls4 = this.f6050k;
        x3.c cVar2 = hVar.i;
        c4.i andSet = cVar2.f12767b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new c4.i();
        }
        andSet.a(cls2, cls3, cls4);
        synchronized (cVar2.f12766a) {
            orDefault = cVar2.f12766a.getOrDefault(andSet, null);
        }
        cVar2.f12767b.set(andSet);
        Objects.requireNonNull(hVar.i);
        if (x3.c.f12765c.equals(orDefault)) {
            return null;
        }
        if (orDefault != null) {
            return orDefault;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ((ArrayList) hVar.f3528c.b(cls2, cls3)).iterator();
        while (it.hasNext()) {
            Class cls5 = (Class) it.next();
            Iterator it2 = ((ArrayList) hVar.f3531f.a(cls5, cls4)).iterator();
            while (true) {
                if (it2.hasNext()) {
                    Class cls6 = (Class) it2.next();
                    e eVar = hVar.f3528c;
                    synchronized (eVar) {
                        arrayList = new ArrayList();
                        Iterator it3 = eVar.f12770a.iterator();
                        while (it3.hasNext()) {
                            List<e.a> list = (List) eVar.f12771b.get((String) it3.next());
                            if (list != null) {
                                for (e.a aVar : list) {
                                    if (aVar.f12772a.isAssignableFrom(cls2) && cls5.isAssignableFrom(aVar.f12773b)) {
                                        arrayList.add(aVar.f12774c);
                                    }
                                }
                            }
                        }
                    }
                    u3.d dVar = hVar.f3531f;
                    synchronized (dVar) {
                        if (cls6.isAssignableFrom(cls5)) {
                            cVar = u3.e.f11688a;
                        } else {
                            Iterator it4 = dVar.f11684a.iterator();
                            while (it4.hasNext()) {
                                d.a aVar2 = (d.a) it4.next();
                                if (!aVar2.f11685a.isAssignableFrom(cls5) || !cls6.isAssignableFrom(aVar2.f11686b)) {
                                    z = false;
                                    continue;
                                } else {
                                    z = true;
                                    continue;
                                }
                                if (z) {
                                    cVar = aVar2.f11687c;
                                }
                            }
                            throw new IllegalArgumentException("No transcoder registered to transcode from " + cls5 + " to " + cls6);
                        }
                    }
                    k kVar = r2;
                    k kVar2 = new k(cls, cls5, cls6, arrayList, cVar, hVar.f3533j);
                    arrayList2.add(kVar);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            uVar = null;
        } else {
            uVar = new u<>(cls, cls3, cls4, arrayList2, hVar.f3533j);
        }
        x3.c cVar3 = hVar.i;
        synchronized (cVar3.f12766a) {
            s.a<c4.i, u<?, ?, ?>> aVar3 = cVar3.f12766a;
            c4.i iVar = new c4.i(cls2, cls3, cls4);
            if (uVar != null) {
                uVar2 = uVar;
            } else {
                uVar2 = x3.c.f12765c;
            }
            aVar3.put(iVar, uVar2);
        }
        return uVar;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.List<x3.a$a<?>>, java.util.ArrayList] */
    public final <X> g3.d<X> e(X x10) throws h.e {
        g3.d<T> dVar;
        x3.a aVar = this.f6044c.f3517b.f3527b;
        Class<?> cls = x10.getClass();
        synchronized (aVar) {
            Iterator it = aVar.f12761a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dVar = null;
                    break;
                }
                a.C0250a aVar2 = (a.C0250a) it.next();
                if (aVar2.f12762a.isAssignableFrom(cls)) {
                    dVar = aVar2.f12763b;
                    break;
                }
            }
        }
        if (dVar != null) {
            return dVar;
        }
        throw new h.e(x10.getClass());
    }

    public final <Z> l<Z> f(Class<Z> cls) {
        l<Z> lVar = this.f6049j.get(cls);
        if (lVar == null) {
            Iterator<Map.Entry<Class<?>, l<?>>> it = this.f6049j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry next = it.next();
                if (((Class) next.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) next.getValue();
                    break;
                }
            }
        }
        if (lVar != null) {
            return lVar;
        }
        if (!this.f6049j.isEmpty() || !this.f6056q) {
            return b.f9311b;
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    public final boolean g(Class<?> cls) {
        return d(cls) != null;
    }
}
