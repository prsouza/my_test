package ed;

import android.support.v4.media.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import java.lang.Enum;

public final class a<E extends Enum<E>> extends b {

    /* renamed from: v  reason: collision with root package name */
    public final Class<E> f4801v;

    public a(Class<E> cls) {
        e.D(cls, "enumClass");
        this.f4801v = cls;
    }

    public final boolean J(Object obj) {
        return e.r(obj != null ? obj.getClass() : null, this.f4801v);
    }

    public final void b(c cVar, Object obj) {
        Enum enumR = (Enum) obj;
        e.D(cVar, "writer");
        e.D(enumR, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        cVar.a(enumR.ordinal());
    }

    public final Object g(ca.b bVar) {
        e.D(bVar, "reader");
        Enum enumR = ((Enum[]) this.f4801v.getEnumConstants())[bVar.b()];
        e.C(enumR, "enumClass.enumConstants[index.toInt()]");
        return enumR;
    }
}
