package ed;

import android.support.v4.media.b;
import ca.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import md.f;

public final class i<A, B> extends b {

    /* renamed from: v  reason: collision with root package name */
    public final b f4809v;

    /* renamed from: w  reason: collision with root package name */
    public final b f4810w;

    public i() {
        k kVar = k.f4812v;
        this.f4809v = kVar;
        this.f4810w = kVar;
    }

    public final boolean J(Object obj) {
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.f4809v.J(fVar.f8541a) && this.f4810w.J(fVar.f8542b);
        }
    }

    /* renamed from: r2 */
    public final f<A, B> g(ca.b bVar) {
        e.D(bVar, "reader");
        return new f<>(this.f4809v.g(bVar), this.f4810w.g(bVar));
    }

    /* renamed from: s2 */
    public final void b(c cVar, f<? extends A, ? extends B> fVar) {
        e.D(cVar, "writer");
        e.D(fVar, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f4809v.b(cVar, fVar.f8541a);
        this.f4810w.b(cVar, fVar.f8542b);
    }
}
