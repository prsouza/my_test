package oe;

import ah.v;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import md.m;
import pe.c;
import pe.i;
import re.b;
import re.d1;
import xd.l;
import yd.h;

public final class d<T> extends b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final pe.b f9419a;

    /* renamed from: b  reason: collision with root package name */
    public final de.b<T> f9420b;

    public static final class a extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ d f9421b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(d dVar) {
            super(1);
            this.f9421b = dVar;
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e.D(aVar, "$receiver");
            d1 d1Var = d1.f10686b;
            pe.a.a(aVar, "type", d1.f10685a);
            pe.a.a(aVar, AppMeasurementSdk.ConditionalUserProperty.VALUE, v.z("kotlinx.serialization.Polymorphic<" + this.f9421b.f9420b.a() + '>', i.a.f9916a, new pe.e[0], pe.h.f9915b));
            return m.f8555a;
        }
    }

    public d(de.b<T> bVar) {
        this.f9420b = bVar;
        this.f9419a = new pe.b(v.z("kotlinx.serialization.Polymorphic", c.a.f9891a, new pe.e[0], new a(this)), bVar);
    }

    public final pe.e a() {
        return this.f9419a;
    }

    public final de.b<T> c() {
        return this.f9420b;
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        d10.append(this.f9420b);
        d10.append(')');
        return d10.toString();
    }
}
