package i2;

import ad.c;
import g9.d;
import java.lang.reflect.Type;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p9.m;
import p9.o;
import p9.p;
import p9.r;
import p9.t;
import x9.a;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public d f5996a = d.f5274c;

    /* renamed from: b  reason: collision with root package name */
    public y f5997b = y.DEFAULT;

    /* renamed from: c  reason: collision with root package name */
    public c f5998c = c.IDENTITY;

    /* renamed from: d  reason: collision with root package name */
    public final Map<Type, l<?>> f5999d = new HashMap();

    /* renamed from: e  reason: collision with root package name */
    public final List<a0> f6000e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    public final List<a0> f6001f = new ArrayList();
    public int g = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f6002h = 2;
    public boolean i = true;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    public final j a() {
        ArrayList arrayList = new ArrayList(this.f6001f.size() + this.f6000e.size() + 3);
        arrayList.addAll(this.f6000e);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.f6001f);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        int i10 = this.g;
        int i11 = this.f6002h;
        if (!(i10 == 2 || i11 == 2)) {
            a aVar = new a(Date.class, i10, i11);
            a aVar2 = new a(Timestamp.class, i10, i11);
            a aVar3 = new a(java.sql.Date.class, i10, i11);
            p pVar = o.f9776a;
            arrayList.add(new p(Date.class, aVar));
            arrayList.add(new p(Timestamp.class, aVar2));
            arrayList.add(new p(java.sql.Date.class, aVar3));
        }
        return new j(this.f5996a, this.f5998c, this.f5999d, this.i, this.f5997b, this.f6000e, this.f6001f, arrayList);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    public final k b(Class<?> cls, Object obj) {
        boolean z = obj instanceof o;
        this.f6001f.add(new m.b(obj, (a<?>) null, false, cls));
        if (obj instanceof z) {
            ? r02 = this.f6000e;
            p pVar = o.f9776a;
            r02.add(new t(cls, (z) obj));
        }
        return this;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v2, types: [java.util.List<i2.a0>, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map<java.lang.reflect.Type, i2.l<?>>, java.util.HashMap] */
    public final k c(Type type, Object obj) {
        boolean z = obj instanceof w;
        boolean z10 = false;
        c.m(z || (obj instanceof o) || (obj instanceof l) || (obj instanceof z));
        if (obj instanceof l) {
            this.f5999d.put(type, (l) obj);
        }
        if (z || (obj instanceof o)) {
            a aVar = new a(type);
            ? r32 = this.f6000e;
            if (aVar.f13149b == aVar.f13148a) {
                z10 = true;
            }
            r32.add(new m.b(obj, aVar, z10, (Class<?>) null));
        }
        if (obj instanceof z) {
            ? r02 = this.f6000e;
            p pVar = o.f9776a;
            r02.add(new r(new a(type), (z) obj));
        }
        return this;
    }
}
