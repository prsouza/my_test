package re;

import ah.v;
import e6.e;
import java.lang.Enum;
import md.m;
import oe.b;
import pe.f;
import pe.i;
import pe.j;
import xd.l;
import yd.h;

public final class r<T extends Enum<T>> implements b<T> {

    /* renamed from: a  reason: collision with root package name */
    public final f f10743a;

    /* renamed from: b  reason: collision with root package name */
    public final T[] f10744b;

    public static final class a extends h implements l<pe.a, m> {

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r f10745b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ String f10746c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(r rVar, String str) {
            super(1);
            this.f10745b = rVar;
            this.f10746c = str;
        }

        public final Object k(Object obj) {
            pe.a aVar = (pe.a) obj;
            e.D(aVar, "$receiver");
            for (T t10 : this.f10745b.f10744b) {
                pe.a.a(aVar, t10.name(), v.z(this.f10746c + '.' + t10.name(), j.d.f9921a, new pe.e[0], pe.h.f9915b));
            }
            return m.f8555a;
        }
    }

    public r(String str, T[] tArr) {
        this.f10744b = tArr;
        this.f10743a = (f) v.z(str, i.b.f9917a, new pe.e[0], new a(this, str));
    }

    public final pe.e a() {
        return this.f10743a;
    }

    public final Object b(qe.b bVar) {
        e.D(bVar, "decoder");
        int x10 = bVar.x(this.f10743a);
        T[] tArr = this.f10744b;
        if (x10 >= 0 && tArr.length > x10) {
            return tArr[x10];
        }
        throw new IllegalStateException((x10 + " is not among valid $" + this.f10743a.f9908h + " enum values, values size is " + this.f10744b.length).toString());
    }

    public final String toString() {
        StringBuilder d10 = a.a.d("kotlinx.serialization.internal.EnumSerializer<");
        d10.append(this.f10743a.f9908h);
        d10.append('>');
        return d10.toString();
    }
}
