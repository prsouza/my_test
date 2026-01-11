package com.bumptech.glide;

import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import d4.a;
import g3.j;
import g3.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m3.o;
import m3.p;
import m3.q;
import m3.s;
import u3.d;
import x3.e;
import x3.f;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final q f3526a;

    /* renamed from: b  reason: collision with root package name */
    public final x3.a f3527b;

    /* renamed from: c  reason: collision with root package name */
    public final x3.e f3528c;

    /* renamed from: d  reason: collision with root package name */
    public final f f3529d;

    /* renamed from: e  reason: collision with root package name */
    public final com.bumptech.glide.load.data.f f3530e;

    /* renamed from: f  reason: collision with root package name */
    public final u3.d f3531f;
    public final x3.b g;

    /* renamed from: h  reason: collision with root package name */
    public final x3.d f3532h = new x3.d(0);
    public final x3.c i = new x3.c();

    /* renamed from: j  reason: collision with root package name */
    public final m0.c<List<Throwable>> f3533j;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    public static class d extends a {
        public d(Class<?> cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    public static class e extends a {
        public e(Class<?> cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List<java.lang.String>, java.util.ArrayList] */
    public h() {
        a.c cVar = new a.c(new m0.e(20), new d4.b(), new d4.c());
        this.f3533j = cVar;
        this.f3526a = new q(cVar);
        this.f3527b = new x3.a();
        this.f3528c = new x3.e();
        this.f3529d = new f();
        this.f3530e = new com.bumptech.glide.load.data.f();
        this.f3531f = new u3.d();
        this.g = new x3.b();
        List<String> asList = Arrays.asList(new String[]{"Gif", "Bitmap", "BitmapDrawable"});
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        for (String add : asList) {
            arrayList.add(add);
        }
        arrayList.add("legacy_append");
        x3.e eVar = this.f3528c;
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList(eVar.f12770a);
            eVar.f12770a.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                eVar.f12770a.add((String) it.next());
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (!arrayList.contains(str)) {
                    eVar.f12770a.add(str);
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<x3.f$a<?>>, java.util.ArrayList] */
    public final <TResource> h a(Class<TResource> cls, k<TResource> kVar) {
        f fVar = this.f3529d;
        synchronized (fVar) {
            fVar.f12775a.add(new f.a(cls, kVar));
        }
        return this;
    }

    public final <Data, TResource> h b(Class<Data> cls, Class<TResource> cls2, j<Data, TResource> jVar) {
        d("legacy_append", cls, cls2, jVar);
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [java.util.List<m3.s$b<?, ?>>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, m3.q$a$a<?>>] */
    public final <Model, Data> h c(Class<Model> cls, Class<Data> cls2, p<Model, Data> pVar) {
        q qVar = this.f3526a;
        synchronized (qVar) {
            s sVar = qVar.f8429a;
            synchronized (sVar) {
                s.b bVar = new s.b(cls, cls2, pVar);
                ? r42 = sVar.f8444a;
                r42.add(r42.size(), bVar);
            }
            qVar.f8430b.f8431a.clear();
        }
        return this;
    }

    public final <Data, TResource> h d(String str, Class<Data> cls, Class<TResource> cls2, j<Data, TResource> jVar) {
        x3.e eVar = this.f3528c;
        synchronized (eVar) {
            eVar.a(str).add(new e.a(cls, cls2, jVar));
        }
        return this;
    }

    public final List<ImageHeaderParser> e() {
        List<ImageHeaderParser> list;
        x3.b bVar = this.g;
        synchronized (bVar) {
            list = (List) bVar.f12764a;
        }
        if (!list.isEmpty()) {
            return list;
        }
        throw new b();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, m3.q$a$a<?>>] */
    public final <Model> List<o<Model, ?>> f(Model model) {
        List<o<Model, ?>> list;
        q qVar = this.f3526a;
        Objects.requireNonNull(qVar);
        Class cls = model.getClass();
        synchronized (qVar) {
            q.a.C0155a aVar = (q.a.C0155a) qVar.f8430b.f8431a.get(cls);
            if (aVar == null) {
                list = null;
            } else {
                list = aVar.f8432a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(qVar.f8429a.a(cls));
                qVar.f8430b.a(cls, list);
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List<o<Model, ?>> emptyList = Collections.emptyList();
            boolean z = true;
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = list.get(i10);
                if (oVar.b(model)) {
                    if (z) {
                        emptyList = new ArrayList<>(size - i10);
                        z = false;
                    }
                    emptyList.add(oVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new c(model, list);
        }
        throw new c(model);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, com.bumptech.glide.load.data.e$a<?>>] */
    public final h g(e.a<?> aVar) {
        com.bumptech.glide.load.data.f fVar = this.f3530e;
        synchronized (fVar) {
            fVar.f3564a.put(aVar.a(), aVar);
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<u3.d$a<?, ?>>, java.util.ArrayList] */
    public final <TResource, Transcode> h h(Class<TResource> cls, Class<Transcode> cls2, u3.c<TResource, Transcode> cVar) {
        u3.d dVar = this.f3531f;
        synchronized (dVar) {
            dVar.f11684a.add(new d.a(cls, cls2, cVar));
        }
        return this;
    }

    public static class c extends a {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.Object r2) {
            /*
                r1 = this;
                java.lang.String r0 = "Failed to find any ModelLoaders registered for model class: "
                java.lang.StringBuilder r0 = a.a.d(r0)
                java.lang.Class r2 = r2.getClass()
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.h.c.<init>(java.lang.Object):void");
        }

        public <M> c(M m10, List<o<M, ?>> list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + m10);
        }

        public c(Class<?> cls, Class<?> cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }
}
