package ac;

import a5.o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import ge.c0;
import ge.x1;
import io.nodle.sdk.NodleContext;
import io.sentry.IHub;
import io.sentry.Sentry;
import pd.a;
import pd.f;
import z4.q;

public final class b extends a implements x1<IHub> {

    /* renamed from: a  reason: collision with root package name */
    public final String f296a;

    /* renamed from: b  reason: collision with root package name */
    public final NodleContext f297b;

    /* renamed from: c  reason: collision with root package name */
    public final IHub f298c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(String str, NodleContext nodleContext) {
        super(c0.f5377a);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(nodleContext, "nodleContext");
        this.f296a = str;
        this.f297b = nodleContext;
        IHub clone = Sentry.getCurrentHub().clone();
        e.C(clone, "getCurrentHub().clone()");
        this.f298c = clone;
    }

    public final void R(f fVar, Object obj) {
        IHub iHub = (IHub) obj;
        e.D(fVar, "context");
        e.D(iHub, "oldState");
        Sentry.setCurrentHub(iHub);
        Sentry.configureScope(new o(this));
    }

    public final Object a0(f fVar) {
        e.D(fVar, "context");
        IHub currentHub = Sentry.getCurrentHub();
        e.C(currentHub, "getCurrentHub()");
        Sentry.setCurrentHub(this.f298c);
        Sentry.configureScope(new q(this));
        return currentHub;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return e.r(this.f296a, bVar.f296a) && e.r(this.f297b, bVar.f297b);
    }

    public final int hashCode() {
        return this.f297b.hashCode() + (this.f296a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder q10 = a.b.q("CoroutineName(");
        q10.append(this.f296a);
        q10.append(')');
        return q10.toString();
    }
}
