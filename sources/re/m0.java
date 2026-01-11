package re;

import ah.v;
import c3.k;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.util.Map;
import md.m;
import pe.f;
import pe.j;
import xd.l;
import yd.h;

public final class m0<K, V> extends c0<K, V, Map.Entry<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    public final f f10721c;

    public static final class a<K, V> implements Map.Entry<K, V>, zd.a {

        /* renamed from: a  reason: collision with root package name */
        public final K f10722a;

        /* renamed from: b  reason: collision with root package name */
        public final V f10723b;

        public a(K k10, V v10) {
            this.f10722a = k10;
            this.f10723b = v10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return e.r(this.f10722a, aVar.f10722a) && e.r(this.f10723b, aVar.f10723b);
        }

        public final K getKey() {
            return this.f10722a;
        }

        public final V getValue() {
            return this.f10723b;
        }

        public final int hashCode() {
            K k10 = this.f10722a;
            int i = 0;
            int hashCode = (k10 != null ? k10.hashCode() : 0) * 31;
            V v10 = this.f10723b;
            if (v10 != null) {
                i = v10.hashCode();
            }
            return hashCode + i;
        }

        public final V setValue(V v10) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final String toString() {
            StringBuilder d10 = a.a.d("MapEntry(key=");
            d10.append(this.f10722a);
            d10.append(", value=");
            d10.append(this.f10723b);
            d10.append(")");
            return d10.toString();
        }
    }

    public static final class b extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ oe.b f10724b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ oe.b f10725c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(oe.b bVar, oe.b bVar2) {
            super(1);
            this.f10724b = bVar;
            this.f10725c = bVar2;
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e.D(aVar, "$receiver");
            pe.a.a(aVar, "key", this.f10724b.a());
            pe.a.a(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE, this.f10725c.a());
            return m.f8555a;
        }
    }

    public m0(oe.b<K> bVar, oe.b<V> bVar2) {
        super(bVar, bVar2, (k) null);
        this.f10721c = (f) v.z("kotlin.collections.Map.Entry", j.c.f9920a, new pe.e[0], new b(bVar, bVar2));
    }

    public final pe.e a() {
        return this.f10721c;
    }

    public final Object c(Object obj, Object obj2) {
        return new a(obj, obj2);
    }
}
