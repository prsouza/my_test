package gb;

import c3.k;
import e6.e;
import java.util.List;
import java.util.Objects;
import nd.o;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final List<f> f5327a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f5328b;

    /* renamed from: c  reason: collision with root package name */
    public final f f5329c;

    public g() {
        this((List) null, false, (f) null, 7, (k) null);
    }

    public g(List<f> list, boolean z, f fVar) {
        this.f5327a = list;
        this.f5328b = z;
        this.f5329c = fVar;
    }

    public static g a(g gVar, List<f> list, boolean z, f fVar, int i) {
        if ((i & 1) != 0) {
            list = gVar.f5327a;
        }
        if ((i & 2) != 0) {
            z = gVar.f5328b;
        }
        if ((i & 4) != 0) {
            fVar = gVar.f5329c;
        }
        Objects.requireNonNull(gVar);
        e.D(list, "notifications");
        return new g(list, z, fVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return e.r(this.f5327a, gVar.f5327a) && this.f5328b == gVar.f5328b && e.r(this.f5329c, gVar.f5329c);
    }

    public final int hashCode() {
        int hashCode = this.f5327a.hashCode() * 31;
        boolean z = this.f5328b;
        if (z) {
            z = true;
        }
        int i = (hashCode + (z ? 1 : 0)) * 31;
        f fVar = this.f5329c;
        return i + (fVar == null ? 0 : fVar.hashCode());
    }

    public final String toString() {
        List<f> list = this.f5327a;
        boolean z = this.f5328b;
        f fVar = this.f5329c;
        return "NotificationUiState(notifications=" + list + ", hasNotification=" + z + ", selectedNotification=" + fVar + ")";
    }

    public g(List list, boolean z, f fVar, int i, k kVar) {
        this.f5327a = o.f8966a;
        this.f5328b = false;
        this.f5329c = null;
    }
}
