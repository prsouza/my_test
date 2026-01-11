package pf;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e6.e;
import uf.i;

public final class c {

    /* renamed from: d  reason: collision with root package name */
    public static final i f9922d;

    /* renamed from: e  reason: collision with root package name */
    public static final i f9923e;

    /* renamed from: f  reason: collision with root package name */
    public static final i f9924f;
    public static final i g;

    /* renamed from: h  reason: collision with root package name */
    public static final i f9925h;
    public static final i i;

    /* renamed from: a  reason: collision with root package name */
    public final int f9926a;

    /* renamed from: b  reason: collision with root package name */
    public final i f9927b;

    /* renamed from: c  reason: collision with root package name */
    public final i f9928c;

    static {
        i.a aVar = i.f11956t;
        f9922d = aVar.b(":");
        f9923e = aVar.b(":status");
        f9924f = aVar.b(":method");
        g = aVar.b(":path");
        f9925h = aVar.b(":scheme");
        i = aVar.b(":authority");
    }

    public c(i iVar, i iVar2) {
        e.D(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(iVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f9927b = iVar;
        this.f9928c = iVar2;
        this.f9926a = iVar2.h() + iVar.h() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return e.r(this.f9927b, cVar.f9927b) && e.r(this.f9928c, cVar.f9928c);
    }

    public final int hashCode() {
        i iVar = this.f9927b;
        int i10 = 0;
        int hashCode = (iVar != null ? iVar.hashCode() : 0) * 31;
        i iVar2 = this.f9928c;
        if (iVar2 != null) {
            i10 = iVar2.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return this.f9927b.r() + ": " + this.f9928c.r();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(java.lang.String r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            e6.e.D(r2, r0)
            java.lang.String r0 = "value"
            e6.e.D(r3, r0)
            uf.i$a r0 = uf.i.f11956t
            uf.i r2 = r0.b(r2)
            uf.i r3 = r0.b(r3)
            r1.<init>((uf.i) r2, (uf.i) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.c.<init>(java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public c(i iVar, String str) {
        this(iVar, i.f11956t.b(str));
        e.D(iVar, AppMeasurementSdk.ConditionalUserProperty.NAME);
        e.D(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
    }
}
