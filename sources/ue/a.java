package ue;

import android.support.v4.media.b;
import e6.e;
import java.util.Map;
import nd.p;
import xd.l;
import yd.x;

public final class a extends b {

    /* renamed from: v  reason: collision with root package name */
    public final Map<de.b<?>, oe.b<?>> f11931v;

    /* renamed from: w  reason: collision with root package name */
    public final Map<de.b<?>, Map<de.b<?>, oe.b<?>>> f11932w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<de.b<?>, Map<String, oe.b<?>>> f11933x;

    /* renamed from: y  reason: collision with root package name */
    public final Map<de.b<?>, l<String, oe.a<?>>> f11934y;

    public a() {
        p pVar = p.f8967a;
        this.f11931v = pVar;
        this.f11932w = pVar;
        this.f11933x = pVar;
        this.f11934y = pVar;
    }

    public final <T> oe.b<T> s0(de.b<T> bVar) {
        e.D(bVar, "kclass");
        oe.b<?> bVar2 = this.f11931v.get(bVar);
        if (!(bVar2 instanceof oe.b)) {
            bVar2 = null;
        }
        return bVar2;
    }

    public final <T> oe.a<? extends T> u0(de.b<? super T> bVar, String str) {
        e.D(bVar, "baseClass");
        Map map = this.f11933x.get(bVar);
        oe.b bVar2 = map != null ? (oe.b) map.get(str) : null;
        if (!(bVar2 instanceof oe.b)) {
            bVar2 = null;
        }
        if (bVar2 != null) {
            return bVar2;
        }
        l<String, oe.a<?>> lVar = this.f11934y.get(bVar);
        if (!x.b(lVar, 1)) {
            lVar = null;
        }
        l lVar2 = lVar;
        if (lVar2 != null) {
            return (oe.a) lVar2.k(str);
        }
        return null;
    }
}
